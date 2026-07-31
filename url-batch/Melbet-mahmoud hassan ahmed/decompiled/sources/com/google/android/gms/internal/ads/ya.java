package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ya implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ za f14593f;

    ya(za zaVar) {
        this.f14593f = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z6;
        u03 u03Var;
        Object obj2;
        obj = this.f14593f.f15050p;
        synchronized (obj) {
            z6 = this.f14593f.f15051q;
            if (z6) {
                return;
            }
            this.f14593f.f15051q = true;
            try {
                za.m(this.f14593f);
            } catch (Exception e7) {
                u03Var = this.f14593f.f15045k;
                u03Var.c(2023, -1L, e7);
            }
            obj2 = this.f14593f.f15050p;
            synchronized (obj2) {
                this.f14593f.f15051q = false;
            }
        }
    }
}
