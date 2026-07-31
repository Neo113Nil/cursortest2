package t0;

import android.graphics.Paint;
import b0.C0339h;
import b0.C0352v;
import e0.C0416b;
import e2.InterfaceC0424c;
import r0.AbstractC0893O;
import r0.C0915l;
import u0.C1123s;

/* renamed from: t0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011y extends b0 {

    /* renamed from: O, reason: collision with root package name */
    public static final C0339h f8801O;

    /* renamed from: M, reason: collision with root package name */
    public InterfaceC1009w f8802M;

    /* renamed from: N, reason: collision with root package name */
    public C1010x f8803N;

    static {
        C0339h g3 = b0.M.g();
        g3.e(C0352v.f5437e);
        ((Paint) g3.f5415b).setStrokeWidth(1.0f);
        g3.i(1);
        f8801O = g3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1011y(E e3, InterfaceC1009w interfaceC1009w) {
        super(e3);
        this.f8802M = interfaceC1009w;
        this.f8803N = e3.f8542f != null ? new C1010x(this) : null;
        if ((((U.p) interfaceC1009w).f4489d.f4491f & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // t0.b0
    public final void F0() {
        if (this.f8803N == null) {
            this.f8803N = new C1010x(this);
        }
    }

    @Override // t0.b0
    public final Q I0() {
        return this.f8803N;
    }

    @Override // t0.b0
    public final U.p K0() {
        return ((U.p) this.f8802M).f4489d;
    }

    @Override // r0.InterfaceC0884F
    public final int O(int i3) {
        InterfaceC1009w interfaceC1009w = this.f8802M;
        b0 b0Var = this.f8712p;
        f2.j.c(b0Var);
        return interfaceC1009w.e(this, b0Var, i3);
    }

    @Override // r0.InterfaceC0884F
    public final int U(int i3) {
        InterfaceC1009w interfaceC1009w = this.f8802M;
        b0 b0Var = this.f8712p;
        f2.j.c(b0Var);
        return interfaceC1009w.b(this, b0Var, i3);
    }

    @Override // r0.InterfaceC0884F
    public final int V(int i3) {
        InterfaceC1009w interfaceC1009w = this.f8802M;
        b0 b0Var = this.f8712p;
        f2.j.c(b0Var);
        return interfaceC1009w.c(this, b0Var, i3);
    }

    @Override // t0.b0
    public final void W0(b0.r rVar, C0416b c0416b) {
        b0 b0Var = this.f8712p;
        f2.j.c(b0Var);
        b0Var.C0(rVar, c0416b);
        if (((C1123s) H.a(this.f8711o)).getShowLayoutBounds()) {
            D0(rVar, f8801O);
        }
    }

    @Override // r0.InterfaceC0884F
    public final AbstractC0893O b(long j3) {
        m0(j3);
        InterfaceC1009w interfaceC1009w = this.f8802M;
        b0 b0Var = this.f8712p;
        f2.j.c(b0Var);
        Z0(interfaceC1009w.g(this, b0Var, j3));
        U0();
        return this;
    }

    @Override // r0.InterfaceC0884F
    public final int c(int i3) {
        InterfaceC1009w interfaceC1009w = this.f8802M;
        b0 b0Var = this.f8712p;
        f2.j.c(b0Var);
        return interfaceC1009w.f(this, b0Var, i3);
    }

    @Override // r0.AbstractC0893O
    public final void f0(long j3, float f3, InterfaceC0424c interfaceC0424c) {
        X0(j3, f3, interfaceC0424c);
        if (this.f8653j) {
            return;
        }
        V0();
        t0().j();
        f2.j.c(this.f8712p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i1(InterfaceC1009w interfaceC1009w) {
        if (!interfaceC1009w.equals(this.f8802M) && (((U.p) interfaceC1009w).f4489d.f4491f & 512) != 0) {
            throw new ClassCastException();
        }
        this.f8802M = interfaceC1009w;
    }

    @Override // t0.P
    public final int n0(C0915l c0915l) {
        C1010x c1010x = this.f8803N;
        if (c1010x == null) {
            return AbstractC0993f.c(this, c0915l);
        }
        Integer num = (Integer) c1010x.f8663t.get(c0915l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
