package H;

import A.C0020p;
import B1.C0097d;
import G.B0;
import G.C0190c;
import G.C0222s0;
import G.C0223t;
import G.H0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.E;

/* loaded from: classes.dex */
public final class m extends C {

    /* renamed from: e, reason: collision with root package name */
    public static final m f3207e;

    /* renamed from: g, reason: collision with root package name */
    public static final m f3209g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3210c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f3206d = new m(1, 2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final m f3208f = new m(1, 2, 2);

    static {
        int i2 = 1;
        f3207e = new m(i2, i2, 1);
        int i4 = 1;
        f3209g = new m(i4, i4, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i2, int i4, int i5) {
        super(i2, i4);
        this.f3210c = i5;
    }

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        int i2;
        int i4;
        switch (this.f3210c) {
            case 0:
                Object invoke = ((Function0) c0020p.e(0)).invoke();
                C0190c c0190c = (C0190c) c0020p.e(1);
                c0020p.d(0);
                Intrinsics.d(c0097d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                c0190c.getClass();
                h02.M(h02.c(c0190c), invoke);
                c0097d.getClass();
                c0097d.h(invoke);
                break;
            case 1:
                C0190c c0190c2 = (C0190c) c0020p.e(0);
                int d4 = c0020p.d(0);
                c0097d.J();
                c0190c2.getClass();
                Object w4 = h02.w(h02.c(c0190c2));
                c0097d.getClass();
                ((E) c0097d.f989j).x(d4, (E) w4);
                break;
            case 2:
                Object e4 = c0020p.e(0);
                C0190c c0190c3 = (C0190c) c0020p.e(1);
                int d5 = c0020p.d(0);
                if (e4 instanceof B0) {
                    ((ArrayList) c0223t.f2909c).add(((B0) e4).f2637a);
                }
                int c4 = h02.c(c0190c3);
                int g4 = h02.g(h02.F(c4, d5));
                Object[] objArr = h02.f2687c;
                Object obj = objArr[g4];
                objArr[g4] = e4;
                if (!(obj instanceof B0)) {
                    if (obj instanceof C0222s0) {
                        ((C0222s0) obj).d();
                        break;
                    }
                } else {
                    int o4 = h02.o() - h02.F(c4, d5);
                    B0 b02 = (B0) obj;
                    C0190c c0190c4 = b02.f2638b;
                    if (c0190c4 == null || !c0190c4.a()) {
                        i2 = -1;
                        i4 = -1;
                    } else {
                        i2 = h02.c(c0190c4);
                        i4 = h02.o() - h02.f(h02.f2686b, h02.p(h02.q(i2) + i2));
                    }
                    c0223t.h(b02.f2637a, o4, i2, i4);
                    break;
                }
                break;
            default:
                Object e5 = c0020p.e(0);
                int d6 = c0020p.d(0);
                if (e5 instanceof B0) {
                    ((ArrayList) c0223t.f2909c).add(((B0) e5).f2637a);
                }
                int g5 = h02.g(h02.F(h02.f2704t, d6));
                Object[] objArr2 = h02.f2687c;
                Object obj2 = objArr2[g5];
                objArr2[g5] = e5;
                if (!(obj2 instanceof B0)) {
                    if (obj2 instanceof C0222s0) {
                        ((C0222s0) obj2).d();
                        break;
                    }
                } else {
                    c0223t.h(((B0) obj2).f2637a, h02.o() - h02.F(h02.f2704t, d6), -1, -1);
                    break;
                }
                break;
        }
    }

    @Override // H.C
    public final String b(int i2) {
        switch (this.f3210c) {
            case 0:
                if (!u3.l.a0(i2, 0)) {
                    break;
                }
                break;
            case 1:
                if (!u3.l.a0(i2, 0)) {
                    break;
                }
                break;
            case 2:
                if (!u3.l.a0(i2, 0)) {
                    break;
                }
                break;
            default:
                if (!u3.l.a0(i2, 0)) {
                    break;
                }
                break;
        }
        return super.b(i2);
    }

    @Override // H.C
    public final String c(int i2) {
        switch (this.f3210c) {
            case 0:
                if (!M1.a.z(i2, 0)) {
                    if (!M1.a.z(i2, 1)) {
                        break;
                    }
                }
                break;
            case 1:
                if (!M1.a.z(i2, 0)) {
                    break;
                }
                break;
            case 2:
                if (!M1.a.z(i2, 0)) {
                    if (!M1.a.z(i2, 1)) {
                        break;
                    }
                }
                break;
            default:
                if (!M1.a.z(i2, 0)) {
                    break;
                }
                break;
        }
        return super.c(i2);
    }
}
