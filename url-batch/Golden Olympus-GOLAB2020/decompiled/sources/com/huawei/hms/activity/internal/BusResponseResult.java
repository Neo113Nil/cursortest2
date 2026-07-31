package com.huawei.hms.activity.internal;

import android.content.Intent;

/* loaded from: classes.dex */
public class BusResponseResult {

    /* renamed from: a, reason: collision with root package name */
    private Intent f13802a;

    /* renamed from: b, reason: collision with root package name */
    private int f13803b;

    public int getCode() {
        return this.f13803b;
    }

    public Intent getIntent() {
        return this.f13802a;
    }

    public void setCode(int i4) {
        this.f13803b = i4;
    }

    public void setIntent(Intent intent) {
        this.f13802a = intent;
    }
}
