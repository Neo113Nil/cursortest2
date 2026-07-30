package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
class k implements SurfaceRenderer {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9751a = false;

    /* renamed from: d, reason: collision with root package name */
    private v f9754d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<MapSurfaceView> f9755e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<MapTextureView> f9756f;

    /* renamed from: g, reason: collision with root package name */
    private com.baidu.platform.comapi.map.c f9757g;

    /* renamed from: i, reason: collision with root package name */
    private int f9759i;

    /* renamed from: j, reason: collision with root package name */
    private int f9760j;

    /* renamed from: k, reason: collision with root package name */
    private int f9761k;

    /* renamed from: l, reason: collision with root package name */
    private int f9762l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap.Config f9763m;

    /* renamed from: n, reason: collision with root package name */
    private e f9764n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9765o;

    /* renamed from: p, reason: collision with root package name */
    private int f9766p;

    /* renamed from: q, reason: collision with root package name */
    private int f9767q;

    /* renamed from: r, reason: collision with root package name */
    private int f9768r;

    /* renamed from: v, reason: collision with root package name */
    public int f9772v;

    /* renamed from: w, reason: collision with root package name */
    public int f9773w;

    /* renamed from: b, reason: collision with root package name */
    private AppBaseMap f9752b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9753c = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f9758h = false;

    /* renamed from: s, reason: collision with root package name */
    private long f9769s = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f9770t = false;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f9771u = false;

    /* renamed from: x, reason: collision with root package name */
    public int f9774x = 0;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MapSurfaceView f9775a;

        a(MapSurfaceView mapSurfaceView) {
            this.f9775a = mapSurfaceView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapSurfaceView mapSurfaceView = this.f9775a;
            if (mapSurfaceView != null) {
                mapSurfaceView.setBackgroundResource(0);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f9777a;

        b(Bitmap bitmap) {
            this.f9777a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f9757g.a(this.f9777a);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f9779a;

        c(Bitmap bitmap) {
            this.f9779a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f9757g.a(this.f9779a);
        }
    }

    public k(WeakReference<MapSurfaceView> weakReference, v vVar) {
        this.f9754d = vVar;
        this.f9755e = weakReference;
    }

    public void a(com.baidu.platform.comapi.map.c cVar, int i8, int i9) {
        this.f9758h = true;
        this.f9757g = cVar;
        this.f9759i = i8;
        this.f9760j = i9;
        this.f9763m = null;
    }

    public void b() {
        this.f9771u = true;
    }

    public void c() {
        this.f9771u = false;
    }

    @Override // com.baidu.platform.comapi.map.SurfaceRenderer
    public void onDrawFrame(Object obj) {
        List<w> list;
        List<w> list2;
        e eVar;
        MapTextureView mapTextureView;
        MapSurfaceView mapSurfaceView;
        MapSurfaceView mapSurfaceView2;
        if (a()) {
            if (!this.f9770t) {
                this.f9770t = true;
                WeakReference<MapSurfaceView> weakReference = this.f9755e;
                if (weakReference != null && (mapSurfaceView2 = weakReference.get()) != null) {
                    try {
                        mapSurfaceView2.post(new a(mapSurfaceView2));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f9751a) {
                f9751a = false;
                return;
            }
            if (this.f9771u) {
                return;
            }
            int Draw = this.f9752b.Draw();
            WeakReference<MapSurfaceView> weakReference2 = this.f9755e;
            if (weakReference2 != null && (mapSurfaceView = weakReference2.get()) != null) {
                if (Draw == 1) {
                    mapSurfaceView.requestRender();
                } else if (mapSurfaceView.getRenderMode() != 0) {
                    mapSurfaceView.setRenderMode(0);
                }
            }
            WeakReference<MapTextureView> weakReference3 = this.f9756f;
            if (weakReference3 != null && (mapTextureView = weakReference3.get()) != null) {
                if (Draw == 1) {
                    mapTextureView.requestRender();
                } else if (mapTextureView.getRenderMode() != 0) {
                    mapTextureView.setRenderMode(0);
                }
            }
            if (this.f9758h) {
                this.f9758h = false;
                if (this.f9757g != null) {
                    a(obj);
                }
            }
            if (!this.f9765o) {
                int i8 = this.f9766p + 1;
                this.f9766p = i8;
                if (i8 == 2 && (eVar = this.f9764n) != null) {
                    eVar.a();
                    if (OpenLogUtil.isMapLogEnable()) {
                        com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap onDrawFirstFrame");
                    }
                }
                this.f9765o = this.f9766p == 2;
            }
            WeakReference<MapSurfaceView> weakReference4 = this.f9755e;
            com.baidu.mapsdkplatform.comapi.map.b baseMap = (weakReference4 == null || weakReference4.get() == null) ? null : this.f9755e.get().getBaseMap();
            if (baseMap != null && (list2 = baseMap.f8069v) != null) {
                for (w wVar : list2) {
                    com.baidu.mapsdkplatform.comapi.map.s n8 = baseMap.n();
                    if (wVar != null) {
                        wVar.a((GL10) null, n8);
                    }
                }
            }
            WeakReference<MapTextureView> weakReference5 = this.f9756f;
            com.baidu.mapsdkplatform.comapi.map.b baseMap2 = (weakReference5 == null || weakReference5.get() == null) ? null : this.f9756f.get().getBaseMap();
            if (baseMap2 == null || (list = baseMap2.f8069v) == null) {
                return;
            }
            for (w wVar2 : list) {
                com.baidu.mapsdkplatform.comapi.map.s n9 = baseMap2.n();
                if (wVar2 != null) {
                    wVar2.a((GL10) null, n9);
                }
            }
        }
    }

    @Override // com.baidu.platform.comapi.map.SurfaceRenderer
    public void onSurfaceChanged(int i8, int i9) {
        AppBaseMap appBaseMap = this.f9752b;
        if (appBaseMap != null) {
            appBaseMap.renderResize(i8, i9);
        }
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap onSurfaceChanged width = " + i8 + "; height = " + i9);
        }
    }

    @Override // com.baidu.platform.comapi.map.SurfaceRenderer
    public void onSurfaceCreated(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        this.f9765o = false;
        this.f9766p = 0;
        this.f9768r = 0;
        this.f9767q = 0;
        if (a()) {
            this.f9752b.renderInit(i8, i9, surfaceHolder != null ? surfaceHolder.getSurface() : null, i10);
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap onSurfaceCreated ok");
            }
        }
    }

    @Override // com.baidu.platform.comapi.map.SurfaceRenderer
    public void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
        Surface surface = surfaceHolder != null ? surfaceHolder.getSurface() : null;
        AppBaseMap appBaseMap = this.f9752b;
        if (appBaseMap != null) {
            appBaseMap.surfaceDestroyed(surface);
        }
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap onSurfaceDestroyed");
        }
    }

    public k(MapTextureView mapTextureView, v vVar) {
        this.f9756f = new WeakReference<>(mapTextureView);
        this.f9754d = vVar;
    }

    public void a(com.baidu.platform.comapi.map.c cVar, int i8, int i9, int i10, int i11, Bitmap.Config config) {
        this.f9758h = true;
        this.f9757g = cVar;
        this.f9761k = i8;
        this.f9762l = i9;
        this.f9759i = i10;
        this.f9760j = i11;
        this.f9763m = config;
    }

    public void a(com.baidu.platform.comapi.map.c cVar, int i8, int i9, Bitmap.Config config) {
        this.f9758h = true;
        this.f9757g = cVar;
        this.f9759i = i8;
        this.f9760j = i9;
        this.f9763m = config;
    }

    public void a(e eVar) {
        this.f9764n = eVar;
    }

    public void a(AppBaseMap appBaseMap) {
        this.f9752b = appBaseMap;
    }

    public void a(boolean z7) {
        this.f9753c = z7;
    }

    private boolean a() {
        return this.f9752b != null && this.f9753c;
    }

    private void a(Object obj) {
        MapTextureView mapTextureView;
        int i8;
        int i9;
        MapSurfaceView mapSurfaceView;
        int i10;
        int i11;
        if (this.f9757g == null) {
            return;
        }
        WeakReference<MapSurfaceView> weakReference = this.f9755e;
        if (weakReference != null && (mapSurfaceView = weakReference.get()) != null && (i10 = this.f9759i) > 0 && (i11 = this.f9760j) > 0) {
            com.baidu.platform.comapi.util.j.a(new b(mapSurfaceView.captureImageFromSurface(this.f9761k, this.f9762l, i10, i11, obj, this.f9763m)), 0L);
        }
        WeakReference<MapTextureView> weakReference2 = this.f9756f;
        if (weakReference2 == null || (mapTextureView = weakReference2.get()) == null || (i8 = this.f9759i) <= 0 || (i9 = this.f9760j) <= 0) {
            return;
        }
        com.baidu.platform.comapi.util.j.a(new c(mapTextureView.captureImageFromSurface(this.f9761k, this.f9762l, i8, i9, obj, this.f9763m)), 0L);
    }
}
