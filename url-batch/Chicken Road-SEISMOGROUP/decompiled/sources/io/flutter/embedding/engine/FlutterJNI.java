package io.flutter.embedding.engine;

import A.c;
import E.AbstractActivityC0004e;
import E.AbstractC0000a;
import E.AbstractC0008i;
import E.AbstractC0009j;
import E.C0011l;
import E.u;
import E.v;
import F.b;
import F.l;
import F.m;
import G.f;
import G.k;
import H.a;
import N.e;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.AttachedSurfaceControl;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.d;
import io.flutter.view.g;
import io.flutter.view.q;
import io.flutter.view.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static m asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private l accessibilityDelegate;
    private a deferredComponentManager;
    private O.a localizationPlugin;
    private Long nativeShellHolderId;
    private k platformMessageHandler;
    private j platformViewsController;
    private i platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.i> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        m mVar = asyncWaitForVsyncDelegate;
        if (mVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.a aVar = (io.flutter.view.a) mVar;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        r rVar = (r) aVar.f748a;
        q qVar = rVar.f873c;
        if (qVar != null) {
            qVar.f867a = j2;
            rVar.f873c = null;
        } else {
            qVar = new q(rVar, j2);
        }
        choreographer.postFrameCallback(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F.k] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j2) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: F.k
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$1(j2, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (IOException e2) {
                Log.e(TAG, "Failed to decode image", e2);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i2, ByteBuffer byteBuffer) {
        e eVar;
        k kVar = this.platformMessageHandler;
        if (kVar == null || (eVar = (e) ((G.j) kVar).f305g.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e2) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e2;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e2);
        } catch (Exception e3) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$1(long j2, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Size size;
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        imageDecoder.setTargetColorSpace(colorSpace);
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j2, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j2);

    private native void nativeDeferredComponentInstallFailure(int i2, String str, boolean z);

    private native void nativeDestroy(long j2);

    private native void nativeDispatchEmptyPlatformMessage(long j2, String str, int i2);

    private native void nativeDispatchPlatformMessage(long j2, String str, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeDispatchPointerDataPacket(long j2, ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j2, int i2, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i2);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i2);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i2);

    private native Bitmap nativeGetBitmap(long j2);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j2, int i2, int i3);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j2, int i2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j2, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j2, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeIsSurfaceControlEnabled(long j2);

    private native void nativeLoadDartDeferredLibrary(long j2, int i2, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j2);

    private native void nativeMarkTextureFrameAvailable(long j2, long j3);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j3, long j4);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z);

    private native void nativeRegisterTexture(long j2, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j2, String str, String str2, String str3, List<String> list, long j3);

    private native void nativeSurfaceChanged(long j2, int i2, int i3);

    private native void nativeSurfaceCreated(long j2, Surface surface);

    private native void nativeSurfaceDestroyed(long j2);

    private native void nativeSurfaceWindowChanged(long j2, Surface surface);

    private native void nativeUnregisterTexture(long j2, long j3);

    private native void nativeUpdateDisplayMetrics(long j2);

    private native void nativeUpdateJavaAssetManager(long j2, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            ((g) ((io.flutter.view.a) lVar).f748a).f841l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            g gVar = (g) ((io.flutter.view.a) lVar).f748a;
            gVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.e a2 = gVar.a(byteBuffer.getInt());
                a2.f778c = byteBuffer.getInt();
                a2.f779d = g.c(byteBuffer, strArr);
                a2.f780e = g.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            ((io.flutter.view.a) lVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    public void applyTransactions() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("");
        }
        iVar.getClass();
        SurfaceControl.Transaction h2 = AbstractC0009j.h();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = iVar.f713j;
            if (i2 >= arrayList.size()) {
                h2.apply();
                arrayList.clear();
                return;
            } else {
                h2 = h2.merge(AbstractC0009j.j(arrayList.get(i2)));
                i2++;
            }
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j2) {
        nativeCleanupMessageData(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013c, code lost:
    
        if (r4.hasNext() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015b, code lost:
    
        if (r4.hasNext() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0172, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale locale;
        Locale locale2;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 3) {
            String str = strArr[i2];
            String str2 = strArr[i2 + 1];
            String str3 = strArr[i2 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        O.a aVar = this.localizationPlugin;
        aVar.getClass();
        if (arrayList.isEmpty()) {
            locale = null;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            AbstractActivityC0004e abstractActivityC0004e = aVar.f415b;
            if (i3 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC0004e.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Locale locale3 = locales.get(i4);
                    String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        language = language + "-" + locale3.getScript();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        language = language + "-" + locale3.getCountry();
                    }
                    arrayList2.add(AbstractC0000a.k(language));
                    AbstractC0000a.m();
                    arrayList2.add(AbstractC0000a.k(locale3.getLanguage()));
                    AbstractC0000a.m();
                    arrayList2.add(AbstractC0000a.k(locale3.getLanguage() + "-*"));
                }
                locale = Locale.lookup(arrayList2, arrayList);
                if (locale == null) {
                    locale = (Locale) arrayList.get(0);
                }
            } else {
                LocaleList locales2 = abstractActivityC0004e.getResources().getConfiguration().getLocales();
                int i5 = 0;
                loop2: while (i5 < locales2.size()) {
                    Locale locale4 = locales2.get(i5);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        locale2 = (Locale) it.next();
                        if (locale4.equals(locale2)) {
                            break loop2;
                        }
                    }
                    locale = locale2;
                }
                locale = (Locale) arrayList.get(0);
            }
        }
        return locale == null ? new String[0] : new String[]{locale.getLanguage(), locale.getCountry(), locale.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(jVar.f720d.getContext(), jVar.f720d.getWidth(), jVar.f720d.getHeight(), 2);
        bVar.f695g = jVar.f725i;
        int i2 = jVar.f732p;
        jVar.f732p = i2 + 1;
        jVar.f730n.put(i2, bVar);
        return new FlutterOverlaySurface(i2, bVar.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (iVar.f715l == null) {
            SurfaceControl.Builder g2 = AbstractC0009j.g();
            g2.setBufferSize(iVar.f707d.getWidth(), iVar.f707d.getHeight());
            g2.setFormat(1);
            g2.setName("Flutter Overlay Surface");
            g2.setOpaque(false);
            g2.setHidden(false);
            build = g2.build();
            rootSurfaceControl = iVar.f707d.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            iVar.f715l = AbstractC0009j.f(build);
            iVar.f716m = build;
        }
        return new FlutterOverlaySurface(0, iVar.f715l);
    }

    public SurfaceControl.Transaction createTransaction() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("");
        }
        iVar.getClass();
        SurfaceControl.Transaction h2 = AbstractC0009j.h();
        iVar.f713j.add(h2);
        return h2;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = iVar.f715l;
        if (surface != null) {
            surface.release();
            iVar.f715l = null;
            iVar.f716m = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        jVar.c();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i2);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i2, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i2, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i2, d dVar) {
        dispatchSemanticsAction(i2, dVar, null);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h2 = AbstractC0009j.h();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = iVar.f714k;
            if (i2 >= arrayList.size()) {
                arrayList.clear();
                iVar.f707d.invalidate();
                rootSurfaceControl = iVar.f707d.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(h2);
                return;
            }
            h2 = h2.merge(AbstractC0009j.j(arrayList.get(i2)));
            i2++;
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f2, int i2) {
        M.l lVar;
        DisplayMetrics displayMetrics;
        D.b bVar = M.m.f378b;
        M.l lVar2 = (M.l) bVar.f100b;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f99a;
        if (lVar2 == null) {
            bVar.f100b = (M.l) concurrentLinkedQueue.poll();
        }
        while (true) {
            lVar = (M.l) bVar.f100b;
            if (lVar == null || lVar.f376a >= i2) {
                break;
            }
            bVar.f100b = (M.l) concurrentLinkedQueue.poll();
        }
        if (lVar != null) {
            if (lVar.f376a != i2) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i2) + ", the oldest config is now: " + String.valueOf(((M.l) bVar.f100b).f376a));
            }
            displayMetrics = lVar != null ? lVar.f377b : null;
            if (displayMetrics == null) {
                return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
            }
            Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i2) + ", which can't be found.");
            return -1.0f;
        }
        Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i2) + ", after exhausting the queue.");
        lVar = null;
        if (lVar != null) {
        }
        if (displayMetrics == null) {
        }
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        f fVar;
        boolean z;
        k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        G.j jVar = (G.j) kVar;
        synchronized (jVar.f303e) {
            try {
                fVar = (f) jVar.f301c.get(str);
                z = jVar.f304f.get() && fVar == null;
                if (z) {
                    if (!jVar.f302d.containsKey(str)) {
                        jVar.f302d.put(str, new LinkedList());
                    }
                    ((List) jVar.f302d.get(str)).add(new G.d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        jVar.a(str, fVar, byteBuffer, i2, j2);
    }

    public void hideOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (iVar.f716m == null) {
            return;
        }
        SurfaceControl.Transaction h2 = AbstractC0009j.h();
        h2.setVisibility(iVar.f716m, false);
        h2.apply();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j2, int i2) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j2, i2);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i2) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i2);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i2, ByteBuffer byteBuffer, int i3) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i2, byteBuffer, i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i2) {
        return nativeFlutterTextUtilsIsEmoji(i2);
    }

    public boolean isCodePointEmojiModifier(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifier(i2);
    }

    public boolean isCodePointEmojiModifierBase(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i2);
    }

    public boolean isCodePointRegionalIndicator(int i2) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i2);
    }

    public boolean isCodePointVariantSelector(int i2) {
        return nativeFlutterTextUtilsIsVariationSelector(i2);
    }

    public void loadDartDeferredLibrary(int i2, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i2, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a1, code lost:
    
        if (r12 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015f, code lost:
    
        r12.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadLibrary(Context context) {
        A.a aVar;
        A.a d2;
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        F.j jVar = new F.j();
        A.b bVar = new A.b(1);
        A.b bVar2 = new A.b(0);
        A.e eVar = new A.e();
        eVar.f7b = new HashSet();
        eVar.f8c = bVar;
        eVar.f9d = bVar2;
        eVar.f10e = jVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        eVar.i("Beginning load of %s...", "flutter");
        A.b bVar3 = (A.b) eVar.f8c;
        HashSet hashSet = (HashSet) eVar.f7b;
        if (hashSet.contains("flutter")) {
            eVar.i("%s already loaded previously!", "flutter");
        } else {
            try {
                bVar3.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                eVar.i("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e2) {
                eVar.i("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                eVar.i("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File g2 = eVar.g(context);
                if (!g2.exists()) {
                    File dir = context.getDir("lib", 0);
                    File g3 = eVar.g(context);
                    bVar3.getClass();
                    File[] listFiles = dir.listFiles(new A.d(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(g3.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    ((A.b) eVar.f9d).getClass();
                    try {
                        d2 = A.b.d(context, strArr2, mapLibraryName, eVar);
                    } catch (Throwable th) {
                        th = th;
                        aVar = null;
                    }
                    try {
                        if (d2 == null) {
                            try {
                                strArr = A.b.e(context, mapLibraryName);
                            } catch (Exception e3) {
                                strArr = new String[]{e3.toString()};
                            }
                            throw new c(mapLibraryName, strArr2, strArr);
                        }
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            ZipFile zipFile = (ZipFile) d2.f3c;
                            if (i2 < 5) {
                                eVar.i("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (g2.exists() || g2.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) d2.f4d);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(g2);
                                            } catch (FileNotFoundException unused) {
                                                fileOutputStream2 = null;
                                                A.b.b(inputStream2);
                                                A.b.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused2) {
                                                fileOutputStream2 = null;
                                                A.b.b(inputStream2);
                                                A.b.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                A.b.b(inputStream);
                                                A.b.b(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused3) {
                                            inputStream2 = null;
                                        } catch (IOException unused4) {
                                            inputStream2 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = null;
                                        }
                                        try {
                                            byte[] bArr = new byte[4096];
                                            long j2 = 0;
                                            while (true) {
                                                int read = inputStream2.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                fileOutputStream2.write(bArr, 0, read);
                                                j2 += read;
                                            }
                                            fileOutputStream2.flush();
                                            fileOutputStream2.getFD().sync();
                                            if (j2 == g2.length()) {
                                                A.b.b(inputStream2);
                                                A.b.b(fileOutputStream2);
                                                g2.setReadable(true, false);
                                                g2.setExecutable(true, false);
                                                g2.setWritable(true);
                                                break;
                                            }
                                            A.b.b(inputStream2);
                                            A.b.b(fileOutputStream2);
                                        } catch (FileNotFoundException unused5) {
                                            A.b.b(inputStream2);
                                            A.b.b(fileOutputStream2);
                                            i2 = i3;
                                        } catch (IOException unused6) {
                                            A.b.b(inputStream2);
                                            A.b.b(fileOutputStream2);
                                            i2 = i3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                            fileOutputStream = fileOutputStream2;
                                            A.b.b(inputStream);
                                            A.b.b(fileOutputStream);
                                            throw th;
                                        }
                                    }
                                } catch (IOException unused7) {
                                }
                                i2 = i3;
                            } else if (((F.j) eVar.f10e) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        aVar = d2;
                        if (aVar != null) {
                            try {
                                ZipFile zipFile2 = (ZipFile) aVar.f3c;
                                if (zipFile2 != null) {
                                    zipFile2.close();
                                }
                            } catch (IOException unused8) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = g2.getAbsolutePath();
                bVar3.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                eVar.i("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j2);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        jVar.f735s.clear();
        jVar.t.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = jVar.f730n;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        jVar.g();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i2);
        if (view.getParent() == null) {
            jVar.f720d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        jVar.f735s.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        jVar.g();
        AbstractC0008i.e(jVar.f728l.get(i2));
    }

    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        AbstractC0008i.e(iVar.f711h.get(i2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z = false;
        if (!jVar.f733q || !jVar.t.isEmpty()) {
            if (jVar.f733q) {
                C0011l c0011l = jVar.f720d.f192c;
                if (c0011l != null ? c0011l.e() : false) {
                    z = true;
                }
            }
            jVar.e(z);
            return;
        }
        jVar.f733q = false;
        v vVar = jVar.f720d;
        B.e eVar = new B.e(3, jVar);
        C0011l c0011l2 = vVar.f192c;
        if (c0011l2 == null || (r3 = vVar.f194e) == 0) {
            return;
        }
        vVar.f193d = r3;
        vVar.f194e = null;
        h hVar = vVar.f197h.f224b;
        if (hVar != null) {
            r3.b();
            hVar.a(new u(vVar, hVar, eVar));
            return;
        }
        c0011l2.d();
        C0011l c0011l3 = vVar.f192c;
        if (c0011l3 != null) {
            c0011l3.f167a.close();
            vVar.removeView(vVar.f192c);
            vVar.f192c = null;
        }
        eVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onSurfaceChanged(int i2, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i2, i3);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j2, long j3, long j4) {
        nativeOnVsync(j2, j3, j4);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j2, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(textureRegistry$ImageConsumer), z);
    }

    public void registerTexture(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(iVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j2);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(l lVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = lVar;
    }

    public void setAccessibilityFeatures(int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i2);
        }
    }

    public void setAccessibilityFeaturesInNative(int i2) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i2);
    }

    public void setAsyncWaitForVsyncDelegate(m mVar) {
        asyncWaitForVsyncDelegate = mVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(O.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(j jVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = jVar;
    }

    public void setPlatformViewsController2(i iVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = iVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z);
        }
    }

    public void setSemanticsEnabledInNative(boolean z) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3);
    }

    public void showOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (iVar.f716m == null) {
            return;
        }
        SurfaceControl.Transaction h2 = AbstractC0009j.h();
        h2.setVisibility(iVar.f716m, true);
        h2.apply();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j2);
        Long l2 = nativeSpawn.nativeShellHolderId;
        if ((l2 == null || l2.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("");
        }
        synchronized (iVar) {
            try {
                iVar.f714k.clear();
                for (int i2 = 0; i2 < iVar.f713j.size(); i2++) {
                    iVar.f714k.add(AbstractC0009j.j(iVar.f713j.get(i2)));
                }
                iVar.f713j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterTexture(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j2);
    }

    public void updateDisplayMetrics(int i2, float f2, float f3, float f4) {
        displayWidth = f2;
        displayHeight = f3;
        displayDensity = f4;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i2, d dVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = N.m.f408a.c(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, dVar.f775b, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
