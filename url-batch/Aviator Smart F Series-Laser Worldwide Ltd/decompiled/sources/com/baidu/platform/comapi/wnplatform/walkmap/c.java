package com.baidu.platform.comapi.wnplatform.walkmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.WinRound;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.t.f;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public class c extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    private d f10549a;

    /* renamed from: b, reason: collision with root package name */
    private a f10550b = null;

    /* renamed from: c, reason: collision with root package name */
    private MapView f10551c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10552d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10553e = true;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f10554f = null;

    /* renamed from: g, reason: collision with root package name */
    private BitmapDescriptor f10555g = null;

    public c() {
        this.f10549a = null;
        this.f10549a = new d();
    }

    public void a(boolean z7) {
    }

    public void b() {
        a aVar = this.f10550b;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f10551c != null) {
            this.f10551c = null;
        }
    }

    public MapStatus c() {
        MapStatus d8 = com.baidu.platform.comapi.walknavi.b.n().t().d();
        if (d8 == null) {
            return d8;
        }
        WinRound winRound = d8.winRound;
        int i8 = (winRound.left + winRound.right) / 2;
        int abs = Math.abs(winRound.bottom + winRound.top) / 2;
        WinRound winRound2 = d8.winRound;
        int i9 = (winRound2.right + winRound2.left) / 2;
        int abs2 = (int) (i.DOUBLE_EPSILON - ((Math.abs(winRound2.bottom - winRound2.top) * 1.5d) / 10.0d));
        WinRound winRound3 = d8.winRound;
        return new MapStatus.Builder(d8).targetScreen(new Point(i9, ((winRound3.top + winRound3.bottom) / 2) - abs2)).build();
    }

    public void d(int i8) {
        d dVar = this.f10549a;
        if (dVar == null) {
            return;
        }
        if (i8 == 0) {
            dVar.a(0);
            this.f10549a.a(1);
            this.f10549a.a(2);
            this.f10549a.a(5);
            this.f10549a.a(6);
            this.f10549a.a(9);
            this.f10549a.a(10);
            return;
        }
        if (i8 != 1) {
            return;
        }
        if (com.baidu.platform.comapi.walknavi.b.n().t().f10552d) {
            this.f10549a.c(0);
            return;
        }
        this.f10549a.c(0);
        this.f10549a.c(1);
        this.f10549a.c(2);
        if (com.baidu.platform.comapi.h.c.b().j()) {
            this.f10549a.a(5);
        } else if (com.baidu.platform.comapi.h.c.b().e()) {
            this.f10549a.c(5);
        }
        this.f10549a.c(6);
    }

    public MapView e() {
        MapView mapView = this.f10551c;
        if (mapView == null) {
            return null;
        }
        return mapView;
    }

    public float f() {
        d dVar = this.f10549a;
        if (dVar != null) {
            return dVar.b();
        }
        return -1.0f;
    }

    public float g() {
        a aVar = this.f10550b;
        if (aVar != null) {
            return aVar.c();
        }
        return 3.0f;
    }

    public void h() {
        a aVar = this.f10550b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public boolean i() {
        return this.f10553e;
    }

    public boolean j() {
        d dVar = this.f10549a;
        if (dVar != null) {
            return dVar.d();
        }
        return false;
    }

    public boolean k() {
        d dVar = this.f10549a;
        if (dVar != null) {
            return dVar.e();
        }
        return false;
    }

    public void l() {
        d dVar = this.f10549a;
        if (dVar != null) {
            dVar.f();
        }
    }

    public boolean m() {
        d dVar = this.f10549a;
        if (dVar != null) {
            return dVar.g();
        }
        return false;
    }

    public void n() {
        GeoPoint n8 = com.baidu.platform.comapi.walknavi.b.n().s().n();
        MapStatus d8 = com.baidu.platform.comapi.walknavi.b.n().t().d();
        if (d8 != null) {
            MapStatus.Builder builder = new MapStatus.Builder(d8);
            builder.overlook(0.0f);
            if (n8.getLongitudeE6() == i.DOUBLE_EPSILON || n8.getLatitudeE6() == i.DOUBLE_EPSILON) {
                return;
            }
            builder.target(f.a(n8));
            a(builder.build());
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        d(0);
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        d(0);
        d dVar = this.f10549a;
        if (dVar != null) {
            dVar.c();
            this.f10549a = null;
        }
        a aVar = this.f10550b;
        if (aVar != null) {
            aVar.e();
            this.f10550b = null;
        }
    }

    public void a(Context context, MapView mapView) {
        this.f10551c = mapView;
        a aVar = this.f10550b;
        if (aVar == null) {
            this.f10550b = new a(mapView);
        } else {
            aVar.a(mapView);
        }
        this.f10550b.a(false);
    }

    public boolean b(boolean z7) {
        d dVar = this.f10549a;
        if (dVar != null) {
            return dVar.a(z7);
        }
        return false;
    }

    public boolean a(int[] iArr, int[] iArr2) {
        d dVar = this.f10549a;
        if (dVar != null) {
            return dVar.a(iArr, iArr2);
        }
        return false;
    }

    public void a(MapStatus mapStatus) {
        a aVar = this.f10550b;
        if (aVar != null) {
            aVar.a(f.a(mapStatus));
        }
    }

    public void a(MapStatus mapStatus, int i8) {
        a aVar = this.f10550b;
        if (aVar != null) {
            aVar.a(mapStatus, i8);
        }
    }

    public void a(int i8, int i9) {
        a aVar = this.f10550b;
        if (aVar != null) {
            aVar.a(i8, i9);
        }
    }

    public void c(int i8) {
        d dVar = this.f10549a;
        if (dVar != null) {
            dVar.b(i8);
        }
    }

    public float a(MapBound mapBound, int i8, int i9) {
        Bundle bundle = new Bundle();
        bundle.putInt(TtmlNode.LEFT, mapBound.ptLB.getIntX());
        bundle.putInt("bottom", mapBound.ptLB.getIntY());
        bundle.putInt(TtmlNode.RIGHT, mapBound.ptRT.getIntX());
        bundle.putInt("top", mapBound.ptRT.getIntY());
        a aVar = this.f10550b;
        if (aVar != null) {
            return aVar.a(bundle, i8, i9);
        }
        return 15.0f;
    }

    public void a(e eVar) {
        a aVar = this.f10550b;
        if (aVar != null) {
            aVar.a(eVar);
        }
    }

    public void a(float f8) {
        d dVar = this.f10549a;
        if (dVar != null) {
            dVar.a(f8);
        }
    }

    public void a(OverLookingMode overLookingMode) {
        d dVar = this.f10549a;
        if (dVar != null) {
            dVar.a(overLookingMode);
        }
    }

    public boolean a(long j8, float f8) {
        d dVar = this.f10549a;
        if (dVar != null) {
            return dVar.a(j8, f8);
        }
        return false;
    }

    public MapStatus d() {
        a aVar = this.f10550b;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }
}
