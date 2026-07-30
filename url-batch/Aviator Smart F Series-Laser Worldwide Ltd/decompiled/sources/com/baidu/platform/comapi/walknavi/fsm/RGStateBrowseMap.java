package com.baidu.platform.comapi.walknavi.fsm;

import com.baidu.baidumapsdk_api.R;
import com.baidu.platform.comapi.h.c;
import com.baidu.platform.comapi.walknavi.b;

/* loaded from: classes2.dex */
public class RGStateBrowseMap extends RGState {
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
        if (b.n().u() != 4) {
            b.n().H().c(30000);
        }
        b.n().t().a(true);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionNaviEngine() {
        b.n().s().c(true);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionUI() {
        b.n().H().b();
        b.n().H().d(R.drawable.wsdk_drawable_rg_ic_locate_walk_bike_point);
        if (c.b().j()) {
            if (b.n().u() != 4) {
                b.n().H().a(false);
            }
        } else if (c.b().e()) {
            b.n().H().a(false);
        }
    }
}
