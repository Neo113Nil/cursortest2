package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class w1 implements wd {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zd f7789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f7790c;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(x1 x1Var, wd wdVar) {
        this.f7790c = x1Var;
        this.f7789b = (zd) wdVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.startapp.sdk.internal.wd, com.startapp.sdk.internal.zd] */
    @Override // com.startapp.sdk.internal.wd
    public final synchronized void a(Object obj) {
        if (this.f7788a) {
            return;
        }
        this.f7788a = true;
        this.f7790c.f7853c.removeCallbacksAndMessages(null);
        this.f7789b.a(obj);
    }
}
