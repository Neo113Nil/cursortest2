package x1;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends w4.u {

    /* renamed from: e, reason: collision with root package name */
    public static c f8385e;

    /* renamed from: f, reason: collision with root package name */
    public static final q2.j f8386f = q2.j.f6053e;

    /* renamed from: g, reason: collision with root package name */
    public static final q2.j f8387g = q2.j.f6052d;

    /* renamed from: c, reason: collision with root package name */
    public g2.f0 f8388c;

    /* renamed from: d, reason: collision with root package name */
    public d2.n f8389d;

    @Override // w4.u
    public final int[] b(int i) {
        int i8;
        if (n().length() <= 0 || i >= n().length()) {
            return null;
        }
        try {
            d2.n nVar = this.f8389d;
            if (nVar == null) {
                q6.i.j("node");
                throw null;
            }
            e1.c g3 = nVar.g();
            int round = Math.round(g3.f2460d - g3.f2458b);
            if (i <= 0) {
                i = 0;
            }
            g2.f0 f0Var = this.f8388c;
            if (f0Var == null) {
                q6.i.j("layoutResult");
                throw null;
            }
            int a8 = f0Var.a(i);
            g2.f0 f0Var2 = this.f8388c;
            if (f0Var2 == null) {
                q6.i.j("layoutResult");
                throw null;
            }
            float d8 = f0Var2.d(a8) + round;
            g2.f0 f0Var3 = this.f8388c;
            if (f0Var3 == null) {
                q6.i.j("layoutResult");
                throw null;
            }
            if (f0Var3 == null) {
                q6.i.j("layoutResult");
                throw null;
            }
            if (d8 < f0Var3.d(f0Var3.f2942b.f2972b - 1)) {
                g2.f0 f0Var4 = this.f8388c;
                if (f0Var4 == null) {
                    q6.i.j("layoutResult");
                    throw null;
                }
                i8 = f0Var4.b(d8);
            } else {
                g2.f0 f0Var5 = this.f8388c;
                if (f0Var5 == null) {
                    q6.i.j("layoutResult");
                    throw null;
                }
                i8 = f0Var5.f2942b.f2972b;
            }
            return l(i, t(i8 - 1, f8387g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // w4.u
    public final int[] s(int i) {
        int i8;
        if (n().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            d2.n nVar = this.f8389d;
            if (nVar == null) {
                q6.i.j("node");
                throw null;
            }
            e1.c g3 = nVar.g();
            int round = Math.round(g3.f2460d - g3.f2458b);
            int length = n().length();
            if (length <= i) {
                i = length;
            }
            g2.f0 f0Var = this.f8388c;
            if (f0Var == null) {
                q6.i.j("layoutResult");
                throw null;
            }
            int a8 = f0Var.a(i);
            g2.f0 f0Var2 = this.f8388c;
            if (f0Var2 == null) {
                q6.i.j("layoutResult");
                throw null;
            }
            float d8 = f0Var2.d(a8) - round;
            if (d8 > 0.0f) {
                g2.f0 f0Var3 = this.f8388c;
                if (f0Var3 == null) {
                    q6.i.j("layoutResult");
                    throw null;
                }
                i8 = f0Var3.b(d8);
            } else {
                i8 = 0;
            }
            if (i == n().length() && i8 < a8) {
                i8++;
            }
            return l(t(i8, f8386f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int t(int i, q2.j jVar) {
        g2.f0 f0Var = this.f8388c;
        if (f0Var == null) {
            q6.i.j("layoutResult");
            throw null;
        }
        int c8 = f0Var.c(i);
        g2.f0 f0Var2 = this.f8388c;
        if (f0Var2 == null) {
            q6.i.j("layoutResult");
            throw null;
        }
        if (jVar != f0Var2.e(c8)) {
            g2.f0 f0Var3 = this.f8388c;
            if (f0Var3 != null) {
                return f0Var3.c(i);
            }
            q6.i.j("layoutResult");
            throw null;
        }
        g2.f0 f0Var4 = this.f8388c;
        if (f0Var4 == null) {
            q6.i.j("layoutResult");
            throw null;
        }
        g2.l lVar = f0Var4.f2942b;
        lVar.b(i);
        ArrayList arrayList = (ArrayList) lVar.f2975e;
        g2.a aVar = ((g2.o) arrayList.get(g2.a0.d(i, arrayList))).f2983a;
        return (aVar.f2897d.e(i - r6.f2986d) + r6.f2984b) - 1;
    }
}
