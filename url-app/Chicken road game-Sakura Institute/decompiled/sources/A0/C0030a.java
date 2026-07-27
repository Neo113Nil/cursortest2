package A0;

import A.AbstractC0017m;
import A.C0022s;
import D.AbstractC0146k1;
import D.X0;
import G.C0192d;
import G.C0216p;
import G.C0236z0;
import G.EnumC0224t0;
import W2.C0286h;
import W2.InterfaceC0284f;
import android.graphics.RectF;
import c0.C0531b;
import com.appsflyer.attribution.RequestError;
import i.C0661B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k.C0731G;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.C0842o;
import o.C0887g0;
import o.C0891i0;
import q.AbstractC1024c;
import q.AbstractC1035n;
import r0.C1064e;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import r0.a0;
import r0.i0;
import s0.AbstractC1131a;
import s0.C1166s;
import w.Y;
import y2.AbstractC1341p;
import z2.C1403G;
import z2.C1440x;
import z2.C1441y;

/* renamed from: A0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030a extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0030a(int i2, Object obj) {
        super(2);
        this.f308d = i2;
        this.f309e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v47, types: [L2.c, M2.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [M2.p, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        boolean f4;
        int i2;
        int i4;
        P.k kVar;
        Collection B;
        long j4 = -9187201950435737472L;
        char c4 = 7;
        InterfaceC0284f interfaceC0284f = null;
        switch (this.f308d) {
            case 0:
                Y.d F3 = Z.K.F((RectF) obj);
                Y.d F4 = Z.K.F((RectF) obj2);
                switch (((C0022s) this.f309e).f182a) {
                    case 4:
                        f4 = F3.f(F4);
                        break;
                    default:
                        long a4 = F3.a();
                        F4.getClass();
                        if (Y.c.d(a4) < F4.f4374a || Y.c.d(a4) >= F4.f4376c || Y.c.e(a4) < F4.f4375b || Y.c.e(a4) >= F4.f4377d) {
                            f4 = false;
                            break;
                        } else {
                            f4 = true;
                            break;
                        }
                        break;
                }
                return Boolean.valueOf(f4);
            case 1:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.o c5 = androidx.compose.ui.layout.a.c(S.l.f3977a, "indicatorRipple");
                    float f5 = F.o.f2446a;
                    AbstractC1035n.a(androidx.compose.foundation.d.a(u3.l.U(c5, AbstractC0146k1.a(5, c0216p)), (E.f) this.f309e, X0.a(false, 0.0f, 0L, c0216p, 0, 7)), c0216p, 0);
                }
                return Unit.f7487a;
            case 2:
                Set set = (Set) obj;
                C0236z0 c0236z0 = (C0236z0) this.f309e;
                synchronized (c0236z0.f2983b) {
                    try {
                        if (((EnumC0224t0) c0236z0.f2999r.getValue()).compareTo(EnumC0224t0.f2920k) >= 0) {
                            C0661B c0661b = c0236z0.f2988g;
                            if (set instanceof I.f) {
                                C0661B c0661b2 = ((I.f) set).f3343d;
                                Object[] objArr = c0661b2.f6885b;
                                long[] jArr = c0661b2.f6884a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j5 = jArr[i5];
                                        if ((((~j5) << c4) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                                            for (int i7 = 0; i7 < i6; i7++) {
                                                if ((j5 & 255) < 128) {
                                                    Object obj3 = objArr[(i5 << 3) + i7];
                                                    if (!(obj3 instanceof Q.E) || ((Q.E) obj3).b(1)) {
                                                        c0661b.a(obj3);
                                                    }
                                                }
                                                j5 >>= 8;
                                            }
                                            i2 = 1;
                                            if (i6 == 8) {
                                            }
                                        } else {
                                            i2 = 1;
                                        }
                                        if (i5 != length) {
                                            i5 += i2;
                                            c4 = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if ((obj4 instanceof Q.E) && !((Q.E) obj4).b(1)) {
                                    }
                                    c0661b.a(obj4);
                                }
                            }
                            interfaceC0284f = c0236z0.t();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC0284f != null) {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    ((C0286h) interfaceC0284f).u(Unit.f7487a);
                }
                return Unit.f7487a;
            case 3:
                Set set2 = (Set) obj;
                if (!(set2 instanceof I.f)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj5 : set3) {
                            if ((obj5 instanceof Q.E) && !((Q.E) obj5).b(4)) {
                            }
                            ((Y2.e) this.f309e).o(set2);
                        }
                    }
                    return Unit.f7487a;
                }
                C0661B c0661b3 = ((I.f) set2).f3343d;
                Object[] objArr2 = c0661b3.f6885b;
                long[] jArr2 = c0661b3.f6884a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j6 = jArr2[i8];
                        if ((((~j6) << 7) & j6 & j4) != j4) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j6 & 255) < 128) {
                                    Object obj6 = objArr2[(i8 << 3) + i10];
                                    if ((obj6 instanceof Q.E) && !((Q.E) obj6).b(4)) {
                                    }
                                }
                                j6 >>= 8;
                            }
                            i4 = 1;
                            if (i9 != 8) {
                            }
                        } else {
                            i4 = 1;
                        }
                        if (i8 != length2) {
                            i8 += i4;
                            j4 = -9187201950435737472L;
                        }
                    }
                    ((Y2.e) this.f309e).o(set2);
                }
                return Unit.f7487a;
            case 4:
                P.b bVar = (P.b) obj;
                List list = (List) ((M2.p) this.f309e).h(bVar, obj2);
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj7 = list.get(i11);
                    if (obj7 != null && (kVar = bVar.f3641e) != null && !kVar.b(obj7)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 5:
                Collection collection = (Set) obj;
                while (true) {
                    Q.A a5 = (Q.A) this.f309e;
                    AtomicReference atomicReference = a5.f3791b;
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        B = collection;
                    } else if (obj8 instanceof Set) {
                        B = C1441y.e(obj8, collection);
                    } else {
                        if (!(obj8 instanceof List)) {
                            C0192d.x("Unexpected notification");
                            throw null;
                        }
                        B = C1403G.B((Collection) obj8, C1440x.a(collection));
                    }
                    while (!atomicReference.compareAndSet(obj8, B)) {
                        if (atomicReference.get() != obj8) {
                            break;
                        }
                    }
                    if (Q.A.a(a5)) {
                        a5.f3790a.invoke(new A3.e(10, a5));
                    }
                    return Unit.f7487a;
                    break;
                }
            case 6:
                S.o oVar = (S.o) obj;
                S.o oVar2 = (S.m) obj2;
                if (oVar2 instanceof S.j) {
                    ?? r02 = ((S.j) oVar2).f3975b;
                    M2.J.d(3, r02);
                    S.l lVar = S.l.f3977a;
                    C0216p c0216p2 = (C0216p) this.f309e;
                    oVar2 = S.a.c(c0216p2, (S.o) r02.g(lVar, c0216p2, 0));
                }
                return oVar.h(oVar2);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                k.w wVar = (k.w) obj;
                k.w wVar2 = (k.w) obj2;
                k.w wVar3 = k.w.f7340i;
                return Boolean.valueOf(wVar == wVar3 && wVar2 == wVar3 && !((C0731G) this.f309e).f7256a.f7270c);
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                C0891i0 c0891i0 = (C0891i0) this.f309e;
                W2.B.m(c0891i0.p0(), null, null, new C0887g0(c0891i0, floatValue, floatValue2, null), 3);
                return Boolean.TRUE;
            case AbstractC1024c.f9242c /* 9 */:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    List list2 = (List) this.f309e;
                    int size2 = list2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        Function2 function2 = (Function2) list2.get(i12);
                        int i13 = c0216p3.f2861P;
                        InterfaceC1070k.f9822h.getClass();
                        C1068i c1068i = C1069j.f9817c;
                        c0216p3.W();
                        if (c0216p3.f2860O) {
                            c0216p3.l(c1068i);
                        } else {
                            c0216p3.f0();
                        }
                        C1067h c1067h = C1069j.f9821g;
                        if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i13))) {
                            AbstractC0017m.r(i13, c0216p3, i13, c1067h);
                        }
                        function2.h(c0216p3, 0);
                        c0216p3.q(true);
                    }
                }
                return Unit.f7487a;
            case 10:
                return new M0.h(j0.c.g(0, ((S.f) this.f309e).a(0, (int) (((M0.j) obj).f3554a & 4294967295L))));
            case RequestError.STOP_TRACKING /* 11 */:
                return new M0.h(((S.c) this.f309e).a(0L, ((M0.j) obj).f3554a, (M0.k) obj2));
            case 12:
                Z.r rVar = (Z.r) obj;
                C0531b c0531b = (C0531b) obj2;
                a0 a0Var = (a0) this.f309e;
                if (a0Var.f9762r.E()) {
                    i0 snapshotObserver = ((C1166s) r0.H.a(a0Var.f9762r)).getSnapshotObserver();
                    Z.M m4 = a0.f9748K;
                    snapshotObserver.a(a0Var, C1064e.f9781j, new C0842o(a0Var, rVar, c0531b, 6));
                    a0Var.f9760I = false;
                } else {
                    a0Var.f9760I = true;
                }
                return Unit.f7487a;
            case 13:
                C0216p c0216p4 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p4.z()) {
                    c0216p4.N();
                } else {
                    ((AbstractC1131a) this.f309e).a(0, c0216p4);
                }
                return Unit.f7487a;
            default:
                ((Y) this.f309e).d(((Y.c) obj2).f4372a);
                return Unit.f7487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0030a(Function2 function2) {
        super(2);
        this.f308d = 4;
        this.f309e = (M2.p) function2;
    }
}
