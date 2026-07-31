package J;

import B.C0014o;
import I.B0;
import I.C0141c;
import I.C0173s0;
import I.C0174t;
import I.H0;
import a.AbstractC0235a;
import e2.InterfaceC0422a;
import java.util.ArrayList;
import t0.E;

/* loaded from: classes.dex */
public final class m extends C {

    /* renamed from: e, reason: collision with root package name */
    public static final m f3137e;

    /* renamed from: g, reason: collision with root package name */
    public static final m f3139g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3140c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f3136d = new m(1, 2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final m f3138f = new m(1, 2, 2);

    static {
        int i3 = 1;
        f3137e = new m(i3, i3, 1);
        int i4 = 1;
        f3139g = new m(i4, i4, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i3, int i4, int i5) {
        super(i3, i4);
        this.f3140c = i5;
    }

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        int i3;
        int i4;
        switch (this.f3140c) {
            case 0:
                Object b3 = ((InterfaceC0422a) c0014o.e(0)).b();
                C0141c c0141c = (C0141c) c0014o.e(1);
                c0014o.d(0);
                f2.j.d(mVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                c0141c.getClass();
                h02.M(h02.c(c0141c), b3);
                mVar.getClass();
                mVar.f(b3);
                break;
            case 1:
                C0141c c0141c2 = (C0141c) c0014o.e(0);
                int d3 = c0014o.d(0);
                mVar.B();
                c0141c2.getClass();
                Object w2 = h02.w(h02.c(c0141c2));
                mVar.getClass();
                ((E) mVar.f2118d).x(d3, (E) w2);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                Object e3 = c0014o.e(0);
                C0141c c0141c3 = (C0141c) c0014o.e(1);
                int d4 = c0014o.d(0);
                if (e3 instanceof B0) {
                    ((ArrayList) c0174t.f2912c).add(((B0) e3).f2639a);
                }
                int c2 = h02.c(c0141c3);
                int g3 = h02.g(h02.F(c2, d4));
                Object[] objArr = h02.f2689c;
                Object obj = objArr[g3];
                objArr[g3] = e3;
                if (!(obj instanceof B0)) {
                    if (obj instanceof C0173s0) {
                        ((C0173s0) obj).d();
                        break;
                    }
                } else {
                    int o3 = h02.o() - h02.F(c2, d4);
                    B0 b02 = (B0) obj;
                    C0141c c0141c4 = b02.f2640b;
                    if (c0141c4 == null || !c0141c4.a()) {
                        i3 = -1;
                        i4 = -1;
                    } else {
                        i3 = h02.c(c0141c4);
                        i4 = h02.o() - h02.f(h02.f2688b, h02.p(h02.q(i3) + i3));
                    }
                    c0174t.h(b02.f2639a, o3, i3, i4);
                    break;
                }
                break;
            default:
                Object e4 = c0014o.e(0);
                int d5 = c0014o.d(0);
                if (e4 instanceof B0) {
                    ((ArrayList) c0174t.f2912c).add(((B0) e4).f2639a);
                }
                int g4 = h02.g(h02.F(h02.f2706t, d5));
                Object[] objArr2 = h02.f2689c;
                Object obj2 = objArr2[g4];
                objArr2[g4] = e4;
                if (!(obj2 instanceof B0)) {
                    if (obj2 instanceof C0173s0) {
                        ((C0173s0) obj2).d();
                        break;
                    }
                } else {
                    c0174t.h(((B0) obj2).f2639a, h02.o() - h02.F(h02.f2706t, d5), -1, -1);
                    break;
                }
                break;
        }
    }

    @Override // J.C
    public final String b(int i3) {
        switch (this.f3140c) {
            case 0:
                if (!O2.l.Z(i3, 0)) {
                    break;
                }
                break;
            case 1:
                if (!O2.l.Z(i3, 0)) {
                    break;
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (!O2.l.Z(i3, 0)) {
                    break;
                }
                break;
            default:
                if (!O2.l.Z(i3, 0)) {
                    break;
                }
                break;
        }
        return super.b(i3);
    }

    @Override // J.C
    public final String c(int i3) {
        switch (this.f3140c) {
            case 0:
                if (!AbstractC0235a.u(i3, 0)) {
                    if (!AbstractC0235a.u(i3, 1)) {
                        break;
                    }
                }
                break;
            case 1:
                if (!AbstractC0235a.u(i3, 0)) {
                    break;
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (!AbstractC0235a.u(i3, 0)) {
                    if (!AbstractC0235a.u(i3, 1)) {
                        break;
                    }
                }
                break;
            default:
                if (!AbstractC0235a.u(i3, 0)) {
                    break;
                }
                break;
        }
        return super.c(i3);
    }
}
