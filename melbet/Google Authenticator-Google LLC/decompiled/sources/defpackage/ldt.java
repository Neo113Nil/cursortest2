package defpackage;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import j$.util.function.BiFunction$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ldt(ScheduledExecutorService scheduledExecutorService, iyi iyiVar, Application application) {
        this.b = hoq.v(new ewf(this, 6));
        this.d = hoq.v(new ewf(this, 7));
        this.c = hoq.v(new ewf(this, 8));
        fee d = fee.d("tiktok");
        this.a = d;
        fed fedVar = d.c;
        if (fedVar == null) {
            this.e = feg.c(iyiVar, scheduledExecutorService, d, application);
        } else {
            this.e = fedVar;
            ((feg) fedVar).f = iyiVar;
        }
    }

    public static euw j(String str, String str2, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        byte[][] bArr2 = dbl.a;
        return new euw(new dbl(str, bArr, bArr2, bArr2, bArr2, bArr2, null, null, null, null), str2);
    }

    public static final hfm l(String str, AtomicReference atomicReference) {
        if (str == null || atomicReference == null) {
            return hjb.a;
        }
        hfk hfkVar = new hfk();
        Object obj = atomicReference.get();
        if (obj instanceof euz) {
            int i = euz.b;
            ((euz) obj).b(str, hfkVar);
        } else {
            for (euz euzVar : (euz[]) obj) {
                int i2 = euz.b;
                euzVar.b(str, hfkVar);
            }
        }
        return hfkVar.g();
    }

    public static void m(cjf cjfVar, hac hacVar, gzf gzfVar) {
        String str;
        int[] iArr;
        int[] iArr2;
        byte[][] bArr;
        byte[][] bArr2;
        byte[] bArr3;
        int[] iArr3;
        ArrayList arrayList;
        int[] iArr4;
        byte[][] bArr4;
        byte[][] bArr5;
        byte[][] bArr6;
        dbl dblVar;
        byte[][] bArr7;
        int[] iArr5;
        byte[][] bArr8;
        int[] iArr6;
        ArrayList<dbl> arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        if (!cjfVar.h.isEmpty()) {
            for (euw euwVar : (Set) hacVar.bB()) {
                arrayList2.add(euwVar.a);
                hashSet.add(euwVar.b);
            }
        }
        ArrayList<String> arrayList3 = cjfVar.c;
        if (arrayList3 != null) {
            for (String str2 : arrayList3) {
                euw euwVar2 = (euw) gzfVar.a(str2);
                if (euwVar2 != null) {
                    arrayList2.add(euwVar2.a);
                    hashSet.add(str2);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.isEmpty()) {
            dblVar = dbl.b;
        } else {
            final int i = 1;
            final int i2 = 0;
            if (arrayList2.size() == 1) {
                dblVar = (dbl) arrayList2.get(0);
            } else {
                if (!arrayList2.isEmpty()) {
                    String str3 = ((dbl) arrayList2.get(0)).c;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (!dih.y(str3, ((dbl) it.next()).c)) {
                            str = "";
                            break;
                        }
                    }
                }
                str = ((dbl) arrayList2.get(0)).c;
                byte[][] a = dbl.a(arrayList2, new dbk() { // from class: dbj
                    @Override // defpackage.dbk
                    public final byte[][] a(dbl dblVar2) {
                        int i3 = i;
                        return i3 != 0 ? i3 != 1 ? i3 != 2 ? dblVar2.h : dblVar2.g : dblVar2.e : dblVar2.f;
                    }
                });
                byte[][] a2 = dbl.a(arrayList2, new dbk() { // from class: dbj
                    @Override // defpackage.dbk
                    public final byte[][] a(dbl dblVar2) {
                        int i3 = i2;
                        return i3 != 0 ? i3 != 1 ? i3 != 2 ? dblVar2.h : dblVar2.g : dblVar2.e : dblVar2.f;
                    }
                });
                final int i3 = 2;
                byte[][] a3 = dbl.a(arrayList2, new dbk() { // from class: dbj
                    @Override // defpackage.dbk
                    public final byte[][] a(dbl dblVar2) {
                        int i32 = i3;
                        return i32 != 0 ? i32 != 1 ? i32 != 2 ? dblVar2.h : dblVar2.g : dblVar2.e : dblVar2.f;
                    }
                });
                final int i4 = 3;
                byte[][] a4 = dbl.a(arrayList2, new dbk() { // from class: dbj
                    @Override // defpackage.dbk
                    public final byte[][] a(dbl dblVar2) {
                        int i32 = i4;
                        return i32 != 0 ? i32 != 1 ? i32 != 2 ? dblVar2.h : dblVar2.g : dblVar2.e : dblVar2.f;
                    }
                });
                boolean z = true;
                int i5 = 0;
                for (dbl dblVar2 : arrayList2) {
                    if (dblVar2 != null && (iArr6 = dblVar2.i) != null) {
                        i5 += iArr6.length;
                        z = false;
                    }
                }
                if (z) {
                    iArr = null;
                } else {
                    iArr = new int[i5];
                    int i6 = 0;
                    for (dbl dblVar3 : arrayList2) {
                        if (dblVar3 != null && (iArr2 = dblVar3.i) != null) {
                            int i7 = i2;
                            while (i7 < iArr2.length) {
                                iArr[i6] = iArr2[i7];
                                i7++;
                                i6++;
                            }
                        }
                        i2 = 0;
                    }
                }
                boolean z2 = true;
                int i8 = 0;
                for (dbl dblVar4 : arrayList2) {
                    if (dblVar4 != null && dblVar4.d != null) {
                        i8++;
                        z2 = false;
                    }
                    if (dblVar4 != null && (bArr8 = dblVar4.j) != null) {
                        i8 += bArr8.length;
                        z2 = false;
                    }
                }
                if (z2) {
                    bArr = null;
                } else {
                    byte[][] bArr9 = new byte[i8][];
                    int i9 = 0;
                    for (dbl dblVar5 : arrayList2) {
                        if (dblVar5 != null && (bArr3 = dblVar5.d) != null) {
                            bArr9[i9] = bArr3;
                            i9++;
                        }
                        if (dblVar5 != null && (bArr2 = dblVar5.j) != null) {
                            int i10 = 0;
                            while (i10 < bArr2.length) {
                                bArr9[i9] = bArr2[i10];
                                i10++;
                                i9++;
                            }
                        }
                    }
                    bArr = bArr9;
                }
                boolean z3 = true;
                int i11 = 0;
                for (dbl dblVar6 : arrayList2) {
                    if (dblVar6 != null && (iArr5 = dblVar6.k) != null) {
                        i11 += iArr5.length;
                        z3 = false;
                    }
                }
                if (z3) {
                    iArr3 = null;
                } else {
                    iArr3 = new int[i11];
                    int i12 = 0;
                    for (dbl dblVar7 : arrayList2) {
                        if (dblVar7 == null || (iArr4 = dblVar7.k) == null) {
                            arrayList = arrayList2;
                        } else {
                            arrayList = arrayList2;
                            int i13 = 0;
                            while (i13 < iArr4.length) {
                                iArr3[i12] = iArr4[i13];
                                i13++;
                                i12++;
                            }
                        }
                        arrayList2 = arrayList;
                    }
                }
                ArrayList<dbl> arrayList4 = arrayList2;
                boolean z4 = true;
                int i14 = 0;
                for (dbl dblVar8 : arrayList4) {
                    if (dblVar8 != null && (bArr7 = dblVar8.l) != null) {
                        i14 += bArr7.length;
                        z4 = false;
                    }
                }
                if (z4) {
                    bArr4 = null;
                } else {
                    byte[][] bArr10 = new byte[i14][];
                    int i15 = 0;
                    for (dbl dblVar9 : arrayList4) {
                        if (dblVar9 == null || (bArr6 = dblVar9.l) == null) {
                            bArr5 = bArr10;
                        } else {
                            bArr5 = bArr10;
                            for (byte[] bArr11 : bArr6) {
                                if (bArr11 != null) {
                                    bArr5[i15] = bArr11;
                                    i15++;
                                }
                            }
                        }
                        bArr10 = bArr5;
                    }
                    bArr4 = bArr10;
                }
                dblVar = new dbl(str, null, a, a2, a3, a4, iArr, bArr, iArr3, bArr4);
            }
        }
        cje cjeVar = cjfVar.a;
        if (cjeVar.c()) {
            throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (cjfVar.f == null) {
            cjfVar.f = new HashSet();
        }
        cjfVar.f.addAll(hashSet);
        if (cjeVar.c()) {
            throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (dblVar == null) {
            return;
        }
        if (cjfVar.e == null) {
            cjfVar.e = new ArrayList();
        }
        cjfVar.e.add(dblVar);
    }

    private static void u(ConcurrentMap concurrentMap, Object obj, final byte[] bArr, boolean z) {
        if (z) {
            concurrentMap.put(obj, bArr);
        } else {
            ConcurrentMap$EL.compute(concurrentMap, obj, new BiFunction() { // from class: eux
                public final /* synthetic */ BiFunction andThen(Function function) {
                    return BiFunction$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    byte[] bArr2 = (byte[]) obj3;
                    byte[] bArr3 = bArr;
                    return Arrays.equals(bArr2, bArr3) ? bArr2 : bArr3;
                }
            });
        }
    }

    private static void v(ConcurrentMap concurrentMap, Object obj, String str, byte[] bArr, boolean z) {
        Object obj2;
        euz[] euzVarArr;
        euz[] euzVarArr2;
        AtomicReference atomicReference = (AtomicReference) concurrentMap.putIfAbsent(obj, new AtomicReference(new euz(str, bArr)));
        if (atomicReference != null) {
            do {
                obj2 = atomicReference.get();
                if (obj2 instanceof euz) {
                    euz euzVar = (euz) obj2;
                    String str2 = euzVar.a;
                    if (str.equals(str2)) {
                        euzVar.a(bArr, z);
                        return;
                    } else {
                        euz euzVar2 = new euz(str, bArr);
                        euzVarArr2 = str.compareTo(str2) < 0 ? new euz[]{euzVar2, euzVar} : new euz[]{euzVar, euzVar2};
                    }
                } else {
                    euz[] euzVarArr3 = (euz[]) obj2;
                    int binarySearch = Arrays.binarySearch(euzVarArr3, str);
                    if (binarySearch >= 0) {
                        euzVarArr3[binarySearch].a(bArr, z);
                        return;
                    }
                    int i = ~binarySearch;
                    int length = euzVarArr3.length;
                    int i2 = length + 1;
                    int i3 = length - i;
                    if (i3 == 0) {
                        euzVarArr = (euz[]) Arrays.copyOf(euzVarArr3, i2);
                    } else {
                        euz[] euzVarArr4 = new euz[i2];
                        System.arraycopy(euzVarArr3, 0, euzVarArr4, 0, i);
                        System.arraycopy(euzVarArr3, i, euzVarArr4, i + 1, i3);
                        euzVarArr = euzVarArr4;
                    }
                    euzVarArr[i] = new euz(str, bArr);
                    euzVarArr2 = euzVarArr;
                }
            } while (!a.a(atomicReference, obj2, euzVarArr2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dme, java.lang.Object] */
    private final void w(View view, int i, hrd hrdVar, View.OnClickListener onClickListener) {
        this.e.b().a(view, q(i, hrdVar));
        cfe cfeVar = new cfe(5);
        ((iyh) this.d).d();
        view.setOnClickListener(new edk(this, cfeVar, view, onClickListener, 1));
    }

    public final int a() {
        return ((kui) this.c).b - ((kui) this.d).b;
    }

    public final ldp b(ldp ldpVar) {
        if (a() == 127) {
            return ldpVar;
        }
        if (ldpVar.h) {
            ((kui) this.e).c();
        }
        kui kuiVar = (kui) this.c;
        int i = 127 & kuiVar.b;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, ldpVar);
                kuiVar.c();
                return null;
            }
            Thread.yield();
        }
    }

    public final ldp c() {
        ldp ldpVar;
        while (true) {
            Object obj = this.d;
            Object obj2 = this.c;
            kui kuiVar = (kui) obj;
            int i = kuiVar.b;
            if (i - ((kui) obj2).b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (kuiVar.d(i, i + 1) && (ldpVar = (ldp) ((AtomicReferenceArray) this.a).getAndSet(i2, null)) != null) {
                if (ldpVar.h) {
                    ((kui) this.e).a();
                    boolean z = kvo.a;
                }
                return ldpVar;
            }
        }
    }

    public final ldp d(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        int i2 = i & 127;
        ldp ldpVar = (ldp) atomicReferenceArray.get(i2);
        if (ldpVar != null && ldpVar.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ldpVar, null)) {
                if (atomicReferenceArray.get(i2) != ldpVar) {
                }
            }
            if (z) {
                ((kui) this.e).a();
            }
            return ldpVar;
        }
        return null;
    }

    public final boolean e() {
        return ((Boolean) this.e).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koe] */
    public final void f(hvi hviVar, Duration duration, String str) {
        String str2;
        goh gohVar = (goh) this.c.b();
        try {
            hnu.aR(hviVar);
            Object obj = this.b;
            Object obj2 = ((ikj) obj).b;
            Object obj3 = ((ikj) obj).a;
            gohVar.b((String) obj2, (String) obj3, str, "success");
            str2 = str;
            try {
                gohVar.c(duration.toMillis(), (String) obj2, (String) obj3, str2, "success");
            } catch (CancellationException unused) {
                ikj ikjVar = (ikj) this.b;
                Object obj4 = ikjVar.a;
                String str3 = (String) ikjVar.b;
                String str4 = (String) obj4;
                gohVar.b(str3, str4, str2, "cancellation");
                gohVar.c(duration.toMillis(), str3, str4, str2, "cancellation");
            } catch (Exception unused2) {
                ikj ikjVar2 = (ikj) this.b;
                Object obj5 = ikjVar2.a;
                String str5 = (String) ikjVar2.b;
                String str6 = (String) obj5;
                gohVar.b(str5, str6, str2, "failure");
                gohVar.c(duration.toMillis(), str5, str6, str2, "failure");
            }
        } catch (CancellationException unused3) {
            str2 = str;
        } catch (Exception unused4) {
            str2 = str;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hac, java.lang.Object] */
    public final void g(String str, String str2, String str3, String str4, String str5) {
        ((fea) this.b.bB()).b(str, str2, str3, str4, str5);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hac, java.lang.Object] */
    public final void h(double d, String str, String str2, String str3, String str4, String str5) {
        ((fdx) this.d.bB()).b(d, str, str2, str3, str4, str5);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, jpt] */
    public final hvi i(String str) {
        hvi hviVar;
        htq b;
        hvi as;
        int i;
        hvi hviVar2;
        htq a;
        String d = ((kee) this.a).d(str);
        htq htqVar = (htq) ((Map) this.d.b()).get(d);
        gig gigVar = (gig) ((Map) this.b.b()).get(d);
        hvi hviVar3 = null;
        if (htqVar != null) {
            as = hoq.as(htqVar, this.c);
        } else {
            if (gigVar == null || (b = gigVar.b()) == null) {
                hviVar = null;
                i = 1;
                if (gigVar != null && (a = gigVar.a()) != null) {
                    hviVar3 = hoq.at(hoq.as(a, this.c), new gia(ghv.a, i), huf.a);
                }
                hviVar2 = hviVar3;
                if (hviVar != null && hviVar2 == null) {
                    return hve.a;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ixc.R(new hvi[]{hviVar, hviVar2}, linkedHashSet);
                return hoq.aU(linkedHashSet).t(new fca(this, d, hviVar, hviVar2, 4), huf.a);
            }
            as = hoq.as(b, this.c);
        }
        hviVar = as;
        i = 1;
        if (gigVar != null) {
            hviVar3 = hoq.at(hoq.as(a, this.c), new gia(ghv.a, i), huf.a);
        }
        hviVar2 = hviVar3;
        if (hviVar != null) {
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ixc.R(new hvi[]{hviVar, hviVar2}, linkedHashSet2);
        return hoq.aU(linkedHashSet2).t(new fca(this, d, hviVar, hviVar2, 4), huf.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void k(jjq jjqVar, Set set, String str, String str2, boolean z, boolean z2) {
        if (!set.isEmpty() && !((AtomicBoolean) this.c).getAndSet(true)) {
            cka a = cka.a();
            a.a.add(0, new bry(this, (char[]) null));
        }
        byte[] x = jjqVar.x();
        if (z) {
            u(this.e, new gzq(str2, str), x, z2);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                v(this.a, new gzq((String) it.next(), str), str2, x, z2);
            }
            return;
        }
        u(this.d, str2, x, z2);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            v(this.b, (String) it2.next(), str2, x, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, koe] */
    public final emi n(Executor executor, jpt jptVar, koe koeVar) {
        emg emgVar = (emg) this.a.b();
        emgVar.getClass();
        eiw eiwVar = (eiw) this.c.b();
        eiwVar.getClass();
        Object b = this.b.b();
        executor.getClass();
        jptVar.getClass();
        ?? r6 = this.e;
        return new emi(emgVar, this.d, eiwVar, (ldt) b, r6, executor, jptVar, koeVar);
    }

    public final void o(View view, int i, jiu jiuVar, hrd hrdVar) {
        w(view, i, hrdVar, new gxx(this, jiuVar, view, 1));
    }

    public final void p(View view, int i, jfy jfyVar) {
        w(view, i, null, new drl(this, jfyVar, 3, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dme, java.lang.Object] */
    public final bqd q(int i, hrd hrdVar) {
        this.e.c();
        bqd h = cka.h(i);
        if (hrdVar != null) {
            iwq iwqVar = efs.a;
            jkj k = eft.a.k();
            if (!k.b.M()) {
                k.t();
            }
            eft eftVar = (eft) k.b;
            eftVar.c = hrdVar;
            eftVar.b |= 1;
            h.b(new dkq(iwqVar, k.q()));
        }
        ((iyh) this.d).d();
        return h;
    }

    public final /* synthetic */ void r(Runnable runnable) {
        ((ayo) this.e).execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void s(String str, Object obj) {
        str.getClass();
        this.a.put(str, obj);
        lao laoVar = (lao) this.e.get(str);
        if (laoVar != null) {
            laoVar.d(obj);
        }
        lao laoVar2 = (lao) this.d.get(str);
        if (laoVar2 != null) {
            laoVar2.d(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void t(String str) {
        this.a.remove(str);
        this.e.remove(str);
        this.d.remove(str);
    }

    public ldt(frv frvVar, fug fugVar, bss bssVar, car carVar, hvl hvlVar) {
        this.e = frvVar;
        this.d = fugVar;
        this.b = bssVar;
        this.a = carVar;
        this.c = hvlVar;
    }

    public ldt(ikj ikjVar, Boolean bool, koe koeVar, hvl hvlVar, gnp gnpVar) {
        this.a = ikjVar;
        this.d = bool;
        this.e = koeVar;
        this.c = hvlVar;
        this.b = gnpVar;
    }

    public ldt(ikj ikjVar, Boolean bool, koe koeVar, hvl hvlVar, gnp gnpVar, byte[] bArr) {
        this.b = ikjVar;
        this.a = bool;
        this.c = koeVar;
        this.d = hvlVar;
        this.e = gnpVar;
    }

    public ldt(koe koeVar, icp icpVar, iet ietVar, iel ielVar, gpa gpaVar) {
        this.c = koeVar;
        this.b = icpVar;
        this.a = ietVar;
        this.d = ielVar;
        this.e = gpaVar;
    }

    public ldt(dme dmeVar, hrz hrzVar, iyh iyhVar, jiw jiwVar, bst bstVar) {
        dmeVar.getClass();
        this.e = dmeVar;
        this.a = hrzVar;
        this.d = iyhVar;
        this.c = jiwVar;
        this.b = bstVar;
    }

    public ldt(ikj ikjVar, gzp gzpVar, hvl hvlVar, gzp gzpVar2, gzp gzpVar3) {
        this.b = ikjVar;
        this.e = (Boolean) gzpVar.d(false);
        this.d = hvlVar;
        this.c = gzpVar2;
        this.a = gzpVar3;
    }

    public ldt(Map map) {
        this.a = new LinkedHashMap(map);
        this.c = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.b = new bn(this, 4);
    }

    public ldt() {
        this.a = new AtomicReferenceArray(128);
        kul kulVar = kul.a;
        this.b = new kuk(null, kulVar);
        this.c = new kui(0, kulVar);
        this.d = new kui(0, kulVar);
        this.e = new kui(0, kulVar);
    }

    public ldt(koe koeVar, koe koeVar2, koe koeVar3, koe koeVar4, koe koeVar5, byte[] bArr) {
        koeVar.getClass();
        this.a = koeVar;
        this.d = koeVar2;
        this.c = koeVar3;
        this.b = koeVar4;
        koeVar5.getClass();
        this.e = koeVar5;
    }

    public ldt(koe koeVar, koe koeVar2, koe koeVar3, koe koeVar4, koe koeVar5) {
        koeVar.getClass();
        this.e = koeVar;
        this.d = koeVar2;
        this.c = koeVar3;
        this.a = koeVar4;
        this.b = koeVar5;
    }

    public ldt(Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.d = new cob(this, 1);
        ayo ayoVar = new ayo(executor, 0);
        this.e = ayoVar;
        kvj b = ixh.b(ayoVar);
        this.c = b;
        ixh.b(new ayo(executor, 0));
        this.a = kvp.g(b);
    }

    public ldt(byte[] bArr) {
        this.c = new AtomicBoolean(false);
        this.e = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }

    public ldt(etp etpVar, kee keeVar, jpt jptVar, jpt jptVar2, Executor executor) {
        keeVar.getClass();
        jptVar.getClass();
        jptVar2.getClass();
        executor.getClass();
        this.e = etpVar;
        this.a = keeVar;
        this.d = jptVar;
        this.b = jptVar2;
        this.c = executor;
    }

    public ldt(dze dzeVar, FrameLayout frameLayout, edb edbVar, Button button, edb edbVar2) {
        this.e = dzeVar;
        this.a = frameLayout;
        this.d = edbVar;
        this.b = button;
        this.c = edbVar2;
    }
}
