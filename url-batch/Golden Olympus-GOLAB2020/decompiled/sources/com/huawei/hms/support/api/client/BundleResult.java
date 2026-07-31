package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* loaded from: classes.dex */
public class BundleResult {

    /* renamed from: a, reason: collision with root package name */
    private int f14301a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f14302b;

    public BundleResult(int i4, Bundle bundle) {
        this.f14301a = i4;
        this.f14302b = bundle;
    }

    public int getResultCode() {
        return this.f14301a;
    }

    public Bundle getRspBody() {
        return this.f14302b;
    }

    public void setResultCode(int i4) {
        this.f14301a = i4;
    }

    public void setRspBody(Bundle bundle) {
        this.f14302b = bundle;
    }
}
