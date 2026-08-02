package com.startapp.sdk.internal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f4616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xf f4617c;

    public vf(xf xfVar, String str, JSONObject jSONObject) {
        this.f4617c = xfVar;
        this.f4615a = str;
        this.f4616b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4617c.c(this.f4615a, this.f4616b);
    }
}
