package r0;

import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.C0976l;

/* renamed from: r0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082x extends P {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1083y f9852x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1082x(C1083y c1083y) {
        super(c1083y);
        this.f9852x = c1083y;
    }

    @Override // p0.InterfaceC0944E
    public final int S(int i2) {
        C1083y c1083y = this.f9852x;
        InterfaceC1081w interfaceC1081w = c1083y.f9854P;
        a0 a0Var = c1083y.f9763s;
        Intrinsics.c(a0Var);
        P M02 = a0Var.M0();
        Intrinsics.c(M02);
        return interfaceC1081w.c(this, M02, i2);
    }

    @Override // p0.InterfaceC0944E
    public final int X(int i2) {
        C1083y c1083y = this.f9852x;
        InterfaceC1081w interfaceC1081w = c1083y.f9854P;
        a0 a0Var = c1083y.f9763s;
        Intrinsics.c(a0Var);
        P M02 = a0Var.M0();
        Intrinsics.c(M02);
        return interfaceC1081w.b(this, M02, i2);
    }

    @Override // p0.InterfaceC0944E
    public final int Z(int i2) {
        C1083y c1083y = this.f9852x;
        InterfaceC1081w interfaceC1081w = c1083y.f9854P;
        a0 a0Var = c1083y.f9763s;
        Intrinsics.c(a0Var);
        P M02 = a0Var.M0();
        Intrinsics.c(M02);
        return interfaceC1081w.d(this, M02, i2);
    }

    @Override // p0.InterfaceC0944E
    public final AbstractC0954O a(long j4) {
        q0(j4);
        new M0.a(j4);
        C1083y c1083y = this.f9852x;
        c1083y.getClass();
        InterfaceC1081w interfaceC1081w = c1083y.f9854P;
        a0 a0Var = c1083y.f9763s;
        Intrinsics.c(a0Var);
        P M02 = a0Var.M0();
        Intrinsics.c(M02);
        P.C0(this, interfaceC1081w.i(this, M02, j4));
        return this;
    }

    @Override // p0.InterfaceC0944E
    public final int b(int i2) {
        C1083y c1083y = this.f9852x;
        InterfaceC1081w interfaceC1081w = c1083y.f9854P;
        a0 a0Var = c1083y.f9763s;
        Intrinsics.c(a0Var);
        P M02 = a0Var.M0();
        Intrinsics.c(M02);
        return interfaceC1081w.f(this, M02, i2);
    }

    @Override // r0.O
    public final int r0(C0976l c0976l) {
        int c4 = AbstractC1065f.c(this, c0976l);
        this.f9712w.put(c0976l, Integer.valueOf(c4));
        return c4;
    }
}
