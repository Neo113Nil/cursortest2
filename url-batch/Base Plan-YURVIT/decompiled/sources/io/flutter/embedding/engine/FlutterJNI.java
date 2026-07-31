package io.flutter.embedding.engine;

import B0.C0000a;
import B0.C0008i;
import F.C0032n;
import J.g;
import N.P;
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
import androidx.datastore.preferences.protobuf.k0;
import androidx.lifecycle.p;
import d0.C0120a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.a;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.c;
import io.flutter.view.f;
import io.flutter.view.h;
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
import k0.C0191h;
import k0.o;
import l0.b;
import l0.k;
import l0.l;
import m0.d;
import m0.i;
import m0.j;
import n0.InterfaceC0208a;
import o0.C0211b;
import o0.C0212c;
import o0.C0213d;
import o0.C0214e;
import u0.m;
import u0.n;
import v0.InterfaceC0240e;
import w0.AbstractC0247a;
import w0.C0248b;

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
    private InterfaceC0208a deferredComponentManager;
    private C0248b localizationPlugin;
    private Long nativeShellHolderId;
    private j platformMessageHandler;
    private io.flutter.plugin.platform.l platformViewsController;
    private io.flutter.plugin.platform.k platformViewsController2;
    private n settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.j> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.k> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        c cVar = (c) lVar;
        cVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        t tVar = (t) cVar.f2510a;
        s sVar = tVar.f2638c;
        if (sVar != null) {
            sVar.f2632a = j2;
            tVar.f2638c = null;
        } else {
            sVar = new s(tVar, j2);
        }
        choreographer.postFrameCallback(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j2) {
        C0212c c0212c;
        C0211b c0211b = 0;
        c0211b = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        l0.j jVar = new l0.j(j2);
        C0214e c0214e = new C0214e();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i2 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            c0214e.f2921d = options.outMimeType;
            c0214e.f2923f = options.outHeight;
            c0214e.f2924g = options.outWidth;
        } catch (Exception e2) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e2);
        }
        if ("image/heif".equals(c0214e.f2921d)) {
            try {
                C0213d c0213d = new C0213d(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(c0213d);
                k0.A(c0214e, mediaExtractor);
            } catch (Exception e3) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
            }
            nativeImageHeaderCallback(jVar.f2817a, c0214e.f2918a, c0214e.f2919b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    J.c c2 = gVar.c("Orientation");
                    if (c2 != null) {
                        try {
                            i2 = c2.e(gVar.f583e);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    c0214e.f2922e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e4) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e4);
            }
        }
        if ("image/heif".equals(c0214e.f2921d)) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 36) {
                c0212c = new C0212c(c0211b, 0);
            } else if (i3 < 36) {
                c0212c = new C0212c(c0211b, 1);
            }
            c0211b = c0212c;
        }
        if (c0211b == 0) {
            c0211b = new C0211b(0, jVar);
        }
        return c0211b.d(byteBuffer, c0214e);
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
        InterfaceC0240e interfaceC0240e;
        j jVar = this.platformMessageHandler;
        if (jVar == null || (interfaceC0240e = (InterfaceC0240e) ((i) jVar).f2885j.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            interfaceC0240e.a(byteBuffer);
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
            it.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.i) ((c) kVar).f2510a).f2607l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.i iVar = (io.flutter.view.i) ((c) kVar).f2510a;
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.g a2 = iVar.a(byteBuffer.getInt());
                a2.f2541c = byteBuffer.getInt();
                a2.f2542d = io.flutter.view.i.c(byteBuffer, strArr);
                a2.f2543e = io.flutter.view.i.c(byteBuffer, strArr);
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

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(jVar);
    }

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(kVar);
    }

    public void applyTransactions() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = kVar.f2475m;
        SurfaceControl.Transaction i2 = p.i();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i2 = i2.merge(p.k(arrayList.get(i3)));
        }
        i2.apply();
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

    public void cleanupMessageData(long j2) {
        nativeCleanupMessageData(j2);
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
        Context context = this.localizationPlugin.f3100b;
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i3 = 0; i3 < size; i3++) {
                Locale locale3 = locales.get(i3);
                String language = locale3.getLanguage();
                if (!locale3.getScript().isEmpty()) {
                    language = language + "-" + locale3.getScript();
                }
                if (!locale3.getCountry().isEmpty()) {
                    language = language + "-" + locale3.getCountry();
                }
                arrayList2.add(AbstractC0247a.b(language));
                AbstractC0247a.c();
                arrayList2.add(AbstractC0247a.b(locale3.getLanguage()));
                AbstractC0247a.c();
                arrayList2.add(AbstractC0247a.b(locale3.getLanguage() + "-*"));
            }
            locale2 = Locale.lookup(arrayList2, arrayList);
        } else {
            LocaleList locales2 = context.getResources().getConfiguration().getLocales();
            int i4 = 0;
            loop2: while (i4 < locales2.size()) {
                Locale locale4 = locales2.get(i4);
                int size2 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i5);
                    i5++;
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
        Context context = lVar.f2482g.getContext();
        int width = lVar.f2482g.getWidth();
        int height = lVar.f2482g.getHeight();
        a aVar = lVar.f2487l;
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(context, width, height, 2);
        bVar.f2457l = aVar;
        int i2 = lVar.f2494s;
        lVar.f2494s = i2 + 1;
        lVar.f2492q.put(i2, bVar);
        return new FlutterOverlaySurface(i2, bVar.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (kVar.f2477o == null) {
            SurfaceControl.Builder h2 = p.h();
            h2.setBufferSize(kVar.f2469g.getWidth(), kVar.f2469g.getHeight());
            h2.setFormat(1);
            h2.setName("Flutter Overlay Surface");
            h2.setOpaque(false);
            h2.setHidden(false);
            build = h2.build();
            rootSurfaceControl = kVar.f2469g.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            kVar.f2477o = p.g(build);
            kVar.f2478p = build;
        }
        return new FlutterOverlaySurface(0, kVar.f2477o);
    }

    public SurfaceControl.Transaction createTransaction() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction i2 = p.i();
        kVar.f2475m.add(i2);
        return i2;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = kVar.f2477o;
        if (surface != null) {
            surface.release();
            kVar.f2477o = null;
            kVar.f2478p = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        lVar.c();
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

    public void dispatchSemanticsAction(int i2, f fVar) {
        dispatchSemanticsAction(i2, fVar, null);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = kVar.f2476n;
        SurfaceControl.Transaction i2 = p.i();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i2 = i2.merge(p.k(arrayList.get(i3)));
        }
        arrayList.clear();
        kVar.f2469g.invalidate();
        rootSurfaceControl = kVar.f2469g.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(i2);
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
        m mVar;
        n nVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (nVar != null) {
            C0008i c0008i = nVar.f3036a;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0008i.f84f;
            if (((m) c0008i.f85g) == null) {
                c0008i.f85g = (m) concurrentLinkedQueue.poll();
            }
            while (true) {
                mVar = (m) c0008i.f85g;
                if (mVar == null || mVar.f3034a >= i2) {
                    break;
                }
                c0008i.f85g = (m) concurrentLinkedQueue.poll();
            }
            if (mVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (mVar.f3034a != i2) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", the oldest config is now: " + ((m) c0008i.f85g).f3034a);
                }
                if (mVar != null) {
                    displayMetrics = mVar.f3035b;
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
        m0.f fVar;
        boolean z2;
        j jVar = this.platformMessageHandler;
        if (jVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        i iVar = (i) jVar;
        synchronized (iVar.f2883h) {
            try {
                fVar = (m0.f) iVar.f2881f.get(str);
                z2 = iVar.f2884i.get() && fVar == null;
                if (z2) {
                    if (!iVar.f2882g.containsKey(str)) {
                        iVar.f2882g.put(str, new LinkedList());
                    }
                    ((List) iVar.f2882g.get(str)).add(new d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        iVar.a(str, fVar, byteBuffer, i2, j2);
    }

    public void hideOverlaySurface2() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (kVar.f2478p == null) {
            return;
        }
        SurfaceControl.Transaction i2 = p.i();
        i2.setVisibility(kVar.f2478p, false);
        i2.apply();
    }

    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (kVar.f2473k.get(i2) != null) {
            throw new ClassCastException();
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i2, ByteBuffer byteBuffer, int i3) {
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
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i2, byteBuffer, i3);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
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

    public void loadLibrary(Context context) {
        P f2;
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        long j2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        l0.i iVar = new l0.i();
        C0000a c0000a = new C0000a(18);
        C0000a c0000a2 = new C0000a(17);
        C0032n c0032n = new C0032n();
        c0032n.f409a = new HashSet();
        c0032n.f410b = c0000a;
        c0032n.f411c = c0000a2;
        c0032n.f412d = iVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        c0032n.g("Beginning load of %s...", "flutter");
        C0000a c0000a3 = (C0000a) c0032n.f410b;
        HashSet hashSet = (HashSet) c0032n.f409a;
        if (hashSet.contains("flutter")) {
            c0032n.g("%s already loaded previously!", "flutter");
        } else {
            P p2 = null;
            try {
                c0000a3.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                c0032n.g("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e2) {
                c0032n.g("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                c0032n.g("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File f3 = c0032n.f(context);
                if (!f3.exists()) {
                    File dir = context.getDir("lib", 0);
                    File f4 = c0032n.f(context);
                    c0000a3.getClass();
                    File[] listFiles = dir.listFiles(new C0120a(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(f4.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    C0000a c0000a4 = (C0000a) c0032n.f411c;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    c0000a4.getClass();
                    try {
                        f2 = C0000a.f(context, strArr2, mapLibraryName, c0032n);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (f2 == null) {
                            try {
                                strArr = C0000a.g(context, mapLibraryName);
                            } catch (Exception e3) {
                                strArr = new String[]{e3.toString()};
                            }
                            throw new D0.b(mapLibraryName, strArr2, strArr);
                        }
                        ZipFile zipFile = (ZipFile) f2.f698f;
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            if (i2 < 5) {
                                c0032n.g("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (f3.exists() || f3.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) f2.f699g);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(f3);
                                            } catch (FileNotFoundException unused) {
                                                fileOutputStream2 = null;
                                                C0000a.b(inputStream2);
                                                C0000a.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused2) {
                                                fileOutputStream2 = null;
                                                C0000a.b(inputStream2);
                                                C0000a.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                C0000a.b(inputStream);
                                                C0000a.b(fileOutputStream);
                                                throw th;
                                            }
                                            try {
                                                byte[] bArr = new byte[4096];
                                                j2 = 0;
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
                                            } catch (FileNotFoundException unused3) {
                                                C0000a.b(inputStream2);
                                                C0000a.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused4) {
                                                C0000a.b(inputStream2);
                                                C0000a.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = fileOutputStream2;
                                                C0000a.b(inputStream);
                                                C0000a.b(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused5) {
                                            inputStream2 = null;
                                        } catch (IOException unused6) {
                                            inputStream2 = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = null;
                                        }
                                        if (j2 == f3.length()) {
                                            C0000a.b(inputStream2);
                                            C0000a.b(fileOutputStream2);
                                            f3.setReadable(true, false);
                                            f3.setExecutable(true, false);
                                            f3.setWritable(true);
                                            break;
                                        }
                                        C0000a.b(inputStream2);
                                        C0000a.b(fileOutputStream2);
                                    }
                                } catch (IOException unused7) {
                                }
                                i2 = i3;
                            } else if (((l0.i) c0032n.f412d) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        p2 = f2;
                        if (p2 != null) {
                            try {
                                ((ZipFile) p2.f698f).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = f3.getAbsolutePath();
                c0000a3.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                c0032n.g("%s (%s) was re-linked!", "flutter", null);
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
        Iterator<io.flutter.embedding.engine.renderer.k> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            o oVar = ((k0.m) it.next()).f2709a;
            View view = oVar.f2724j;
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
                    oVar.f2719e.set(false);
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
        lVar.f2496v.clear();
        lVar.f2497w.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = lVar.f2492q;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        lVar.h();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i2);
        if (view.getParent() == null) {
            lVar.f2482g.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        lVar.f2496v.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        lVar.h();
        if (lVar.f2490o.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (kVar.f2473k.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!lVar.t || !lVar.f2497w.isEmpty()) {
            if (lVar.t) {
                C0191h c0191h = lVar.f2482g.f2723i;
                if (c0191h != null ? c0191h.e() : false) {
                    z2 = true;
                }
            }
            lVar.d(z2);
            return;
        }
        lVar.t = false;
        o oVar = lVar.f2482g;
        androidx.lifecycle.k kVar = new androidx.lifecycle.k(1, lVar);
        C0191h c0191h2 = oVar.f2723i;
        if (c0191h2 == null || (r3 = oVar.f2725k) == 0) {
            return;
        }
        oVar.f2724j = r3;
        oVar.f2725k = null;
        io.flutter.embedding.engine.renderer.i iVar = oVar.f2728n.f2776b;
        if (iVar != null) {
            r3.b();
            iVar.a(new k0.n(oVar, iVar, kVar));
            return;
        }
        c0191h2.a();
        C0191h c0191h3 = oVar.f2723i;
        if (c0191h3 != null) {
            c0191h3.f2690e.close();
            oVar.removeView(oVar.f2723i);
            oVar.f2723i = null;
        }
        kVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.j> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.j> it = this.flutterUiDisplayListeners.iterator();
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

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(jVar);
    }

    public void removeResizingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
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

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
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

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(InterfaceC0208a interfaceC0208a) {
        ensureRunningOnMainThread();
        if (interfaceC0208a != null) {
            interfaceC0208a.a();
        }
    }

    public void setLocalizationPlugin(C0248b c0248b) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0248b;
    }

    public void setPlatformMessageHandler(j jVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = jVar;
    }

    public void setPlatformViewsController(io.flutter.plugin.platform.l lVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = lVar;
    }

    public void setPlatformViewsController2(io.flutter.plugin.platform.k kVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = kVar;
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
        k kVar = this.accessibilityDelegate;
        if (kVar == null || z2) {
            return;
        }
        io.flutter.view.i iVar = (io.flutter.view.i) ((c) kVar).f2510a;
        iVar.f2602g.clear();
        h hVar = iVar.f2604i;
        if (hVar != null) {
            iVar.g(hVar.f2570b, 65536);
        }
        iVar.f2604i = null;
        iVar.f2610o = null;
        AccessibilityEvent d2 = iVar.d(0, 2048);
        d2.setContentChangeTypes(1);
        iVar.h(d2);
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
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (kVar.f2478p == null) {
            return;
        }
        SurfaceControl.Transaction i2 = p.i();
        i2.setVisibility(kVar.f2478p, true);
        i2.apply();
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
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("");
        }
        synchronized (kVar) {
            try {
                kVar.f2476n.clear();
                for (int i2 = 0; i2 < kVar.f2475m.size(); i2++) {
                    kVar.f2476n.add(p.k(kVar.f2475m.get(i2)));
                }
                kVar.f2475m.clear();
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

    public void dispatchSemanticsAction(int i2, f fVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = v0.n.f3089a.a(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, fVar.f2538e, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
