package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class g9 implements Runnable, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final n8 f250a;
    public final q8 b;
    public final x8 c;

    public g9(n8 n8Var, q8 q8Var, x8 x8Var) {
        this.f250a = n8Var;
        this.b = q8Var;
        this.c = x8Var;
    }

    public abstract int a();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((g9) obj).b.c - this.b.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int a2 = a();
            x8 x8Var = this.c;
            if (x8Var != null) {
                x8Var.a(this.f250a, a2);
            }
        } catch (OutOfMemoryError unused) {
            if (this.c != null) {
                this.c.a(this.f250a, 0);
            }
        } catch (Throwable th) {
            try {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th);
                }
            } finally {
                x8 x8Var2 = this.c;
                if (x8Var2 != null) {
                    x8Var2.a(this.f250a, 0);
                }
            }
        }
    }
}
