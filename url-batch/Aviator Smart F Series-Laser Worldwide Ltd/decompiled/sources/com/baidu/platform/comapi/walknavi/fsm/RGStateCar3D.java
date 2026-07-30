package com.baidu.platform.comapi.walknavi.fsm;

import android.graphics.Point;
import com.baidu.ar.auth.FeatureCodes;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.WinRound;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.c;
import com.baidu.platform.comapi.h.t.f;
import com.baidu.platform.comapi.walknavi.b;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class RGStateCar3D extends RGState {
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
        super.exit();
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionLayers() {
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionMapStatus() {
        b.n().H().c();
        b.n().t().a(true);
        GeoPoint n8 = b.n().s().n();
        MapStatus d8 = b.n().t().d();
        if (d8 != null) {
            MapStatus.Builder builder = new MapStatus.Builder(d8);
            WinRound winRound = d8.winRound;
            WinRound winRound2 = d8.winRound;
            builder.targetScreen(new Point((winRound2.right + winRound2.left) / 2, ((winRound2.top + winRound2.bottom) / 2) - ((int) ((long) (0.0f - (Math.abs(winRound.bottom - winRound.top) * 0.2f))))));
            builder.rotate(b.n().s().d());
            if (c.b().j()) {
                builder.overlook(-50.0f);
            } else if (c.b().e()) {
                builder.overlook(-47.0f);
            }
            if (d8.zoom < 19.0f) {
                builder.zoom(19.0f);
            }
            if (n8.getLongitudeE6() == i.DOUBLE_EPSILON || n8.getLatitudeE6() == i.DOUBLE_EPSILON) {
                return;
            }
            builder.target(f.a(n8));
            b.n().t().a(builder.build(), FeatureCodes.VO);
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionNaviEngine() {
        if (b.n().u() == 4 || com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.REFRESH_SEGMENTBROWSE || com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE) {
            return;
        }
        b.n().s().c(false);
        b.n().s().k(0);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionUI() {
        b.n().H().b();
        b.n().H().d(R.drawable.wsdk_drawable_rg_ic_walk_bike3d_new);
        if (c.b().j()) {
            if (b.n().u() != 4) {
                b.n().H().a(true);
            }
        } else if (c.b().e()) {
            b.n().H().a(true);
        }
    }
}
