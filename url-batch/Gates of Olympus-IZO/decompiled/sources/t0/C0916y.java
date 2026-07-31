package t0;

import android.graphics.Paint;
import b0.AbstractC0259J;
import b0.C0276i;
import b0.C0288u;
import b0.InterfaceC0285r;
import e0.C0336b;
import r0.C0837j;
import u0.C0997t;

/* renamed from: t0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916y extends a0 {

    /* renamed from: N, reason: collision with root package name */
    public static final C0276i f7967N;

    /* renamed from: L, reason: collision with root package name */
    public InterfaceC0914w f7968L;

    /* renamed from: M, reason: collision with root package name */
    public C0915x f7969M;

    static {
        C0276i f3 = AbstractC0259J.f();
        f3.e(C0288u.f4294d);
        ((Paint) f3.f4273b).setStrokeWidth(1.0f);
        f3.j(1);
        f7967N = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0916y(D d3, InterfaceC0914w interfaceC0914w) {
        super(d3);
        this.f7968L = interfaceC0914w;
        this.f7969M = d3.f7718f != null ? new C0915x(this) : null;
        if ((((U.k) interfaceC0914w).f3303d.f3305f & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // t0.a0
    public final U.k B0() {
        return ((U.k) this.f7968L).f3303d;
    }

    @Override // t0.a0
    public final void O0(InterfaceC0285r interfaceC0285r, C0336b c0336b) {
        a0 a0Var = this.p;
        Z1.i.c(a0Var);
        a0Var.t0(interfaceC0285r, c0336b);
        if (((C0997t) G.a(this.f7877o)).getShowLayoutBounds()) {
            u0(interfaceC0285r, f7967N);
        }
    }

    @Override // r0.H
    public final void Q(long j3, float f3, Y1.c cVar) {
        P0(j3, f3, cVar);
        if (this.f7824j) {
            return;
        }
        N0();
        k0().j();
        Z1.i.c(this.p);
    }

    @Override // t0.O
    public final int W(C0837j c0837j) {
        C0915x c0915x = this.f7969M;
        if (c0915x == null) {
            return AbstractC0898f.c(this, c0837j);
        }
        Integer num = (Integer) c0915x.f7833t.get(c0837j);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(InterfaceC0914w interfaceC0914w) {
        if (!interfaceC0914w.equals(this.f7968L) && (((U.k) interfaceC0914w).f3303d.f3305f & 512) != 0) {
            throw new ClassCastException();
        }
        this.f7968L = interfaceC0914w;
    }

    @Override // r0.z
    public final r0.H b(long j3) {
        U(j3);
        InterfaceC0914w interfaceC0914w = this.f7968L;
        a0 a0Var = this.p;
        Z1.i.c(a0Var);
        R0(interfaceC0914w.b(this, a0Var, j3));
        M0();
        return this;
    }

    @Override // t0.a0
    public final void w0() {
        if (this.f7969M == null) {
            this.f7969M = new C0915x(this);
        }
    }

    @Override // t0.a0
    public final P z0() {
        return this.f7969M;
    }
}
