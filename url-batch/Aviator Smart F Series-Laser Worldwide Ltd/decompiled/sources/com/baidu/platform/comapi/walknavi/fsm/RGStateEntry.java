package com.baidu.platform.comapi.walknavi.fsm;

import android.graphics.Point;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.WinRound;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.t.f;
import com.baidu.platform.comapi.walknavi.b;
import com.baidu.platform.comapi.wnplatform.walkmap.e;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class RGStateEntry extends RGStateCar3D {

    /* renamed from: b, reason: collision with root package name */
    private int f9947b = 0;

    /* renamed from: a, reason: collision with root package name */
    private e f9946a = new a();

    class a implements e {
        a() {
        }

        @Override // com.baidu.platform.comapi.wnplatform.walkmap.e
        public void a() {
            if (RGStateEntry.this.f9947b != 1) {
                if (RGStateEntry.this.f9947b != 2) {
                    RGStateEntry.this.f9947b = 0;
                    b.n().t().a((e) null);
                    b.n().l().run("[3D车头向上]按钮点击");
                    return;
                }
                GeoPoint n8 = b.n().s().n();
                MapStatus d8 = b.n().t().d();
                if (d8 != null && n8 != null) {
                    MapStatus.Builder builder = new MapStatus.Builder(d8);
                    WinRound winRound = d8.winRound;
                    long abs = 0 - ((Math.abs(winRound.bottom - winRound.top) * 2) / 10);
                    WinRound winRound2 = d8.winRound;
                    builder.targetScreen(new Point((winRound2.right + winRound2.left) / 2, ((winRound2.top + winRound2.bottom) / 2) - ((int) abs)));
                    if (n8.getLongitudeE6() != i.DOUBLE_EPSILON && n8.getLatitudeE6() != i.DOUBLE_EPSILON) {
                        builder.target(f.a(n8));
                        b.n().t().a(builder.build());
                    }
                }
                RGStateEntry.this.f9947b = 0;
                b.n().s().c(false);
                b.n().t().a((e) null);
                b.n().a(1000, "Car3D");
                return;
            }
            com.baidu.platform.comapi.h.g.a.b("Animate", "onMapViewAnimationFinish --- move2center");
            MapStatus d9 = b.n().t().d();
            if (d9 != null) {
                int j8 = b.n().H().j();
                MapStatus.Builder builder2 = new MapStatus.Builder(d9);
                WinRound winRound3 = d9.winRound;
                int[] iArr = {(winRound3.left + winRound3.right) / 2, (Math.abs((winRound3.bottom - j8) - winRound3.top) * 7) / 10};
                int[] iArr2 = {0, 0};
                b.n().t().a(iArr, iArr2);
                LatLng mc2ll = CoordUtil.mc2ll(new GeoPoint(iArr2[1], iArr2[0]));
                LatLng latLng = d9.target;
                double d10 = (latLng.latitude * 2.0d) - mc2ll.latitude;
                double d11 = (latLng.longitude * 2.0d) - mc2ll.longitude;
                com.baidu.platform.comapi.h.g.a.a("x is " + d10);
                com.baidu.platform.comapi.h.g.a.a("y is " + d11);
                builder2.target(new LatLng(d10, d11));
                b.n().t().a(builder2.build(), 500);
            }
            RGStateEntry.this.f9947b = 2;
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGStateCar3D, com.baidu.platform.comapi.walknavi.fsm.RGState
    public void exit() {
        this.f9947b = 0;
        b.n().t().a((e) null);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGStateCar3D, com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionMapStatus() {
        b.n().H().c();
        b.n().t().a(true);
        b.n().t().a(this.f9946a);
        GeoPoint n8 = b.n().s().n();
        MapStatus d8 = b.n().t().d();
        if (d8 != null) {
            MapStatus.Builder builder = new MapStatus.Builder(d8);
            if (d8.zoom < 19.0f) {
                builder.zoom(19.0f);
            }
            if (n8.getLongitudeE6() != i.DOUBLE_EPSILON && n8.getLatitudeE6() != i.DOUBLE_EPSILON) {
                builder.target(f.a(n8));
                b.n().t().a(builder.build(), 500);
            }
            this.f9947b = 1;
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGStateCar3D, com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionNaviEngine() {
        b.n().s().c(true);
        b.n().s().k(0);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGStateCar3D, com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionUI() {
        b.n().H().b();
        b.n().H().d(R.drawable.wsdk_drawable_rg_ic_walk_bike3d_new);
    }
}
