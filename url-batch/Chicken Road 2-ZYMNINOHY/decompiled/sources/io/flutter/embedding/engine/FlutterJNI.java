package io.flutter.embedding.engine;

import E.AbstractC0005f;
import G1.a;
import G1.b;
import G1.c;
import S1.g;
import a2.i;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Surface;
import android.view.SurfaceControl;
import io.appmetrica.analytics.impl.Zo;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.image.FlutterImageDecoder;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.FlutterUiResizeListener;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import io.flutter.util.Preconditions;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import l2.e;

/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private AccessibilityDelegate accessibilityDelegate;
    private DeferredComponentManager deferredComponentManager;
    private LocalizationPlugin localizationPlugin;
    private Long nativeShellHolderId;
    private PlatformMessageHandler platformMessageHandler;
    private PlatformViewsController platformViewsController;
    private PlatformViewsController2 platformViewsController2;
    private SettingsChannel settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<FlutterUiResizeListener> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    public interface AccessibilityDelegate {
        void resetSemantics();

        void setLocale(String str);

        void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr);

        void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);
    }

    public interface AsyncWaitForVsyncDelegate {
        void asyncWaitForVsync(long j4);
    }

    public static class Factory {
        public FlutterJNI provideFlutterJNI() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j4) {
        AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate2 == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        asyncWaitForVsyncDelegate2.asyncWaitForVsync(j4);
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return FlutterImageDecoder.decodeImage(byteBuffer, new g(j4));
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

    private void handlePlatformMessageResponse(int i4, ByteBuffer byteBuffer) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handlePlatformMessageResponse(i4, byteBuffer);
        }
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j4);

    private native void nativeDeferredComponentInstallFailure(int i4, String str, boolean z);

    private native void nativeDestroy(long j4);

    private native void nativeDispatchEmptyPlatformMessage(long j4, String str, int i4);

    private native void nativeDispatchPlatformMessage(long j4, String str, ByteBuffer byteBuffer, int i4, int i5);

    private native void nativeDispatchPointerDataPacket(long j4, ByteBuffer byteBuffer, int i4);

    private native void nativeDispatchSemanticsAction(long j4, int i4, int i5, ByteBuffer byteBuffer, int i6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i4);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i4);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i4);

    private native Bitmap nativeGetBitmap(long j4);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j4, int i4, int i5);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j4, int i4);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j4, int i4);

    private native void nativeInvokePlatformMessageResponseCallback(long j4, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeIsSurfaceControlEnabled(long j4);

    private native void nativeLoadDartDeferredLibrary(long j4, int i4, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j4);

    private native void nativeMarkTextureFrameAvailable(long j4, long j5);

    private native void nativeNotifyLowMemoryWarning(long j4);

    private native void nativeOnVsync(long j4, long j5, long j6);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j4, long j5, WeakReference<TextureRegistry.ImageConsumer> weakReference, boolean z);

    private native void nativeRegisterTexture(long j4, long j5, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j4, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j5);

    private native void nativeScheduleFrame(long j4);

    private native void nativeSetAccessibilityFeatures(long j4, int i4);

    private native void nativeSetSemanticsEnabled(long j4, boolean z);

    private native void nativeSetViewportMetrics(long j4, float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26);

    private native FlutterJNI nativeSpawn(long j4, String str, String str2, String str3, List<String> list, long j5);

    private native void nativeSurfaceChanged(long j4, int i4, int i5);

    private native void nativeSurfaceCreated(long j4, Surface surface);

    private native void nativeSurfaceDestroyed(long j4);

    private native void nativeSurfaceWindowChanged(long j4, Surface surface);

    private native void nativeUnregisterTexture(long j4, long j5);

    private native void nativeUpdateDisplayMetrics(long j4);

    private native void nativeUpdateJavaAssetManager(long j4, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f4);

    private void onPreEngineRestart() {
        Iterator<FlutterEngine.EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreEngineRestart();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.setLocale(str);
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void addResizingFlutterUiListener(FlutterUiResizeListener flutterUiResizeListener) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(flutterUiResizeListener);
    }

    public void applyTransactions() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.applyTransactions();
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

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < strArr.length; i4 += 3) {
            String str = strArr[i4];
            String str2 = strArr[i4 + 1];
            String str3 = strArr[i4 + 2];
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
        Locale resolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
        return resolveNativeLocale == null ? new String[0] : new String[]{resolveNativeLocale.getLanguage(), resolveNativeLocale.getCountry(), resolveNativeLocale.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public SurfaceControl.Transaction createTransaction() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createTransaction();
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i4, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i4, str, z);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController2.destroyOverlaySurface();
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController.destroyOverlaySurfaces();
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

    public void dispatchEmptyPlatformMessage(String str, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i4, int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i4, i5);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i5);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i4, AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i4, action, null);
    }

    public void endFrame2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.onEndFrame();
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f4, int i4) {
        SettingsChannel settingsChannel = this.settingsChannel;
        DisplayMetrics pastDisplayMetrics = settingsChannel == null ? null : settingsChannel.getPastDisplayMetrics(i4);
        if (pastDisplayMetrics != null) {
            return TypedValue.applyDimension(2, f4, pastDisplayMetrics) / pastDisplayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i4 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i4, long j4) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handleMessageFromDart(str, byteBuffer, i4, j4);
        } else {
            nativeCleanupMessageData(j4);
        }
    }

    public void hideOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController2.hideOverlaySurface();
    }

    public void hidePlatformView2(int i4) {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        platformViewsController2.hidePlatformView(i4);
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j4, int i4) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j4, i4);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i4) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i4);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
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
    public void invokePlatformMessageResponseCallback(int i4, ByteBuffer byteBuffer, int i5) {
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
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i4, byteBuffer, i5);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
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

    public boolean isCodePointEmoji(int i4) {
        return nativeFlutterTextUtilsIsEmoji(i4);
    }

    public boolean isCodePointEmojiModifier(int i4) {
        return nativeFlutterTextUtilsIsEmojiModifier(i4);
    }

    public boolean isCodePointEmojiModifierBase(int i4) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i4);
    }

    public boolean isCodePointRegionalIndicator(int i4) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i4);
    }

    public boolean isCodePointVariantSelector(int i4) {
        return nativeFlutterTextUtilsIsVariationSelector(i4);
    }

    public void loadDartDeferredLibrary(int i4, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i4, strArr);
    }

    public void loadLibrary(Context context) {
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        long j4;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        Zo zo = new Zo(5);
        c cVar = new c(0);
        cVar.f838e = zo;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        cVar.h("Beginning load of %s...", PluginErrorDetails.Platform.FLUTTER);
        i iVar = (i) cVar.f836c;
        HashSet hashSet = (HashSet) cVar.f835b;
        if (hashSet.contains(PluginErrorDetails.Platform.FLUTTER)) {
            cVar.h("%s already loaded previously!", PluginErrorDetails.Platform.FLUTTER);
        } else {
            e eVar = null;
            try {
                iVar.getClass();
                System.loadLibrary(PluginErrorDetails.Platform.FLUTTER);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                cVar.h("%s (%s) was loaded normally!", PluginErrorDetails.Platform.FLUTTER, null);
            } catch (UnsatisfiedLinkError e4) {
                cVar.h("Loading the library normally failed: %s", android.util.Log.getStackTraceString(e4));
                cVar.h("%s (%s) was not loaded normally, re-linking...", PluginErrorDetails.Platform.FLUTTER, null);
                File g4 = cVar.g(context);
                if (!g4.exists()) {
                    File dir = context.getDir("lib", 0);
                    File g5 = cVar.g(context);
                    iVar.getClass();
                    File[] listFiles = dir.listFiles(new b(System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER)));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(g5.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    i iVar2 = (i) cVar.f837d;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER);
                    iVar2.getClass();
                    try {
                        e o = i.o(context, strArr2, mapLibraryName, cVar);
                        try {
                            if (o == null) {
                                try {
                                    strArr = i.p(context, mapLibraryName);
                                } catch (Exception e5) {
                                    strArr = new String[]{e5.toString()};
                                }
                                StringBuilder sb = new StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new a(AbstractC0005f.q(sb, Arrays.toString(strArr), "."));
                            }
                            ZipFile zipFile = (ZipFile) o.f14270b;
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                if (i4 < 5) {
                                    cVar.h("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (g4.exists() || g4.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) o.f14271c);
                                            } catch (FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (IOException unused2) {
                                                inputStream2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new FileOutputStream(g4);
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
                                                } catch (FileNotFoundException unused3) {
                                                    i.j(inputStream2);
                                                    i.j(fileOutputStream2);
                                                    i4 = i5;
                                                } catch (IOException unused4) {
                                                    i.j(inputStream2);
                                                    i.j(fileOutputStream2);
                                                    i4 = i5;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    i.j(inputStream);
                                                    i.j(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                i.j(inputStream2);
                                                i.j(fileOutputStream2);
                                                i4 = i5;
                                            } catch (IOException unused6) {
                                                fileOutputStream2 = null;
                                                i.j(inputStream2);
                                                i.j(fileOutputStream2);
                                                i4 = i5;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                i.j(inputStream);
                                                i.j(fileOutputStream);
                                                throw th;
                                            }
                                            if (j4 == g4.length()) {
                                                i.j(inputStream2);
                                                i.j(fileOutputStream2);
                                                g4.setReadable(true, false);
                                                g4.setExecutable(true, false);
                                                g4.setWritable(true);
                                                break;
                                            }
                                            i.j(inputStream2);
                                            i.j(fileOutputStream2);
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i4 = i5;
                                } else if (((Zo) cVar.f838e) != null) {
                                    Log.d(TAG, "FATAL! Couldn't extract the library from the APK!");
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eVar = o;
                            if (eVar != null) {
                                try {
                                    ((ZipFile) eVar.f14270b).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                String absolutePath = g4.getAbsolutePath();
                iVar.getClass();
                System.load(absolutePath);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                cVar.h("%s (%s) was re-linked!", PluginErrorDetails.Platform.FLUTTER, null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j4);
    }

    public void maybeResizeSurfaceView(int i4, int i5) {
        Iterator<FlutterUiResizeListener> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            it.next().resizeEngineView(i4, i5);
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        platformViewsController.onBeginFrame();
    }

    public void onDisplayOverlaySurface(int i4, int i5, int i6, int i7, int i8) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        platformViewsController.onDisplayOverlaySurface(i4, i5, i6, i7, i8);
    }

    public void onDisplayPlatformView(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        platformViewsController.onDisplayPlatformView(i4, i5, i6, i7, i8, i9, i10, flutterMutatorsStack);
    }

    public void onDisplayPlatformView2(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        platformViewsController2.onDisplayPlatformView(i4, i5, i6, i7, i8, i9, i10, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        platformViewsController.onEndFrame();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiDisplayed();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiNoLongerDisplayed();
        }
    }

    public void onSurfaceChanged(int i4, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i4, i5);
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

    public void onVsync(long j4, long j5, long j6) {
        nativeOnVsync(j4, j5, j6);
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

    public void registerImageTexture(long j4, TextureRegistry.ImageConsumer imageConsumer, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference<>(imageConsumer), z);
    }

    public void registerTexture(long j4, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void removeResizingFlutterUiListener(FlutterUiResizeListener flutterUiResizeListener) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(flutterUiResizeListener);
    }

    public void requestDartDeferredLibrary(int i4) {
        DeferredComponentManager deferredComponentManager = this.deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.installDeferredComponent(i4, null);
        } else {
            Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
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

    public void setAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }

    public void setAccessibilityFeatures(int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i4);
        }
    }

    public void setAccessibilityFeaturesInNative(int i4) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i4);
    }

    public void setAsyncWaitForVsyncDelegate(AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
        asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
    }

    public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.setJNI(this);
        }
    }

    public void setLocalizationPlugin(LocalizationPlugin localizationPlugin) {
        ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin;
    }

    public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }

    public void setPlatformViewsController(PlatformViewsController platformViewsController) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }

    public void setPlatformViewsController2(PlatformViewsController2 platformViewsController2) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = platformViewsController2;
    }

    public void setRefreshRateFPS(float f4) {
        refreshRateFPS = f4;
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
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate == null || z) {
            return;
        }
        accessibilityDelegate.resetSemantics();
    }

    public void setSettingsChannel(SettingsChannel settingsChannel) {
        ensureRunningOnMainThread();
        this.settingsChannel = settingsChannel;
    }

    public void setViewportMetrics(float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        Log.d(TAG, "Sending viewport metrics to the engine.");
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f4, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, iArr, iArr2, iArr3, i19, i20, i21, i22, i23, i24, i25, i26);
    }

    public void showOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController2.showOverlaySurface();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j4);
        Long l4 = nativeSpawn.nativeShellHolderId;
        Preconditions.checkState((l4 == null || l4.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void swapTransactions() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.swapTransactions();
    }

    public void unregisterTexture(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j4);
    }

    public void updateDisplayMetrics(int i4, float f4, float f5, float f6) {
        displayWidth = f4;
        displayHeight = f5;
        displayDensity = f6;
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

    public void dispatchSemanticsAction(int i4, AccessibilityBridge.Action action, Object obj) {
        ByteBuffer byteBuffer;
        int i5;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = StandardMessageCodec.INSTANCE.encodeMessage(obj);
            i5 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i5 = 0;
        }
        dispatchSemanticsAction(i4, action.value, byteBuffer, i5);
    }

    public void dispatchSemanticsAction(int i4, int i5, ByteBuffer byteBuffer, int i6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i4, i5, byteBuffer, i6);
    }
}
