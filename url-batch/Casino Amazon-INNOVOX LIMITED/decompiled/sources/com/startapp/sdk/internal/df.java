package com.startapp.sdk.internal;

import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class df implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f215a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ ff c;

    public df(ff ffVar, String str, JSONObject jSONObject) {
        this.c = ffVar;
        this.f215a = str;
        this.b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.f215a, this.b);
    }
}
