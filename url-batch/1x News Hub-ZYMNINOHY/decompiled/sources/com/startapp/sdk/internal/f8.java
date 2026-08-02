package com.startapp.sdk.internal;

import org.json.JSONArray;

/* loaded from: classes.dex */
public final class f8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg f3783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8 f3784b;

    public f8(g8 g8Var, eg egVar) {
        this.f3784b = g8Var;
        this.f3783a = egVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArray;
        this.f3783a.b();
        w1 w1Var = this.f3784b.f4706b;
        try {
            jSONArray = this.f3783a.f3752b.a();
        } catch (Exception unused) {
            jSONArray = null;
        }
        w1Var.a(jSONArray);
    }
}
