package com.baidu.platform.comjni.map.basemap;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.q;
import com.baidu.platform.comjni.NativeComponent;
import com.baidu.platform.comjni.tools.ParcelItem;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class NABaseMap extends NativeComponent {

    /* renamed from: b, reason: collision with root package name */
    private long f10572b;

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f10571a = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f10573c = false;

    /* renamed from: d, reason: collision with root package name */
    private final ReadWriteLock f10574d = new ReentrantReadWriteLock(true);

    /* renamed from: e, reason: collision with root package name */
    private final Set<Long> f10575e = new CopyOnWriteArraySet();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f10576a;

        a(Bundle bundle) {
            this.f10576a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            Bundle bundle = this.f10576a;
                            if (bundle != null) {
                                if (NABaseMap.this.a(bundle.getLong("itemaddr", 0L))) {
                                    if (tryLock) {
                                        NABaseMap.this.f10574d.readLock().unlock();
                                        return;
                                    }
                                    return;
                                }
                            }
                            NABaseMap nABaseMap = NABaseMap.this;
                            nABaseMap.nativeRemoveItemData(nABaseMap.f10572b, this.f10576a);
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    NABaseMap.this.f10574d.readLock().unlock();
                }
                throw th;
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f10578a;

        b(Bundle bundle) {
            this.f10578a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NABaseMap.this.a()) {
                try {
                    try {
                        boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                        if (tryLock) {
                            try {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeAddOneOverlayItem(nABaseMap.f10572b, this.f10578a);
                            } catch (Exception unused) {
                                if (!tryLock) {
                                    return;
                                }
                            }
                        }
                        if (!tryLock) {
                            return;
                        }
                        NABaseMap.this.f10574d.readLock().unlock();
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        NABaseMap.this.f10574d.readLock().unlock();
                    }
                    throw th;
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle[] f10580a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10581b;

        c(Bundle[] bundleArr, int i8) {
            this.f10580a = bundleArr;
            this.f10581b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NABaseMap.this.a()) {
                try {
                    try {
                        boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                        if (tryLock) {
                            try {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeAddOverlayItems(nABaseMap.f10572b, this.f10580a, this.f10581b);
                            } catch (Exception unused) {
                                if (!tryLock) {
                                    return;
                                }
                            }
                        }
                        if (!tryLock) {
                            return;
                        }
                        NABaseMap.this.f10574d.readLock().unlock();
                    } catch (Throwable th) {
                        if (0 != 0) {
                            NABaseMap.this.f10574d.readLock().unlock();
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f10583a;

        d(Bundle bundle) {
            this.f10583a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NABaseMap.this.a()) {
                try {
                    try {
                        boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                        if (tryLock) {
                            try {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeUpdateOneOverlayItem(nABaseMap.f10572b, this.f10583a);
                            } catch (Exception unused) {
                                if (!tryLock) {
                                    return;
                                }
                            }
                        }
                        if (!tryLock) {
                            return;
                        }
                        NABaseMap.this.f10574d.readLock().unlock();
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        NABaseMap.this.f10574d.readLock().unlock();
                    }
                    throw th;
                }
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f10585a;

        e(Bundle bundle) {
            this.f10585a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NABaseMap.this.a()) {
                try {
                    try {
                        boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                        if (tryLock) {
                            try {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeRemoveOneOverlayItem(nABaseMap.f10572b, this.f10585a);
                            } catch (Exception unused) {
                                if (!tryLock) {
                                    return;
                                }
                            }
                        }
                        if (!tryLock) {
                            return;
                        }
                        NABaseMap.this.f10574d.readLock().unlock();
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        NABaseMap.this.f10574d.readLock().unlock();
                    }
                    throw th;
                }
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle[] f10587a;

        f(Bundle[] bundleArr) {
            this.f10587a = bundleArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            boolean z7;
            if (!NABaseMap.this.a()) {
                return;
            }
            try {
                z7 = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                if (z7) {
                    try {
                        for (Bundle bundle : this.f10587a) {
                            if (NABaseMap.this.f10573c) {
                                break;
                            }
                            NABaseMap nABaseMap = NABaseMap.this;
                            nABaseMap.nativeRemoveOneOverlayItem(nABaseMap.f10572b, bundle);
                        }
                    } catch (Exception unused) {
                        if (!z7) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z7) {
                            NABaseMap.this.f10574d.readLock().unlock();
                        }
                        throw th;
                    }
                }
                if (!z7) {
                    return;
                }
                NABaseMap.this.f10574d.readLock().unlock();
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
                z7 = false;
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10589a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10590b;

        g(long j8, boolean z7) {
            this.f10589a = j8;
            this.f10590b = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            if (!NABaseMap.this.a(this.f10589a)) {
                                if (NABaseMap.this.f10573c) {
                                    if (tryLock) {
                                        NABaseMap.this.f10574d.readLock().unlock();
                                        return;
                                    }
                                    return;
                                }
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeShowLayers(nABaseMap.f10572b, this.f10589a, this.f10590b);
                            }
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    NABaseMap.this.f10574d.readLock().unlock();
                }
                throw th;
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10593b;

        h(long j8, boolean z7) {
            this.f10592a = j8;
            this.f10593b = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            if (!NABaseMap.this.a(this.f10592a)) {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeSetLayersClickable(nABaseMap.f10572b, this.f10592a, this.f10593b);
                            }
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    NABaseMap.this.f10574d.readLock().unlock();
                }
                throw th;
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10595a;

        i(long j8) {
            this.f10595a = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            if (!NABaseMap.this.a(this.f10595a)) {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeUpdateLayers(nABaseMap.f10572b, this.f10595a);
                            }
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Throwable th) {
                    if (0 != 0) {
                        NABaseMap.this.f10574d.readLock().unlock();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10597a;

        j(long j8) {
            this.f10597a = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.writeLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            NABaseMap.this.f10575e.add(Long.valueOf(this.f10597a));
                            NABaseMap nABaseMap = NABaseMap.this;
                            nABaseMap.nativeRemoveLayer(nABaseMap.f10572b, this.f10597a);
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.writeLock().unlock();
                } catch (Throwable th) {
                    if (0 != 0) {
                        NABaseMap.this.f10574d.writeLock().unlock();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10599a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f10600b;

        k(long j8, long j9) {
            this.f10599a = j8;
            this.f10600b = j9;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            if (!NABaseMap.this.a(this.f10599a) && !NABaseMap.this.a(this.f10600b)) {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeSwitchLayer(nABaseMap.f10572b, this.f10599a, this.f10600b);
                            }
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    NABaseMap.this.f10574d.readLock().unlock();
                }
                throw th;
            }
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10602a;

        l(long j8) {
            this.f10602a = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            if (!NABaseMap.this.a(this.f10602a)) {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeSyncClearLayer(nABaseMap.f10572b, this.f10602a);
                            }
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Throwable th) {
                    if (0 != 0) {
                        NABaseMap.this.f10574d.readLock().unlock();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10604a;

        m(long j8) {
            this.f10604a = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            if (!NABaseMap.this.a(this.f10604a)) {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeClearLayer(nABaseMap.f10572b, this.f10604a);
                            }
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Throwable th) {
                    if (0 != 0) {
                        NABaseMap.this.f10574d.readLock().unlock();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f10607b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10608c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f10609d;

        n(long j8, long j9, boolean z7, Bundle bundle) {
            this.f10606a = j8;
            this.f10607b = j9;
            this.f10608c = z7;
            this.f10609d = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            if (!NABaseMap.this.a(this.f10606a)) {
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeSetFocus(nABaseMap.f10572b, this.f10606a, this.f10607b, this.f10608c, this.f10609d);
                            }
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Throwable th) {
                    if (0 != 0) {
                        NABaseMap.this.f10574d.readLock().unlock();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f10611a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10612b;

        o(Bundle bundle, boolean z7) {
            this.f10611a = bundle;
            this.f10612b = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    boolean tryLock = NABaseMap.this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    if (tryLock) {
                        try {
                            Bundle bundle = this.f10611a;
                            if (bundle != null) {
                                if (NABaseMap.this.a(bundle.getLong("itemaddr", 0L))) {
                                    if (tryLock) {
                                        NABaseMap.this.f10574d.readLock().unlock();
                                        return;
                                    }
                                    return;
                                }
                            }
                            NABaseMap nABaseMap = NABaseMap.this;
                            nABaseMap.nativeAddItemData(nABaseMap.f10572b, this.f10611a, this.f10612b);
                        } catch (Exception unused) {
                            if (!tryLock) {
                                return;
                            }
                        }
                    }
                    if (!tryLock) {
                        return;
                    }
                    NABaseMap.this.f10574d.readLock().unlock();
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    NABaseMap.this.f10574d.readLock().unlock();
                }
                throw th;
            }
        }
    }

    private native void nativSetAuto3DEnter3DByZoomIn(long j8, boolean z7);

    private native void nativeAdd3DModelIDForFilterList(long j8, String str);

    private native boolean nativeAddBmLayerBelow(long j8, long j9, long j10, int i8, int i9);

    private native void nativeAddHexagonMapData(long j8, long j9, Bundle bundle);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAddItemData(long j8, Bundle bundle, boolean z7);

    private native long nativeAddLayer(long j8, int i8, int i9, String str);

    private native void nativeAddPopupData(long j8, Bundle bundle);

    private native void nativeAddRtPopData(long j8, Bundle bundle);

    private native void nativeAddStreetCustomMarker(long j8, Bundle bundle, Bitmap bitmap);

    private native void nativeAttachDC(long j8, long j9);

    private native boolean nativeBeginLocationLayerAnimation(long j8);

    private native void nativeCancelPreload(long j8, int i8);

    private native boolean nativeCleanCache(long j8, int i8, boolean z7);

    private native void nativeClearFullscreenMaskColor(long j8);

    private native void nativeClearHeatMapLayerCache(long j8, long j9);

    private native void nativeClearHexagonLayerCache(long j8, long j9);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeClearLayer(long j8, long j9);

    private native void nativeClearLocationLayerData(long j8, Bundle bundle);

    private native void nativeClearMistmapLayer(long j8);

    private native void nativeClearParticleSystemMemory(long j8);

    private native void nativeClearUniversalLayer(long j8);

    private native boolean nativeCloseCache(long j8);

    private native void nativeCloseParticleEffect(long j8, String str);

    private native void nativeCloseParticleEffectByType(long j8, int i8);

    private native long nativeCreate();

    private native long nativeCreateDuplicate(long j8);

    private native boolean nativeCustomParticleEffectByType(long j8, int i8, Bundle bundle);

    private native boolean nativeDownloadMapStyle(long j8, String str);

    private native int nativeDraw(long j8);

    private native void nativeEnablePOIAnimation(long j8, boolean z7);

    private native void nativeEntrySearchTopic(long j8, int i8, String str, String str2);

    private native void nativeExitSearchTopic(long j8);

    private native void nativeFocusTrafficUGCLabel(long j8);

    private native String nativeGeoPt3ToScrPoint(long j8, int i8, int i9, int i10);

    private native String nativeGeoPtToScrPoint(long j8, int i8, int i9);

    private static native boolean nativeGet3DModelEnable(long j8);

    private native float nativeGetAdapterZoomUnitsEx(long j8);

    private native Bundle nativeGetBaseRoadData(long j8);

    private native int nativeGetCacheSize(long j8, int i8);

    private native boolean nativeGetCityInfoByBound(long j8, Bundle bundle);

    private native String nativeGetCityInfoByID(long j8, int i8);

    private native String nativeGetCurDrawPoiInfo(long j8, int i8);

    private native boolean nativeGetCustomTrafficColorEnable(long j8);

    private static native boolean nativeGetDEMEnable(long j8);

    private native float nativeGetDpiScale(long j8);

    private static native boolean nativeGetDrawHouseHeightEnable(long j8);

    private native Bundle nativeGetDrawingMapStatus(long j8);

    private native float nativeGetFZoomToBoundF(long j8, Bundle bundle, Bundle bundle2);

    private native String nativeGetFocusedBaseIndoorMapInfo(long j8);

    private native int nativeGetFontSizeLevel(long j8);

    private static native int nativeGetHouseSmoothLevel(long j8);

    private native int nativeGetIndoorMapShowMode(long j8, String str);

    private static native long nativeGetLayerIDByTag(long j8, String str);

    private native int nativeGetLayerPos(long j8, long j9);

    private native boolean nativeGetMapBarData(long j8, Bundle bundle);

    private native int nativeGetMapLanguage(long j8);

    private native int nativeGetMapRenderType(long j8);

    private native int nativeGetMapScene(long j8);

    private native int nativeGetMapSceneAttr(long j8);

    private native Bundle nativeGetMapStatus(long j8, boolean z7);

    private static native Bundle nativeGetMapStatusLimits(long j8);

    private native boolean nativeGetMapStatusLimitsLevel(long j8, int[] iArr);

    private native int nativeGetMapTheme(long j8);

    private native String nativeGetNearlyObjID(long j8, long j9, int i8, int i9, int i10);

    private native String nativeGetPoiMarkData(long j8, int i8, int i9, int i10, int i11, boolean z7);

    private static native boolean nativeGetPoiTagEnable(long j8, int i8);

    private static native void nativeGetProjectionMatrix(long j8, float[] fArr);

    private native String nativeGetProjectionPt(long j8, String str);

    private native int nativeGetScaleLevel(long j8, int i8, int i9);

    private native int nativeGetSkyOffset(long j8);

    private static native int nativeGetSkyboxStyle(long j8);

    private native String nativeGetStreetRoadNearPointFromCenter(long j8, double d8, double d9, int i8);

    private native int nativeGetVMPMapCityInfo(long j8, Bundle bundle);

    private static native void nativeGetViewMatrix(long j8, float[] fArr);

    private native boolean nativeGetVirtualPoiShowEnable(long j8);

    private native float nativeGetZoomToBound(long j8, Bundle bundle, int i8, int i9);

    private native float nativeGetZoomToBoundF(long j8, Bundle bundle);

    private native boolean nativeImportMapTheme(long j8, int i8);

    private native boolean nativeInit(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7, boolean z8);

    private native boolean nativeInitCustomStyle(long j8, String str, String str2);

    private native void nativeInitHeatMapData(long j8, long j9, Bundle bundle);

    private native int nativeInitLayerCallback(long j8);

    private native boolean nativeInitWithBundle(long j8, Bundle bundle, boolean z7);

    private native long nativeInsertLayerAt(long j8, int i8, int i9, int i10, String str);

    private native void nativeInterruptDraw(long j8, boolean z7);

    private native boolean nativeIsAnimationRunning(long j8);

    private native boolean nativeIsBaseIndoorMapMode(long j8);

    private native boolean nativeIsBaseIndoorMapShow(long j8);

    private native boolean nativeIsEnableIndoor3D(long j8);

    private native boolean nativeIsNaviMode(long j8);

    private native boolean nativeIsPointInFocusBarBorder(long j8, double d8, double d9, double d10);

    private native boolean nativeIsPointInFocusIDRBorder(long j8, double d8, double d9);

    private native boolean nativeIsStreetArrowShown(long j8);

    private native boolean nativeIsStreetCustomMarkerShown(long j8);

    private native boolean nativeIsStreetPOIMarkerShown(long j8);

    private native boolean nativeIsStreetRoadClickable(long j8);

    private native boolean nativeIsSupBackgroundDraw(long j8);

    private native boolean nativeLayersIsShow(long j8, long j9);

    private native boolean nativeMoveLayerBelow(long j8, long j9, String str);

    private native boolean nativeMoveLayerBelowTo(long j8, long j9, int i8);

    private native void nativeMoveToScrPoint(long j8, int i8, int i9);

    private native void nativeNewSetMapStatus(long j8, Bundle bundle);

    private native void nativeOnBackground(long j8);

    private native void nativeOnForeground(long j8);

    private native void nativeOnGestureFinish(long j8);

    private native void nativeOnGestureStart(long j8);

    private native String nativeOnHotcityGet(long j8);

    private native void nativeOnPause(long j8);

    private native boolean nativeOnRecordAdd(long j8, int i8);

    private native String nativeOnRecordGetAll(long j8);

    private native String nativeOnRecordGetAt(long j8, int i8);

    private native boolean nativeOnRecordImport(long j8, boolean z7, boolean z8);

    private native boolean nativeOnRecordReload(long j8, int i8, boolean z7);

    private native boolean nativeOnRecordRemove(long j8, int i8, boolean z7);

    private native boolean nativeOnRecordStart(long j8, int i8, boolean z7, int i9);

    private native boolean nativeOnRecordSuspend(long j8, int i8, boolean z7, int i9);

    private native void nativeOnResume(long j8);

    private native String nativeOnSchcityGet(long j8, String str);

    private native boolean nativeOnUsrcityMsgInterval(long j8, int i8);

    private native int nativeOnWifiRecordAdd(long j8, int i8);

    private native boolean nativePerformAction(long j8, String str);

    private native void nativePreLoadParticleFile(long j8, String str);

    private native boolean nativePreload(long j8, Bundle bundle, int i8);

    private native int nativeQueryInterface(long j8);

    private native byte[] nativeReadMapResData(long j8, String str);

    private native void nativeRecycleMemory(long j8, int i8);

    private native int nativeRelease(long j8);

    private native void nativeRemove3DModelIDForFilterList(long j8, String str);

    private native boolean nativeRemoveBmLayer(long j8, long j9);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeRemoveItemData(long j8, Bundle bundle);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeRemoveLayer(long j8, long j9);

    private native void nativeRemoveStreetAllCustomMarker(long j8);

    private native void nativeRemoveStreetCustomMaker(long j8, String str);

    private static native void nativeRenderClearShaderCache(String str);

    private static native void nativeRenderInit(long j8, int i8, int i9, Surface surface, int i10);

    private native void nativeRenderResize(long j8, int i8, int i9);

    private native void nativeResetImageRes(long j8);

    private native boolean nativeResumeCache(long j8);

    private native boolean nativeSaveCache(long j8);

    private native void nativeSaveScreenToLocal(long j8, String str, String str2);

    private native String nativeScr2GeoInGesture(long j8, int i8, int i9);

    private native String nativeScrPtToGeoPoint(long j8, int i8, int i9);

    private static native void nativeSet3DModelEnable(long j8, boolean z7);

    private native void nativeSetAllStreetCustomMarkerVisibility(long j8, boolean z7);

    private native void nativeSetBackgroundColor(long j8, int i8);

    private native void nativeSetCustomStyleEnable(long j8, boolean z7);

    private native void nativeSetCustomTrafficColor(long j8, int i8, int i9, int i10, int i11);

    private native void nativeSetCustomTrafficColorEnable(long j8, boolean z7);

    private native void nativeSetCustomVMPDataRoot(long j8, String str);

    private static native void nativeSetDEMEnable(long j8, boolean z7);

    private native void nativeSetDpiScale(long j8, float f8);

    private static native void nativeSetDrawHouseHeightEnable(long j8, boolean z7);

    private native void nativeSetEnableIndoor3D(long j8, boolean z7);

    private native void nativeSetFeatureConfig(long j8, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native String nativeSetFocus(long j8, long j9, long j10, boolean z7, Bundle bundle);

    private native void nativeSetFontSizeLevel(long j8, int i8);

    private native void nativeSetFullscreenMaskColor(long j8, int i8);

    private native void nativeSetGlobalLightEnable(long j8, boolean z7);

    private native void nativeSetHeatMapFrameAnimationIndex(long j8, long j9, int i8);

    private static native void nativeSetHouseSmoothLevel(long j8, int i8);

    private native void nativeSetIndoorMapShowMode(long j8, String str, int i8);

    private native boolean nativeSetItsPreTime(long j8, int i8, int i9, int i10);

    private native boolean nativeSetLayerSceneMode(long j8, long j9, int i8);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetLayersClickable(long j8, long j9, boolean z7);

    private static native void nativeSetLittle3DEnable(long j8, boolean z7);

    private native void nativeSetLocationLayerData(long j8, Bundle bundle);

    private native void nativeSetMapBackgroundImage(long j8, Bundle bundle);

    private native int nativeSetMapControlMode(long j8, int i8);

    private native void nativeSetMapLanguage(long j8, int i8, boolean z7);

    private native boolean nativeSetMapScene(long j8, int i8);

    private native boolean nativeSetMapSceneAttr(long j8, int i8);

    private native void nativeSetMapStatus(long j8, Bundle bundle);

    private static native void nativeSetMapStatusLimits(long j8, Bundle bundle);

    private native boolean nativeSetMapStatusLimitsLevel(long j8, int i8, int i9);

    private native boolean nativeSetMapTheme(long j8, int i8, Bundle bundle);

    private native boolean nativeSetMapThemeScene(long j8, int i8, int i9, Bundle bundle);

    private static native void nativeSetMaxAndMinZoomLevel(long j8, Bundle bundle);

    private native void nativeSetPoiTagEnable(long j8, int i8, boolean z7);

    private native void nativeSetRecommendPOIScene(long j8, int i8);

    private static native void nativeSetSkyboxStyle(long j8, int i8);

    private native void nativeSetStreetArrowShow(long j8, boolean z7);

    private static native void nativeSetStreetLayerNewDesignFlag(long j8, boolean z7);

    private native void nativeSetStreetMarkerClickable(long j8, String str, boolean z7);

    private native void nativeSetStreetRoadClickable(long j8, boolean z7);

    private native void nativeSetStyleMode(long j8, int i8);

    private native void nativeSetSupBackgroundDraw(long j8, boolean z7);

    private native void nativeSetTargetStreetCustomMarkerVisibility(long j8, boolean z7, String str);

    private native boolean nativeSetTestSwitch(long j8, boolean z7);

    private native void nativeSetTrafficUGCData(long j8, String str);

    private native void nativeSetUniversalFilter(long j8, String str);

    private native void nativeSetUseCustomVMP(long j8, boolean z7);

    private native void nativeSetVirtualPoiShowEnable(long j8, boolean z7);

    private native void nativeShowBaseIndoorMap(long j8, boolean z7);

    private native void nativeShowFootMarkGrid(long j8, boolean z7, String str);

    private native void nativeShowHotMap(long j8, boolean z7, int i8);

    private native void nativeShowHotMapWithUid(long j8, boolean z7, int i8, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeShowLayers(long j8, long j9, boolean z7);

    private native void nativeShowMistMap(long j8, boolean z7, String str);

    private native void nativeShowOperatorDataByType(long j8, boolean z7, int i8);

    private native boolean nativeShowParticleEffect(long j8, int i8);

    private native boolean nativeShowParticleEffectByFileName(long j8, String str);

    private native boolean nativeShowParticleEffectByFilenameAndPos(long j8, String str, float f8, float f9, float f10);

    private native boolean nativeShowParticleEffectByName(long j8, String str, boolean z7);

    private native boolean nativeShowParticleEffectByType(long j8, int i8);

    private native boolean nativeShowParticleEffectByTypeAndPos(long j8, int i8, float f8, float f9, float f10);

    private native boolean nativeShowParticleEffectByTypeAndStyleID(long j8, int i8, int i9);

    private native void nativeShowSatelliteMap(long j8, boolean z7);

    private native void nativeShowStreetPOIMarker(long j8, boolean z7);

    private native void nativeShowStreetPopup(long j8, boolean z7);

    private native void nativeShowStreetRoadMap(long j8, boolean z7);

    private native void nativeShowTopicPOI(long j8, String str, boolean z7, String str2, boolean z8);

    private native void nativeShowTrafficMap(long j8, boolean z7);

    private native void nativeShowTrafficUGCMap(long j8, boolean z7);

    private native void nativeShowUniversalLayer(long j8, Bundle bundle);

    private native void nativeStartHeatMapFrameAnimation(long j8, long j9);

    private native void nativeStartIndoorAnimation(long j8);

    private native void nativeStopHeatMapFrameAnimation(long j8, long j9);

    private native void nativeSurfaceDestroyed(long j8, Surface surface);

    private native boolean nativeSwitchBaseIndoorMapFloor(long j8, String str, String str2);

    private native void nativeSwitchDayOrDarkTheme(long j8, int i8, boolean z7);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeSwitchLayer(long j8, long j9, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSyncClearLayer(long j8, long j9);

    private native void nativeUnFocusTrafficUGCLabel(long j8);

    private native void nativeUpdateBaseLayers(long j8);

    private native void nativeUpdateDrawFPS(long j8);

    private native void nativeUpdateFootMarkGrid(long j8);

    private native void nativeUpdateHeatMapData(long j8, long j9, Bundle bundle);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUpdateLayers(long j8, long j9);

    private native String nativeworldPointToScreenPoint(long j8, float f8, float f9, float f10);

    public static void renderClearShaderCache(String str) {
        nativeRenderClearShaderCache(str);
    }

    public String Scr2GeoInGesture(int i8, int i9) {
        long j8 = this.f10572b;
        return j8 != 0 ? nativeScr2GeoInGesture(j8, i8, i9) : "";
    }

    public void add3DModelIDForFilterList(String str) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeAdd3DModelIDForFilterList(j8, str);
        }
    }

    public boolean addBmLayerBelow(long j8, long j9, int i8, int i9) {
        return nativeAddBmLayerBelow(this.f10572b, j8, j9, i8, i9);
    }

    public void addHexagonMapData(long j8, Bundle bundle) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            nativeAddHexagonMapData(j9, j8, bundle);
        }
    }

    public void addItemData(Bundle bundle, boolean z7) {
        if (a()) {
            this.f10571a.submit(new o(bundle, z7));
        }
    }

    public long addLayer(int i8, int i9, String str) {
        long nativeAddLayer = nativeAddLayer(this.f10572b, i8, i9, str);
        this.f10575e.remove(Long.valueOf(nativeAddLayer));
        return nativeAddLayer;
    }

    public void addOneOverlayItem(Bundle bundle) {
        if (a()) {
            this.f10571a.submit(new b(bundle));
        }
    }

    public void addOverlayItems(Bundle[] bundleArr, int i8) {
        if (a()) {
            this.f10571a.submit(new c(bundleArr, i8));
        }
    }

    public void addPopupData(Bundle bundle) {
        nativeAddPopupData(this.f10572b, bundle);
    }

    public void addRtPopData(Bundle bundle) {
        nativeAddRtPopData(this.f10572b, bundle);
    }

    public void addStreetCustomMarker(Bundle bundle, Bitmap bitmap) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeAddStreetCustomMarker(j8, bundle, bitmap);
        }
    }

    public void beginLocationLayerAnimation() {
        nativeBeginLocationLayerAnimation(this.f10572b);
    }

    public void cancelPreload(int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeCancelPreload(j8, i8);
        }
    }

    public boolean cleanCache(int i8, boolean z7) {
        return nativeCleanCache(this.f10572b, i8, z7);
    }

    public void clearFullscreenMaskColor() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeClearFullscreenMaskColor(j8);
        }
    }

    public void clearHeatMapLayerCache(long j8) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            nativeClearHeatMapLayerCache(j9, j8);
        }
    }

    public void clearHexagonLayerCache(long j8) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            nativeClearHexagonLayerCache(j9, j8);
        }
    }

    public void clearLayer(long j8) {
        if (a()) {
            this.f10571a.submit(new m(j8));
        }
    }

    public void clearLocationLayerData(Bundle bundle) {
        nativeClearLocationLayerData(this.f10572b, bundle);
    }

    public void clearMistmapLayer() {
        nativeClearMistmapLayer(this.f10572b);
    }

    public void clearParticleSystemMemory() {
        nativeClearParticleSystemMemory(this.f10572b);
    }

    public void clearSDKLayer(long j8) {
        if (a()) {
            this.f10571a.submit(new l(j8));
        }
    }

    public void clearUniversalLayer() {
        nativeClearUniversalLayer(this.f10572b);
    }

    public boolean closeCache() {
        return nativeCloseCache(this.f10572b);
    }

    public void closeParticleEffect(String str) {
        nativeCloseParticleEffect(this.f10572b, str);
    }

    public void closeParticleEffectByType(int i8) {
        nativeCloseParticleEffectByType(this.f10572b, i8);
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
        long nativeCreate = nativeCreate();
        this.f10572b = nativeCreate;
        nativeInitLayerCallback(nativeCreate);
        return this.f10572b;
    }

    public long createByDuplicate(long j8) {
        long nativeCreateDuplicate = nativeCreateDuplicate(j8);
        this.f10572b = nativeCreateDuplicate;
        if (nativeCreateDuplicate != 0) {
            nativeInitLayerCallback(nativeCreateDuplicate);
        }
        return this.f10572b;
    }

    public long createDuplicate() {
        return nativeCreateDuplicate(this.f10572b);
    }

    public boolean customParticleEffectByType(int i8, Bundle bundle) {
        return nativeCustomParticleEffectByType(this.f10572b, i8, bundle);
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
        if (this.f10572b == 0) {
            return 0;
        }
        this.f10573c = true;
        b();
        int nativeRelease = nativeRelease(this.f10572b);
        this.f10572b = 0L;
        return nativeRelease;
    }

    public boolean downloadMapStyle(String str) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeDownloadMapStyle(j8, str);
        }
        return false;
    }

    public int draw() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeDraw(j8);
        }
        return 0;
    }

    public void enablePOIAnimation(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeEnablePOIAnimation(j8, z7);
        }
    }

    public void entrySearchTopic(int i8, String str, String str2) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeEntrySearchTopic(j8, i8, str, str2);
        }
    }

    public void exitSearchTopic() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeExitSearchTopic(j8);
        }
    }

    public void focusTrafficUGCLabel() {
        nativeFocusTrafficUGCLabel(this.f10572b);
    }

    public String geoPt3ToScrPoint(int i8, int i9, int i10) {
        return nativeGeoPt3ToScrPoint(this.f10572b, i8, i9, i10);
    }

    public String geoPtToScrPoint(int i8, int i9) {
        return nativeGeoPtToScrPoint(this.f10572b, i8, i9);
    }

    public boolean get3DModelEnable() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGet3DModelEnable(j8);
        }
        return false;
    }

    public float getAdapterZoomUnitsEx() {
        return nativeGetAdapterZoomUnitsEx(this.f10572b);
    }

    public Bundle getBaseRoadData() {
        long j8 = this.f10572b;
        if (j8 == 0) {
            return null;
        }
        return nativeGetBaseRoadData(j8);
    }

    public int getCacheSize(int i8) {
        return nativeGetCacheSize(this.f10572b, i8);
    }

    public boolean getCityInfoByBound(Bundle bundle) {
        return nativeGetCityInfoByBound(this.f10572b, bundle);
    }

    public String getCityInfoByID(int i8) {
        return nativeGetCityInfoByID(this.f10572b, i8);
    }

    public String getCurDrawPoiInfo(int i8) {
        long j8 = this.f10572b;
        return j8 != 0 ? nativeGetCurDrawPoiInfo(j8, i8) : "";
    }

    public boolean getCustomTrafficColorEnable() {
        long j8 = this.f10572b;
        if (0 == j8) {
            return false;
        }
        return nativeGetCustomTrafficColorEnable(j8);
    }

    public boolean getDEMEnable() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetDEMEnable(j8);
        }
        return false;
    }

    public float getDpiScale() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetDpiScale(j8);
        }
        return 1.0f;
    }

    public boolean getDrawHouseHeightEnable() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetDrawHouseHeightEnable(j8);
        }
        return false;
    }

    public Bundle getDrawingMapStatus() {
        return nativeGetDrawingMapStatus(this.f10572b);
    }

    public float getFZoomToBoundF(Bundle bundle, Bundle bundle2) {
        return nativeGetFZoomToBoundF(this.f10572b, bundle, bundle2);
    }

    public String getFocusedBaseIndoorMapInfo() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetFocusedBaseIndoorMapInfo(j8);
        }
        return null;
    }

    public int getFontSizeLevel() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetFontSizeLevel(j8);
        }
        return 1;
    }

    public int getHouseSmoothLevel() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetHouseSmoothLevel(j8);
        }
        return -1;
    }

    public int getIndoorMapShowMode(String str) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetIndoorMapShowMode(j8, str);
        }
        return 0;
    }

    public long getLayerIDByTag(String str) {
        if (this.f10572b == 0 || TextUtils.isEmpty(str)) {
            return 0L;
        }
        return nativeGetLayerIDByTag(this.f10572b, str);
    }

    public boolean getMapBarData(Bundle bundle) {
        return nativeGetMapBarData(this.f10572b, bundle);
    }

    public int getMapLanguage() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetMapLanguage(j8);
        }
        return 0;
    }

    public int getMapRenderType() {
        return nativeGetMapRenderType(this.f10572b);
    }

    public int getMapScene() {
        return nativeGetMapScene(this.f10572b);
    }

    public int getMapSceneAttr() {
        return nativeGetMapSceneAttr(this.f10572b);
    }

    public Bundle getMapStatus(boolean z7) {
        return nativeGetMapStatus(this.f10572b, z7);
    }

    public Bundle getMapStatusLimits() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetMapStatusLimits(j8);
        }
        return null;
    }

    public boolean getMapStatusLimitsLevel(int[] iArr) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetMapStatusLimitsLevel(j8, iArr);
        }
        return false;
    }

    public int getMapTheme() {
        return nativeGetMapTheme(this.f10572b);
    }

    public long getNativeMapPointer() {
        return this.f10572b;
    }

    public String getNearlyObjID(long j8, int i8, int i9, int i10) {
        boolean z7 = false;
        try {
            z7 = this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
            if (!z7) {
                if (z7) {
                    this.f10574d.readLock().unlock();
                }
                return "";
            }
            if (a(j8)) {
                if (z7) {
                    this.f10574d.readLock().unlock();
                }
                return "";
            }
            String nativeGetNearlyObjID = nativeGetNearlyObjID(this.f10572b, j8, i8, i9, i10);
            if (z7) {
                this.f10574d.readLock().unlock();
            }
            return nativeGetNearlyObjID;
        } catch (Exception unused) {
            if (z7) {
                this.f10574d.readLock().unlock();
            }
            return "";
        } catch (Throwable th) {
            if (z7) {
                this.f10574d.readLock().unlock();
            }
            throw th;
        }
    }

    public String getPoiMarkData(int i8, int i9, int i10, int i11, boolean z7) {
        return nativeGetPoiMarkData(this.f10572b, i8, i9, i10, i11, z7);
    }

    public boolean getPoiTagEnable(int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetPoiTagEnable(j8, i8);
        }
        return false;
    }

    public void getProjectMatrix(float[] fArr) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeGetProjectionMatrix(j8, fArr);
        }
    }

    public String getProjectionPt(String str) {
        return nativeGetProjectionPt(this.f10572b, str);
    }

    public int getScaleLevel(int i8, int i9) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetScaleLevel(j8, i8, i9);
        }
        return -1;
    }

    public int getSkyOffset() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetSkyOffset(j8);
        }
        return 0;
    }

    public int getSkyboxStyle() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeGetSkyboxStyle(j8);
        }
        return 0;
    }

    public String getStreetRoadNearPointFromCenter(double d8, double d9, int i8) {
        return nativeGetStreetRoadNearPointFromCenter(this.f10572b, d8, d9, i8);
    }

    public int getVMPMapCityInfo(Bundle bundle) {
        return nativeGetVMPMapCityInfo(this.f10572b, bundle);
    }

    public void getViewMatrix(float[] fArr) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeGetViewMatrix(j8, fArr);
        }
    }

    public boolean getVirtualPoiShowEnable() {
        return nativeGetVirtualPoiShowEnable(this.f10572b);
    }

    public float getZoomToBound(Bundle bundle, int i8, int i9) {
        return nativeGetZoomToBound(this.f10572b, bundle, i8, i9);
    }

    public float getZoomToBoundF(Bundle bundle) {
        return nativeGetZoomToBoundF(this.f10572b, bundle);
    }

    public boolean importMapTheme(int i8) {
        return nativeImportMapTheme(this.f10572b, i8);
    }

    public boolean init(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7, boolean z8) {
        long j8 = this.f10572b;
        return j8 != 0 && nativeInit(j8, str, str2, str3, str4, str5, str6, str7, i8, i9, i10, i11, i12, i13, i14, z7, z8);
    }

    public boolean initCustomStyle(String str, String str2) {
        long j8 = this.f10572b;
        if (j8 == 0) {
            return true;
        }
        nativeInitCustomStyle(j8, str, str2);
        return true;
    }

    public void initHeatMapData(long j8, Bundle bundle) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            nativeInitHeatMapData(j9, j8, bundle);
        }
    }

    public boolean initWithOptions(Bundle bundle, boolean z7) {
        long j8 = this.f10572b;
        return j8 != 0 && nativeInitWithBundle(j8, bundle, z7);
    }

    public void interruptDraw(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeInterruptDraw(j8, z7);
        }
    }

    public boolean isAnimationRunning() {
        return nativeIsAnimationRunning(this.f10572b);
    }

    public boolean isBaseIndoorMapMode() {
        long j8 = this.f10572b;
        return j8 != 0 && nativeIsBaseIndoorMapMode(j8);
    }

    public boolean isBaseIndoorMapShow() {
        long j8 = this.f10572b;
        return j8 != 0 && nativeIsBaseIndoorMapShow(j8);
    }

    public boolean isEnableIndoor3D() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeIsEnableIndoor3D(j8);
        }
        return true;
    }

    public boolean isNaviMode() {
        return nativeIsNaviMode(this.f10572b);
    }

    public boolean isPointInFocusBarBorder(double d8, double d9, double d10) {
        long j8 = this.f10572b;
        return j8 != 0 && nativeIsPointInFocusBarBorder(j8, d8, d9, d10);
    }

    public boolean isPointInFocusIDRBorder(double d8, double d9) {
        long j8 = this.f10572b;
        return j8 != 0 && nativeIsPointInFocusIDRBorder(j8, d8, d9);
    }

    public boolean isStreetArrowShown() {
        return nativeIsStreetArrowShown(this.f10572b);
    }

    public boolean isStreetCustomMarkerShown() {
        return nativeIsStreetCustomMarkerShown(this.f10572b);
    }

    public boolean isStreetPOIMarkerShown() {
        long j8 = this.f10572b;
        return j8 != 0 && nativeIsStreetPOIMarkerShown(j8);
    }

    public boolean isStreetRoadClickable() {
        return nativeIsStreetRoadClickable(this.f10572b);
    }

    public boolean isSupBackgroundDraw() {
        long j8 = this.f10572b;
        if (j8 == 0) {
            return false;
        }
        return nativeIsSupBackgroundDraw(j8);
    }

    public boolean layersIsShow(long j8) {
        boolean z7;
        boolean z8 = false;
        try {
            z7 = this.f10574d.readLock().tryLock(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
            if (!z7) {
                if (z7) {
                    this.f10574d.readLock().unlock();
                }
                return false;
            }
            try {
                if (a(j8)) {
                    if (z7) {
                        this.f10574d.readLock().unlock();
                    }
                    return false;
                }
                boolean nativeLayersIsShow = nativeLayersIsShow(this.f10572b, j8);
                if (z7) {
                    this.f10574d.readLock().unlock();
                }
                return nativeLayersIsShow;
            } catch (Exception unused) {
                if (z7) {
                    this.f10574d.readLock().unlock();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                z8 = z7;
                if (z8) {
                    this.f10574d.readLock().unlock();
                }
                throw th;
            }
        } catch (Exception unused2) {
            z7 = false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean moveLayerBelow(long j8, String str) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            return nativeMoveLayerBelow(j9, j8, str);
        }
        return false;
    }

    public boolean moveLayerBelowTo(long j8, int i8) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            return nativeMoveLayerBelowTo(j9, j8, i8);
        }
        return false;
    }

    public void moveToScrPoint(int i8, int i9) {
        nativeMoveToScrPoint(this.f10572b, i8, i9);
    }

    public native void nativeAddOneOverlayItem(long j8, Bundle bundle);

    public native void nativeAddOverlayItems(long j8, Bundle[] bundleArr, int i8);

    public native boolean nativeAddTileOverlay(long j8, Bundle bundle);

    public native boolean nativeCleanSDKTileDataCache(long j8, long j9);

    public native void nativeRemoveOneOverlayItem(long j8, Bundle bundle);

    public native void nativeUpdateOneOverlayItem(long j8, Bundle bundle);

    public native boolean nativeUpdateSDKTile(long j8, Bundle bundle);

    public void onBackground() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeOnBackground(j8);
        }
    }

    public void onForeground() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeOnForeground(j8);
        }
    }

    public void onGestureFinish() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeOnGestureFinish(j8);
        }
    }

    public void onGestureStart() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeOnGestureStart(j8);
        }
    }

    public String onHotcityGet() {
        return nativeOnHotcityGet(this.f10572b);
    }

    public void onPause() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeOnPause(j8);
        }
    }

    public boolean onRecordAdd(int i8) {
        return nativeOnRecordAdd(this.f10572b, i8);
    }

    public String onRecordGetAll() {
        return nativeOnRecordGetAll(this.f10572b);
    }

    public String onRecordGetAt(int i8) {
        return nativeOnRecordGetAt(this.f10572b, i8);
    }

    public boolean onRecordImport(boolean z7, boolean z8) {
        return nativeOnRecordImport(this.f10572b, z7, z8);
    }

    public boolean onRecordReload(int i8, boolean z7) {
        return nativeOnRecordReload(this.f10572b, i8, z7);
    }

    public boolean onRecordRemove(int i8, boolean z7) {
        return nativeOnRecordRemove(this.f10572b, i8, z7);
    }

    public boolean onRecordStart(int i8, boolean z7, int i9) {
        return nativeOnRecordStart(this.f10572b, i8, z7, i9);
    }

    public boolean onRecordSuspend(int i8, boolean z7, int i9) {
        return nativeOnRecordSuspend(this.f10572b, i8, z7, i9);
    }

    public void onResume() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeOnResume(j8);
        }
    }

    public String onSchcityGet(String str) {
        return nativeOnSchcityGet(this.f10572b, str);
    }

    public boolean onUsrcityMsgInterval(int i8) {
        return nativeOnUsrcityMsgInterval(this.f10572b, i8);
    }

    public int onWifiRecordAdd(int i8) {
        return nativeOnWifiRecordAdd(this.f10572b, i8);
    }

    public boolean performAction(String str) {
        return nativePerformAction(this.f10572b, str);
    }

    public boolean preLoad(int i8, List<com.baidu.platform.comapi.map.j> list) {
        if (this.f10572b != 0 && list != null && list.size() > 0) {
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < list.size(); i9++) {
                com.baidu.platform.comapi.map.j jVar = list.get(i9);
                ParcelItem parcelItem = new ParcelItem();
                Bundle bundle2 = new Bundle();
                bundle2.putDouble("x", jVar.f9748d);
                bundle2.putDouble("y", jVar.f9749e);
                bundle2.putDouble(MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z, jVar.f9750f);
                bundle2.putFloat("level", jVar.f9745a);
                bundle2.putInt("rotation", jVar.f9746b);
                bundle2.putDouble("overlooking", jVar.f9747c);
                parcelItem.setBundle(bundle2);
                arrayList.add(parcelItem);
            }
            if (arrayList.size() > 0) {
                ParcelItem[] parcelItemArr = new ParcelItem[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    parcelItemArr[i10] = (ParcelItem) arrayList.get(i10);
                }
                bundle.putParcelableArray("points", parcelItemArr);
                return nativePreload(this.f10572b, bundle, i8);
            }
        }
        return false;
    }

    public void preLoadParticleFile(String str) {
        nativePreLoadParticleFile(this.f10572b, str);
    }

    public byte[] readMapResData(String str) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeReadMapResData(j8, str);
        }
        return null;
    }

    public void recycleMemory(int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeRecycleMemory(j8, i8);
        }
    }

    public void remove3DModelIDForFilterList(String str) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeRemove3DModelIDForFilterList(j8, str);
        }
    }

    public void removeBmLayer(long j8) {
        nativeRemoveBmLayer(this.f10572b, j8);
    }

    public boolean removeItemData(Bundle bundle) {
        if (!a()) {
            return false;
        }
        this.f10571a.submit(new a(bundle));
        return true;
    }

    public void removeLayer(long j8) {
        if (a()) {
            this.f10571a.submit(new j(j8));
        }
    }

    public void removeOneOverlayItem(Bundle bundle) {
        if (a()) {
            this.f10571a.submit(new e(bundle));
        }
    }

    public void removeOneOverlayItems(Bundle[] bundleArr) {
        if (bundleArr == null || !a()) {
            return;
        }
        this.f10571a.submit(new f(bundleArr));
    }

    public void removeStreetAllCustomMarker() {
        nativeRemoveStreetAllCustomMarker(this.f10572b);
    }

    public void removeStreetCustomMaker(String str) {
        nativeRemoveStreetCustomMaker(this.f10572b, str);
    }

    @Deprecated
    public void renderDone() {
    }

    public void renderInit(int i8, int i9, Surface surface, int i10) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeRenderInit(j8, i8, i9, surface, i10);
        }
    }

    @Deprecated
    public int renderRender() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeDraw(j8);
        }
        return 0;
    }

    public void renderResize(int i8, int i9) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeRenderResize(j8, i8, i9);
        }
    }

    public void resetImageRes() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeResetImageRes(j8);
        }
    }

    public boolean resumeCache() {
        return nativeResumeCache(this.f10572b);
    }

    public boolean saveCache() {
        try {
            return nativeSaveCache(this.f10572b);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void saveScreenToLocal(String str, String str2) {
        nativeSaveScreenToLocal(this.f10572b, str, str2);
    }

    public String scrPtToGeoPoint(int i8, int i9) {
        return nativeScrPtToGeoPoint(this.f10572b, i8, i9);
    }

    public void set3DModelEnable(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSet3DModelEnable(j8, z7);
        }
    }

    public void setAllStreetCustomMarkerVisibility(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetAllStreetCustomMarkerVisibility(j8, z7);
        }
    }

    public void setAutoEnter3DByZoomIn(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativSetAuto3DEnter3DByZoomIn(j8, z7);
        }
    }

    public void setBackgroundColor(int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetBackgroundColor(j8, i8);
        }
    }

    public void setCallback(q qVar) {
        BaseMapCallback.setMapCallback(this.f10572b, qVar);
    }

    public void setCustomStyleEnable(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetCustomStyleEnable(j8, z7);
        }
    }

    public void setCustomTrafficColor(int i8, int i9, int i10, int i11) {
        long j8 = this.f10572b;
        if (0 == j8) {
            return;
        }
        nativeSetCustomTrafficColor(j8, i8, i9, i10, i11);
    }

    public void setCustomTrafficColorEnable(boolean z7) {
        long j8 = this.f10572b;
        if (0 == j8) {
            return;
        }
        nativeSetCustomTrafficColorEnable(j8, z7);
    }

    public void setDEMEnable(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetDEMEnable(j8, z7);
        }
    }

    public void setDpiScale(float f8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetDpiScale(j8, f8);
        }
    }

    public void setDrawHouseHeightEnable(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetDrawHouseHeightEnable(j8, z7);
        }
    }

    public void setEnableIndoor3D(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetEnableIndoor3D(j8, z7);
        }
    }

    public void setFeatureConfig(String str) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetFeatureConfig(j8, str);
        }
    }

    public void setFocus(long j8, long j9, boolean z7, Bundle bundle) {
        if (a()) {
            this.f10571a.submit(new n(j8, j9, z7, bundle));
        }
    }

    public void setFontSizeLevel(int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetFontSizeLevel(j8, i8);
        }
    }

    public void setFullscreenMaskColor(int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetFullscreenMaskColor(j8, i8);
        }
    }

    public void setGlobalLightEnable(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetGlobalLightEnable(j8, z7);
        }
    }

    public void setHeatMapFrameAnimationIndex(long j8, int i8) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            nativeSetHeatMapFrameAnimationIndex(j9, j8, i8);
        }
    }

    public void setHouseSmoothLevel(int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetHouseSmoothLevel(j8, i8);
        }
    }

    public void setIndoorMapShowMode(String str, int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetIndoorMapShowMode(j8, str, i8);
        }
    }

    public boolean setItsPreTime(int i8, int i9, int i10) {
        return nativeSetItsPreTime(this.f10572b, i8, i9, i10);
    }

    public boolean setLayerSceneMode(long j8, int i8) {
        return nativeSetLayerSceneMode(this.f10572b, j8, i8);
    }

    public void setLayersClickable(long j8, boolean z7) {
        if (a()) {
            this.f10571a.submit(new h(j8, z7));
        }
    }

    public void setLittle3DEnable(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetLittle3DEnable(j8, z7);
        }
    }

    public void setLocationLayerData(Bundle bundle) {
        nativeSetLocationLayerData(this.f10572b, bundle);
    }

    public void setMapBackgroundImage(Bundle bundle) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetMapBackgroundImage(j8, bundle);
        }
    }

    public int setMapControlMode(int i8) {
        return nativeSetMapControlMode(this.f10572b, i8);
    }

    public void setMapLanguage(int i8, boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetMapLanguage(j8, i8, z7);
        }
    }

    public void setMapScene(int i8) {
        nativeSetMapScene(this.f10572b, i8);
    }

    public boolean setMapSceneAttr(int i8) {
        return nativeSetMapSceneAttr(this.f10572b, i8);
    }

    public void setMapStatus(Bundle bundle) {
        nativeSetMapStatus(this.f10572b, bundle);
    }

    public void setMapStatusLimits(Bundle bundle) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetMapStatusLimits(j8, bundle);
        }
    }

    public boolean setMapStatusLimitsLevel(int i8, int i9) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            return nativeSetMapStatusLimitsLevel(j8, i8, i9);
        }
        return false;
    }

    public boolean setMapTheme(int i8, Bundle bundle) {
        return nativeSetMapTheme(this.f10572b, i8, bundle);
    }

    public boolean setMapThemeScene(int i8, int i9, Bundle bundle) {
        return nativeSetMapThemeScene(this.f10572b, i8, i9, bundle);
    }

    public void setMaxAndMinZoomLevel(Bundle bundle) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetMaxAndMinZoomLevel(j8, bundle);
        }
    }

    public void setNewMapStatus(Bundle bundle) {
        nativeNewSetMapStatus(this.f10572b, bundle);
    }

    public void setPoiTagEnable(int i8, boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetPoiTagEnable(j8, i8, z7);
        }
    }

    public void setRecommendPOIScene(int i8) {
        nativeSetRecommendPOIScene(this.f10572b, i8);
    }

    public void setSkyboxStyle(int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetSkyboxStyle(j8, i8);
        }
    }

    public void setStreetArrowShow(boolean z7) {
        nativeSetStreetArrowShow(this.f10572b, z7);
    }

    public void setStreetLayerNewDesignFlag(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetStreetLayerNewDesignFlag(j8, z7);
        }
    }

    public void setStreetMarkerClickable(String str, boolean z7) {
        nativeSetStreetMarkerClickable(this.f10572b, str, z7);
    }

    public void setStreetRoadClickable(boolean z7) {
        nativeSetStreetRoadClickable(this.f10572b, z7);
    }

    public void setStyleMode(int i8) {
        nativeSetStyleMode(this.f10572b, i8);
    }

    public void setSupBackgroundDraw(boolean z7) {
        long j8 = this.f10572b;
        if (j8 == 0) {
            return;
        }
        nativeSetSupBackgroundDraw(j8, z7);
    }

    public void setTargetStreetCustomMarkerVisibility(boolean z7, String str) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSetTargetStreetCustomMarkerVisibility(j8, z7, str);
        }
    }

    public boolean setTestSwitch(boolean z7) {
        return nativeSetTestSwitch(this.f10572b, z7);
    }

    public void setTrafficUGCData(String str) {
        nativeSetTrafficUGCData(this.f10572b, str);
    }

    public void setUniversalFilter(String str) {
        nativeSetUniversalFilter(this.f10572b, str);
    }

    public void setVirtualPoiShowEnable(boolean z7) {
        nativeSetVirtualPoiShowEnable(this.f10572b, z7);
    }

    public void showBaseIndoorMap(boolean z7) {
        nativeShowBaseIndoorMap(this.f10572b, z7);
    }

    public void showFootMarkGrid(boolean z7, String str) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeShowFootMarkGrid(j8, z7, str);
        }
    }

    public void showHotMap(boolean z7, int i8) {
        nativeShowHotMap(this.f10572b, z7, i8);
    }

    public void showLayers(long j8, boolean z7) {
        if (a()) {
            this.f10571a.submit(new g(j8, z7));
        }
    }

    public void showMistMap(boolean z7, String str) {
        nativeShowMistMap(this.f10572b, z7, str);
    }

    public void showOperatorDataByType(boolean z7, int i8) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeShowOperatorDataByType(j8, z7, i8);
        }
    }

    public boolean showParticleEffect(int i8) {
        return nativeShowParticleEffect(this.f10572b, i8);
    }

    public boolean showParticleEffectByFileName(String str) {
        return nativeShowParticleEffectByFileName(this.f10572b, str);
    }

    public boolean showParticleEffectByFilenameAndPos(String str, float f8, float f9, float f10) {
        return nativeShowParticleEffectByFilenameAndPos(this.f10572b, str, f8, f9, f10);
    }

    public boolean showParticleEffectByName(String str, boolean z7) {
        return nativeShowParticleEffectByName(this.f10572b, str, z7);
    }

    public boolean showParticleEffectByType(int i8) {
        return nativeShowParticleEffectByType(this.f10572b, i8);
    }

    public boolean showParticleEffectByTypeAndPos(int i8, float f8, float f9, float f10) {
        return nativeShowParticleEffectByTypeAndPos(this.f10572b, i8, f8, f9, f10);
    }

    public boolean showParticleEffectByTypeAndStyleID(int i8, int i9) {
        return nativeShowParticleEffectByTypeAndStyleID(this.f10572b, i8, i9);
    }

    public void showSatelliteMap(boolean z7) {
        nativeShowSatelliteMap(this.f10572b, z7);
    }

    public void showStreetPOIMarker(boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeShowStreetPOIMarker(j8, z7);
        }
    }

    public void showStreetPopup(boolean z7) {
        nativeShowStreetPopup(this.f10572b, z7);
    }

    public void showStreetRoadMap(boolean z7) {
        nativeShowStreetRoadMap(this.f10572b, z7);
    }

    public void showTopicPOI(String str, boolean z7, String str2, boolean z8) {
        nativeShowTopicPOI(this.f10572b, str, z7, str2, z8);
    }

    public void showTrafficMap(boolean z7) {
        nativeShowTrafficMap(this.f10572b, z7);
    }

    public void showTrafficUGCMap(boolean z7) {
        nativeShowTrafficUGCMap(this.f10572b, z7);
    }

    public void showUniversalLayer(Bundle bundle) {
        nativeShowUniversalLayer(this.f10572b, bundle);
    }

    public void startHeatMapFrameAnimation(long j8) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            nativeStartHeatMapFrameAnimation(j9, j8);
        }
    }

    public void startIndoorAnimation() {
        nativeStartIndoorAnimation(this.f10572b);
    }

    public void stopHeatMapFrameAnimation(long j8) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            nativeStopHeatMapFrameAnimation(j9, j8);
        }
    }

    public void surfaceDestroyed(Surface surface) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSurfaceDestroyed(j8, surface);
        }
    }

    public boolean switchBaseIndoorMapFloor(String str, String str2) {
        return nativeSwitchBaseIndoorMapFloor(this.f10572b, str, str2);
    }

    public void switchDayOrDarkTheme(int i8, boolean z7) {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeSwitchDayOrDarkTheme(j8, i8, z7);
        }
    }

    public boolean switchLayer(long j8, long j9) {
        if (!a()) {
            return false;
        }
        this.f10571a.submit(new k(j8, j9));
        return true;
    }

    public void unFocusTrafficUGCLabel() {
        nativeUnFocusTrafficUGCLabel(this.f10572b);
    }

    public void updateBaseLayers() {
        nativeUpdateBaseLayers(this.f10572b);
    }

    public void updateDrawFPS() {
        long j8 = this.f10572b;
        if (j8 != 0) {
            nativeUpdateDrawFPS(j8);
        }
    }

    public void updateFootMarkGrid() {
        nativeUpdateFootMarkGrid(this.f10572b);
    }

    public void updateHeatMapData(long j8, Bundle bundle) {
        long j9 = this.f10572b;
        if (j9 != 0) {
            nativeUpdateHeatMapData(j9, j8, bundle);
        }
    }

    public void updateLayers(long j8) {
        if (a()) {
            this.f10571a.submit(new i(j8));
        }
    }

    public void updateOneOverlayItem(Bundle bundle) {
        if (a()) {
            this.f10571a.submit(new d(bundle));
        }
    }

    public String worldPointToScreenPoint(float f8, float f9, float f10) {
        return nativeworldPointToScreenPoint(this.f10572b, f8, f9, f10);
    }

    public float getZoomToBound(long j8, Bundle bundle, int i8, int i9) {
        return nativeGetZoomToBound(j8, bundle, i8, i9);
    }

    public void showHotMap(boolean z7, int i8, String str) {
        nativeShowHotMapWithUid(this.f10572b, z7, i8, str);
    }

    private void b() {
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f10571a;
            if (threadPoolExecutor != null) {
                if (threadPoolExecutor.getQueue() != null) {
                    this.f10571a.getQueue().clear();
                }
                this.f10571a.shutdown();
                this.f10571a.awaitTermination(100L, TimeUnit.MILLISECONDS);
                this.f10571a.shutdownNow();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(long j8) {
        return this.f10575e.contains(Long.valueOf(j8)) && j8 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return (this.f10571a.isShutdown() || this.f10571a.isTerminated()) ? false : true;
    }
}
