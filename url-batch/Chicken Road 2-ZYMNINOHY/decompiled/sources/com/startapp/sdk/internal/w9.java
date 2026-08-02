package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public abstract class w9 implements Runnable, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f7817a;

    /* renamed from: b, reason: collision with root package name */
    public final g9 f7818b;

    /* renamed from: c, reason: collision with root package name */
    public final n9 f7819c;

    public w9(d9 d9Var, g9 g9Var, n9 n9Var) {
        this.f7817a = d9Var;
        this.f7818b = g9Var;
        this.f7819c = n9Var;
    }

    public abstract int a();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((w9) obj).f7818b.f6980c - this.f7818b.f6980c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int a3 = a();
            n9 n9Var = this.f7819c;
            if (n9Var != null) {
                n9Var.a(this.f7817a, a3);
            }
        } catch (OutOfMemoryError unused) {
            if (this.f7819c != null) {
                this.f7819c.a(this.f7817a, 0);
            }
        } catch (Throwable th) {
            try {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th);
                }
            } finally {
                n9 n9Var2 = this.f7819c;
                if (n9Var2 != null) {
                    n9Var2.a(this.f7817a, 0);
                }
            }
        }
    }
}
