package com.baidu.platform.comapi.walknavi.fsm;

import com.baidu.baidumapsdk_api.R;
import com.baidu.platform.comapi.walknavi.b;

/* loaded from: classes2.dex */
public class RGStateSeg extends RGState {
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
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionNaviEngine() {
        b.n().s().c(true);
    }

    @Override // com.baidu.platform.comapi.walknavi.fsm.RGState
    protected void onActionUI() {
        b.n().H().d(R.drawable.wsdk_drawable_rg_ic_locate_walk_bike_point);
        if (b.n().u() != 4) {
            b.n().H().a(false);
        }
    }
}
