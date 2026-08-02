package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kyo implements kys {
    public final kuj a;
    public final kuj b;
    public final kuk c;
    public final kuk d;
    private final int e;
    private final kuj f;
    private final kuj g;
    private final kuk h;
    private final kuk i;
    private final kuk j;

    public kyo(int i) {
        this.e = i;
        if (i < 0) {
            throw new IllegalArgumentException(a.ai(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        kul kulVar = kul.a;
        this.a = new kuj(0L, kulVar);
        this.b = new kuj(0L, kulVar);
        kyx kyxVar = kyq.a;
        this.f = new kuj(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, kulVar);
        this.g = new kuj(C(), kulVar);
        kyx kyxVar2 = new kyx(0L, null, this, 3);
        this.c = new kuk(kyxVar2, kulVar);
        this.d = new kuk(kyxVar2, kulVar);
        if (J()) {
            kyxVar2 = kyq.a;
            kyxVar2.getClass();
        }
        this.h = new kuk(kyxVar2, kulVar);
        this.i = new kuk(kyq.s, kulVar);
        this.j = new kuk(null, kulVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int B(kyx kyxVar, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object d = kyxVar.d(i);
            if (d == null) {
                if (I(j)) {
                    if (z) {
                        if (!kyxVar.j(i, null, kyq.j)) {
                            kyxVar.g(i, false);
                            return 4;
                        }
                    } else if (kyxVar.j(i, null, kyq.d)) {
                        return 1;
                    }
                } else if (z) {
                    if (!kyxVar.j(i, null, kyq.j)) {
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (kyxVar.j(i, null, obj2)) {
                        return 2;
                    }
                }
            } else {
                if (d != kyq.e) {
                    ldb ldbVar = kyq.k;
                    if (d == ldbVar) {
                        kyxVar.h(i, null);
                        return 5;
                    }
                    if (d == kyq.h) {
                        kyxVar.h(i, null);
                        return 5;
                    }
                    if (d == kyq.l) {
                        kyxVar.h(i, null);
                        y();
                        return 4;
                    }
                    boolean z2 = kvo.a;
                    kyxVar.h(i, null);
                    if (d instanceof kzh) {
                        d = ((kzh) d).a;
                    }
                    if (O(d, obj)) {
                        kyxVar.i(i, kyq.i);
                        return 0;
                    }
                    if (kyxVar.b(i, ldbVar) == ldbVar) {
                        return 5;
                    }
                    kyxVar.g(i, true);
                    return 5;
                }
                if (kyxVar.j(i, d, kyq.d)) {
                    return 1;
                }
            }
        }
    }

    private final long C() {
        return this.f.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        r1 = (defpackage.kyx) r1.n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kyx D(long j) {
        Object obj;
        long j2;
        Object obj2 = this.h.a;
        kyx kyxVar = (kyx) this.c.a;
        if (kyxVar.b > ((kyx) obj2).b) {
            obj2 = kyxVar;
        }
        kyx kyxVar2 = (kyx) this.d.a;
        if (kyxVar2.b > ((kyx) obj2).b) {
            obj2 = kyxVar2;
        }
        lbx lbxVar = (lbx) obj2;
        while (true) {
            Object l = lbxVar.l();
            ldb ldbVar = lbw.a;
            obj = null;
            if (l == ldbVar) {
                break;
            }
            lbx lbxVar2 = (lbx) l;
            if (lbxVar2 == null) {
                if (lbxVar.a.d(null, ldbVar)) {
                    break;
                }
            } else {
                lbxVar = lbxVar2;
            }
        }
        kyx kyxVar3 = (kyx) lbxVar;
        if (z()) {
            kyx kyxVar4 = kyxVar3;
            loop1: do {
                int i = kyq.b;
                int i2 = i - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    }
                    j2 = (kyxVar4.b * i) + i2;
                    if (j2 < b()) {
                        break loop1;
                    }
                    while (true) {
                        Object d = kyxVar4.d(i2);
                        if (d != null && d != kyq.e) {
                            if (d == kyq.d) {
                                break loop1;
                            }
                        } else {
                            if (kyxVar4.j(i2, d, kyq.l)) {
                                kyxVar4.r();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (kyxVar4 != null);
            j2 = -1;
            if (j2 != -1) {
                q(j2);
            }
        }
        loop4: for (kyx kyxVar5 = kyxVar3; kyxVar5 != null; kyxVar5 = (kyx) kyxVar5.n()) {
            int i3 = kyq.b;
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if ((kyxVar5.b * i3) + i4 < j) {
                    break loop4;
                }
                while (true) {
                    Object d2 = kyxVar5.d(i4);
                    if (d2 != null && d2 != kyq.e) {
                        if (!(d2 instanceof kzh)) {
                            if (!(d2 instanceof kyc)) {
                                break;
                            }
                            if (kyxVar5.j(i4, d2, kyq.l)) {
                                obj = lcm.a(obj, d2);
                                kyxVar5.g(i4, true);
                                break;
                            }
                        } else {
                            if (kyxVar5.j(i4, d2, kyq.l)) {
                                obj = lcm.a(obj, ((kzh) d2).a);
                                kyxVar5.g(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (kyxVar5.j(i4, d2, kyq.l)) {
                            kyxVar5.r();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                H((kyc) obj, true);
                return kyxVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                H((kyc) arrayList.get(size), true);
            }
        }
        return kyxVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void E() {
        long j;
        Object a;
        kyx kyxVar;
        if (J()) {
            return;
        }
        kuk kukVar = this.h;
        kyx kyxVar2 = (kyx) kukVar.a;
        loop0: while (true) {
            kuj kujVar = this.f;
            long b = kujVar.b();
            long j2 = kyq.b;
            long j3 = b / j2;
            if (c() <= b) {
                if (kyxVar2.b < j3 && kyxVar2.m() != null) {
                    G(j3, kyxVar2);
                }
                F(1L);
                return;
            }
            if (kyxVar2.b != j3) {
                kyp kypVar = kyp.a;
                while (true) {
                    a = lbw.a(kyxVar2, j3, kypVar);
                    if (!lcz.a(a)) {
                        lbx b2 = lcz.b(a);
                        while (true) {
                            lbx lbxVar = (lbx) kukVar.a;
                            j = b;
                            if (lbxVar.b >= b2.b) {
                                break;
                            }
                            if (!b2.u()) {
                                break;
                            }
                            if (!kukVar.d(lbxVar, b2)) {
                                if (b2.s()) {
                                    b2.p();
                                }
                                b = j;
                            } else if (lbxVar.s()) {
                                lbxVar.p();
                            }
                        }
                    } else {
                        j = b;
                        break;
                    }
                    b = j;
                }
                if (lcz.a(a)) {
                    y();
                    G(j3, kyxVar2);
                    F(1L);
                } else {
                    kyxVar = (kyx) lcz.b(a);
                    long j4 = kyxVar.b;
                    if (j4 > j3) {
                        long j5 = j4 * j2;
                        if (kujVar.c(j + 1, j5)) {
                            F(j5 - j);
                        } else {
                            F(1L);
                        }
                    } else {
                        boolean z = kvo.a;
                        if (kyxVar == null) {
                            kyxVar2 = kyxVar;
                        } else {
                            continue;
                        }
                    }
                }
                kyxVar = null;
                if (kyxVar == null) {
                }
            } else {
                j = b;
            }
            int i = (int) (j % j2);
            Object d = kyxVar2.d(i);
            if (!(d instanceof kyc) || j < this.b.b || !kyxVar2.j(i, d, kyq.g)) {
                while (true) {
                    Object d2 = kyxVar2.d(i);
                    if (!(d2 instanceof kyc)) {
                        if (d2 != kyq.j) {
                            if (d2 != null) {
                                if (d2 == kyq.d || d2 == kyq.h || d2 == kyq.i || d2 == kyq.k || d2 == kyq.l) {
                                    break loop0;
                                } else if (d2 != kyq.f) {
                                    Objects.toString(d2);
                                    throw new IllegalStateException("Unexpected cell state: ".concat(d2.toString()));
                                }
                            } else if (kyxVar2.j(i, null, kyq.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (j < this.b.b) {
                        if (kyxVar2.j(i, d2, new kzh((kyc) d2))) {
                            break loop0;
                        }
                    } else if (kyxVar2.j(i, d2, kyq.g)) {
                        if (N(d2)) {
                            kyxVar2.i(i, kyq.d);
                            break;
                        } else {
                            kyxVar2.i(i, kyq.j);
                            kyxVar2.g(i, false);
                        }
                    }
                }
                F(1L);
            } else if (N(d)) {
                kyxVar2.i(i, kyq.d);
                break;
            } else {
                kyxVar2.i(i, kyq.j);
                kyxVar2.g(i, false);
                F(1L);
            }
        }
        F(1L);
    }

    private final void F(long j) {
        kuj kujVar = this.g;
        if ((kujVar.a(j) & 4611686018427387904L) != 0) {
            while ((kujVar.b & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void G(long j, kyx kyxVar) {
        kyx kyxVar2;
        kyx kyxVar3;
        while (kyxVar.b < j && (kyxVar3 = (kyx) kyxVar.m()) != null) {
            kyxVar = kyxVar3;
        }
        while (true) {
            if (!kyxVar.t() || (kyxVar2 = (kyx) kyxVar.m()) == null) {
                kuk kukVar = this.h;
                while (true) {
                    lbx lbxVar = (lbx) kukVar.a;
                    if (lbxVar.b >= kyxVar.b) {
                        return;
                    }
                    if (!kyxVar.u()) {
                        break;
                    }
                    if (kukVar.d(lbxVar, kyxVar)) {
                        if (lbxVar.s()) {
                            lbxVar.p();
                            return;
                        }
                        return;
                    } else if (kyxVar.s()) {
                        kyxVar.p();
                    }
                }
            } else {
                kyxVar = kyxVar2;
            }
        }
    }

    private final void H(kyc kycVar, boolean z) {
        if (kycVar instanceof kyl) {
            throw null;
        }
        if (kycVar instanceof kuv) {
            ((kqj) kycVar).ca(ixc.X(z ? m() : n()));
            return;
        }
        if (kycVar instanceof kze) {
            ((kze) kycVar).a.ca(new kyw(new kyu(l())));
            return;
        }
        if (!(kycVar instanceof kyk)) {
            if (!(kycVar instanceof ldu)) {
                Objects.toString(kycVar);
                throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(kycVar)));
            }
            kyx kyxVar = kyq.a;
            throw null;
        }
        kyk kykVar = (kyk) kycVar;
        kuw kuwVar = kykVar.b;
        kuwVar.getClass();
        kykVar.b = null;
        kykVar.a = kyq.l;
        Throwable l = kykVar.c.l();
        if (l == null) {
            kuwVar.ca(false);
            return;
        }
        if (kvo.b) {
            l = lda.a(l, kuwVar);
        }
        kuwVar.ca(ixc.X(l));
    }

    private final boolean I(long j) {
        return j < C() || j < b() + ((long) this.e);
    }

    private final boolean J() {
        long C = C();
        return C == 0 || C == Long.MAX_VALUE;
    }

    private final Object K(kqj kqjVar) {
        kuw kuwVar = new kuw(ixe.d(kqjVar), 1);
        kuwVar.y();
        Throwable n = n();
        if (kvo.b) {
            n = lda.a(n, kuwVar);
        }
        kuwVar.ca(ixc.X(n));
        Object l = kuwVar.l();
        kqp kqpVar = kqp.a;
        if (l == kqpVar) {
            kqjVar.getClass();
        }
        return l == kqpVar ? l : kow.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void L(kuv kuvVar) {
        Throwable n = n();
        if (kvo.b) {
            n = lda.a(n, kuvVar);
        }
        kuvVar.ca(ixc.X(n));
    }

    private static final void M(kyc kycVar, kyx kyxVar, int i) {
        kycVar.D(kyxVar, i + kyq.b);
    }

    private static final boolean N(Object obj) {
        if (obj instanceof kuv) {
            obj.getClass();
            return kyq.b((kuv) obj, kow.a);
        }
        if (obj instanceof ldu) {
            obj.getClass();
            throw null;
        }
        if (obj instanceof kyl) {
            throw null;
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
    }

    private static final boolean O(Object obj, Object obj2) {
        if (obj instanceof ldu) {
            throw null;
        }
        if (obj instanceof kze) {
            obj.getClass();
            return kyq.b(((kze) obj).a, new kyw(obj2));
        }
        if (!(obj instanceof kyk)) {
            if (obj instanceof kuv) {
                obj.getClass();
                return kyq.b((kuv) obj, obj2);
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        kyk kykVar = (kyk) obj;
        kuw kuwVar = kykVar.b;
        kuwVar.getClass();
        kykVar.b = null;
        kykVar.a = obj2;
        return kyq.b(kuwVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object f(kyo kyoVar, kqj kqjVar) {
        kym kymVar;
        int i;
        kyx kyxVar;
        if (kqjVar instanceof kym) {
            kymVar = (kym) kqjVar;
            int i2 = kymVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kymVar.c = i2 - Integer.MIN_VALUE;
                kym kymVar2 = kymVar;
                Object obj = kymVar2.a;
                kqp kqpVar = kqp.a;
                i = kymVar2.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                    return ((kyw) obj).b;
                }
                ixc.Y(obj);
                kyx kyxVar2 = (kyx) kyoVar.d.a;
                while (!kyoVar.x()) {
                    long b = kyoVar.b.b();
                    long j = kyq.b;
                    long j2 = b / j;
                    int i3 = (int) (b % j);
                    if (kyxVar2.b != j2) {
                        kyx o = kyoVar.o(j2, kyxVar2);
                        if (o != null) {
                            kyxVar = o;
                        } else {
                            continue;
                        }
                    } else {
                        kyxVar = kyxVar2;
                    }
                    kyo kyoVar2 = kyoVar;
                    Object k = kyoVar2.k(kyxVar, i3, b, null);
                    if (k == kyq.m) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (k != kyq.o) {
                        if (k != kyq.n) {
                            kyxVar.o();
                            return k;
                        }
                        kymVar2.c = 1;
                        Object g = kyoVar2.g(kyxVar, i3, b, kymVar2);
                        return g == kqpVar ? kqpVar : g;
                    }
                    if (b < kyoVar2.c()) {
                        kyxVar.o();
                    }
                    kyoVar = kyoVar2;
                    kyxVar2 = kyxVar;
                }
                return new kyu(kyoVar.l());
            }
        }
        kymVar = new kym(kyoVar, kqjVar);
        kym kymVar22 = kymVar;
        Object obj2 = kymVar22.a;
        kqp kqpVar2 = kqp.a;
        i = kymVar22.c;
        if (i == 0) {
        }
    }

    @Override // defpackage.kzf
    public final kyk A() {
        return new kyk(this);
    }

    public final int a(kyx kyxVar, int i, Object obj, long j, Object obj2, boolean z) {
        kyxVar.h(i, obj);
        if (z) {
            return B(kyxVar, i, obj, j, obj2, true);
        }
        Object d = kyxVar.d(i);
        if (d == null) {
            if (I(j)) {
                if (kyxVar.j(i, null, kyq.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kyxVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (d instanceof kyc) {
            kyxVar.h(i, null);
            if (O(d, obj)) {
                kyxVar.i(i, kyq.i);
                return 0;
            }
            ldb ldbVar = kyq.k;
            if (kyxVar.b(i, ldbVar) == ldbVar) {
                return 5;
            }
            kyxVar.g(i, true);
            return 5;
        }
        return B(kyxVar, i, obj, j, obj2, false);
    }

    public final long b() {
        return this.b.b;
    }

    public final long c() {
        return this.a.b & 1152921504606846975L;
    }

    @Override // defpackage.kzf
    public final Object d(kqj kqjVar) {
        kyo kyoVar = this;
        kuk kukVar = kyoVar.d;
        kyx kyxVar = (kyx) kukVar.a;
        while (!kyoVar.x()) {
            kuj kujVar = kyoVar.b;
            long b = kujVar.b();
            long j = kyq.b;
            long j2 = b / j;
            int i = (int) (b % j);
            if (kyxVar.b != j2) {
                kyx o = kyoVar.o(j2, kyxVar);
                if (o != null) {
                    kyxVar = o;
                } else {
                    continue;
                }
            }
            Object k = kyoVar.k(kyxVar, i, b, null);
            ldb ldbVar = kyq.m;
            if (k == ldbVar) {
                throw new IllegalStateException("unexpected");
            }
            ldb ldbVar2 = kyq.o;
            if (k != ldbVar2) {
                ldb ldbVar3 = kyq.n;
                if (k != ldbVar3) {
                    kyxVar.o();
                    return k;
                }
                kuw c = ixg.c(ixe.d(kqjVar));
                kyo kyoVar2 = this;
                try {
                    Object k2 = kyoVar2.k(kyxVar, i, b, c);
                    if (k2 == ldbVar) {
                        c.D(kyxVar, i);
                    } else if (k2 == ldbVar2) {
                        if (b < kyoVar2.c()) {
                            kyxVar.o();
                        }
                        kyx kyxVar2 = (kyx) kukVar.a;
                        while (true) {
                            if (kyoVar2.x()) {
                                c.ca(ixc.X(kyoVar2.m()));
                                break;
                            }
                            long b2 = kujVar.b();
                            long j3 = b2 / j;
                            int i2 = (int) (b2 % j);
                            if (kyxVar2.b != j3) {
                                kyx o2 = kyoVar2.o(j3, kyxVar2);
                                if (o2 != null) {
                                    kyxVar2 = o2;
                                } else {
                                    continue;
                                }
                            }
                            Object k3 = kyoVar2.k(kyxVar2, i2, b2, c);
                            if (k3 == ldbVar) {
                                c.D(kyxVar2, i2);
                                break;
                            }
                            if (k3 == ldbVar2) {
                                if (b2 < c()) {
                                    kyxVar2.o();
                                }
                                kyoVar2 = this;
                            } else {
                                if (k3 == ldbVar3) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kyxVar2.o();
                                c.k(k3);
                            }
                        }
                    } else {
                        kyxVar.o();
                        c.k(k2);
                    }
                    Object l = c.l();
                    if (l == kqp.a) {
                        kqjVar.getClass();
                    }
                    return l;
                } catch (Throwable th) {
                    c.A();
                    throw th;
                }
            }
            if (b < c()) {
                kyxVar.o();
            }
            kyoVar = this;
        }
        throw lda.b(m());
    }

    @Override // defpackage.kzf
    public final Object e(kqj kqjVar) {
        return f(this, kqjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(kyx kyxVar, int i, long j, kqj kqjVar) {
        kyn kynVar;
        int i2;
        kyw kywVar;
        kyx kyxVar2;
        if (kqjVar instanceof kyn) {
            kynVar = (kyn) kqjVar;
            int i3 = kynVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kynVar.c = i3 - Integer.MIN_VALUE;
                Object obj = kynVar.a;
                kqp kqpVar = kqp.a;
                i2 = kynVar.c;
                if (i2 != 0) {
                    ixc.Y(obj);
                    kynVar.c = 1;
                    kuw c = ixg.c(ixe.d(kynVar));
                    try {
                        kze kzeVar = new kze(c);
                        Object k = k(kyxVar, i, j, kzeVar);
                        Object obj2 = kyq.m;
                        if (k == obj2) {
                            kzeVar.D(kyxVar, i);
                        } else {
                            Object obj3 = kyq.o;
                            if (k == obj3) {
                                if (j < c()) {
                                    kyxVar.o();
                                }
                                kyx kyxVar3 = (kyx) this.d.a;
                                while (true) {
                                    if (x()) {
                                        c.ca(new kyw(new kyu(l())));
                                        break;
                                    }
                                    long b = this.b.b();
                                    long j2 = kyq.b;
                                    long j3 = b / j2;
                                    int i4 = (int) (b % j2);
                                    if (kyxVar3.b != j3) {
                                        kyx o = o(j3, kyxVar3);
                                        if (o != null) {
                                            kyxVar2 = o;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        kyxVar2 = kyxVar3;
                                    }
                                    Object k2 = k(kyxVar2, i4, b, kzeVar);
                                    kyx kyxVar4 = kyxVar2;
                                    if (k2 == obj2) {
                                        kzeVar.D(kyxVar4, i4);
                                        break;
                                    }
                                    if (k2 == obj3) {
                                        if (b < c()) {
                                            kyxVar4.o();
                                        }
                                        kyxVar3 = kyxVar4;
                                    } else {
                                        if (k2 == kyq.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kyxVar4.o();
                                        kywVar = new kyw(k2);
                                    }
                                }
                            } else {
                                kyxVar.o();
                                kywVar = new kyw(k);
                            }
                            c.k(kywVar);
                        }
                        obj = c.l();
                        if (obj == kqpVar) {
                            return kqpVar;
                        }
                    } catch (Throwable th) {
                        c.A();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                }
                return ((kyw) obj).b;
            }
        }
        kynVar = new kyn(this, kqjVar);
        Object obj4 = kynVar.a;
        kqp kqpVar2 = kqp.a;
        i2 = kynVar.c;
        if (i2 != 0) {
        }
        return ((kyw) obj4).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e A[RETURN] */
    @Override // defpackage.kzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Object obj, kqj kqjVar) {
        kow kowVar;
        Object l;
        kqp kqpVar;
        kuk kukVar = this.c;
        kyx kyxVar = (kyx) kukVar.a;
        while (true) {
            kuj kujVar = this.a;
            long b = kujVar.b();
            long j = b & 1152921504606846975L;
            boolean w = w(b, false);
            long j2 = kyq.b;
            long j3 = j / j2;
            int i = (int) (j % j2);
            if (kyxVar.b != j3) {
                kyx p = p(j3, kyxVar);
                if (p != null) {
                    kyxVar = p;
                } else if (w) {
                    Object K = K(kqjVar);
                    if (K == kqp.a) {
                        return K;
                    }
                }
            }
            int a = a(kyxVar, i, obj, j, null, w);
            if (a == 0) {
                kyxVar.o();
                break;
            }
            if (a == 1) {
                break;
            }
            if (a != 2) {
                if (a == 3) {
                    kuw c = ixg.c(ixe.d(kqjVar));
                    try {
                        int a2 = a(kyxVar, i, obj, j, c, false);
                        if (a2 == 0) {
                            kyxVar.o();
                            kowVar = kow.a;
                        } else if (a2 != 1) {
                            if (a2 != 2) {
                                if (a2 != 4) {
                                    String str = "unexpected";
                                    if (a2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    kyxVar.o();
                                    kyx kyxVar2 = (kyx) kukVar.a;
                                    while (true) {
                                        long b2 = kujVar.b();
                                        long j4 = b2 & 1152921504606846975L;
                                        boolean w2 = w(b2, false);
                                        long j5 = j4 / j2;
                                        kuj kujVar2 = kujVar;
                                        int i2 = (int) (j4 % j2);
                                        if (kyxVar2.b != j5) {
                                            kyx p2 = p(j5, kyxVar2);
                                            if (p2 != null) {
                                                kyxVar2 = p2;
                                            } else {
                                                if (w2) {
                                                    break;
                                                }
                                                kujVar = kujVar2;
                                            }
                                        }
                                        String str2 = str;
                                        int a3 = a(kyxVar2, i2, obj, j4, c, w2);
                                        if (a3 == 0) {
                                            kyxVar2.o();
                                            kowVar = kow.a;
                                            break;
                                        }
                                        if (a3 == 1) {
                                            kowVar = kow.a;
                                            break;
                                        }
                                        if (a3 != 2) {
                                            if (a3 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (a3 != 4) {
                                                kyxVar2.o();
                                                str = str2;
                                                kujVar = kujVar2;
                                            } else if (j4 < b()) {
                                                kyxVar2.o();
                                            }
                                        } else if (w2) {
                                            kyxVar2.r();
                                        } else {
                                            M(c, kyxVar2, i2);
                                        }
                                    }
                                } else if (j < b()) {
                                    kyxVar.o();
                                }
                                L(c);
                            } else {
                                M(c, kyxVar, i);
                            }
                            l = c.l();
                            kqpVar = kqp.a;
                            if (l == kqpVar) {
                                kqjVar.getClass();
                            }
                            if (l != kqpVar) {
                                l = kow.a;
                            }
                            if (l == kqpVar) {
                                return l;
                            }
                        } else {
                            kowVar = kow.a;
                        }
                        c.ca(kowVar);
                        l = c.l();
                        kqpVar = kqp.a;
                        if (l == kqpVar) {
                        }
                        if (l != kqpVar) {
                        }
                        if (l == kqpVar) {
                        }
                    } catch (Throwable th) {
                        c.A();
                        throw th;
                    }
                } else if (a != 4) {
                    kyxVar.o();
                } else {
                    if (j < b()) {
                        kyxVar.o();
                    }
                    Object K2 = K(kqjVar);
                    if (K2 == kqp.a) {
                        return K2;
                    }
                }
            } else if (w) {
                kyxVar.r();
                Object K3 = K(kqjVar);
                if (K3 == kqp.a) {
                    return K3;
                }
            } else {
                boolean z = kvo.a;
            }
        }
        return kow.a;
    }

    @Override // defpackage.kzf
    public final Object i() {
        kyx kyxVar;
        kuj kujVar = this.b;
        long j = kujVar.b;
        long j2 = this.a.b;
        if (w(j2, true)) {
            return new kyu(l());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return kyw.a;
        }
        kuk kukVar = this.d;
        ldb ldbVar = kyq.k;
        kyx kyxVar2 = (kyx) kukVar.a;
        while (!this.x()) {
            long b = kujVar.b();
            long j3 = kyq.b;
            long j4 = b / j3;
            int i = (int) (b % j3);
            if (kyxVar2.b != j4) {
                kyx o = this.o(j4, kyxVar2);
                if (o != null) {
                    kyxVar = o;
                } else {
                    continue;
                }
            } else {
                kyxVar = kyxVar2;
            }
            kyo kyoVar = this;
            Object k = kyoVar.k(kyxVar, i, b, ldbVar);
            kyxVar2 = kyxVar;
            if (k == kyq.m) {
                kyoVar.t(b);
                kyxVar2.r();
                return kyw.a;
            }
            if (k != kyq.o) {
                if (k == kyq.n) {
                    throw new IllegalStateException("unexpected");
                }
                kyxVar2.o();
                return k;
            }
            if (b < kyoVar.c()) {
                kyxVar2.o();
            }
            this = kyoVar;
        }
        return new kyu(this.l());
    }

    @Override // defpackage.kzg
    public Object j(Object obj) {
        kyo kyoVar = this;
        kuj kujVar = kyoVar.a;
        long j = kujVar.b;
        if (!kyoVar.w(j, false) && !kyoVar.I(j & 1152921504606846975L)) {
            return kyw.a;
        }
        kuk kukVar = kyoVar.c;
        ldb ldbVar = kyq.j;
        kyx kyxVar = (kyx) kukVar.a;
        while (true) {
            long b = kujVar.b();
            long j2 = b & 1152921504606846975L;
            boolean w = kyoVar.w(b, false);
            long j3 = kyq.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (kyxVar.b != j4) {
                kyx p = kyoVar.p(j4, kyxVar);
                if (p != null) {
                    kyxVar = p;
                } else if (w) {
                    return new kyu(kyoVar.n());
                }
            }
            int a = kyoVar.a(kyxVar, i, obj, j2, ldbVar, w);
            if (a == 0) {
                kyxVar.o();
                return kow.a;
            }
            if (a == 1) {
                return kow.a;
            }
            if (a == 2) {
                if (w) {
                    kyxVar.r();
                    return new kyu(n());
                }
                kyxVar.r();
                return kyw.a;
            }
            if (a == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (a == 4) {
                if (j2 < b()) {
                    kyxVar.o();
                }
                return new kyu(n());
            }
            kyxVar.o();
            kyoVar = this;
        }
    }

    public final Object k(kyx kyxVar, int i, long j, Object obj) {
        Object d = kyxVar.d(i);
        if (d == null) {
            if (j >= (this.a.b & 1152921504606846975L)) {
                if (obj == null) {
                    return kyq.n;
                }
                if (kyxVar.j(i, null, obj)) {
                    E();
                    return kyq.m;
                }
            }
        } else if (d == kyq.d && kyxVar.j(i, d, kyq.i)) {
            E();
            return kyxVar.e(i);
        }
        while (true) {
            Object d2 = kyxVar.d(i);
            if (d2 == null || d2 == kyq.e) {
                if (j < (this.a.b & 1152921504606846975L)) {
                    if (kyxVar.j(i, d2, kyq.h)) {
                        E();
                        return kyq.o;
                    }
                } else {
                    if (obj == null) {
                        return kyq.n;
                    }
                    if (kyxVar.j(i, d2, obj)) {
                        E();
                        return kyq.m;
                    }
                }
            } else if (d2 != kyq.d) {
                ldb ldbVar = kyq.j;
                if (d2 == ldbVar) {
                    return kyq.o;
                }
                if (d2 == kyq.h) {
                    return kyq.o;
                }
                if (d2 == kyq.l) {
                    E();
                    return kyq.o;
                }
                if (d2 != kyq.g && kyxVar.j(i, d2, kyq.f)) {
                    boolean z = d2 instanceof kzh;
                    if (z) {
                        d2 = ((kzh) d2).a;
                    }
                    if (N(d2)) {
                        kyxVar.i(i, kyq.i);
                        E();
                        return kyxVar.e(i);
                    }
                    kyxVar.i(i, ldbVar);
                    kyxVar.g(i, false);
                    if (z) {
                        E();
                    }
                    return kyq.o;
                }
            } else if (kyxVar.j(i, d2, kyq.i)) {
                E();
                return kyxVar.e(i);
            }
        }
    }

    protected final Throwable l() {
        return (Throwable) this.i.a;
    }

    public final Throwable m() {
        Throwable l = l();
        return l == null ? new kyy() : l;
    }

    protected final Throwable n() {
        Throwable l = l();
        return l == null ? new kyz() : l;
    }

    public final kyx o(long j, kyx kyxVar) {
        Object a;
        long j2;
        long j3;
        kyx kyxVar2 = kyq.a;
        kyp kypVar = kyp.a;
        loop0: while (true) {
            a = lbw.a(kyxVar, j, kypVar);
            if (!lcz.a(a)) {
                lbx b = lcz.b(a);
                while (true) {
                    kuk kukVar = this.d;
                    lbx lbxVar = (lbx) kukVar.a;
                    if (lbxVar.b >= b.b) {
                        break loop0;
                    }
                    if (!b.u()) {
                        break;
                    }
                    if (kukVar.d(lbxVar, b)) {
                        if (lbxVar.s()) {
                            lbxVar.p();
                        }
                    } else if (b.s()) {
                        b.p();
                    }
                }
            } else {
                break;
            }
        }
        if (lcz.a(a)) {
            y();
            if (kyxVar.b * kyq.b >= c()) {
                return null;
            }
            kyxVar.o();
            return null;
        }
        kyx kyxVar3 = (kyx) lcz.b(a);
        if (!J() && j <= C() / kyq.b) {
            kuk kukVar2 = this.h;
            while (true) {
                lbx lbxVar2 = (lbx) kukVar2.a;
                if (lbxVar2.b >= kyxVar3.b || !kyxVar3.u()) {
                    break;
                }
                if (kukVar2.d(lbxVar2, kyxVar3)) {
                    if (lbxVar2.s()) {
                        lbxVar2.p();
                    }
                } else if (kyxVar3.s()) {
                    kyxVar3.p();
                }
            }
        }
        long j4 = kyxVar3.b;
        if (j4 <= j) {
            boolean z = kvo.a;
            return kyxVar3;
        }
        long j5 = kyq.b;
        kuj kujVar = this.b;
        do {
            j2 = j4 * j5;
            j3 = kujVar.b;
            if (j3 >= j2) {
                break;
            }
        } while (!kujVar.c(j3, j2));
        if (j2 >= c()) {
            return null;
        }
        kyxVar3.o();
        return null;
    }

    public final kyx p(long j, kyx kyxVar) {
        Object a;
        long j2;
        long j3;
        long j4;
        kyx kyxVar2 = kyq.a;
        kyp kypVar = kyp.a;
        loop0: while (true) {
            a = lbw.a(kyxVar, j, kypVar);
            if (!lcz.a(a)) {
                lbx b = lcz.b(a);
                while (true) {
                    kuk kukVar = this.c;
                    lbx lbxVar = (lbx) kukVar.a;
                    if (lbxVar.b >= b.b) {
                        break loop0;
                    }
                    if (!b.u()) {
                        break;
                    }
                    if (kukVar.d(lbxVar, b)) {
                        if (lbxVar.s()) {
                            lbxVar.p();
                        }
                    } else if (b.s()) {
                        b.p();
                    }
                }
            } else {
                break;
            }
        }
        if (lcz.a(a)) {
            y();
            if (kyxVar.b * kyq.b >= b()) {
                return null;
            }
            kyxVar.o();
            return null;
        }
        kyx kyxVar3 = (kyx) lcz.b(a);
        long j5 = kyxVar3.b;
        if (j5 <= j) {
            boolean z = kvo.a;
            return kyxVar3;
        }
        long j6 = kyq.b;
        kuj kujVar = this.a;
        do {
            j2 = j5 * j6;
            j3 = kujVar.b;
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                break;
            }
        } while (!kujVar.c(j3, kyq.a(j4, (int) (j3 >> 60))));
        if (j2 >= b()) {
            return null;
        }
        kyxVar3.o();
        return null;
    }

    protected final void q(long j) {
        kyx kyxVar;
        boolean z = kvo.a;
        kyx kyxVar2 = (kyx) this.d.a;
        while (true) {
            kuj kujVar = this.b;
            int i = this.e;
            long j2 = kujVar.b;
            if (j < Math.max(i + j2, this.C())) {
                return;
            }
            if (kujVar.c(j2, 1 + j2)) {
                long j3 = kyq.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (kyxVar2.b != j4) {
                    kyx o = this.o(j4, kyxVar2);
                    if (o != null) {
                        kyxVar = o;
                    }
                } else {
                    kyxVar = kyxVar2;
                }
                kyo kyoVar = this;
                if (kyoVar.k(kyxVar, i2, j2, null) != kyq.o) {
                    kyxVar.o();
                } else if (j2 < kyoVar.c()) {
                    kyxVar.o();
                }
                this = kyoVar;
                kyxVar2 = kyxVar;
            }
            this = this;
        }
    }

    @Override // defpackage.kzg
    public final void r(krt krtVar) {
        ldb ldbVar;
        kuk kukVar = this.j;
        if (kukVar.d(null, krtVar)) {
            return;
        }
        do {
            Object obj = kukVar.a;
            ldbVar = kyq.q;
            if (obj != ldbVar) {
                if (obj == kyq.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!kukVar.d(ldbVar, kyq.r));
        krtVar.a(l());
    }

    @Override // defpackage.kzf
    public final void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        v(cancellationException, true);
    }

    public final void t(long j) {
        long j2;
        long j3;
        if (J()) {
            return;
        }
        while (C() <= j) {
        }
        int i = kyq.c;
        for (int i2 = 0; i2 < i; i2++) {
            long C = C();
            if (C == (4611686018427387903L & this.g.b) && C == C()) {
                return;
            }
        }
        kuj kujVar = this.g;
        do {
            j2 = kujVar.b;
        } while (!kujVar.c(j2, (j2 & 4611686018427387903L) + 4611686018427387904L));
        while (true) {
            long C2 = C();
            long j4 = kujVar.b;
            long j5 = j4 & 4611686018427387903L;
            long j6 = j4 & 4611686018427387904L;
            if (C2 == j5 && C2 == C()) {
                break;
            } else if (j6 == 0) {
                kujVar.c(j4, j5 + 4611686018427387904L);
            }
        }
        do {
            j3 = kujVar.b;
        } while (!kujVar.c(j3, j3 & 4611686018427387903L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x019d, code lost:
    
        r3 = (defpackage.kyx) r3.m();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = (int) (this.a.b >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.e + ",");
        sb.append("data=[");
        List D = ixc.D(new kyx[]{(kyx) this.d.a, (kyx) this.c.a, (kyx) this.h.a});
        ArrayList arrayList = new ArrayList();
        for (Object obj : D) {
            if (((kyx) obj) != kyq.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((kyx) next).b;
            do {
                Object next2 = it.next();
                long j2 = ((kyx) next2).b;
                if (j > j2) {
                    j = j2;
                }
                if (j > j2) {
                    next = next2;
                }
            } while (it.hasNext());
        }
        kyx kyxVar = (kyx) next;
        long b = b();
        long c = c();
        loop2: do {
            int i2 = kyq.b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                long j3 = (kyxVar.b * i2) + i3;
                if (j3 >= c && j3 >= b) {
                    break loop2;
                }
                Object d = kyxVar.d(i3);
                Object c2 = kyxVar.c(i3);
                if (d instanceof kuv) {
                    str = (c > j3 || j3 >= b) ? (b > j3 || j3 >= c) ? "cont" : "send" : "receive";
                } else if (d instanceof ldu) {
                    str = (c > j3 || j3 >= b) ? (b > j3 || j3 >= c) ? "select" : "onSend" : "onReceive";
                } else if (d instanceof kze) {
                    str = "receiveCatching";
                } else if (d instanceof kyl) {
                    str = "sendBroadcast";
                } else if (d instanceof kzh) {
                    str = a.ab(d, "EB(", ")");
                } else if (ksp.b(d, kyq.f) || ksp.b(d, kyq.g)) {
                    str = "resuming_sender";
                } else {
                    if (d != null && !ksp.b(d, kyq.e) && !ksp.b(d, kyq.i) && !ksp.b(d, kyq.h) && !ksp.b(d, kyq.k) && !ksp.b(d, kyq.j) && !ksp.b(d, kyq.l)) {
                        str = d.toString();
                    }
                    i3++;
                }
                if (c2 != null) {
                    sb.append("(" + str + "," + c2 + "),");
                } else {
                    sb.append(String.valueOf(str).concat(","));
                }
                i3++;
            }
        } while (kyxVar != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(ksp.h(sb)) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.kzg
    public final boolean u(Throwable th) {
        return v(th, false);
    }

    protected final boolean v(Throwable th, boolean z) {
        long j;
        long a;
        Object obj;
        long j2;
        long j3;
        if (z) {
            kuj kujVar = this.a;
            do {
                j3 = kujVar.b;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!kujVar.c(j3, kyq.a(j3 & 1152921504606846975L, 1)));
        }
        boolean d = this.i.d(kyq.s, th);
        kuj kujVar2 = this.a;
        if (z) {
            do {
                j2 = kujVar2.b;
            } while (!kujVar2.c(j2, kyq.a(j2 & 1152921504606846975L, 3)));
        } else {
            do {
                j = kujVar2.b;
                int i = (int) (j >> 60);
                if (i == 0) {
                    a = kyq.a(j & 1152921504606846975L, 2);
                } else {
                    if (i != 1) {
                        break;
                    }
                    a = kyq.a(j & 1152921504606846975L, 3);
                }
            } while (!kujVar2.c(j, a));
        }
        y();
        if (d) {
            kuk kukVar = this.j;
            do {
                obj = kukVar.a;
            } while (!kukVar.d(obj, obj == null ? kyq.q : kyq.r));
            if (obj != null) {
                ksy.b(obj, 1);
                ((krt) obj).a(l());
                return true;
            }
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0107, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x009e, code lost:
    
        r12 = (defpackage.kyx) r12.n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException(a.Y(i, "unexpected close status: "));
            }
            kyx D = D(j & 1152921504606846975L);
            Object obj = null;
            loop0: do {
                int i2 = kyq.b;
                int i3 = i2 - 1;
                while (true) {
                    if (i3 < 0) {
                        break;
                    }
                    long j2 = D.b * i2;
                    while (true) {
                        Object d = D.d(i3);
                        if (d == kyq.i) {
                            break loop0;
                        }
                        long j3 = i3 + j2;
                        if (d != kyq.d) {
                            if (d != kyq.e && d != null) {
                                if (!(d instanceof kyc) && !(d instanceof kzh)) {
                                    ldb ldbVar = kyq.g;
                                    if (d == ldbVar || d == kyq.f) {
                                        break loop0;
                                    }
                                    if (d != ldbVar) {
                                        break;
                                    }
                                } else {
                                    if (j3 < b()) {
                                        break loop0;
                                    }
                                    kyc kycVar = d instanceof kzh ? ((kzh) d).a : (kyc) d;
                                    if (D.j(i3, d, kyq.l)) {
                                        obj = lcm.a(obj, kycVar);
                                        D.h(i3, null);
                                        D.r();
                                        break;
                                    }
                                }
                            } else if (D.j(i3, d, kyq.l)) {
                                D.r();
                                break;
                            }
                        } else {
                            if (j3 < b()) {
                                break loop0;
                            }
                            if (D.j(i3, d, kyq.l)) {
                                D.h(i3, null);
                                D.r();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (D != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        H((kyc) arrayList.get(size), false);
                    }
                } else {
                    H((kyc) obj, false);
                }
            }
            return true;
        }
        D(j & 1152921504606846975L);
        if (!z) {
            return true;
        }
        while (true) {
            kuk kukVar = this.d;
            kyx kyxVar = (kyx) kukVar.a;
            long b = b();
            if (c() <= b) {
                break;
            }
            long j4 = kyq.b;
            long j5 = b / j4;
            if (kyxVar.b == j5 || (kyxVar = o(j5, kyxVar)) != null) {
                kyxVar.o();
                int i4 = (int) (b % j4);
                while (true) {
                    Object d2 = kyxVar.d(i4);
                    if (d2 == null || d2 == kyq.e) {
                        if (kyxVar.j(i4, d2, kyq.h)) {
                            E();
                            break;
                        }
                    } else {
                        if (d2 == kyq.d) {
                            return false;
                        }
                        if (d2 != kyq.j && d2 != kyq.l && d2 != kyq.i && d2 != kyq.h) {
                            if (d2 == kyq.g) {
                                return false;
                            }
                            if (d2 != kyq.f && b == b()) {
                                return false;
                            }
                        }
                    }
                }
                this.b.c(b, 1 + b);
            } else if (((kyx) kukVar.a).b < j5) {
                break;
            }
        }
    }

    public final boolean x() {
        return w(this.a.b, true);
    }

    @Override // defpackage.kzg
    public final boolean y() {
        return w(this.a.b, false);
    }

    protected boolean z() {
        return false;
    }
}
