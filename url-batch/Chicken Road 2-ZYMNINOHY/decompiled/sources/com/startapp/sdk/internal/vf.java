package com.startapp.sdk.internal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xf f7759c;

    public vf(xf xfVar, String str, JSONObject jSONObject) {
        this.f7759c = xfVar;
        this.f7757a = str;
        this.f7758b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7759c.c(this.f7757a, this.f7758b);
    }
}
