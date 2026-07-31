package F;

import a0.C0239d;
import e2.InterfaceC0424c;
import j.C0547u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import r.AbstractC0864k;
import r.C0853O;
import r.C0855b;
import r.C0876x;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0887I;
import r0.InterfaceC0907d;
import r0.InterfaceC0921r;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093f extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1529f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1530g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1531h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1532i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093f(I.F f3, Q.b bVar, C0547u c0547u, int i3) {
        super(1);
        this.f1528e = 1;
        this.f1530g = f3;
        this.f1531h = bVar;
        this.f1532i = c0547u;
        this.f1529f = i3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f1528e) {
            case 0:
                AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
                ArrayList arrayList = (ArrayList) this.f1530g;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    List list = (List) arrayList.get(i3);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i4 = 0;
                    while (true) {
                        InterfaceC0887I interfaceC0887I = (InterfaceC0887I) this.f1532i;
                        if (i4 < size2) {
                            iArr[i4] = ((AbstractC0893O) list.get(i4)).f8126d + (i4 < S1.m.z0(list) ? interfaceC0887I.l(AbstractC0107m.f1660c) : 0);
                            i4++;
                        } else {
                            C0855b c0855b = AbstractC0864k.f8052b;
                            int[] iArr2 = new int[size2];
                            for (int i5 = 0; i5 < size2; i5++) {
                                iArr2[i5] = 0;
                            }
                            c0855b.b(interfaceC0887I, this.f1529f, iArr, interfaceC0887I.getLayoutDirection(), iArr2);
                            int size3 = list.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                AbstractC0892N.d(abstractC0892N, (AbstractC0893O) list.get(i6), iArr2[i6], ((Number) ((ArrayList) this.f1531h).get(i3)).intValue());
                            }
                        }
                    }
                }
                return R1.y.f4171a;
            case 1:
                if (obj == ((I.F) this.f1530g)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof S.y) {
                    int i7 = ((Q.b) this.f1531h).f3947a - this.f1529f;
                    C0547u c0547u = (C0547u) this.f1532i;
                    int c2 = c0547u.c(obj);
                    c0547u.f(Math.min(i7, c2 >= 0 ? c0547u.f6332c[c2] : Integer.MAX_VALUE), obj);
                }
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC0907d interfaceC0907d = (InterfaceC0907d) obj;
                boolean I3 = Z.d.I((Z.t) this.f1530g, (Z.t) this.f1531h, this.f1529f, (R.h) this.f1532i);
                Boolean valueOf = Boolean.valueOf(I3);
                if (I3 || !interfaceC0907d.a()) {
                    return valueOf;
                }
                return null;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0907d interfaceC0907d2 = (InterfaceC0907d) obj;
                boolean H3 = Z.d.H(this.f1529f, (R.h) this.f1532i, (Z.t) this.f1530g, (C0239d) this.f1531h);
                Boolean valueOf2 = Boolean.valueOf(H3);
                if (H3 || !interfaceC0907d2.a()) {
                    return valueOf2;
                }
                return null;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0892N abstractC0892N2 = (AbstractC0892N) obj;
                AbstractC0893O[] abstractC0893OArr = (AbstractC0893O[]) this.f1530g;
                int length = abstractC0893OArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    AbstractC0893O abstractC0893O = abstractC0893OArr[i8];
                    int i10 = i9 + 1;
                    f2.j.c(abstractC0893O);
                    Object t3 = abstractC0893O.t();
                    C0853O c0853o = t3 instanceof C0853O ? (C0853O) t3 : null;
                    r.Q q3 = (r.Q) this.f1531h;
                    q3.getClass();
                    C0876x c0876x = c0853o != null ? c0853o.f7986c : null;
                    int i11 = this.f1529f;
                    AbstractC0892N.d(abstractC0892N2, abstractC0893O, ((int[]) this.f1532i)[i9], c0876x != null ? c0876x.a(i11 - abstractC0893O.f8127e, O0.k.f3741d) : q3.f7989b.a(0, i11 - abstractC0893O.f8127e));
                    i8++;
                    i9 = i10;
                }
                return R1.y.f4171a;
            case 5:
                AbstractC0892N abstractC0892N3 = (AbstractC0892N) obj;
                x.H h3 = (x.H) this.f1530g;
                int i12 = h3.f9952b;
                x.p0 p0Var = (x.p0) h3.f9954d.b();
                C0.H h4 = p0Var != null ? p0Var.f10230a : null;
                InterfaceC0887I interfaceC0887I2 = (InterfaceC0887I) this.f1532i;
                boolean z3 = interfaceC0887I2.getLayoutDirection() == O0.k.f3742e;
                AbstractC0893O abstractC0893O2 = (AbstractC0893O) this.f1531h;
                C0239d h5 = x.N.h(interfaceC0887I2, i12, h3.f9953c, h4, z3, abstractC0893O2.f8126d);
                p.P p3 = p.P.f7568e;
                int i13 = abstractC0893O2.f8126d;
                x.n0 n0Var = h3.f9951a;
                n0Var.a(p3, h5, this.f1529f, i13);
                AbstractC0892N.f(abstractC0892N3, abstractC0893O2, Math.round(-n0Var.f10182a.g()), 0);
                return R1.y.f4171a;
            default:
                AbstractC0892N abstractC0892N4 = (AbstractC0892N) obj;
                x.r0 r0Var = (x.r0) this.f1530g;
                int i14 = r0Var.f10248b;
                x.p0 p0Var2 = (x.p0) r0Var.f10250d.b();
                C0.H h6 = p0Var2 != null ? p0Var2.f10230a : null;
                AbstractC0893O abstractC0893O3 = (AbstractC0893O) this.f1531h;
                C0239d h7 = x.N.h((InterfaceC0887I) this.f1532i, i14, r0Var.f10249c, h6, false, abstractC0893O3.f8126d);
                p.P p4 = p.P.f7567d;
                int i15 = abstractC0893O3.f8127e;
                x.n0 n0Var2 = r0Var.f10247a;
                n0Var2.a(p4, h7, this.f1529f, i15);
                AbstractC0892N.f(abstractC0892N4, abstractC0893O3, 0, Math.round(-n0Var2.f10182a.g()));
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0093f(Object obj, Object obj2, int i3, Serializable serializable, int i4) {
        super(1);
        this.f1528e = i4;
        this.f1530g = obj;
        this.f1531h = obj2;
        this.f1529f = i3;
        this.f1532i = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093f(ArrayList arrayList, InterfaceC0887I interfaceC0887I, int i3, ArrayList arrayList2) {
        super(1);
        this.f1528e = 0;
        float f3 = AbstractC0107m.f1658a;
        this.f1530g = arrayList;
        this.f1532i = interfaceC0887I;
        this.f1529f = i3;
        this.f1531h = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0093f(InterfaceC0887I interfaceC0887I, InterfaceC0921r interfaceC0921r, AbstractC0893O abstractC0893O, int i3, int i4) {
        super(1);
        this.f1528e = i4;
        this.f1532i = interfaceC0887I;
        this.f1530g = interfaceC0921r;
        this.f1531h = abstractC0893O;
        this.f1529f = i3;
    }
}
