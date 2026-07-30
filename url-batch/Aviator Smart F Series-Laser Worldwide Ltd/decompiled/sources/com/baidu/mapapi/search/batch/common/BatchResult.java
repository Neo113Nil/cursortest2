package com.baidu.mapapi.search.batch.common;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BatchResult<T> extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "status")
    private Integer f6644a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "status_sp")
    private Integer f6645b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "message")
    private String f6646c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "message_sp")
    private String f6647d;

    public abstract List<T> getBatchResult();

    public String getMessage() {
        return !TextUtils.isEmpty(this.f6646c) ? this.f6646c : !TextUtils.isEmpty(this.f6647d) ? this.f6647d : "";
    }

    public int getStatus() {
        Integer num = this.f6644a;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.f6645b;
        if (num2 != null) {
            return num2.intValue();
        }
        return -1;
    }

    public void setMessage(String str) {
        this.f6646c = str;
    }

    public void setStatus(int i8) {
        this.f6644a = Integer.valueOf(i8);
    }
}
