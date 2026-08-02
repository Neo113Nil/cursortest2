package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class nf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f7340a;

    public nf(pf pfVar) {
        this.f7340a = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7340a.b();
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
