package C0;

import F.e1;
import F.n1;
import I.C0143d;
import I.C0167p;
import I.C0187z0;
import I.EnumC0175t0;
import I.InterfaceC0164n0;
import a0.C0238c;
import a0.C0239d;
import android.graphics.RectF;
import b0.O;
import e0.C0416b;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import h2.AbstractC0508a;
import j.C0519A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p.C0772k0;
import p.C0776m0;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.InterfaceC0819f;
import r.AbstractC0856c;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.C0855b;
import r.P;
import r.Q;
import r.S;
import t0.C0992e;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import t0.b0;
import t0.j0;
import u0.AbstractC1088a;
import u0.C1123s;
import x.Z;

/* renamed from: C0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025a extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f577f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0025a(int i3, Object obj) {
        super(2);
        this.f576e = i3;
        this.f577f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r0v57, types: [e2.f, f2.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [e2.e, f2.k] */
    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        boolean f3;
        int i3;
        int i4;
        R.k kVar;
        Collection U02;
        long j3 = -9187201950435737472L;
        int i5 = 5;
        char c2 = 7;
        InterfaceC0819f interfaceC0819f = null;
        switch (this.f576e) {
            case 0:
                C0239d F3 = b0.M.F((RectF) obj);
                C0239d F4 = b0.M.F((RectF) obj2);
                switch (((B.r) this.f577f).f438a) {
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        f3 = F3.f(F4);
                        break;
                    default:
                        long a3 = F3.a();
                        F4.getClass();
                        if (C0238c.d(a3) < F4.f4724a || C0238c.d(a3) >= F4.f4726c || C0238c.e(a3) < F4.f4725b || C0238c.e(a3) >= F4.f4727d) {
                            f3 = false;
                            break;
                        } else {
                            f3 = true;
                            break;
                        }
                        break;
                }
                return Boolean.valueOf(f3);
            case 1:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    C0855b c0855b = AbstractC0864k.f8052b;
                    U.h hVar = U.b.f4471n;
                    U.n nVar = U.n.f4488a;
                    Q a4 = P.a(c0855b, hVar, c0167p, 54);
                    int i6 = c0167p.f2864P;
                    InterfaceC0164n0 m3 = c0167p.m();
                    U.q d3 = U.a.d(c0167p, nVar);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n = C0996i.f8754b;
                    c0167p.U();
                    if (c0167p.f2863O) {
                        c0167p.l(c1001n);
                    } else {
                        c0167p.d0();
                    }
                    C0143d.R(c0167p, C0996i.f8757e, a4);
                    C0143d.R(c0167p, C0996i.f8756d, m3);
                    C0995h c0995h = C0996i.f8758f;
                    if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i6))) {
                        A.k.o(i6, c0167p, i6, c0995h);
                    }
                    C0143d.R(c0167p, C0996i.f8755c, d3);
                    ((InterfaceC0427f) this.f577f).g(S.f7990a, c0167p, 6);
                    c0167p.p(true);
                }
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    U.q c3 = androidx.compose.ui.layout.a.c(U.n.f4488a, "indicatorRipple");
                    float f4 = H.n.f2429a;
                    AbstractC0868o.a(androidx.compose.foundation.d.a(AbstractC0508a.u(c3, n1.a(5, c0167p2)), (G.i) this.f577f, e1.a(false, 0.0f, c0167p2, 0, 7)), c0167p2, 0);
                }
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                Set set = (Set) obj;
                C0187z0 c0187z0 = (C0187z0) this.f577f;
                synchronized (c0187z0.f2985b) {
                    try {
                        if (((EnumC0175t0) c0187z0.f3001r.getValue()).compareTo(EnumC0175t0.f2923h) >= 0) {
                            C0519A c0519a = c0187z0.f2990g;
                            if (set instanceof K.f) {
                                C0519A c0519a2 = ((K.f) set).f3227d;
                                Object[] objArr = c0519a2.f6248b;
                                long[] jArr = c0519a2.f6247a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j4 = jArr[i7];
                                        if ((((~j4) << c2) & j4 & j3) != j3) {
                                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                                            for (int i9 = 0; i9 < i8; i9++) {
                                                if ((j4 & 255) < 128) {
                                                    Object obj3 = objArr[(i7 << 3) + i9];
                                                    if (!(obj3 instanceof S.z) || ((S.z) obj3).e(1)) {
                                                        c0519a.a(obj3);
                                                    }
                                                }
                                                j4 >>= 8;
                                            }
                                            i3 = 1;
                                            if (i8 == 8) {
                                            }
                                        } else {
                                            i3 = 1;
                                        }
                                        if (i7 != length) {
                                            i7 += i3;
                                            j3 = -9187201950435737472L;
                                            c2 = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof S.z) || ((S.z) obj4).e(1)) {
                                        c0519a.a(obj4);
                                    }
                                }
                            }
                            interfaceC0819f = c0187z0.t();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC0819f != null) {
                    ((C0821h) interfaceC0819f).u(R1.y.f4171a);
                }
                return R1.y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                Set set2 = (Set) obj;
                if (!(set2 instanceof K.f)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj5 : set3) {
                            if ((obj5 instanceof S.z) && !((S.z) obj5).e(4)) {
                            }
                            ((s2.g) this.f577f).p(set2);
                        }
                    }
                    return R1.y.f4171a;
                }
                C0519A c0519a3 = ((K.f) set2).f3227d;
                Object[] objArr2 = c0519a3.f6248b;
                long[] jArr2 = c0519a3.f6247a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j5 = jArr2[i10];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j5 & 255) < 128) {
                                    Object obj6 = objArr2[(i10 << 3) + i12];
                                    if ((obj6 instanceof S.z) && !((S.z) obj6).e(4)) {
                                    }
                                }
                                j5 >>= 8;
                            }
                            i4 = 1;
                            if (i11 != 8) {
                            }
                        } else {
                            i4 = 1;
                        }
                        if (i10 != length2) {
                            i10 += i4;
                        }
                    }
                    ((s2.g) this.f577f).p(set2);
                }
                return R1.y.f4171a;
            case 5:
                R.b bVar = (R.b) obj;
                List list = (List) ((f2.k) this.f577f).h(bVar, obj2);
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj7 = list.get(i13);
                    if (obj7 != null && (kVar = bVar.f4003e) != null && !kVar.b(obj7)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 6:
                Collection collection = (Set) obj;
                while (true) {
                    S.w wVar = (S.w) this.f577f;
                    AtomicReference atomicReference = wVar.f4272b;
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        U02 = collection;
                    } else if (obj8 instanceof Set) {
                        U02 = S1.m.A0(obj8, collection);
                    } else {
                        if (!(obj8 instanceof List)) {
                            C0143d.x("Unexpected notification");
                            throw null;
                        }
                        U02 = S1.l.U0((Collection) obj8, O2.l.l0(collection));
                    }
                    while (!atomicReference.compareAndSet(obj8, U02)) {
                        if (atomicReference.get() != obj8) {
                            break;
                        }
                    }
                    if (S.w.a(wVar)) {
                        wVar.f4271a.n(new A.h(15, wVar));
                    }
                    return R1.y.f4171a;
                    break;
                }
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                U.q qVar = (U.q) obj;
                U.q qVar2 = (U.o) obj2;
                if (qVar2 instanceof U.l) {
                    ?? r02 = ((U.l) qVar2).f4486c;
                    f2.x.d(3, r02);
                    U.n nVar2 = U.n.f4488a;
                    C0167p c0167p3 = (C0167p) this.f577f;
                    qVar2 = U.a.c(c0167p3, (U.q) r02.g(nVar2, c0167p3, 0));
                }
                return qVar.i(qVar2);
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                l.x xVar = (l.x) obj;
                l.x xVar2 = (l.x) obj2;
                l.x xVar3 = l.x.f6549f;
                return Boolean.valueOf(xVar == xVar3 && xVar2 == xVar3 && !((l.H) this.f577f).f6456a.f6470c);
            case AbstractC0856c.f8037c /* 9 */:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                C0776m0 c0776m0 = (C0776m0) this.f577f;
                AbstractC0837y.r(c0776m0.m0(), null, null, new C0772k0(c0776m0, floatValue, floatValue2, null), 3);
                return Boolean.TRUE;
            case AbstractC0856c.f8039e /* 10 */:
                return new O0.h(l0.c.c(0, ((U.h) this.f577f).a(0, (int) (((O0.j) obj).f3740a & 4294967295L))));
            case 11:
                b0.r rVar = (b0.r) obj;
                C0416b c0416b = (C0416b) obj2;
                b0 b0Var = (b0) this.f577f;
                if (b0Var.f8711o.E()) {
                    j0 snapshotObserver = ((C1123s) t0.H.a(b0Var.f8711o)).getSnapshotObserver();
                    O o3 = b0.f8701H;
                    snapshotObserver.a(b0Var, C0992e.f8730h, new K2.i(b0Var, rVar, c0416b, i5));
                    b0Var.f8709F = false;
                } else {
                    b0Var.f8709F = true;
                }
                return R1.y.f4171a;
            case 12:
                C0167p c0167p4 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p4.x()) {
                    c0167p4.L();
                } else {
                    ((AbstractC1088a) this.f577f).a(0, c0167p4);
                }
                return R1.y.f4171a;
            default:
                ((Z) this.f577f).d(((C0238c) obj2).f4722a);
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0025a(InterfaceC0426e interfaceC0426e) {
        super(2);
        this.f576e = 5;
        this.f577f = (f2.k) interfaceC0426e;
    }
}
