package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public abstract class w9 implements Runnable, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f4672a;

    /* renamed from: b, reason: collision with root package name */
    public final g9 f4673b;

    /* renamed from: c, reason: collision with root package name */
    public final n9 f4674c;

    public w9(d9 d9Var, g9 g9Var, n9 n9Var) {
        this.f4672a = d9Var;
        this.f4673b = g9Var;
        this.f4674c = n9Var;
    }

    public abstract int a();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((w9) obj).f4673b.f3860c - this.f4673b.f3860c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int a3 = a();
            n9 n9Var = this.f4674c;
            if (n9Var != null) {
                n9Var.a(this.f4672a, a3);
            }
        } catch (OutOfMemoryError unused) {
            if (this.f4674c != null) {
                this.f4674c.a(this.f4672a, 0);
            }
        } catch (Throwable th) {
            try {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th);
                }
            } finally {
                n9 n9Var2 = this.f4674c;
                if (n9Var2 != null) {
                    n9Var2.a(this.f4672a, 0);
                }
            }
        }
    }
}
