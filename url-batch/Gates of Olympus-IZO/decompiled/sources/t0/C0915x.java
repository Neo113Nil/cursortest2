package t0;

import r0.C0837j;

/* renamed from: t0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915x extends P {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0916y f7966u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0915x(C0916y c0916y) {
        super(c0916y);
        this.f7966u = c0916y;
    }

    @Override // t0.O
    public final int W(C0837j c0837j) {
        int c3 = AbstractC0898f.c(this, c0837j);
        this.f7833t.put(c0837j, Integer.valueOf(c3));
        return c3;
    }

    @Override // r0.z
    public final r0.H b(long j3) {
        U(j3);
        new M0.a(j3);
        C0916y c0916y = this.f7966u;
        c0916y.getClass();
        InterfaceC0914w interfaceC0914w = c0916y.f7968L;
        a0 a0Var = c0916y.p;
        Z1.i.c(a0Var);
        P z02 = a0Var.z0();
        Z1.i.c(z02);
        P.p0(this, interfaceC0914w.b(this, z02, j3));
        return this;
    }
}
