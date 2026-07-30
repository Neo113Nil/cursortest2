package com.baidu.mapapi.search.batch.geocode;

import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.search.batch.common.BatchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class ReverseGeoCodeBatchResult extends BatchResult<String> {

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "batch_result")
    private List<String> f6689e;

    @Override // com.baidu.mapapi.search.batch.common.BatchResult
    public List<String> getBatchResult() {
        return this.f6689e;
    }

    public void setBatchResult(List<String> list) {
        this.f6689e = list;
    }
}
