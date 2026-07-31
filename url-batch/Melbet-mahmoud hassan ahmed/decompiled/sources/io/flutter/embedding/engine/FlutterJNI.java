package io.flutter.embedding.engine;

import a5.f;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.o;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m5.q;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate = null;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static String observatoryUri = null;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private a accessibilityDelegate;
    private b5.a deferredComponentManager;
    private n5.a localizationPlugin;
    private Long nativeShellHolderId;
    private f platformMessageHandler;
    private o platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<k5.b> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    public interface a {
        void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);

        void c(ByteBuffer byteBuffer, String[] strArr);
    }

    public interface b {
        void a(long j7);
    }

    public static class c {
        public FlutterJNI a() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j7) {
        b bVar = asyncWaitForVsyncDelegate;
        if (bVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        bVar.a(j7);
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.d
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j7, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e7) {
                z4.b.c(TAG, "Failed to decode image", e7);
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

    public static String getObservatoryUri() {
        return observatoryUri;
    }

    private void handlePlatformMessageResponse(int i7, ByteBuffer byteBuffer) {
        f fVar = this.platformMessageHandler;
        if (fVar != null) {
            fVar.g(i7, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j7, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j7, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j7);

    private native void nativeDeferredComponentInstallFailure(int i7, String str, boolean z6);

    private native void nativeDestroy(long j7);

    private native void nativeDispatchEmptyPlatformMessage(long j7, String str, int i7);

    private native void nativeDispatchPlatformMessage(long j7, String str, ByteBuffer byteBuffer, int i7, int i8);

    private native void nativeDispatchPointerDataPacket(long j7, ByteBuffer byteBuffer, int i7);

    private native void nativeDispatchSemanticsAction(long j7, int i7, int i8, ByteBuffer byteBuffer, int i9);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i7);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i7);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i7);

    private native Bitmap nativeGetBitmap(long j7);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j7, int i7, int i8);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j7);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j7, int i7);

    private native void nativeInvokePlatformMessageResponseCallback(long j7, int i7, ByteBuffer byteBuffer, int i8);

    private native void nativeLoadDartDeferredLibrary(long j7, int i7, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j7);

    private native void nativeMarkTextureFrameAvailable(long j7, long j8);

    private native void nativeNotifyLowMemoryWarning(long j7);

    private native void nativeOnVsync(long j7, long j8, long j9);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterTexture(long j7, long j8, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j7, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeSetAccessibilityFeatures(long j7, int i7);

    private native void nativeSetSemanticsEnabled(long j7, boolean z6);

    private native void nativeSetViewportMetrics(long j7, float f7, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j7, String str, String str2, String str3, List<String> list);

    private native void nativeSurfaceChanged(long j7, int i7, int i8);

    private native void nativeSurfaceCreated(long j7, Surface surface);

    private native void nativeSurfaceDestroyed(long j7);

    private native void nativeSurfaceWindowChanged(long j7, Surface surface);

    private native void nativeUnregisterTexture(long j7, long j8);

    private native void nativeUpdateJavaAssetManager(long j7, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f7);

    private void onPreEngineRestart() {
        Iterator<a.b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.c(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.b(byteBuffer, strArr, byteBufferArr);
        }
    }

    public void addEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(k5.b bVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(bVar);
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

    public void cleanupMessageData(long j7) {
        nativeCleanupMessageData(j7);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < strArr.length; i7 += 3) {
            String str = strArr[i7 + 0];
            String str2 = strArr[i7 + 1];
            String str3 = strArr[i7 + 2];
            if (Build.VERSION.SDK_INT >= 21) {
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
            } else {
                arrayList.add(new Locale(str, str2));
            }
        }
        Locale c7 = this.localizationPlugin.c(arrayList);
        if (c7 == null) {
            return new String[0];
        }
        String[] strArr2 = new String[3];
        strArr2[0] = c7.getLanguage();
        strArr2[1] = c7.getCountry();
        if (Build.VERSION.SDK_INT >= 21) {
            strArr2[2] = c7.getScript();
        } else {
            strArr2[2] = "";
        }
        return strArr2;
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar != null) {
            return oVar.E();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void deferredComponentInstallFailure(int i7, String str, boolean z6) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i7, str, z6);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        oVar.G();
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
        z4.b.f(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i7);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i7, int i8) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i7, i8);
            return;
        }
        z4.b.f(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i8);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i7);
    }

    public void dispatchSemanticsAction(int i7, int i8, ByteBuffer byteBuffer, int i9) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i7, i8, byteBuffer, i9);
    }

    public void dispatchSemanticsAction(int i7, c.g gVar) {
        dispatchSemanticsAction(i7, gVar, null);
    }

    public void dispatchSemanticsAction(int i7, c.g gVar, Object obj) {
        ByteBuffer byteBuffer;
        int i8;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = q.f19259a.a(obj);
            i8 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i8 = 0;
        }
        dispatchSemanticsAction(i7, gVar.f17900f, byteBuffer, i8);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i7, long j7) {
        f fVar = this.platformMessageHandler;
        if (fVar != null) {
            fVar.h(str, byteBuffer, i7, j7);
        } else {
            nativeCleanupMessageData(j7);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j7) {
        if (initCalled) {
            z4.b.f(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j7);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i7) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i7);
            } else {
                z4.b.f(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i7, ByteBuffer byteBuffer, int i8) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i7, byteBuffer, i8);
            } else {
                z4.b.f(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
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

    public void loadLibrary() {
        if (loadLibraryCalled) {
            z4.b.f(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        System.loadLibrary("flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j7);
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
        oVar.U();
    }

    public void onDisplayOverlaySurface(int i7, int i8, int i9, int i10, int i11) {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        oVar.W(i7, i8, i9, i10, i11);
    }

    public void onDisplayPlatformView(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        oVar.X(i7, i8, i9, i10, i11, i12, i13, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        oVar.Y();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<k5.b> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<k5.b> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().c();
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

    public void onVsync(long j7, long j8, long j9) {
        nativeOnVsync(j7, j8, j9);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            z4.b.f(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerTexture(long j7, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j7, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(k5.b bVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(bVar);
    }

    public void requestDartDeferredLibrary(int i7) {
        b5.a aVar = this.deferredComponentManager;
        if (aVar != null) {
            aVar.e(i7, null);
        } else {
            z4.b.b(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    public void setAccessibilityFeatures(int i7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i7);
    }

    public void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    public void setDeferredComponentManager(b5.a aVar) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = aVar;
        if (aVar != null) {
            aVar.d(this);
        }
    }

    public void setLocalizationPlugin(n5.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(f fVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = fVar;
    }

    public void setPlatformViewsController(o oVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = oVar;
    }

    public void setRefreshRateFPS(float f7) {
        refreshRateFPS = f7;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z6);
    }

    public void setViewportMetrics(float f7, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f7, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l7 = nativeSpawn.nativeShellHolderId;
        u5.c.b((l7 == null || l7.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void unregisterTexture(long j7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j7);
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
}
