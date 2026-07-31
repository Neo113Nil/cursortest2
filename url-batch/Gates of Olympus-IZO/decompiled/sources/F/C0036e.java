package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.EnumC0121t0;
import I.InterfaceC0110n0;
import a.AbstractC0157a;
import b0.C0261L;
import b0.InterfaceC0285r;
import e0.C0336b;
import f.AbstractC0382a;
import h1.C0438i;
import j.C0475A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k2.AbstractC0552y;
import k2.C0536h;
import k2.InterfaceC0534f;
import r.AbstractC0801M;
import r.AbstractC0813j;
import r.AbstractC0818o;
import r.C0802N;
import r.C0803O;
import r.C0807d;
import t0.C0897e;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import u0.AbstractC0960a;
import u0.C0997t;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036e extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0036e(int i3, Object obj) {
        super(2);
        this.f1223e = i3;
        this.f1224f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v55, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r0v60, types: [Y1.f, Z1.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [Y1.e, Z1.j] */
    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3;
        int i4;
        R.k kVar;
        Collection w02;
        long j3 = -9187201950435737472L;
        int i5 = 5;
        char c3 = 7;
        InterfaceC0534f interfaceC0534f = null;
        switch (this.f1223e) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    C0807d c0807d = AbstractC0813j.f7062b;
                    U.c cVar = U.a.f3290n;
                    U.i iVar = U.i.f3302a;
                    C0802N a3 = AbstractC0801M.a(c0807d, cVar, c0113p, 54);
                    int i6 = c0113p.f2306P;
                    InterfaceC0110n0 m3 = c0113p.m();
                    U.l c4 = U.m.c(c0113p, iVar);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n = C0901i.f7920b;
                    c0113p.U();
                    if (c0113p.f2305O) {
                        c0113p.l(c0906n);
                    } else {
                        c0113p.d0();
                    }
                    C0089d.Q(c0113p, C0901i.f7923e, a3);
                    C0089d.Q(c0113p, C0901i.f7922d, m3);
                    C0900h c0900h = C0901i.f7924f;
                    if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i6))) {
                        AbstractC0080b.p(i6, c0113p, i6, c0900h);
                    }
                    C0089d.Q(c0113p, C0901i.f7921c, c4);
                    ((Y1.f) this.f1224f).f(C0803O.f7016a, c0113p, 6);
                    c0113p.p(true);
                }
                return L1.z.f2729a;
            case 1:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    U.l c5 = androidx.compose.ui.layout.a.c("indicatorRipple");
                    float f3 = H.h.f1694a;
                    AbstractC0818o.a(androidx.compose.foundation.c.a(I2.l.m(c5, P0.a(5, c0113p2)), (G.e) this.f1224f, B0.a(0.0f, c0113p2, 0, 7)), c0113p2, 0);
                }
                return L1.z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0113p c0113p3 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p3.x()) {
                    c0113p3.L();
                } else {
                    ((Y1.e) this.f1224f).g(c0113p3, 0);
                }
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                Set set = (Set) obj;
                I.A0 a02 = (I.A0) this.f1224f;
                synchronized (a02.f2061b) {
                    try {
                        if (((EnumC0121t0) a02.f2076r.getValue()).compareTo(EnumC0121t0.f2364h) >= 0) {
                            C0475A c0475a = a02.f2066g;
                            if (set instanceof K.f) {
                                C0475A c0475a2 = ((K.f) set).f2653d;
                                Object[] objArr = c0475a2.f5130b;
                                long[] jArr = c0475a2.f5129a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j4 = jArr[i7];
                                        if ((((~j4) << c3) & j4 & j3) != j3) {
                                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                                            for (int i9 = 0; i9 < i8; i9++) {
                                                if ((j4 & 255) < 128) {
                                                    Object obj3 = objArr[(i7 << 3) + i9];
                                                    if (!(obj3 instanceof S.y) || ((S.y) obj3).e(1)) {
                                                        c0475a.a(obj3);
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
                                            c3 = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof S.y) || ((S.y) obj4).e(1)) {
                                        c0475a.a(obj4);
                                    }
                                }
                            }
                            interfaceC0534f = a02.t();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC0534f != null) {
                    ((C0536h) interfaceC0534f).resumeWith(L1.z.f2729a);
                }
                return L1.z.f2729a;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                Set set2 = (Set) obj;
                if (!(set2 instanceof K.f)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj5 : set3) {
                            if ((obj5 instanceof S.y) && !((S.y) obj5).e(4)) {
                            }
                            ((m2.e) this.f1224f).g(set2);
                        }
                    }
                    return L1.z.f2729a;
                }
                C0475A c0475a3 = ((K.f) set2).f2653d;
                Object[] objArr2 = c0475a3.f5130b;
                long[] jArr2 = c0475a3.f5129a;
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
                                    if ((obj6 instanceof S.y) && !((S.y) obj6).e(4)) {
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
                }
                return L1.z.f2729a;
            case 5:
                R.b bVar = (R.b) obj;
                List list = (List) ((Z1.j) this.f1224f).g(bVar, obj2);
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj7 = list.get(i13);
                    if (obj7 != null && (kVar = bVar.f3130e) != null && !kVar.c(obj7)) {
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
                    S.w wVar = (S.w) this.f1224f;
                    AtomicReference atomicReference = wVar.f3263b;
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        w02 = collection;
                    } else if (obj8 instanceof Set) {
                        w02 = M1.m.c0(obj8, collection);
                    } else {
                        if (!(obj8 instanceof List)) {
                            C0089d.x("Unexpected notification");
                            throw null;
                        }
                        w02 = M1.l.w0((Collection) obj8, AbstractC0157a.M(collection));
                    }
                    while (!atomicReference.compareAndSet(obj8, w02)) {
                        if (atomicReference.get() != obj8) {
                            break;
                        }
                    }
                    if (S.w.a(wVar)) {
                        wVar.f3262a.j(new A2.l(15, wVar));
                    }
                    return L1.z.f2729a;
                    break;
                }
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                U.l lVar = (U.l) obj;
                U.l lVar2 = (U.j) obj2;
                if (lVar2 instanceof U.g) {
                    ?? r02 = ((U.g) lVar2).f3300c;
                    Z1.w.d(3, r02);
                    U.i iVar2 = U.i.f3302a;
                    C0113p c0113p4 = (C0113p) this.f1224f;
                    lVar2 = U.m.b(c0113p4, (U.l) r02.f(iVar2, c0113p4, 0));
                }
                return lVar.e(lVar2);
            case 8:
                l.x xVar = (l.x) obj;
                l.x xVar2 = (l.x) obj2;
                l.x xVar3 = l.x.f5516f;
                return Boolean.valueOf(xVar == xVar3 && xVar2 == xVar3 && !((l.G) this.f1224f).f5435a.f5449b);
            case AbstractC0382a.f4777a /* 9 */:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                o.g0 g0Var = (o.g0) this.f1224f;
                AbstractC0552y.q(g0Var.j0(), null, null, new o.e0(g0Var, floatValue, floatValue2, null), 3);
                return Boolean.TRUE;
            case AbstractC0382a.f4779c /* 10 */:
                InterfaceC0285r interfaceC0285r = (InterfaceC0285r) obj;
                C0336b c0336b = (C0336b) obj2;
                t0.a0 a0Var = (t0.a0) this.f1224f;
                if (a0Var.f7877o.C()) {
                    t0.i0 snapshotObserver = ((C0997t) t0.G.a(a0Var.f7877o)).getSnapshotObserver();
                    C0261L c0261l = t0.a0.f7869H;
                    snapshotObserver.a(a0Var, C0897e.f7898h, new E2.j(a0Var, interfaceC0285r, c0336b, i5));
                    a0Var.f7875F = false;
                } else {
                    a0Var.f7875F = true;
                }
                return L1.z.f2729a;
            default:
                C0113p c0113p5 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p5.x()) {
                    c0113p5.L();
                } else {
                    ((AbstractC0960a) this.f1224f).a(0, c0113p5);
                }
                return L1.z.f2729a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0036e(Y1.e eVar) {
        super(2);
        this.f1223e = 5;
        this.f1224f = (Z1.j) eVar;
    }
}
