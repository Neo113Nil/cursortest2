package io.flutter.embedding.engine;

import D.AbstractActivityC0005f;
import D.AbstractC0000a;
import D.AbstractC0009j;
import D.AbstractC0010k;
import D.C0012m;
import D.u;
import D.w;
import D.x;
import D.y;
import E.b;
import E.l;
import E.m;
import F.k;
import G.a;
import H.c;
import H.d;
import M.n;
import N.e;
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
import io.flutter.plugin.platform.j;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.f;
import io.flutter.view.g;
import io.flutter.view.h;
import io.flutter.view.r;
import io.flutter.view.s;
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
import m.C0069c;
import m.C0073g;

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
    private io.flutter.plugin.platform.k platformViewsController;
    private j platformViewsController2;
    private n settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<i> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.j> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        m mVar = asyncWaitForVsyncDelegate;
        if (mVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.b bVar = (io.flutter.view.b) mVar;
        bVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        s sVar = (s) bVar.f695a;
        r rVar = sVar.f820c;
        if (rVar != null) {
            rVar.f814a = j2;
            sVar.f820c = null;
        } else {
            rVar = new r(sVar, j2);
        }
        choreographer.postFrameCallback(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j2) {
        H.b bVar;
        u uVar = 0;
        uVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        E.k kVar = new E.k(j2);
        d dVar = new d();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i2 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            dVar.f242d = options.outMimeType;
            dVar.f244f = options.outHeight;
            dVar.f245g = options.outWidth;
        } catch (Exception e2) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e2);
        }
        if ("image/heif".equals(dVar.f242d)) {
            try {
                c cVar = new c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                a.a.w(dVar, mediaExtractor);
            } catch (Exception e3) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
            }
            nativeImageHeaderCallback(kVar.f196a, dVar.f239a, dVar.f240b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    C0073g c0073g = new C0073g(byteArrayInputStream);
                    C0069c c2 = c0073g.c("Orientation");
                    if (c2 != null) {
                        try {
                            i2 = c2.e(c0073g.f979f);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f243e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e4) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e4);
            }
        }
        if ("image/heif".equals(dVar.f242d)) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 36) {
                bVar = new H.b(uVar, 0);
            } else if (i3 < 36) {
                bVar = new H.b(uVar, 1);
            }
            uVar = bVar;
        }
        if (uVar == 0) {
            uVar = new u(5, kVar);
        }
        return uVar.j(byteBuffer, dVar);
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
        if (kVar == null || (eVar = (e) ((F.j) kVar).f230g.remove(Integer.valueOf(i2))) == null) {
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
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j2);

    private native void nativeDeferredComponentInstallFailure(int i2, String str, boolean z2);

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

    private native void nativeRegisterImageTexture(long j2, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z2);

    private native void nativeRegisterTexture(long j2, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z2);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20);

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
            ((h) ((io.flutter.view.b) lVar).f695a).f789l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            h hVar = (h) ((io.flutter.view.b) lVar).f695a;
            hVar.getClass();
            while (byteBuffer.hasRemaining()) {
                f a2 = hVar.a(byteBuffer.getInt());
                a2.f725c = byteBuffer.getInt();
                a2.f726d = h.c(byteBuffer, strArr);
                a2.f727e = h.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            ((io.flutter.view.b) lVar).a(byteBuffer, strArr, byteBufferArr);
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

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(jVar);
    }

    public void applyTransactions() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        jVar.getClass();
        SurfaceControl.Transaction h2 = AbstractC0010k.h();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = jVar.f660j;
            if (i2 >= arrayList.size()) {
                h2.apply();
                arrayList.clear();
                return;
            } else {
                h2 = h2.merge(AbstractC0010k.j(arrayList.get(i2)));
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        if (r10 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        if (r4.hasNext() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
    
        if (r4.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0155, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
    
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
            locale2 = null;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            AbstractActivityC0005f abstractActivityC0005f = aVar.f357b;
            if (i3 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC0005f.getResources().getConfiguration().getLocales();
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
                locale2 = Locale.lookup(arrayList2, arrayList);
            } else {
                LocaleList locales2 = abstractActivityC0005f.getResources().getConfiguration().getLocales();
                int i5 = 0;
                loop2: while (i5 < locales2.size()) {
                    Locale locale4 = locales2.get(i5);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        locale = (Locale) it.next();
                        if (locale4.equals(locale)) {
                            break loop2;
                        }
                    }
                    locale2 = locale;
                }
                locale2 = (Locale) arrayList.get(0);
            }
        }
        return locale2 == null ? new String[0] : new String[]{locale2.getLanguage(), locale2.getCountry(), locale2.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(kVar.f667d.getContext(), kVar.f667d.getWidth(), kVar.f667d.getHeight(), 2);
        bVar.f640h = kVar.f672i;
        int i2 = kVar.f679p;
        kVar.f679p = i2 + 1;
        kVar.f677n.put(i2, bVar);
        return new FlutterOverlaySurface(i2, bVar.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (jVar.f662l == null) {
            SurfaceControl.Builder g2 = AbstractC0010k.g();
            g2.setBufferSize(jVar.f654d.getWidth(), jVar.f654d.getHeight());
            g2.setFormat(1);
            g2.setName("Flutter Overlay Surface");
            g2.setOpaque(false);
            g2.setHidden(false);
            build = g2.build();
            rootSurfaceControl = jVar.f654d.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            jVar.f662l = AbstractC0010k.f(build);
            jVar.f663m = build;
        }
        return new FlutterOverlaySurface(0, jVar.f662l);
    }

    public SurfaceControl.Transaction createTransaction() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        jVar.getClass();
        SurfaceControl.Transaction h2 = AbstractC0010k.h();
        jVar.f660j.add(h2);
        return h2;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = jVar.f662l;
        if (surface != null) {
            surface.release();
            jVar.f662l = null;
            jVar.f663m = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        kVar.c();
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

    public void dispatchSemanticsAction(int i2, io.flutter.view.e eVar) {
        dispatchSemanticsAction(i2, eVar, null);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h2 = AbstractC0010k.h();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = jVar.f661k;
            if (i2 >= arrayList.size()) {
                arrayList.clear();
                jVar.f654d.invalidate();
                rootSurfaceControl = jVar.f654d.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(h2);
                return;
            }
            h2 = h2.merge(AbstractC0010k.j(arrayList.get(i2)));
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f2, int i2) {
        M.m mVar;
        n nVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (nVar != null) {
            C.b bVar = nVar.f320a;
            M.m mVar2 = (M.m) bVar.f14b;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f13a;
            if (mVar2 == null) {
                bVar.f14b = (M.m) concurrentLinkedQueue.poll();
            }
            while (true) {
                mVar = (M.m) bVar.f14b;
                if (mVar == null || mVar.f318a >= i2) {
                    break;
                }
                bVar.f14b = (M.m) concurrentLinkedQueue.poll();
            }
            if (mVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (mVar.f318a != i2) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", the oldest config is now: " + ((M.m) bVar.f14b).f318a);
                }
                if (mVar != null) {
                    displayMetrics = mVar.f319b;
                }
            }
            mVar = null;
            if (mVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i2) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        F.f fVar;
        boolean z2;
        k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        F.j jVar = (F.j) kVar;
        synchronized (jVar.f228e) {
            try {
                fVar = (F.f) jVar.f226c.get(str);
                z2 = jVar.f229f.get() && fVar == null;
                if (z2) {
                    if (!jVar.f227d.containsKey(str)) {
                        jVar.f227d.put(str, new LinkedList());
                    }
                    ((List) jVar.f227d.get(str)).add(new F.d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        jVar.c(str, fVar, byteBuffer, i2, j2);
    }

    public void hideOverlaySurface2() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f663m == null) {
            return;
        }
        SurfaceControl.Transaction h2 = AbstractC0010k.h();
        h2.setVisibility(jVar.f663m, false);
        h2.apply();
    }

    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        AbstractC0009j.f(jVar.f658h.get(i2));
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
        B.a aVar;
        B.a d2;
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        E.j jVar = new E.j();
        B.b bVar = new B.b(1);
        B.b bVar2 = new B.b(0);
        B.e eVar = new B.e();
        eVar.f7a = new HashSet();
        eVar.f8b = bVar;
        eVar.f9c = bVar2;
        eVar.f10d = jVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        eVar.f("Beginning load of %s...", "flutter");
        B.b bVar3 = (B.b) eVar.f8b;
        HashSet hashSet = (HashSet) eVar.f7a;
        if (hashSet.contains("flutter")) {
            eVar.f("%s already loaded previously!", "flutter");
        } else {
            try {
                bVar3.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                eVar.f("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e2) {
                eVar.f("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                eVar.f("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File e3 = eVar.e(context);
                if (!e3.exists()) {
                    File dir = context.getDir("lib", 0);
                    File e4 = eVar.e(context);
                    bVar3.getClass();
                    File[] listFiles = dir.listFiles(new B.d(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(e4.getAbsolutePath())) {
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
                    ((B.b) eVar.f9c).getClass();
                    try {
                        d2 = B.b.d(context, strArr2, mapLibraryName, eVar);
                    } catch (Throwable th) {
                        th = th;
                        aVar = null;
                    }
                    try {
                        if (d2 == null) {
                            try {
                                strArr = B.b.e(context, mapLibraryName);
                            } catch (Exception e5) {
                                strArr = new String[]{e5.toString()};
                            }
                            throw new B.c(mapLibraryName, strArr2, strArr);
                        }
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            ZipFile zipFile = (ZipFile) d2.f3c;
                            if (i2 < 5) {
                                eVar.f("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (e3.exists() || e3.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) d2.f4d);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(e3);
                                            } catch (FileNotFoundException unused) {
                                                fileOutputStream2 = null;
                                                B.b.b(inputStream2);
                                                B.b.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused2) {
                                                fileOutputStream2 = null;
                                                B.b.b(inputStream2);
                                                B.b.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                B.b.b(inputStream);
                                                B.b.b(fileOutputStream);
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
                                            if (j2 == e3.length()) {
                                                B.b.b(inputStream2);
                                                B.b.b(fileOutputStream2);
                                                e3.setReadable(true, false);
                                                e3.setExecutable(true, false);
                                                e3.setWritable(true);
                                                break;
                                            }
                                            B.b.b(inputStream2);
                                            B.b.b(fileOutputStream2);
                                        } catch (FileNotFoundException unused5) {
                                            B.b.b(inputStream2);
                                            B.b.b(fileOutputStream2);
                                            i2 = i3;
                                        } catch (IOException unused6) {
                                            B.b.b(inputStream2);
                                            B.b.b(fileOutputStream2);
                                            i2 = i3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                            fileOutputStream = fileOutputStream2;
                                            B.b.b(inputStream);
                                            B.b.b(fileOutputStream);
                                            throw th;
                                        }
                                    }
                                } catch (IOException unused7) {
                                }
                                i2 = i3;
                            } else if (((E.j) eVar.f10d) != null) {
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
                String absolutePath = e3.getAbsolutePath();
                bVar3.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                eVar.f("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j2);
    }

    public void maybeResizeSurfaceView(int i2, int i3) {
        boolean z2;
        Iterator<io.flutter.embedding.engine.renderer.j> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            y yVar = ((w) it.next()).f114a;
            View view = yVar.f125f;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z3 = true;
                if (view.getHeight() != i3) {
                    layoutParams.height = i3;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (view.getWidth() != i2) {
                    layoutParams.width = i2;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    yVar.f120a.set(false);
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
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        kVar.f682s.clear();
        kVar.f683t.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = kVar.f677n;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        kVar.g();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i2);
        if (view.getParent() == null) {
            kVar.f667d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        kVar.f682s.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        kVar.g();
        AbstractC0009j.f(kVar.f675l.get(i2));
    }

    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        AbstractC0009j.f(jVar.f658h.get(i2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!kVar.f680q || !kVar.f683t.isEmpty()) {
            if (kVar.f680q) {
                C0012m c0012m = kVar.f667d.f124e;
                if (c0012m != null ? c0012m.e() : false) {
                    z2 = true;
                }
            }
            kVar.e(z2);
            return;
        }
        kVar.f680q = false;
        y yVar = kVar.f667d;
        F.h hVar = new F.h(3, kVar);
        C0012m c0012m2 = yVar.f124e;
        if (c0012m2 == null || (r3 = yVar.f126g) == 0) {
            return;
        }
        yVar.f125f = r3;
        yVar.f126g = null;
        io.flutter.embedding.engine.renderer.h hVar2 = yVar.f129j.f149b;
        if (hVar2 != null) {
            r3.b();
            hVar2.a(new x(yVar, hVar2, hVar));
            return;
        }
        c0012m2.d();
        C0012m c0012m3 = yVar.f124e;
        if (c0012m3 != null) {
            c0012m3.f89a.close();
            yVar.removeView(yVar.f124e);
            yVar.f124e = null;
        }
        hVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
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

    public void registerImageTexture(long j2, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(textureRegistry$ImageConsumer), z2);
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

    public void removeIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(iVar);
    }

    public void removeResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(jVar);
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

    public void setPlatformViewsController(io.flutter.plugin.platform.k kVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = kVar;
    }

    public void setPlatformViewsController2(j jVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = jVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z2);
        }
    }

    public void setSemanticsEnabledInNative(boolean z2) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setSemanticsTreeEnabled(boolean z2) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar == null || z2) {
            return;
        }
        h hVar = (h) ((io.flutter.view.b) lVar).f695a;
        hVar.f784g.clear();
        g gVar = hVar.f786i;
        if (gVar != null) {
            hVar.g(gVar.f752b, 65536);
        }
        hVar.f786i = null;
        hVar.f792o = null;
        AccessibilityEvent d2 = hVar.d(0, 2048);
        d2.setContentChangeTypes(1);
        hVar.h(d2);
    }

    public void setSettingsChannel(n nVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = nVar;
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3, i17, i18, i19, i20);
    }

    public void showOverlaySurface2() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f663m == null) {
            return;
        }
        SurfaceControl.Transaction h2 = AbstractC0010k.h();
        h2.setVisibility(jVar.f663m, true);
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
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        synchronized (jVar) {
            try {
                jVar.f661k.clear();
                for (int i2 = 0; i2 < jVar.f660j.size(); i2++) {
                    jVar.f661k.add(AbstractC0010k.j(jVar.f660j.get(i2)));
                }
                jVar.f660j.clear();
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

    public void dispatchSemanticsAction(int i2, io.flutter.view.e eVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = N.m.f350a.c(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, eVar.f722b, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
