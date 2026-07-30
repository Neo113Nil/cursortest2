package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d72 {
    public final r01 a;
    public final List b;
    public final int c;
    public final r01 d;
    public final pl2 e;
    public final oi0 f;
    public final boolean g;

    public d72(r01 r01Var, List list, int i, r01 r01Var2, pl2 pl2Var, oi0 oi0Var, boolean z) {
        this.a = r01Var;
        this.b = list;
        this.c = i;
        this.d = r01Var2;
        this.e = pl2Var;
        this.f = oi0Var;
        this.g = z;
    }

    public final void a(r01 r01Var, sh0 sh0Var) {
        Context context = r01Var.a;
        r01 r01Var2 = this.a;
        if (context != r01Var2.a) {
            ey.f(sh0Var, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (r01Var.b == qb2.d0) {
            ey.f(sh0Var, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        if (r01Var.c != r01Var2.c) {
            ey.f(sh0Var, "' cannot modify the request's target.", "Interceptor '");
        } else if (r01Var.u != r01Var2.u) {
            ey.f(sh0Var, "' cannot modify the request's lifecycle.", "Interceptor '");
        } else {
            if (r01Var.v == r01Var2.v) {
                return;
            }
            ey.f(sh0Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(r01 r01Var, r30 r30Var) {
        c72 c72Var;
        int i;
        sh0 sh0Var;
        Object d;
        if (r30Var instanceof c72) {
            c72Var = (c72) r30Var;
            int i2 = c72Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c72Var.q = i2 - Integer.MIN_VALUE;
                Object obj = c72Var.o;
                b50 b50Var = b50.m;
                i = c72Var.q;
                if (i != 0) {
                    ca2.b(obj);
                    List list = this.b;
                    int i3 = this.c;
                    if (i3 > 0) {
                        a(r01Var, (sh0) list.get(i3 - 1));
                    }
                    sh0Var = (sh0) list.get(i3);
                    d72 d72Var = new d72(this.a, this.b, i3 + 1, r01Var, this.e, this.f, this.g);
                    c72Var.m = this;
                    c72Var.n = sh0Var;
                    c72Var.q = 1;
                    d = sh0Var.d(d72Var, c72Var);
                    if (d == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sh0 sh0Var2 = c72Var.n;
                    d72 d72Var2 = c72Var.m;
                    ca2.b(obj);
                    sh0Var = sh0Var2;
                    this = d72Var2;
                    d = obj;
                }
                s01 s01Var = (s01) d;
                this.a(s01Var.a(), sh0Var);
                return s01Var;
            }
        }
        c72Var = new c72(this, r30Var);
        Object obj2 = c72Var.o;
        b50 b50Var2 = b50.m;
        i = c72Var.q;
        if (i != 0) {
        }
        s01 s01Var2 = (s01) d;
        this.a(s01Var2.a(), sh0Var);
        return s01Var2;
    }
}
