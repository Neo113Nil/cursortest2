package com.baidu.platform.comapi.walknavi.fsm;

import android.graphics.Point;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.WinRound;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.t.f;
import com.baidu.platform.comapi.walknavi.b;

/* loaded from: classes2.dex */
public class RGStateSegEntry extends RGStateCar3D {
    @Override // com.baidu.platform.comapi.walknavi.fsm.RGStateCar3D, com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionMapStatus() {
        b.n().H().c();
        b.n().t().a(true);
        MapStatus d8 = b.n().t().d();
        if (d8 != null) {
            MapStatus.Builder builder = new MapStatus.Builder(d8);
            WinRound winRound = d8.winRound;
            long abs = (long) (0.0f - (Math.abs(winRound.bottom - winRound.top) * 0.2f));
            builder.overlook(0.0f);
            WinRound winRound2 = d8.winRound;
            builder.targetScreen(new Point((winRound2.right + winRound2.left) / 2, ((winRound2.top + winRound2.bottom) / 2) - ((int) abs)));
            if (d8.zoom < 19.0f) {
                builder.zoom(19.0f);
            }
            com.baidu.platform.comapi.basestruct.Point E = b.n().E();
            if (E != null) {
                builder.target(f.a(new GeoPoint(E.getDoubleY(), E.getDoubleX())));
            }
            b.n().t().a(builder.build(), 500);
        }
        b.n().s().c(true);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGStateCar3D, com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionNaviEngine() {
        b.n().s().c(true);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGStateCar3D, com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionUI() {
        b.n().H().d(R.drawable.wsdk_drawable_rg_ic_locate_walk_bike_point);
    }
}
