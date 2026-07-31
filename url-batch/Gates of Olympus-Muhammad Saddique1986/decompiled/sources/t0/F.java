package t0;

import a0.C0238c;
import java.util.HashMap;
import java.util.Map;
import r0.AbstractC0893O;
import r0.AbstractC0906c;
import r0.C0915l;
import r0.C0929z;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0893O f8563a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8565c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8566d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8567e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8568f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8569g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0988a f8570h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8572j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8564b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f8571i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public F(InterfaceC0988a interfaceC0988a, int i3) {
        this.f8572j = i3;
        this.f8563a = (AbstractC0893O) interfaceC0988a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [e2.e, f2.h] */
    /* JADX WARN: Type inference failed for: r8v5, types: [r0.O, t0.a] */
    public static final void a(F f3, C0915l c0915l, int i3, b0 b0Var) {
        f3.getClass();
        float f4 = i3;
        long e3 = l0.c.e(f4, f4);
        while (true) {
            switch (f3.f8572j) {
                case 0:
                    b0.O o3 = b0.f8701H;
                    e3 = b0Var.c1(e3, true);
                    break;
                default:
                    Q I02 = b0Var.I0();
                    f2.j.c(I02);
                    long j3 = I02.f8659p;
                    e3 = C0238c.h(l0.c.e((int) (j3 >> 32), (int) (j3 & 4294967295L)), e3);
                    break;
            }
            b0Var = b0Var.f8713q;
            f2.j.c(b0Var);
            if (b0Var.equals(f3.f8563a.Q())) {
                int round = Math.round(c0915l instanceof C0915l ? C0238c.e(e3) : C0238c.d(e3));
                HashMap hashMap = f3.f8571i;
                if (hashMap.containsKey(c0915l)) {
                    int intValue = ((Number) S1.B.I(c0915l, hashMap)).intValue();
                    C0915l c0915l2 = AbstractC0906c.f8150a;
                    round = ((Number) c0915l.f8165a.h(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                }
                hashMap.put(c0915l, Integer.valueOf(round));
                return;
            }
            if (f3.b(b0Var).containsKey(c0915l)) {
                float c2 = f3.c(b0Var, c0915l);
                e3 = l0.c.e(c2, c2);
            }
        }
    }

    public final Map b(b0 b0Var) {
        switch (this.f8572j) {
            case 0:
                return b0Var.t0().i();
            default:
                Q I02 = b0Var.I0();
                f2.j.c(I02);
                return I02.t0().i();
        }
    }

    public final int c(b0 b0Var, C0915l c0915l) {
        switch (this.f8572j) {
            case 0:
                return b0Var.W(c0915l);
            default:
                Q I02 = b0Var.I0();
                f2.j.c(I02);
                return I02.W(c0915l);
        }
    }

    public final boolean d() {
        return this.f8565c || this.f8567e || this.f8568f || this.f8569g;
    }

    public final boolean e() {
        h();
        return this.f8570h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r0.O, t0.a] */
    public final void f() {
        this.f8564b = true;
        ?? r02 = this.f8563a;
        InterfaceC0988a g3 = r02.g();
        if (g3 == null) {
            return;
        }
        if (this.f8565c) {
            g3.R();
        } else if (this.f8567e || this.f8566d) {
            g3.requestLayout();
        }
        if (this.f8568f) {
            r02.R();
        }
        if (this.f8569g) {
            r02.requestLayout();
        }
        g3.i().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [r0.O, t0.a] */
    public final void g() {
        HashMap hashMap = this.f8571i;
        hashMap.clear();
        C0929z c0929z = new C0929z(4, this);
        ?? r22 = this.f8563a;
        r22.e(c0929z);
        hashMap.putAll(b(r22.Q()));
        this.f8564b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [r0.O, t0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        F i3;
        F i4;
        boolean d3 = d();
        ?? r12 = this.f8563a;
        InterfaceC0988a interfaceC0988a = r12;
        if (!d3) {
            InterfaceC0988a g3 = r12.g();
            if (g3 == null) {
                return;
            }
            InterfaceC0988a interfaceC0988a2 = g3.i().f8570h;
            if (interfaceC0988a2 != null) {
                boolean d4 = interfaceC0988a2.i().d();
                interfaceC0988a = interfaceC0988a2;
            }
            InterfaceC0988a interfaceC0988a3 = this.f8570h;
            if (interfaceC0988a3 == null || interfaceC0988a3.i().d()) {
                return;
            }
            InterfaceC0988a g4 = interfaceC0988a3.g();
            if (g4 != null && (i4 = g4.i()) != null) {
                i4.h();
            }
            InterfaceC0988a g5 = interfaceC0988a3.g();
            interfaceC0988a = (g5 == null || (i3 = g5.i()) == null) ? null : i3.f8570h;
        }
        this.f8570h = interfaceC0988a;
    }
}
