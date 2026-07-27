package io.flutter.embedding.engine;

import A2.c;
import A2.d;
import A2.e;
import B0.o;
import B0.t;
import B4.i;
import E.C0028c;
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
import b2.AbstractC0279e;
import c1.f;
import e5.g;
import h2.C0482c;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.platform.b;
import io.flutter.plugin.platform.l;
import io.flutter.plugin.platform.m;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.q;
import io.flutter.view.r;
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
import w2.AbstractActivityC1515c;
import w2.C1518f;
import x2.InterfaceC1539b;
import x2.InterfaceC1546i;
import x2.InterfaceC1547j;
import y2.C1559d;
import y2.C1561f;
import y2.C1564i;
import y2.InterfaceC1565j;
import z2.a;

/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static InterfaceC1547j asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private InterfaceC1546i accessibilityDelegate;
    private a deferredComponentManager;
    private I2.a localizationPlugin;
    private Long nativeShellHolderId;
    private InterfaceC1565j platformMessageHandler;
    private m platformViewsController;
    private l platformViewsController2;
    private G2.l settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<InterfaceC1539b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<j> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<k> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        InterfaceC1547j interfaceC1547j = asyncWaitForVsyncDelegate;
        if (interfaceC1547j == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.a aVar = (io.flutter.view.a) interfaceC1547j;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        r rVar = (r) aVar.f10266a;
        q qVar = rVar.f10400c;
        if (qVar != null) {
            qVar.f10394a = j2;
            rVar.f10400c = null;
        } else {
            qVar = new q(rVar, j2);
        }
        choreographer.postFrameCallback(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j2) {
        c cVar;
        C0482c c0482c = 0;
        c0482c = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        f fVar = new f(j2);
        e eVar = new e();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i2 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            eVar.f35d = options.outMimeType;
            eVar.f37f = options.outHeight;
            eVar.f38g = options.outWidth;
        } catch (Exception e3) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e3);
        }
        if ("image/heif".equals(eVar.f35d)) {
            try {
                d dVar = new d(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(dVar);
                g.t(eVar, mediaExtractor);
            } catch (Exception e6) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e6);
            }
            nativeImageHeaderCallback(fVar.f4904a, eVar.f32a, eVar.f33b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    Q.g gVar = new Q.g(byteArrayInputStream);
                    Q.c c2 = gVar.c("Orientation");
                    if (c2 != null) {
                        try {
                            i2 = c2.e(gVar.f2467f);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    eVar.f36e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e7) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e7);
            }
        }
        if ("image/heif".equals(eVar.f35d)) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 36) {
                cVar = new c(c0482c, 0);
            } else if (i3 < 36) {
                cVar = new c(c0482c, 1);
            }
            c0482c = cVar;
        }
        if (c0482c == 0) {
            c0482c = new C0482c(1, fVar);
        }
        return c0482c.e(byteBuffer, eVar);
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
        H2.e eVar;
        InterfaceC1565j interfaceC1565j = this.platformMessageHandler;
        if (interfaceC1565j == null || (eVar = (H2.e) ((C1564i) interfaceC1565j).f12374f.remove(Integer.valueOf(i2))) == null) {
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
        } catch (Exception e6) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e6);
        }
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

    private native void nativeDispatchSemanticsAction(long j2, int i2, int i3, ByteBuffer byteBuffer, int i6);

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

    private native void nativeMarkTextureFrameAvailable(long j2, long j6);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j6, long j7);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j6, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z);

    private native void nativeRegisterTexture(long j2, long j6, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j6);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z);

    private native void nativeSetViewportMetrics(long j2, float f3, int i2, int i3, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26);

    private native FlutterJNI nativeSpawn(long j2, String str, String str2, String str3, List<String> list, long j6);

    private native void nativeSurfaceChanged(long j2, int i2, int i3);

    private native void nativeSurfaceCreated(long j2, Surface surface);

    private native void nativeSurfaceDestroyed(long j2);

    private native void nativeSurfaceWindowChanged(long j2, Surface surface);

    private native void nativeUnregisterTexture(long j2, long j6);

    private native void nativeUpdateDisplayMetrics(long j2);

    private native void nativeUpdateJavaAssetManager(long j2, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f3);

    private void onPreEngineRestart() {
        Iterator<InterfaceC1539b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        InterfaceC1546i interfaceC1546i = this.accessibilityDelegate;
        if (interfaceC1546i != null) {
            ((io.flutter.view.g) ((io.flutter.view.a) interfaceC1546i).f10266a).f10368l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        InterfaceC1546i interfaceC1546i = this.accessibilityDelegate;
        if (interfaceC1546i != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.g gVar = (io.flutter.view.g) ((io.flutter.view.a) interfaceC1546i).f10266a;
            gVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.e a6 = gVar.a(byteBuffer.getInt());
                a6.f10297c = byteBuffer.getInt();
                a6.f10298d = io.flutter.view.g.c(byteBuffer, strArr);
                a6.f10299e = io.flutter.view.g.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        InterfaceC1546i interfaceC1546i = this.accessibilityDelegate;
        if (interfaceC1546i != null) {
            ((io.flutter.view.a) interfaceC1546i).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(InterfaceC1539b interfaceC1539b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC1539b);
    }

    public void addIsDisplayingFlutterUiListener(j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(jVar);
    }

    public void addResizingFlutterUiListener(k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(kVar);
    }

    public void applyTransactions() {
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("");
        }
        lVar.getClass();
        SurfaceControl.Transaction h3 = io.flutter.plugin.platform.j.h();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = lVar.f10229i;
            if (i2 >= arrayList.size()) {
                h3.apply();
                arrayList.clear();
                return;
            } else {
                h3 = h3.merge(io.flutter.plugin.platform.j.j(arrayList.get(i2)));
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
        I2.a aVar = this.localizationPlugin;
        aVar.getClass();
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            AbstractActivityC1515c abstractActivityC1515c = aVar.f1270b;
            if (i3 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC1515c.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Locale locale3 = locales.get(i6);
                    String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        language = language + "-" + locale3.getScript();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        language = language + "-" + locale3.getCountry();
                    }
                    arrayList2.add(C.a.s(language));
                    C.a.u();
                    arrayList2.add(C.a.s(locale3.getLanguage()));
                    C.a.u();
                    arrayList2.add(C.a.s(locale3.getLanguage() + "-*"));
                }
                locale2 = Locale.lookup(arrayList2, arrayList);
            } else {
                LocaleList locales2 = abstractActivityC1515c.getResources().getConfiguration().getLocales();
                int i7 = 0;
                loop2: while (i7 < locales2.size()) {
                    Locale locale4 = locales2.get(i7);
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
        m mVar = this.platformViewsController;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        b bVar = new b(mVar.f10237c.getContext(), mVar.f10237c.getWidth(), mVar.f10237c.getHeight(), 2);
        bVar.f10210h = mVar.f10242h;
        int i2 = mVar.f10249o;
        mVar.f10249o = i2 + 1;
        mVar.f10247m.put(i2, bVar);
        return new FlutterOverlaySurface(i2, bVar.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (lVar.f10231k == null) {
            SurfaceControl.Builder g6 = io.flutter.plugin.platform.j.g();
            g6.setBufferSize(lVar.f10223c.getWidth(), lVar.f10223c.getHeight());
            g6.setFormat(1);
            g6.setName("Flutter Overlay Surface");
            g6.setOpaque(false);
            g6.setHidden(false);
            build = g6.build();
            rootSurfaceControl = lVar.f10223c.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            buildReparentTransaction.apply();
            lVar.f10231k = io.flutter.plugin.platform.j.f(build);
            lVar.f10232l = build;
        }
        return new FlutterOverlaySurface(0, lVar.f10231k);
    }

    public SurfaceControl.Transaction createTransaction() {
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h3 = io.flutter.plugin.platform.j.h();
        lVar.f10229i.add(h3);
        return h3;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = lVar.f10231k;
        if (surface != null) {
            surface.release();
            lVar.f10231k = null;
            lVar.f10232l = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        mVar.f();
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

    public void dispatchSemanticsAction(int i2, io.flutter.view.d dVar) {
        dispatchSemanticsAction(i2, dVar, null);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h3 = io.flutter.plugin.platform.j.h();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = lVar.f10230j;
            if (i2 >= arrayList.size()) {
                arrayList.clear();
                lVar.f10223c.invalidate();
                rootSurfaceControl = lVar.f10223c.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(h3);
                return;
            }
            h3 = h3.merge(io.flutter.plugin.platform.j.j(arrayList.get(i2)));
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f3, int i2) {
        G2.k kVar;
        G2.l lVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (lVar != null) {
            i iVar = lVar.f979a;
            G2.k kVar2 = (G2.k) iVar.f312c;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) iVar.f311b;
            if (kVar2 == null) {
                iVar.f312c = (G2.k) concurrentLinkedQueue.poll();
            }
            while (true) {
                kVar = (G2.k) iVar.f312c;
                if (kVar == null || kVar.f977a >= i2) {
                    break;
                }
                iVar.f312c = (G2.k) concurrentLinkedQueue.poll();
            }
            if (kVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (kVar.f977a != i2) {
                    StringBuilder i3 = AbstractC0279e.i(i2, "Cannot find config with generation: ", ", the oldest config is now: ");
                    i3.append(((G2.k) iVar.f312c).f977a);
                    Log.e("SettingsChannel", i3.toString());
                }
                if (kVar != null) {
                    displayMetrics = kVar.f978b;
                }
            }
            kVar = null;
            if (kVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f3, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i2 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        C1561f c1561f;
        boolean z;
        InterfaceC1565j interfaceC1565j = this.platformMessageHandler;
        if (interfaceC1565j == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        C1564i c1564i = (C1564i) interfaceC1565j;
        synchronized (c1564i.f12372d) {
            try {
                c1561f = (C1561f) c1564i.f12370b.get(str);
                z = c1564i.f12373e.get() && c1561f == null;
                if (z) {
                    if (!c1564i.f12371c.containsKey(str)) {
                        c1564i.f12371c.put(str, new LinkedList());
                    }
                    ((List) c1564i.f12371c.get(str)).add(new C1559d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        c1564i.a(str, c1561f, byteBuffer, i2, j2);
    }

    public void hideOverlaySurface2() {
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (lVar.f10232l == null) {
            return;
        }
        SurfaceControl.Transaction h3 = io.flutter.plugin.platform.j.h();
        lVar.f10229i.add(h3);
        h3.setVisibility(lVar.f10232l, false);
    }

    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        AbstractC0279e.o(lVar.f10227g.get(i2));
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

    /* JADX WARN: Code restructure failed: missing block: B:108:0x018c, code lost:
    
        if (r12 != null) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadLibrary(Context context) {
        t tVar;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C0028c c0028c = new C0028c(0);
        B0.i iVar = new B0.i(2);
        iVar.f156e = c0028c;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        iVar.d("Beginning load of %s...", PluginErrorDetails.Platform.FLUTTER);
        l1.j jVar = (l1.j) iVar.f154c;
        HashSet hashSet = (HashSet) iVar.f153b;
        if (hashSet.contains(PluginErrorDetails.Platform.FLUTTER)) {
            iVar.d("%s already loaded previously!", PluginErrorDetails.Platform.FLUTTER);
        } else {
            try {
                jVar.getClass();
                System.loadLibrary(PluginErrorDetails.Platform.FLUTTER);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                iVar.d("%s (%s) was loaded normally!", PluginErrorDetails.Platform.FLUTTER, null);
            } catch (UnsatisfiedLinkError e3) {
                iVar.d("Loading the library normally failed: %s", Log.getStackTraceString(e3));
                iVar.d("%s (%s) was not loaded normally, re-linking...", PluginErrorDetails.Platform.FLUTTER, null);
                File b6 = iVar.b(context);
                if (!b6.exists()) {
                    File dir = context.getDir("lib", 0);
                    File b7 = iVar.b(context);
                    jVar.getClass();
                    File[] listFiles = dir.listFiles(new L0.a(System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER)));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(b7.getAbsolutePath())) {
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
                    ((W1.e) iVar.f155d).getClass();
                    try {
                        t q5 = W1.e.q(context, strArr2, mapLibraryName, iVar);
                        try {
                            if (q5 == null) {
                                try {
                                    strArr = W1.e.r(context, mapLibraryName);
                                } catch (Exception e6) {
                                    strArr = new String[]{e6.toString()};
                                }
                                StringBuilder sb = new StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new C1.b(AbstractC0279e.h(sb, Arrays.toString(strArr), "."));
                            }
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 + 1;
                                zipFile = (ZipFile) q5.f207b;
                                if (i2 < 5) {
                                    iVar.d("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (b6.exists() || b6.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) q5.f208c);
                                            } catch (FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (IOException unused2) {
                                                inputStream2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new FileOutputStream(b6);
                                                try {
                                                    byte[] bArr = new byte[Base64Utils.IO_BUFFER_SIZE];
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
                                                    if (j2 == b6.length()) {
                                                        W1.e.m(inputStream2);
                                                        W1.e.m(fileOutputStream2);
                                                        b6.setReadable(true, false);
                                                        b6.setExecutable(true, false);
                                                        b6.setWritable(true);
                                                        break;
                                                    }
                                                    W1.e.m(inputStream2);
                                                    W1.e.m(fileOutputStream2);
                                                } catch (FileNotFoundException unused3) {
                                                    W1.e.m(inputStream2);
                                                    W1.e.m(fileOutputStream2);
                                                    i2 = i3;
                                                } catch (IOException unused4) {
                                                    W1.e.m(inputStream2);
                                                    W1.e.m(fileOutputStream2);
                                                    i2 = i3;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    W1.e.m(inputStream);
                                                    W1.e.m(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                W1.e.m(inputStream2);
                                                W1.e.m(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused6) {
                                                fileOutputStream2 = null;
                                                W1.e.m(inputStream2);
                                                W1.e.m(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                W1.e.m(inputStream);
                                                W1.e.m(fileOutputStream);
                                                throw th;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i2 = i3;
                                } else if (((C0028c) iVar.f156e) != null) {
                                    lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            tVar = q5;
                            if (tVar != null) {
                                try {
                                    ZipFile zipFile2 = (ZipFile) tVar.f207b;
                                    if (zipFile2 != null) {
                                        zipFile2.close();
                                    }
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        tVar = null;
                    }
                }
                String absolutePath = b6.getAbsolutePath();
                jVar.getClass();
                System.load(absolutePath);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                iVar.d("%s (%s) was re-linked!", PluginErrorDetails.Platform.FLUTTER, null);
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
        boolean z;
        Iterator<k> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            View view = ((w2.k) it.next()).f12164a.f12174e;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z5 = true;
                if (view.getHeight() != i3) {
                    layoutParams.height = i3;
                    z = true;
                } else {
                    z = false;
                }
                if (view.getWidth() != i2) {
                    layoutParams.width = i2;
                } else {
                    z5 = z;
                }
                if (z5) {
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
        m mVar = this.platformViewsController;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        mVar.f10252r.clear();
        mVar.f10253s.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i6, int i7, int i8) {
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = mVar.f10247m;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException(o.g(i2, "The overlay surface (id:", ") doesn't exist"));
        }
        mVar.h();
        View view = (b) sparseArray.get(i2);
        if (view.getParent() == null) {
            mVar.f10237c.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i6;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        mVar.f10252r.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        mVar.h();
        AbstractC0279e.o(mVar.f10245k.get(i2));
    }

    public void onDisplayPlatformView2(int i2, int i3, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        AbstractC0279e.o(lVar.f10227g.get(i2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public void onEndFrame() {
        ?? r32;
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z = false;
        if (!mVar.f10250p || !mVar.f10253s.isEmpty()) {
            if (mVar.f10250p) {
                C1518f c1518f = mVar.f10237c.f12173d;
                if (c1518f != null ? c1518f.e() : false) {
                    z = true;
                }
            }
            mVar.g(z);
            return;
        }
        mVar.f10250p = false;
        w2.m mVar2 = mVar.f10237c;
        B2.b bVar = new B2.b(18, mVar);
        C1518f c1518f2 = mVar2.f12173d;
        if (c1518f2 == null || (r32 = mVar2.f12175f) == 0) {
            return;
        }
        mVar2.f12174e = r32;
        mVar2.f12175f = null;
        io.flutter.embedding.engine.renderer.i iVar = mVar2.f12178i.f10083b;
        if (iVar != null) {
            r32.c();
            iVar.a(new w2.l(mVar2, iVar, bVar));
            return;
        }
        c1518f2.b();
        C1518f c1518f3 = mVar2.f12173d;
        if (c1518f3 != null) {
            c1518f3.f12145a.close();
            mVar2.removeView(mVar2.f12173d);
            mVar2.f12173d = null;
        }
        bVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<j> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<j> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
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

    public void onVsync(long j2, long j6, long j7) {
        nativeOnVsync(j2, j6, j7);
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

    public void removeEngineLifecycleListener(InterfaceC1539b interfaceC1539b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC1539b);
    }

    public void removeIsDisplayingFlutterUiListener(j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(jVar);
    }

    public void removeResizingFlutterUiListener(k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(kVar);
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

    public void setAccessibilityDelegate(InterfaceC1546i interfaceC1546i) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = interfaceC1546i;
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

    public void setAsyncWaitForVsyncDelegate(InterfaceC1547j interfaceC1547j) {
        asyncWaitForVsyncDelegate = interfaceC1547j;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(I2.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(InterfaceC1565j interfaceC1565j) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = interfaceC1565j;
    }

    public void setPlatformViewsController(m mVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = mVar;
    }

    public void setPlatformViewsController2(l lVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = lVar;
    }

    public void setRefreshRateFPS(float f3) {
        refreshRateFPS = f3;
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
        InterfaceC1546i interfaceC1546i = this.accessibilityDelegate;
        if (interfaceC1546i == null || z) {
            return;
        }
        io.flutter.view.g gVar = (io.flutter.view.g) ((io.flutter.view.a) interfaceC1546i).f10266a;
        gVar.f10363g.clear();
        io.flutter.view.f fVar = gVar.f10365i;
        if (fVar != null) {
            gVar.g(fVar.f10327b, 65536);
        }
        gVar.f10365i = null;
        gVar.f10371o = null;
        AccessibilityEvent d6 = gVar.d(0, 2048);
        d6.setContentChangeTypes(1);
        gVar.h(d6);
    }

    public void setSettingsChannel(G2.l lVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = lVar;
    }

    public void setViewportMetrics(float f3, int i2, int i3, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f3, i2, i3, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, iArr, iArr2, iArr3, i19, i20, i21, i22, i23, i24, i25, i26);
    }

    public void showOverlaySurface2() {
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (lVar.f10232l == null) {
            return;
        }
        SurfaceControl.Transaction h3 = io.flutter.plugin.platform.j.h();
        lVar.f10229i.add(h3);
        h3.setVisibility(lVar.f10232l, true);
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
        l lVar = this.platformViewsController2;
        if (lVar == null) {
            throw new RuntimeException("");
        }
        synchronized (lVar) {
            lVar.f10230j.clear();
            lVar.f10230j.addAll(lVar.f10229i);
            lVar.f10229i.clear();
        }
    }

    public void unregisterTexture(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j2);
    }

    public void updateDisplayMetrics(int i2, float f3, float f6, float f7) {
        displayWidth = f3;
        displayHeight = f6;
        displayDensity = f7;
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

    public void dispatchSemanticsAction(int i2, io.flutter.view.d dVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = H2.r.INSTANCE.encodeMessage(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, dVar.f10294a, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i6);
    }
}
