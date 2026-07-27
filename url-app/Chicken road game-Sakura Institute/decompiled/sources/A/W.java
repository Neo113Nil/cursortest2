package A;

import A0.C0036g;
import G0.C0237a;
import a.AbstractC0345a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0980p;
import w.o0;
import z2.C1440x;
import z2.C1441y;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f64a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.I f66c;

    /* renamed from: d, reason: collision with root package name */
    public final G0.s f67d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f68e;

    /* renamed from: f, reason: collision with root package name */
    public long f69f;

    /* renamed from: g, reason: collision with root package name */
    public final C0036g f70g;

    /* renamed from: h, reason: collision with root package name */
    public final G0.y f71h;

    /* renamed from: i, reason: collision with root package name */
    public final o0 f72i;

    public W(G0.y yVar, G0.s sVar, o0 o0Var, j0 j0Var) {
        C0036g c0036g = yVar.f3093a;
        A0.I i2 = o0Var != null ? o0Var.f11290a : null;
        long j4 = yVar.f3094b;
        this.f64a = c0036g;
        this.f65b = j4;
        this.f66c = i2;
        this.f67d = sVar;
        this.f68e = j0Var;
        this.f69f = j4;
        this.f70g = c0036g;
        this.f71h = yVar;
        this.f72i = o0Var;
    }

    public final List a(Function1 function1) {
        if (!A0.K.b(this.f69f)) {
            return C1441y.e(new C0237a("", 0), new G0.x(A0.K.e(this.f69f), A0.K.e(this.f69f)));
        }
        G0.i iVar = (G0.i) function1.invoke(this);
        if (iVar != null) {
            return C1440x.a(iVar);
        }
        return null;
    }

    public final Integer b() {
        A0.I i2 = this.f66c;
        if (i2 == null) {
            return null;
        }
        int d4 = A0.K.d(this.f69f);
        G0.s sVar = this.f67d;
        return Integer.valueOf(sVar.a(i2.d(i2.e(sVar.b(d4)), true)));
    }

    public final Integer c() {
        A0.I i2 = this.f66c;
        if (i2 == null) {
            return null;
        }
        int e4 = A0.K.e(this.f69f);
        G0.s sVar = this.f67d;
        return Integer.valueOf(sVar.a(i2.h(i2.e(sVar.b(e4)))));
    }

    public final Integer d() {
        int length;
        A0.I i2 = this.f66c;
        if (i2 == null) {
            return null;
        }
        int q2 = q();
        while (true) {
            C0036g c0036g = this.f64a;
            if (q2 < c0036g.f328a.length()) {
                int length2 = this.f70g.f328a.length() - 1;
                if (q2 <= length2) {
                    length2 = q2;
                }
                long k4 = i2.k(length2);
                int i4 = A0.K.f300c;
                int i5 = (int) (k4 & 4294967295L);
                if (i5 > q2) {
                    length = this.f67d.a(i5);
                    break;
                }
                q2++;
            } else {
                length = c0036g.f328a.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i2;
        A0.I i4 = this.f66c;
        if (i4 == null) {
            return null;
        }
        int q2 = q();
        while (true) {
            if (q2 <= 0) {
                i2 = 0;
                break;
            }
            int length = this.f70g.f328a.length() - 1;
            if (q2 <= length) {
                length = q2;
            }
            long k4 = i4.k(length);
            int i5 = A0.K.f300c;
            int i6 = (int) (k4 >> 32);
            if (i6 < q2) {
                i2 = this.f67d.a(i6);
                break;
            }
            q2--;
        }
        return Integer.valueOf(i2);
    }

    public final boolean f() {
        A0.I i2 = this.f66c;
        return (i2 != null ? i2.i(q()) : null) != L0.h.f3507e;
    }

    public final int g(A0.I i2, int i4) {
        int q2 = q();
        j0 j0Var = this.f68e;
        if (j0Var.f159a == null) {
            j0Var.f159a = Float.valueOf(i2.c(q2).f4374a);
        }
        int e4 = i2.e(q2) + i4;
        if (e4 < 0) {
            return 0;
        }
        A0.o oVar = i2.f290b;
        if (e4 >= oVar.f355f) {
            return this.f70g.f328a.length();
        }
        float b4 = oVar.b(e4) - 1;
        Float f4 = j0Var.f159a;
        Intrinsics.c(f4);
        float floatValue = f4.floatValue();
        if ((f() && floatValue >= i2.g(e4)) || (!f() && floatValue <= i2.f(e4))) {
            return i2.d(e4, true);
        }
        return this.f67d.a(oVar.e(AbstractC0345a.c(f4.floatValue(), b4)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(o0 o0Var, int i2) {
        Y.d dVar;
        InterfaceC0980p interfaceC0980p = o0Var.f11291b;
        if (interfaceC0980p != null) {
            InterfaceC0980p interfaceC0980p2 = o0Var.f11292c;
            dVar = interfaceC0980p2 != null ? interfaceC0980p2.n(interfaceC0980p, true) : null;
        }
        dVar = Y.d.f4373e;
        long j4 = this.f71h.f3094b;
        int i4 = A0.K.f300c;
        G0.s sVar = this.f67d;
        int b4 = sVar.b((int) (j4 & 4294967295L));
        A0.I i5 = o0Var.f11290a;
        Y.d c4 = i5.c(b4);
        return sVar.a(i5.f290b.e(AbstractC0345a.c(c4.f4374a, (Y.f.b(u3.l.N(dVar.c(), dVar.b())) * i2) + c4.f4375b)));
    }

    public final void i() {
        C0036g c0036g = this.f70g;
        j0 j0Var = this.f68e;
        j0Var.f159a = null;
        if (c0036g.f328a.length() > 0) {
            if (f()) {
                j0Var.f159a = null;
                if (c0036g.f328a.length() > 0) {
                    String str = c0036g.f328a;
                    long j4 = this.f69f;
                    int i2 = A0.K.f300c;
                    int p4 = w.M.p((int) (j4 & 4294967295L), str);
                    if (p4 != -1) {
                        p(p4, p4);
                        return;
                    }
                    return;
                }
                return;
            }
            j0Var.f159a = null;
            if (c0036g.f328a.length() > 0) {
                String str2 = c0036g.f328a;
                long j5 = this.f69f;
                int i4 = A0.K.f300c;
                int m4 = w.M.m((int) (j5 & 4294967295L), str2);
                if (m4 != -1) {
                    p(m4, m4);
                }
            }
        }
    }

    public final void j() {
        this.f68e.f159a = null;
        C0036g c0036g = this.f70g;
        if (c0036g.f328a.length() > 0) {
            int d4 = A0.K.d(this.f69f);
            String str = c0036g.f328a;
            int n2 = w.M.n(str, d4);
            if (n2 == A0.K.d(this.f69f) && n2 != str.length()) {
                n2 = w.M.n(str, n2 + 1);
            }
            p(n2, n2);
        }
    }

    public final void k() {
        this.f68e.f159a = null;
        C0036g c0036g = this.f70g;
        if (c0036g.f328a.length() > 0) {
            int e4 = A0.K.e(this.f69f);
            String str = c0036g.f328a;
            int o4 = w.M.o(str, e4);
            if (o4 == A0.K.e(this.f69f) && o4 != 0) {
                o4 = w.M.o(str, o4 - 1);
            }
            p(o4, o4);
        }
    }

    public final void l() {
        C0036g c0036g = this.f70g;
        j0 j0Var = this.f68e;
        j0Var.f159a = null;
        if (c0036g.f328a.length() > 0) {
            if (f()) {
                j0Var.f159a = null;
                if (c0036g.f328a.length() > 0) {
                    String str = c0036g.f328a;
                    long j4 = this.f69f;
                    int i2 = A0.K.f300c;
                    int m4 = w.M.m((int) (j4 & 4294967295L), str);
                    if (m4 != -1) {
                        p(m4, m4);
                        return;
                    }
                    return;
                }
                return;
            }
            j0Var.f159a = null;
            if (c0036g.f328a.length() > 0) {
                String str2 = c0036g.f328a;
                long j5 = this.f69f;
                int i4 = A0.K.f300c;
                int p4 = w.M.p((int) (j5 & 4294967295L), str2);
                if (p4 != -1) {
                    p(p4, p4);
                }
            }
        }
    }

    public final void m() {
        Integer b4;
        this.f68e.f159a = null;
        if (this.f70g.f328a.length() <= 0 || (b4 = b()) == null) {
            return;
        }
        int intValue = b4.intValue();
        p(intValue, intValue);
    }

    public final void n() {
        Integer c4;
        this.f68e.f159a = null;
        if (this.f70g.f328a.length() <= 0 || (c4 = c()) == null) {
            return;
        }
        int intValue = c4.intValue();
        p(intValue, intValue);
    }

    public final void o() {
        if (this.f70g.f328a.length() > 0) {
            int i2 = A0.K.f300c;
            this.f69f = M1.a.j((int) (this.f65b >> 32), (int) (this.f69f & 4294967295L));
        }
    }

    public final void p(int i2, int i4) {
        this.f69f = M1.a.j(i2, i4);
    }

    public final int q() {
        long j4 = this.f69f;
        int i2 = A0.K.f300c;
        return this.f67d.b((int) (j4 & 4294967295L));
    }
}
