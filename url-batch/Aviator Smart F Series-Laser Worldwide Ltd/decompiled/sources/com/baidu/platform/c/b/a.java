package com.baidu.platform.c.b;

import com.baidu.mapapi.http.wrapper.AsyncResponse;
import com.baidu.mapapi.http.wrapper.annotation.GET;
import com.baidu.mapapi.http.wrapper.annotation.QueryString;
import com.baidu.mapapi.search.route.v2.bus.bean.BusRoutePlanParam;
import com.baidu.mapapi.search.route.v2.bus.bean.BusRoutePlanResponse;
import java.util.Map;

/* loaded from: classes2.dex */
public interface a {
    @GET("/api_bus/v1/route_plan")
    AsyncResponse<BusRoutePlanResponse> a(@QueryString BusRoutePlanParam busRoutePlanParam, @QueryString Map<String, String> map);
}
