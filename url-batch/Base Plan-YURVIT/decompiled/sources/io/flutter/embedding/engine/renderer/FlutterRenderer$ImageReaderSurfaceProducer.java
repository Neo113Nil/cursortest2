package io.flutter.embedding.engine.renderer;

import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import c0.AbstractC0117a;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import io.flutter.view.q;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, p {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    q callback;
    private final long id;
    private boolean released;
    final /* synthetic */ i this$0;
    private boolean ignoringFence = VERBOSE_LOGS;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    boolean notifiedDestroy = VERBOSE_LOGS;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<f> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, f> perImageReaders = new HashMap<>();
    private ArrayList<d> lastDequeuedImage = new ArrayList<>();
    private f lastReaderDequeuedFrom = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(i iVar, long j2) {
        this.this$0 = iVar;
        this.id = j2;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (f fVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == fVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    fVar.f2364c = true;
                    fVar.f2362a.close();
                    fVar.f2363b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    ArrayList<d> arrayList = this.lastDequeuedImage;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        d dVar = arrayList.get(i2);
                        i2++;
                        dVar.f2359a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                f fVar2 = this.lastReaderDequeuedFrom;
                if (fVar2 != null) {
                    fVar2.f2364c = true;
                    fVar2.f2362a.close();
                    fVar2.f2363b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
        return newInstance;
    }

    private ImageReader createImageReader33() {
        ImageReader build;
        AbstractC0117a.j();
        ImageReader.Builder e2 = AbstractC0117a.e(this.requestedWidth, this.requestedHeight);
        e2.setMaxImages(7);
        e2.setImageFormat(34);
        e2.setUsage(256L);
        build = e2.build();
        return build;
    }

    private f getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    f peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.f2362a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = VERBOSE_LOGS;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private f getOrCreatePerImageReader(ImageReader imageReader) {
        f fVar = this.perImageReaders.get(imageReader);
        if (fVar != null) {
            return fVar;
        }
        f createPerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, createPerImageReader);
        this.imageReaderQueue.add(createPerImageReader);
        return createPerImageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f2389a.scheduleFrame();
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        HashSet hashSet = this.this$0.f2393e;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == this) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.this$0.f2394f.remove(this);
    }

    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        d dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f2359a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return createImageReader33();
        }
        if (i2 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public f createPerImageReader(ImageReader imageReader) {
        return new f(this, imageReader);
    }

    public double deltaMillis(long j2) {
        return j2 / 1000000.0d;
    }

    public d dequeueImage() {
        d dVar;
        boolean z2;
        synchronized (this.lock) {
            try {
                Iterator<f> it = this.imageReaderQueue.iterator();
                dVar = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    z2 = VERBOSE_LOGS;
                    if (!hasNext) {
                        break;
                    }
                    f next = it.next();
                    ArrayDeque arrayDeque = next.f2363b;
                    d dVar2 = arrayDeque.isEmpty() ? null : (d) arrayDeque.removeFirst();
                    if (dVar2 == null) {
                        dVar = dVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f2359a.close();
                        }
                        this.lastDequeuedImage.add(dVar2);
                        this.lastReaderDequeuedFrom = next;
                        dVar = dVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<f> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().f2363b.isEmpty()) {
                        z2 = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.this$0.f2392d.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.c
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterRenderer$ImageReaderSurfaceProducer.this.lambda$dequeueImage$0();
                }
            });
        }
        return dVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            i iVar = this.this$0;
            iVar.f2392d.post(new g(this.id, iVar.f2389a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f2362a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return VERBOSE_LOGS;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i2;
        synchronized (this.lock) {
            try {
                Iterator<f> it = this.imageReaderQueue.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    i2 += it.next().f2363b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public int numTrims() {
        int i2;
        synchronized (this.lock) {
            i2 = this.numTrims;
        }
        return i2;
    }

    public void onImage(ImageReader imageReader, Image image) {
        d dVar;
        synchronized (this.lock) {
            f orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            ArrayDeque arrayDeque = orCreatePerImageReader.f2363b;
            if (orCreatePerImageReader.f2364c) {
                dVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f2365d;
                System.nanoTime();
                d dVar2 = new d(flutterRenderer$ImageReaderSurfaceProducer, image);
                arrayDeque.add(dVar2);
                while (arrayDeque.size() > 2) {
                    ((d) arrayDeque.removeFirst()).f2359a.close();
                }
                dVar = dVar2;
            }
        }
        if (dVar == null) {
            return;
        }
        this.this$0.f2389a.scheduleFrame();
    }

    @Override // io.flutter.view.p
    public void onTrimMemory(int i2) {
        if (i2 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        f peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ImageReader imageReader = peekFirst.f2362a;
            ArrayDeque arrayDeque = peekFirst.f2363b;
            if (!arrayDeque.isEmpty() || peekFirst.f2365d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            this.perImageReaders.remove(imageReader);
            peekFirst.f2364c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        i iVar = this.this$0;
        iVar.f2389a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f2389a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(q qVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i2, int i3) {
        int max = Math.max(1, i2);
        int max2 = Math.max(1, i3);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
