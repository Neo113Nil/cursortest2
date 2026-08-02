package io.flutter.embedding.engine;

import B0.C0023a;
import B0.C0031i;
import D0.RunnableC0043c;
import I.C0079n;
import P.O;
import android.app.Activity;
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
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import b.InterfaceC0163a;
import g0.C0189a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.c;
import io.flutter.plugin.platform.g;
import io.flutter.plugin.platform.o;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.e;
import io.flutter.view.f;
import io.flutter.view.r;
import io.flutter.view.s;
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
import m0.AbstractActivityC0264d;
import m0.i;
import m0.p;
import m0.q;
import n0.b;
import n0.l;
import n0.m;
import o0.d;
import o0.j;
import o0.k;
import p0.InterfaceC0281a;
import r0.C0289a;
import w0.InterfaceC0319e;
import x0.C0332a;

@InterfaceC0163a
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
    private InterfaceC0281a deferredComponentManager;
    private C0332a localizationPlugin;
    private Long nativeShellHolderId;
    private k platformMessageHandler;
    private o platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        m mVar = asyncWaitForVsyncDelegate;
        if (mVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.b bVar = (io.flutter.view.b) mVar;
        bVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        s sVar = (s) bVar.f2703a;
        r rVar = sVar.f2827c;
        if (rVar != null) {
            rVar.f2821a = j2;
            sVar.f2827c = null;
        } else {
            rVar = new r(sVar, j2);
        }
        choreographer.postFrameCallback(rVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [n0.k] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j2) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: n0.k
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j2, imageDecoder, imageInfo, source);
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

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i2, ByteBuffer byteBuffer) {
        InterfaceC0319e interfaceC0319e;
        k kVar = this.platformMessageHandler;
        if (kVar == null || (interfaceC0319e = (InterfaceC0319e) ((j) kVar).f3357j.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            interfaceC0319e.a(byteBuffer);
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
    public static /* synthetic */ void lambda$decodeImage$0(long j2, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
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

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j2, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j2, int i2, ByteBuffer byteBuffer, int i3);

    private native void nativeLoadDartDeferredLibrary(long j2, int i2, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j2);

    private native void nativeMarkTextureFrameAvailable(long j2, long j3);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j3, long j4);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference);

    private native void nativeRegisterTexture(long j2, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z2);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3);

    private native boolean nativeShouldDisableAHB();

    private native FlutterJNI nativeSpawn(long j2, String str, String str2, String str3, List<String> list);

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

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            io.flutter.view.b bVar = (io.flutter.view.b) lVar;
            bVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.k kVar = (io.flutter.view.k) bVar.f2703a;
            kVar.getClass();
            while (byteBuffer.hasRemaining()) {
                f b2 = kVar.b(byteBuffer.getInt());
                b2.f2732c = byteBuffer.getInt();
                int i2 = byteBuffer.getInt();
                String str = null;
                b2.f2733d = i2 == -1 ? null : strArr[i2];
                int i3 = byteBuffer.getInt();
                if (i3 != -1) {
                    str = strArr[i3];
                }
                b2.f2734e = str;
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

    public boolean ShouldDisableAHB() {
        return nativeShouldDisableAHB();
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
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

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (r4.hasNext() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0155, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0160, code lost:
    
        if (r4.hasNext() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0162, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0177, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a3, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Incorrect condition in loop: B:51:0x011a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale locale;
        Locale locale2;
        LocaleList locales;
        int size;
        Locale locale3;
        Locale locale4;
        LocaleList locales2;
        int size2;
        Locale locale5;
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
        C0332a c0332a = this.localizationPlugin;
        c0332a.getClass();
        if (arrayList.isEmpty()) {
            locale = null;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            AbstractActivityC0264d abstractActivityC0264d = c0332a.f3590b;
            if (i3 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                locales2 = abstractActivityC0264d.getResources().getConfiguration().getLocales();
                size2 = locales2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    locale5 = locales2.get(i4);
                    String language = locale5.getLanguage();
                    if (!locale5.getScript().isEmpty()) {
                        language = language + "-" + locale5.getScript();
                    }
                    if (!locale5.getCountry().isEmpty()) {
                        language = language + "-" + locale5.getCountry();
                    }
                    arrayList2.add(i.b(language));
                    i.d();
                    arrayList2.add(i.b(locale5.getLanguage()));
                    i.d();
                    arrayList2.add(i.b(locale5.getLanguage() + "-*"));
                }
                locale = Locale.lookup(arrayList2, arrayList);
                if (locale == null) {
                    locale = (Locale) arrayList.get(0);
                }
            } else if (i3 >= 24) {
                locales = abstractActivityC0264d.getResources().getConfiguration().getLocales();
                int i5 = 0;
                loop2: while (i5 < size) {
                    locale3 = locales.get(i5);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        locale4 = (Locale) it.next();
                        if (locale3.equals(locale4)) {
                            break loop2;
                        }
                    }
                    locale = locale4;
                    break loop2;
                }
                locale = (Locale) arrayList.get(0);
            } else {
                Locale locale6 = abstractActivityC0264d.getResources().getConfiguration().locale;
                if (locale6 != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            locale2 = (Locale) it2.next();
                            if (locale6.equals(locale2)) {
                                break;
                            }
                        } else {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                locale2 = (Locale) it3.next();
                                if (locale6.getLanguage().equals(locale2.toString())) {
                                }
                            }
                        }
                    }
                }
                locale = (Locale) arrayList.get(0);
            }
        }
        return locale == null ? new String[0] : new String[]{locale.getLanguage(), locale.getCountry(), locale.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        c cVar = new c(oVar.f2658d.getContext(), oVar.f2658d.getWidth(), oVar.f2658d.getHeight(), 2);
        cVar.f2624k = oVar.f2662h;
        int i2 = oVar.f2669o;
        oVar.f2669o = i2 + 1;
        oVar.f2667m.put(i2, cVar);
        return new FlutterOverlaySurface(i2, cVar.getSurface());
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        oVar.c();
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

    public void dispatchSemanticsAction(int i2, e eVar) {
        dispatchSemanticsAction(i2, eVar, null);
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
        v0.k kVar;
        DisplayMetrics displayMetrics;
        C0031i c0031i = v0.l.f3526b;
        v0.k kVar2 = (v0.k) c0031i.f155g;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0031i.f154f;
        if (kVar2 == null) {
            c0031i.f155g = (v0.k) concurrentLinkedQueue.poll();
        }
        while (true) {
            kVar = (v0.k) c0031i.f155g;
            if (kVar == null || kVar.f3524a >= i2) {
                break;
            }
            c0031i.f155g = (v0.k) concurrentLinkedQueue.poll();
        }
        if (kVar != null) {
            if (kVar.f3524a != i2) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i2) + ", the oldest config is now: " + String.valueOf(((v0.k) c0031i.f155g).f3524a));
            }
            displayMetrics = kVar != null ? kVar.f3525b : null;
            if (displayMetrics == null) {
                return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
            }
            Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i2) + ", which can't be found.");
            return -1.0f;
        }
        Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i2) + ", after exhausting the queue.");
        kVar = null;
        if (kVar != null) {
        }
        if (displayMetrics == null) {
        }
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        o0.f fVar;
        boolean z2;
        k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        j jVar = (j) kVar;
        synchronized (jVar.f3355h) {
            try {
                fVar = (o0.f) jVar.f3353f.get(str);
                z2 = jVar.f3356i.get() && fVar == null;
                if (z2) {
                    if (!jVar.f3354g.containsKey(str)) {
                        jVar.f3354g.put(str, new LinkedList());
                    }
                    ((List) jVar.f3354g.get(str)).add(new d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        jVar.d(str, fVar, byteBuffer, i2, j2);
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j2) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j2);
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

    public void loadLibrary(Context context) {
        O o2;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        char c2 = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C0031i c0031i = new C0031i(6);
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        C0031i.I("Beginning load of %s...", "flutter");
        C0023a c0023a = (C0023a) c0031i.f155g;
        HashSet hashSet = (HashSet) c0031i.f154f;
        if (hashSet.contains("flutter")) {
            C0031i.I("%s already loaded previously!", "flutter");
        } else {
            try {
                c0023a.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                C0031i.I("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e2) {
                C0031i.I("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                C0031i.I("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File E2 = c0031i.E(context);
                if (!E2.exists()) {
                    File dir = context.getDir("lib", 0);
                    File E3 = c0031i.E(context);
                    c0023a.getClass();
                    File[] listFiles = dir.listFiles(new C0189a(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(E3.getAbsolutePath())) {
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
                    ((C0023a) c0031i.f156h).getClass();
                    try {
                        O g2 = C0023a.g(context, strArr2, mapLibraryName, c0031i);
                        try {
                            if (g2 == null) {
                                try {
                                    strArr = C0023a.i(context, mapLibraryName);
                                } catch (Exception e3) {
                                    strArr = new String[]{e3.toString()};
                                }
                                throw new F0.b(mapLibraryName, strArr2, strArr);
                            }
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 + 1;
                                zipFile = (ZipFile) g2.f875f;
                                if (i2 < 5) {
                                    Object[] objArr = new Object[1];
                                    objArr[c2] = mapLibraryName;
                                    C0031i.I("Found %s! Extracting...", objArr);
                                    try {
                                        if (E2.exists() || E2.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) g2.f876g);
                                                try {
                                                    fileOutputStream2 = new FileOutputStream(E2);
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
                                                        if (j2 == E2.length()) {
                                                            C0023a.c(inputStream2);
                                                            C0023a.c(fileOutputStream2);
                                                            E2.setReadable(true, false);
                                                            E2.setExecutable(true, false);
                                                            E2.setWritable(true);
                                                            break;
                                                        }
                                                        C0023a.c(inputStream2);
                                                        C0023a.c(fileOutputStream2);
                                                    } catch (FileNotFoundException unused) {
                                                        C0023a.c(inputStream2);
                                                        C0023a.c(fileOutputStream2);
                                                        i2 = i3;
                                                        c2 = 0;
                                                    } catch (IOException unused2) {
                                                        C0023a.c(inputStream2);
                                                        C0023a.c(fileOutputStream2);
                                                        i2 = i3;
                                                        c2 = 0;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        inputStream = inputStream2;
                                                        fileOutputStream = fileOutputStream2;
                                                        C0023a.c(inputStream);
                                                        C0023a.c(fileOutputStream);
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException unused3) {
                                                    fileOutputStream2 = null;
                                                    C0023a.c(inputStream2);
                                                    C0023a.c(fileOutputStream2);
                                                    i2 = i3;
                                                    c2 = 0;
                                                } catch (IOException unused4) {
                                                    fileOutputStream2 = null;
                                                    C0023a.c(inputStream2);
                                                    C0023a.c(fileOutputStream2);
                                                    i2 = i3;
                                                    c2 = 0;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = null;
                                                    C0023a.c(inputStream);
                                                    C0023a.c(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                inputStream2 = null;
                                            } catch (IOException unused6) {
                                                inputStream2 = null;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = null;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i2 = i3;
                                    c2 = 0;
                                }
                            }
                            try {
                                zipFile.close();
                                break;
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            o2 = g2;
                            if (o2 != null) {
                                try {
                                    ((ZipFile) o2.f875f).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        o2 = null;
                    }
                }
                String absolutePath = E2.getAbsolutePath();
                c0023a.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                C0031i.I("%s (%s) was re-linked!", "flutter", null);
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
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        oVar.f2672r.clear();
        oVar.f2673s.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = oVar.f2667m;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        oVar.h();
        View view = (c) sparseArray.get(i2);
        if (view.getParent() == null) {
            oVar.f2658d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        oVar.f2672r.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(final int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        final o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        oVar.h();
        SparseArray sparseArray = oVar.f2665k;
        g gVar = (g) sparseArray.get(i2);
        if (gVar == null) {
            return;
        }
        SparseArray sparseArray2 = oVar.f2666l;
        if (sparseArray2.get(i2) == null) {
            View view = gVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = oVar.f2657c;
            C0289a c0289a = new C0289a(activity, activity.getResources().getDisplayMetrics().density, oVar.f2656b);
            c0289a.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z2) {
                    o oVar2 = o.this;
                    int i9 = i2;
                    if (z2) {
                        C0079n c0079n = (C0079n) oVar2.f2661g.f875f;
                        if (c0079n == null) {
                            return;
                        }
                        c0079n.f("viewFocused", Integer.valueOf(i9), null);
                        return;
                    }
                    io.flutter.plugin.editing.j jVar = oVar2.f2660f;
                    if (jVar != null) {
                        jVar.b(i9);
                    }
                }
            });
            sparseArray2.put(i2, c0289a);
            view.setImportantForAccessibility(4);
            c0289a.addView(view);
            oVar.f2658d.addView(c0289a);
        }
        C0289a c0289a2 = (C0289a) sparseArray2.get(i2);
        c0289a2.f3386e = flutterMutatorsStack;
        c0289a2.f3388g = i3;
        c0289a2.f3389h = i4;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        c0289a2.setLayoutParams(layoutParams);
        c0289a2.setWillNotDraw(false);
        c0289a2.setVisibility(0);
        c0289a2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i8);
        View view2 = ((g) sparseArray.get(i2)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        oVar.f2673s.add(Integer.valueOf(i2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!oVar.f2670p || !oVar.f2673s.isEmpty()) {
            if (oVar.f2670p) {
                m0.j jVar = oVar.f2658d.f3185g;
                if (jVar != null ? jVar.e() : false) {
                    z2 = true;
                }
            }
            oVar.e(z2);
            return;
        }
        oVar.f2670p = false;
        q qVar = oVar.f2658d;
        RunnableC0043c runnableC0043c = new RunnableC0043c(3, oVar);
        m0.j jVar2 = qVar.f3185g;
        if (jVar2 == null || (r3 = qVar.f3187i) == 0) {
            return;
        }
        qVar.f3186h = r3;
        qVar.f3187i = null;
        io.flutter.embedding.engine.renderer.l lVar = qVar.f3190l.f3264b;
        if (lVar != null) {
            r3.d();
            p pVar = new p(qVar, lVar, runnableC0043c);
            lVar.f2537a.addIsDisplayingFlutterUiListener(pVar);
            if (lVar.f2540d) {
                pVar.b();
                return;
            }
            return;
        }
        jVar2.c();
        m0.j jVar3 = qVar.f3185g;
        if (jVar3 != null) {
            jVar3.f3162e.close();
            qVar.removeView(qVar.f3185g);
            qVar.f3185g = null;
        }
        runnableC0043c.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.m> it = this.flutterUiDisplayListeners.iterator();
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

    public void registerImageTexture(long j2, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(textureRegistry$ImageConsumer));
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

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
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

    public void setDeferredComponentManager(InterfaceC0281a interfaceC0281a) {
        ensureRunningOnMainThread();
        if (interfaceC0281a != null) {
            interfaceC0281a.a();
        }
    }

    public void setLocalizationPlugin(C0332a c0332a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0332a;
    }

    public void setPlatformMessageHandler(k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(o oVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = oVar;
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

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l2 = nativeSpawn.nativeShellHolderId;
        if ((l2 == null || l2.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
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

    public void dispatchSemanticsAction(int i2, e eVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = w0.o.f3561a.b(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, eVar.f2729e, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
