package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.aj;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g implements aj.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f3834a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3835b;

    public g(e eVar, String str) {
        this.f3834a = eVar;
        this.f3835b = str;
    }

    @Override // com.chartboost.sdk.impl.aj.a
    public void a(aj ajVar, JSONObject jSONObject) {
        if (this.f3834a.f.h || com.chartboost.sdk.i.t) {
            synchronized (this.f3834a) {
                this.f3834a.b(this.f3835b);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.aj.a
    public void a(aj ajVar, CBError cBError) {
        if (this.f3834a.f.h) {
            synchronized (this.f3834a) {
                this.f3834a.b(this.f3835b);
            }
        }
    }
}
