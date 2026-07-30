package com.baidu.platform.comapi.walknavi.fsm;

import android.graphics.Point;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.WinRound;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.walknavi.b;

/* loaded from: classes2.dex */
public class RGStateOverview extends RGState {
    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    public void enter() {
        super.enter();
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    public void excute() {
        super.excute();
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    public void exit() {
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionLayers() {
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionMapStatus() {
        b.n().H().c();
        b.n().t().a(true);
        MapBound v7 = b.n().v();
        MapStatus d8 = b.n().t().d();
        if (d8 != null) {
            MapStatus.Builder builder = new MapStatus.Builder(d8);
            builder.overlook(0.0f);
            WinRound winRound = d8.winRound;
            builder.targetScreen(new Point((winRound.right + winRound.left) / 2, ((winRound.top + winRound.bottom) / 2) - ((int) 0)));
            if (v7 != null) {
                float a8 = b.n().t().a(v7, com.baidu.platform.comapi.h.t.q.b.b().d(), (com.baidu.platform.comapi.h.t.q.b.b().c() - b.n().H().m()) - b.n().H().j());
                builder.target(CoordUtil.mc2ll(new GeoPoint((v7.getPtLB().getIntY() + v7.getPtRT().getIntY()) / 2, (v7.getPtLB().getIntX() + v7.getPtRT().getIntX()) / 2)));
                if (a8 > 3.0f) {
                    a8 = (float) (a8 - 0.8d);
                }
                builder.zoom(a8);
            }
            b.n().t().a(builder.build(), 500);
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionNaviEngine() {
        b.n().s().c(true);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionUI() {
        b.n().H().d(R.drawable.wsdk_drawable_rg_ic_locate_walk_bike_point);
    }
}
