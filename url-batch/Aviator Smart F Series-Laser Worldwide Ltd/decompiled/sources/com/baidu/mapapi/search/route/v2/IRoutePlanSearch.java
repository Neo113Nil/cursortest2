package com.baidu.mapapi.search.route.v2;

import com.baidu.mapapi.search.route.v2.bus.BusRoutePlanOption;
import com.baidu.mapapi.search.route.v2.bus.bean.BusRoutePlanResult;

/* loaded from: classes2.dex */
public interface IRoutePlanSearch {
    void masstransitSearch(BusRoutePlanOption busRoutePlanOption, RoutePlanResultCallback<BusRoutePlanResult> routePlanResultCallback);
}
