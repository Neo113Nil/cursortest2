package com.baidu.mapapi.bikenavi.adapter;

import com.baidu.mapapi.bikenavi.model.BikeRoutePlanError;

/* loaded from: classes2.dex */
public interface IBNaviCalcRouteListener {
    void onNaviCalcRouteFail(BikeRoutePlanError bikeRoutePlanError);

    void onNaviCalcRouteSuccess();
}
