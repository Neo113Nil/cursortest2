package lf;

import c6.e;
import com.google.android.gms.internal.measurement.se;
import com.google.firebase.messaging.v;
import ee.b;
import ee.m;
import ee.n;
import ee.o;
import ee.p;
import hf.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.s;
import kotlin.collections.t0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import u8.d;
import wd.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final hf.a f6016a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6017b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6018c;

    /* renamed from: d, reason: collision with root package name */
    public final c f6019d;

    /* renamed from: e, reason: collision with root package name */
    public final se f6020e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6021f;
    public volatile ThreadLocal g;

    public a(hf.a aVar, String str, c cVar, se seVar, int i3) {
        boolean z10 = (i3 & 4) == 0;
        cVar = (i3 & 8) != 0 ? null : cVar;
        aVar.getClass();
        this.f6016a = aVar;
        this.f6017b = str;
        this.f6018c = z10;
        this.f6019d = cVar;
        this.f6020e = seVar;
        this.f6021f = new ArrayList();
        new LinkedHashSet();
    }

    public final void a(s sVar) {
        if (!sVar.isEmpty()) {
            sVar.removeFirst();
        }
        if (sVar.isEmpty()) {
            b().remove();
        }
    }

    public final ThreadLocal b() {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2 = this.g;
        if (threadLocal2 != null) {
            return threadLocal2;
        }
        synchronized (this) {
            threadLocal = this.g;
            if (threadLocal == null) {
                threadLocal = new ThreadLocal();
                this.g = threadLocal;
            }
        }
        return threadLocal;
    }

    public final s c(gf.a aVar) {
        aVar.getClass();
        s sVar = (s) b().get();
        if (sVar == null) {
            sVar = new s();
            b().set(sVar);
        }
        sVar.addFirst(aVar);
        return sVar;
    }

    public final Object d(h hVar, gf.a aVar) {
        d dVar = (d) this.f6020e.f2798d;
        df.a aVar2 = df.a.f3728d;
        dVar.getClass();
        if (df.a.f3732s.compareTo(aVar2) > 0) {
            return f(hVar, aVar);
        }
        mf.a.a(hVar);
        dVar.getClass();
        o.f3988a.getClass();
        m.f3986a.getClass();
        p pVar = new p(f(hVar, aVar), n.a(System.nanoTime() - m.f3987b), null);
        mf.a.a(hVar);
        ee.a aVar3 = b.f3956e;
        b.f(pVar.f3990b, ee.d.MICROSECONDS);
        dVar.getClass();
        return pVar.f3989a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(v vVar) {
        String str;
        s sVar;
        gf.a aVar;
        cf.b E;
        s sVar2;
        gf.a aVar2;
        c cVar;
        e eVar = (e) this.f6020e.f2799e;
        eVar.getClass();
        gf.a aVar3 = (gf.a) vVar.f3178r;
        Object obj = null;
        Object a9 = (aVar3 == null || aVar3.f4425a.isEmpty()) ? null : ((gf.a) vVar.f3178r).a((h) vVar.f3177i);
        if (a9 == null) {
            ThreadLocal threadLocal = this.g;
            a9 = (threadLocal == null || (sVar = (s) threadLocal.get()) == null || sVar.isEmpty() || (aVar = (gf.a) sVar.g()) == null) ? null : aVar.a((h) vVar.f3177i);
            if (a9 == null) {
                se seVar = (se) eVar.f1814e;
                cf.b E2 = ((a1.n) seVar.f2801r).E((h) vVar.f3177i, null, this.f6016a);
                if (E2 == null) {
                    E2 = (this.f6018c || (cVar = this.f6019d) == null) ? null : ((a1.n) seVar.f2801r).E((h) vVar.f3177i, null, cVar);
                }
                a9 = E2 != null ? E2.b(vVar) : null;
                if (a9 == null) {
                    if (!this.f6018c) {
                        ((h) vVar.f3177i).d(null);
                    }
                    ArrayList arrayList = this.f6021f;
                    arrayList.getClass();
                    LinkedHashSet<a> linkedHashSet = new LinkedHashSet();
                    s sVar3 = new s(new t0(arrayList));
                    while (!sVar3.isEmpty()) {
                        a aVar4 = (a) sVar3.removeLast();
                        if (linkedHashSet.add(aVar4)) {
                            Iterator it = aVar4.f6021f.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                a aVar5 = (a) next;
                                if (!linkedHashSet.contains(aVar5)) {
                                    sVar3.addLast(aVar5);
                                }
                            }
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        for (a aVar6 : linkedHashSet) {
                            se seVar2 = (se) eVar.f1814e;
                            c cVar2 = aVar6.f6019d;
                            if (cVar2 == null || (E = ((a1.n) seVar2.f2801r).E((h) vVar.f3177i, null, cVar2)) == null) {
                                E = ((a1.n) seVar2.f2801r).E((h) vVar.f3177i, null, aVar6.f6016a);
                            }
                            if (E == null) {
                                ThreadLocal threadLocal2 = aVar6.g;
                                Object a10 = (threadLocal2 == null || (sVar2 = (s) threadLocal2.get()) == null || sVar2.isEmpty() || (aVar2 = (gf.a) sVar2.g()) == null) ? null : aVar2.a((h) vVar.f3177i);
                                if (a10 != null) {
                                    a9 = a10;
                                    break;
                                }
                            } else {
                                d dVar = (d) vVar.f3175d;
                                h hVar = (h) vVar.f3177i;
                                gf.a aVar7 = (gf.a) vVar.f3178r;
                                v vVar2 = new v(dVar, aVar6, hVar, aVar7);
                                s c10 = aVar7 != null ? aVar6.c(aVar7) : null;
                                a9 = E.b(vVar2);
                                if (c10 != null) {
                                    aVar6.a(c10);
                                }
                            }
                        }
                    }
                    a9 = null;
                }
                if (a9 == null) {
                    Iterator it2 = ((ArrayList) eVar.f1815i).iterator();
                    if (it2.hasNext()) {
                        throw v4.a.i(it2);
                    }
                    if (obj == null) {
                        return obj;
                    }
                    String str2 = Intrinsics.a((a) vVar.f3176e, this) ? "scope '" + this + '\'' : "scope '" + this + "' (resolution context scope: '" + ((a) vVar.f3176e) + "')";
                    ArrayList arrayList2 = this.f6021f;
                    ArrayList arrayList3 = new ArrayList(z.j(arrayList2, 10));
                    int size = arrayList2.size();
                    int i3 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        arrayList3.add(((a) obj2).f6017b);
                    }
                    if (arrayList3.isEmpty()) {
                        str = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(" Searched scopes: ['");
                        sb2.append(this.f6017b);
                        sb2.append("'] -> ");
                        ArrayList arrayList4 = new ArrayList(z.j(arrayList3, 10));
                        int size2 = arrayList3.size();
                        while (i3 < size2) {
                            Object obj3 = arrayList3.get(i3);
                            i3++;
                            arrayList4.add("['" + ((String) obj3) + "']");
                        }
                        sb2.append(arrayList4);
                        str = sb2.toString();
                    }
                    throw new bf.a("No definition found for type '" + mf.a.a((h) vVar.f3177i) + "' on " + str2 + '.' + str + ". Check or add definition for type '" + mf.a.a((h) vVar.f3177i) + "' in scope '" + this.f6016a + "'.");
                }
            }
        }
        obj = a9;
        if (obj == null) {
        }
    }

    public final Object f(h hVar, gf.a aVar) {
        d dVar = (d) this.f6020e.f2798d;
        v vVar = new v(dVar, this, hVar, aVar);
        if (aVar == null) {
            return e(vVar);
        }
        df.a aVar2 = df.a.f3728d;
        dVar.getClass();
        df.a aVar3 = df.a.f3732s;
        if (aVar3.compareTo(aVar2) <= 0) {
            aVar.toString();
        }
        s c10 = c(aVar);
        try {
            Object e2 = e(vVar);
            dVar.getClass();
            aVar3.compareTo(aVar2);
            a(c10);
            return e2;
        } catch (Throwable th) {
            dVar.getClass();
            df.a.f3732s.compareTo(df.a.f3728d);
            a(c10);
            throw th;
        }
    }

    public final String toString() {
        return v4.a.o(new StringBuilder("['"), this.f6017b, "']");
    }
}
