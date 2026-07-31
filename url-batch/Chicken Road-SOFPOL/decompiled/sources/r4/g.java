package r4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.w0;
import b6.d1;
import b6.t1;
import d6.k;
import d6.m;
import d6.r;
import d7.d0;
import d7.e0;
import d7.n0;
import d7.y;
import j0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import o.u0;
import o4.n;
import o4.o;
import o4.q;
import o4.t;
import o4.v;
import o4.z;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final t f6584a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f6585b;

    /* renamed from: c, reason: collision with root package name */
    public q f6586c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f6587d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle[] f6588e;

    /* renamed from: f, reason: collision with root package name */
    public final k f6589f = new k();

    /* renamed from: g, reason: collision with root package name */
    public final n0 f6590g;

    /* renamed from: h, reason: collision with root package name */
    public final n0 f6591h;
    public final y i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f6592j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f6593k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f6594l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f6595m;

    /* renamed from: n, reason: collision with root package name */
    public u f6596n;

    /* renamed from: o, reason: collision with root package name */
    public o4.h f6597o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f6598p;

    /* renamed from: q, reason: collision with root package name */
    public p f6599q;

    /* renamed from: r, reason: collision with root package name */
    public final d f6600r;

    /* renamed from: s, reason: collision with root package name */
    public final z f6601s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f6602t;

    /* renamed from: u, reason: collision with root package name */
    public p6.c f6603u;

    /* renamed from: v, reason: collision with root package name */
    public e f6604v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f6605w;

    /* renamed from: x, reason: collision with root package name */
    public int f6606x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f6607y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f6608z;

    public g(t tVar, d1 d1Var) {
        this.f6584a = tVar;
        this.f6585b = d1Var;
        d6.u uVar = d6.u.f2326d;
        this.f6590g = e0.b(uVar);
        n0 b8 = e0.b(uVar);
        this.f6591h = b8;
        this.i = new y(b8);
        this.f6592j = new LinkedHashMap();
        this.f6593k = new LinkedHashMap();
        this.f6594l = new LinkedHashMap();
        this.f6595m = new LinkedHashMap();
        this.f6598p = new ArrayList();
        this.f6599q = p.f848e;
        this.f6600r = new d(0, this);
        this.f6601s = new z();
        this.f6602t = new LinkedHashMap();
        this.f6605w = new LinkedHashMap();
        this.f6607y = new ArrayList();
        this.f6608z = e0.a(2);
    }

    public static o d(int i, o oVar, o oVar2, boolean z3) {
        if (oVar.f5671e.f4348a == i && (oVar2 == null || (oVar.equals(oVar2) && q6.i.a(oVar.f5672f, oVar2.f5672f)))) {
            return oVar;
        }
        q qVar = oVar instanceof q ? (q) oVar : null;
        if (qVar == null) {
            qVar = oVar.f5672f;
            q6.i.b(qVar);
        }
        return qVar.i.l(i, qVar, oVar2, z3);
    }

    public static /* synthetic */ void o(g gVar, o4.d dVar) {
        gVar.n(dVar, false, new k());
    }

    public final void a(o oVar, Bundle bundle, o4.d dVar, List list) {
        Object obj;
        Object obj2;
        d4.p pVar = this.f6584a.f5686c;
        o oVar2 = dVar.f5621e;
        boolean z3 = oVar2 instanceof o4.c;
        k kVar = this.f6589f;
        if (!z3) {
            while (!kVar.isEmpty() && (((o4.d) kVar.last()).f5621e instanceof o4.c) && m(((o4.d) kVar.last()).f5621e.f5671e.f4348a, true, false)) {
            }
        }
        k kVar2 = new k();
        Object obj3 = null;
        if (oVar instanceof q) {
            o oVar3 = oVar2;
            do {
                q6.i.b(oVar3);
                oVar3 = oVar3.f5672f;
                if (oVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (q6.i.a(((o4.d) obj2).f5621e, oVar3)) {
                                break;
                            }
                        }
                    }
                    o4.d dVar2 = (o4.d) obj2;
                    if (dVar2 == null) {
                        dVar2 = w5.f.c(pVar, oVar3, bundle, h(), this.f6597o);
                    }
                    kVar2.addFirst(dVar2);
                    if (!kVar.isEmpty() && ((o4.d) kVar.last()).f5621e == oVar3) {
                        o(this, (o4.d) kVar.last());
                    }
                }
                if (oVar3 == null) {
                    break;
                }
            } while (oVar3 != oVar);
        }
        o oVar4 = kVar2.isEmpty() ? oVar2 : ((o4.d) kVar2.first()).f5621e;
        while (oVar4 != null && c(oVar4.f5671e.f4348a, oVar4) != oVar4) {
            oVar4 = oVar4.f5672f;
            if (oVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (q6.i.a(((o4.d) obj).f5621e, oVar4)) {
                            break;
                        }
                    }
                }
                o4.d dVar3 = (o4.d) obj;
                if (dVar3 == null) {
                    dVar3 = w5.f.c(pVar, oVar4, oVar4.a(bundle2), h(), this.f6597o);
                }
                kVar2.addFirst(dVar3);
            }
        }
        if (!kVar2.isEmpty()) {
            oVar2 = ((o4.d) kVar2.first()).f5621e;
        }
        while (!kVar.isEmpty() && (((o4.d) kVar.last()).f5621e instanceof q)) {
            o oVar5 = ((o4.d) kVar.last()).f5621e;
            q6.i.c(oVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((u0) ((q) oVar5).i.f3191d).c(oVar2.f5671e.f4348a) != null) {
                break;
            } else {
                o(this, (o4.d) kVar.last());
            }
        }
        o4.d dVar4 = (o4.d) kVar.f();
        if (dVar4 == null) {
            dVar4 = (o4.d) kVar2.f();
        }
        if (!q6.i.a(dVar4 != null ? dVar4.f5621e : null, this.f6586c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                o oVar6 = ((o4.d) previous).f5621e;
                q qVar = this.f6586c;
                q6.i.b(qVar);
                if (q6.i.a(oVar6, qVar)) {
                    obj3 = previous;
                    break;
                }
            }
            o4.d dVar5 = (o4.d) obj3;
            if (dVar5 == null) {
                q qVar2 = this.f6586c;
                q6.i.b(qVar2);
                q qVar3 = this.f6586c;
                q6.i.b(qVar3);
                dVar5 = w5.f.c(pVar, qVar2, qVar3.a(bundle), h(), this.f6597o);
            }
            kVar2.addFirst(dVar5);
        }
        Iterator it = kVar2.iterator();
        while (it.hasNext()) {
            o4.d dVar6 = (o4.d) it.next();
            Object obj4 = this.f6602t.get(this.f6601s.b(dVar6.f5621e.f5670d));
            if (obj4 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + oVar.f5670d + " should already be created").toString());
            }
            ((o4.g) obj4).a(dVar6);
        }
        kVar.addAll(kVar2);
        kVar.addLast(dVar);
        ArrayList a02 = m.a0(kVar2, dVar);
        int size = a02.size();
        int i = 0;
        while (i < size) {
            Object obj5 = a02.get(i);
            i++;
            o4.d dVar7 = (o4.d) obj5;
            q qVar4 = dVar7.f5621e.f5672f;
            if (qVar4 != null) {
                j(dVar7, e(qVar4.f5671e.f4348a));
            }
        }
    }

    public final boolean b() {
        k kVar;
        while (true) {
            kVar = this.f6589f;
            if (kVar.isEmpty() || !(((o4.d) kVar.last()).f5621e instanceof q)) {
                break;
            }
            o(this, (o4.d) kVar.last());
        }
        o4.d dVar = (o4.d) kVar.h();
        ArrayList arrayList = this.f6607y;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        this.f6606x++;
        s();
        int i = this.f6606x - 1;
        this.f6606x = i;
        if (i == 0) {
            ArrayList h02 = m.h0(arrayList);
            arrayList.clear();
            int size = h02.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = h02.get(i8);
                i8++;
                o4.d dVar2 = (o4.d) obj;
                Iterator it = m.g0(this.f6598p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    o oVar = dVar2.f5621e;
                    dVar2.f5626k.a();
                    throw null;
                }
                this.f6608z.p(dVar2);
            }
            ArrayList h03 = m.h0(kVar);
            n0 n0Var = this.f6590g;
            n0Var.getClass();
            n0Var.j(null, h03);
            ArrayList p7 = p();
            n0 n0Var2 = this.f6591h;
            n0Var2.getClass();
            n0Var2.j(null, p7);
        }
        return dVar != null;
    }

    public final o c(int i, o oVar) {
        o oVar2;
        q qVar = this.f6586c;
        if (qVar == null) {
            return null;
        }
        if (qVar.f5671e.f4348a == i) {
            if (oVar == null) {
                return qVar;
            }
            if (q6.i.a(qVar, oVar) && oVar.f5672f == null) {
                return this.f6586c;
            }
        }
        o4.d dVar = (o4.d) this.f6589f.h();
        if (dVar == null || (oVar2 = dVar.f5621e) == null) {
            oVar2 = this.f6586c;
            q6.i.b(oVar2);
        }
        return d(i, oVar2, oVar, false);
    }

    public final o4.d e(int i) {
        Object obj;
        k kVar = this.f6589f;
        ListIterator<E> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((o4.d) obj).f5621e.f5671e.f4348a == i) {
                break;
            }
        }
        o4.d dVar = (o4.d) obj;
        if (dVar != null) {
            return dVar;
        }
        StringBuilder l3 = a0.q.l("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        l3.append(f());
        throw new IllegalArgumentException(l3.toString().toString());
    }

    public final o f() {
        o4.d dVar = (o4.d) this.f6589f.h();
        if (dVar != null) {
            return dVar.f5621e;
        }
        return null;
    }

    public final q g() {
        q qVar = this.f6586c;
        if (qVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        q6.i.c(qVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return qVar;
    }

    public final p h() {
        return this.f6596n == null ? p.f849f : this.f6599q;
    }

    public final q i() {
        o oVar;
        o4.d dVar = (o4.d) this.f6589f.h();
        if (dVar == null || (oVar = dVar.f5621e) == null) {
            oVar = this.f6586c;
            q6.i.b(oVar);
        }
        q qVar = oVar instanceof q ? (q) oVar : null;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = oVar.f5672f;
        q6.i.b(qVar2);
        return qVar2;
    }

    public final void j(o4.d dVar, o4.d dVar2) {
        this.f6592j.put(dVar, dVar2);
        LinkedHashMap linkedHashMap = this.f6593k;
        if (linkedHashMap.get(dVar2) == null) {
            linkedHashMap.put(dVar2, new a());
        }
        Object obj = linkedHashMap.get(dVar2);
        q6.i.b(obj);
        ((a) obj).f6561a.incrementAndGet();
    }

    public final void k(String str, v vVar) {
        q6.i.e(str, "route");
        if (this.f6586c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        q i = i();
        n f6 = i.f(str, true, i);
        if (f6 == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + this.f6586c);
        }
        o oVar = f6.f5664d;
        Bundle a8 = oVar.a(f6.f5665e);
        if (a8 == null) {
            a8 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
        }
        int i8 = o.f5669h;
        String str2 = (String) oVar.f5671e.f4352e;
        String concat = str2 != null ? "android-app://androidx.navigation/".concat(str2) : "";
        q6.i.e(concat, "uriString");
        Uri parse = Uri.parse(concat);
        q6.i.d(parse, "parse(...)");
        Intent intent = new Intent();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        a8.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        l(oVar, a8, vVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0216, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0228, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0229, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x010f, code lost:
    
        if (r22.f5671e.f4348a == r10.f5671e.f4348a) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fd, code lost:
    
        if (r13.equals(r10) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
    
        r10 = new d6.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011c, code lost:
    
        if (s6.a.t(r21.f6589f) < r11) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011e, code lost:
    
        r12 = r21.f6589f;
        q6.i.e(r12, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0129, code lost:
    
        if (r12.isEmpty() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
    
        r12 = (o4.d) r12.remove(s6.a.t(r12));
        r(r12);
        r13 = new o4.d(r12.f5620d, r12.f5621e, r12.f5621e.a(r23), r12.f5623g, r12.f5624h, r12.i, r12.f5625j);
        r0 = r13.f5626k;
        r4 = r12.f5623g;
        r0.getClass();
        q6.i.e(r4, "<set-?>");
        r0.f6566d = r4;
        r0 = r13.f5626k;
        r4 = r12.f5626k.f6572k;
        r0.getClass();
        q6.i.e(r4, "maxState");
        r0.f6572k = r4;
        r0.b();
        r10.addFirst(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0187, code lost:
    
        throw new java.util.NoSuchElementException("List is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0188, code lost:
    
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0190, code lost:
    
        if (r0.hasNext() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0192, code lost:
    
        r4 = (o4.d) r0.next();
        r7 = r4.f5621e.f5672f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019c, code lost:
    
        if (r7 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019e, code lost:
    
        j(r4, e(r7.f5671e.f4348a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a9, code lost:
    
        r21.f6589f.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01af, code lost:
    
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b7, code lost:
    
        if (r0.hasNext() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b9, code lost:
    
        r4 = (o4.d) r0.next();
        r7 = r21.f6601s.b(r4.f5621e.f5670d);
        r9 = r4.f5621e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cb, code lost:
    
        if (r9 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ce, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (r9 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d3, code lost:
    
        new o4.w().f5699b = true;
        r7.c(r9);
        r7 = r7.b();
        r9 = r7.f5631a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e4, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e5, code lost:
    
        r10 = d6.m.h0((java.util.Collection) r7.f5635e.f2430d.getValue());
        r12 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ff, code lost:
    
        if (r12.hasPrevious() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020f, code lost:
    
        if (q6.i.a(((o4.d) r12.previous()).i, r4.i) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0211, code lost:
    
        r12 = r12.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0219, code lost:
    
        r10.set(r12, r4);
        r4 = r7.f5632b;
        r4.getClass();
        r4.j(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0225, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0218, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(o oVar, Bundle bundle, v vVar) {
        boolean z3;
        int i;
        int i8;
        q6.i.e(oVar, "node");
        Iterator it = this.f6602t.values().iterator();
        while (it.hasNext()) {
            ((o4.g) it.next()).f5634d = true;
        }
        q6.o oVar2 = new q6.o();
        boolean m7 = (vVar == null || (i8 = vVar.f5693c) == -1) ? false : m(i8, vVar.f5694d, vVar.f5695e);
        Bundle a8 = oVar.a(bundle);
        if (vVar != null && vVar.f5692b && this.f6594l.containsKey(Integer.valueOf(oVar.f5671e.f4348a))) {
            oVar2.f6201d = q(oVar.f5671e.f4348a, a8, vVar);
            z3 = false;
        } else {
            if (vVar != null && vVar.f5691a) {
                o4.d dVar = (o4.d) this.f6589f.h();
                k kVar = this.f6589f;
                ListIterator listIterator = kVar.listIterator(kVar.a());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (((o4.d) listIterator.previous()).f5621e == oVar) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                if (i != -1) {
                    if (oVar instanceof q) {
                        int i9 = q.f5679j;
                        List c02 = x6.g.c0(new x6.i(x6.g.b0((q) oVar, new l(11)), new s1(9), 1));
                        if (this.f6589f.f2322f - i == c02.size()) {
                            k kVar2 = this.f6589f;
                            List subList = kVar2.subList(i, kVar2.f2322f);
                            ArrayList arrayList = new ArrayList(d6.n.M(subList, 10));
                            Iterator it2 = subList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((o4.d) it2.next()).f5621e.f5671e.f4348a));
                            }
                        }
                    } else if (dVar != null) {
                        o oVar3 = dVar.f5621e;
                        if (oVar3 != null) {
                        }
                    }
                    if (!z3) {
                        o4.d c8 = w5.f.c(this.f6584a.f5686c, oVar, a8, h(), this.f6597o);
                        o4.y b8 = this.f6601s.b(oVar.f5670d);
                        List x7 = s6.a.x(c8);
                        this.f6603u = new a0.d0(oVar2, this, oVar, a8, 3);
                        b8.d(x7, vVar);
                        this.f6603u = null;
                    }
                }
            }
            z3 = false;
            if (!z3) {
            }
        }
        this.f6585b.b();
        Iterator it3 = this.f6602t.values().iterator();
        while (it3.hasNext()) {
            ((o4.g) it3.next()).f5634d = false;
        }
        if (m7 || oVar2.f6201d || z3) {
            b();
        } else {
            s();
        }
    }

    public final boolean m(int i, boolean z3, boolean z7) {
        o oVar;
        boolean z8;
        k kVar = this.f6589f;
        final int i8 = 0;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = m.c0(kVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                oVar = null;
                break;
            }
            o oVar2 = ((o4.d) it.next()).f5621e;
            String str = oVar2.f5670d;
            l.n nVar = oVar2.f5671e;
            o4.y b8 = this.f6601s.b(str);
            if (z3 || nVar.f4348a != i) {
                arrayList.add(b8);
            }
            if (nVar.f4348a == i) {
                oVar = oVar2;
                break;
            }
        }
        if (oVar == null) {
            int i9 = o.f5669h;
            String str2 = "Ignoring popBackStack to destination " + h0.a.C(this.f6584a.f5686c, i) + " as it was not found on the current back stack";
            q6.i.e(str2, "message");
            Log.i("NavController", str2);
            return false;
        }
        q6.o oVar3 = new q6.o();
        k kVar2 = new k();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z8 = z7;
                break;
            }
            int i11 = i10 + 1;
            o4.y yVar = (o4.y) arrayList.get(i10);
            q6.o oVar4 = new q6.o();
            o4.d dVar = (o4.d) kVar.last();
            z8 = z7;
            e eVar = new e(oVar4, oVar3, this, z8, kVar2);
            q6.i.e(yVar, "navigator");
            q6.i.e(dVar, "popUpTo");
            this.f6604v = eVar;
            yVar.e(dVar, z8);
            this.f6604v = null;
            if (!oVar4.f6201d) {
                break;
            }
            i10 = i11;
        }
        if (z8) {
            LinkedHashMap linkedHashMap = this.f6594l;
            if (!z3) {
                x6.c cVar = new x6.c(new x6.i(x6.g.b0(oVar, new s1(10)), new p6.c(this) { // from class: r4.f

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ g f6583e;

                    {
                        this.f6583e = this;
                    }

                    @Override // p6.c
                    public final Object i(Object obj) {
                        boolean containsKey;
                        o oVar5 = (o) obj;
                        switch (i8) {
                            case 0:
                                q6.i.e(oVar5, "destination");
                                containsKey = this.f6583e.f6594l.containsKey(Integer.valueOf(oVar5.f5671e.f4348a));
                                break;
                            default:
                                q6.i.e(oVar5, "destination");
                                containsKey = this.f6583e.f6594l.containsKey(Integer.valueOf(oVar5.f5671e.f4348a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (cVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((o) cVar.next()).f5671e.f4348a);
                    o4.e eVar2 = (o4.e) kVar2.f();
                    linkedHashMap.put(valueOf, eVar2 != null ? (String) eVar2.f5627a.f2660b : null);
                }
            }
            if (!kVar2.isEmpty()) {
                f1.h hVar = ((o4.e) kVar2.first()).f5627a;
                final int i12 = 1;
                x6.c cVar2 = new x6.c(new x6.i(x6.g.b0(c(hVar.f2659a, null), new s1(11)), new p6.c(this) { // from class: r4.f

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ g f6583e;

                    {
                        this.f6583e = this;
                    }

                    @Override // p6.c
                    public final Object i(Object obj) {
                        boolean containsKey;
                        o oVar5 = (o) obj;
                        switch (i12) {
                            case 0:
                                q6.i.e(oVar5, "destination");
                                containsKey = this.f6583e.f6594l.containsKey(Integer.valueOf(oVar5.f5671e.f4348a));
                                break;
                            default:
                                q6.i.e(oVar5, "destination");
                                containsKey = this.f6583e.f6594l.containsKey(Integer.valueOf(oVar5.f5671e.f4348a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (cVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((o) cVar2.next()).f5671e.f4348a), (String) hVar.f2660b);
                }
                if (linkedHashMap.values().contains((String) hVar.f2660b)) {
                    this.f6595m.put((String) hVar.f2660b, kVar2);
                }
            }
        }
        this.f6585b.b();
        return oVar3.f6201d;
    }

    public final void n(o4.d dVar, boolean z3, k kVar) {
        o4.h hVar;
        y yVar;
        Set set;
        q6.i.e(dVar, "popUpTo");
        k kVar2 = this.f6589f;
        o4.d dVar2 = (o4.d) kVar2.last();
        if (!q6.i.a(dVar2, dVar)) {
            throw new IllegalStateException(("Attempted to pop " + dVar.f5621e + ", which is not the top of the back stack (" + dVar2.f5621e + ')').toString());
        }
        if (kVar2.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        kVar2.remove(s6.a.t(kVar2));
        o4.g gVar = (o4.g) this.f6602t.get(this.f6601s.b(dVar2.f5621e.f5670d));
        boolean z7 = true;
        if ((gVar == null || (yVar = gVar.f5636f) == null || (set = (Set) yVar.f2430d.getValue()) == null || !set.contains(dVar2)) && !this.f6593k.containsKey(dVar2)) {
            z7 = false;
        }
        p pVar = dVar2.f5626k.f6571j.f871c;
        p pVar2 = p.f849f;
        if (pVar.compareTo(pVar2) >= 0) {
            if (z3) {
                dVar2.c(pVar2);
                kVar.addFirst(new o4.e(dVar2));
            }
            if (z7) {
                dVar2.c(pVar2);
            } else {
                dVar2.c(p.f847d);
                r(dVar2);
            }
        }
        if (z3 || z7 || (hVar = this.f6597o) == null) {
            return;
        }
        String str = dVar2.i;
        q6.i.e(str, "backStackEntryId");
        w0 w0Var = (w0) hVar.f5639b.remove(str);
        if (w0Var != null) {
            w0Var.a();
        }
    }

    public final ArrayList p() {
        p pVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6602t.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            pVar = p.f850g;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((o4.g) it.next()).f5636f.f2430d.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                o4.d dVar = (o4.d) obj;
                if (!arrayList.contains(dVar) && dVar.f5626k.f6572k.compareTo(pVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            r.O(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f6589f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            o4.d dVar2 = (o4.d) next;
            if (!arrayList.contains(dVar2) && dVar2.f5626k.f6572k.compareTo(pVar) >= 0) {
                arrayList3.add(next);
            }
        }
        r.O(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((o4.d) obj2).f5621e instanceof q)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, v vVar) {
        o g3;
        o4.d dVar;
        o oVar;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f6594l;
        int i8 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        q6.i.e(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (q6.i.a((String) it.next(), str)) {
                it.remove();
            }
        }
        k kVar = (k) q6.v.b(this.f6595m).remove(str);
        d4.p pVar = this.f6584a.f5686c;
        ArrayList arrayList = new ArrayList();
        o4.d dVar2 = (o4.d) this.f6589f.h();
        if (dVar2 == null || (g3 = dVar2.f5621e) == null) {
            g3 = g();
        }
        if (kVar != null) {
            Iterator it2 = kVar.iterator();
            while (it2.hasNext()) {
                o4.e eVar = (o4.e) it2.next();
                f1.h hVar = eVar.f5627a;
                f1.h hVar2 = eVar.f5627a;
                o d8 = d(hVar.f2659a, g3, null, true);
                if (d8 == null) {
                    int i9 = o.f5669h;
                    throw new IllegalStateException(("Restore State failed: destination " + h0.a.C(pVar, hVar2.f2659a) + " cannot be found from the current destination " + g3).toString());
                }
                p h8 = h();
                o4.h hVar3 = this.f6597o;
                q6.i.e(pVar, "context");
                q6.i.e(h8, "hostLifecycleState");
                Bundle bundle3 = (Bundle) hVar2.f2661c;
                if (bundle3 != null) {
                    Context context = pVar.f2282a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) hVar2.f2660b;
                Bundle bundle4 = (Bundle) hVar2.f2662d;
                q6.i.e(str2, "id");
                arrayList.add(new o4.d(pVar, d8, bundle2, h8, hVar3, str2, bundle4));
                g3 = d8;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!(((o4.d) obj).f5621e instanceof q)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o4.d dVar3 = (o4.d) obj2;
            List list = (List) m.Y(arrayList2);
            if (q6.i.a((list == null || (dVar = (o4.d) m.X(list)) == null || (oVar = dVar.f5621e) == null) ? null : oVar.f5670d, dVar3.f5621e.f5670d)) {
                list.add(dVar3);
            } else {
                arrayList2.add(s6.a.z(dVar3));
            }
        }
        q6.o oVar2 = new q6.o();
        int size3 = arrayList2.size();
        while (i8 < size3) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            List list2 = (List) obj3;
            o4.y b8 = this.f6601s.b(((o4.d) m.R(list2)).f5621e.f5670d);
            ArrayList arrayList4 = arrayList;
            this.f6603u = new t1(oVar2, arrayList4, new q6.q(), this, bundle, 1);
            b8.d(list2, vVar);
            this.f6603u = null;
            arrayList = arrayList4;
        }
        return oVar2.f6201d;
    }

    public final void r(o4.d dVar) {
        q6.i.e(dVar, "child");
        o4.d dVar2 = (o4.d) this.f6592j.remove(dVar);
        if (dVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f6593k;
        a aVar = (a) linkedHashMap.get(dVar2);
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.f6561a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            o4.g gVar = (o4.g) this.f6602t.get(this.f6601s.b(dVar2.f5621e.f5670d));
            if (gVar != null) {
                gVar.c(dVar2);
            }
            linkedHashMap.remove(dVar2);
        }
    }

    public final void s() {
        a aVar;
        y yVar;
        Set set;
        ArrayList h02 = m.h0(this.f6589f);
        if (h02.isEmpty()) {
            return;
        }
        ArrayList z3 = s6.a.z(((o4.d) m.X(h02)).f5621e);
        ArrayList arrayList = new ArrayList();
        if (m.X(z3) instanceof o4.c) {
            Iterator it = m.c0(h02).iterator();
            while (it.hasNext()) {
                o oVar = ((o4.d) it.next()).f5621e;
                arrayList.add(oVar);
                if (!(oVar instanceof o4.c) && !(oVar instanceof q)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (o4.d dVar : m.c0(h02)) {
            p pVar = dVar.f5626k.f6572k;
            o oVar2 = dVar.f5621e;
            o oVar3 = (o) m.S(z3);
            p pVar2 = p.f851h;
            p pVar3 = p.f850g;
            if (oVar3 != null && oVar3.f5671e.f4348a == oVar2.f5671e.f4348a) {
                if (pVar != pVar2) {
                    o4.g gVar = (o4.g) this.f6602t.get(this.f6601s.b(dVar.f5621e.f5670d));
                    if (q6.i.a((gVar == null || (yVar = gVar.f5636f) == null || (set = (Set) yVar.f2430d.getValue()) == null) ? null : Boolean.valueOf(set.contains(dVar)), Boolean.TRUE) || ((aVar = (a) this.f6593k.get(dVar)) != null && aVar.f6561a.get() == 0)) {
                        hashMap.put(dVar, pVar3);
                    } else {
                        hashMap.put(dVar, pVar2);
                    }
                }
                o oVar4 = (o) m.S(arrayList);
                if (oVar4 != null && oVar4.f5671e.f4348a == oVar2.f5671e.f4348a) {
                    r.P(arrayList);
                }
                r.P(z3);
                q qVar = oVar2.f5672f;
                if (qVar != null) {
                    z3.add(qVar);
                }
            } else if (arrayList.isEmpty() || oVar2.f5671e.f4348a != ((o) m.R(arrayList)).f5671e.f4348a) {
                dVar.c(p.f849f);
            } else {
                o oVar5 = (o) r.P(arrayList);
                if (pVar == pVar2) {
                    dVar.c(pVar3);
                } else if (pVar != pVar3) {
                    hashMap.put(dVar, pVar3);
                }
                q qVar2 = oVar5.f5672f;
                if (qVar2 != null && !arrayList.contains(qVar2)) {
                    arrayList.add(qVar2);
                }
            }
        }
        int size = h02.size();
        int i = 0;
        while (i < size) {
            Object obj = h02.get(i);
            i++;
            o4.d dVar2 = (o4.d) obj;
            p pVar4 = (p) hashMap.get(dVar2);
            if (pVar4 != null) {
                dVar2.c(pVar4);
            } else {
                dVar2.f5626k.b();
            }
        }
    }
}
