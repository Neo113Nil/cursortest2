package com.baidu.mapapi.search.batch.common;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BatchParams extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "reqs")
    private List<ParamsItem> f6643a;

    public List<ParamsItem> getItems() {
        return this.f6643a;
    }

    public BatchParams setItems(List<ParamsItem> list) {
        this.f6643a = list;
        return this;
    }
}
