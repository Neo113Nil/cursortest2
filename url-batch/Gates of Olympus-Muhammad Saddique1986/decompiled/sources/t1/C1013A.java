package t1;

import F.C0129x0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.InterfaceC0292v;
import androidx.lifecycle.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0616a;
import m2.C0655e;
import s2.EnumC0967a;
import t2.AbstractC1035F;
import t2.C1030A;
import t2.C1034E;
import t2.C1045P;
import t2.C1073z;

/* renamed from: t1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013A {

    /* renamed from: A, reason: collision with root package name */
    public int f8804A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f8805B;
    public final C1034E C;
    public final C1073z D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8806a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f8807b;

    /* renamed from: c, reason: collision with root package name */
    public x f8808c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f8809d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f8810e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8811f;

    /* renamed from: g, reason: collision with root package name */
    public final S1.j f8812g;

    /* renamed from: h, reason: collision with root package name */
    public final C1045P f8813h;

    /* renamed from: i, reason: collision with root package name */
    public final C1045P f8814i;

    /* renamed from: j, reason: collision with root package name */
    public final C1030A f8815j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f8816k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f8817l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8818m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f8819n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0292v f8820o;

    /* renamed from: p, reason: collision with root package name */
    public n f8821p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f8822q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0286o f8823r;

    /* renamed from: s, reason: collision with root package name */
    public final j f8824s;

    /* renamed from: t, reason: collision with root package name */
    public final L1.p f8825t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8826u;

    /* renamed from: v, reason: collision with root package name */
    public final C1020H f8827v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f8828w;

    /* renamed from: x, reason: collision with root package name */
    public f2.k f8829x;

    /* renamed from: y, reason: collision with root package name */
    public C0129x0 f8830y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f8831z;

    public C1013A(Context context) {
        Object obj;
        f2.j.f(context, "context");
        this.f8806a = context;
        Iterator it = m2.h.T(context, C1022b.f8857g).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f8807b = (Activity) obj;
        this.f8812g = new S1.j();
        S1.u uVar = S1.u.f4320d;
        this.f8813h = AbstractC1035F.c(uVar);
        C1045P c2 = AbstractC1035F.c(uVar);
        this.f8814i = c2;
        this.f8815j = new C1030A(c2);
        this.f8816k = new LinkedHashMap();
        this.f8817l = new LinkedHashMap();
        this.f8818m = new LinkedHashMap();
        this.f8819n = new LinkedHashMap();
        this.f8822q = new CopyOnWriteArrayList();
        this.f8823r = EnumC0286o.f5227e;
        this.f8824s = new j(0, this);
        this.f8825t = new L1.p(this);
        this.f8826u = true;
        C1020H c1020h = new C1020H();
        this.f8827v = c1020h;
        this.f8828w = new LinkedHashMap();
        this.f8831z = new LinkedHashMap();
        c1020h.a(new z(c1020h));
        c1020h.a(new C1023c(this.f8806a));
        this.f8805B = new ArrayList();
        R1.a.d(new t0.D(5, this));
        C1034E b3 = AbstractC1035F.b(1, 0, EnumC0967a.f8360e, 2);
        this.C = b3;
        this.D = new C1073z(b3);
    }

    public static u d(u uVar, int i3, boolean z3) {
        x xVar;
        if (uVar.f8936i == i3) {
            return uVar;
        }
        if (uVar instanceof x) {
            xVar = (x) uVar;
        } else {
            xVar = uVar.f8932e;
            f2.j.c(xVar);
        }
        return xVar.j(i3, xVar, z3);
    }

    public static /* synthetic */ void m(C1013A c1013a, C1028h c1028h) {
        c1013a.l(c1028h, false, new S1.j());
    }

    public final void a(u uVar, Bundle bundle, C1028h c1028h, List list) {
        Object obj;
        Object obj2;
        u uVar2 = c1028h.f8874e;
        boolean z3 = uVar2 instanceof InterfaceC1024d;
        S1.j jVar = this.f8812g;
        if (!z3) {
            while (!jVar.isEmpty() && (((C1028h) jVar.last()).f8874e instanceof InterfaceC1024d) && k(((C1028h) jVar.last()).f8874e.f8936i, true, false)) {
            }
        }
        S1.j jVar2 = new S1.j();
        boolean z4 = uVar instanceof x;
        Context context = this.f8806a;
        Object obj3 = null;
        if (z4) {
            u uVar3 = uVar2;
            do {
                f2.j.c(uVar3);
                uVar3 = uVar3.f8932e;
                if (uVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (f2.j.a(((C1028h) obj2).f8874e, uVar3)) {
                                break;
                            }
                        }
                    }
                    C1028h c1028h2 = (C1028h) obj2;
                    if (c1028h2 == null) {
                        c1028h2 = m1.w.a(context, uVar3, bundle, g(), this.f8821p);
                    }
                    jVar2.addFirst(c1028h2);
                    if (!jVar.isEmpty() && ((C1028h) jVar.last()).f8874e == uVar3) {
                        m(this, (C1028h) jVar.last());
                    }
                }
                if (uVar3 == null) {
                    break;
                }
            } while (uVar3 != uVar);
        }
        u uVar4 = jVar2.isEmpty() ? uVar2 : ((C1028h) jVar2.first()).f8874e;
        while (uVar4 != null && c(uVar4.f8936i) != uVar4) {
            uVar4 = uVar4.f8932e;
            if (uVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (f2.j.a(((C1028h) obj).f8874e, uVar4)) {
                            break;
                        }
                    }
                }
                C1028h c1028h3 = (C1028h) obj;
                if (c1028h3 == null) {
                    c1028h3 = m1.w.a(context, uVar4, uVar4.b(bundle2), g(), this.f8821p);
                }
                jVar2.addFirst(c1028h3);
            }
        }
        if (!jVar2.isEmpty()) {
            uVar2 = ((C1028h) jVar2.first()).f8874e;
        }
        while (!jVar.isEmpty() && (((C1028h) jVar.last()).f8874e instanceof x)) {
            u uVar5 = ((C1028h) jVar.last()).f8874e;
            f2.j.d(uVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((x) uVar5).f8948m.b(uVar2.f8936i) != null) {
                break;
            } else {
                m(this, (C1028h) jVar.last());
            }
        }
        C1028h c1028h4 = (C1028h) (jVar.isEmpty() ? null : jVar.f4315e[jVar.f4314d]);
        if (c1028h4 == null) {
            c1028h4 = (C1028h) (jVar2.isEmpty() ? null : jVar2.f4315e[jVar2.f4314d]);
        }
        if (!f2.j.a(c1028h4 != null ? c1028h4.f8874e : null, this.f8808c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                u uVar6 = ((C1028h) previous).f8874e;
                x xVar = this.f8808c;
                f2.j.c(xVar);
                if (f2.j.a(uVar6, xVar)) {
                    obj3 = previous;
                    break;
                }
            }
            C1028h c1028h5 = (C1028h) obj3;
            if (c1028h5 == null) {
                x xVar2 = this.f8808c;
                f2.j.c(xVar2);
                x xVar3 = this.f8808c;
                f2.j.c(xVar3);
                c1028h5 = m1.w.a(context, xVar2, xVar3.b(bundle), g(), this.f8821p);
            }
            jVar2.addFirst(c1028h5);
        }
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            C1028h c1028h6 = (C1028h) it.next();
            Object obj4 = this.f8828w.get(this.f8827v.b(c1028h6.f8874e.f8931d));
            if (obj4 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + uVar.f8931d + " should already be created").toString());
            }
            ((k) obj4).a(c1028h6);
        }
        jVar.addAll(jVar2);
        jVar.addLast(c1028h);
        Iterator it2 = S1.l.T0(jVar2, c1028h).iterator();
        while (it2.hasNext()) {
            C1028h c1028h7 = (C1028h) it2.next();
            x xVar4 = c1028h7.f8874e.f8932e;
            if (xVar4 != null) {
                i(c1028h7, e(xVar4.f8936i));
            }
        }
    }

    public final boolean b() {
        S1.j jVar;
        while (true) {
            jVar = this.f8812g;
            if (jVar.isEmpty() || !(((C1028h) jVar.last()).f8874e instanceof x)) {
                break;
            }
            m(this, (C1028h) jVar.last());
        }
        C1028h c1028h = (C1028h) jVar.k();
        ArrayList arrayList = this.f8805B;
        if (c1028h != null) {
            arrayList.add(c1028h);
        }
        this.f8804A++;
        q();
        int i3 = this.f8804A - 1;
        this.f8804A = i3;
        if (i3 == 0) {
            ArrayList b12 = S1.l.b1(arrayList);
            arrayList.clear();
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                C1028h c1028h2 = (C1028h) it.next();
                Iterator it2 = this.f8822q.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    u uVar = c1028h2.f8874e;
                    c1028h2.g();
                    throw null;
                }
                this.C.c(c1028h2);
            }
            ArrayList b13 = S1.l.b1(jVar);
            C1045P c1045p = this.f8813h;
            c1045p.getClass();
            c1045p.l(null, b13);
            ArrayList n3 = n();
            C1045P c1045p2 = this.f8814i;
            c1045p2.getClass();
            c1045p2.l(null, n3);
        }
        return c1028h != null;
    }

    public final u c(int i3) {
        u uVar;
        x xVar = this.f8808c;
        if (xVar == null) {
            return null;
        }
        if (xVar.f8936i == i3) {
            return xVar;
        }
        C1028h c1028h = (C1028h) this.f8812g.k();
        if (c1028h == null || (uVar = c1028h.f8874e) == null) {
            uVar = this.f8808c;
            f2.j.c(uVar);
        }
        return d(uVar, i3, false);
    }

    public final C1028h e(int i3) {
        Object obj;
        S1.j jVar = this.f8812g;
        ListIterator listIterator = jVar.listIterator(jVar.b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C1028h) obj).f8874e.f8936i == i3) {
                break;
            }
        }
        C1028h c1028h = (C1028h) obj;
        if (c1028h != null) {
            return c1028h;
        }
        StringBuilder k3 = A.k.k(i3, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        C1028h c1028h2 = (C1028h) jVar.k();
        k3.append(c1028h2 != null ? c1028h2.f8874e : null);
        throw new IllegalArgumentException(k3.toString().toString());
    }

    public final x f() {
        x xVar = this.f8808c;
        if (xVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        f2.j.d(xVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return xVar;
    }

    public final EnumC0286o g() {
        return this.f8820o == null ? EnumC0286o.f5228f : this.f8823r;
    }

    public final x h(S1.j jVar) {
        u uVar;
        C1028h c1028h = (C1028h) jVar.k();
        if (c1028h == null || (uVar = c1028h.f8874e) == null) {
            uVar = this.f8808c;
            f2.j.c(uVar);
        }
        if (uVar instanceof x) {
            return (x) uVar;
        }
        x xVar = uVar.f8932e;
        f2.j.c(xVar);
        return xVar;
    }

    public final void i(C1028h c1028h, C1028h c1028h2) {
        this.f8816k.put(c1028h, c1028h2);
        LinkedHashMap linkedHashMap = this.f8817l;
        if (linkedHashMap.get(c1028h2) == null) {
            linkedHashMap.put(c1028h2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c1028h2);
        f2.j.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ee, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f5, code lost:
    
        if (r28.f8936i == r3.f8936i) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        if (r15.equals(r6) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        r3 = new S1.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (S1.m.z0(r12) < r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        r6 = (t1.C1028h) S1.r.I0(r12);
        p(r6);
        r13 = new t1.C1028h(r6.f8873d, r6.f8874e, r6.f8874e.b(r29), r6.f8876g, r6.f8877h, r6.f8878i, r6.f8879j);
        r13.f8876g = r6.f8876g;
        r13.h(r6.f8883n);
        r3.addFirst(r13);
        r14 = r14;
        r8 = r8;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        r26 = r4;
        r25 = r8;
        r4 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
    
        if (r4.hasNext() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0159, code lost:
    
        r6 = (t1.C1028h) r4.next();
        r7 = r6.f8874e.f8932e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0163, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
    
        i(r6, e(r7.f8936i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r12.addLast(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0172, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
    
        if (r3.hasNext() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017c, code lost:
    
        r4 = (t1.C1028h) r3.next();
        r6 = r10.b(r4.f8874e.f8931d);
        r7 = r4.f8874e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018c, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (r7 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0193, code lost:
    
        n.T.n(t1.C1022b.f8865o);
        r6.c(r7);
        r6 = r6.b();
        r7 = r6.f8891a;
        r7.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r8 = S1.l.b1((java.util.Collection) ((t2.C1045P) r6.f8895e.f8956d).getValue());
        r11 = r8.listIterator(r8.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
    
        if (r11.hasPrevious() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d0, code lost:
    
        if (f2.j.a(((t1.C1028h) r11.previous()).f8878i, r4.f8878i) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d2, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01da, code lost:
    
        r8.set(r11, r4);
        r4 = r6.f8892b;
        r4.getClass();
        r4.l(null, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e6, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d9, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ea, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(u uVar, Bundle bundle, C1016D c1016d) {
        LinkedHashMap linkedHashMap;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        LinkedHashMap linkedHashMap2 = this.f8828w;
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).f8894d = true;
        }
        f2.q qVar = new f2.q();
        boolean k3 = (c1016d == null || (i4 = c1016d.f8841c) == -1) ? false : k(i4, c1016d.f8842d, c1016d.f8843e);
        Bundle b3 = uVar.b(bundle);
        if (c1016d != null && c1016d.f8840b && this.f8818m.containsKey(Integer.valueOf(uVar.f8936i))) {
            qVar.f5828d = o(uVar.f8936i, b3, c1016d);
            linkedHashMap = linkedHashMap2;
            z3 = k3;
            z4 = false;
        } else {
            C1020H c1020h = this.f8827v;
            if (c1016d != null && c1016d.f8839a) {
                S1.j jVar = this.f8812g;
                C1028h c1028h = (C1028h) jVar.k();
                ListIterator listIterator = jVar.listIterator(jVar.b());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i3 = -1;
                        break;
                    } else if (((C1028h) listIterator.previous()).f8874e == uVar) {
                        i3 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i3 != -1) {
                    if (uVar instanceof x) {
                        int i5 = x.f8947q;
                        List V2 = m2.h.V(new m2.k(m2.h.T((x) uVar, C1022b.f8864n), C1022b.f8862l, 1));
                        if (jVar.f4316f - i3 == V2.size()) {
                            List subList = jVar.subList(i3, jVar.f4316f);
                            ArrayList arrayList = new ArrayList(S1.n.E0(subList, 10));
                            Iterator it2 = subList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((C1028h) it2.next()).f8874e.f8936i));
                            }
                        }
                    } else if (c1028h != null) {
                        u uVar2 = c1028h.f8874e;
                        if (uVar2 != null) {
                        }
                    }
                    if (!z4) {
                        C1028h a3 = m1.w.a(this.f8806a, uVar, b3, g(), this.f8821p);
                        AbstractC1019G b4 = c1020h.b(uVar.f8931d);
                        List l02 = O2.l.l0(a3);
                        this.f8829x = new C0616a(qVar, this, uVar, b3);
                        b4.d(l02, c1016d);
                        this.f8829x = null;
                    }
                }
            }
            linkedHashMap = linkedHashMap2;
            z3 = k3;
            z4 = false;
            if (!z4) {
            }
        }
        r();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((k) it3.next()).f8894d = false;
        }
        if (z3 || qVar.f5828d || z4) {
            b();
        } else {
            q();
        }
    }

    public final boolean k(int i3, boolean z3, boolean z4) {
        u uVar;
        String str;
        String str2;
        S1.j jVar = this.f8812g;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = S1.l.V0(jVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                uVar = null;
                break;
            }
            u uVar2 = ((C1028h) it.next()).f8874e;
            AbstractC1019G b3 = this.f8827v.b(uVar2.f8931d);
            if (z3 || uVar2.f8936i != i3) {
                arrayList.add(b3);
            }
            if (uVar2.f8936i == i3) {
                uVar = uVar2;
                break;
            }
        }
        if (uVar == null) {
            int i4 = u.f8930l;
            Log.i("NavController", "Ignoring popBackStack to destination " + n.r.l(this.f8806a, i3) + " as it was not found on the current back stack");
            return false;
        }
        f2.q qVar = new f2.q();
        S1.j jVar2 = new S1.j();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            AbstractC1019G abstractC1019G = (AbstractC1019G) it2.next();
            f2.q qVar2 = new f2.q();
            C1028h c1028h = (C1028h) jVar.last();
            S1.j jVar3 = jVar;
            this.f8830y = new C0129x0(qVar2, qVar, this, z4, jVar2);
            abstractC1019G.e(c1028h, z4);
            str = null;
            this.f8830y = null;
            if (!qVar2.f5828d) {
                break;
            }
            jVar = jVar3;
        }
        if (z4) {
            LinkedHashMap linkedHashMap = this.f8818m;
            if (!z3) {
                C0655e c0655e = new C0655e(new m2.k(m2.h.T(uVar, C1022b.f8859i), new l(this, 0), 0));
                while (c0655e.hasNext()) {
                    Integer valueOf = Integer.valueOf(((u) c0655e.next()).f8936i);
                    C1029i c1029i = (C1029i) (jVar2.isEmpty() ? str : jVar2.f4315e[jVar2.f4314d]);
                    linkedHashMap.put(valueOf, c1029i != null ? c1029i.f8885d : str);
                }
            }
            if (!jVar2.isEmpty()) {
                C1029i c1029i2 = (C1029i) jVar2.first();
                C0655e c0655e2 = new C0655e(new m2.k(m2.h.T(c(c1029i2.f8886e), C1022b.f8860j), new l(this, 1), 0));
                while (true) {
                    boolean hasNext = c0655e2.hasNext();
                    str2 = c1029i2.f8885d;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((u) c0655e2.next()).f8936i), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    this.f8819n.put(str2, jVar2);
                }
            }
        }
        r();
        return qVar.f5828d;
    }

    public final void l(C1028h c1028h, boolean z3, S1.j jVar) {
        n nVar;
        C1030A c1030a;
        Set set;
        S1.j jVar2 = this.f8812g;
        C1028h c1028h2 = (C1028h) jVar2.last();
        if (!f2.j.a(c1028h2, c1028h)) {
            throw new IllegalStateException(("Attempted to pop " + c1028h.f8874e + ", which is not the top of the back stack (" + c1028h2.f8874e + ')').toString());
        }
        S1.r.I0(jVar2);
        k kVar = (k) this.f8828w.get(this.f8827v.b(c1028h2.f8874e.f8931d));
        boolean z4 = true;
        if ((kVar == null || (c1030a = kVar.f8896f) == null || (set = (Set) ((C1045P) c1030a.f8956d).getValue()) == null || !set.contains(c1028h2)) && !this.f8817l.containsKey(c1028h2)) {
            z4 = false;
        }
        EnumC0286o enumC0286o = c1028h2.f8880k.f5242d;
        EnumC0286o enumC0286o2 = EnumC0286o.f5228f;
        if (enumC0286o.compareTo(enumC0286o2) >= 0) {
            if (z3) {
                c1028h2.h(enumC0286o2);
                jVar.addFirst(new C1029i(c1028h2));
            }
            if (z4) {
                c1028h2.h(enumC0286o2);
            } else {
                c1028h2.h(EnumC0286o.f5226d);
                p(c1028h2);
            }
        }
        if (z3 || z4 || (nVar = this.f8821p) == null) {
            return;
        }
        String str = c1028h2.f8878i;
        f2.j.f(str, "backStackEntryId");
        a0 a0Var = (a0) nVar.f8902b.remove(str);
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public final ArrayList n() {
        EnumC0286o enumC0286o;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8828w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0286o = EnumC0286o.f5229g;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C1045P) ((k) it.next()).f8896f.f8956d).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C1028h c1028h = (C1028h) obj;
                if (!arrayList.contains(c1028h) && c1028h.f8883n.compareTo(enumC0286o) < 0) {
                    arrayList2.add(obj);
                }
            }
            S1.r.G0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f8812g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C1028h c1028h2 = (C1028h) next;
            if (!arrayList.contains(c1028h2) && c1028h2.f8883n.compareTo(enumC0286o) >= 0) {
                arrayList3.add(next);
            }
        }
        S1.r.G0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C1028h) next2).f8874e instanceof x)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean o(int i3, Bundle bundle, C1016D c1016d) {
        u f3;
        C1028h c1028h;
        u uVar;
        LinkedHashMap linkedHashMap = this.f8818m;
        if (!linkedHashMap.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i3));
        Collection values = linkedHashMap.values();
        f2.j.f(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (f2.j.a((String) it.next(), str)) {
                it.remove();
            }
        }
        S1.j jVar = (S1.j) f2.x.c(this.f8819n).remove(str);
        ArrayList arrayList = new ArrayList();
        C1028h c1028h2 = (C1028h) this.f8812g.k();
        if (c1028h2 == null || (f3 = c1028h2.f8874e) == null) {
            f3 = f();
        }
        if (jVar != null) {
            Iterator it2 = jVar.iterator();
            while (it2.hasNext()) {
                C1029i c1029i = (C1029i) it2.next();
                u d3 = d(f3, c1029i.f8886e, true);
                Context context = this.f8806a;
                if (d3 == null) {
                    int i4 = u.f8930l;
                    throw new IllegalStateException(("Restore State failed: destination " + n.r.l(context, c1029i.f8886e) + " cannot be found from the current destination " + f3).toString());
                }
                arrayList.add(c1029i.a(context, d3, g(), this.f8821p));
                f3 = d3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C1028h) next).f8874e instanceof x)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it4.hasNext()) {
                break;
            }
            C1028h c1028h3 = (C1028h) it4.next();
            List list = (List) S1.l.R0(arrayList2);
            if (list != null && (c1028h = (C1028h) S1.l.Q0(list)) != null && (uVar = c1028h.f8874e) != null) {
                str2 = uVar.f8931d;
            }
            if (f2.j.a(str2, c1028h3.f8874e.f8931d)) {
                list.add(c1028h3);
            } else {
                arrayList2.add(S1.m.C0(c1028h3));
            }
        }
        f2.q qVar = new f2.q();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            AbstractC1019G b3 = this.f8827v.b(((C1028h) S1.l.K0(list2)).f8874e.f8931d);
            this.f8829x = new R0.g(qVar, arrayList, new f2.s(), this, bundle, 1);
            b3.d(list2, c1016d);
            this.f8829x = null;
        }
        return qVar.f5828d;
    }

    public final void p(C1028h c1028h) {
        f2.j.f(c1028h, "child");
        C1028h c1028h2 = (C1028h) this.f8816k.remove(c1028h);
        if (c1028h2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f8817l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c1028h2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            k kVar = (k) this.f8828w.get(this.f8827v.b(c1028h2.f8874e.f8931d));
            if (kVar != null) {
                kVar.b(c1028h2);
            }
            linkedHashMap.remove(c1028h2);
        }
    }

    public final void q() {
        AtomicInteger atomicInteger;
        C1030A c1030a;
        Set set;
        ArrayList b12 = S1.l.b1(this.f8812g);
        if (b12.isEmpty()) {
            return;
        }
        u uVar = ((C1028h) S1.l.Q0(b12)).f8874e;
        ArrayList arrayList = new ArrayList();
        if (uVar instanceof InterfaceC1024d) {
            Iterator it = S1.l.V0(b12).iterator();
            while (it.hasNext()) {
                u uVar2 = ((C1028h) it.next()).f8874e;
                arrayList.add(uVar2);
                if (!(uVar2 instanceof InterfaceC1024d) && !(uVar2 instanceof x)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C1028h c1028h : S1.l.V0(b12)) {
            EnumC0286o enumC0286o = c1028h.f8883n;
            u uVar3 = c1028h.f8874e;
            EnumC0286o enumC0286o2 = EnumC0286o.f5230h;
            EnumC0286o enumC0286o3 = EnumC0286o.f5229g;
            if (uVar != null && uVar3.f8936i == uVar.f8936i) {
                if (enumC0286o != enumC0286o2) {
                    k kVar = (k) this.f8828w.get(this.f8827v.b(uVar3.f8931d));
                    if (f2.j.a((kVar == null || (c1030a = kVar.f8896f) == null || (set = (Set) ((C1045P) c1030a.f8956d).getValue()) == null) ? null : Boolean.valueOf(set.contains(c1028h)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f8817l.get(c1028h)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(c1028h, enumC0286o3);
                    } else {
                        hashMap.put(c1028h, enumC0286o2);
                    }
                }
                u uVar4 = (u) S1.l.L0(arrayList);
                if (uVar4 != null && uVar4.f8936i == uVar3.f8936i) {
                    S1.r.H0(arrayList);
                }
                uVar = uVar.f8932e;
            } else if (arrayList.isEmpty() || uVar3.f8936i != ((u) S1.l.K0(arrayList)).f8936i) {
                c1028h.h(EnumC0286o.f5228f);
            } else {
                u uVar5 = (u) S1.r.H0(arrayList);
                if (enumC0286o == enumC0286o2) {
                    c1028h.h(enumC0286o3);
                } else if (enumC0286o != enumC0286o3) {
                    hashMap.put(c1028h, enumC0286o3);
                }
                x xVar = uVar5.f8932e;
                if (xVar != null && !arrayList.contains(xVar)) {
                    arrayList.add(xVar);
                }
            }
        }
        Iterator it2 = b12.iterator();
        while (it2.hasNext()) {
            C1028h c1028h2 = (C1028h) it2.next();
            EnumC0286o enumC0286o4 = (EnumC0286o) hashMap.get(c1028h2);
            if (enumC0286o4 != null) {
                c1028h2.h(enumC0286o4);
            } else {
                c1028h2.i();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e2.a, f2.h] */
    public final void r() {
        int i3;
        boolean z3 = false;
        if (this.f8826u) {
            S1.j jVar = this.f8812g;
            if (jVar == null || !jVar.isEmpty()) {
                Iterator it = jVar.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (!(((C1028h) it.next()).f8874e instanceof x) && (i3 = i3 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i3 = 0;
            }
            if (i3 > 1) {
                z3 = true;
            }
        }
        L1.p pVar = this.f8825t;
        pVar.f5337a = z3;
        ?? r02 = pVar.f5339c;
        if (r02 != 0) {
            r02.b();
        }
    }
}
