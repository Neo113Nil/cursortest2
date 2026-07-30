package com.baidu.platform.comapi.walknavi.fsm;

import android.graphics.Point;
import com.baidu.ar.auth.FeatureCodes;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.WinRound;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.g.a;
import com.baidu.platform.comapi.h.t.f;
import com.baidu.platform.comapi.walknavi.b;
import com.baidu.platform.comapi.walknavi.i.c;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;

/* loaded from: classes2.dex */
public class RGStateNorth2D extends RGState {
    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    public void enter() {
        super.enter();
        WGuideFSM.restoreZoomLevel();
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    public void excute() {
        super.excute();
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    public void exit() {
        WGuideFSM.saveZoomLevel();
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
        a.b(CmcdConfiguration.KEY_STREAM_TYPE, d8.toString());
        MapStatus.Builder builder = new MapStatus.Builder(d8);
        builder.rotate(0.0f);
        builder.overlook(0.0f);
        WinRound winRound = d8.winRound;
        builder.targetScreen(new Point((winRound.right + winRound.left) / 2, ((winRound.top + winRound.bottom) / 2) - ((int) 0)));
        if (d8.zoom < 19.0f) {
            builder.zoom(19.0f);
        }
        if (n8.getLongitudeE6() == i.DOUBLE_EPSILON || n8.getLatitudeE6() == i.DOUBLE_EPSILON) {
            return;
        }
        builder.target(f.a(n8));
        b.n().t().a(builder.build(), FeatureCodes.VO);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionNaviEngine() {
        if (b.n().u() == 4 || c.t() == com.baidu.platform.comapi.walknavi.i.b.REFRESH_SEGMENTBROWSE || c.t() == com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE) {
            return;
        }
        b.n().s().c(false);
        b.n().s().k(1);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionUI() {
        b.n().H().b();
        b.n().H().d(R.drawable.wsdk_drawable_rg_ic_north_walk_bike2d);
        b.n().u();
    }
}
