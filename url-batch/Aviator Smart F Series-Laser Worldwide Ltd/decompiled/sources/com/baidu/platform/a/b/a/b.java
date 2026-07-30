package com.baidu.platform.a.b.a;

import com.baidu.mapapi.http.wrapper.AsyncResponse;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.HttpHeader;
import com.baidu.mapapi.http.wrapper.annotation.POST;
import com.baidu.mapapi.search.batch.common.BatchParams;
import com.baidu.mapapi.search.batch.geocode.ReverseGeoCodeBatchResult;

/* loaded from: classes2.dex */
public interface b {
    @POST(paramsNeedEncode = false, value = "/batch")
    AsyncResponse<ReverseGeoCodeBatchResult> a(@BodyData BatchParams batchParams, @HttpHeader a aVar);
}
