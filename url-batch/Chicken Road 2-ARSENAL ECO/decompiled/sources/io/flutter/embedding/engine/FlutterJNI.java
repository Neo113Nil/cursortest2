package io.flutter.embedding.engine;

import D3.C0122j;
import E3.b;
import E3.l;
import E3.m;
import F3.e;
import F3.h;
import G3.a;
import H1.RunnableC0139m;
import H3.d;
import H5.r;
import M.g;
import N.p;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaExtractor;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.AttachedSurfaceControl;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.i;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.platform.k;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.c;
import io.flutter.view.f;
import io.flutter.view.s;
import io.flutter.view.t;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import m1.AbstractC0521b;
import u0.C0679i;
import u0.C0689s;
import y1.C0760d;
import z0.C0770a;

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
    private P3.a localizationPlugin;
    private Long nativeShellHolderId;
    private h platformMessageHandler;
    private io.flutter.plugin.platform.l platformViewsController;
    private k platformViewsController2;
    private N3.m settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<i> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<j> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j4) {
        m mVar = asyncWaitForVsyncDelegate;
        if (mVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        c cVar = (c) mVar;
        cVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        t tVar = (t) cVar.f4605a;
        s sVar = tVar.f4739c;
        if (sVar != null) {
            sVar.f4733a = j4;
            tVar.f4739c = null;
        } else {
            sVar = new s(tVar, j4);
        }
        choreographer.postFrameCallback(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j4) {
        H3.b bVar;
        J1.c cVar = 0;
        cVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        E3.k kVar = new E3.k(j4);
        d dVar = new d();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i7 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            dVar.f1014d = options.outMimeType;
            dVar.f1016f = options.outHeight;
            dVar.f1017g = options.outWidth;
        } catch (Exception e4) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e4);
        }
        if ("image/heif".equals(dVar.f1014d)) {
            try {
                H3.c cVar2 = new H3.c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar2);
                AbstractC0521b.B(dVar, mediaExtractor);
            } catch (Exception e7) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e7);
            }
            nativeImageHeaderCallback(kVar.f660a, dVar.f1011a, dVar.f1012b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    M.c c7 = gVar.c("Orientation");
                    if (c7 != null) {
                        try {
                            i7 = c7.e(gVar.f1574e);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f1015e = i7;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e8) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e8);
            }
        }
        if ("image/heif".equals(dVar.f1014d)) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 == 36) {
                bVar = new H3.b(cVar, 0);
            } else if (i8 < 36) {
                bVar = new H3.b(cVar, 1);
            }
            cVar = bVar;
        }
        if (cVar == 0) {
            cVar = new J1.c(7, kVar);
        }
        return cVar.d(byteBuffer, dVar);
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

    private void handlePlatformMessageResponse(int i7, ByteBuffer byteBuffer) {
        O3.d dVar;
        h hVar = this.platformMessageHandler;
        if (hVar == null || (dVar = (O3.d) ((HashMap) ((F3.g) hVar).f737k).remove(Integer.valueOf(i7))) == null) {
            return;
        }
        try {
            dVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e4) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e4;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
        } catch (Exception e7) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j4);

    private native void nativeDeferredComponentInstallFailure(int i7, String str, boolean z5);

    private native void nativeDestroy(long j4);

    private native void nativeDispatchEmptyPlatformMessage(long j4, String str, int i7);

    private native void nativeDispatchPlatformMessage(long j4, String str, ByteBuffer byteBuffer, int i7, int i8);

    private native void nativeDispatchPointerDataPacket(long j4, ByteBuffer byteBuffer, int i7);

    private native void nativeDispatchSemanticsAction(long j4, int i7, int i8, ByteBuffer byteBuffer, int i9);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i7);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i7);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i7);

    private native Bitmap nativeGetBitmap(long j4);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j4, int i7, int i8);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j4, int i7);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j4, int i7);

    private native void nativeInvokePlatformMessageResponseCallback(long j4, int i7, ByteBuffer byteBuffer, int i8);

    private native boolean nativeIsSurfaceControlEnabled(long j4);

    private native void nativeLoadDartDeferredLibrary(long j4, int i7, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j4);

    private native void nativeMarkTextureFrameAvailable(long j4, long j7);

    private native void nativeNotifyLowMemoryWarning(long j4);

    private native void nativeOnVsync(long j4, long j7, long j8);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j4, long j7, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z5);

    private native void nativeRegisterTexture(long j4, long j7, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j4, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j7);

    private native void nativeScheduleFrame(long j4);

    private native void nativeSetAccessibilityFeatures(long j4, int i7);

    private native void nativeSetSemanticsEnabled(long j4, boolean z5);

    private native void nativeSetViewportMetrics(long j4, float f7, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29);

    private native FlutterJNI nativeSpawn(long j4, String str, String str2, String str3, List<String> list, long j7);

    private native void nativeSurfaceChanged(long j4, int i7, int i8);

    private native void nativeSurfaceCreated(long j4, Surface surface);

    private native void nativeSurfaceDestroyed(long j4);

    private native void nativeSurfaceWindowChanged(long j4, Surface surface);

    private native void nativeUnregisterTexture(long j4, long j7);

    private native void nativeUpdateDisplayMetrics(long j4);

    private native void nativeUpdateJavaAssetManager(long j4, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f7);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            ((io.flutter.view.i) ((c) lVar).f4605a).f4707l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.i iVar = (io.flutter.view.i) ((c) lVar).f4605a;
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.g a7 = iVar.a(byteBuffer.getInt());
                a7.f4636c = byteBuffer.getInt();
                a7.f4637d = io.flutter.view.i.c(byteBuffer, strArr);
                a7.f4638e = io.flutter.view.i.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            ((c) lVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    public void addResizingFlutterUiListener(j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(jVar);
    }

    public void applyTransactions() {
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = kVar.f4569n;
        SurfaceControl.Transaction e4 = io.flutter.plugin.platform.j.e();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e4 = e4.merge(io.flutter.plugin.platform.j.g(arrayList.get(i7)));
        }
        e4.apply();
        arrayList.clear();
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

    public void cleanupMessageData(long j4) {
        nativeCleanupMessageData(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        if (r10 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        if (r5 >= r4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        r6 = r0.get(r5);
        r5 = r5 + 1;
        r6 = (java.util.Locale) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        if (r3.getLanguage().equals(r6.toLanguageTag()) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (r5 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
    
        r6 = r0.get(r5);
        r5 = r5 + 1;
        r6 = (java.util.Locale) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r3.getLanguage().equals(r6.getLanguage()) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
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
        for (int i7 = 0; i7 < strArr.length; i7 += 3) {
            String str = strArr[i7];
            String str2 = strArr[i7 + 1];
            String str3 = strArr[i7 + 2];
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
        Context context = this.localizationPlugin.f1877b;
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i8 = 0; i8 < size; i8++) {
                Locale locale3 = locales.get(i8);
                String language = locale3.getLanguage();
                if (!locale3.getScript().isEmpty()) {
                    language = language + "-" + locale3.getScript();
                }
                if (!locale3.getCountry().isEmpty()) {
                    language = language + "-" + locale3.getCountry();
                }
                arrayList2.add(P2.a.p(language));
                P2.a.r();
                arrayList2.add(P2.a.p(locale3.getLanguage()));
                P2.a.r();
                arrayList2.add(P2.a.p(locale3.getLanguage() + "-*"));
            }
            locale2 = Locale.lookup(arrayList2, arrayList);
        } else {
            LocaleList locales2 = context.getResources().getConfiguration().getLocales();
            int i9 = 0;
            loop2: while (i9 < locales2.size()) {
                Locale locale4 = locales2.get(i9);
                int size2 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    locale = (Locale) obj;
                    if (locale4.equals(locale)) {
                        break loop2;
                    }
                }
                locale2 = locale;
            }
            locale2 = (Locale) arrayList.get(0);
        }
        return locale2 == null ? new String[0] : new String[]{locale2.getLanguage(), locale2.getCountry(), locale2.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        Context context = lVar.f4577h.getContext();
        int width = lVar.f4577h.getWidth();
        int height = lVar.f4577h.getHeight();
        io.flutter.plugin.platform.a aVar = lVar.f4582m;
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(context, width, height, 2);
        bVar.f4550m = aVar;
        int i7 = lVar.f4589t;
        lVar.f4589t = i7 + 1;
        lVar.f4587r.put(i7, bVar);
        return new FlutterOverlaySurface(i7, bVar.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (kVar.f4571p == null) {
            SurfaceControl.Builder d7 = io.flutter.plugin.platform.j.d();
            d7.setBufferSize(kVar.f4563h.getWidth(), kVar.f4563h.getHeight());
            d7.setFormat(1);
            d7.setName("Flutter Overlay Surface");
            d7.setOpaque(false);
            d7.setHidden(false);
            build = d7.build();
            rootSurfaceControl = kVar.f4563h.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            kVar.f4571p = io.flutter.plugin.platform.j.c(build);
            kVar.f4572q = build;
        }
        return new FlutterOverlaySurface(0, kVar.f4571p);
    }

    public SurfaceControl.Transaction createTransaction() {
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction e4 = io.flutter.plugin.platform.j.e();
        kVar.f4569n.add(e4);
        return e4;
    }

    public void deferredComponentInstallFailure(int i7, String str, boolean z5) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i7, str, z5);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = kVar.f4571p;
        if (surface != null) {
            surface.release();
            kVar.f4571p = null;
            kVar.f4572q = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        lVar.b();
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

    public void dispatchEmptyPlatformMessage(String str, int i7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i7);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i7);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i7, int i8) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i7, i8);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i8);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i7);
    }

    public void dispatchSemanticsAction(int i7, f fVar) {
        dispatchSemanticsAction(i7, fVar, null);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = kVar.f4570o;
        SurfaceControl.Transaction e4 = io.flutter.plugin.platform.j.e();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e4 = e4.merge(io.flutter.plugin.platform.j.g(arrayList.get(i7)));
        }
        arrayList.clear();
        kVar.f4563h.invalidate();
        rootSurfaceControl = kVar.f4563h.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(e4);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f7, int i7) {
        N3.l lVar;
        N3.m mVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (mVar != null) {
            B0.c cVar = mVar.f1730a;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) cVar.f72h;
            if (((N3.l) cVar.f73i) == null) {
                cVar.f73i = (N3.l) concurrentLinkedQueue.poll();
            }
            while (true) {
                lVar = (N3.l) cVar.f73i;
                if (lVar == null || lVar.f1728a >= i7) {
                    break;
                }
                cVar.f73i = (N3.l) concurrentLinkedQueue.poll();
            }
            if (lVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i7 + ", after exhausting the queue.");
            } else {
                if (lVar.f1728a != i7) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i7 + ", the oldest config is now: " + ((N3.l) cVar.f73i).f1728a);
                }
                if (lVar != null) {
                    displayMetrics = lVar.f1729b;
                }
            }
            lVar = null;
            if (lVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f7, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i7 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i7, long j4) {
        e eVar;
        boolean z5;
        h hVar = this.platformMessageHandler;
        if (hVar == null) {
            nativeCleanupMessageData(j4);
            return;
        }
        F3.g gVar = (F3.g) hVar;
        synchronized (gVar.f738l) {
            try {
                eVar = (e) ((HashMap) gVar.f735i).get(str);
                z5 = ((AtomicBoolean) gVar.f739m).get() && eVar == null;
                if (z5) {
                    if (!((HashMap) gVar.f736j).containsKey(str)) {
                        ((HashMap) gVar.f736j).put(str, new LinkedList());
                    }
                    ((List) ((HashMap) gVar.f736j).get(str)).add(new F3.d(j4, byteBuffer, i7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            return;
        }
        gVar.f(str, eVar, byteBuffer, i7, j4);
    }

    public void hideOverlaySurface2() {
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (kVar.f4572q == null) {
            return;
        }
        SurfaceControl.Transaction e4 = io.flutter.plugin.platform.j.e();
        kVar.f4569n.add(e4);
        e4.setVisibility(kVar.f4572q, false);
    }

    public void hidePlatformView2(int i7) {
        ensureRunningOnMainThread();
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (kVar.f4567l.get(i7) != null) {
            throw new ClassCastException();
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j4, int i7) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j4, i7);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i7) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i7);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i7, ByteBuffer byteBuffer, int i8) {
        FlutterJNI flutterJNI;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNI = isAttached();
            try {
                if (flutterJNI != 0) {
                    FlutterJNI flutterJNI2 = this;
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i7, byteBuffer, i8);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
                }
                flutterJNI.shellHolderLock.readLock().unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                flutterJNI.shellHolderLock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            flutterJNI = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i7) {
        return nativeFlutterTextUtilsIsEmoji(i7);
    }

    public boolean isCodePointEmojiModifier(int i7) {
        return nativeFlutterTextUtilsIsEmojiModifier(i7);
    }

    public boolean isCodePointEmojiModifierBase(int i7) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i7);
    }

    public boolean isCodePointRegionalIndicator(int i7) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i7);
    }

    public boolean isCodePointVariantSelector(int i7) {
        return nativeFlutterTextUtilsIsVariationSelector(i7);
    }

    public void loadDartDeferredLibrary(int i7, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i7, strArr);
    }

    public void loadLibrary(Context context) {
        C0689s e4;
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        long j4;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        B1.g gVar = new B1.g(4);
        R0.g gVar2 = new R0.g();
        C0760d c0760d = new C0760d();
        C0679i c0679i = new C0679i();
        c0679i.f5981f = new HashSet();
        c0679i.f5982g = gVar2;
        c0679i.f5983h = c0760d;
        c0679i.f5984i = gVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        c0679i.e("Beginning load of %s...", "flutter");
        R0.g gVar3 = (R0.g) c0679i.f5982g;
        HashSet hashSet = (HashSet) c0679i.f5981f;
        if (hashSet.contains("flutter")) {
            c0679i.e("%s already loaded previously!", "flutter");
        } else {
            C0689s c0689s = null;
            try {
                gVar3.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                c0679i.e("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e7) {
                c0679i.e("Loading the library normally failed: %s", Log.getStackTraceString(e7));
                c0679i.e("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File c7 = c0679i.c(context);
                if (!c7.exists()) {
                    File dir = context.getDir("lib", 0);
                    File c8 = c0679i.c(context);
                    gVar3.getClass();
                    File[] listFiles = dir.listFiles(new C0770a(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(c8.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    C0760d c0760d2 = (C0760d) c0679i.f5983h;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    c0760d2.getClass();
                    try {
                        e4 = C0760d.e(context, strArr2, mapLibraryName, c0679i);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (e4 == null) {
                            try {
                                strArr = C0760d.f(context, mapLibraryName);
                            } catch (Exception e8) {
                                strArr = new String[]{e8.toString()};
                            }
                            StringBuilder sb = new StringBuilder("Could not find '");
                            sb.append(mapLibraryName);
                            sb.append("'. Looked for: ");
                            sb.append(Arrays.toString(strArr2));
                            sb.append(", but only found: ");
                            throw new r(p.b(sb, Arrays.toString(strArr), "."));
                        }
                        ZipFile zipFile = (ZipFile) e4.f6034f;
                        int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            if (i7 < 5) {
                                c0679i.e("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (c7.exists() || c7.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) e4.f6035g);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(c7);
                                            } catch (FileNotFoundException unused) {
                                                fileOutputStream2 = null;
                                                C0760d.b(inputStream2);
                                                C0760d.b(fileOutputStream2);
                                                i7 = i8;
                                            } catch (IOException unused2) {
                                                fileOutputStream2 = null;
                                                C0760d.b(inputStream2);
                                                C0760d.b(fileOutputStream2);
                                                i7 = i8;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                C0760d.b(inputStream);
                                                C0760d.b(fileOutputStream);
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
                                            j4 = 0;
                                            while (true) {
                                                int read = inputStream2.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                fileOutputStream2.write(bArr, 0, read);
                                                j4 += read;
                                            }
                                            fileOutputStream2.flush();
                                            fileOutputStream2.getFD().sync();
                                        } catch (FileNotFoundException unused5) {
                                            C0760d.b(inputStream2);
                                            C0760d.b(fileOutputStream2);
                                            i7 = i8;
                                        } catch (IOException unused6) {
                                            C0760d.b(inputStream2);
                                            C0760d.b(fileOutputStream2);
                                            i7 = i8;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                            fileOutputStream = fileOutputStream2;
                                            C0760d.b(inputStream);
                                            C0760d.b(fileOutputStream);
                                            throw th;
                                        }
                                        if (j4 == c7.length()) {
                                            C0760d.b(inputStream2);
                                            C0760d.b(fileOutputStream2);
                                            c7.setReadable(true, false);
                                            c7.setExecutable(true, false);
                                            c7.setWritable(true);
                                            break;
                                        }
                                        C0760d.b(inputStream2);
                                        C0760d.b(fileOutputStream2);
                                    }
                                } catch (IOException unused7) {
                                }
                                i7 = i8;
                            } else if (((B1.g) c0679i.f5984i) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c0689s = e4;
                        if (c0689s != null) {
                            try {
                                ((ZipFile) c0689s.f6034f).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = c7.getAbsolutePath();
                gVar3.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                c0679i.e("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j4);
    }

    public void maybeResizeSurfaceView(int i7, int i8) {
        boolean z5;
        Iterator<j> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            View view = ((D3.r) it.next()).f460a.f475j;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z6 = true;
                if (view.getHeight() != i8) {
                    layoutParams.height = i8;
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (view.getWidth() != i7) {
                    layoutParams.width = i7;
                } else {
                    z6 = z5;
                }
                if (z6) {
                    view.setLayoutParams(layoutParams);
                }
            } else {
                Log.e("FlutterView", "Flutter engine view not set.");
            }
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        lVar.f4592w.clear();
        lVar.f4593x.clear();
    }

    public void onDisplayOverlaySurface(int i7, int i8, int i9, int i10, int i11) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = lVar.f4587r;
        if (sparseArray.get(i7) == null) {
            throw new IllegalStateException(C1.c.g("The overlay surface (id:", i7, ") doesn't exist"));
        }
        lVar.e();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i7);
        if (view.getParent() == null) {
            lVar.f4577h.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        lVar.f4592w.add(Integer.valueOf(i7));
    }

    public void onDisplayPlatformView(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        lVar.e();
        if (lVar.f4585p.get(i7) != null) {
            throw new ClassCastException();
        }
    }

    public void onDisplayPlatformView2(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (kVar.f4567l.get(i7) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public void onEndFrame() {
        ?? r32;
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z5 = false;
        if (!lVar.f4590u || !lVar.f4593x.isEmpty()) {
            if (lVar.f4590u) {
                C0122j c0122j = lVar.f4577h.f474i;
                if (c0122j != null ? c0122j.e() : false) {
                    z5 = true;
                }
            }
            lVar.d(z5);
            return;
        }
        lVar.f4590u = false;
        D3.t tVar = lVar.f4577h;
        RunnableC0139m runnableC0139m = new RunnableC0139m(14, lVar);
        C0122j c0122j2 = tVar.f474i;
        if (c0122j2 == null || (r32 = tVar.f476k) == 0) {
            return;
        }
        tVar.f475j = r32;
        tVar.f476k = null;
        io.flutter.embedding.engine.renderer.h hVar = tVar.f479n.f601b;
        if (hVar != null) {
            r32.b();
            hVar.a(new D3.s(tVar, hVar, runnableC0139m));
            return;
        }
        c0122j2.a();
        C0122j c0122j3 = tVar.f474i;
        if (c0122j3 != null) {
            c0122j3.f437f.close();
            tVar.removeView(tVar.f474i);
            tVar.f474i = null;
        }
        runnableC0139m.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i7, int i8) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i7, i8);
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

    public void onVsync(long j4, long j7, long j8) {
        nativeOnVsync(j4, j7, j8);
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

    public void registerImageTexture(long j4, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference<>(textureRegistry$ImageConsumer), z5);
    }

    public void registerTexture(long j4, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(iVar);
    }

    public void removeResizingFlutterUiListener(j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(jVar);
    }

    public void requestDartDeferredLibrary(int i7) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j4);
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

    public void setAccessibilityFeatures(int i7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i7);
        }
    }

    public void setAccessibilityFeaturesInNative(int i7) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i7);
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

    public void setLocalizationPlugin(P3.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(h hVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = hVar;
    }

    public void setPlatformViewsController(io.flutter.plugin.platform.l lVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = lVar;
    }

    public void setPlatformViewsController2(k kVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = kVar;
    }

    public void setRefreshRateFPS(float f7) {
        refreshRateFPS = f7;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z5);
        }
    }

    public void setSemanticsEnabledInNative(boolean z5) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z5);
    }

    public void setSemanticsTreeEnabled(boolean z5) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar == null || z5) {
            return;
        }
        io.flutter.view.i iVar = (io.flutter.view.i) ((c) lVar).f4605a;
        iVar.f4702g.clear();
        io.flutter.view.h hVar = iVar.f4704i;
        if (hVar != null) {
            iVar.g(hVar.f4667b, 65536);
        }
        iVar.f4704i = null;
        iVar.f4710o = null;
        AccessibilityEvent d7 = iVar.d(0, 2048);
        d7.setContentChangeTypes(1);
        iVar.h(d7);
    }

    public void setSettingsChannel(N3.m mVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = mVar;
    }

    public void setViewportMetrics(float f7, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f7, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, iArr, iArr2, iArr3, i22, i23, i24, i25, i26, i27, i28, i29);
    }

    public void showOverlaySurface2() {
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (kVar.f4572q == null) {
            return;
        }
        SurfaceControl.Transaction e4 = io.flutter.plugin.platform.j.e();
        kVar.f4569n.add(e4);
        e4.setVisibility(kVar.f4572q, true);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j4);
        Long l7 = nativeSpawn.nativeShellHolderId;
        if ((l7 == null || l7.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("");
        }
        synchronized (kVar) {
            kVar.f4570o.clear();
            kVar.f4570o.addAll(kVar.f4569n);
            kVar.f4569n.clear();
        }
    }

    public void unregisterTexture(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j4);
    }

    public void updateDisplayMetrics(int i7, float f7, float f8, float f9) {
        displayWidth = f7;
        displayHeight = f8;
        displayDensity = f9;
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

    public void dispatchSemanticsAction(int i7, f fVar, Object obj) {
        ByteBuffer byteBuffer;
        int i8;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = O3.l.f1771a.b(obj);
            i8 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i8 = 0;
        }
        dispatchSemanticsAction(i7, fVar.f4633f, byteBuffer, i8);
    }

    public void dispatchSemanticsAction(int i7, int i8, ByteBuffer byteBuffer, int i9) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i7, i8, byteBuffer, i9);
    }
}
