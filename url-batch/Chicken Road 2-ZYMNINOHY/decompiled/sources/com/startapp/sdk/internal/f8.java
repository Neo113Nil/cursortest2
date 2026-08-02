package com.startapp.sdk.internal;

import org.json.JSONArray;

/* loaded from: classes.dex */
public final class f8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg f6900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8 f6901b;

    public f8(g8 g8Var, eg egVar) {
        this.f6901b = g8Var;
        this.f6900a = egVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArray;
        this.f6900a.b();
        w1 w1Var = this.f6901b.f7852b;
        try {
            jSONArray = this.f6900a.f6866b.a();
        } catch (Exception unused) {
            jSONArray = null;
        }
        w1Var.a(jSONArray);
    }
}
