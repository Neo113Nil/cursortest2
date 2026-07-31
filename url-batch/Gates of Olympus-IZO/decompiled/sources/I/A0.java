package I;

import F.C0047j0;
import android.util.Log;
import j.C0475A;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k2.C0536h;
import k2.C0547t;
import k2.InterfaceC0534f;
import n2.AbstractC0682G;
import n2.C0692Q;

/* loaded from: classes.dex */
public final class A0 extends r {

    /* renamed from: v, reason: collision with root package name */
    public static final C0692Q f2058v = AbstractC0682G.b(O.b.f2978g);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f2059w = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final C0095g f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2061b;

    /* renamed from: c, reason: collision with root package name */
    public k2.X f2062c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f2063d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2064e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2065f;

    /* renamed from: g, reason: collision with root package name */
    public C0475A f2066g;

    /* renamed from: h, reason: collision with root package name */
    public final K.d f2067h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2068i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2069j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2070k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f2071l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2072m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashSet f2073n;

    /* renamed from: o, reason: collision with root package name */
    public C0536h f2074o;
    public A2.g p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2075q;

    /* renamed from: r, reason: collision with root package name */
    public final C0692Q f2076r;

    /* renamed from: s, reason: collision with root package name */
    public final k2.Z f2077s;

    /* renamed from: t, reason: collision with root package name */
    public final P1.i f2078t;

    /* renamed from: u, reason: collision with root package name */
    public final X f2079u;

    public A0(P1.i iVar) {
        C0095g c0095g = new C0095g(new A2.l(9, this));
        this.f2060a = c0095g;
        this.f2061b = new Object();
        this.f2064e = new ArrayList();
        this.f2066g = new C0475A();
        this.f2067h = new K.d(new C0122u[16]);
        this.f2068i = new ArrayList();
        this.f2069j = new ArrayList();
        this.f2070k = new LinkedHashMap();
        this.f2071l = new LinkedHashMap();
        this.f2076r = AbstractC0682G.b(EnumC0121t0.f2362f);
        k2.Z z3 = new k2.Z((k2.X) iVar.k(C0547t.f5390e));
        z3.L(new C0047j0(5, this));
        this.f2077s = z3;
        this.f2078t = iVar.o(c0095g).o(z3);
        this.f2079u = new X(7);
    }

    public static /* synthetic */ void A(A0 a02, Exception exc, boolean z3, int i3) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        a02.z(exc, null, z3);
    }

    public static final C0122u p(A0 a02, C0122u c0122u, C0475A c0475a) {
        S.e B;
        if (c0122u.f2382t.f2295E || c0122u.f2383u) {
            return null;
        }
        LinkedHashSet linkedHashSet = a02.f2073n;
        if (linkedHashSet != null && linkedHashSet.contains(c0122u)) {
            return null;
        }
        C0047j0 c0047j0 = new C0047j0(6, c0122u);
        F.D0 d02 = new F.D0(c0122u, 5, c0475a);
        S.i k3 = S.q.k();
        S.e eVar = k3 instanceof S.e ? (S.e) k3 : null;
        if (eVar == null || (B = eVar.B(c0047j0, d02)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            S.i j3 = B.j();
            if (c0475a != null) {
                try {
                    if (c0475a.h()) {
                        C0125v0 c0125v0 = new C0125v0(c0475a, 0, c0122u);
                        C0113p c0113p = c0122u.f2382t;
                        if (c0113p.f2295E) {
                            C0089d.w("Preparing a composition while composing is not supported");
                            throw null;
                        }
                        c0113p.f2295E = true;
                        try {
                            c0125v0.b();
                            c0113p.f2295E = false;
                        } catch (Throwable th) {
                            c0113p.f2295E = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    S.i.p(j3);
                    throw th2;
                }
            }
            boolean u3 = c0122u.u();
            S.i.p(j3);
            if (!u3) {
                c0122u = null;
            }
            return c0122u;
        } finally {
            r(B);
        }
    }

    public static final boolean q(A0 a02) {
        boolean z3;
        List w3;
        synchronized (a02.f2061b) {
            z3 = true;
            if (!a02.f2066g.g()) {
                K.f fVar = new K.f(a02.f2066g);
                a02.f2066g = new C0475A();
                synchronized (a02.f2061b) {
                    w3 = a02.w();
                }
                try {
                    int size = w3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((C0122u) w3.get(i3)).v(fVar);
                        if (((EnumC0121t0) a02.f2076r.getValue()).compareTo(EnumC0121t0.f2361e) <= 0) {
                            break;
                        }
                    }
                    synchronized (a02.f2061b) {
                        a02.f2066g = new C0475A();
                    }
                    synchronized (a02.f2061b) {
                        if (a02.t() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        if (!a02.f2067h.m() && !a02.u()) {
                            z3 = false;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (a02.f2061b) {
                        C0475A c0475a = a02.f2066g;
                        c0475a.getClass();
                        for (Object obj : fVar) {
                            c0475a.f5130b[c0475a.d(obj)] = obj;
                        }
                        throw th;
                    }
                }
            } else if (!a02.f2067h.m() && !a02.u()) {
                z3 = false;
            }
        }
        return z3;
    }

    public static void r(S.e eVar) {
        try {
            if (eVar.v() instanceof S.j) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            eVar.c();
        }
    }

    public static final void x(ArrayList arrayList, A0 a02, C0122u c0122u) {
        arrayList.clear();
        synchronized (a02.f2061b) {
            Iterator it = a02.f2069j.iterator();
            if (it.hasNext()) {
                ((AbstractC0084a0) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void B(C0122u c0122u) {
        ArrayList arrayList = this.f2072m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f2072m = arrayList;
        }
        if (!arrayList.contains(c0122u)) {
            arrayList.add(c0122u);
        }
        this.f2064e.remove(c0122u);
        this.f2065f = null;
    }

    @Override // I.r
    public final void a(C0122u c0122u, Q.a aVar) {
        S.e B;
        boolean z3 = c0122u.f2382t.f2295E;
        try {
            C0047j0 c0047j0 = new C0047j0(6, c0122u);
            F.D0 d02 = new F.D0(c0122u, 5, null);
            S.i k3 = S.q.k();
            S.e eVar = k3 instanceof S.e ? (S.e) k3 : null;
            if (eVar == null || (B = eVar.B(c0047j0, d02)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                S.i j3 = B.j();
                try {
                    c0122u.i(aVar);
                    if (!z3) {
                        S.q.k().m();
                    }
                    synchronized (this.f2061b) {
                        if (((EnumC0121t0) this.f2076r.getValue()).compareTo(EnumC0121t0.f2361e) > 0 && !w().contains(c0122u)) {
                            this.f2064e.add(c0122u);
                            this.f2065f = null;
                        }
                    }
                    try {
                        synchronized (this.f2061b) {
                            ArrayList arrayList = this.f2069j;
                            if (arrayList.size() > 0) {
                                ((AbstractC0084a0) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            c0122u.d();
                            c0122u.f();
                            if (z3) {
                                return;
                            }
                            S.q.k().m();
                        } catch (Exception e3) {
                            A(this, e3, false, 6);
                        }
                    } catch (Exception e4) {
                        z(e4, c0122u, true);
                    }
                } finally {
                    S.i.p(j3);
                }
            } finally {
                r(B);
            }
        } catch (Exception e5) {
            z(e5, c0122u, true);
        }
    }

    @Override // I.r
    public final boolean c() {
        return ((Boolean) f2059w.get()).booleanValue();
    }

    @Override // I.r
    public final boolean d() {
        return false;
    }

    @Override // I.r
    public final boolean e() {
        return false;
    }

    @Override // I.r
    public final int g() {
        return 1000;
    }

    @Override // I.r
    public final P1.i h() {
        return this.f2078t;
    }

    @Override // I.r
    public final void i(C0122u c0122u) {
        InterfaceC0534f interfaceC0534f;
        synchronized (this.f2061b) {
            if (this.f2067h.i(c0122u)) {
                interfaceC0534f = null;
            } else {
                this.f2067h.b(c0122u);
                interfaceC0534f = t();
            }
        }
        if (interfaceC0534f != null) {
            ((C0536h) interfaceC0534f).resumeWith(L1.z.f2729a);
        }
    }

    @Override // I.r
    public final void l(C0122u c0122u) {
        synchronized (this.f2061b) {
            try {
                LinkedHashSet linkedHashSet = this.f2073n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f2073n = linkedHashSet;
                }
                linkedHashSet.add(c0122u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.r
    public final void o(C0122u c0122u) {
        synchronized (this.f2061b) {
            this.f2064e.remove(c0122u);
            this.f2065f = null;
            this.f2067h.n(c0122u);
            this.f2068i.remove(c0122u);
        }
    }

    public final void s() {
        synchronized (this.f2061b) {
            if (((EnumC0121t0) this.f2076r.getValue()).compareTo(EnumC0121t0.f2364h) >= 0) {
                C0692Q c0692q = this.f2076r;
                EnumC0121t0 enumC0121t0 = EnumC0121t0.f2361e;
                c0692q.getClass();
                c0692q.k(null, enumC0121t0);
            }
        }
        this.f2077s.a(null);
    }

    public final InterfaceC0534f t() {
        C0692Q c0692q = this.f2076r;
        int compareTo = ((EnumC0121t0) c0692q.getValue()).compareTo(EnumC0121t0.f2361e);
        ArrayList arrayList = this.f2069j;
        ArrayList arrayList2 = this.f2068i;
        K.d dVar = this.f2067h;
        if (compareTo <= 0) {
            this.f2064e.clear();
            this.f2065f = M1.u.f2803d;
            this.f2066g = new C0475A();
            dVar.h();
            arrayList2.clear();
            arrayList.clear();
            this.f2072m = null;
            C0536h c0536h = this.f2074o;
            if (c0536h != null) {
                c0536h.v(null);
            }
            this.f2074o = null;
            this.p = null;
            return null;
        }
        A2.g gVar = this.p;
        EnumC0121t0 enumC0121t0 = EnumC0121t0.f2365i;
        EnumC0121t0 enumC0121t02 = EnumC0121t0.f2362f;
        if (gVar == null) {
            if (this.f2062c == null) {
                this.f2066g = new C0475A();
                dVar.h();
                if (u()) {
                    enumC0121t02 = EnumC0121t0.f2363g;
                }
            } else {
                enumC0121t02 = (dVar.m() || this.f2066g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || u()) ? enumC0121t0 : EnumC0121t0.f2364h;
            }
        }
        c0692q.getClass();
        c0692q.k(null, enumC0121t02);
        if (enumC0121t02 != enumC0121t0) {
            return null;
        }
        C0536h c0536h2 = this.f2074o;
        this.f2074o = null;
        return c0536h2;
    }

    public final boolean u() {
        return (this.f2075q || this.f2060a.f2256i.get() == 0) ? false : true;
    }

    public final boolean v() {
        boolean z3;
        synchronized (this.f2061b) {
            if (!this.f2066g.h() && !this.f2067h.m()) {
                z3 = u();
            }
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List w() {
        Object obj = this.f2065f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f2064e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? M1.u.f2803d : new ArrayList(arrayList);
            this.f2065f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        if (r4 >= r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
    
        if (((L1.j) r10.get(r4)).f2709e == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
    
        if (r8 >= r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        r11 = (L1.j) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
    
        if (r11.f2709e != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        r11 = (I.AbstractC0084a0) r11.f2708d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        r4 = r18.f2061b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0119, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011a, code lost:
    
        M1.r.i0(r3, r18.f2069j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r8 >= r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        if (((L1.j) r11).f2709e == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013e, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0141, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List y(List list, C0475A c0475a) {
        S.e B;
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = list.get(i3);
            ((AbstractC0084a0) obj2).getClass();
            Object obj3 = hashMap.get(null);
            if (obj3 == null) {
                obj3 = new ArrayList();
                hashMap.put(null, obj3);
            }
            ((ArrayList) obj3).add(obj2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C0122u c0122u = (C0122u) entry.getKey();
            List list2 = (List) entry.getValue();
            C0089d.O(!c0122u.f2382t.f2295E);
            C0047j0 c0047j0 = new C0047j0(6, c0122u);
            F.D0 d02 = new F.D0(c0122u, 5, c0475a);
            S.i k3 = S.q.k();
            S.e eVar = k3 instanceof S.e ? (S.e) k3 : null;
            if (eVar == null || (B = eVar.B(c0047j0, d02)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                S.i j3 = B.j();
                try {
                    synchronized (this.f2061b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            AbstractC0084a0 abstractC0084a0 = (AbstractC0084a0) list2.get(i4);
                            LinkedHashMap linkedHashMap = this.f2070k;
                            abstractC0084a0.getClass();
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 != null) {
                                Object j02 = M1.r.j0(list3);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(null);
                                }
                                obj = j02;
                            } else {
                                obj = null;
                            }
                            arrayList.add(new L1.j(abstractC0084a0, obj));
                        }
                    }
                    int size3 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            break;
                        }
                        if (((L1.j) arrayList.get(i5)).f2709e != null) {
                            break;
                        }
                        i5++;
                    }
                    c0122u.o(arrayList);
                    S.i.p(j3);
                } catch (Throwable th) {
                    S.i.p(j3);
                    throw th;
                }
            } finally {
                r(B);
            }
        }
        return M1.l.C0(hashMap.keySet());
    }

    public final void z(Exception exc, C0122u c0122u, boolean z3) {
        int i3 = 9;
        if (!((Boolean) f2059w.get()).booleanValue() || (exc instanceof C0103k)) {
            synchronized (this.f2061b) {
                A2.g gVar = this.p;
                if (gVar != null) {
                    throw ((Exception) gVar.f83b);
                }
                this.p = new A2.g(i3, exc);
            }
            throw exc;
        }
        synchronized (this.f2061b) {
            try {
                int i4 = AbstractC0085b.f2235b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f2068i.clear();
                this.f2067h.h();
                this.f2066g = new C0475A();
                this.f2069j.clear();
                this.f2070k.clear();
                this.f2071l.clear();
                this.p = new A2.g(i3, exc);
                if (c0122u != null) {
                    B(c0122u);
                }
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.r
    public final void j(Set set) {
    }
}
