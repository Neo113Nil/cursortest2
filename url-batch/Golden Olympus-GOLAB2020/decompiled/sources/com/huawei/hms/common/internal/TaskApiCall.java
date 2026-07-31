package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
import z0.AbstractC3540a;
import z0.j;

/* loaded from: classes.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final String f14097a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14098b;

    /* renamed from: c, reason: collision with root package name */
    private Parcelable f14099c;

    /* renamed from: d, reason: collision with root package name */
    private String f14100d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC3540a f14101e;

    /* renamed from: f, reason: collision with root package name */
    private int f14102f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f14102f = 1;
        this.f14097a = str;
        this.f14098b = str2;
        this.f14099c = null;
        this.f14100d = null;
    }

    protected abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, j jVar);

    public int getApiLevel() {
        return this.f14102f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.f14099c;
    }

    public String getRequestJson() {
        return this.f14098b;
    }

    public AbstractC3540a getToken() {
        return null;
    }

    public String getTransactionId() {
        return this.f14100d;
    }

    public String getUri() {
        return this.f14097a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, j jVar) {
        HMSLog.i("TaskApiCall", "doExecute, uri:" + this.f14097a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.f14100d);
        doExecute(clientt, responseErrorCode, str, jVar);
    }

    public void setApiLevel(int i4) {
        this.f14102f = i4;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f14099c = parcelable;
    }

    public void setTransactionId(String str) {
        this.f14100d = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f14102f = 1;
        this.f14097a = str;
        this.f14098b = str2;
        this.f14099c = null;
        this.f14100d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i4) {
        this.f14097a = str;
        this.f14098b = str2;
        this.f14099c = null;
        this.f14100d = str3;
        this.f14102f = i4;
    }

    public void setToken(AbstractC3540a abstractC3540a) {
    }
}
