package com.baidu.mapapi.map;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.LruCache;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.map.BackgroundDrawMapView;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapStatus;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
class a extends com.baidu.mapapi.map.b<Bundle> implements IBackgroundDrawBaseRouteLayer {

    /* renamed from: a, reason: collision with root package name */
    private c f6468a;

    /* renamed from: b, reason: collision with root package name */
    private Path f6469b;

    /* renamed from: c, reason: collision with root package name */
    private Point f6470c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f6471d;

    /* renamed from: e, reason: collision with root package name */
    private int f6472e;

    /* renamed from: f, reason: collision with root package name */
    private int f6473f;

    /* renamed from: g, reason: collision with root package name */
    private int f6474g;

    /* renamed from: h, reason: collision with root package name */
    private final LruCache<String, b> f6475h;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final float f6476a;

        /* renamed from: b, reason: collision with root package name */
        private final float f6477b;

        b(float f8, float f9) {
            this.f6476a = f8;
            this.f6477b = f9;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6476a == bVar.f6476a && this.f6477b == bVar.f6477b;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f6476a) + Float.floatToIntBits(this.f6477b);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private Bundle f6478a;

        private c() {
        }

        public void a(Bundle bundle) {
            this.f6478a = bundle;
        }

        public int[] b() {
            Bundle bundle = this.f6478a;
            if (bundle == null) {
                return null;
            }
            return bundle.getIntArray("allPtX");
        }

        public int[] c() {
            Bundle bundle = this.f6478a;
            if (bundle == null) {
                return null;
            }
            return bundle.getIntArray("allPtY");
        }

        public boolean d() {
            Bundle bundle = this.f6478a;
            return bundle != null && bundle.getInt("bIsClosedRegion", 0) == 1;
        }

        public boolean e() {
            return this.f6478a != null;
        }

        public void f() {
            this.f6478a = null;
        }

        public double a() {
            Bundle bundle = this.f6478a;
            return bundle == null ? i.DOUBLE_EPSILON : bundle.getDouble("ulWidth", i.DOUBLE_EPSILON);
        }
    }

    a(Context context) {
        super(context);
        this.f6472e = Color.parseColor("#EFEEE9");
        this.f6473f = Color.parseColor("#9B9B9B");
        this.f6474g = Color.parseColor("#9B9B9B");
        this.f6475h = new LruCache<>(2097152);
    }

    private void a(BackgroundDrawMapView.CanvasProxy canvasProxy) {
        canvasProxy.drawColor(this.f6472e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(BackgroundDrawMapView.CanvasProxy canvasProxy) {
        int size;
        c cVar;
        MapController mapController;
        com.baidu.platform.comapi.map.MapStatus mapStatus;
        int length;
        Bundle bundle = (Bundle) this.mEntity;
        if (bundle == null || (size = bundle.size()) <= 0 || (cVar = this.f6468a) == null || (mapController = this.mController) == null || (mapStatus = mapController.getMapStatus()) == null) {
            return;
        }
        this.f6475h.evictAll();
        char c8 = 0;
        int i8 = 0;
        while (i8 < size && getLife() != 2) {
            cVar.a(bundle.getBundle(String.valueOf(i8)));
            if (cVar.e()) {
                float a8 = (float) cVar.a();
                boolean d8 = cVar.d();
                if (d8 || a8 > 0.0f) {
                    if (d8) {
                        a8 = 0.0f;
                    }
                    int[] b8 = cVar.b();
                    int[] c9 = cVar.c();
                    if (b8 != null && c9 != null && (length = b8.length) >= 2 && length == c9.length) {
                        this.f6469b.reset();
                        b a9 = a(b8[c8], c9[c8], mapStatus);
                        this.f6469b.moveTo(a9.f6476a, a9.f6477b);
                        for (int i9 = 1; i9 < length; i9++) {
                            if (getLife() == 2) {
                                return;
                            }
                            b a10 = a(b8[i9], c9[i9], mapStatus);
                            this.f6469b.lineTo(a10.f6476a, a10.f6477b);
                        }
                        this.f6471d.setStrokeWidth(a8);
                        this.f6471d.setColor(this.f6473f);
                        this.f6471d.setStyle(Paint.Style.STROKE);
                        if (d8) {
                            this.f6471d.setColor(this.f6474g);
                            this.f6471d.setStyle(Paint.Style.FILL);
                        }
                        canvasProxy.drawPath(this.f6469b, this.f6471d);
                        cVar.f();
                        i8++;
                        c8 = 0;
                    }
                }
            }
            i8++;
            c8 = 0;
        }
    }

    @Override // com.baidu.mapapi.map.BaseBackgroundDrawLayer, com.baidu.mapapi.map.IBackgroundDrawLayer
    public void onCreate() {
        super.onCreate();
        this.f6468a = new c();
        this.f6470c = new Point(-1, -1);
        this.f6469b = new Path();
        this.f6471d = new Paint();
    }

    @Override // com.baidu.mapapi.map.BaseBackgroundDrawLayer, com.baidu.mapapi.map.IBackgroundDrawLayer
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.baidu.mapapi.map.IBackgroundDrawLayer
    public void onDraw(BackgroundDrawMapView.CanvasProxy canvasProxy) {
        com.baidu.platform.comapi.map.MapStatus mapStatus;
        MapStatus.WinRound winRound;
        int i8;
        float f8;
        int min;
        MapController mapController = this.mController;
        if (mapController == null || (mapStatus = mapController.getMapStatus()) == null || (winRound = mapStatus.winRound) == null) {
            return;
        }
        int abs = Math.abs(winRound.right - winRound.left);
        int abs2 = Math.abs(winRound.bottom - winRound.top);
        if (abs2 <= 0 || abs <= 0 || this.mWidth <= 0 || this.mHeight <= 0) {
            return;
        }
        canvasProxy.save();
        canvasProxy.translate((this.mWidth - abs) / 2.0f, (this.mHeight - abs2) / 2.0f);
        int i9 = this.mWidth;
        if (i9 != abs && (i8 = this.mHeight) != abs2) {
            if (i9 >= abs && i8 >= abs2) {
                min = Math.min(i9 / abs, i8 / abs2);
            } else if (i9 > abs || i8 > abs2) {
                f8 = i9 <= abs ? i8 / abs2 : i9 / abs;
                canvasProxy.scale(f8, f8, this.mWidth / 2.0f, this.mHeight / 2.0f);
            } else {
                min = Math.min(abs / i9, abs2 / i8);
            }
            f8 = min;
            canvasProxy.scale(f8, f8, this.mWidth / 2.0f, this.mHeight / 2.0f);
        }
        a(canvasProxy);
        b(canvasProxy);
        canvasProxy.restore();
    }

    @Override // com.baidu.mapapi.map.IBackgroundDrawBaseRouteLayer
    public void setBackgroundColor(int i8) {
        this.f6472e = this.mContext.getResources().getColor(i8);
    }

    @Override // com.baidu.mapapi.map.IBackgroundDrawBaseRouteLayer
    public void setRouteColor(int i8) {
        setRouteLineColor(i8);
        setRouteSurfaceColor(i8);
    }

    @Override // com.baidu.mapapi.map.IBackgroundDrawBaseRouteLayer
    public void setRouteLineColor(int i8) {
        this.f6473f = this.mContext.getResources().getColor(i8);
    }

    @Override // com.baidu.mapapi.map.IBackgroundDrawBaseRouteLayer
    public void setRouteSurfaceColor(int i8) {
        this.f6474g = this.mContext.getResources().getColor(i8);
    }

    private b a(int i8, int i9, com.baidu.platform.comapi.map.MapStatus mapStatus) {
        String str = i8 + SystemInfoUtil.COMMA + i9;
        LruCache<String, b> lruCache = this.f6475h;
        b bVar = lruCache != null ? lruCache.get(str) : null;
        if (bVar == null) {
            toScreenLocation(i8, i9, this.f6470c);
            Point point = this.f6470c;
            bVar = new b(point.f8789x, point.f8790y);
            if (lruCache != null) {
                lruCache.put(str, bVar);
            }
        }
        return bVar;
    }
}
