package r0;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.C0943D;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0980p;

/* loaded from: classes.dex */
public abstract class P extends O implements InterfaceC0944E {

    /* renamed from: r, reason: collision with root package name */
    public final a0 f9707r;

    /* renamed from: t, reason: collision with root package name */
    public LinkedHashMap f9709t;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0946G f9711v;

    /* renamed from: s, reason: collision with root package name */
    public long f9708s = 0;

    /* renamed from: u, reason: collision with root package name */
    public final C0943D f9710u = new C0943D(this);

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f9712w = new LinkedHashMap();

    public P(a0 a0Var) {
        this.f9707r = a0Var;
    }

    public static final void C0(P p4, InterfaceC0946G interfaceC0946G) {
        Unit unit;
        LinkedHashMap linkedHashMap;
        if (interfaceC0946G != null) {
            p4.p0(u3.d.c(interfaceC0946G.g(), interfaceC0946G.j()));
            unit = Unit.f7487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            p4.p0(0L);
        }
        if (!Intrinsics.a(p4.f9711v, interfaceC0946G) && interfaceC0946G != null && ((((linkedHashMap = p4.f9709t) != null && !linkedHashMap.isEmpty()) || !interfaceC0946G.k().isEmpty()) && !Intrinsics.a(interfaceC0946G.k(), p4.f9709t))) {
            J j4 = p4.f9707r.f9762r.f9584C.f9692s;
            Intrinsics.c(j4);
            j4.f9644w.f();
            LinkedHashMap linkedHashMap2 = p4.f9709t;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                p4.f9709t = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC0946G.k());
        }
        p4.f9711v = interfaceC0946G;
    }

    @Override // r0.O, p0.InterfaceC0977m
    public final boolean A() {
        return true;
    }

    @Override // r0.O
    public final void B0() {
        n0(this.f9708s, 0.0f, null);
    }

    public void D0() {
        x0().l();
    }

    public final void E0(long j4) {
        if (!M0.h.a(this.f9708s, j4)) {
            this.f9708s = j4;
            a0 a0Var = this.f9707r;
            J j5 = a0Var.f9762r.f9584C.f9692s;
            if (j5 != null) {
                j5.t0();
            }
            O.A0(a0Var);
        }
        if (this.f9703n) {
            return;
        }
        s0(new k0(x0(), this));
    }

    public final long F0(P p4, boolean z4) {
        long j4 = 0;
        P p5 = this;
        while (!p5.equals(p4)) {
            if (!p5.f9701l || !z4) {
                j4 = M0.h.c(j4, p5.f9708s);
            }
            a0 a0Var = p5.f9707r.f9764t;
            Intrinsics.c(a0Var);
            p5 = a0Var.M0();
            Intrinsics.c(p5);
        }
        return j4;
    }

    @Override // M0.b
    public final float e() {
        return this.f9707r.e();
    }

    @Override // p0.InterfaceC0977m
    public final M0.k getLayoutDirection() {
        return this.f9707r.f9762r.f9611x;
    }

    @Override // p0.AbstractC0954O
    public final void n0(long j4, float f4, Function1 function1) {
        E0(j4);
        if (this.f9702m) {
            return;
        }
        D0();
    }

    @Override // M0.b
    public final float q() {
        return this.f9707r.q();
    }

    @Override // p0.AbstractC0954O, p0.InterfaceC0944E
    public final Object r() {
        return this.f9707r.r();
    }

    @Override // r0.O
    public final O t0() {
        a0 a0Var = this.f9707r.f9763s;
        if (a0Var != null) {
            return a0Var.M0();
        }
        return null;
    }

    @Override // r0.O
    public final InterfaceC0980p u0() {
        return this.f9710u;
    }

    @Override // r0.O
    public final boolean v0() {
        return this.f9711v != null;
    }

    @Override // r0.O
    public final E w0() {
        return this.f9707r.f9762r;
    }

    @Override // r0.O
    public final InterfaceC0946G x0() {
        InterfaceC0946G interfaceC0946G = this.f9711v;
        if (interfaceC0946G != null) {
            return interfaceC0946G;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // r0.O
    public final O y0() {
        a0 a0Var = this.f9707r.f9764t;
        if (a0Var != null) {
            return a0Var.M0();
        }
        return null;
    }

    @Override // r0.O
    public final long z0() {
        return this.f9708s;
    }
}
