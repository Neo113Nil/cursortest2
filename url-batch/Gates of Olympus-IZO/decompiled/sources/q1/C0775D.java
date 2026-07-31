package q1;

import H2.AbstractC0080b;
import a.AbstractC0157a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.InterfaceC0236v;
import androidx.lifecycle.a0;
import g2.C0409e;
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
import k.C0523b;
import m.C0587a;
import m2.EnumC0626a;
import n2.AbstractC0682G;
import n2.C0676A;
import n2.C0681F;
import n2.C0692Q;
import n2.C0720z;

/* renamed from: q1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775D {

    /* renamed from: A, reason: collision with root package name */
    public int f6827A;
    public final ArrayList B;
    public final C0681F C;
    public final C0720z D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6828a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f6829b;

    /* renamed from: c, reason: collision with root package name */
    public z f6830c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f6831d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f6832e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6833f;

    /* renamed from: g, reason: collision with root package name */
    public final M1.j f6834g;

    /* renamed from: h, reason: collision with root package name */
    public final C0692Q f6835h;

    /* renamed from: i, reason: collision with root package name */
    public final C0692Q f6836i;

    /* renamed from: j, reason: collision with root package name */
    public final C0676A f6837j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f6838k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f6839l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f6840m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f6841n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0236v f6842o;
    public p p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f6843q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0230o f6844r;

    /* renamed from: s, reason: collision with root package name */
    public final C0786j f6845s;

    /* renamed from: t, reason: collision with root package name */
    public final D1.r f6846t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f6847u;

    /* renamed from: v, reason: collision with root package name */
    public final K f6848v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f6849w;

    /* renamed from: x, reason: collision with root package name */
    public Z1.j f6850x;

    /* renamed from: y, reason: collision with root package name */
    public C0788l f6851y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f6852z;

    public C0775D(Context context) {
        Object obj;
        Z1.i.f(context, "context");
        this.f6828a = context;
        Iterator it = g2.h.c0(context, C0778b.f6878g).iterator();
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
        this.f6829b = (Activity) obj;
        this.f6834g = new M1.j();
        M1.u uVar = M1.u.f2803d;
        this.f6835h = AbstractC0682G.b(uVar);
        C0692Q b2 = AbstractC0682G.b(uVar);
        this.f6836i = b2;
        this.f6837j = new C0676A(b2);
        this.f6838k = new LinkedHashMap();
        this.f6839l = new LinkedHashMap();
        this.f6840m = new LinkedHashMap();
        this.f6841n = new LinkedHashMap();
        this.f6843q = new CopyOnWriteArrayList();
        this.f6844r = EnumC0230o.f4026e;
        this.f6845s = new C0786j(0, this);
        this.f6846t = new D1.r(this);
        this.f6847u = true;
        K k3 = new K();
        this.f6848v = k3;
        this.f6849w = new LinkedHashMap();
        this.f6852z = new LinkedHashMap();
        k3.a(new C0774C(k3));
        k3.a(new C0779c(this.f6828a));
        this.B = new ArrayList();
        I2.d.F(new A2.l(27, this));
        C0681F a3 = AbstractC0682G.a(1, 0, EnumC0626a.f5930e);
        this.C = a3;
        this.D = new C0720z(a3);
    }

    public static w d(w wVar, int i3, boolean z3) {
        z zVar;
        if (wVar.f6967i == i3) {
            return wVar;
        }
        if (wVar instanceof z) {
            zVar = (z) wVar;
        } else {
            zVar = wVar.f6963e;
            Z1.i.c(zVar);
        }
        return zVar.j(i3, zVar, z3);
    }

    public static void k(C0775D c0775d, String str, G g3, int i3) {
        if ((i3 & 2) != 0) {
            g3 = null;
        }
        c0775d.getClass();
        Z1.i.f(str, "route");
        if (c0775d.f6830c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + c0775d + '.').toString());
        }
        z h3 = c0775d.h(c0775d.f6834g);
        u l3 = h3.l(str, true, h3);
        if (l3 == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + c0775d.f6830c);
        }
        w wVar = l3.f6954d;
        Bundle b2 = wVar.b(l3.f6955e);
        if (b2 == null) {
            b2 = new Bundle();
        }
        Intent intent = new Intent();
        int i4 = w.f6961l;
        String str2 = wVar.f6968j;
        Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        Z1.i.b(parse);
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        b2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        c0775d.j(wVar, b2, g3);
    }

    public static /* synthetic */ void o(C0775D c0775d, C0784h c0784h) {
        c0775d.n(c0784h, false, new M1.j());
    }

    public final void a(w wVar, Bundle bundle, C0784h c0784h, List list) {
        Object obj;
        Object obj2;
        w wVar2 = c0784h.f6895e;
        boolean z3 = wVar2 instanceof InterfaceC0780d;
        M1.j jVar = this.f6834g;
        if (!z3) {
            while (!jVar.isEmpty() && (((C0784h) jVar.last()).f6895e instanceof InterfaceC0780d) && m(((C0784h) jVar.last()).f6895e.f6967i, true, false)) {
            }
        }
        M1.j jVar2 = new M1.j();
        boolean z4 = wVar instanceof z;
        Context context = this.f6828a;
        Object obj3 = null;
        if (z4) {
            w wVar3 = wVar2;
            do {
                Z1.i.c(wVar3);
                wVar3 = wVar3.f6963e;
                if (wVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (Z1.i.a(((C0784h) obj2).f6895e, wVar3)) {
                                break;
                            }
                        }
                    }
                    C0784h c0784h2 = (C0784h) obj2;
                    if (c0784h2 == null) {
                        c0784h2 = C0523b.c(context, wVar3, bundle, g(), this.p);
                    }
                    jVar2.addFirst(c0784h2);
                    if (!jVar.isEmpty() && ((C0784h) jVar.last()).f6895e == wVar3) {
                        o(this, (C0784h) jVar.last());
                    }
                }
                if (wVar3 == null) {
                    break;
                }
            } while (wVar3 != wVar);
        }
        w wVar4 = jVar2.isEmpty() ? wVar2 : ((C0784h) jVar2.first()).f6895e;
        while (wVar4 != null && c(wVar4.f6967i) != wVar4) {
            wVar4 = wVar4.f6963e;
            if (wVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (Z1.i.a(((C0784h) obj).f6895e, wVar4)) {
                            break;
                        }
                    }
                }
                C0784h c0784h3 = (C0784h) obj;
                if (c0784h3 == null) {
                    c0784h3 = C0523b.c(context, wVar4, wVar4.b(bundle2), g(), this.p);
                }
                jVar2.addFirst(c0784h3);
            }
        }
        if (!jVar2.isEmpty()) {
            wVar2 = ((C0784h) jVar2.first()).f6895e;
        }
        while (!jVar.isEmpty() && (((C0784h) jVar.last()).f6895e instanceof z)) {
            w wVar5 = ((C0784h) jVar.last()).f6895e;
            Z1.i.d(wVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((z) wVar5).f6979m.b(wVar2.f6967i) != null) {
                break;
            } else {
                o(this, (C0784h) jVar.last());
            }
        }
        C0784h c0784h4 = (C0784h) (jVar.isEmpty() ? null : jVar.f2798e[jVar.f2797d]);
        if (c0784h4 == null) {
            c0784h4 = (C0784h) (jVar2.isEmpty() ? null : jVar2.f2798e[jVar2.f2797d]);
        }
        if (!Z1.i.a(c0784h4 != null ? c0784h4.f6895e : null, this.f6830c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                w wVar6 = ((C0784h) previous).f6895e;
                z zVar = this.f6830c;
                Z1.i.c(zVar);
                if (Z1.i.a(wVar6, zVar)) {
                    obj3 = previous;
                    break;
                }
            }
            C0784h c0784h5 = (C0784h) obj3;
            if (c0784h5 == null) {
                z zVar2 = this.f6830c;
                Z1.i.c(zVar2);
                z zVar3 = this.f6830c;
                Z1.i.c(zVar3);
                c0784h5 = C0523b.c(context, zVar2, zVar3.b(bundle), g(), this.p);
            }
            jVar2.addFirst(c0784h5);
        }
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            C0784h c0784h6 = (C0784h) it.next();
            Object obj4 = this.f6849w.get(this.f6848v.b(c0784h6.f6895e.f6962d));
            if (obj4 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + wVar.f6962d + " should already be created").toString());
            }
            ((C0787k) obj4).a(c0784h6);
        }
        jVar.addAll(jVar2);
        jVar.addLast(c0784h);
        Iterator it2 = M1.l.v0(jVar2, c0784h).iterator();
        while (it2.hasNext()) {
            C0784h c0784h7 = (C0784h) it2.next();
            z zVar4 = c0784h7.f6895e.f6963e;
            if (zVar4 != null) {
                i(c0784h7, e(zVar4.f6967i));
            }
        }
    }

    public final boolean b() {
        M1.j jVar;
        while (true) {
            jVar = this.f6834g;
            if (jVar.isEmpty() || !(((C0784h) jVar.last()).f6895e instanceof z)) {
                break;
            }
            o(this, (C0784h) jVar.last());
        }
        C0784h c0784h = (C0784h) jVar.k();
        ArrayList arrayList = this.B;
        if (c0784h != null) {
            arrayList.add(c0784h);
        }
        this.f6827A++;
        s();
        int i3 = this.f6827A - 1;
        this.f6827A = i3;
        if (i3 == 0) {
            ArrayList D02 = M1.l.D0(arrayList);
            arrayList.clear();
            Iterator it = D02.iterator();
            while (it.hasNext()) {
                C0784h c0784h2 = (C0784h) it.next();
                Iterator it2 = this.f6843q.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    w wVar = c0784h2.f6895e;
                    c0784h2.g();
                    throw null;
                }
                this.C.c(c0784h2);
            }
            ArrayList D03 = M1.l.D0(jVar);
            C0692Q c0692q = this.f6835h;
            c0692q.getClass();
            c0692q.k(null, D03);
            ArrayList p = p();
            C0692Q c0692q2 = this.f6836i;
            c0692q2.getClass();
            c0692q2.k(null, p);
        }
        return c0784h != null;
    }

    public final w c(int i3) {
        w wVar;
        z zVar = this.f6830c;
        if (zVar == null) {
            return null;
        }
        if (zVar.f6967i == i3) {
            return zVar;
        }
        C0784h c0784h = (C0784h) this.f6834g.k();
        if (c0784h == null || (wVar = c0784h.f6895e) == null) {
            wVar = this.f6830c;
            Z1.i.c(wVar);
        }
        return d(wVar, i3, false);
    }

    public final C0784h e(int i3) {
        Object obj;
        M1.j jVar = this.f6834g;
        ListIterator listIterator = jVar.listIterator(jVar.b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C0784h) obj).f6895e.f6967i == i3) {
                break;
            }
        }
        C0784h c0784h = (C0784h) obj;
        if (c0784h != null) {
            return c0784h;
        }
        StringBuilder l3 = AbstractC0080b.l("No destination with ID ", i3, " is on the NavController's back stack. The current destination is ");
        C0784h c0784h2 = (C0784h) jVar.k();
        l3.append(c0784h2 != null ? c0784h2.f6895e : null);
        throw new IllegalArgumentException(l3.toString().toString());
    }

    public final z f() {
        z zVar = this.f6830c;
        if (zVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return zVar;
    }

    public final EnumC0230o g() {
        return this.f6842o == null ? EnumC0230o.f4027f : this.f6844r;
    }

    public final z h(M1.j jVar) {
        w wVar;
        C0784h c0784h = (C0784h) jVar.k();
        if (c0784h == null || (wVar = c0784h.f6895e) == null) {
            wVar = this.f6830c;
            Z1.i.c(wVar);
        }
        if (wVar instanceof z) {
            return (z) wVar;
        }
        z zVar = wVar.f6963e;
        Z1.i.c(zVar);
        return zVar;
    }

    public final void i(C0784h c0784h, C0784h c0784h2) {
        this.f6838k.put(c0784h, c0784h2);
        LinkedHashMap linkedHashMap = this.f6839l;
        if (linkedHashMap.get(c0784h2) == null) {
            linkedHashMap.put(c0784h2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0784h2);
        Z1.i.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ee, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f5, code lost:
    
        if (r28.f6967i == r3.f6967i) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        if (r15.equals(r6) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        r3 = new M1.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (M1.m.b0(r12) < r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        r6 = (q1.C0784h) M1.r.k0(r12);
        r(r6);
        r13 = new q1.C0784h(r6.f6894d, r6.f6895e, r6.f6895e.b(r29), r6.f6897g, r6.f6898h, r6.f6899i, r6.f6900j);
        r13.f6897g = r6.f6897g;
        r13.h(r6.f6904n);
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
    
        r6 = (q1.C0784h) r4.next();
        r7 = r6.f6895e.f6963e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0163, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
    
        i(r6, e(r7.f6967i));
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
    
        r4 = (q1.C0784h) r3.next();
        r6 = r10.b(r4.f6895e.f6962d);
        r7 = r4.f6895e;
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
    
        e2.AbstractC0381e.G(q1.C0778b.f6886o);
        r6.c(r7);
        r6 = r6.b();
        r7 = r6.f6912a;
        r7.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r8 = M1.l.D0((java.util.Collection) ((n2.C0692Q) r6.f6916e.f6272d).getValue());
        r11 = r8.listIterator(r8.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
    
        if (r11.hasPrevious() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d0, code lost:
    
        if (Z1.i.a(((q1.C0784h) r11.previous()).f6899i, r4.f6899i) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d2, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01da, code lost:
    
        r8.set(r11, r4);
        r4 = r6.f6913b;
        r4.getClass();
        r4.k(null, r8);
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
    public final void j(w wVar, Bundle bundle, G g3) {
        LinkedHashMap linkedHashMap;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        LinkedHashMap linkedHashMap2 = this.f6849w;
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            ((C0787k) it.next()).f6915d = true;
        }
        Z1.p pVar = new Z1.p();
        boolean m3 = (g3 == null || (i4 = g3.f6862c) == -1) ? false : m(i4, g3.f6863d, g3.f6864e);
        Bundle b2 = wVar.b(bundle);
        if (g3 != null && g3.f6861b && this.f6840m.containsKey(Integer.valueOf(wVar.f6967i))) {
            pVar.f3476d = q(wVar.f6967i, b2, g3);
            linkedHashMap = linkedHashMap2;
            z3 = m3;
            z4 = false;
        } else {
            K k3 = this.f6848v;
            if (g3 != null && g3.f6860a) {
                M1.j jVar = this.f6834g;
                C0784h c0784h = (C0784h) jVar.k();
                ListIterator listIterator = jVar.listIterator(jVar.b());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i3 = -1;
                        break;
                    } else if (((C0784h) listIterator.previous()).f6895e == wVar) {
                        i3 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i3 != -1) {
                    if (wVar instanceof z) {
                        int i5 = z.f6978q;
                        List e02 = g2.h.e0(new g2.l(g2.h.c0((z) wVar, C0778b.f6885n), C0778b.f6883l, 1));
                        if (jVar.f2799f - i3 == e02.size()) {
                            List subList = jVar.subList(i3, jVar.f2799f);
                            ArrayList arrayList = new ArrayList(M1.n.g0(subList, 10));
                            Iterator it2 = subList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((C0784h) it2.next()).f6895e.f6967i));
                            }
                        }
                    } else if (c0784h != null) {
                        w wVar2 = c0784h.f6895e;
                        if (wVar2 != null) {
                        }
                    }
                    if (!z4) {
                        C0784h c3 = C0523b.c(this.f6828a, wVar, b2, g(), this.p);
                        J b3 = k3.b(wVar.f6962d);
                        List M3 = AbstractC0157a.M(c3);
                        this.f6850x = new C0587a(pVar, this, wVar, b2);
                        b3.d(M3, g3);
                        this.f6850x = null;
                    }
                }
            }
            linkedHashMap = linkedHashMap2;
            z3 = m3;
            z4 = false;
            if (!z4) {
            }
        }
        t();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((C0787k) it3.next()).f6915d = false;
        }
        if (z3 || pVar.f3476d || z4) {
            b();
        } else {
            s();
        }
    }

    public final void l() {
        M1.j jVar = this.f6834g;
        if (jVar.isEmpty()) {
            return;
        }
        C0784h c0784h = (C0784h) jVar.k();
        w wVar = c0784h != null ? c0784h.f6895e : null;
        Z1.i.c(wVar);
        if (m(wVar.f6967i, true, false)) {
            b();
        }
    }

    public final boolean m(int i3, boolean z3, boolean z4) {
        w wVar;
        String str;
        String str2;
        M1.j jVar = this.f6834g;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = M1.l.x0(jVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                wVar = null;
                break;
            }
            w wVar2 = ((C0784h) it.next()).f6895e;
            J b2 = this.f6848v.b(wVar2.f6962d);
            if (z3 || wVar2.f6967i != i3) {
                arrayList.add(b2);
            }
            if (wVar2.f6967i == i3) {
                wVar = wVar2;
                break;
            }
        }
        if (wVar == null) {
            int i4 = w.f6961l;
            Log.i("NavController", "Ignoring popBackStack to destination " + g2.i.P(this.f6828a, i3) + " as it was not found on the current back stack");
            return false;
        }
        Z1.p pVar = new Z1.p();
        M1.j jVar2 = new M1.j();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            J j3 = (J) it2.next();
            Z1.p pVar2 = new Z1.p();
            C0784h c0784h = (C0784h) jVar.last();
            M1.j jVar3 = jVar;
            this.f6851y = new C0788l(pVar2, pVar, this, z4, jVar2);
            j3.e(c0784h, z4);
            str = null;
            this.f6851y = null;
            if (!pVar2.f3476d) {
                break;
            }
            jVar = jVar3;
        }
        if (z4) {
            LinkedHashMap linkedHashMap = this.f6840m;
            if (!z3) {
                C0409e c0409e = new C0409e(new g2.l(g2.h.c0(wVar, C0778b.f6880i), new m(this, 0), 0));
                while (c0409e.hasNext()) {
                    Integer valueOf = Integer.valueOf(((w) c0409e.next()).f6967i);
                    C0785i c0785i = (C0785i) (jVar2.isEmpty() ? str : jVar2.f2798e[jVar2.f2797d]);
                    linkedHashMap.put(valueOf, c0785i != null ? c0785i.f6906d : str);
                }
            }
            if (!jVar2.isEmpty()) {
                C0785i c0785i2 = (C0785i) jVar2.first();
                C0409e c0409e2 = new C0409e(new g2.l(g2.h.c0(c(c0785i2.f6907e), C0778b.f6881j), new m(this, 1), 0));
                while (true) {
                    boolean hasNext = c0409e2.hasNext();
                    str2 = c0785i2.f6906d;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((w) c0409e2.next()).f6967i), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    this.f6841n.put(str2, jVar2);
                }
            }
        }
        t();
        return pVar.f3476d;
    }

    public final void n(C0784h c0784h, boolean z3, M1.j jVar) {
        p pVar;
        C0676A c0676a;
        Set set;
        M1.j jVar2 = this.f6834g;
        C0784h c0784h2 = (C0784h) jVar2.last();
        if (!Z1.i.a(c0784h2, c0784h)) {
            throw new IllegalStateException(("Attempted to pop " + c0784h.f6895e + ", which is not the top of the back stack (" + c0784h2.f6895e + ')').toString());
        }
        M1.r.k0(jVar2);
        C0787k c0787k = (C0787k) this.f6849w.get(this.f6848v.b(c0784h2.f6895e.f6962d));
        boolean z4 = true;
        if ((c0787k == null || (c0676a = c0787k.f6917f) == null || (set = (Set) ((C0692Q) c0676a.f6272d).getValue()) == null || !set.contains(c0784h2)) && !this.f6839l.containsKey(c0784h2)) {
            z4 = false;
        }
        EnumC0230o enumC0230o = c0784h2.f6901k.f4041d;
        EnumC0230o enumC0230o2 = EnumC0230o.f4027f;
        if (enumC0230o.compareTo(enumC0230o2) >= 0) {
            if (z3) {
                c0784h2.h(enumC0230o2);
                jVar.addFirst(new C0785i(c0784h2));
            }
            if (z4) {
                c0784h2.h(enumC0230o2);
            } else {
                c0784h2.h(EnumC0230o.f4025d);
                r(c0784h2);
            }
        }
        if (z3 || z4 || (pVar = this.p) == null) {
            return;
        }
        String str = c0784h2.f6899i;
        Z1.i.f(str, "backStackEntryId");
        a0 a0Var = (a0) pVar.f6933b.remove(str);
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public final ArrayList p() {
        EnumC0230o enumC0230o;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6849w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0230o = EnumC0230o.f4028g;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C0692Q) ((C0787k) it.next()).f6917f.f6272d).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0784h c0784h = (C0784h) obj;
                if (!arrayList.contains(c0784h) && c0784h.f6904n.compareTo(enumC0230o) < 0) {
                    arrayList2.add(obj);
                }
            }
            M1.r.i0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f6834g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C0784h c0784h2 = (C0784h) next;
            if (!arrayList.contains(c0784h2) && c0784h2.f6904n.compareTo(enumC0230o) >= 0) {
                arrayList3.add(next);
            }
        }
        M1.r.i0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C0784h) next2).f6895e instanceof z)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i3, Bundle bundle, G g3) {
        w f3;
        C0784h c0784h;
        w wVar;
        LinkedHashMap linkedHashMap = this.f6840m;
        if (!linkedHashMap.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i3));
        Collection values = linkedHashMap.values();
        Z1.i.f(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (Z1.i.a((String) it.next(), str)) {
                it.remove();
            }
        }
        M1.j jVar = (M1.j) Z1.w.c(this.f6841n).remove(str);
        ArrayList arrayList = new ArrayList();
        C0784h c0784h2 = (C0784h) this.f6834g.k();
        if (c0784h2 == null || (f3 = c0784h2.f6895e) == null) {
            f3 = f();
        }
        if (jVar != null) {
            Iterator it2 = jVar.iterator();
            while (it2.hasNext()) {
                C0785i c0785i = (C0785i) it2.next();
                w d3 = d(f3, c0785i.f6907e, true);
                Context context = this.f6828a;
                if (d3 == null) {
                    int i4 = w.f6961l;
                    throw new IllegalStateException(("Restore State failed: destination " + g2.i.P(context, c0785i.f6907e) + " cannot be found from the current destination " + f3).toString());
                }
                arrayList.add(c0785i.a(context, d3, g(), this.p));
                f3 = d3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C0784h) next).f6895e instanceof z)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it4.hasNext()) {
                break;
            }
            C0784h c0784h3 = (C0784h) it4.next();
            List list = (List) M1.l.t0(arrayList2);
            if (list != null && (c0784h = (C0784h) M1.l.s0(list)) != null && (wVar = c0784h.f6895e) != null) {
                str2 = wVar.f6962d;
            }
            if (Z1.i.a(str2, c0784h3.f6895e.f6962d)) {
                list.add(c0784h3);
            } else {
                arrayList2.add(M1.m.e0(c0784h3));
            }
        }
        Z1.p pVar = new Z1.p();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            J b2 = this.f6848v.b(((C0784h) M1.l.m0(list2)).f6895e.f6962d);
            this.f6850x = new n(pVar, arrayList, new Z1.r(), this, bundle);
            b2.d(list2, g3);
            this.f6850x = null;
        }
        return pVar.f3476d;
    }

    public final void r(C0784h c0784h) {
        Z1.i.f(c0784h, "child");
        C0784h c0784h2 = (C0784h) this.f6838k.remove(c0784h);
        if (c0784h2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f6839l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0784h2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            C0787k c0787k = (C0787k) this.f6849w.get(this.f6848v.b(c0784h2.f6895e.f6962d));
            if (c0787k != null) {
                c0787k.b(c0784h2);
            }
            linkedHashMap.remove(c0784h2);
        }
    }

    public final void s() {
        AtomicInteger atomicInteger;
        C0676A c0676a;
        Set set;
        ArrayList D02 = M1.l.D0(this.f6834g);
        if (D02.isEmpty()) {
            return;
        }
        w wVar = ((C0784h) M1.l.s0(D02)).f6895e;
        ArrayList arrayList = new ArrayList();
        if (wVar instanceof InterfaceC0780d) {
            Iterator it = M1.l.x0(D02).iterator();
            while (it.hasNext()) {
                w wVar2 = ((C0784h) it.next()).f6895e;
                arrayList.add(wVar2);
                if (!(wVar2 instanceof InterfaceC0780d) && !(wVar2 instanceof z)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C0784h c0784h : M1.l.x0(D02)) {
            EnumC0230o enumC0230o = c0784h.f6904n;
            w wVar3 = c0784h.f6895e;
            EnumC0230o enumC0230o2 = EnumC0230o.f4029h;
            EnumC0230o enumC0230o3 = EnumC0230o.f4028g;
            if (wVar != null && wVar3.f6967i == wVar.f6967i) {
                if (enumC0230o != enumC0230o2) {
                    C0787k c0787k = (C0787k) this.f6849w.get(this.f6848v.b(wVar3.f6962d));
                    if (Z1.i.a((c0787k == null || (c0676a = c0787k.f6917f) == null || (set = (Set) ((C0692Q) c0676a.f6272d).getValue()) == null) ? null : Boolean.valueOf(set.contains(c0784h)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f6839l.get(c0784h)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(c0784h, enumC0230o3);
                    } else {
                        hashMap.put(c0784h, enumC0230o2);
                    }
                }
                w wVar4 = (w) M1.l.n0(arrayList);
                if (wVar4 != null && wVar4.f6967i == wVar3.f6967i) {
                    M1.r.j0(arrayList);
                }
                wVar = wVar.f6963e;
            } else if (arrayList.isEmpty() || wVar3.f6967i != ((w) M1.l.m0(arrayList)).f6967i) {
                c0784h.h(EnumC0230o.f4027f);
            } else {
                w wVar5 = (w) M1.r.j0(arrayList);
                if (enumC0230o == enumC0230o2) {
                    c0784h.h(enumC0230o3);
                } else if (enumC0230o != enumC0230o3) {
                    hashMap.put(c0784h, enumC0230o3);
                }
                z zVar = wVar5.f6963e;
                if (zVar != null && !arrayList.contains(zVar)) {
                    arrayList.add(zVar);
                }
            }
        }
        Iterator it2 = D02.iterator();
        while (it2.hasNext()) {
            C0784h c0784h2 = (C0784h) it2.next();
            EnumC0230o enumC0230o4 = (EnumC0230o) hashMap.get(c0784h2);
            if (enumC0230o4 != null) {
                c0784h2.h(enumC0230o4);
            } else {
                c0784h2.i();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y1.a, Z1.g] */
    public final void t() {
        int i3;
        boolean z3 = false;
        if (this.f6847u) {
            M1.j jVar = this.f6834g;
            if (jVar == null || !jVar.isEmpty()) {
                Iterator it = jVar.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (!(((C0784h) it.next()).f6895e instanceof z) && (i3 = i3 + 1) < 0) {
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
        D1.r rVar = this.f6846t;
        rVar.f4200a = z3;
        ?? r02 = rVar.f4202c;
        if (r02 != 0) {
            r02.b();
        }
    }
}
