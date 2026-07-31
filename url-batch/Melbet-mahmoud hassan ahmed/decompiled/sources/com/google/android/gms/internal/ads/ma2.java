package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ma2<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f8468a;

    /* renamed from: b, reason: collision with root package name */
    private w94 f8469b = new w94();

    /* renamed from: c, reason: collision with root package name */
    private boolean f8470c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8471d;

    public ma2(T t6) {
        this.f8468a = t6;
    }

    public final void a(int i7, k82<T> k82Var) {
        if (this.f8471d) {
            return;
        }
        if (i7 != -1) {
            this.f8469b.a(i7);
        }
        this.f8470c = true;
        k82Var.c(this.f8468a);
    }

    public final void b(l92<T> l92Var) {
        if (this.f8471d || !this.f8470c) {
            return;
        }
        yb4 b7 = this.f8469b.b();
        this.f8469b = new w94();
        this.f8470c = false;
        l92Var.a(this.f8468a, b7);
    }

    public final void c(l92<T> l92Var) {
        this.f8471d = true;
        if (this.f8470c) {
            l92Var.a(this.f8468a, this.f8469b.b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ma2.class != obj.getClass()) {
            return false;
        }
        return this.f8468a.equals(((ma2) obj).f8468a);
    }

    public final int hashCode() {
        return this.f8468a.hashCode();
    }
}
