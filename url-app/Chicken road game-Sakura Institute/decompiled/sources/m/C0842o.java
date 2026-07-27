package m;

import A.C0016l;
import A.C0022s;
import W2.C0286h;
import c0.C0531b;
import e1.C0558a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l0.C0810h;
import m3.C0862a;
import o.C0888h;
import o.C0894k;
import o.InterfaceC0880d;
import o.U0;
import r0.C1077s;
import s0.AbstractC1131a;
import s0.ViewOnAttachStateChangeListenerC1172v;
import y2.AbstractC1341p;
import z2.C1442z;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842o extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8148e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8149i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8150j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0842o(Object obj, Object obj2, Object obj3, int i2) {
        super(0);
        this.f8147d = i2;
        this.f8148e = obj;
        this.f8149i = obj2;
        this.f8150j = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0202  */
    /* JADX WARN: Type inference failed for: r3v15, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List h4;
        int i2 = 0;
        Object obj = this.f8148e;
        Object obj2 = this.f8150j;
        Object obj3 = this.f8149i;
        switch (this.f8147d) {
            case 0:
                r0.G g4 = (r0.G) obj2;
                ((M2.E) obj).f3580d = ((C0843p) obj3).f8156w.a(g4.f9624d.h(), g4.getLayoutDirection(), g4);
                return Unit.f7487a;
            case 1:
                m3.s sVar = ((m3.d) obj).f8340b;
                List<Certificate> list = (List) obj3;
                if (sVar != null && (h4 = sVar.h(list, (String) obj2)) != null) {
                    list = h4;
                }
                ArrayList arrayList = new ArrayList(C1442z.h(list, 10));
                for (Certificate certificate : list) {
                    Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 2:
                C0894k c0894k = (C0894k) obj;
                C0810h c0810h = c0894k.f8813x;
                while (c0810h.f7906a.l()) {
                    I.d dVar = c0810h.f7906a;
                    if (dVar.k()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    Y.d dVar2 = (Y.d) ((C0888h) dVar.f3330d[dVar.f3332i - 1]).f8773a.invoke();
                    if (!(dVar2 == null ? true : c0894k.D0(dVar2, c0894k.B))) {
                        if (c0894k.f8807A) {
                            Y.d C02 = c0894k.C0();
                            if (C02 != null && c0894k.D0(C02, c0894k.B)) {
                                c0894k.f8807A = false;
                            }
                        }
                        ((U0) obj3).f8727e = C0894k.B0(c0894k, (InterfaceC0880d) obj2);
                        return Unit.f7487a;
                    }
                    C0286h c0286h = ((C0888h) dVar.n(dVar.f3332i - 1)).f8774b;
                    Unit unit = Unit.f7487a;
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    c0286h.u(unit);
                }
                if (c0894k.f8807A) {
                }
                ((U0) obj3).f8727e = C0894k.B0(c0894k, (InterfaceC0880d) obj2);
                return Unit.f7487a;
            case 3:
                m3.s sVar2 = ((m3.d) obj).f8340b;
                Intrinsics.c(sVar2);
                return sVar2.h(((m3.k) obj3).a(), ((C0862a) obj2).f8320h.f8396d);
            case 4:
                r.g gVar = (r.g) ((G.F) obj).getValue();
                r.v vVar = (r.v) obj3;
                return new r.h(vVar, gVar, (r.c) obj2, new C0016l((IntRange) ((s.u) vVar.f9554d.f1055e).getValue(), gVar));
            case 5:
                r0.J j4 = (r0.J) obj;
                r0.L l4 = j4.f9632D;
                l4.f9683j = 0;
                I.d v4 = l4.f9674a.v();
                int i4 = v4.f3332i;
                if (i4 > 0) {
                    Object[] objArr = v4.f3330d;
                    int i5 = 0;
                    do {
                        r0.J j5 = ((r0.E) objArr[i5]).f9584C.f9692s;
                        Intrinsics.c(j5);
                        j5.f9634m = j5.f9635n;
                        j5.f9635n = Integer.MAX_VALUE;
                        if (j5.f9636o == 2) {
                            j5.f9636o = 3;
                        }
                        i5++;
                    } while (i5 < i4);
                }
                r0.L l5 = j4.f9632D;
                I.d v5 = l5.f9674a.v();
                int i6 = v5.f3332i;
                if (i6 > 0) {
                    Object[] objArr2 = v5.f3330d;
                    int i7 = 0;
                    do {
                        r0.J j6 = ((r0.E) objArr2[i7]).f9584C.f9692s;
                        Intrinsics.c(j6);
                        j6.f9644w.f9617d = false;
                        Unit unit2 = Unit.f7487a;
                        i7++;
                    } while (i7 < i6);
                }
                C1077s c1077s = j4.T().f9842Q;
                r0.L l6 = (r0.L) obj2;
                if (c1077s != null) {
                    boolean z4 = c1077s.f9703n;
                    I.a aVar2 = (I.a) l6.f9674a.n();
                    int i8 = aVar2.f3324d.f3332i;
                    for (int i9 = 0; i9 < i8; i9++) {
                        r0.P M02 = ((r0.a0) ((r0.E) aVar2.get(i9)).B.f2910d).M0();
                        if (M02 != null) {
                            M02.f9703n = z4;
                        }
                    }
                }
                ((C1077s) obj3).x0().l();
                if (j4.T().f9842Q != null) {
                    I.a aVar3 = (I.a) l6.f9674a.n();
                    int i10 = aVar3.f3324d.f3332i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        r0.P M03 = ((r0.a0) ((r0.E) aVar3.get(i11)).B.f2910d).M0();
                        if (M03 != null) {
                            M03.f9703n = false;
                        }
                    }
                }
                r0.E e4 = l5.f9674a;
                I.d v6 = e4.v();
                int i12 = v6.f3332i;
                if (i12 > 0) {
                    Object[] objArr3 = v6.f3330d;
                    int i13 = 0;
                    do {
                        r0.J j7 = ((r0.E) objArr3[i13]).f9584C.f9692s;
                        Intrinsics.c(j7);
                        int i14 = j7.f9634m;
                        int i15 = j7.f9635n;
                        if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                            j7.s0();
                        }
                        i13++;
                    } while (i13 < i12);
                }
                I.d v7 = e4.v();
                int i16 = v7.f3332i;
                if (i16 > 0) {
                    Object[] objArr4 = v7.f3330d;
                    do {
                        r0.J j8 = ((r0.E) objArr4[i2]).f9584C.f9692s;
                        Intrinsics.c(j8);
                        r0.F f4 = j8.f9644w;
                        f4.f9618e = f4.f9617d;
                        Unit unit3 = Unit.f7487a;
                        i2++;
                    } while (i2 < i16);
                }
                return Unit.f7487a;
            case 6:
                Z.M m4 = r0.a0.f9748K;
                ((r0.a0) obj).I0((Z.r) obj3, (C0531b) obj2);
                return Unit.f7487a;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1131a abstractC1131a = (AbstractC1131a) obj;
                abstractC1131a.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC1172v) obj3);
                Intrinsics.checkNotNullParameter(abstractC1131a, "<this>");
                C0022s listener = (C0022s) obj2;
                Intrinsics.checkNotNullParameter(listener, "listener");
                C0558a i02 = u3.l.i0(abstractC1131a);
                Intrinsics.checkNotNullParameter(listener, "listener");
                i02.f6162a.remove(listener);
                return Unit.f7487a;
            default:
                t.i iVar = (t.i) obj;
                Y.d B02 = t.i.B0(iVar, (r0.a0) obj3, (M2.p) obj2);
                if (B02 == null) {
                    return null;
                }
                C0894k c0894k2 = iVar.f10634t;
                if (M0.j.a(c0894k2.B, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return B02.h(c0894k2.F0(B02, c0894k2.B) ^ (-9223372034707292160L));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0842o(t.i iVar, r0.a0 a0Var, Function0 function0) {
        super(0);
        this.f8147d = 8;
        this.f8148e = iVar;
        this.f8149i = a0Var;
        this.f8150j = (M2.p) function0;
    }
}
