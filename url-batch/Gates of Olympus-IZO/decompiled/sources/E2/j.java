package E2;

import A2.C0002a;
import I.G;
import L1.z;
import Z1.t;
import b0.C0261L;
import b0.InterfaceC0285r;
import e0.C0336b;
import e2.C0380d;
import h1.C0438i;
import java.util.NoSuchElementException;
import n.C0660o;
import o.A0;
import o.C0732h;
import o.C0735k;
import o.InterfaceC0728d;
import s.C0860c;
import s.C0864g;
import s.C0866i;
import s.C0880w;
import t0.C0910s;
import t0.D;
import t0.E;
import t0.F;
import t0.I;
import t0.L;
import t0.P;
import t0.a0;
import u0.AbstractC0960a;
import u0.ViewOnAttachStateChangeListenerC1003w;
import v.C1017f;

/* loaded from: classes.dex */
public final class j extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f819g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f820h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i3) {
        super(0);
        this.f817e = i3;
        this.f818f = obj;
        this.f819g = obj2;
        this.f820h = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
    /* JADX WARN: Type inference failed for: r4v13, types: [Y1.a, Z1.j] */
    @Override // Y1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        int i3 = 0;
        z zVar = z.f2729a;
        Object obj = this.f818f;
        Object obj2 = this.f820h;
        Object obj3 = this.f819g;
        switch (this.f817e) {
            case 0:
                I2.l lVar = ((A2.d) obj).f62b;
                Z1.i.c(lVar);
                return lVar.l(((A2.m) obj3).a(), ((C0002a) obj2).f40h.f132d);
            case 1:
                F f3 = (F) obj2;
                ((t) obj).f3480d = ((C0660o) obj3).f6132t.a(f3.f7748d.c(), f3.getLayoutDirection(), f3);
                return zVar;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0735k c0735k = (C0735k) obj;
                n0.f fVar = c0735k.f6553u;
                while (fVar.f6213a.m()) {
                    K.d dVar = fVar.f6213a;
                    if (dVar.l()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    a0.d dVar2 = (a0.d) ((C0732h) dVar.f2640d[dVar.f2642f - 1]).f6530a.b();
                    if (!(dVar2 == null ? true : c0735k.x0(dVar2, c0735k.f6557y))) {
                        if (c0735k.f6556x) {
                            a0.d w02 = c0735k.w0();
                            if (w02 != null && c0735k.x0(w02, c0735k.f6557y)) {
                                c0735k.f6556x = false;
                            }
                        }
                        ((A0) obj3).f6412e = C0735k.v0(c0735k, (InterfaceC0728d) obj2);
                        return zVar;
                    }
                    ((C0732h) dVar.o(dVar.f2642f - 1)).f6531b.resumeWith(zVar);
                }
                if (c0735k.f6556x) {
                }
                ((A0) obj3).f6412e = C0735k.v0(c0735k, (InterfaceC0728d) obj2);
                return zVar;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                C0864g c0864g = (C0864g) ((G) obj).getValue();
                C0880w c0880w = (C0880w) obj3;
                return new C0866i(c0880w, c0864g, (C0860c) obj2, new F2.h((C0380d) c0880w.f7477d.f7456f.getValue(), c0864g));
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                I i4 = (I) obj;
                L l3 = i4.f7754A;
                l3.f7806j = 0;
                K.d t3 = l3.f7797a.t();
                int i5 = t3.f2642f;
                if (i5 > 0) {
                    Object[] objArr = t3.f2640d;
                    int i6 = 0;
                    do {
                        I i7 = ((D) objArr[i6]).f7736y.f7814s;
                        Z1.i.c(i7);
                        i7.f7756j = i7.f7757k;
                        i7.f7757k = Integer.MAX_VALUE;
                        if (i7.f7758l == 2) {
                            i7.f7758l = 3;
                        }
                        i6++;
                    } while (i6 < i5);
                }
                L l4 = i4.f7754A;
                K.d t4 = l4.f7797a.t();
                int i8 = t4.f2642f;
                if (i8 > 0) {
                    Object[] objArr2 = t4.f2640d;
                    int i9 = 0;
                    do {
                        I i10 = ((D) objArr2[i9]).f7736y.f7814s;
                        Z1.i.c(i10);
                        i10.f7765t.f7741d = false;
                        i9++;
                    } while (i9 < i8);
                }
                C0910s c0910s = i4.A().f7956M;
                L l5 = (L) obj2;
                if (c0910s != null) {
                    boolean z3 = c0910s.f7825k;
                    K.a aVar = (K.a) l5.f7797a.m();
                    int i11 = aVar.f2634d.f2642f;
                    for (int i12 = 0; i12 < i11; i12++) {
                        P z02 = ((a0) ((D) aVar.get(i12)).f7735x.f2354d).z0();
                        if (z02 != null) {
                            z02.f7825k = z3;
                        }
                    }
                }
                ((C0910s) obj3).k0().j();
                if (i4.A().f7956M != null) {
                    K.a aVar2 = (K.a) l5.f7797a.m();
                    int i13 = aVar2.f2634d.f2642f;
                    for (int i14 = 0; i14 < i13; i14++) {
                        P z03 = ((a0) ((D) aVar2.get(i14)).f7735x.f2354d).z0();
                        if (z03 != null) {
                            z03.f7825k = false;
                        }
                    }
                }
                D d3 = l4.f7797a;
                K.d t5 = d3.t();
                int i15 = t5.f2642f;
                if (i15 > 0) {
                    Object[] objArr3 = t5.f2640d;
                    int i16 = 0;
                    do {
                        I i17 = ((D) objArr3[i16]).f7736y.f7814s;
                        Z1.i.c(i17);
                        int i18 = i17.f7756j;
                        int i19 = i17.f7757k;
                        if (i18 != i19 && i19 == Integer.MAX_VALUE) {
                            i17.b0();
                        }
                        i16++;
                    } while (i16 < i15);
                }
                K.d t6 = d3.t();
                int i20 = t6.f2642f;
                if (i20 > 0) {
                    Object[] objArr4 = t6.f2640d;
                    do {
                        I i21 = ((D) objArr4[i3]).f7736y.f7814s;
                        Z1.i.c(i21);
                        E e3 = i21.f7765t;
                        e3.f7742e = e3.f7741d;
                        i3++;
                    } while (i3 < i20);
                }
                return zVar;
            case 5:
                C0261L c0261l = a0.f7869H;
                ((a0) obj).v0((InterfaceC0285r) obj3, (C0336b) obj2);
                return zVar;
            case 6:
                AbstractC0960a abstractC0960a = (AbstractC0960a) obj;
                abstractC0960a.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC1003w) obj3);
                B2.a aVar3 = (B2.a) obj2;
                Z1.i.f(aVar3, "listener");
                I2.d.C(abstractC0960a).f4453a.remove(aVar3);
                return zVar;
            default:
                C1017f c1017f = (C1017f) obj;
                a0.d v0 = C1017f.v0(c1017f, (a0) obj3, (Z1.j) obj2);
                if (v0 == null) {
                    return null;
                }
                C0735k c0735k2 = c1017f.f8570q;
                if (M0.i.a(c0735k2.f6557y, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return v0.e(c0735k2.z0(v0, c0735k2.f6557y) ^ (-9223372034707292160L));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(C1017f c1017f, a0 a0Var, Y1.a aVar) {
        super(0);
        this.f817e = 7;
        this.f818f = c1017f;
        this.f819g = a0Var;
        this.f820h = (Z1.j) aVar;
    }
}
