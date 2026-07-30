package t3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.b1;
import b.j0;
import f7.q0;
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
import r1.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 {
    public int A;
    public final ArrayList B;
    public final f7.e0 C;
    public final f7.y D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8745a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f8746b;

    /* renamed from: c, reason: collision with root package name */
    public y f8747c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f8748d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f8749e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8750f;

    /* renamed from: g, reason: collision with root package name */
    public final e6.j f8751g;

    /* renamed from: h, reason: collision with root package name */
    public final q0 f8752h;

    /* renamed from: i, reason: collision with root package name */
    public final q0 f8753i;

    /* renamed from: j, reason: collision with root package name */
    public final f7.z f8754j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f8755k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f8756l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8757m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f8758n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.v f8759o;

    /* renamed from: p, reason: collision with root package name */
    public o f8760p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f8761q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.o f8762r;

    /* renamed from: s, reason: collision with root package name */
    public final j f8763s;

    /* renamed from: t, reason: collision with root package name */
    public final j0 f8764t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8765u;

    /* renamed from: v, reason: collision with root package name */
    public final h0 f8766v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f8767w;

    /* renamed from: x, reason: collision with root package name */
    public r6.l f8768x;

    /* renamed from: y, reason: collision with root package name */
    public l f8769y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f8770z;

    public b0(Context context) {
        Object obj;
        f7.e0 a3;
        r6.k.f(context, "context");
        this.f8745a = context;
        Iterator it = y6.h.o(context, b.f8738i).iterator();
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
        this.f8746b = (Activity) obj;
        this.f8751g = new e6.j();
        e6.u uVar = e6.u.f2826f;
        this.f8752h = f7.f0.c(uVar);
        q0 c4 = f7.f0.c(uVar);
        this.f8753i = c4;
        this.f8754j = new f7.z(c4);
        this.f8755k = new LinkedHashMap();
        this.f8756l = new LinkedHashMap();
        this.f8757m = new LinkedHashMap();
        this.f8758n = new LinkedHashMap();
        this.f8761q = new CopyOnWriteArrayList();
        this.f8762r = androidx.lifecycle.o.f1008g;
        this.f8763s = new j(0, this);
        this.f8764t = new j0(3, this, false);
        this.f8765u = true;
        h0 h0Var = new h0();
        this.f8766v = h0Var;
        this.f8767w = new LinkedHashMap();
        this.f8770z = new LinkedHashMap();
        h0Var.a(new a0(h0Var));
        h0Var.a(new c(this.f8745a));
        this.B = new ArrayList();
        d6.a.d(new z0(6, this));
        a3 = f7.f0.a((r2 & 1) != 0 ? 0 : 1, (r2 & 2) == 0 ? 16 : 0, e7.a.f2834g);
        this.C = a3;
        this.D = new f7.y(a3);
    }

    public static v d(v vVar, int i7, boolean z8) {
        y yVar;
        if (vVar.f8862k == i7) {
            return vVar;
        }
        if (vVar instanceof y) {
            yVar = (y) vVar;
        } else {
            yVar = vVar.f8858g;
            r6.k.c(yVar);
        }
        return yVar.x(i7, yVar, z8);
    }

    public static /* synthetic */ void m(b0 b0Var, h hVar) {
        b0Var.l(hVar, false, new e6.j());
    }

    public final void a(v vVar, Bundle bundle, h hVar, List list) {
        Object obj;
        Object obj2;
        v vVar2 = hVar.f8792g;
        boolean z8 = vVar2 instanceof d;
        e6.j jVar = this.f8751g;
        if (!z8) {
            while (!jVar.isEmpty() && (((h) jVar.last()).f8792g instanceof d) && k(((h) jVar.last()).f8792g.f8862k, true, false)) {
            }
        }
        e6.j jVar2 = new e6.j();
        boolean z9 = vVar instanceof y;
        Context context = this.f8745a;
        Object obj3 = null;
        if (z9) {
            v vVar3 = vVar2;
            do {
                r6.k.c(vVar3);
                vVar3 = vVar3.f8858g;
                if (vVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (r6.k.a(((h) obj2).f8792g, vVar3)) {
                                break;
                            }
                        }
                    }
                    h hVar2 = (h) obj2;
                    if (hVar2 == null) {
                        hVar2 = j4.i.k(context, vVar3, bundle, g(), this.f8760p);
                    }
                    jVar2.addFirst(hVar2);
                    if (!jVar.isEmpty() && ((h) jVar.last()).f8792g == vVar3) {
                        m(this, (h) jVar.last());
                    }
                }
                if (vVar3 == null) {
                    break;
                }
            } while (vVar3 != vVar);
        }
        v vVar4 = jVar2.isEmpty() ? vVar2 : ((h) jVar2.first()).f8792g;
        while (vVar4 != null && c(vVar4.f8862k) != vVar4) {
            vVar4 = vVar4.f8858g;
            if (vVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (r6.k.a(((h) obj).f8792g, vVar4)) {
                            break;
                        }
                    }
                }
                h hVar3 = (h) obj;
                if (hVar3 == null) {
                    hVar3 = j4.i.k(context, vVar4, vVar4.a(bundle2), g(), this.f8760p);
                }
                jVar2.addFirst(hVar3);
            }
        }
        if (!jVar2.isEmpty()) {
            vVar2 = ((h) jVar2.first()).f8792g;
        }
        while (!jVar.isEmpty() && (((h) jVar.last()).f8792g instanceof y)) {
            v vVar5 = ((h) jVar.last()).f8792g;
            r6.k.d(vVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((y) vVar5).f8874o.b(vVar2.f8862k) != null) {
                break;
            } else {
                m(this, (h) jVar.last());
            }
        }
        h hVar4 = (h) (jVar.isEmpty() ? null : jVar.f2821g[jVar.f2820f]);
        if (hVar4 == null) {
            hVar4 = (h) (jVar2.isEmpty() ? null : jVar2.f2821g[jVar2.f2820f]);
        }
        if (!r6.k.a(hVar4 != null ? hVar4.f8792g : null, this.f8747c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                v vVar6 = ((h) previous).f8792g;
                y yVar = this.f8747c;
                r6.k.c(yVar);
                if (r6.k.a(vVar6, yVar)) {
                    obj3 = previous;
                    break;
                }
            }
            h hVar5 = (h) obj3;
            if (hVar5 == null) {
                y yVar2 = this.f8747c;
                r6.k.c(yVar2);
                y yVar3 = this.f8747c;
                r6.k.c(yVar3);
                hVar5 = j4.i.k(context, yVar2, yVar3.a(bundle), g(), this.f8760p);
            }
            jVar2.addFirst(hVar5);
        }
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            h hVar6 = (h) it.next();
            Object obj4 = this.f8767w.get(this.f8766v.b(hVar6.f8792g.f8857f));
            if (obj4 == null) {
                throw new IllegalStateException(a0.m.m(new StringBuilder("NavigatorBackStack for "), vVar.f8857f, " should already be created").toString());
            }
            ((k) obj4).a(hVar6);
        }
        jVar.addAll(jVar2);
        jVar.addLast(hVar);
        ArrayList q02 = e6.l.q0(jVar2, hVar);
        int size = q02.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj5 = q02.get(i7);
            i7++;
            h hVar7 = (h) obj5;
            y yVar4 = hVar7.f8792g.f8858g;
            if (yVar4 != null) {
                i(hVar7, e(yVar4.f8862k));
            }
        }
    }

    public final boolean b() {
        e6.j jVar;
        while (true) {
            jVar = this.f8751g;
            if (jVar.isEmpty() || !(((h) jVar.last()).f8792g instanceof y)) {
                break;
            }
            m(this, (h) jVar.last());
        }
        h hVar = (h) jVar.y();
        ArrayList arrayList = this.B;
        if (hVar != null) {
            arrayList.add(hVar);
        }
        this.A++;
        q();
        int i7 = this.A - 1;
        this.A = i7;
        if (i7 == 0) {
            ArrayList x02 = e6.l.x0(arrayList);
            arrayList.clear();
            int size = x02.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = x02.get(i8);
                i8++;
                h hVar2 = (h) obj;
                Iterator it = this.f8761q.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    v vVar = hVar2.f8792g;
                    hVar2.g();
                    throw null;
                }
                this.C.i(hVar2);
            }
            ArrayList x03 = e6.l.x0(jVar);
            q0 q0Var = this.f8752h;
            q0Var.getClass();
            q0Var.l(null, x03);
            ArrayList n8 = n();
            q0 q0Var2 = this.f8753i;
            q0Var2.getClass();
            q0Var2.l(null, n8);
        }
        return hVar != null;
    }

    public final v c(int i7) {
        v vVar;
        y yVar = this.f8747c;
        if (yVar == null) {
            return null;
        }
        if (yVar.f8862k == i7) {
            return yVar;
        }
        h hVar = (h) this.f8751g.y();
        if (hVar == null || (vVar = hVar.f8792g) == null) {
            vVar = this.f8747c;
            r6.k.c(vVar);
        }
        return d(vVar, i7, false);
    }

    public final h e(int i7) {
        Object obj;
        e6.j jVar = this.f8751g;
        ListIterator listIterator = jVar.listIterator(jVar.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((h) obj).f8792g.f8862k == i7) {
                break;
            }
        }
        h hVar = (h) obj;
        if (hVar != null) {
            return hVar;
        }
        StringBuilder n8 = a0.m.n(i7, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        h hVar2 = (h) jVar.y();
        n8.append(hVar2 != null ? hVar2.f8792g : null);
        throw new IllegalArgumentException(n8.toString().toString());
    }

    public final y f() {
        y yVar = this.f8747c;
        if (yVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        r6.k.d(yVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return yVar;
    }

    public final androidx.lifecycle.o g() {
        return this.f8759o == null ? androidx.lifecycle.o.f1009h : this.f8762r;
    }

    public final y h(e6.j jVar) {
        v vVar;
        h hVar = (h) jVar.y();
        if (hVar == null || (vVar = hVar.f8792g) == null) {
            vVar = this.f8747c;
            r6.k.c(vVar);
        }
        if (vVar instanceof y) {
            return (y) vVar;
        }
        y yVar = vVar.f8858g;
        r6.k.c(yVar);
        return yVar;
    }

    public final void i(h hVar, h hVar2) {
        this.f8755k.put(hVar, hVar2);
        LinkedHashMap linkedHashMap = this.f8756l;
        if (linkedHashMap.get(hVar2) == null) {
            linkedHashMap.put(hVar2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(hVar2);
        r6.k.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e5, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00f3, code lost:
    
        if (r26.f8862k == r5.f8862k) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
    
        if (r15.equals(r5) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f5, code lost:
    
        r5 = new e6.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fe, code lost:
    
        if (e6.m.W(r12) < r14) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0100, code lost:
    
        r7 = (t3.h) e6.r.e0(r12);
        p(r7);
        r16 = new t3.h(r7.f8791f, r7.f8792g, r7.f8792g.a(r27), r7.f8794i, r7.f8795j, r7.f8796k, r7.f8797l);
        r16.f8794i = r7.f8794i;
        r16.h(r7.f8801p);
        r5.addFirst(r16);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        r24 = r3;
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014c, code lost:
    
        if (r3.hasNext() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        r6 = (t3.h) r3.next();
        r7 = r6.f8792g.f8858g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (r7 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015a, code lost:
    
        i(r6, e(r7.f8862k));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0163, code lost:
    
        r12.addLast(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
    
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
    
        if (r3.hasNext() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0171, code lost:
    
        r5 = (t3.h) r3.next();
        r6 = r10.b(r5.f8792g.f8857f);
        r7 = r5.f8792g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0181, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0185, code lost:
    
        if (r7 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0189, code lost:
    
        new t3.e0().f8782b = true;
        r6.c(r7);
        r6 = r6.b();
        r7 = r6.f8811a;
        r7.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019d, code lost:
    
        r11 = e6.l.x0((java.util.Collection) r6.f8815e.f3566f.getValue());
        r13 = r11.listIterator(r11.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b7, code lost:
    
        if (r13.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c7, code lost:
    
        if (r6.k.a(((t3.h) r13.previous()).f8796k, r5.f8796k) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c9, code lost:
    
        r13 = r13.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d1, code lost:
    
        r11.set(r13, r5);
        r5 = r6.f8812b;
        r5.getClass();
        r5.l(null, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dd, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d0, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e1, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0223 A[LOOP:1: B:19:0x021d->B:21:0x0223, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(v vVar, Bundle bundle, d0 d0Var) {
        boolean z8;
        LinkedHashMap linkedHashMap;
        boolean z9;
        ListIterator listIterator;
        int i7;
        Iterator it;
        LinkedHashMap linkedHashMap2 = this.f8767w;
        Iterator it2 = linkedHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).f8814d = true;
        }
        r6.r rVar = new r6.r();
        if (d0Var != null) {
            boolean z10 = d0Var.f8776e;
            boolean z11 = d0Var.f8775d;
            int i8 = d0Var.f8774c;
            if (i8 != -1) {
                z8 = k(i8, z11, z10);
                Bundle a3 = vVar.a(bundle);
                if (d0Var != null && d0Var.f8773b) {
                    if (this.f8757m.containsKey(Integer.valueOf(vVar.f8862k))) {
                        rVar.f7964f = o(vVar.f8862k, a3, d0Var);
                        linkedHashMap = linkedHashMap2;
                        z9 = false;
                        r();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((k) it.next()).f8814d = false;
                        }
                        if (!z8 || rVar.f7964f || z9) {
                            b();
                        } else {
                            q();
                            return;
                        }
                    }
                }
                h0 h0Var = this.f8766v;
                if (d0Var != null && d0Var.f8772a) {
                    e6.j jVar = this.f8751g;
                    h hVar = (h) jVar.y();
                    listIterator = jVar.listIterator(jVar.a());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i7 = -1;
                            break;
                        } else if (((h) listIterator.previous()).f8792g == vVar) {
                            i7 = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i7 != -1) {
                        if (vVar instanceof y) {
                            int i9 = y.f8873s;
                            List q8 = y6.h.q(new y6.k(y6.h.o((y) vVar, b.f8743n), b.f8741l, 1));
                            if (jVar.f2822h - i7 == q8.size()) {
                                List subList = jVar.subList(i7, jVar.f2822h);
                                ArrayList arrayList = new ArrayList(e6.n.a0(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(Integer.valueOf(((h) it3.next()).f8792g.f8862k));
                                }
                            }
                        } else if (hVar != null) {
                            v vVar2 = hVar.f8792g;
                            if (vVar2 != null) {
                            }
                        }
                        if (!z9) {
                            h k8 = j4.i.k(this.f8745a, vVar, a3, g(), this.f8760p);
                            g0 b9 = h0Var.b(vVar.f8857f);
                            List F = t6.a.F(k8);
                            this.f8768x = new l.a(rVar, this, vVar, a3);
                            b9.d(F, d0Var);
                            this.f8768x = null;
                        }
                        r();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                        }
                        if (z8) {
                        }
                        b();
                    }
                }
                linkedHashMap = linkedHashMap2;
                z9 = false;
                if (!z9) {
                }
                r();
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                }
                if (z8) {
                }
                b();
            }
        }
        z8 = false;
        Bundle a32 = vVar.a(bundle);
        if (d0Var != null) {
            if (this.f8757m.containsKey(Integer.valueOf(vVar.f8862k))) {
            }
        }
        h0 h0Var2 = this.f8766v;
        if (d0Var != null) {
            e6.j jVar2 = this.f8751g;
            h hVar2 = (h) jVar2.y();
            listIterator = jVar2.listIterator(jVar2.a());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i7 != -1) {
            }
        }
        linkedHashMap = linkedHashMap2;
        z9 = false;
        if (!z9) {
        }
        r();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z8) {
        }
        b();
    }

    public final boolean k(int i7, boolean z8, boolean z9) {
        v vVar;
        boolean z10;
        e6.j jVar = this.f8751g;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = e6.l.s0(jVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            v vVar2 = ((h) it.next()).f8792g;
            g0 b9 = this.f8766v.b(vVar2.f8857f);
            if (z8 || vVar2.f8862k != i7) {
                arrayList.add(b9);
            }
            if (vVar2.f8862k == i7) {
                vVar = vVar2;
                break;
            }
        }
        if (vVar == null) {
            int i8 = v.f8856n;
            Log.i("NavController", "Ignoring popBackStack to destination " + r4.a.D(this.f8745a, i7) + " as it was not found on the current back stack");
            return false;
        }
        r6.r rVar = new r6.r();
        e6.j jVar2 = new e6.j();
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                z10 = z9;
                break;
            }
            int i10 = i9 + 1;
            g0 g0Var = (g0) arrayList.get(i9);
            r6.r rVar2 = new r6.r();
            h hVar = (h) jVar.last();
            z10 = z9;
            this.f8769y = new l(rVar2, rVar, this, z10, jVar2);
            g0Var.e(hVar, z10);
            this.f8769y = null;
            if (!rVar2.f7964f) {
                break;
            }
            i9 = i10;
        }
        if (z10) {
            LinkedHashMap linkedHashMap = this.f8757m;
            if (!z8) {
                y6.j jVar3 = new y6.j(new y6.k(y6.h.o(vVar, b.f8739j), new m(this, 0), 0));
                while (jVar3.hasNext()) {
                    Integer valueOf = Integer.valueOf(((v) jVar3.next()).f8862k);
                    i iVar = (i) (jVar2.isEmpty() ? null : jVar2.f2821g[jVar2.f2820f]);
                    linkedHashMap.put(valueOf, iVar != null ? iVar.f8805f : null);
                }
            }
            if (!jVar2.isEmpty()) {
                i iVar2 = (i) jVar2.first();
                int i11 = iVar2.f8806g;
                String str = iVar2.f8805f;
                y6.j jVar4 = new y6.j(new y6.k(y6.h.o(c(i11), b.f8740k), new m(this, 1), 0));
                while (jVar4.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((v) jVar4.next()).f8862k), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f8758n.put(str, jVar2);
                }
            }
        }
        r();
        return rVar.f7964f;
    }

    public final void l(h hVar, boolean z8, e6.j jVar) {
        o oVar;
        f7.z zVar;
        Set set;
        e6.j jVar2 = this.f8751g;
        h hVar2 = (h) jVar2.last();
        if (!r6.k.a(hVar2, hVar)) {
            throw new IllegalStateException(("Attempted to pop " + hVar.f8792g + ", which is not the top of the back stack (" + hVar2.f8792g + ')').toString());
        }
        e6.r.e0(jVar2);
        k kVar = (k) this.f8767w.get(this.f8766v.b(hVar2.f8792g.f8857f));
        boolean z9 = true;
        if ((kVar == null || (zVar = kVar.f8816f) == null || (set = (Set) zVar.f3566f.getValue()) == null || !set.contains(hVar2)) && !this.f8756l.containsKey(hVar2)) {
            z9 = false;
        }
        androidx.lifecycle.o oVar2 = hVar2.f8798m.f1046d;
        androidx.lifecycle.o oVar3 = androidx.lifecycle.o.f1009h;
        if (oVar2.compareTo(oVar3) >= 0) {
            if (z8) {
                hVar2.h(oVar3);
                jVar.addFirst(new i(hVar2));
            }
            if (z9) {
                hVar2.h(oVar3);
            } else {
                hVar2.h(androidx.lifecycle.o.f1007f);
                p(hVar2);
            }
        }
        if (z8 || z9 || (oVar = this.f8760p) == null) {
            return;
        }
        String str = hVar2.f8796k;
        r6.k.f(str, "backStackEntryId");
        b1 b1Var = (b1) oVar.f8828b.remove(str);
        if (b1Var != null) {
            b1Var.a();
        }
    }

    public final ArrayList n() {
        androidx.lifecycle.o oVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8767w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            oVar = androidx.lifecycle.o.f1010i;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((k) it.next()).f8816f.f3566f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                h hVar = (h) obj;
                if (!arrayList.contains(hVar) && hVar.f8801p.compareTo(oVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            e6.r.c0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f8751g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            h hVar2 = (h) next;
            if (!arrayList.contains(hVar2) && hVar2.f8801p.compareTo(oVar) >= 0) {
                arrayList3.add(next);
            }
        }
        e6.r.c0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            if (!(((h) obj2).f8792g instanceof y)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean o(int i7, Bundle bundle, d0 d0Var) {
        v f9;
        h hVar;
        v vVar;
        Integer valueOf = Integer.valueOf(i7);
        LinkedHashMap linkedHashMap = this.f8757m;
        int i8 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i7));
        Collection values = linkedHashMap.values();
        r6.k.f(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (r6.k.a((String) it.next(), str)) {
                it.remove();
            }
        }
        e6.j jVar = (e6.j) r6.y.c(this.f8758n).remove(str);
        ArrayList arrayList = new ArrayList();
        h hVar2 = (h) this.f8751g.y();
        if (hVar2 == null || (f9 = hVar2.f8792g) == null) {
            f9 = f();
        }
        if (jVar != null) {
            Iterator it2 = jVar.iterator();
            while (it2.hasNext()) {
                i iVar = (i) it2.next();
                v d8 = d(f9, iVar.f8806g, true);
                Context context = this.f8745a;
                if (d8 == null) {
                    int i9 = v.f8856n;
                    throw new IllegalStateException(("Restore State failed: destination " + r4.a.D(context, iVar.f8806g) + " cannot be found from the current destination " + f9).toString());
                }
                arrayList.add(iVar.a(context, d8, g(), this.f8760p));
                f9 = d8;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!(((h) obj).f8792g instanceof y)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (true) {
            String str2 = null;
            if (i11 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i11);
            i11++;
            h hVar3 = (h) obj2;
            List list = (List) e6.l.o0(arrayList2);
            if (list != null && (hVar = (h) e6.l.n0(list)) != null && (vVar = hVar.f8792g) != null) {
                str2 = vVar.f8857f;
            }
            if (r6.k.a(str2, hVar3.f8792g.f8857f)) {
                list.add(hVar3);
            } else {
                arrayList2.add(e6.m.Y(hVar3));
            }
        }
        r6.r rVar = new r6.r();
        int size3 = arrayList2.size();
        while (i8 < size3) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            List list2 = (List) obj3;
            g0 b9 = this.f8766v.b(((h) e6.l.h0(list2)).f8792g.f8857f);
            this.f8768x = new p2.f(rVar, arrayList, new r6.t(), this, bundle, 1);
            b9.d(list2, d0Var);
            this.f8768x = null;
        }
        return rVar.f7964f;
    }

    public final void p(h hVar) {
        r6.k.f(hVar, "child");
        h hVar2 = (h) this.f8755k.remove(hVar);
        if (hVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f8756l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(hVar2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            k kVar = (k) this.f8767w.get(this.f8766v.b(hVar2.f8792g.f8857f));
            if (kVar != null) {
                kVar.b(hVar2);
            }
            linkedHashMap.remove(hVar2);
        }
    }

    public final void q() {
        AtomicInteger atomicInteger;
        f7.z zVar;
        Set set;
        ArrayList x02 = e6.l.x0(this.f8751g);
        if (x02.isEmpty()) {
            return;
        }
        v vVar = ((h) e6.l.n0(x02)).f8792g;
        ArrayList arrayList = new ArrayList();
        if (vVar instanceof d) {
            Iterator it = e6.l.s0(x02).iterator();
            while (it.hasNext()) {
                v vVar2 = ((h) it.next()).f8792g;
                arrayList.add(vVar2);
                if (!(vVar2 instanceof d) && !(vVar2 instanceof y)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (h hVar : e6.l.s0(x02)) {
            androidx.lifecycle.o oVar = hVar.f8801p;
            v vVar3 = hVar.f8792g;
            androidx.lifecycle.o oVar2 = androidx.lifecycle.o.f1011j;
            androidx.lifecycle.o oVar3 = androidx.lifecycle.o.f1010i;
            if (vVar != null && vVar3.f8862k == vVar.f8862k) {
                if (oVar != oVar2) {
                    k kVar = (k) this.f8767w.get(this.f8766v.b(vVar3.f8857f));
                    if (r6.k.a((kVar == null || (zVar = kVar.f8816f) == null || (set = (Set) zVar.f3566f.getValue()) == null) ? null : Boolean.valueOf(set.contains(hVar)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f8756l.get(hVar)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(hVar, oVar3);
                    } else {
                        hashMap.put(hVar, oVar2);
                    }
                }
                v vVar4 = (v) e6.l.i0(arrayList);
                if (vVar4 != null && vVar4.f8862k == vVar3.f8862k) {
                    e6.r.d0(arrayList);
                }
                vVar = vVar.f8858g;
            } else if (arrayList.isEmpty() || vVar3.f8862k != ((v) e6.l.h0(arrayList)).f8862k) {
                hVar.h(androidx.lifecycle.o.f1009h);
            } else {
                v vVar5 = (v) e6.r.d0(arrayList);
                if (oVar == oVar2) {
                    hVar.h(oVar3);
                } else if (oVar != oVar3) {
                    hashMap.put(hVar, oVar3);
                }
                y yVar = vVar5.f8858g;
                if (yVar != null && !arrayList.contains(yVar)) {
                    arrayList.add(yVar);
                }
            }
        }
        int size = x02.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = x02.get(i7);
            i7++;
            h hVar2 = (h) obj;
            androidx.lifecycle.o oVar4 = (androidx.lifecycle.o) hashMap.get(hVar2);
            if (oVar4 != null) {
                hVar2.h(oVar4);
            } else {
                hVar2.i();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q6.a, r6.h] */
    public final void r() {
        int i7;
        boolean z8 = false;
        if (this.f8765u) {
            e6.j jVar = this.f8751g;
            if (jVar == null || !jVar.isEmpty()) {
                Iterator it = jVar.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    if (!(((h) it.next()).f8792g instanceof y) && (i7 = i7 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i7 = 0;
            }
            if (i7 > 1) {
                z8 = true;
            }
        }
        j0 j0Var = this.f8764t;
        j0Var.f1220a = z8;
        ?? r02 = j0Var.f1222c;
        if (r02 != 0) {
            r02.a();
        }
    }
}
