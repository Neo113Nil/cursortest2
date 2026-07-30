package io.flutter.embedding.engine;

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
import androidx.lifecycle.q;
import e0.h0;
import e0.k;
import e0.u;
import f0.l;
import f0.m;
import f0.n;
import f0.o;
import g0.e;
import g0.h;
import h0.a;
import i0.d;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
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
import n.g;
import o0.b;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static o asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private n accessibilityDelegate;
    private a deferredComponentManager;
    private b localizationPlugin;
    private Long nativeShellHolderId;
    private h platformMessageHandler;
    private j platformViewsController;
    private i platformViewsController2;
    private m0.n settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<f0.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.i> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.j> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        o oVar = asyncWaitForVsyncDelegate;
        if (oVar == null) {
            l.b("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
            return;
        }
        Choreographer choreographer = Choreographer.getInstance();
        t tVar = (t) ((c) oVar).f541a;
        s sVar = tVar.f641c;
        if (sVar != null) {
            sVar.f635a = j2;
            tVar.f641c = null;
        } else {
            sVar = new s(tVar, j2);
        }
        choreographer.postFrameCallback(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j2) {
        i0.b bVar;
        androidx.lifecycle.n nVar = 0;
        nVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        m mVar = new m(j2);
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
            dVar.f380d = options.outMimeType;
            dVar.f382f = options.outHeight;
            dVar.f383g = options.outWidth;
        } catch (Exception e2) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e2);
        }
        if ("image/heif".equals(dVar.f380d)) {
            try {
                i0.c cVar = new i0.c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                a.a.v(dVar, mediaExtractor);
            } catch (Exception e3) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
            }
            nativeImageHeaderCallback(mVar.f330a, dVar.f377a, dVar.f378b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    n.c c2 = gVar.c("Orientation");
                    if (c2 != null) {
                        try {
                            i2 = c2.e(gVar.f919e);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f381e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e4) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e4);
            }
        }
        if ("image/heif".equals(dVar.f380d)) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 36) {
                bVar = new i0.b(nVar, 0);
            } else if (i3 < 36) {
                bVar = new i0.b(nVar, 1);
            }
            nVar = bVar;
        }
        if (nVar == 0) {
            nVar = new androidx.lifecycle.n(5, mVar);
        }
        return nVar.o(byteBuffer, dVar);
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
        n0.d dVar;
        h hVar = this.platformMessageHandler;
        if (hVar == null || (dVar = (n0.d) ((g0.g) hVar).f359g.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            dVar.a(byteBuffer);
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

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24);

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
        Iterator<f0.b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        n nVar = this.accessibilityDelegate;
        if (nVar != null) {
            ((io.flutter.view.i) ((c) nVar).f541a).f612l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        n nVar = this.accessibilityDelegate;
        if (nVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.i iVar = (io.flutter.view.i) ((c) nVar).f541a;
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.g a2 = iVar.a(byteBuffer.getInt());
                a2.f569c = byteBuffer.getInt();
                a2.f570d = io.flutter.view.i.c(byteBuffer, strArr);
                a2.f571e = io.flutter.view.i.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        n nVar = this.accessibilityDelegate;
        if (nVar != null) {
            ((c) nVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(f0.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(jVar);
    }

    public void applyTransactions() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = iVar.f508j;
        SurfaceControl.Transaction h2 = q.h();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            h2 = h2.merge(q.j(arrayList.get(i2)));
        }
        h2.apply();
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
        Context context = this.localizationPlugin.f1017b;
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
                arrayList2.add(e0.a.l(language));
                e0.a.n();
                arrayList2.add(e0.a.l(locale3.getLanguage()));
                e0.a.n();
                arrayList2.add(e0.a.l(locale3.getLanguage() + "-*"));
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
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        Context context = jVar.f515d.getContext();
        int width = jVar.f515d.getWidth();
        int height = jVar.f515d.getHeight();
        io.flutter.plugin.platform.a aVar = jVar.f520i;
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(context, width, height, 2);
        bVar.f489h = aVar;
        int i2 = jVar.f526p;
        jVar.f526p = i2 + 1;
        jVar.f524n.put(i2, bVar);
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
        if (iVar.f510l == null) {
            SurfaceControl.Builder g2 = q.g();
            g2.setBufferSize(iVar.f502d.getWidth(), iVar.f502d.getHeight());
            g2.setFormat(1);
            g2.setName("Flutter Overlay Surface");
            g2.setOpaque(false);
            g2.setHidden(false);
            build = g2.build();
            rootSurfaceControl = iVar.f502d.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            iVar.f510l = q.f(build);
            iVar.m = build;
        }
        return new FlutterOverlaySurface(0, iVar.f510l);
    }

    public SurfaceControl.Transaction createTransaction() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h2 = q.h();
        iVar.f508j.add(h2);
        return h2;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = iVar.f510l;
        if (surface != null) {
            surface.release();
            iVar.f510l = null;
            iVar.m = null;
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

    public void dispatchSemanticsAction(int i2, f fVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = n0.l.f933a.b(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, fVar.f566b, byteBuffer, i3);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = iVar.f509k;
        SurfaceControl.Transaction h2 = q.h();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            h2 = h2.merge(q.j(arrayList.get(i2)));
        }
        arrayList.clear();
        iVar.f502d.invalidate();
        rootSurfaceControl = iVar.f502d.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(h2);
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
        m0.m mVar;
        m0.n nVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (nVar != null) {
            h0 h0Var = nVar.f818a;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) h0Var.f151a;
            if (((m0.m) h0Var.f152b) == null) {
                h0Var.f152b = (m0.m) concurrentLinkedQueue.poll();
            }
            while (true) {
                mVar = (m0.m) h0Var.f152b;
                if (mVar == null || mVar.f816a >= i2) {
                    break;
                }
                h0Var.f152b = (m0.m) concurrentLinkedQueue.poll();
            }
            if (mVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (mVar.f816a != i2) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", the oldest config is now: " + ((m0.m) h0Var.f152b).f816a);
                }
                if (mVar != null) {
                    displayMetrics = mVar.f817b;
                }
            }
            mVar = null;
            if (mVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i2 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        e eVar;
        boolean z2;
        h hVar = this.platformMessageHandler;
        if (hVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        g0.g gVar = (g0.g) hVar;
        synchronized (gVar.f357e) {
            try {
                eVar = (e) gVar.f355c.get(str);
                z2 = gVar.f358f.get() && eVar == null;
                if (z2) {
                    if (!gVar.f356d.containsKey(str)) {
                        gVar.f356d.put(str, new LinkedList());
                    }
                    ((List) gVar.f356d.get(str)).add(new g0.d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        gVar.a(str, eVar, byteBuffer, i2, j2);
    }

    public void hideOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (iVar.m == null) {
            return;
        }
        SurfaceControl.Transaction h2 = q.h();
        iVar.f508j.add(h2);
        h2.setVisibility(iVar.m, false);
    }

    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (iVar.f506h.get(i2) == null) {
            return;
        }
        l.a();
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
        c0.a c2;
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        l lVar = new l();
        c0.b bVar = new c0.b(1);
        c0.b bVar2 = new c0.b(0);
        c0.e eVar = new c0.e();
        eVar.f70a = new HashSet();
        eVar.f71b = bVar;
        eVar.f72c = bVar2;
        eVar.f73d = lVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if ("flutter".length() == 0) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        eVar.f("Beginning load of %s...", "flutter");
        c0.b bVar3 = (c0.b) eVar.f71b;
        HashSet hashSet = (HashSet) eVar.f70a;
        if (hashSet.contains("flutter")) {
            eVar.f("%s already loaded previously!", "flutter");
        } else {
            c0.a aVar = null;
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
                    File[] listFiles = dir.listFiles(new c0.d(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(e4.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    c0.b bVar4 = (c0.b) eVar.f72c;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    bVar4.getClass();
                    try {
                        c2 = c0.b.c(context, strArr2, mapLibraryName, eVar);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (c2 == null) {
                            try {
                                strArr = c0.b.d(context, mapLibraryName);
                            } catch (Exception e5) {
                                strArr = new String[]{e5.toString()};
                            }
                            throw new c0.c(mapLibraryName, strArr2, strArr);
                        }
                        ZipFile zipFile = (ZipFile) c2.f66c;
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            if (i2 < 5) {
                                eVar.f("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (e3.exists() || e3.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) c2.f67d);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(e3);
                                                try {
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
                                                            c0.b.a(inputStream2);
                                                            c0.b.a(fileOutputStream2);
                                                            e3.setReadable(true, false);
                                                            e3.setExecutable(true, false);
                                                            e3.setWritable(true);
                                                            break;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        inputStream = inputStream2;
                                                        fileOutputStream = fileOutputStream2;
                                                        c0.b.a(inputStream);
                                                        c0.b.a(fileOutputStream);
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException | IOException unused) {
                                                }
                                            } catch (FileNotFoundException unused2) {
                                                fileOutputStream2 = null;
                                                c0.b.a(inputStream2);
                                                c0.b.a(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused3) {
                                                fileOutputStream2 = null;
                                                c0.b.a(inputStream2);
                                                c0.b.a(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                c0.b.a(inputStream);
                                                c0.b.a(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused4) {
                                            inputStream2 = null;
                                        } catch (IOException unused5) {
                                            inputStream2 = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = null;
                                        }
                                        c0.b.a(inputStream2);
                                        c0.b.a(fileOutputStream2);
                                    }
                                } catch (IOException unused6) {
                                }
                                i2 = i3;
                            } else if (((l) eVar.f73d) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused7) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        aVar = c2;
                        if (aVar != null) {
                            try {
                                ((ZipFile) aVar.f66c).close();
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
            View view = ((e0.s) it.next()).f207a.f215e;
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
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        jVar.f529s.clear();
        jVar.f530t.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = jVar.f524n;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        jVar.f();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i2);
        if (view.getParent() == null) {
            jVar.f515d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        jVar.f529s.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        jVar.f();
        if (jVar.f523l.get(i2) == null) {
            return;
        }
        l.a();
    }

    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (iVar.f506h.get(i2) == null) {
            return;
        }
        l.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!jVar.f527q || !jVar.f530t.isEmpty()) {
            if (jVar.f527q) {
                k kVar = jVar.f515d.f214d;
                if (kVar != null ? kVar.e() : false) {
                    z2 = true;
                }
            }
            jVar.d(z2);
            return;
        }
        jVar.f527q = false;
        u uVar = jVar.f515d;
        androidx.lifecycle.k kVar2 = new androidx.lifecycle.k(1, jVar);
        k kVar3 = uVar.f214d;
        if (kVar3 == null || (r3 = uVar.f216f) == 0) {
            return;
        }
        uVar.f215e = r3;
        uVar.f216f = null;
        io.flutter.embedding.engine.renderer.h hVar = uVar.f219i.f269b;
        if (hVar != null) {
            r3.d();
            hVar.a(new e0.t(uVar, hVar, kVar2));
            return;
        }
        kVar3.c();
        k kVar4 = uVar.f214d;
        if (kVar4 != null) {
            kVar4.f168a.close();
            uVar.removeView(uVar.f214d);
            uVar.f214d = null;
        }
        kVar2.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.i> it = this.flutterUiDisplayListeners.iterator();
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

    public void removeEngineLifecycleListener(f0.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.i iVar) {
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

    public void setAccessibilityDelegate(n nVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = nVar;
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

    public void setAsyncWaitForVsyncDelegate(o oVar) {
        asyncWaitForVsyncDelegate = oVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(b bVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = bVar;
    }

    public void setPlatformMessageHandler(h hVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = hVar;
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
        n nVar = this.accessibilityDelegate;
        if (nVar == null || z2) {
            return;
        }
        io.flutter.view.i iVar = (io.flutter.view.i) ((c) nVar).f541a;
        iVar.f607g.clear();
        io.flutter.view.h hVar = iVar.f609i;
        if (hVar != null) {
            iVar.g(hVar.f574b, 65536);
        }
        iVar.f609i = null;
        iVar.f614o = null;
        AccessibilityEvent d2 = iVar.d(0, 2048);
        d2.setContentChangeTypes(1);
        iVar.h(d2);
    }

    public void setSettingsChannel(m0.n nVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = nVar;
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3, i17, i18, i19, i20, i21, i22, i23, i24);
    }

    public void showOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (iVar.m == null) {
            return;
        }
        SurfaceControl.Transaction h2 = q.h();
        iVar.f508j.add(h2);
        h2.setVisibility(iVar.m, true);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j2);
        Long l2 = nativeSpawn.nativeShellHolderId;
        if ((l2 == null || l2.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        l.b("Failed to spawn new JNI connected shell from existing shell.");
        return null;
    }

    public void swapTransactions() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("");
        }
        synchronized (iVar) {
            iVar.f509k.clear();
            iVar.f509k.addAll(iVar.f508j);
            iVar.f508j.clear();
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

    public void dispatchSemanticsAction(int i2, f fVar) {
        dispatchSemanticsAction(i2, fVar, null);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }
}
