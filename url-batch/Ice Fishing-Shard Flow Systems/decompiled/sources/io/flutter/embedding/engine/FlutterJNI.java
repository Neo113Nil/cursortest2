package io.flutter.embedding.engine;

import C4.p;
import E1.i;
import X.g;
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
import com.google.firebase.messaging.v;
import com.google.firebase.messaging.z;
import h4.AbstractActivityC0488c;
import h4.o;
import i4.InterfaceC0546b;
import i4.j;
import i4.k;
import i4.l;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.C0555a;
import io.flutter.plugin.platform.C0557c;
import io.flutter.plugin.platform.InterfaceC0561g;
import io.flutter.plugin.platform.t;
import io.flutter.plugin.platform.u;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.r;
import io.flutter.view.s;
import j4.C0575d;
import j4.C0577f;
import j4.C0580i;
import j4.InterfaceC0581j;
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
import k4.InterfaceC0600a;
import l4.b;
import l4.c;
import l4.d;
import l4.e;
import n4.C0758a;
import q1.h;
import r3.AbstractC0847a;
import r4.f;
import r4.m;
import r4.n;
import t4.a;

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
    private InterfaceC0600a deferredComponentManager;
    private a localizationPlugin;
    private Long nativeShellHolderId;
    private InterfaceC0581j platformMessageHandler;
    private u platformViewsController;
    private t platformViewsController2;
    private n settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<InterfaceC0546b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.k> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.l> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.a aVar = (io.flutter.view.a) lVar;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        s sVar = (s) aVar.f5787a;
        r rVar = sVar.f5922c;
        if (rVar != null) {
            rVar.f5916a = j;
            sVar.f5922c = null;
        } else {
            rVar = new r(sVar, j);
        }
        choreographer.postFrameCallback(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j) {
        c cVar;
        b bVar = 0;
        bVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        j jVar = new j(j);
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
            eVar.f6278d = options.outMimeType;
            eVar.f6280f = options.outHeight;
            eVar.f6281g = options.outWidth;
        } catch (Exception e7) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e7);
        }
        if ("image/heif".equals(eVar.f6278d)) {
            try {
                d dVar = new d(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(dVar);
                V6.b.K(eVar, mediaExtractor);
            } catch (Exception e8) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e8);
            }
            nativeImageHeaderCallback(jVar.f5552a, eVar.f6275a, eVar.f6276b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    X.c c7 = gVar.c("Orientation");
                    if (c7 != null) {
                        try {
                            i2 = c7.e(gVar.f2841e);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    eVar.f6279e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e9) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e9);
            }
        }
        if ("image/heif".equals(eVar.f6278d)) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 == 36) {
                cVar = new c(bVar, 0);
            } else if (i5 < 36) {
                cVar = new c(bVar, 1);
            }
            bVar = cVar;
        }
        if (bVar == 0) {
            bVar = new b(0, jVar);
        }
        return bVar.r(byteBuffer, eVar);
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
        s4.e eVar;
        InterfaceC0581j interfaceC0581j = this.platformMessageHandler;
        if (interfaceC0581j == null || (eVar = (s4.e) ((C0580i) interfaceC0581j).f5983n.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e7) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e7;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e7);
        } catch (Exception e8) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i2, String str, boolean z7);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i2);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i2, int i5);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j, int i2, int i5, ByteBuffer byteBuffer, int i7);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i2);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i2);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i2);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i2, int i5);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j, int i2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i2, ByteBuffer byteBuffer, int i5);

    private native boolean nativeIsSurfaceControlEnabled(long j);

    private native void nativeLoadDartDeferredLibrary(long j, int i2, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j7);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j7, long j8);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j7, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z7);

    private native void nativeRegisterTexture(long j, long j7, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j7);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i2);

    private native void nativeSetSemanticsEnabled(long j, boolean z7);

    private native void nativeSetViewportMetrics(long j, float f7, int i2, int i5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int[] iArr3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list, long j7);

    private native void nativeSurfaceChanged(long j, int i2, int i5);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j7);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f7);

    private void onPreEngineRestart() {
        Iterator<InterfaceC0546b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.g) ((io.flutter.view.a) kVar).f5787a).f5890m = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.g gVar = (io.flutter.view.g) ((io.flutter.view.a) kVar).f5787a;
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.e b7 = gVar.b(byteBuffer.getInt());
                b7.f5819c = byteBuffer.getInt();
                b7.f5820d = io.flutter.view.g.d(byteBuffer, strArr);
                b7.f5821e = io.flutter.view.g.d(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.a) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(InterfaceC0546b interfaceC0546b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC0546b);
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
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = tVar.f5741t;
        SurfaceControl.Transaction g7 = v.g();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g7 = g7.merge(v.j(arrayList.get(i2)));
        }
        g7.apply();
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

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        if (r10 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011e, code lost:
    
        if (r5 >= r4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
    
        r6 = r0.get(r5);
        r5 = r5 + 1;
        r6 = (java.util.Locale) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        if (r3.getLanguage().equals(r6.toLanguageTag()) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
    
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013c, code lost:
    
        if (r5 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013e, code lost:
    
        r6 = r0.get(r5);
        r5 = r5 + 1;
        r6 = (java.util.Locale) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        if (r3.getLanguage().equals(r6.getLanguage()) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0155, code lost:
    
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
        Context context = this.localizationPlugin.f8012b;
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i5 = 0; i5 < size; i5++) {
                Locale locale3 = locales.get(i5);
                String language = locale3.getLanguage();
                if (!locale3.getScript().isEmpty()) {
                    StringBuilder l7 = p.l(language, "-");
                    l7.append(locale3.getScript());
                    language = l7.toString();
                }
                if (!locale3.getCountry().isEmpty()) {
                    StringBuilder l8 = p.l(language, "-");
                    l8.append(locale3.getCountry());
                    language = l8.toString();
                }
                arrayList2.add(AbstractC0847a.i(language));
                AbstractC0847a.k();
                arrayList2.add(AbstractC0847a.i(locale3.getLanguage()));
                AbstractC0847a.k();
                arrayList2.add(AbstractC0847a.i(locale3.getLanguage() + "-*"));
            }
            locale2 = Locale.lookup(arrayList2, arrayList);
        } else {
            LocaleList locales2 = context.getResources().getConfiguration().getLocales();
            int i7 = 0;
            loop2: while (i7 < locales2.size()) {
                Locale locale4 = locales2.get(i7);
                int size2 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i8);
                    i8++;
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
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        Context context = uVar.f5756l.getContext();
        int width = uVar.f5756l.getWidth();
        int height = uVar.f5756l.getHeight();
        C0555a c0555a = uVar.f5761q;
        C0557c c0557c = new C0557c(context, width, height, 2);
        c0557c.f5692p = c0555a;
        int i2 = uVar.f5768x;
        uVar.f5768x = i2 + 1;
        uVar.f5766v.put(i2, c0557c);
        return new FlutterOverlaySurface(i2, c0557c.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (tVar.f5743v == null) {
            SurfaceControl.Builder f7 = v.f();
            f7.setBufferSize(tVar.f5733l.getWidth(), tVar.f5733l.getHeight());
            f7.setFormat(1);
            f7.setName("Flutter Overlay Surface");
            f7.setOpaque(false);
            f7.setHidden(false);
            build = f7.build();
            rootSurfaceControl = tVar.f5733l.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            tVar.f5743v = v.e(build);
            tVar.f5744w = build;
        }
        return new FlutterOverlaySurface(0, tVar.f5743v);
    }

    public SurfaceControl.Transaction createTransaction() {
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction g7 = v.g();
        tVar.f5741t.add(g7);
        return g7;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z7) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z7);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = tVar.f5743v;
        if (surface != null) {
            surface.release();
            tVar.f5743v = null;
            tVar.f5744w = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        uVar.c();
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

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i2, int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i2, i5);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i5);
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
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = tVar.f5742u;
        SurfaceControl.Transaction g7 = v.g();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g7 = g7.merge(v.j(arrayList.get(i2)));
        }
        arrayList.clear();
        tVar.f5733l.invalidate();
        rootSurfaceControl = tVar.f5733l.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(g7);
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
    public float getScaledFontSize(float f7, int i2) {
        m mVar;
        n nVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (nVar != null) {
            D0.j jVar = nVar.f7505a;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) jVar.f330e;
            if (((m) jVar.f331i) == null) {
                jVar.f331i = (m) concurrentLinkedQueue.poll();
            }
            while (true) {
                mVar = (m) jVar.f331i;
                if (mVar == null || mVar.f7503a >= i2) {
                    break;
                }
                jVar.f331i = (m) concurrentLinkedQueue.poll();
            }
            if (mVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (mVar.f7503a != i2) {
                    StringBuilder k7 = p.k(i2, "Cannot find config with generation: ", ", the oldest config is now: ");
                    k7.append(((m) jVar.f331i).f7503a);
                    Log.e("SettingsChannel", k7.toString());
                }
                if (mVar != null) {
                    displayMetrics = mVar.f7504b;
                }
            }
            mVar = null;
            if (mVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f7, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i2 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j) {
        C0577f c0577f;
        boolean z7;
        InterfaceC0581j interfaceC0581j = this.platformMessageHandler;
        if (interfaceC0581j == null) {
            nativeCleanupMessageData(j);
            return;
        }
        C0580i c0580i = (C0580i) interfaceC0581j;
        synchronized (c0580i.f5981l) {
            try {
                c0577f = (C0577f) c0580i.f5979e.get(str);
                z7 = c0580i.f5982m.get() && c0577f == null;
                if (z7) {
                    if (!c0580i.f5980i.containsKey(str)) {
                        c0580i.f5980i.put(str, new LinkedList());
                    }
                    ((List) c0580i.f5980i.get(str)).add(new C0575d(j, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            return;
        }
        c0580i.a(str, c0577f, byteBuffer, i2, j);
    }

    public void hideOverlaySurface2() {
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (tVar.f5744w == null) {
            return;
        }
        SurfaceControl.Transaction g7 = v.g();
        tVar.f5741t.add(g7);
        g7.setVisibility(tVar.f5744w, false);
    }

    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (tVar.a(i2)) {
            ((C0758a) tVar.f5739r.get(i2)).setVisibility(8);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j, int i2) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j, i2);
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
    public void invokePlatformMessageResponseCallback(int i2, ByteBuffer byteBuffer, int i5) {
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
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i2, byteBuffer, i5);
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
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        long j;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        A4.c cVar = new A4.c(28);
        z zVar = new z(2);
        zVar.f4538l = cVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        zVar.e("Beginning load of %s...", "flutter");
        c2.e eVar = (c2.e) zVar.f4536e;
        HashSet hashSet = (HashSet) zVar.f4535d;
        if (hashSet.contains("flutter")) {
            zVar.e("%s already loaded previously!", "flutter");
        } else {
            P0.e eVar2 = null;
            try {
                eVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                zVar.e("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e7) {
                zVar.e("Loading the library normally failed: %s", Log.getStackTraceString(e7));
                zVar.e("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File b7 = zVar.b(context);
                if (!b7.exists()) {
                    File dir = context.getDir("lib", 0);
                    File b8 = zVar.b(context);
                    eVar.getClass();
                    File[] listFiles = dir.listFiles(new V0.a(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(b8.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    h hVar = (h) zVar.f4537i;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    hVar.getClass();
                    try {
                        P0.e o7 = h.o(context, strArr2, mapLibraryName, zVar);
                        try {
                            if (o7 == null) {
                                try {
                                    strArr = h.p(context, mapLibraryName);
                                } catch (Exception e8) {
                                    strArr = new String[]{e8.toString()};
                                }
                                StringBuilder sb = new StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new i(f.f(sb, Arrays.toString(strArr), "."));
                            }
                            ZipFile zipFile = (ZipFile) o7.f2194e;
                            int i2 = 0;
                            while (true) {
                                int i5 = i2 + 1;
                                if (i2 < 5) {
                                    zVar.e("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (b7.exists() || b7.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) o7.f2195i);
                                            } catch (FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (IOException unused2) {
                                                inputStream2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new FileOutputStream(b7);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    j = 0;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, read);
                                                        j += read;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                } catch (FileNotFoundException unused3) {
                                                    h.g(inputStream2);
                                                    h.g(fileOutputStream2);
                                                    i2 = i5;
                                                } catch (IOException unused4) {
                                                    h.g(inputStream2);
                                                    h.g(fileOutputStream2);
                                                    i2 = i5;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    h.g(inputStream);
                                                    h.g(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                h.g(inputStream2);
                                                h.g(fileOutputStream2);
                                                i2 = i5;
                                            } catch (IOException unused6) {
                                                fileOutputStream2 = null;
                                                h.g(inputStream2);
                                                h.g(fileOutputStream2);
                                                i2 = i5;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                h.g(inputStream);
                                                h.g(fileOutputStream);
                                                throw th;
                                            }
                                            if (j == b7.length()) {
                                                h.g(inputStream2);
                                                h.g(fileOutputStream2);
                                                b7.setReadable(true, false);
                                                b7.setExecutable(true, false);
                                                b7.setWritable(true);
                                                break;
                                            }
                                            h.g(inputStream2);
                                            h.g(fileOutputStream2);
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i2 = i5;
                                } else if (((A4.c) zVar.f4538l) != null) {
                                    lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eVar2 = o7;
                            if (eVar2 != null) {
                                try {
                                    ((ZipFile) eVar2.f2194e).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                String absolutePath = b7.getAbsolutePath();
                eVar.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                zVar.e("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void maybeResizeSurfaceView(int i2, int i5) {
        boolean z7;
        Iterator<io.flutter.embedding.engine.renderer.l> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            View view = ((h4.n) it.next()).f5228a.f5246m;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z8 = true;
                if (view.getHeight() != i5) {
                    layoutParams.height = i5;
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (view.getWidth() != i2) {
                    layoutParams.width = i2;
                } else {
                    z8 = z7;
                }
                if (z8) {
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
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        uVar.f5748A.clear();
        uVar.f5749B.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i5, int i7, int i8, int i9) {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = uVar.f5766v;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException(p.h(i2, "The overlay surface (id:", ") doesn't exist"));
        }
        uVar.g();
        View view = (C0557c) sparseArray.get(i2);
        if (view.getParent() == null) {
            uVar.f5756l.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i9);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i7;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        uVar.f5748A.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i5, int i7, int i8, int i9, int i10, int i11, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        uVar.g();
        SparseArray sparseArray = uVar.f5765u;
        SparseArray sparseArray2 = uVar.f5764t;
        InterfaceC0561g interfaceC0561g = (InterfaceC0561g) sparseArray2.get(i2);
        if (interfaceC0561g == null) {
            return;
        }
        if (sparseArray.get(i2) == null) {
            View view = interfaceC0561g.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            AbstractActivityC0488c abstractActivityC0488c = uVar.f5755i;
            C0758a c0758a = new C0758a(abstractActivityC0488c, abstractActivityC0488c.getResources().getDisplayMetrics().density, uVar.f5754e);
            c0758a.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.n(uVar, i2, 0));
            sparseArray.put(i2, c0758a);
            view.setImportantForAccessibility(4);
            c0758a.addView(view);
            uVar.f5756l.addView(c0758a);
        }
        C0758a c0758a2 = (C0758a) sparseArray.get(i2);
        c0758a2.f6979d = flutterMutatorsStack;
        c0758a2.f6981i = i5;
        c0758a2.f6982l = i7;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i9, 51);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i7;
        c0758a2.setLayoutParams(layoutParams);
        c0758a2.setWillNotDraw(false);
        c0758a2.setVisibility(0);
        c0758a2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i11);
        View view2 = ((InterfaceC0561g) sparseArray2.get(i2)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        uVar.f5749B.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView2(int i2, int i5, int i7, int i8, int i9, int i10, int i11, FlutterMutatorsStack flutterMutatorsStack) {
        SurfaceControl surfaceControl;
        boolean isValid;
        SurfaceControl.Transaction alpha;
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (tVar.a(i2)) {
            C0758a c0758a = (C0758a) tVar.f5739r.get(i2);
            c0758a.f6979d = flutterMutatorsStack;
            c0758a.f6981i = i5;
            c0758a.f6982l = i7;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i9, 51);
            layoutParams.leftMargin = i5;
            layoutParams.topMargin = i7;
            c0758a.setLayoutParams(layoutParams);
            c0758a.setWillNotDraw(false);
            c0758a.setVisibility(0);
            c0758a.bringToFront();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i11, 51);
            View view = ((InterfaceC0561g) tVar.f5738q.get(i2)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.bringToFront();
                if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    HashSet hashSet = tVar.f5745x;
                    RectF rectF = new RectF(i5, i7, i8 + i5, i9 + i7);
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
                    rect.offset(-i5, -i7);
                    if (rect.width() < 0 || rect.height() < 0) {
                        rect.setEmpty();
                    }
                    float finalOpacity = flutterMutatorsStack.getFinalOpacity();
                    surfaceControl = surfaceView.getSurfaceControl();
                    if (surfaceControl == null) {
                        if (hashSet.contains(Integer.valueOf(i2))) {
                            return;
                        }
                        hashSet.add(Integer.valueOf(i2));
                        surfaceView.getHolder().addCallback(new io.flutter.plugin.platform.s(tVar, surfaceView, finalOpacity, rect, i2));
                        return;
                    }
                    isValid = surfaceControl.isValid();
                    if (!isValid) {
                        surfaceView.getId();
                        return;
                    }
                    SurfaceControl.Transaction g7 = v.g();
                    tVar.f5741t.add(g7);
                    alpha = g7.setAlpha(surfaceControl, finalOpacity);
                    alpha.setCrop(surfaceControl, rect);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public void onEndFrame() {
        ?? r32;
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z7 = false;
        if (!uVar.f5769y || !uVar.f5749B.isEmpty()) {
            if (uVar.f5769y) {
                h4.i iVar = uVar.f5756l.f5245l;
                if (iVar != null ? iVar.e() : false) {
                    z7 = true;
                }
            }
            uVar.e(z7);
            return;
        }
        uVar.f5769y = false;
        h4.p pVar = uVar.f5756l;
        A.k kVar = new A.k(18, uVar);
        h4.i iVar2 = pVar.f5245l;
        if (iVar2 == null || (r32 = pVar.f5247n) == 0) {
            return;
        }
        pVar.f5246m = r32;
        pVar.f5247n = null;
        io.flutter.embedding.engine.renderer.j jVar = pVar.f5250q.f5502b;
        if (jVar != null) {
            r32.b();
            jVar.a(new o(pVar, jVar, kVar));
            return;
        }
        iVar2.a();
        h4.i iVar3 = pVar.f5245l;
        if (iVar3 != null) {
            iVar3.f5209d.close();
            pVar.removeView(pVar.f5245l);
            pVar.f5245l = null;
        }
        kVar.run();
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

    public void onSurfaceChanged(int i2, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i2, i5);
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

    public void onVsync(long j, long j7, long j8) {
        nativeOnVsync(j, j7, j8);
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

    public void registerImageTexture(long j, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(textureRegistry$ImageConsumer), z7);
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(InterfaceC0546b interfaceC0546b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC0546b);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(kVar);
    }

    public void removeResizingFlutterUiListener(io.flutter.embedding.engine.renderer.l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(lVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j);
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

    public void setDeferredComponentManager(InterfaceC0600a interfaceC0600a) {
        ensureRunningOnMainThread();
        if (interfaceC0600a != null) {
            interfaceC0600a.a();
        }
    }

    public void setLocalizationPlugin(a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(InterfaceC0581j interfaceC0581j) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = interfaceC0581j;
    }

    public void setPlatformViewsController(u uVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = uVar;
    }

    public void setPlatformViewsController2(t tVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = tVar;
    }

    public void setRefreshRateFPS(float f7) {
        refreshRateFPS = f7;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z7);
        }
    }

    public void setSemanticsEnabledInNative(boolean z7) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z7);
    }

    public void setSemanticsTreeEnabled(boolean z7) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar == null || z7) {
            return;
        }
        io.flutter.view.g gVar = (io.flutter.view.g) ((io.flutter.view.a) kVar).f5787a;
        gVar.f5885g.clear();
        io.flutter.view.f fVar = gVar.f5887i;
        if (fVar != null) {
            gVar.h(fVar.f5849b, 65536);
        }
        gVar.f5887i = null;
        gVar.f5893p = null;
        AccessibilityEvent e7 = gVar.e(0, 2048);
        e7.setContentChangeTypes(1);
        gVar.i(e7);
    }

    public void setSettingsChannel(n nVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = nVar;
    }

    public void setViewportMetrics(float f7, int i2, int i5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int[] iArr3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f7, i2, i5, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, iArr, iArr2, iArr3, i20, i21, i22, i23, i24, i25, i26, i27);
    }

    public void showOverlaySurface2() {
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (tVar.f5744w == null) {
            return;
        }
        SurfaceControl.Transaction g7 = v.g();
        tVar.f5741t.add(g7);
        g7.setVisibility(tVar.f5744w, true);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
        Long l7 = nativeSpawn.nativeShellHolderId;
        if ((l7 == null || l7.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        t tVar = this.platformViewsController2;
        if (tVar == null) {
            throw new RuntimeException("");
        }
        synchronized (tVar) {
            tVar.f5742u.clear();
            tVar.f5742u.addAll(tVar.f5741t);
            tVar.f5741t.clear();
        }
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i2, float f7, float f8, float f9) {
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

    public void dispatchSemanticsAction(int i2, io.flutter.view.d dVar, Object obj) {
        ByteBuffer byteBuffer;
        int i5;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = s4.v.f7772a.a(obj);
            i5 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i5 = 0;
        }
        dispatchSemanticsAction(i2, dVar.f5816d, byteBuffer, i5);
    }

    public void dispatchSemanticsAction(int i2, int i5, ByteBuffer byteBuffer, int i7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i5, byteBuffer, i7);
    }
}
