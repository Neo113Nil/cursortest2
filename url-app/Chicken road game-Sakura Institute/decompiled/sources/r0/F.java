package r0;

import a.AbstractC0345a;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.AbstractC0967c;
import p0.C0976l;
import z2.C1412P;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0954O f9614a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9616c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9617d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9618e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9619f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9620g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1060a f9621h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9623j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9615b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f9622i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public F(InterfaceC1060a interfaceC1060a, int i2) {
        this.f9623j = i2;
        this.f9614a = (AbstractC0954O) interfaceC1060a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [M2.m, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [p0.O, r0.a] */
    public static final void a(F f4, C0976l c0976l, int i2, a0 a0Var) {
        f4.getClass();
        float f5 = i2;
        long c4 = AbstractC0345a.c(f5, f5);
        while (true) {
            switch (f4.f9623j) {
                case 0:
                    Z.M m4 = a0.f9748K;
                    c4 = a0Var.g1(c4, true);
                    break;
                default:
                    P M02 = a0Var.M0();
                    Intrinsics.c(M02);
                    long j4 = M02.f9708s;
                    c4 = Y.c.h(AbstractC0345a.c((int) (j4 >> 32), (int) (j4 & 4294967295L)), c4);
                    break;
            }
            a0Var = a0Var.f9764t;
            Intrinsics.c(a0Var);
            if (a0Var.equals(f4.f9614a.T())) {
                int round = Math.round(c0976l instanceof C0976l ? Y.c.e(c4) : Y.c.d(c4));
                HashMap hashMap = f4.f9622i;
                if (hashMap.containsKey(c0976l)) {
                    int intValue = ((Number) C1412P.d(c0976l, hashMap)).intValue();
                    C0976l c0976l2 = AbstractC0967c.f9034a;
                    round = ((Number) c0976l.f9049a.h(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                }
                hashMap.put(c0976l, Integer.valueOf(round));
                return;
            }
            if (f4.b(a0Var).containsKey(c0976l)) {
                float c5 = f4.c(a0Var, c0976l);
                c4 = AbstractC0345a.c(c5, c5);
            }
        }
    }

    public final Map b(a0 a0Var) {
        switch (this.f9623j) {
            case 0:
                return a0Var.x0().k();
            default:
                P M02 = a0Var.M0();
                Intrinsics.c(M02);
                return M02.x0().k();
        }
    }

    public final int c(a0 a0Var, C0976l c0976l) {
        switch (this.f9623j) {
            case 0:
                return a0Var.e0(c0976l);
            default:
                P M02 = a0Var.M0();
                Intrinsics.c(M02);
                return M02.e0(c0976l);
        }
    }

    public final boolean d() {
        return this.f9616c || this.f9618e || this.f9619f || this.f9620g;
    }

    public final boolean e() {
        h();
        return this.f9621h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p0.O, r0.a] */
    public final void f() {
        this.f9615b = true;
        ?? r02 = this.f9614a;
        InterfaceC1060a d4 = r02.d();
        if (d4 == null) {
            return;
        }
        if (this.f9616c) {
            d4.W();
        } else if (this.f9618e || this.f9617d) {
            d4.requestLayout();
        }
        if (this.f9619f) {
            r02.W();
        }
        if (this.f9620g) {
            r02.requestLayout();
        }
        d4.k().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p0.O, r0.a] */
    public final void g() {
        HashMap hashMap = this.f9622i;
        hashMap.clear();
        A.g0 g0Var = new A.g0(26, this);
        ?? r2 = this.f9614a;
        r2.H(g0Var);
        hashMap.putAll(b(r2.T()));
        this.f9615b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [p0.O, r0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        F k4;
        F k5;
        boolean d4 = d();
        ?? r12 = this.f9614a;
        InterfaceC1060a interfaceC1060a = r12;
        if (!d4) {
            InterfaceC1060a d5 = r12.d();
            if (d5 == null) {
                return;
            }
            InterfaceC1060a interfaceC1060a2 = d5.k().f9621h;
            if (interfaceC1060a2 != null) {
                boolean d6 = interfaceC1060a2.k().d();
                interfaceC1060a = interfaceC1060a2;
            }
            InterfaceC1060a interfaceC1060a3 = this.f9621h;
            if (interfaceC1060a3 == null || interfaceC1060a3.k().d()) {
                return;
            }
            InterfaceC1060a d7 = interfaceC1060a3.d();
            if (d7 != null && (k5 = d7.k()) != null) {
                k5.h();
            }
            InterfaceC1060a d8 = interfaceC1060a3.d();
            interfaceC1060a = (d8 == null || (k4 = d8.k()) == null) ? null : k4.f9621h;
        }
        this.f9621h = interfaceC1060a;
    }
}
