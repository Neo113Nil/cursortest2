package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class qq3 {

    /* renamed from: c, reason: collision with root package name */
    private static final mp3 f10798c = mp3.a();

    /* renamed from: a, reason: collision with root package name */
    protected volatile kr3 f10799a;

    /* renamed from: b, reason: collision with root package name */
    private volatile uo3 f10800b;

    public final int a() {
        if (this.f10800b != null) {
            return ((qo3) this.f10800b).f10775j.length;
        }
        if (this.f10799a != null) {
            return this.f10799a.h();
        }
        return 0;
    }

    public final uo3 b() {
        if (this.f10800b != null) {
            return this.f10800b;
        }
        synchronized (this) {
            if (this.f10800b != null) {
                return this.f10800b;
            }
            this.f10800b = this.f10799a == null ? uo3.f12885g : this.f10799a.g();
            return this.f10800b;
        }
    }

    protected final void c(kr3 kr3Var) {
        if (this.f10799a != null) {
            return;
        }
        synchronized (this) {
            if (this.f10799a == null) {
                try {
                    this.f10799a = kr3Var;
                    this.f10800b = uo3.f12885g;
                } catch (mq3 unused) {
                    this.f10799a = kr3Var;
                    this.f10800b = uo3.f12885g;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq3)) {
            return false;
        }
        qq3 qq3Var = (qq3) obj;
        kr3 kr3Var = this.f10799a;
        kr3 kr3Var2 = qq3Var.f10799a;
        if (kr3Var == null && kr3Var2 == null) {
            return b().equals(qq3Var.b());
        }
        if (kr3Var != null && kr3Var2 != null) {
            return kr3Var.equals(kr3Var2);
        }
        if (kr3Var != null) {
            qq3Var.c(kr3Var.a());
            return kr3Var.equals(qq3Var.f10799a);
        }
        c(kr3Var2.a());
        return this.f10799a.equals(kr3Var2);
    }

    public int hashCode() {
        return 1;
    }
}
