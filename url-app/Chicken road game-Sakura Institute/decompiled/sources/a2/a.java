package a2;

import android.graphics.RectF;
import androidx.lifecycle.r0;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.k1;
import g0.q1;
import g0.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import o.w0;
import o.x0;
import q.n0;
import r1.a1;
import r1.i1;
import s1.e1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i8, Object obj) {
        super(2);
        this.f289g = i8;
        this.f290h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, q6.f, r6.l] */
    /* JADX WARN: Type inference failed for: r2v51, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r3v14, types: [q6.e, r6.l] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.Collection] */
    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        boolean f9;
        char c4;
        long j8;
        char c6;
        long j9;
        p0.i iVar;
        ArrayList arrayList;
        CharSequence charSequence;
        int i7;
        Object obj3;
        d6.j jVar;
        Object obj4;
        char c9 = 7;
        long j10 = -9187201950435737472L;
        int i8 = 4;
        c7.f fVar = null;
        int i9 = 0;
        r15 = false;
        r15 = false;
        boolean z8 = false;
        switch (this.f289g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a0.s sVar = (a0.s) this.f290h;
                y0.d y4 = z0.l0.y((RectF) obj);
                y0.d y8 = z0.l0.y((RectF) obj2);
                switch (sVar.f134a) {
                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        f9 = y4.f(y8);
                        break;
                    default:
                        long a3 = y4.a();
                        y8.getClass();
                        if (y0.c.d(a3) < y8.f9780a || y0.c.d(a3) >= y8.f9782c || y0.c.e(a3) < y8.f9781b || y0.c.e(a3) >= y8.f9783d) {
                            f9 = false;
                            break;
                        } else {
                            f9 = true;
                            break;
                        }
                        break;
                }
                return Boolean.valueOf(f9);
            case 1:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    q.b bVar = q.j.f7292b;
                    s0.f fVar2 = s0.b.f8088p;
                    q6.f fVar3 = (q6.f) this.f290h;
                    s0.l lVar = s0.l.f8103a;
                    q.m0 a9 = q.l0.a(bVar, fVar2, pVar, 54);
                    int i10 = pVar.P;
                    k1 m8 = pVar.m();
                    s0.o c10 = s0.a.c(pVar, lVar);
                    r1.j.f7810d.getClass();
                    r1.n nVar = r1.i.f7781b;
                    pVar.U();
                    if (pVar.O) {
                        pVar.l(nVar);
                    } else {
                        pVar.d0();
                    }
                    g0.d.Q(pVar, a9, r1.i.f7784e);
                    g0.d.Q(pVar, m8, r1.i.f7783d);
                    r1.h hVar = r1.i.f7785f;
                    if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i10))) {
                        a0.m.q(i10, pVar, i10, hVar);
                    }
                    g0.d.Q(pVar, c10, r1.i.f7782c);
                    fVar3.c(n0.f7313a, pVar, 6);
                    pVar.p(true);
                }
                return d6.z.f2639a;
            case 2:
                Set set = (Set) obj;
                t1 t1Var = (t1) this.f290h;
                synchronized (t1Var.f3908b) {
                    try {
                        if (((q1) t1Var.f3924r.getValue()).compareTo(q1.f3864j) >= 0) {
                            i.b0 b0Var = t1Var.f3913g;
                            if (set instanceof i0.f) {
                                i.b0 b0Var2 = ((i0.f) set).f4853f;
                                Object[] objArr = b0Var2.f4722b;
                                long[] jArr = b0Var2.f4721a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j11 = jArr[i11];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                                            for (int i13 = i9; i13 < i12; i13++) {
                                                if ((j11 & 255) < 128) {
                                                    Object obj5 = objArr[(i11 << 3) + i13];
                                                    if (!(obj5 instanceof q0.v) || ((q0.v) obj5).c(1)) {
                                                        b0Var.a(obj5);
                                                    }
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i12 != 8) {
                                            }
                                        }
                                        if (i11 != length) {
                                            i11++;
                                            i9 = 0;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj6 : set) {
                                    if (!(obj6 instanceof q0.v) || ((q0.v) obj6).c(1)) {
                                        b0Var.a(obj6);
                                    }
                                }
                            }
                            fVar = t1Var.t();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (fVar != null) {
                    ((c7.h) fVar).resumeWith(d6.z.f2639a);
                }
                return d6.z.f2639a;
            case 3:
                Set set2 = (Set) obj;
                if (!(set2 instanceof i0.f)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj7 : set3) {
                            if ((obj7 instanceof q0.v) && !((q0.v) obj7).c(4)) {
                            }
                            ((e7.e) this.f290h).e(set2);
                        }
                    }
                    return d6.z.f2639a;
                }
                i.b0 b0Var3 = ((i0.f) set2).f4853f;
                Object[] objArr2 = b0Var3.f4722b;
                long[] jArr2 = b0Var3.f4721a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr2[i14];
                        if ((((~j12) << c9) & j12 & j10) != j10) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j12 & 255) < 128) {
                                    c6 = c9;
                                    Object obj8 = objArr2[(i14 << 3) + i16];
                                    j9 = j10;
                                    if ((obj8 instanceof q0.v) && !((q0.v) obj8).c(4)) {
                                    }
                                } else {
                                    c6 = c9;
                                    j9 = j10;
                                }
                                j12 >>= 8;
                                i16++;
                                c9 = c6;
                                j10 = j9;
                            }
                            c4 = c9;
                            j8 = j10;
                            if (i15 != 8) {
                            }
                        } else {
                            c4 = c9;
                            j8 = j10;
                        }
                        if (i14 != length2) {
                            i14++;
                            c9 = c4;
                            j10 = j8;
                        }
                    }
                }
                return d6.z.f2639a;
            case 4:
                k.w wVar = (k.w) obj;
                k.w wVar2 = (k.w) obj2;
                k.w wVar3 = k.w.f5280h;
                if (wVar == wVar3 && wVar2 == wVar3 && !((k.i0) this.f290h).f5225a.f5259c) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            case 5:
                ((Number) obj2).intValue();
                ((l.h0) this.f290h).a(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case 6:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                x0 x0Var = (x0) this.f290h;
                c7.a0.p(x0Var.o0(), null, null, new w0(x0Var, floatValue, floatValue2, null), 3);
                return Boolean.TRUE;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                p0.b bVar2 = (p0.b) obj;
                List list = (List) ((r6.l) this.f290h).d(bVar2, obj2);
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    Object obj9 = list.get(i17);
                    if (obj9 != null && (iVar = bVar2.f6987g) != null && !iVar.a(obj9)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 8:
                ((Number) obj2).intValue();
                ((p2.q) this.f290h).a(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case q.c.f7259c /* 9 */:
                ((Number) obj2).intValue();
                ((p2.v) this.f290h).a(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case q.c.f7261e /* 10 */:
                ((Number) obj2).intValue();
                q.n.a((s0.o) this.f290h, (g0.p) obj, g0.d.T(1));
                return d6.z.f2639a;
            case 11:
                return new m2.h(a8.m.c(0, ((s0.f) this.f290h).a(0, (int) (((m2.j) obj).f6321a & 4294967295L))));
            case 12:
                return new m2.h(((s0.g) this.f290h).a(0L, ((m2.j) obj).f6321a, (m2.k) obj2));
            case 13:
                Set set4 = (Set) obj;
                q0.t tVar = (q0.t) this.f290h;
                AtomicReference atomicReference = tVar.f7455b;
                while (true) {
                    Object obj10 = atomicReference.get();
                    if (obj10 == null) {
                        arrayList = set4;
                    } else if (obj10 instanceof Set) {
                        arrayList = e6.m.X(new Set[]{obj10, set4});
                    } else {
                        if (!(obj10 instanceof List)) {
                            g0.d.x("Unexpected notification");
                            throw null;
                        }
                        arrayList = e6.l.r0((Collection) obj10, t6.a.F(set4));
                    }
                    while (!atomicReference.compareAndSet(obj10, arrayList)) {
                        if (atomicReference.get() != obj10) {
                            break;
                        }
                    }
                    if (q0.t.a(tVar)) {
                        tVar.f7454a.f(new r0(24, tVar));
                    }
                    return d6.z.f2639a;
                    break;
                }
            case 14:
                z0.r rVar = (z0.r) obj;
                c1.c cVar = (c1.c) obj2;
                a1 a1Var = (a1) this.f290h;
                r1.d0 d0Var = a1Var.f7700q;
                if (d0Var.F()) {
                    i1 snapshotObserver = ((s1.r) r1.g0.a(d0Var)).getSnapshotObserver();
                    z0.n0 n0Var = a1.J;
                    snapshotObserver.a(a1Var, r1.e.f7743j, new m.h(a1Var, rVar, cVar, i8));
                    a1Var.H = false;
                } else {
                    a1Var.H = true;
                }
                return d6.z.f2639a;
            case q.c.f7263g /* 15 */:
                s0.o oVar = (s0.o) obj;
                s0.o oVar2 = (s0.m) obj2;
                g0.p pVar2 = (g0.p) this.f290h;
                if (oVar2 instanceof s0.j) {
                    ?? r02 = ((s0.j) oVar2).f8101c;
                    r6.y.d(3, r02);
                    oVar2 = s0.a.b(pVar2, (s0.o) r02.c(s0.l.f8103a, pVar2, 0));
                }
                return oVar.j(oVar2);
            case 16:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar3.x()) {
                    pVar3.L();
                } else {
                    ((s1.a) this.f290h).a(0, pVar3);
                }
                return d6.z.f2639a;
            case 17:
                ((Number) obj2).intValue();
                ((e1) this.f290h).a(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case 18:
                ((Number) obj2).intValue();
                t6.a.c((u3.p) this.f290h, (g0.p) obj, g0.d.T(1));
                return d6.z.f2639a;
            case 19:
                ((Number) obj2).intValue();
                w.g0.e((a0.x0) this.f290h, (g0.p) obj, g0.d.T(1));
                return d6.z.f2639a;
            case 20:
                ((w.n0) this.f290h).e(((y0.c) obj2).f9778a);
                return d6.z.f2639a;
            case 21:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                r6.k.f(charSequence2, "$this$$receiver");
                int F = z6.h.F(charSequence2, (char[]) this.f290h, intValue, false);
                if (F < 0) {
                    return null;
                }
                return new d6.j(Integer.valueOf(F), 1);
            default:
                CharSequence charSequence3 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                r6.k.f(charSequence3, "$this$$receiver");
                List list2 = (List) this.f290h;
                if (list2.size() == 1) {
                    int size2 = list2.size();
                    if (size2 == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size2 != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list2.get(0);
                    int E = z6.h.E(charSequence3, str, intValue2, 4);
                    if (E >= 0) {
                        jVar = new d6.j(Integer.valueOf(E), str);
                    }
                    jVar = null;
                } else {
                    int i18 = intValue2 >= 0 ? intValue2 : 0;
                    w6.d dVar = new w6.d(i18, charSequence3.length(), 1);
                    int i19 = dVar.f9523h;
                    int i20 = dVar.f9522g;
                    if (charSequence3 instanceof String) {
                        if ((i19 > 0 && i18 <= i20) || (i19 < 0 && i20 <= i18)) {
                            int i21 = i18;
                            while (true) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (z6.o.r(str2, 0, (String) charSequence3, i21, str2.length(), false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    jVar = new d6.j(Integer.valueOf(i21), str3);
                                } else if (i21 != i20) {
                                    i21 += i19;
                                }
                            }
                        }
                        jVar = null;
                    } else {
                        if ((i19 > 0 && i18 <= i20) || (i19 < 0 && i20 <= i18)) {
                            int i22 = i18;
                            while (true) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        charSequence = charSequence3;
                                        i7 = i22;
                                        if (!z6.h.M(str4, 0, charSequence, i22, str4.length(), false)) {
                                            i22 = i7;
                                            charSequence3 = charSequence;
                                        }
                                    } else {
                                        charSequence = charSequence3;
                                        i7 = i22;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    jVar = new d6.j(Integer.valueOf(i7), str5);
                                } else if (i7 != i20) {
                                    i22 = i7 + i19;
                                    charSequence3 = charSequence;
                                }
                            }
                        }
                        jVar = null;
                    }
                }
                if (jVar != null) {
                    return new d6.j(jVar.f2618f, Integer.valueOf(((String) jVar.f2619g).length()));
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Object obj) {
        super(2);
        this.f289g = i7;
        this.f290h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(q6.e eVar) {
        super(2);
        this.f289g = 7;
        this.f290h = (r6.l) eVar;
    }
}
