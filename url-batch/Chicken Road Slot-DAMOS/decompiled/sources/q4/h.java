package q4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.z0;
import c2.w1;
import c4.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import je.a0;
import je.b0;
import je.l0;
import je.w;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.j0;
import kotlin.collections.o0;
import kotlin.collections.s;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import n4.f0;
import n4.h0;
import n4.i0;
import n4.k;
import n4.l;
import n4.r;
import n4.u;
import n4.x;
import o4.n;
import o4.q;
import s.s0;
import wd.c0;
import wd.g0;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final x f7994a;

    /* renamed from: b, reason: collision with root package name */
    public final n4.j f7995b;

    /* renamed from: c, reason: collision with root package name */
    public u f7996c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f7997d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle[] f7998e;

    /* renamed from: f, reason: collision with root package name */
    public final s f7999f = new s();
    public final l0 g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f8000h;

    /* renamed from: i, reason: collision with root package name */
    public final w f8001i;
    public final LinkedHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f8002k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f8003l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8004m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.lifecycle.u f8005n;

    /* renamed from: o, reason: collision with root package name */
    public l f8006o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f8007p;

    /* renamed from: q, reason: collision with root package name */
    public p f8008q;

    /* renamed from: r, reason: collision with root package name */
    public final h5.a f8009r;

    /* renamed from: s, reason: collision with root package name */
    public final i0 f8010s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f8011t;

    /* renamed from: u, reason: collision with root package name */
    public Function1 f8012u;

    /* renamed from: v, reason: collision with root package name */
    public d f8013v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f8014w;

    /* renamed from: x, reason: collision with root package name */
    public int f8015x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f8016y;

    /* renamed from: z, reason: collision with root package name */
    public final a0 f8017z;

    public h(x xVar, n4.j jVar) {
        this.f7994a = xVar;
        this.f7995b = jVar;
        j0 j0Var = j0.f5574d;
        this.g = b0.b(j0Var);
        l0 b10 = b0.b(j0Var);
        this.f8000h = b10;
        this.f8001i = b0.e(b10);
        this.j = new LinkedHashMap();
        this.f8002k = new LinkedHashMap();
        this.f8003l = new LinkedHashMap();
        this.f8004m = new LinkedHashMap();
        this.f8007p = new ArrayList();
        this.f8008q = p.f708e;
        this.f8009r = new h5.a(2, this);
        this.f8010s = new i0();
        this.f8011t = new LinkedHashMap();
        this.f8014w = new LinkedHashMap();
        this.f8016y = new ArrayList();
        this.f8017z = b0.a(1, 0, ie.a.f4713e);
    }

    public static n4.s e(int i3, n4.s sVar, n4.s sVar2, boolean z10) {
        if (sVar.f7115e.f1694a == i3 && (sVar2 == null || (sVar.equals(sVar2) && Intrinsics.a(sVar.f7116i, sVar2.f7116i)))) {
            return sVar;
        }
        u uVar = sVar instanceof u ? (u) sVar : null;
        if (uVar == null) {
            uVar = sVar.f7116i;
            uVar.getClass();
        }
        return uVar.f7125t.r(i3, uVar, sVar2, z10);
    }

    public static /* synthetic */ void p(h hVar, n4.h hVar2) {
        hVar.o(hVar2, false, new s());
    }

    public final void a(n4.s sVar, Bundle bundle, n4.h hVar, List list) {
        Object obj;
        Object obj2;
        o oVar = this.f7994a.f7131c;
        n4.s sVar2 = hVar.f7063e;
        boolean z10 = sVar2 instanceof n;
        s sVar3 = this.f7999f;
        if (!z10) {
            while (!sVar3.isEmpty() && (((n4.h) sVar3.last()).f7063e instanceof n) && n(((n4.h) sVar3.last()).f7063e.f7115e.f1694a, true, false)) {
            }
        }
        s sVar4 = new s();
        Object obj3 = null;
        if (sVar instanceof u) {
            n4.s sVar5 = sVar2;
            do {
                sVar5.getClass();
                sVar5 = sVar5.f7116i;
                if (sVar5 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (Intrinsics.a(((n4.h) obj2).f7063e, sVar5)) {
                                break;
                            }
                        }
                    }
                    n4.h hVar2 = (n4.h) obj2;
                    if (hVar2 == null) {
                        hVar2 = k5.c.h(oVar, sVar5, bundle, j(), this.f8006o);
                    }
                    sVar4.addFirst(hVar2);
                    if (!sVar3.isEmpty() && ((n4.h) sVar3.last()).f7063e == sVar5) {
                        p(this, (n4.h) sVar3.last());
                    }
                }
                if (sVar5 == null) {
                    break;
                }
            } while (sVar5 != sVar);
        }
        n4.s sVar6 = sVar4.isEmpty() ? sVar2 : ((n4.h) sVar4.first()).f7063e;
        while (sVar6 != null && d(sVar6.f7115e.f1694a, sVar6) != sVar6) {
            sVar6 = sVar6.f7116i;
            if (sVar6 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (Intrinsics.a(((n4.h) obj).f7063e, sVar6)) {
                            break;
                        }
                    }
                }
                n4.h hVar3 = (n4.h) obj;
                if (hVar3 == null) {
                    hVar3 = k5.c.h(oVar, sVar6, sVar6.b(bundle2), j(), this.f8006o);
                }
                sVar4.addFirst(hVar3);
            }
        }
        if (!sVar4.isEmpty()) {
            sVar2 = ((n4.h) sVar4.first()).f7063e;
        }
        while (!sVar3.isEmpty() && (((n4.h) sVar3.last()).f7063e instanceof u)) {
            n4.s sVar7 = ((n4.h) sVar3.last()).f7063e;
            sVar7.getClass();
            if (((s0) ((u) sVar7).f7125t.f3829c).c(sVar2.f7115e.f1694a) != null) {
                break;
            } else {
                p(this, (n4.h) sVar3.last());
            }
        }
        n4.h hVar4 = (n4.h) sVar3.g();
        if (hVar4 == null) {
            hVar4 = (n4.h) sVar4.g();
        }
        if (!Intrinsics.a(hVar4 != null ? hVar4.f7063e : null, this.f7996c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                n4.s sVar8 = ((n4.h) previous).f7063e;
                u uVar = this.f7996c;
                uVar.getClass();
                if (Intrinsics.a(sVar8, uVar)) {
                    obj3 = previous;
                    break;
                }
            }
            n4.h hVar5 = (n4.h) obj3;
            if (hVar5 == null) {
                u uVar2 = this.f7996c;
                uVar2.getClass();
                u uVar3 = this.f7996c;
                uVar3.getClass();
                hVar5 = k5.c.h(oVar, uVar2, uVar3.b(bundle), j(), this.f8006o);
            }
            sVar4.addFirst(hVar5);
        }
        Iterator it = sVar4.iterator();
        while (it.hasNext()) {
            n4.h hVar6 = (n4.h) it.next();
            Object obj4 = this.f8011t.get(this.f8010s.b(hVar6.f7063e.f7114d));
            if (obj4 == null) {
                throw new IllegalStateException(v4.a.o(new StringBuilder("NavigatorBackStack for "), sVar.f7114d, " should already be created").toString());
            }
            ((k) obj4).a(hVar6);
        }
        sVar3.addAll(sVar4);
        sVar3.addLast(hVar);
        ArrayList F = CollectionsKt.F(sVar4, hVar);
        int size = F.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj5 = F.get(i3);
            i3++;
            n4.h hVar7 = (n4.h) obj5;
            u uVar4 = hVar7.f7063e.f7116i;
            if (uVar4 != null) {
                l(hVar7, g(uVar4.f7115e.f1694a));
            }
        }
    }

    public final boolean b() {
        s sVar;
        while (true) {
            sVar = this.f7999f;
            if (sVar.isEmpty() || !(((n4.h) sVar.last()).f7063e instanceof u)) {
                break;
            }
            p(this, (n4.h) sVar.last());
        }
        n4.h hVar = (n4.h) sVar.i();
        ArrayList arrayList = this.f8016y;
        if (hVar != null) {
            arrayList.add(hVar);
        }
        this.f8015x++;
        t();
        int i3 = this.f8015x - 1;
        this.f8015x = i3;
        if (i3 == 0) {
            ArrayList R = CollectionsKt.R(arrayList);
            arrayList.clear();
            int size = R.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = R.get(i10);
                i10++;
                n4.h hVar2 = (n4.h) obj;
                Iterator it = CollectionsKt.Q(this.f8007p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        kotlin.collections.i0.j();
                        return false;
                    }
                    n4.s sVar2 = hVar2.f7063e;
                    hVar2.f7069v.a();
                    throw null;
                }
                this.f8017z.q(hVar2);
            }
            ArrayList arrayList2 = new ArrayList(sVar);
            l0 l0Var = this.g;
            l0Var.getClass();
            l0Var.k(null, arrayList2);
            ArrayList q3 = q();
            l0 l0Var2 = this.f8000h;
            l0Var2.getClass();
            l0Var2.k(null, q3);
        }
        return hVar != null;
    }

    public final boolean c(ArrayList arrayList, n4.s sVar, boolean z10, boolean z11) {
        h hVar;
        boolean z12;
        z zVar = new z();
        s sVar2 = new s();
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                hVar = this;
                z12 = z11;
                break;
            }
            int i10 = i3 + 1;
            h0 h0Var = (h0) arrayList.get(i3);
            z zVar2 = new z();
            n4.h hVar2 = (n4.h) this.f7999f.last();
            hVar = this;
            z12 = z11;
            d dVar = new d(zVar2, zVar, hVar, z12, sVar2);
            h0Var.getClass();
            hVar2.getClass();
            hVar.f8013v = dVar;
            h0Var.e(hVar2, z12);
            hVar.f8013v = null;
            if (!zVar2.f10164d) {
                break;
            }
            z11 = z12;
            i3 = i10;
        }
        if (z12) {
            LinkedHashMap linkedHashMap = hVar.f8003l;
            if (!z10) {
                Sequence c10 = de.k.c(sVar, new m2.u(28));
                final int i11 = 0;
                Function1 function1 = new Function1(this) { // from class: q4.e

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ h f7987e;

                    {
                        this.f7987e = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        n4.s sVar3 = (n4.s) obj;
                        switch (i11) {
                            case 0:
                                sVar3.getClass();
                                containsKey = this.f7987e.f8003l.containsKey(Integer.valueOf(sVar3.f7115e.f1694a));
                                break;
                            default:
                                sVar3.getClass();
                                containsKey = this.f7987e.f8003l.containsKey(Integer.valueOf(sVar3.f7115e.f1694a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                };
                c10.getClass();
                de.c cVar = new de.c(new de.o(c10, function1, 0));
                while (cVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((n4.s) cVar.next()).f7115e.f1694a);
                    n4.i iVar = (n4.i) sVar2.g();
                    linkedHashMap.put(valueOf, iVar != null ? (String) iVar.f7072a.f10660e : null);
                }
            }
            if (!sVar2.isEmpty()) {
                y6.l lVar = ((n4.i) sVar2.first()).f7072a;
                Sequence c11 = de.k.c(d(lVar.f10659d, null), new m2.u(29));
                final int i12 = 1;
                Function1 function12 = new Function1(this) { // from class: q4.e

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ h f7987e;

                    {
                        this.f7987e = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        n4.s sVar3 = (n4.s) obj;
                        switch (i12) {
                            case 0:
                                sVar3.getClass();
                                containsKey = this.f7987e.f8003l.containsKey(Integer.valueOf(sVar3.f7115e.f1694a));
                                break;
                            default:
                                sVar3.getClass();
                                containsKey = this.f7987e.f8003l.containsKey(Integer.valueOf(sVar3.f7115e.f1694a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                };
                c11.getClass();
                de.c cVar2 = new de.c(new de.o(c11, function12, 0));
                while (cVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((n4.s) cVar2.next()).f7115e.f1694a), (String) lVar.f10660e);
                }
                if (linkedHashMap.values().contains((String) lVar.f10660e)) {
                    hVar.f8004m.put((String) lVar.f10660e, sVar2);
                }
            }
        }
        hVar.f7995b.invoke();
        return zVar.f10164d;
    }

    public final n4.s d(int i3, n4.s sVar) {
        n4.s sVar2;
        u uVar = this.f7996c;
        if (uVar == null) {
            return null;
        }
        if (uVar.f7115e.f1694a == i3) {
            if (sVar == null) {
                return uVar;
            }
            if (Intrinsics.a(uVar, sVar) && sVar.f7116i == null) {
                return this.f7996c;
            }
        }
        n4.h hVar = (n4.h) this.f7999f.i();
        if (hVar == null || (sVar2 = hVar.f7063e) == null) {
            sVar2 = this.f7996c;
            sVar2.getClass();
        }
        return e(i3, sVar2, sVar, false);
    }

    public final String f(Object obj) {
        obj.getClass();
        int b10 = r4.d.b(cf.c.G(c0.a(obj.getClass())));
        u uVar = this.f7996c;
        if (uVar == null) {
            kotlin.collections.i0.l("You must call setGraph() before calling getGraph()");
            return null;
        }
        n4.s e2 = e(b10, uVar, null, true);
        if (e2 == null) {
            kotlin.collections.i0.h("Destination with route ", c0.a(obj.getClass()).c(), " cannot be found in navigation graph ", this.f7996c);
            return null;
        }
        Map c10 = e2.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(c10.size()));
        for (Map.Entry entry : c10.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((n4.g) entry.getValue()).f7058a);
        }
        return r4.d.c(obj, linkedHashMap);
    }

    public final n4.h g(int i3) {
        Object obj;
        s sVar = this.f7999f;
        ListIterator<E> listIterator = sVar.listIterator(sVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((n4.h) obj).f7063e.f7115e.f1694a == i3) {
                break;
            }
        }
        n4.h hVar = (n4.h) obj;
        if (hVar != null) {
            return hVar;
        }
        StringBuilder i10 = n0.l.i(i3, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        i10.append(i());
        throw new IllegalArgumentException(i10.toString().toString());
    }

    public final n4.h h() {
        return (n4.h) this.f7999f.i();
    }

    public final n4.s i() {
        n4.h h10 = h();
        if (h10 != null) {
            return h10.f7063e;
        }
        return null;
    }

    public final p j() {
        return this.f8005n == null ? p.f709i : this.f8008q;
    }

    public final u k() {
        n4.s sVar;
        n4.h hVar = (n4.h) this.f7999f.i();
        if (hVar == null || (sVar = hVar.f7063e) == null) {
            sVar = this.f7996c;
            sVar.getClass();
        }
        u uVar = sVar instanceof u ? (u) sVar : null;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = sVar.f7116i;
        uVar2.getClass();
        return uVar2;
    }

    public final void l(n4.h hVar, n4.h hVar2) {
        this.j.put(hVar, hVar2);
        LinkedHashMap linkedHashMap = this.f8002k;
        if (linkedHashMap.get(hVar2) == null) {
            linkedHashMap.put(hVar2, new a());
        }
        Object obj = linkedHashMap.get(hVar2);
        obj.getClass();
        ((a) obj).f7968a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x032c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x032d, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0227, code lost:
    
        if (r27.f7115e.f1694a == r0.f7115e.f1694a) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0214, code lost:
    
        if (r11.equals(r0) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0229, code lost:
    
        r0 = new kotlin.collections.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0234, code lost:
    
        if (kotlin.collections.y.e(r26.f7999f) < r5) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0236, code lost:
    
        r9 = (n4.h) kotlin.collections.d0.n(r26.f7999f);
        s(r9);
        r16 = new n4.h(r9.f7062d, r9.f7063e, r9.f7063e.b(r28), r9.f7065r, r9.f7066s, r9.f7067t, r9.f7068u);
        r10 = r16.f7069v;
        r11 = r9.f7065r;
        r10.getClass();
        r11.getClass();
        r10.f7973d = r11;
        r10 = r16.f7069v;
        r9 = r9.f7069v.f7978k;
        r10.getClass();
        r9.getClass();
        r10.f7978k = r9;
        r10.b();
        r0.addFirst(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028b, code lost:
    
        r5 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0293, code lost:
    
        if (r5.hasNext() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0295, code lost:
    
        r8 = (n4.h) r5.next();
        r9 = r8.f7063e.f7116i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x029f, code lost:
    
        if (r9 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02a1, code lost:
    
        l(r8, g(r9.f7115e.f1694a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ac, code lost:
    
        r26.f7999f.addLast(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02b2, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02ba, code lost:
    
        if (r0.hasNext() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02bc, code lost:
    
        r5 = (n4.h) r0.next();
        r8 = r26.f8010s.b(r5.f7063e.f7114d);
        r9 = r5.f7063e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02ce, code lost:
    
        if (r9 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d1, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02d2, code lost:
    
        if (r9 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02d5, code lost:
    
        c6.f.S(new m2.u(18));
        r8.c(r9);
        r8 = r8.b();
        r9 = r8.f7077a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e8, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e9, code lost:
    
        r10 = kotlin.collections.CollectionsKt.R((java.util.Collection) r8.f7081e.f5239d.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0303, code lost:
    
        if (r11.hasPrevious() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0313, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(((n4.h) r11.previous()).f7067t, r5.f7067t) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0315, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x031d, code lost:
    
        r10.set(r11, r5);
        r5 = r8.f7078b;
        r5.getClass();
        r5.k(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0329, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x031c, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x031a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0113 A[LOOP:8: B:118:0x0053->B:127:0x0113, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0119 A[EDGE_INSN: B:128:0x0119->B:129:0x0119 BREAK  A[LOOP:8: B:118:0x0053->B:127:0x0113], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0376 A[LOOP:1: B:22:0x0370->B:24:0x0376, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(n4.s sVar, Bundle bundle, n4.a0 a0Var) {
        boolean z10;
        boolean z11;
        ListIterator listIterator;
        int i3;
        Iterator it;
        boolean n10;
        Object obj;
        ListIterator listIterator2;
        Bundle bundle2;
        Object obj2;
        boolean z12;
        sVar.getClass();
        Iterator it2 = this.f8011t.values().iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).f7080d = true;
        }
        z zVar = new z();
        if (a0Var != null) {
            Object obj3 = a0Var.f7029h;
            if (obj3 != null) {
                boolean z13 = a0Var.f7026d;
                boolean z14 = a0Var.f7027e;
                String f3 = f(obj3);
                f3.getClass();
                s sVar2 = this.f7999f;
                if (!sVar2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator3 = sVar2.listIterator(sVar2.b());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator3.previous();
                        n4.h hVar = (n4.h) obj;
                        n4.s sVar3 = hVar.f7063e;
                        Bundle a9 = hVar.f7069v.a();
                        sVar3.getClass();
                        w1 w1Var = sVar3.f7115e;
                        w1Var.getClass();
                        if (!Intrinsics.a((String) w1Var.f1698e, f3)) {
                            r c10 = w1Var.c(f3);
                            if (((n4.s) w1Var.f1695b).equals(c10 != null ? c10.f7108d : null)) {
                                Bundle bundle3 = c10.f7109e;
                                if (a9 != null && bundle3 != null) {
                                    Set<String> keySet = bundle3.keySet();
                                    keySet.getClass();
                                    for (String str : keySet) {
                                        str.getClass();
                                        if (a9.containsKey(str)) {
                                            listIterator2 = listIterator3;
                                            n4.g gVar = (n4.g) c10.f7108d.c().get(str);
                                            f0 f0Var = gVar != null ? gVar.f7058a : null;
                                            if (f0Var != null) {
                                                bundle2 = bundle3;
                                                obj2 = f0Var.a(str, bundle3);
                                            } else {
                                                bundle2 = bundle3;
                                                obj2 = null;
                                            }
                                            Object a10 = f0Var != null ? f0Var.a(str, a9) : null;
                                            if (f0Var != null && !f0Var.g(obj2, a10)) {
                                                z12 = false;
                                                break;
                                            } else {
                                                listIterator3 = listIterator2;
                                                bundle3 = bundle2;
                                            }
                                        }
                                    }
                                }
                            }
                            listIterator2 = listIterator3;
                            z12 = false;
                            if (!z13 || !z12) {
                                arrayList.add(this.f8010s.b(hVar.f7063e.f7114d));
                            }
                            if (!z12) {
                                break;
                            } else {
                                listIterator3 = listIterator2;
                            }
                        }
                        listIterator2 = listIterator3;
                        z12 = true;
                        if (!z13) {
                        }
                        arrayList.add(this.f8010s.b(hVar.f7063e.f7114d));
                        if (!z12) {
                        }
                    }
                    n4.h hVar2 = (n4.h) obj;
                    n4.s sVar4 = hVar2 != null ? hVar2.f7063e : null;
                    if (sVar4 == null) {
                        Log.i("NavController", "Ignoring popBackStack to route " + f3 + " as it was not found on the current back stack");
                    } else {
                        n10 = c(arrayList, sVar4, z13, z14);
                    }
                }
                n10 = false;
            } else {
                int i10 = a0Var.f7025c;
                if (i10 != -1) {
                    n10 = n(i10, a0Var.f7026d, a0Var.f7027e);
                }
            }
            z10 = n10;
            Bundle b10 = sVar.b(bundle);
            if (a0Var == null && a0Var.f7024b && this.f8003l.containsKey(Integer.valueOf(sVar.f7115e.f1694a))) {
                zVar.f10164d = r(sVar.f7115e.f1694a, b10, a0Var);
                z11 = false;
            } else {
                if (a0Var != null && a0Var.f7023a) {
                    n4.h h10 = h();
                    s sVar5 = this.f7999f;
                    listIterator = sVar5.listIterator(sVar5.b());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            if (((n4.h) listIterator.previous()).f7063e == sVar) {
                                i3 = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1) {
                        if (sVar instanceof u) {
                            int i11 = u.f7124u;
                            Sequence c11 = de.k.c((u) sVar, new m2.u(17));
                            f fVar = new f(1);
                            c11.getClass();
                            List d10 = de.n.d(new de.o(c11, fVar, 1));
                            if (this.f7999f.f5583i - i3 == d10.size()) {
                                s sVar6 = this.f7999f;
                                List subList = sVar6.subList(i3, sVar6.f5583i);
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.z.j(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(Integer.valueOf(((n4.h) it3.next()).f7063e.f7115e.f1694a));
                                }
                            }
                        } else if (h10 != null) {
                            n4.s sVar7 = h10.f7063e;
                            if (sVar7 != null) {
                            }
                        }
                        if (!z11) {
                            n4.h h11 = k5.c.h(this.f7994a.f7131c, sVar, b10, j(), this.f8006o);
                            h0 b11 = this.f8010s.b(sVar.f7114d);
                            List c12 = kotlin.collections.x.c(h11);
                            q qVar = new q(zVar, this, sVar, b10, 2);
                            c12.getClass();
                            this.f8012u = qVar;
                            b11.d(c12, a0Var);
                            this.f8012u = null;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                }
            }
            this.f7995b.invoke();
            it = this.f8011t.values().iterator();
            while (it.hasNext()) {
                ((k) it.next()).f7080d = false;
            }
            if (z10 && !zVar.f10164d && !z11) {
                t();
                return;
            }
            b();
        }
        z10 = false;
        Bundle b102 = sVar.b(bundle);
        if (a0Var == null) {
        }
        if (a0Var != null) {
            n4.h h102 = h();
            s sVar52 = this.f7999f;
            listIterator = sVar52.listIterator(sVar52.b());
            while (true) {
                if (!listIterator.hasPrevious()) {
                }
            }
            if (i3 != -1) {
            }
        }
        z11 = false;
        if (!z11) {
        }
        this.f7995b.invoke();
        it = this.f8011t.values().iterator();
        while (it.hasNext()) {
        }
        if (z10) {
        }
        b();
    }

    public final boolean n(int i3, boolean z10, boolean z11) {
        n4.s sVar;
        s sVar2 = this.f7999f;
        if (sVar2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.J(sVar2).iterator();
        while (true) {
            if (!it.hasNext()) {
                sVar = null;
                break;
            }
            sVar = ((n4.h) it.next()).f7063e;
            String str = sVar.f7114d;
            w1 w1Var = sVar.f7115e;
            h0 b10 = this.f8010s.b(str);
            if (z10 || w1Var.f1694a != i3) {
                arrayList.add(b10);
            }
            if (w1Var.f1694a == i3) {
                break;
            }
        }
        if (sVar != null) {
            return c(arrayList, sVar, z10, z11);
        }
        int i10 = n4.s.f7113s;
        Log.i("NavController", "Ignoring popBackStack to destination " + a.a.x(this.f7994a.f7131c, i3) + " as it was not found on the current back stack");
        return false;
    }

    public final void o(n4.h hVar, boolean z10, s sVar) {
        l lVar;
        w wVar;
        Set set;
        hVar.getClass();
        s sVar2 = this.f7999f;
        n4.h hVar2 = (n4.h) sVar2.last();
        if (!Intrinsics.a(hVar2, hVar)) {
            StringBuilder sb2 = new StringBuilder("Attempted to pop ");
            sb2.append(hVar.f7063e);
            n4.s sVar3 = hVar2.f7063e;
            sb2.append(", which is not the top of the back stack (");
            sb2.append(sVar3);
            sb2.append(')');
            throw new IllegalStateException(sb2.toString().toString());
        }
        d0.n(sVar2);
        n4.s sVar4 = hVar2.f7063e;
        c cVar = hVar2.f7069v;
        k kVar = (k) this.f8011t.get(this.f8010s.b(sVar4.f7114d));
        boolean z11 = true;
        if ((kVar == null || (wVar = kVar.f7082f) == null || (set = (Set) wVar.f5239d.getValue()) == null || !set.contains(hVar2)) && !this.f8002k.containsKey(hVar2)) {
            z11 = false;
        }
        p pVar = cVar.j.f737c;
        p pVar2 = p.f709i;
        if (pVar.compareTo(pVar2) >= 0) {
            if (z10) {
                cVar.f7978k = pVar2;
                cVar.b();
                sVar.addFirst(new n4.i(hVar2));
            }
            if (z11) {
                cVar.f7978k = pVar2;
                cVar.b();
            } else {
                cVar.f7978k = p.f707d;
                cVar.b();
                s(hVar2);
            }
        }
        if (z10 || z11 || (lVar = this.f8006o) == null) {
            return;
        }
        String str = hVar2.f7067t;
        str.getClass();
        z0 z0Var = (z0) lVar.f7084b.remove(str);
        if (z0Var != null) {
            z0Var.a();
        }
    }

    public final ArrayList q() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8011t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((k) it.next()).f7082f.f5239d.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                n4.h hVar = (n4.h) obj;
                if (!arrayList.contains(hVar) && hVar.f7069v.f7978k.compareTo(p.f710r) < 0) {
                    arrayList2.add(obj);
                }
            }
            d0.l(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f7999f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            n4.h hVar2 = (n4.h) next;
            if (!arrayList.contains(hVar2) && hVar2.f7069v.f7978k.compareTo(p.f710r) >= 0) {
                arrayList3.add(next);
            }
        }
        d0.l(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            if (!(((n4.h) obj2).f7063e instanceof u)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean r(int i3, final Bundle bundle, n4.a0 a0Var) {
        n4.s sVar;
        n4.h hVar;
        n4.s sVar2;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i3);
        LinkedHashMap linkedHashMap = this.f8003l;
        int i10 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i3));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a((String) it.next(), str)) {
                it.remove();
            }
        }
        s sVar3 = (s) g0.b(this.f8004m).remove(str);
        o oVar = this.f7994a.f7131c;
        ArrayList arrayList = new ArrayList();
        n4.h hVar2 = (n4.h) this.f7999f.i();
        if ((hVar2 == null || (sVar = hVar2.f7063e) == null) && (sVar = this.f7996c) == null) {
            kotlin.collections.i0.l("You must call setGraph() before calling getGraph()");
            return false;
        }
        if (sVar3 != null) {
            Iterator it2 = sVar3.iterator();
            while (it2.hasNext()) {
                n4.i iVar = (n4.i) it2.next();
                y6.l lVar = iVar.f7072a;
                y6.l lVar2 = iVar.f7072a;
                n4.s e2 = e(lVar.f10659d, sVar, null, true);
                if (e2 == null) {
                    int i11 = n4.s.f7113s;
                    kotlin.collections.i0.m("Restore State failed: destination ", a.a.x(oVar, lVar2.f10659d), " cannot be found from the current destination ", sVar);
                    return false;
                }
                p j = j();
                l lVar3 = this.f8006o;
                oVar.getClass();
                j.getClass();
                Bundle bundle3 = (Bundle) lVar2.f10661i;
                if (bundle3 != null) {
                    Context context = oVar.f1772d;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) lVar2.f10660e;
                Bundle bundle4 = (Bundle) lVar2.f10662r;
                str2.getClass();
                arrayList.add(new n4.h(oVar, e2, bundle2, j, lVar3, str2, bundle4));
                sVar = e2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (!(((n4.h) obj).f7063e instanceof u)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            n4.h hVar3 = (n4.h) obj2;
            List list = (List) CollectionsKt.D(arrayList2);
            if (Intrinsics.a((list == null || (hVar = (n4.h) CollectionsKt.C(list)) == null || (sVar2 = hVar.f7063e) == null) ? null : sVar2.f7114d, hVar3.f7063e.f7114d)) {
                list.add(hVar3);
            } else {
                arrayList2.add(y.g(hVar3));
            }
        }
        final z zVar = new z();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            List list2 = (List) obj3;
            h0 b10 = this.f8010s.b(((n4.h) CollectionsKt.x(list2)).f7063e.f7114d);
            final wd.a0 a0Var2 = new wd.a0();
            final ArrayList arrayList4 = arrayList;
            this.f8012u = new Function1() { // from class: q4.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    List list3;
                    n4.h hVar4 = (n4.h) obj4;
                    hVar4.getClass();
                    z.this.f10164d = true;
                    ArrayList arrayList5 = arrayList4;
                    int indexOf = arrayList5.indexOf(hVar4);
                    if (indexOf != -1) {
                        wd.a0 a0Var3 = a0Var2;
                        int i14 = indexOf + 1;
                        list3 = arrayList5.subList(a0Var3.f10139d, i14);
                        a0Var3.f10139d = i14;
                    } else {
                        list3 = j0.f5574d;
                    }
                    this.a(hVar4.f7063e, bundle, hVar4, list3);
                    return Unit.f5554a;
                }
            };
            b10.d(list2, a0Var);
            this.f8012u = null;
            arrayList = arrayList4;
        }
        return zVar.f10164d;
    }

    public final void s(n4.h hVar) {
        hVar.getClass();
        n4.h hVar2 = (n4.h) this.j.remove(hVar);
        if (hVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f8002k;
        a aVar = (a) linkedHashMap.get(hVar2);
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.f7968a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            k kVar = (k) this.f8011t.get(this.f8010s.b(hVar2.f7063e.f7114d));
            if (kVar != null) {
                kVar.c(hVar2);
            }
            linkedHashMap.remove(hVar2);
        }
    }

    public final void t() {
        a aVar;
        w wVar;
        Set set;
        ArrayList R = CollectionsKt.R(this.f7999f);
        if (R.isEmpty()) {
            return;
        }
        ArrayList g = y.g(((n4.h) CollectionsKt.C(R)).f7063e);
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.C(g) instanceof n) {
            Iterator it = CollectionsKt.J(R).iterator();
            while (it.hasNext()) {
                n4.s sVar = ((n4.h) it.next()).f7063e;
                arrayList.add(sVar);
                if (!(sVar instanceof n) && !(sVar instanceof u)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (n4.h hVar : CollectionsKt.J(R)) {
            c cVar = hVar.f7069v;
            p pVar = cVar.f7978k;
            n4.s sVar2 = hVar.f7063e;
            n4.s sVar3 = (n4.s) CollectionsKt.firstOrNull(g);
            if (sVar3 != null && sVar3.f7115e.f1694a == sVar2.f7115e.f1694a) {
                p pVar2 = p.f711s;
                if (pVar != pVar2) {
                    k kVar = (k) this.f8011t.get(this.f8010s.b(hVar.f7063e.f7114d));
                    if (Intrinsics.a((kVar == null || (wVar = kVar.f7082f) == null || (set = (Set) wVar.f5239d.getValue()) == null) ? null : Boolean.valueOf(set.contains(hVar)), Boolean.TRUE) || ((aVar = (a) this.f8002k.get(hVar)) != null && aVar.f7968a.get() == 0)) {
                        hashMap.put(hVar, p.f710r);
                    } else {
                        hashMap.put(hVar, pVar2);
                    }
                }
                n4.s sVar4 = (n4.s) CollectionsKt.firstOrNull(arrayList);
                if (sVar4 != null && sVar4.f7115e.f1694a == sVar2.f7115e.f1694a) {
                    d0.m(arrayList);
                }
                d0.m(g);
                u uVar = sVar2.f7116i;
                if (uVar != null) {
                    g.add(uVar);
                }
            } else if (arrayList.isEmpty() || sVar2.f7115e.f1694a != ((n4.s) CollectionsKt.x(arrayList)).f7115e.f1694a) {
                p pVar3 = p.f709i;
                cVar.getClass();
                cVar.f7978k = pVar3;
                cVar.b();
            } else {
                n4.s sVar5 = (n4.s) d0.m(arrayList);
                if (pVar == p.f711s) {
                    p pVar4 = p.f710r;
                    cVar.getClass();
                    cVar.f7978k = pVar4;
                    cVar.b();
                } else {
                    p pVar5 = p.f710r;
                    if (pVar != pVar5) {
                        hashMap.put(hVar, pVar5);
                    }
                }
                u uVar2 = sVar5.f7116i;
                if (uVar2 != null && !arrayList.contains(uVar2)) {
                    arrayList.add(uVar2);
                }
            }
        }
        int size = R.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = R.get(i3);
            i3++;
            n4.h hVar2 = (n4.h) obj;
            p pVar6 = (p) hashMap.get(hVar2);
            if (pVar6 != null) {
                hVar2.getClass();
                c cVar2 = hVar2.f7069v;
                cVar2.getClass();
                cVar2.f7978k = pVar6;
                cVar2.b();
            } else {
                hVar2.f7069v.b();
            }
        }
    }
}
