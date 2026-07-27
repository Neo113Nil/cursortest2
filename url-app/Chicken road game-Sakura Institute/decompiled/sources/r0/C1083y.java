package r0;

import Z.C0311h;
import Z.C0323u;
import c0.C0531b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.C0976l;
import s0.C1166s;

/* renamed from: r0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083y extends a0 {

    /* renamed from: R, reason: collision with root package name */
    public static final C0311h f9853R;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC1081w f9854P;

    /* renamed from: Q, reason: collision with root package name */
    public C1082x f9855Q;

    static {
        C0311h g4 = Z.K.g();
        int i2 = C0323u.f4548h;
        g4.e(C0323u.f4545e);
        g4.k(1.0f);
        g4.l(1);
        f9853R = g4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1083y(E e4, InterfaceC1081w interfaceC1081w) {
        super(e4);
        this.f9854P = interfaceC1081w;
        this.f9855Q = e4.f9596i != null ? new C1082x(this) : null;
        if ((((S.n) interfaceC1081w).f3978d.f3980i & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // r0.a0
    public final void J0() {
        if (this.f9855Q == null) {
            this.f9855Q = new C1082x(this);
        }
    }

    @Override // r0.a0
    public final P M0() {
        return this.f9855Q;
    }

    @Override // r0.a0
    public final S.n O0() {
        return ((S.n) this.f9854P).f3978d;
    }

    @Override // p0.InterfaceC0944E
    public final int S(int i2) {
        InterfaceC1081w interfaceC1081w = this.f9854P;
        a0 a0Var = this.f9763s;
        Intrinsics.c(a0Var);
        return interfaceC1081w.c(this, a0Var, i2);
    }

    @Override // p0.InterfaceC0944E
    public final int X(int i2) {
        InterfaceC1081w interfaceC1081w = this.f9854P;
        a0 a0Var = this.f9763s;
        Intrinsics.c(a0Var);
        return interfaceC1081w.b(this, a0Var, i2);
    }

    @Override // p0.InterfaceC0944E
    public final int Z(int i2) {
        InterfaceC1081w interfaceC1081w = this.f9854P;
        a0 a0Var = this.f9763s;
        Intrinsics.c(a0Var);
        return interfaceC1081w.d(this, a0Var, i2);
    }

    @Override // p0.InterfaceC0944E
    public final AbstractC0954O a(long j4) {
        q0(j4);
        InterfaceC1081w interfaceC1081w = this.f9854P;
        a0 a0Var = this.f9763s;
        Intrinsics.c(a0Var);
        d1(interfaceC1081w.i(this, a0Var, j4));
        Y0();
        return this;
    }

    @Override // r0.a0
    public final void a1(Z.r rVar, C0531b c0531b) {
        a0 a0Var = this.f9763s;
        Intrinsics.c(a0Var);
        a0Var.G0(rVar, c0531b);
        if (((C1166s) H.a(this.f9762r)).getShowLayoutBounds()) {
            H0(rVar, f9853R);
        }
    }

    @Override // p0.InterfaceC0944E
    public final int b(int i2) {
        InterfaceC1081w interfaceC1081w = this.f9854P;
        a0 a0Var = this.f9763s;
        Intrinsics.c(a0Var);
        return interfaceC1081w.f(this, a0Var, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l1(InterfaceC1081w interfaceC1081w) {
        if (!interfaceC1081w.equals(this.f9854P) && (((S.n) interfaceC1081w).f3978d.f3980i & 512) != 0) {
            throw new ClassCastException();
        }
        this.f9854P = interfaceC1081w;
    }

    @Override // p0.AbstractC0954O
    public final void n0(long j4, float f4, Function1 function1) {
        b1(j4, f4, function1);
        if (this.f9702m) {
            return;
        }
        Z0();
        x0().l();
        Intrinsics.c(this.f9763s);
    }

    @Override // r0.O
    public final int r0(C0976l c0976l) {
        C1082x c1082x = this.f9855Q;
        if (c1082x == null) {
            return AbstractC1065f.c(this, c0976l);
        }
        Integer num = (Integer) c1082x.f9712w.get(c0976l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
