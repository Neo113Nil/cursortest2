package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class w1 implements wd {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zd f4644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f4645c;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(x1 x1Var, wd wdVar) {
        this.f4645c = x1Var;
        this.f4644b = (zd) wdVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.startapp.sdk.internal.wd, com.startapp.sdk.internal.zd] */
    @Override // com.startapp.sdk.internal.wd
    public final synchronized void a(Object obj) {
        if (this.f4643a) {
            return;
        }
        this.f4643a = true;
        this.f4645c.f4707c.removeCallbacksAndMessages(null);
        this.f4644b.a(obj);
    }
}
