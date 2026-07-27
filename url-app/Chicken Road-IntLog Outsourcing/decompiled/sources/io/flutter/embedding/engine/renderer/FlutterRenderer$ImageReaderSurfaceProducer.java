package io.flutter.embedding.engine.renderer;

import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.n;
import io.flutter.view.o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, n {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    o callback;
    private final long id;
    private boolean released;
    final /* synthetic */ i this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    boolean notifiedDestroy = false;
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
                    fVar.f10117c = true;
                    fVar.f10115a.close();
                    fVar.f10116b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<d> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f10112a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                f fVar2 = this.lastReaderDequeuedFrom;
                if (fVar2 != null) {
                    fVar2.f10117c = true;
                    fVar2.f10115a.close();
                    fVar2.f10116b.clear();
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
        F.c.n();
        ImageReader.Builder i2 = F.c.i(this.requestedWidth, this.requestedHeight);
        i2.setMaxImages(7);
        i2.setImageFormat(34);
        i2.setUsage(256L);
        build = i2.build();
        return build;
    }

    private f getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    f peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.f10115a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = false;
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
        this.this$0.f10146a.scheduleFrame();
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
        HashSet hashSet = this.this$0.f10150e;
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
        this.this$0.f10151f.remove(this);
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
        Image image = dequeueImage.f10112a;
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
        boolean z;
        synchronized (this.lock) {
            try {
                Iterator<f> it = this.imageReaderQueue.iterator();
                dVar = null;
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    ArrayDeque arrayDeque = next.f10116b;
                    d dVar2 = arrayDeque.isEmpty() ? null : (d) arrayDeque.removeFirst();
                    if (dVar2 == null) {
                        dVar = dVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f10112a.close();
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
                    if (!it2.next().f10116b.isEmpty()) {
                        z = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.this$0.f10149d.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.c
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
            iVar.f10149d.post(new g(this.id, iVar.f10146a));
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
        return getActiveReader().f10115a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return false;
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
                    i2 += it.next().f10116b.size();
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
            if (orCreatePerImageReader.f10117c) {
                dVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f10118d;
                System.nanoTime();
                d dVar2 = new d(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f10116b;
                arrayDeque.add(dVar2);
                while (arrayDeque.size() > 2) {
                    ((d) arrayDeque.removeFirst()).f10112a.close();
                }
                dVar = dVar2;
            }
        }
        if (dVar == null) {
            return;
        }
        this.this$0.f10146a.scheduleFrame();
    }

    @Override // io.flutter.view.n
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
            ArrayDeque arrayDeque = peekFirst.f10116b;
            if (!arrayDeque.isEmpty() || peekFirst.f10118d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            HashMap<ImageReader, f> hashMap = this.perImageReaders;
            ImageReader imageReader = peekFirst.f10115a;
            hashMap.remove(imageReader);
            peekFirst.f10117c = true;
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
        iVar.f10146a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f10146a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(o oVar) {
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
