package t0;

import b0.C0261L;
import java.util.HashMap;
import java.util.Map;
import r0.AbstractC0830c;
import r0.C0837j;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final r0.H f7738a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7740c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7741d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7742e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7743f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7744g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0893a f7745h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7747j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7739b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f7746i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public E(InterfaceC0893a interfaceC0893a, int i3) {
        this.f7747j = i3;
        this.f7738a = (r0.H) interfaceC0893a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y1.e, Z1.g] */
    /* JADX WARN: Type inference failed for: r8v5, types: [r0.H, t0.a] */
    public static final void a(E e3, C0837j c0837j, int i3, a0 a0Var) {
        e3.getClass();
        float f3 = i3;
        long f4 = I2.l.f(f3, f3);
        while (true) {
            switch (e3.f7747j) {
                case 0:
                    C0261L c0261l = a0.f7869H;
                    f4 = a0Var.T0(f4, true);
                    break;
                default:
                    P z02 = a0Var.z0();
                    Z1.i.c(z02);
                    long j3 = z02.p;
                    f4 = a0.c.h(I2.l.f((int) (j3 >> 32), (int) (j3 & 4294967295L)), f4);
                    break;
            }
            a0Var = a0Var.f7878q;
            Z1.i.c(a0Var);
            if (a0Var.equals(e3.f7738a.A())) {
                int round = Math.round(c0837j instanceof C0837j ? a0.c.e(f4) : a0.c.d(f4));
                HashMap hashMap = e3.f7746i;
                if (hashMap.containsKey(c0837j)) {
                    int intValue = ((Number) M1.B.D(c0837j, hashMap)).intValue();
                    C0837j c0837j2 = AbstractC0830c.f7138a;
                    round = ((Number) c0837j.f7148a.g(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                }
                hashMap.put(c0837j, Integer.valueOf(round));
                return;
            }
            if (e3.b(a0Var).containsKey(c0837j)) {
                float c3 = e3.c(a0Var, c0837j);
                f4 = I2.l.f(c3, c3);
            }
        }
    }

    public final Map b(a0 a0Var) {
        switch (this.f7747j) {
            case 0:
                return a0Var.k0().i();
            default:
                P z02 = a0Var.z0();
                Z1.i.c(z02);
                return z02.k0().i();
        }
    }

    public final int c(a0 a0Var, C0837j c0837j) {
        switch (this.f7747j) {
            case 0:
                return a0Var.L(c0837j);
            default:
                P z02 = a0Var.z0();
                Z1.i.c(z02);
                return z02.L(c0837j);
        }
    }

    public final boolean d() {
        return this.f7740c || this.f7742e || this.f7743f || this.f7744g;
    }

    public final boolean e() {
        h();
        return this.f7745h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r0.H, t0.a] */
    public final void f() {
        this.f7739b = true;
        ?? r02 = this.f7738a;
        InterfaceC0893a d3 = r02.d();
        if (d3 == null) {
            return;
        }
        if (this.f7740c) {
            d3.E();
        } else if (this.f7742e || this.f7741d) {
            d3.requestLayout();
        }
        if (this.f7743f) {
            r02.E();
        }
        if (this.f7744g) {
            r02.requestLayout();
        }
        d3.i().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [r0.H, t0.a] */
    public final void g() {
        HashMap hashMap = this.f7746i;
        hashMap.clear();
        t.x xVar = new t.x(1, this);
        ?? r22 = this.f7738a;
        r22.K(xVar);
        hashMap.putAll(b(r22.A()));
        this.f7739b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [r0.H, t0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        E i3;
        E i4;
        boolean d3 = d();
        ?? r12 = this.f7738a;
        InterfaceC0893a interfaceC0893a = r12;
        if (!d3) {
            InterfaceC0893a d4 = r12.d();
            if (d4 == null) {
                return;
            }
            InterfaceC0893a interfaceC0893a2 = d4.i().f7745h;
            if (interfaceC0893a2 != null) {
                boolean d5 = interfaceC0893a2.i().d();
                interfaceC0893a = interfaceC0893a2;
            }
            InterfaceC0893a interfaceC0893a3 = this.f7745h;
            if (interfaceC0893a3 == null || interfaceC0893a3.i().d()) {
                return;
            }
            InterfaceC0893a d6 = interfaceC0893a3.d();
            if (d6 != null && (i4 = d6.i()) != null) {
                i4.h();
            }
            InterfaceC0893a d7 = interfaceC0893a3.d();
            interfaceC0893a = (d7 == null || (i3 = d7.i()) == null) ? null : i3.f7745h;
        }
        this.f7745h = interfaceC0893a;
    }
}
