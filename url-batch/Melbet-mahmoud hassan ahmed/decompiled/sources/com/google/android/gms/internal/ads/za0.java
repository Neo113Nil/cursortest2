package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class za0 implements t70<ob0> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ha0 f15054a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a3.h1 f15055b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ nb0 f15056c;

    za0(nb0 nb0Var, gb gbVar, ha0 ha0Var, a3.h1 h1Var) {
        this.f15056c = nb0Var;
        this.f15054a = ha0Var;
        this.f15055b = h1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.t70, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(ob0 ob0Var, Map map) {
        Object obj;
        int i7;
        obj = this.f15056c.f9012a;
        synchronized (obj) {
            io0.f("JS Engine is requesting an update");
            i7 = this.f15056c.f9019h;
            if (i7 == 0) {
                io0.f("Starting reload.");
                this.f15056c.f9019h = 2;
                this.f15056c.d(null);
            }
            this.f15054a.U0("/requestReload", this.f15055b.a());
        }
    }
}
