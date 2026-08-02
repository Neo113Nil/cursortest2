package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class l9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f4085a;

    public l9(t9 t9Var) {
        this.f4085a = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4085a.b();
        } catch (Throwable unused) {
        }
    }
}
