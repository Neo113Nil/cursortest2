package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n72 {
    public k00 a;
    public int b;
    public m6 c;
    public Function2 d;
    public int e;
    public hn1 f;
    public tn1 g;

    public n72(k00 k00Var) {
        this.a = k00Var;
    }

    public final boolean a() {
        if (this.a != null) {
            m6 m6Var = this.c;
            if (m6Var != null ? m6Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final y41 b(Object obj) {
        y41 r;
        k00 k00Var = this.a;
        return (k00Var == null || (r = k00Var.r(this, obj)) == null) ? y41.m : r;
    }

    public final void c() {
        k00 k00Var = this.a;
        if (k00Var != null) {
            k00Var.A = true;
            k00Var.D.s();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
