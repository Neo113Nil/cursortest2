package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Af, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2467Af {

    /* renamed from: a, reason: collision with root package name */
    public final t2.E f23881a;

    public C2467Af(t2.E e6) {
        this.f23881a = e6;
    }

    public final void a(int i, long j9) {
        long j10;
        C3151ea c3151ea = AbstractC3368ia.f31615a1;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            return;
        }
        t2.E e6 = this.f23881a;
        e6.i();
        synchronized (e6.f40830a) {
            j10 = e6.f40826D;
        }
        if (j9 - j10 < 0) {
            t2.C.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31625b1)).booleanValue()) {
            e6.c(i);
            e6.d(j9);
        } else {
            e6.c(-1);
            e6.d(j9);
        }
    }
}
