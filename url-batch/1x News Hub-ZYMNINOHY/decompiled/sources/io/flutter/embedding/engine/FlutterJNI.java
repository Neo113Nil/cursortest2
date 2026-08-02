package io.flutter.embedding.engine;

import B0.n;
import B0.p;
import C0.e;
import C0.h;
import E1.AbstractActivityC0029e;
import E1.AbstractC0033i;
import E1.C0034j;
import E1.t;
import F1.b;
import F1.k;
import F1.l;
import G1.i;
import G1.j;
import H1.a;
import I1.d;
import O.g;
import O1.m;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
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
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import f0.C0322a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.Wo;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.C1045c;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.c;
import io.flutter.view.f;
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
import java.util.Arrays;
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
import q0.C1179a;

/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static l asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private k accessibilityDelegate;
    private a deferredComponentManager;
    private Q1.a localizationPlugin;
    private Long nativeShellHolderId;
    private j platformMessageHandler;
    private r platformViewsController;
    private q platformViewsController2;
    private m settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.k> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.l> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j3) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        c cVar = (c) lVar;
        cVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        s sVar = (s) cVar.f9337a;
        io.flutter.view.r rVar = sVar.f9459c;
        if (rVar != null) {
            rVar.f9454a = j3;
            sVar.f9459c = null;
        } else {
            rVar = new io.flutter.view.r(sVar, j3);
        }
        choreographer.postFrameCallback(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j3) {
        I1.b bVar;
        e eVar = 0;
        eVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        h hVar = new h(j3);
        d dVar = new d();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i3 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            dVar.f619d = options.outMimeType;
            dVar.f = options.outHeight;
            dVar.f621g = options.outWidth;
        } catch (Exception e3) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e3);
        }
        if ("image/heif".equals(dVar.f619d)) {
            try {
                I1.c cVar = new I1.c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                S0.a.x(dVar, mediaExtractor);
            } catch (Exception e4) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e4);
            }
            nativeImageHeaderCallback(hVar.f205a, dVar.f616a, dVar.f617b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    O.c c3 = gVar.c("Orientation");
                    if (c3 != null) {
                        try {
                            i3 = c3.e(gVar.f1128h);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f620e = i3;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e5) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e5);
            }
        }
        if ("image/heif".equals(dVar.f619d)) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 == 36) {
                bVar = new I1.b(eVar, 0);
            } else if (i4 < 36) {
                bVar = new I1.b(eVar, 1);
            }
            eVar = bVar;
        }
        if (eVar == 0) {
            eVar = new e(6, hVar);
        }
        return eVar.e(byteBuffer, dVar);
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

    private void handlePlatformMessageResponse(int i3, ByteBuffer byteBuffer) {
        P1.e eVar;
        j jVar = this.platformMessageHandler;
        if (jVar == null || (eVar = (P1.e) ((i) jVar).f.remove(Integer.valueOf(i3))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e3) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e3;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e3);
        } catch (Exception e4) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j3);

    private native void nativeDeferredComponentInstallFailure(int i3, String str, boolean z);

    private native void nativeDestroy(long j3);

    private native void nativeDispatchEmptyPlatformMessage(long j3, String str, int i3);

    private native void nativeDispatchPlatformMessage(long j3, String str, ByteBuffer byteBuffer, int i3, int i4);

    private native void nativeDispatchPointerDataPacket(long j3, ByteBuffer byteBuffer, int i3);

    private native void nativeDispatchSemanticsAction(long j3, int i3, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i3);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i3);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i3);

    private native Bitmap nativeGetBitmap(long j3);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j3, int i3, int i4);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j3, int i3);

    private native void nativeInvokePlatformMessageResponseCallback(long j3, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeIsSurfaceControlEnabled(long j3);

    private native void nativeLoadDartDeferredLibrary(long j3, int i3, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j3);

    private native void nativeMarkTextureFrameAvailable(long j3, long j4);

    private native void nativeNotifyLowMemoryWarning(long j3);

    private native void nativeOnVsync(long j3, long j4, long j5);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j3, long j4, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z);

    private native void nativeRegisterTexture(long j3, long j4, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j3, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4);

    private native void nativeScheduleFrame(long j3);

    private native void nativeSetAccessibilityFeatures(long j3, int i3);

    private native void nativeSetSemanticsEnabled(long j3, boolean z);

    private native void nativeSetViewportMetrics(long j3, float f, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25);

    private native FlutterJNI nativeSpawn(long j3, String str, String str2, String str3, List<String> list, long j4);

    private native void nativeSurfaceChanged(long j3, int i3, int i4);

    private native void nativeSurfaceCreated(long j3, Surface surface);

    private native void nativeSurfaceDestroyed(long j3);

    private native void nativeSurfaceWindowChanged(long j3, Surface surface);

    private native void nativeUnregisterTexture(long j3, long j4);

    private native void nativeUpdateDisplayMetrics(long j3);

    private native void nativeUpdateJavaAssetManager(long j3, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.i) ((c) kVar).f9337a).f9433m = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.i iVar = (io.flutter.view.i) ((c) kVar).f9337a;
            iVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.g b3 = iVar.b(byteBuffer.getInt());
                b3.f9365c = byteBuffer.getInt();
                b3.f9366d = io.flutter.view.i.d(byteBuffer, strArr);
                b3.f9367e = io.flutter.view.i.d(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((c) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(kVar);
    }

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(lVar);
    }

    public void applyTransactions() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h3 = Wo.h();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = qVar.f9289l;
            if (i3 >= arrayList.size()) {
                h3.apply();
                arrayList.clear();
                return;
            } else {
                h3 = h3.merge(Wo.k(arrayList.get(i3)));
                i3++;
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

    public void cleanupMessageData(long j3) {
        nativeCleanupMessageData(j3);
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
        for (int i3 = 0; i3 < strArr.length; i3 += 3) {
            String str = strArr[i3];
            String str2 = strArr[i3 + 1];
            String str3 = strArr[i3 + 2];
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
        Q1.a aVar = this.localizationPlugin;
        aVar.getClass();
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else {
            int i4 = Build.VERSION.SDK_INT;
            AbstractActivityC0029e abstractActivityC0029e = aVar.f1282b;
            if (i4 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC0029e.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Locale locale3 = locales.get(i5);
                    String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        language = language + TokenBuilder.TOKEN_DELIMITER + locale3.getScript();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        language = language + TokenBuilder.TOKEN_DELIMITER + locale3.getCountry();
                    }
                    arrayList2.add(C.a.q(language));
                    C.a.D();
                    arrayList2.add(C.a.q(locale3.getLanguage()));
                    C.a.D();
                    arrayList2.add(C.a.q(locale3.getLanguage() + "-*"));
                }
                locale2 = Locale.lookup(arrayList2, arrayList);
            } else {
                LocaleList locales2 = abstractActivityC0029e.getResources().getConfiguration().getLocales();
                int i6 = 0;
                loop2: while (i6 < locales2.size()) {
                    Locale locale4 = locales2.get(i6);
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
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        C1045c c1045c = new C1045c(rVar.f9298d.getContext(), rVar.f9298d.getWidth(), rVar.f9298d.getHeight(), 2);
        c1045c.f9246h = rVar.f9302i;
        int i3 = rVar.f9308p;
        rVar.f9308p = i3 + 1;
        rVar.f9307n.put(i3, c1045c);
        return new FlutterOverlaySurface(i3, c1045c.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (qVar.f9291n == null) {
            SurfaceControl.Builder g3 = Wo.g();
            g3.setBufferSize(qVar.f9282d.getWidth(), qVar.f9282d.getHeight());
            g3.setFormat(1);
            g3.setName("Flutter Overlay Surface");
            g3.setOpaque(false);
            g3.setHidden(false);
            build = g3.build();
            rootSurfaceControl = qVar.f9282d.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            buildReparentTransaction.apply();
            qVar.f9291n = Wo.f(build);
            qVar.o = build;
        }
        return new FlutterOverlaySurface(0, qVar.f9291n);
    }

    public SurfaceControl.Transaction createTransaction() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h3 = Wo.h();
        qVar.f9289l.add(h3);
        return h3;
    }

    public void deferredComponentInstallFailure(int i3, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i3, str, z);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = qVar.f9291n;
        if (surface != null) {
            surface.release();
            qVar.f9291n = null;
            qVar.o = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        rVar.d();
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

    public void dispatchEmptyPlatformMessage(String str, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i3, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i3, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i3, f fVar) {
        dispatchSemanticsAction(i3, fVar, null);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h3 = Wo.h();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = qVar.f9290m;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                qVar.f9282d.invalidate();
                rootSurfaceControl = qVar.f9282d.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(h3);
                return;
            }
            h3 = h3.merge(Wo.k(arrayList.get(i3)));
            i3++;
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
    public float getScaledFontSize(float f, int i3) {
        O1.l lVar;
        m mVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (mVar != null) {
            A0.f fVar = mVar.f1188a;
            O1.l lVar2 = (O1.l) fVar.f24c;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) fVar.f23b;
            if (lVar2 == null) {
                fVar.f24c = (O1.l) concurrentLinkedQueue.poll();
            }
            while (true) {
                lVar = (O1.l) fVar.f24c;
                if (lVar == null || lVar.f1186a >= i3) {
                    break;
                }
                fVar.f24c = (O1.l) concurrentLinkedQueue.poll();
            }
            if (lVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i3 + ", after exhausting the queue.");
            } else {
                if (lVar.f1186a != i3) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i3 + ", the oldest config is now: " + ((O1.l) fVar.f24c).f1186a);
                }
                if (lVar != null) {
                    displayMetrics = lVar.f1187b;
                }
            }
            lVar = null;
            if (lVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i3 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i3, long j3) {
        G1.f fVar;
        boolean z;
        j jVar = this.platformMessageHandler;
        if (jVar == null) {
            nativeCleanupMessageData(j3);
            return;
        }
        i iVar = (i) jVar;
        synchronized (iVar.f558d) {
            try {
                fVar = (G1.f) iVar.f556b.get(str);
                z = iVar.f559e.get() && fVar == null;
                if (z) {
                    if (!iVar.f557c.containsKey(str)) {
                        iVar.f557c.put(str, new LinkedList());
                    }
                    ((List) iVar.f557c.get(str)).add(new G1.d(j3, byteBuffer, i3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        iVar.a(str, fVar, byteBuffer, i3, j3);
    }

    public void hideOverlaySurface2() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (qVar.o == null) {
            return;
        }
        SurfaceControl.Transaction h3 = Wo.h();
        qVar.f9289l.add(h3);
        h3.setVisibility(qVar.o, false);
    }

    public void hidePlatformView2(int i3) {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (qVar.a(i3)) {
            ((K1.b) qVar.f9287j.get(i3)).setVisibility(8);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j3, i3);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i3) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
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
    public void invokePlatformMessageResponseCallback(int i3, ByteBuffer byteBuffer, int i4) {
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
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i3, byteBuffer, i4);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
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

    public boolean isCodePointEmoji(int i3) {
        return nativeFlutterTextUtilsIsEmoji(i3);
    }

    public boolean isCodePointEmojiModifier(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifier(i3);
    }

    public boolean isCodePointEmojiModifierBase(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i3);
    }

    public boolean isCodePointRegionalIndicator(int i3) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i3);
    }

    public boolean isCodePointVariantSelector(int i3) {
        return nativeFlutterTextUtilsIsVariationSelector(i3);
    }

    public void loadDartDeferredLibrary(int i3, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i3, strArr);
    }

    public void loadLibrary(Context context) {
        C0322a c0322a;
        C0322a b3;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C0.f fVar = new C0.f(3);
        m1.c cVar = new m1.c();
        m1.c cVar2 = new m1.c();
        p pVar = new p();
        pVar.f162a = new HashSet();
        pVar.f163b = cVar;
        pVar.f164c = cVar2;
        pVar.f165d = fVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        pVar.d("Beginning load of %s...", PluginErrorDetails.Platform.FLUTTER);
        m1.c cVar3 = (m1.c) pVar.f163b;
        HashSet hashSet = (HashSet) pVar.f162a;
        if (hashSet.contains(PluginErrorDetails.Platform.FLUTTER)) {
            pVar.d("%s already loaded previously!", PluginErrorDetails.Platform.FLUTTER);
        } else {
            try {
                cVar3.getClass();
                System.loadLibrary(PluginErrorDetails.Platform.FLUTTER);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                pVar.d("%s (%s) was loaded normally!", PluginErrorDetails.Platform.FLUTTER, null);
            } catch (UnsatisfiedLinkError e3) {
                pVar.d("Loading the library normally failed: %s", Log.getStackTraceString(e3));
                pVar.d("%s (%s) was not loaded normally, re-linking...", PluginErrorDetails.Platform.FLUTTER, null);
                File c3 = pVar.c(context);
                if (!c3.exists()) {
                    File dir = context.getDir("lib", 0);
                    File c4 = pVar.c(context);
                    cVar3.getClass();
                    File[] listFiles = dir.listFiles(new C1179a(System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER)));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(c4.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER);
                    ((m1.c) pVar.f164c).getClass();
                    try {
                        b3 = m1.c.b(context, strArr2, mapLibraryName, pVar);
                    } catch (Throwable th) {
                        th = th;
                        c0322a = null;
                    }
                    try {
                        if (b3 == null) {
                            try {
                                strArr = m1.c.c(context, mapLibraryName);
                            } catch (Exception e4) {
                                strArr = new String[]{e4.toString()};
                            }
                            StringBuilder sb = new StringBuilder("Could not find '");
                            sb.append(mapLibraryName);
                            sb.append("'. Looked for: ");
                            sb.append(Arrays.toString(strArr2));
                            sb.append(", but only found: ");
                            throw new O0.b(AbstractC0033i.m(sb, Arrays.toString(strArr), "."));
                        }
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            zipFile = (ZipFile) b3.f4977b;
                            if (i3 < 5) {
                                pVar.d("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (c3.exists() || c3.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) b3.f4978c);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(c3);
                                            } catch (FileNotFoundException unused) {
                                                fileOutputStream2 = null;
                                                m1.c.a(inputStream2);
                                                m1.c.a(fileOutputStream2);
                                                i3 = i4;
                                            } catch (IOException unused2) {
                                                fileOutputStream2 = null;
                                                m1.c.a(inputStream2);
                                                m1.c.a(fileOutputStream2);
                                                i3 = i4;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                m1.c.a(inputStream);
                                                m1.c.a(fileOutputStream);
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
                                            long j3 = 0;
                                            while (true) {
                                                int read = inputStream2.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                fileOutputStream2.write(bArr, 0, read);
                                                j3 += read;
                                            }
                                            fileOutputStream2.flush();
                                            fileOutputStream2.getFD().sync();
                                            if (j3 == c3.length()) {
                                                m1.c.a(inputStream2);
                                                m1.c.a(fileOutputStream2);
                                                c3.setReadable(true, false);
                                                c3.setExecutable(true, false);
                                                c3.setWritable(true);
                                                break;
                                            }
                                            m1.c.a(inputStream2);
                                            m1.c.a(fileOutputStream2);
                                        } catch (FileNotFoundException unused5) {
                                            m1.c.a(inputStream2);
                                            m1.c.a(fileOutputStream2);
                                            i3 = i4;
                                        } catch (IOException unused6) {
                                            m1.c.a(inputStream2);
                                            m1.c.a(fileOutputStream2);
                                            i3 = i4;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                            fileOutputStream = fileOutputStream2;
                                            m1.c.a(inputStream);
                                            m1.c.a(fileOutputStream);
                                            throw th;
                                        }
                                    }
                                } catch (IOException unused7) {
                                }
                                i3 = i4;
                            } else if (((C0.f) pVar.f165d) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c0322a = b3;
                        if (c0322a != null) {
                            try {
                                ((ZipFile) c0322a.f4977b).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = c3.getAbsolutePath();
                cVar3.getClass();
                System.load(absolutePath);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                pVar.d("%s (%s) was re-linked!", PluginErrorDetails.Platform.FLUTTER, null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j3);
    }

    public void maybeResizeSurfaceView(int i3, int i4) {
        boolean z;
        Iterator<io.flutter.embedding.engine.renderer.l> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            View view = ((E1.r) it.next()).f379a.f389e;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z2 = true;
                if (view.getHeight() != i4) {
                    layoutParams.height = i4;
                    z = true;
                } else {
                    z = false;
                }
                if (view.getWidth() != i3) {
                    layoutParams.width = i3;
                } else {
                    z2 = z;
                }
                if (z2) {
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
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        rVar.f9311s.clear();
        rVar.f9312t.clear();
    }

    public void onDisplayOverlaySurface(int i3, int i4, int i5, int i6, int i7) {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = rVar.f9307n;
        if (sparseArray.get(i3) == null) {
            throw new IllegalStateException(AbstractC0033i.i(i3, "The overlay surface (id:", ") doesn't exist"));
        }
        rVar.h();
        View view = (C1045c) sparseArray.get(i3);
        if (view.getParent() == null) {
            rVar.f9298d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        rVar.f9311s.add(Integer.valueOf(i3));
    }

    public void onDisplayPlatformView(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        rVar.h();
        SparseArray sparseArray = rVar.f9305l;
        io.flutter.plugin.platform.g gVar = (io.flutter.plugin.platform.g) sparseArray.get(i3);
        if (gVar == null) {
            return;
        }
        SparseArray sparseArray2 = rVar.f9306m;
        if (sparseArray2.get(i3) == null) {
            View view = gVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = rVar.f9297c;
            K1.b bVar = new K1.b(activity, activity.getResources().getDisplayMetrics().density, rVar.f9296b);
            bVar.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.l(rVar, i3, 0));
            sparseArray2.put(i3, bVar);
            view.setImportantForAccessibility(4);
            bVar.addView(view);
            rVar.f9298d.addView(bVar);
        }
        K1.b bVar2 = (K1.b) sparseArray2.get(i3);
        bVar2.f869a = flutterMutatorsStack;
        bVar2.f871c = i4;
        bVar2.f872d = i5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7, 51);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        bVar2.setLayoutParams(layoutParams);
        bVar2.setWillNotDraw(false);
        bVar2.setVisibility(0);
        bVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9);
        View view2 = ((io.flutter.plugin.platform.g) sparseArray.get(i3)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        rVar.f9312t.add(Integer.valueOf(i3));
    }

    public void onDisplayPlatformView2(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        SurfaceControl surfaceControl;
        boolean isValid;
        SurfaceControl.Transaction alpha;
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (qVar.a(i3)) {
            K1.b bVar = (K1.b) qVar.f9287j.get(i3);
            bVar.f869a = flutterMutatorsStack;
            bVar.f871c = i4;
            bVar.f872d = i5;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7, 51);
            layoutParams.leftMargin = i4;
            layoutParams.topMargin = i5;
            bVar.setLayoutParams(layoutParams);
            bVar.setWillNotDraw(false);
            bVar.setVisibility(0);
            bVar.bringToFront();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9, 51);
            View view = ((io.flutter.plugin.platform.g) qVar.f9286i.get(i3)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.bringToFront();
                if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    RectF rectF = new RectF(i4, i5, i6 + i4, i7 + i5);
                    Rect rect = new Rect();
                    rectF.roundOut(rect);
                    List<Path> finalClippingPaths = flutterMutatorsStack.getFinalClippingPaths();
                    if (finalClippingPaths != null && !finalClippingPaths.isEmpty()) {
                        RectF rectF2 = new RectF();
                        Iterator<Path> it = finalClippingPaths.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            it.next().computeBounds(rectF2, true);
                            Rect rect2 = new Rect();
                            rectF2.roundOut(rect2);
                            if (!rect.intersect(rect2)) {
                                rect.setEmpty();
                                break;
                            }
                        }
                    }
                    rect.offset(-i4, -i5);
                    if (rect.width() < 0 || rect.height() < 0) {
                        rect.setEmpty();
                    }
                    float finalOpacity = flutterMutatorsStack.getFinalOpacity();
                    surfaceControl = surfaceView.getSurfaceControl();
                    if (surfaceControl == null) {
                        HashSet hashSet = qVar.f9292p;
                        if (hashSet.contains(Integer.valueOf(i3))) {
                            return;
                        }
                        hashSet.add(Integer.valueOf(i3));
                        surfaceView.getHolder().addCallback(new io.flutter.plugin.platform.p(qVar, surfaceView, finalOpacity, rect, i3));
                        return;
                    }
                    isValid = surfaceControl.isValid();
                    if (!isValid) {
                        surfaceView.getId();
                        return;
                    }
                    SurfaceControl.Transaction h3 = Wo.h();
                    qVar.f9289l.add(h3);
                    alpha = h3.setAlpha(surfaceControl, finalOpacity);
                    alpha.setCrop(surfaceControl, rect);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z = false;
        if (!rVar.f9309q || !rVar.f9312t.isEmpty()) {
            if (rVar.f9309q) {
                C0034j c0034j = rVar.f9298d.f388d;
                if (c0034j != null ? c0034j.e() : false) {
                    z = true;
                }
            }
            rVar.e(z);
            return;
        }
        rVar.f9309q = false;
        t tVar = rVar.f9298d;
        n nVar = new n(23, rVar);
        C0034j c0034j2 = tVar.f388d;
        if (c0034j2 == null || (r3 = tVar.f) == 0) {
            return;
        }
        tVar.f389e = r3;
        tVar.f = null;
        io.flutter.embedding.engine.renderer.j jVar = tVar.f392i.f9100b;
        if (jVar != null) {
            r3.c();
            jVar.a(new E1.s(tVar, jVar, nVar));
            return;
        }
        c0034j2.a();
        C0034j c0034j3 = tVar.f388d;
        if (c0034j3 != null) {
            c0034j3.f357a.close();
            tVar.removeView(tVar.f388d);
            tVar.f388d = null;
        }
        nVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i3, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i3, i4);
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

    public void onVsync(long j3, long j4, long j5) {
        nativeOnVsync(j3, j4, j5);
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

    public void registerImageTexture(long j3, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(textureRegistry$ImageConsumer), z);
    }

    public void registerTexture(long j3, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(kVar);
    }

    public void removeResizingFlutterUiListener(io.flutter.embedding.engine.renderer.l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(lVar);
    }

    public void requestDartDeferredLibrary(int i3) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j3);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
    }

    public void setAccessibilityFeatures(int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i3);
        }
    }

    public void setAccessibilityFeaturesInNative(int i3) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i3);
    }

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(Q1.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(j jVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = jVar;
    }

    public void setPlatformViewsController(r rVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = rVar;
    }

    public void setPlatformViewsController2(q qVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = qVar;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
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

    public void setSemanticsTreeEnabled(boolean z) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar == null || z) {
            return;
        }
        io.flutter.view.i iVar = (io.flutter.view.i) ((c) kVar).f9337a;
        iVar.f9427g.clear();
        io.flutter.view.h hVar = iVar.f9429i;
        if (hVar != null) {
            iVar.h(hVar.f9395b, 65536);
        }
        iVar.f9429i = null;
        iVar.f9435p = null;
        AccessibilityEvent e3 = iVar.e(0, 2048);
        e3.setContentChangeTypes(1);
        iVar.i(e3);
    }

    public void setSettingsChannel(m mVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = mVar;
    }

    public void setViewportMetrics(float f, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, iArr, iArr2, iArr3, i18, i19, i20, i21, i22, i23, i24, i25);
    }

    public void showOverlaySurface2() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (qVar.o == null) {
            return;
        }
        SurfaceControl.Transaction h3 = Wo.h();
        qVar.f9289l.add(h3);
        h3.setVisibility(qVar.o, true);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j3);
        Long l3 = nativeSpawn.nativeShellHolderId;
        if ((l3 == null || l3.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("");
        }
        synchronized (qVar) {
            qVar.f9290m.clear();
            qVar.f9290m.addAll(qVar.f9289l);
            qVar.f9289l.clear();
        }
    }

    public void unregisterTexture(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j3);
    }

    public void updateDisplayMetrics(int i3, float f, float f3, float f4) {
        displayWidth = f;
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

    public void dispatchSemanticsAction(int i3, f fVar, Object obj) {
        ByteBuffer byteBuffer;
        int i4;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = P1.t.INSTANCE.encodeMessage(obj);
            i4 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i4 = 0;
        }
        dispatchSemanticsAction(i3, fVar.f9362a, byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i3, int i4, ByteBuffer byteBuffer, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i3, i4, byteBuffer, i5);
    }
}
