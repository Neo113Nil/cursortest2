package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class lx3 implements ub0 {

    /* renamed from: a, reason: collision with root package name */
    protected final hh0 f8121a = new hh0();

    protected lx3() {
    }

    public final boolean c() {
        ei0 o7 = o();
        if (!o7.o()) {
            int e7 = e();
            h();
            n();
            if (o7.j(e7, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        ei0 o7 = o();
        if (!o7.o()) {
            int e7 = e();
            h();
            n();
            if (o7.k(e7, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        ei0 o7 = o();
        return !o7.o() && o7.e(e(), this.f8121a, 0L).b();
    }

    public final boolean p() {
        ei0 o7 = o();
        return !o7.o() && o7.e(e(), this.f8121a, 0L).f6253f;
    }
}
