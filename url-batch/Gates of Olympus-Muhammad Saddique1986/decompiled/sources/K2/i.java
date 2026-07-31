package K2;

import B.C0011l;
import I.F;
import R1.y;
import a.AbstractC0235a;
import a0.C0239d;
import b0.O;
import b0.r;
import e0.C0416b;
import e2.InterfaceC0422a;
import f2.u;
import java.util.NoSuchElementException;
import k2.C0572d;
import n.C0689o;
import n0.C0710h;
import p.C0765h;
import p.C0771k;
import p.InterfaceC0757d;
import p.X0;
import s.C0934c;
import s.C0937f;
import s.C0939h;
import s.C0951t;
import t.v;
import t0.C1005s;
import t0.E;
import t0.G;
import t0.J;
import t0.M;
import t0.Q;
import t0.b0;
import u.C1082i;
import u0.AbstractC1088a;
import u0.ViewOnAttachStateChangeListenerC1129v;

/* loaded from: classes.dex */
public final class i extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3305g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3306h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i3) {
        super(0);
        this.f3303e = i3;
        this.f3304f = obj;
        this.f3305g = obj2;
        this.f3306h = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01d6  */
    /* JADX WARN: Type inference failed for: r3v13, types: [e2.a, f2.k] */
    @Override // e2.InterfaceC0422a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        int i3 = 0;
        y yVar = y.f4171a;
        Object obj = this.f3306h;
        Object obj2 = this.f3305g;
        Object obj3 = this.f3304f;
        switch (this.f3303e) {
            case 0:
                l0.c cVar = ((G2.d) obj3).f2155b;
                f2.j.c(cVar);
                return cVar.p(((G2.j) obj2).a(), ((G2.a) obj).f2133h.f2218d);
            case 1:
                G g3 = (G) obj;
                ((u) obj3).f5832d = ((C0689o) obj2).f7176t.d(g3.f8573d.d(), g3.getLayoutDirection(), g3);
                return yVar;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0771k c0771k = (C0771k) obj3;
                C0710h c0710h = c0771k.f7696u;
                while (c0710h.f7291a.m()) {
                    K.d dVar = c0710h.f7291a;
                    if (dVar.l()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    C0239d c0239d = (C0239d) ((C0765h) dVar.f3214d[dVar.f3216f - 1]).f7671a.b();
                    if (!(c0239d == null ? true : c0771k.A0(c0239d, c0771k.f7700y))) {
                        if (c0771k.f7699x) {
                            C0239d z02 = c0771k.z0();
                            if (z02 != null && c0771k.A0(z02, c0771k.f7700y)) {
                                c0771k.f7699x = false;
                            }
                        }
                        ((X0) obj2).f7632e = C0771k.y0(c0771k, (InterfaceC0757d) obj);
                        return yVar;
                    }
                    ((C0765h) dVar.o(dVar.f3216f - 1)).f7672b.u(yVar);
                }
                if (c0771k.f7699x) {
                }
                ((X0) obj2).f7632e = C0771k.y0(c0771k, (InterfaceC0757d) obj);
                return yVar;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0937f c0937f = (C0937f) ((F) obj3).getValue();
                C0951t c0951t = (C0951t) obj2;
                return new C0939h(c0951t, c0937f, (C0934c) obj, new C0011l((C0572d) ((v) c0951t.f8320d.f926e).getValue(), c0937f));
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                J j3 = (J) obj3;
                M m3 = j3.f8579A;
                m3.f8634j = 0;
                K.d v3 = m3.f8625a.v();
                int i4 = v3.f3216f;
                if (i4 > 0) {
                    Object[] objArr = v3.f3214d;
                    int i5 = 0;
                    do {
                        J j4 = ((E) objArr[i5]).f8562z.f8643s;
                        f2.j.c(j4);
                        j4.f8581j = j4.f8582k;
                        j4.f8582k = Integer.MAX_VALUE;
                        if (j4.f8583l == 2) {
                            j4.f8583l = 3;
                        }
                        i5++;
                    } while (i5 < i4);
                }
                M m4 = j3.f8579A;
                K.d v4 = m4.f8625a.v();
                int i6 = v4.f3216f;
                if (i6 > 0) {
                    Object[] objArr2 = v4.f3214d;
                    int i7 = 0;
                    do {
                        J j5 = ((E) objArr2[i7]).f8562z.f8643s;
                        f2.j.c(j5);
                        j5.f8591t.f8566d = false;
                        i7++;
                    } while (i7 < i6);
                }
                C1005s c1005s = j3.Q().f8790N;
                M m5 = (M) obj;
                if (c1005s != null) {
                    boolean z3 = c1005s.f8654k;
                    K.a aVar = (K.a) m5.f8625a.n();
                    int i8 = aVar.f3208d.f3216f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        Q I02 = ((b0) ((E) aVar.get(i9)).f8561y.f2913d).I0();
                        if (I02 != null) {
                            I02.f8654k = z3;
                        }
                    }
                }
                ((C1005s) obj2).t0().j();
                if (j3.Q().f8790N != null) {
                    K.a aVar2 = (K.a) m5.f8625a.n();
                    int i10 = aVar2.f3208d.f3216f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        Q I03 = ((b0) ((E) aVar2.get(i11)).f8561y.f2913d).I0();
                        if (I03 != null) {
                            I03.f8654k = false;
                        }
                    }
                }
                E e3 = m4.f8625a;
                K.d v5 = e3.v();
                int i12 = v5.f3216f;
                if (i12 > 0) {
                    Object[] objArr3 = v5.f3214d;
                    int i13 = 0;
                    do {
                        J j6 = ((E) objArr3[i13]).f8562z.f8643s;
                        f2.j.c(j6);
                        int i14 = j6.f8581j;
                        int i15 = j6.f8582k;
                        if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                            j6.o0();
                        }
                        i13++;
                    } while (i13 < i12);
                }
                K.d v6 = e3.v();
                int i16 = v6.f3216f;
                if (i16 > 0) {
                    Object[] objArr4 = v6.f3214d;
                    do {
                        J j7 = ((E) objArr4[i3]).f8562z.f8643s;
                        f2.j.c(j7);
                        t0.F f3 = j7.f8591t;
                        f3.f8567e = f3.f8566d;
                        i3++;
                    } while (i3 < i16);
                }
                return yVar;
            case 5:
                O o3 = b0.f8701H;
                ((b0) obj3).E0((r) obj2, (C0416b) obj);
                return yVar;
            case 6:
                C1082i c1082i = (C1082i) obj3;
                C0239d y02 = C1082i.y0(c1082i, (b0) obj2, (f2.k) obj);
                if (y02 == null) {
                    return null;
                }
                C0771k c0771k2 = c1082i.f9112q;
                if (O0.j.a(c0771k2.f7700y, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return y02.h(c0771k2.C0(y02, c0771k2.f7700y) ^ (-9223372034707292160L));
            default:
                AbstractC1088a abstractC1088a = (AbstractC1088a) obj3;
                abstractC1088a.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC1129v) obj2);
                B.r rVar = (B.r) obj;
                f2.j.f(rVar, "listener");
                AbstractC0235a.B(abstractC1088a).f5845a.remove(rVar);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(C1082i c1082i, b0 b0Var, InterfaceC0422a interfaceC0422a) {
        super(0);
        this.f3303e = 6;
        this.f3304f = c1082i;
        this.f3305g = b0Var;
        this.f3306h = (f2.k) interfaceC0422a;
    }
}
