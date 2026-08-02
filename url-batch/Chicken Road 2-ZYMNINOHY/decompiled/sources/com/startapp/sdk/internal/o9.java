package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class o9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f7375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t9 f7378d;

    public o9(t9 t9Var, d9 d9Var, int i4, long j4) {
        this.f7378d = t9Var;
        this.f7375a = d9Var;
        this.f7376b = i4;
        this.f7377c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7378d.a(this.f7375a, this.f7376b, this.f7377c);
        } catch (Throwable unused) {
        }
    }
}
