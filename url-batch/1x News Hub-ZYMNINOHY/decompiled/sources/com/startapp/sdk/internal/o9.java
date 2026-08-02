package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class o9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t9 f4243d;

    public o9(t9 t9Var, d9 d9Var, int i3, long j3) {
        this.f4243d = t9Var;
        this.f4240a = d9Var;
        this.f4241b = i3;
        this.f4242c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4243d.a(this.f4240a, this.f4241b, this.f4242c);
        } catch (Throwable unused) {
        }
    }
}
