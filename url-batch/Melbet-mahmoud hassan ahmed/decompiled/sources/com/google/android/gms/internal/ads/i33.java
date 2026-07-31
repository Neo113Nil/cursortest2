package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class i33 extends ei0 {

    /* renamed from: c, reason: collision with root package name */
    private final int f6523c;

    /* renamed from: d, reason: collision with root package name */
    private final l74 f6524d;

    public i33(boolean z6, l74 l74Var, byte[] bArr) {
        this.f6524d = l74Var;
        this.f6523c = l74Var.c();
    }

    private final int w(int i7, boolean z6) {
        if (z6) {
            return this.f6524d.d(i7);
        }
        if (i7 >= this.f6523c - 1) {
            return -1;
        }
        return i7 + 1;
    }

    private final int x(int i7, boolean z6) {
        if (z6) {
            return this.f6524d.e(i7);
        }
        if (i7 <= 0) {
            return -1;
        }
        return i7 - 1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int a(Object obj) {
        int a7;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p7 = p(obj2);
        if (p7 == -1 || (a7 = u(p7).a(obj3)) == -1) {
            return -1;
        }
        return s(p7) + a7;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final pf0 d(int i7, pf0 pf0Var, boolean z6) {
        int q7 = q(i7);
        int t6 = t(q7);
        u(q7).d(i7 - s(q7), pf0Var, z6);
        pf0Var.f10218c += t6;
        if (z6) {
            Object v6 = v(q7);
            Object obj = pf0Var.f10217b;
            Objects.requireNonNull(obj);
            pf0Var.f10217b = Pair.create(v6, obj);
        }
        return pf0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final hh0 e(int i7, hh0 hh0Var, long j7) {
        int r7 = r(i7);
        int t6 = t(r7);
        int s7 = s(r7);
        u(r7).e(i7 - t6, hh0Var, j7);
        Object v6 = v(r7);
        if (!hh0.f6244o.equals(hh0Var.f6248a)) {
            v6 = Pair.create(v6, hh0Var.f6248a);
        }
        hh0Var.f6248a = v6;
        hh0Var.f6260m += s7;
        hh0Var.f6261n += s7;
        return hh0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final Object f(int i7) {
        int q7 = q(i7);
        return Pair.create(v(q7), u(q7).f(i7 - s(q7)));
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int g(boolean z6) {
        if (this.f6523c == 0) {
            return -1;
        }
        int a7 = z6 ? this.f6524d.a() : 0;
        while (u(a7).o()) {
            a7 = w(a7, z6);
            if (a7 == -1) {
                return -1;
            }
        }
        return t(a7) + u(a7).g(z6);
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int h(boolean z6) {
        int i7 = this.f6523c;
        if (i7 == 0) {
            return -1;
        }
        int b7 = z6 ? this.f6524d.b() : i7 - 1;
        while (u(b7).o()) {
            b7 = x(b7, z6);
            if (b7 == -1) {
                return -1;
            }
        }
        return t(b7) + u(b7).h(z6);
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int j(int i7, int i8, boolean z6) {
        int r7 = r(i7);
        int t6 = t(r7);
        int j7 = u(r7).j(i7 - t6, i8 == 2 ? 0 : i8, z6);
        if (j7 != -1) {
            return t6 + j7;
        }
        int w6 = w(r7, z6);
        while (w6 != -1 && u(w6).o()) {
            w6 = w(w6, z6);
        }
        if (w6 != -1) {
            return t(w6) + u(w6).g(z6);
        }
        if (i8 == 2) {
            return g(z6);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int k(int i7, int i8, boolean z6) {
        int r7 = r(i7);
        int t6 = t(r7);
        int k7 = u(r7).k(i7 - t6, 0, false);
        if (k7 != -1) {
            return t6 + k7;
        }
        int x6 = x(r7, false);
        while (x6 != -1 && u(x6).o()) {
            x6 = x(x6, false);
        }
        if (x6 != -1) {
            return t(x6) + u(x6).h(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final pf0 n(Object obj, pf0 pf0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p7 = p(obj2);
        int t6 = t(p7);
        u(p7).n(obj3, pf0Var);
        pf0Var.f10218c += t6;
        pf0Var.f10217b = obj;
        return pf0Var;
    }

    protected abstract int p(Object obj);

    protected abstract int q(int i7);

    protected abstract int r(int i7);

    protected abstract int s(int i7);

    protected abstract int t(int i7);

    protected abstract ei0 u(int i7);

    protected abstract Object v(int i7);
}
