package com.startapp.sdk.internal;

/* renamed from: com.startapp.sdk.internal.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f7099a;

    public Cif(pf pfVar) {
        this.f7099a = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7099a.c();
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
