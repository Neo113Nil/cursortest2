package o;

import B1.C0097d;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r0.AbstractC1065f;
import y2.AbstractC1343r;

/* renamed from: o.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908r0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0893j0 f8865a;

    /* renamed from: b, reason: collision with root package name */
    public m.i0 f8866b;

    /* renamed from: c, reason: collision with root package name */
    public C0898m f8867c;

    /* renamed from: d, reason: collision with root package name */
    public N f8868d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8869e;

    /* renamed from: f, reason: collision with root package name */
    public C0097d f8870f;

    /* renamed from: g, reason: collision with root package name */
    public int f8871g = 1;

    /* renamed from: h, reason: collision with root package name */
    public S f8872h = androidx.compose.foundation.gestures.a.f5054a;

    /* renamed from: i, reason: collision with root package name */
    public final C0903o0 f8873i = new C0903o0(this);

    /* renamed from: j, reason: collision with root package name */
    public final A.g0 f8874j = new A.g0(23, this);

    public C0908r0(InterfaceC0893j0 interfaceC0893j0, m.i0 i0Var, C0898m c0898m, N n2, boolean z4, C0097d c0097d) {
        this.f8865a = interfaceC0893j0;
        this.f8866b = i0Var;
        this.f8867c = c0898m;
        this.f8868d = n2;
        this.f8869e = z4;
        this.f8870f = c0097d;
    }

    public static final long a(C0908r0 c0908r0, S s4, long j4, int i2) {
        long j5;
        k0.e eVar = (k0.e) c0908r0.f8870f.f987e;
        k0.e eVar2 = null;
        k0.e eVar3 = (eVar == null || !eVar.f3990s) ? null : (k0.e) AbstractC1065f.k(eVar);
        long j6 = 0;
        long F02 = eVar3 != null ? eVar3.F0(j4, i2) : 0L;
        long g4 = Y.c.g(j4, F02);
        long d4 = c0908r0.d(c0908r0.g(s4.a(c0908r0.f(c0908r0.d(Y.c.a(g4, 0.0f, c0908r0.f8868d == N.f8666e ? 1 : 2))))));
        long g5 = Y.c.g(g4, d4);
        k0.e eVar4 = (k0.e) c0908r0.f8870f.f987e;
        if (eVar4 != null && eVar4.f3990s) {
            eVar2 = (k0.e) AbstractC1065f.k(eVar4);
        }
        k0.e eVar5 = eVar2;
        if (eVar5 != null) {
            j5 = d4;
            j6 = eVar5.D0(d4, g5, i2);
        } else {
            j5 = d4;
        }
        return Y.c.h(Y.c.h(F02, j5), j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j4, E2.c cVar) {
        C0897l0 c0897l0;
        int i2;
        M2.D d4;
        if (cVar instanceof C0897l0) {
            c0897l0 = (C0897l0) cVar;
            int i4 = c0897l0.f8827m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0897l0.f8827m = i4 - Integer.MIN_VALUE;
                Object obj = c0897l0.f8825k;
                Object obj2 = D2.a.f2163d;
                i2 = c0897l0.f8827m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    M2.D d5 = new M2.D();
                    d5.f3579d = j4;
                    m.b0 b0Var = m.b0.f8079d;
                    Function2 c0901n0 = new C0901n0(this, d5, j4, null);
                    c0897l0.f8824j = d5;
                    c0897l0.f8827m = 1;
                    if (e(b0Var, c0901n0, c0897l0) == obj2) {
                        return obj2;
                    }
                    d4 = d5;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d4 = c0897l0.f8824j;
                    AbstractC1343r.b(obj);
                }
                return new M0.o(d4.f3579d);
            }
        }
        c0897l0 = new C0897l0(this, cVar);
        Object obj3 = c0897l0.f8825k;
        Object obj22 = D2.a.f2163d;
        i2 = c0897l0.f8827m;
        if (i2 != 0) {
        }
        return new M0.o(d4.f3579d);
    }

    public final float c(float f4) {
        return this.f8869e ? f4 * (-1) : f4;
    }

    public final long d(long j4) {
        return this.f8869e ? Y.c.i(-1.0f, j4) : j4;
    }

    public final Object e(m.b0 b0Var, Function2 function2, E2.c cVar) {
        Object e4 = this.f8865a.e(b0Var, new C0907q0(this, function2, null), cVar);
        return e4 == D2.a.f2163d ? e4 : Unit.f7487a;
    }

    public final float f(long j4) {
        return this.f8868d == N.f8666e ? Y.c.d(j4) : Y.c.e(j4);
    }

    public final long g(float f4) {
        if (f4 == 0.0f) {
            return 0L;
        }
        return this.f8868d == N.f8666e ? AbstractC0345a.c(f4, 0.0f) : AbstractC0345a.c(0.0f, f4);
    }
}
