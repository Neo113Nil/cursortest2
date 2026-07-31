package com.startapp.sdk.internal;

import org.json.JSONArray;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class q7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf f387a;
    public final /* synthetic */ r7 b;

    public q7(r7 r7Var, nf nfVar) {
        this.b = r7Var;
        this.f387a = nfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArray;
        this.f387a.b();
        s1 s1Var = this.b.b;
        try {
            jSONArray = this.f387a.b.a();
        } catch (Exception unused) {
            jSONArray = null;
        }
        s1Var.a(jSONArray);
    }
}
