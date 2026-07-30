package D0;

import com.google.android.gms.internal.ads.AbstractC3149eQ;
import com.google.android.gms.internal.ads.C3741pO;
import com.google.android.gms.internal.ads.C3877s;
import com.google.android.gms.internal.ads.C4164xG;
import com.google.android.gms.internal.ads.FO;
import com.google.android.gms.internal.ads.InterfaceC3233g0;
import com.google.android.gms.internal.ads.InterfaceC3716p;
import com.google.android.gms.internal.ads.Js;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.TP;
import com.google.android.gms.internal.ads.VQ;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public int f590a;

    /* renamed from: b, reason: collision with root package name */
    public int f591b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f592c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f593d;

    /* renamed from: e, reason: collision with root package name */
    public Object f594e;

    /* renamed from: f, reason: collision with root package name */
    public Object f595f;

    public static boolean l(AbstractC3149eQ abstractC3149eQ) {
        return abstractC3149eQ.f30355A != 0;
    }

    public static final void n(AbstractC3149eQ abstractC3149eQ) {
        int i = abstractC3149eQ.f30355A;
        if (i == 2) {
            PA.T(i == 2);
            abstractC3149eQ.f30355A = 1;
            abstractC3149eQ.f();
        }
    }

    public boolean A(C3741pO c3741pO) {
        return h(c3741pO, (AbstractC3149eQ) this.f594e) && h(c3741pO, (AbstractC3149eQ) this.f595f);
    }

    public void B(long j9, long j10) {
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        if (l(abstractC3149eQ)) {
            abstractC3149eQ.G(j9, j10);
        }
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ2 == null || abstractC3149eQ2.f30355A == 0) {
            return;
        }
        abstractC3149eQ2.G(j9, j10);
    }

    public boolean C(C3741pO c3741pO) {
        AbstractC3149eQ m8 = m(c3741pO);
        return m8 == null || m8.q0() || m8.H() || m8.I();
    }

    public void D() {
        int i;
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        int i4 = abstractC3149eQ.f30355A;
        if (i4 == 1 && this.f591b != 4) {
            PA.T(i4 == 1);
            abstractC3149eQ.f30355A = 2;
            abstractC3149eQ.d();
            return;
        }
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ2 == null || (i = abstractC3149eQ2.f30355A) != 1 || this.f591b == 3) {
            return;
        }
        PA.T(i == 1);
        abstractC3149eQ2.f30355A = 2;
        abstractC3149eQ2.d();
    }

    public void a() {
        int i = this.f591b;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f591b = 0;
                return;
            }
            return;
        }
        boolean z8 = i == 4;
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        if (z8) {
            abstractC3149eQ2.getClass();
            abstractC3149eQ2.c(17, abstractC3149eQ);
        } else {
            abstractC3149eQ2.getClass();
            abstractC3149eQ.c(17, abstractC3149eQ2);
        }
        this.f591b = this.f591b != 4 ? 1 : 0;
    }

    public void b() {
        if (!l((AbstractC3149eQ) this.f594e)) {
            j(true);
        }
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ == null || abstractC3149eQ.f30355A != 0) {
            return;
        }
        j(false);
    }

    public int c(C3741pO c3741pO, C3877s c3877s, Js js) {
        int k6 = k((AbstractC3149eQ) this.f594e, c3741pO, c3877s, js);
        return k6 == 1 ? k((AbstractC3149eQ) this.f595f, c3741pO, c3877s, js) : k6;
    }

    public void d() {
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        PA.T(abstractC3149eQ.f30355A == 0);
        abstractC3149eQ.k();
        this.f592c = false;
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ2 != null) {
            PA.T(abstractC3149eQ2.f30355A == 0);
            abstractC3149eQ2.k();
            this.f593d = false;
        }
    }

    public void e(Object obj) {
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        if (abstractC3149eQ.f30422u != 2) {
            return;
        }
        int i = this.f591b;
        if (i != 4 && i != 1) {
            abstractC3149eQ.c(1, obj);
            return;
        }
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        abstractC3149eQ2.getClass();
        abstractC3149eQ2.c(1, obj);
    }

    public void f(InterfaceC3233g0 interfaceC3233g0) {
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        if (abstractC3149eQ.f30422u != 2) {
            return;
        }
        abstractC3149eQ.c(7, interfaceC3233g0);
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ2 != null) {
            abstractC3149eQ2.c(7, interfaceC3233g0);
        }
    }

    public boolean g() {
        int i = this.f591b;
        if (i == 0 || i == 2 || i == 4) {
            return l((AbstractC3149eQ) this.f594e);
        }
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f595f;
        abstractC3149eQ.getClass();
        return abstractC3149eQ.f30355A != 0;
    }

    public boolean h(C3741pO c3741pO, AbstractC3149eQ abstractC3149eQ) {
        if (abstractC3149eQ == null) {
            return true;
        }
        VQ[] vqArr = c3741pO.f33387c;
        int i = this.f590a;
        VQ vq = vqArr[i];
        VQ vq2 = abstractC3149eQ.f30357B;
        if (vq2 == null) {
            return true;
        }
        if (vq2 == vq && (vq == null || abstractC3149eQ.q0())) {
            return true;
        }
        C3741pO c3741pO2 = c3741pO.f33396m;
        return c3741pO2 != null && c3741pO2.f33387c[i] == abstractC3149eQ.f30357B;
    }

    public void i(AbstractC3149eQ abstractC3149eQ, Js js) {
        PA.T(((AbstractC3149eQ) this.f594e) == abstractC3149eQ || ((AbstractC3149eQ) this.f595f) == abstractC3149eQ);
        if (l(abstractC3149eQ)) {
            if (abstractC3149eQ == ((AbstractC3149eQ) js.f25835x)) {
                js.f25836y = null;
                js.f25835x = null;
                js.f25831n = true;
            }
            n(abstractC3149eQ);
            PA.T(abstractC3149eQ.f30355A == 1);
            C4164xG c4164xG = abstractC3149eQ.f30424v;
            c4164xG.f35132u = null;
            c4164xG.f35133v = null;
            abstractC3149eQ.f30355A = 0;
            abstractC3149eQ.f30357B = null;
            abstractC3149eQ.f30359C = null;
            abstractC3149eQ.f30366G = false;
            abstractC3149eQ.i();
            abstractC3149eQ.J = null;
            abstractC3149eQ.f30373K = com.anythink.basead.exoplayer.b.f6539b;
        }
    }

    public void j(boolean z8) {
        if (z8) {
            if (this.f592c) {
                AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
                PA.T(abstractC3149eQ.f30355A == 0);
                C4164xG c4164xG = abstractC3149eQ.f30424v;
                c4164xG.f35132u = null;
                c4164xG.f35133v = null;
                abstractC3149eQ.j();
                this.f592c = false;
                return;
            }
            return;
        }
        if (this.f593d) {
            AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
            abstractC3149eQ2.getClass();
            PA.T(abstractC3149eQ2.f30355A == 0);
            C4164xG c4164xG2 = abstractC3149eQ2.f30424v;
            c4164xG2.f35132u = null;
            c4164xG2.f35133v = null;
            abstractC3149eQ2.j();
            this.f593d = false;
        }
    }

    public int k(AbstractC3149eQ abstractC3149eQ, C3741pO c3741pO, C3877s c3877s, Js js) {
        int i;
        if (abstractC3149eQ != null && abstractC3149eQ.f30355A != 0) {
            AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f594e;
            boolean z8 = abstractC3149eQ != abstractC3149eQ2;
            if (abstractC3149eQ == abstractC3149eQ2 && ((i = this.f591b) == 2 || i == 4)) {
                return 1;
            }
            if (abstractC3149eQ == ((AbstractC3149eQ) this.f595f) && this.f591b == 3) {
                return 1;
            }
            VQ vq = abstractC3149eQ.f30357B;
            VQ[] vqArr = c3741pO.f33387c;
            int i4 = this.f590a;
            VQ vq2 = vqArr[i4];
            boolean b9 = c3877s.b(i4);
            if (!b9 || vq != vq2) {
                if (!abstractC3149eQ.f30366G) {
                    InterfaceC3716p interfaceC3716p = ((InterfaceC3716p[]) c3877s.f34151v)[i4];
                    int c4 = interfaceC3716p != null ? interfaceC3716p.c() : 0;
                    TP[] tpArr = new TP[c4];
                    for (int i9 = 0; i9 < c4; i9++) {
                        interfaceC3716p.getClass();
                        tpArr[i9] = interfaceC3716p.t(i9);
                    }
                    VQ vq3 = vqArr[i4];
                    vq3.getClass();
                    abstractC3149eQ.p0(tpArr, vq3, c3741pO.a(), c3741pO.f33399p, c3741pO.f33391g.f33713a);
                    return 3;
                }
                if (!abstractC3149eQ.I()) {
                    return 0;
                }
                i(abstractC3149eQ, js);
                if (!b9 || q()) {
                    j(!z8);
                    return 1;
                }
            }
        }
        return 1;
    }

    public AbstractC3149eQ m(C3741pO c3741pO) {
        if (c3741pO != null) {
            VQ vq = c3741pO.f33387c[this.f590a];
            if (vq != null) {
                AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
                if (abstractC3149eQ.f30357B == vq) {
                    return abstractC3149eQ;
                }
                AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
                if (abstractC3149eQ2 != null && abstractC3149eQ2.f30357B == vq) {
                    return abstractC3149eQ2;
                }
            }
        }
        return null;
    }

    public boolean o() {
        return ((AbstractC3149eQ) this.f595f) != null;
    }

    public void p() {
        int i;
        PA.T(!q());
        if (l((AbstractC3149eQ) this.f594e)) {
            i = 3;
        } else {
            i = 2;
            AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f595f;
            if (abstractC3149eQ != null && abstractC3149eQ.f30355A != 0) {
                i = 4;
            }
        }
        this.f591b = i;
    }

    public boolean q() {
        int i = this.f591b;
        return i == 2 || i == 4 || i == 3;
    }

    public int r() {
        boolean l9 = l((AbstractC3149eQ) this.f594e);
        int i = 0;
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ != null && abstractC3149eQ.f30355A != 0) {
            i = 1;
        }
        return (l9 ? 1 : 0) + i;
    }

    public void s() {
        int i = ((AbstractC3149eQ) this.f594e).f30422u;
    }

    public boolean t(C3741pO c3741pO) {
        AbstractC3149eQ m8 = m(c3741pO);
        m8.getClass();
        return m8.q0();
    }

    public void u(C3741pO c3741pO) {
        AbstractC3149eQ m8 = m(c3741pO);
        m8.getClass();
        m8.f30366G = true;
    }

    public void v(C3877s c3877s, C3877s c3877s2) {
        int i;
        int i4 = this.f590a;
        boolean b9 = c3877s.b(i4);
        boolean b10 = c3877s2.b(i4);
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ2 == null || (i = this.f591b) == 3 || (i == 0 && l(abstractC3149eQ))) {
            abstractC3149eQ2 = abstractC3149eQ;
        }
        if (!b9 || abstractC3149eQ2.f30366G) {
            return;
        }
        int i9 = abstractC3149eQ.f30422u;
        FO fo = ((FO[]) c3877s.f34150u)[i4];
        FO fo2 = ((FO[]) c3877s2.f34150u)[i4];
        if (b10 && Objects.equals(fo2, fo) && !q()) {
            return;
        }
        abstractC3149eQ2.f30366G = true;
    }

    public void w() {
        int i;
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        if (l(abstractC3149eQ) && (i = this.f591b) != 4 && i != 2) {
            abstractC3149eQ.f30366G = true;
        }
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ2 == null || abstractC3149eQ2.f30355A == 0 || this.f591b == 3) {
            return;
        }
        abstractC3149eQ2.f30366G = true;
    }

    public void x() {
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        if (l(abstractC3149eQ)) {
            abstractC3149eQ.r();
            return;
        }
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        if (abstractC3149eQ2 == null || abstractC3149eQ2.f30355A == 0) {
            return;
        }
        abstractC3149eQ2.r();
    }

    public boolean y() {
        AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f594e;
        boolean I2 = l(abstractC3149eQ) ? abstractC3149eQ.I() : true;
        AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) this.f595f;
        return (abstractC3149eQ2 == null || abstractC3149eQ2.f30355A == 0) ? I2 : I2 & abstractC3149eQ2.I();
    }

    public boolean z(C3741pO c3741pO) {
        int i = this.f591b;
        return ((i == 2 || i == 4) && m(c3741pO) == ((AbstractC3149eQ) this.f594e)) || (this.f591b == 3 && m(c3741pO) == ((AbstractC3149eQ) this.f595f));
    }
}
