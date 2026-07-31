package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class y8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f507a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ d9 d;

    public y8(d9 d9Var, n8 n8Var, int i, long j) {
        this.d = d9Var;
        this.f507a = n8Var;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.a(this.f507a, this.b, this.c);
        } catch (Throwable unused) {
        }
    }
}
