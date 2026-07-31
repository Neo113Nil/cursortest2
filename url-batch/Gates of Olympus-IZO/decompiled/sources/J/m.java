package J;

import D1.C0014b;
import I.C0;
import I.C0087c;
import I.C0119s0;
import I.C0120t;
import I.I0;
import a.AbstractC0157a;
import h1.C0438i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends C {

    /* renamed from: e, reason: collision with root package name */
    public static final m f2562e;

    /* renamed from: g, reason: collision with root package name */
    public static final m f2564g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2565c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f2561d = new m(1, 2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final m f2563f = new m(1, 2, 2);

    static {
        int i3 = 1;
        f2562e = new m(i3, i3, 1);
        int i4 = 1;
        f2564g = new m(i4, i4, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i3, int i4, int i5) {
        super(i3, i4);
        this.f2565c = i5;
    }

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        int i3;
        int i4;
        switch (this.f2565c) {
            case 0:
                Object b2 = ((Y1.a) d3.c(0)).b();
                C0087c c0087c = (C0087c) d3.c(1);
                d3.b(0);
                Z1.i.d(c0014b, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                c0087c.getClass();
                i02.M(i02.c(c0087c), b2);
                c0014b.getClass();
                c0014b.f(b2);
                break;
            case 1:
                C0087c c0087c2 = (C0087c) d3.c(0);
                int b3 = d3.b(0);
                c0014b.A();
                c0087c2.getClass();
                Object w3 = i02.w(i02.c(c0087c2));
                c0014b.getClass();
                ((t0.D) c0014b.f538d).v(b3, (t0.D) w3);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                Object c3 = d3.c(0);
                C0087c c0087c3 = (C0087c) d3.c(1);
                int b4 = d3.b(0);
                if (c3 instanceof C0) {
                    ((ArrayList) c0120t.f2353c).add(((C0) c3).f2083a);
                }
                int c4 = i02.c(c0087c3);
                int g3 = i02.g(i02.F(c4, b4));
                Object[] objArr = i02.f2135c;
                Object obj = objArr[g3];
                objArr[g3] = c3;
                if (!(obj instanceof C0)) {
                    if (obj instanceof C0119s0) {
                        ((C0119s0) obj).d();
                        break;
                    }
                } else {
                    int o3 = i02.o() - i02.F(c4, b4);
                    C0 c02 = (C0) obj;
                    C0087c c0087c4 = c02.f2084b;
                    if (c0087c4 == null || !c0087c4.a()) {
                        i3 = -1;
                        i4 = -1;
                    } else {
                        i3 = i02.c(c0087c4);
                        i4 = i02.o() - i02.f(i02.f2134b, i02.p(i02.q(i3) + i3));
                    }
                    c0120t.h(c02.f2083a, o3, i3, i4);
                    break;
                }
                break;
            default:
                Object c5 = d3.c(0);
                int b5 = d3.b(0);
                if (c5 instanceof C0) {
                    ((ArrayList) c0120t.f2353c).add(((C0) c5).f2083a);
                }
                int g4 = i02.g(i02.F(i02.f2151t, b5));
                Object[] objArr2 = i02.f2135c;
                Object obj2 = objArr2[g4];
                objArr2[g4] = c5;
                if (!(obj2 instanceof C0)) {
                    if (obj2 instanceof C0119s0) {
                        ((C0119s0) obj2).d();
                        break;
                    }
                } else {
                    c0120t.h(((C0) obj2).f2083a, i02.o() - i02.F(i02.f2151t, b5), -1, -1);
                    break;
                }
                break;
        }
    }

    @Override // J.C
    public final String b(int i3) {
        switch (this.f2565c) {
            case 0:
                if (!I2.l.v(i3, 0)) {
                    break;
                }
                break;
            case 1:
                if (!I2.l.v(i3, 0)) {
                    break;
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                if (!I2.l.v(i3, 0)) {
                    break;
                }
                break;
            default:
                if (!I2.l.v(i3, 0)) {
                    break;
                }
                break;
        }
        return super.b(i3);
    }

    @Override // J.C
    public final String c(int i3) {
        switch (this.f2565c) {
            case 0:
                if (!AbstractC0157a.w(i3, 0)) {
                    if (!AbstractC0157a.w(i3, 1)) {
                        break;
                    }
                }
                break;
            case 1:
                if (!AbstractC0157a.w(i3, 0)) {
                    break;
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                if (!AbstractC0157a.w(i3, 0)) {
                    if (!AbstractC0157a.w(i3, 1)) {
                        break;
                    }
                }
                break;
            default:
                if (!AbstractC0157a.w(i3, 0)) {
                    break;
                }
                break;
        }
        return super.c(i3);
    }
}
