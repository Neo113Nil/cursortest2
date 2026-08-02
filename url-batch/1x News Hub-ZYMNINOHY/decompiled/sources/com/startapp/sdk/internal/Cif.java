package com.startapp.sdk.internal;

/* renamed from: com.startapp.sdk.internal.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f3973a;

    public Cif(pf pfVar) {
        this.f3973a = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3973a.c();
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
