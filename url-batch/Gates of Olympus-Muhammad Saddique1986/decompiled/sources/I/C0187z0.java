package I;

import B.C0022x;
import S.C0221e;
import android.util.Log;
import j.C0519A;
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
import q2.C0821h;
import q2.C0832t;
import q2.InterfaceC0819f;
import t2.AbstractC1035F;
import t2.C1045P;

/* renamed from: I.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187z0 extends r {

    /* renamed from: v, reason: collision with root package name */
    public static final C1045P f2982v = AbstractC1035F.c(O.b.f3717g);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f2983w = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final C0149g f2984a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2985b;

    /* renamed from: c, reason: collision with root package name */
    public q2.X f2986c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f2987d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2988e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2989f;

    /* renamed from: g, reason: collision with root package name */
    public C0519A f2990g;

    /* renamed from: h, reason: collision with root package name */
    public final K.d f2991h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2992i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2993j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2994k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f2995l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2996m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashSet f2997n;

    /* renamed from: o, reason: collision with root package name */
    public C0821h f2998o;

    /* renamed from: p, reason: collision with root package name */
    public B.Y f2999p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3000q;

    /* renamed from: r, reason: collision with root package name */
    public final C1045P f3001r;

    /* renamed from: s, reason: collision with root package name */
    public final q2.Z f3002s;

    /* renamed from: t, reason: collision with root package name */
    public final V1.i f3003t;

    /* renamed from: u, reason: collision with root package name */
    public final W f3004u;

    public C0187z0(V1.i iVar) {
        C0149g c0149g = new C0149g(new A.h(8, this));
        this.f2984a = c0149g;
        this.f2985b = new Object();
        this.f2988e = new ArrayList();
        this.f2990g = new C0519A();
        this.f2991h = new K.d(new C0176u[16]);
        this.f2992i = new ArrayList();
        this.f2993j = new ArrayList();
        this.f2994k = new LinkedHashMap();
        this.f2995l = new LinkedHashMap();
        this.f3001r = AbstractC1035F.c(EnumC0175t0.f2921f);
        q2.Z z3 = new q2.Z((q2.X) iVar.v(C0832t.f7929e));
        z3.x(new A0.l(7, this));
        this.f3002s = z3;
        this.f3003t = iVar.d(c0149g).d(z3);
        this.f3004u = new W(7);
    }

    public static /* synthetic */ void A(C0187z0 c0187z0, Exception exc, boolean z3, int i3) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        c0187z0.z(exc, null, z3);
    }

    public static final C0176u p(C0187z0 c0187z0, C0176u c0176u, C0519A c0519a) {
        C0221e B3;
        if (c0176u.f2942t.f2853E || c0176u.f2943u) {
            return null;
        }
        LinkedHashSet linkedHashSet = c0187z0.f2997n;
        if (linkedHashSet != null && linkedHashSet.contains(c0176u)) {
            return null;
        }
        A0.l lVar = new A0.l(8, c0176u);
        C0022x c0022x = new C0022x(c0176u, 9, c0519a);
        S.i k3 = S.p.k();
        C0221e c0221e = k3 instanceof C0221e ? (C0221e) k3 : null;
        if (c0221e == null || (B3 = c0221e.B(lVar, c0022x)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            S.i j3 = B3.j();
            if (c0519a != null) {
                try {
                    if (c0519a.h()) {
                        B.f0 f0Var = new B.f0(c0519a, 1, c0176u);
                        C0167p c0167p = c0176u.f2942t;
                        if (c0167p.f2853E) {
                            C0143d.w("Preparing a composition while composing is not supported");
                            throw null;
                        }
                        c0167p.f2853E = true;
                        try {
                            f0Var.b();
                            c0167p.f2853E = false;
                        } catch (Throwable th) {
                            c0167p.f2853E = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    S.i.p(j3);
                    throw th2;
                }
            }
            boolean u3 = c0176u.u();
            S.i.p(j3);
            if (!u3) {
                c0176u = null;
            }
            return c0176u;
        } finally {
            r(B3);
        }
    }

    public static final boolean q(C0187z0 c0187z0) {
        boolean z3;
        List w2;
        synchronized (c0187z0.f2985b) {
            z3 = true;
            if (!c0187z0.f2990g.g()) {
                K.f fVar = new K.f(c0187z0.f2990g);
                c0187z0.f2990g = new C0519A();
                synchronized (c0187z0.f2985b) {
                    w2 = c0187z0.w();
                }
                try {
                    int size = w2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((C0176u) w2.get(i3)).v(fVar);
                        if (((EnumC0175t0) c0187z0.f3001r.getValue()).compareTo(EnumC0175t0.f2920e) <= 0) {
                            break;
                        }
                    }
                    synchronized (c0187z0.f2985b) {
                        c0187z0.f2990g = new C0519A();
                    }
                    synchronized (c0187z0.f2985b) {
                        if (c0187z0.t() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        if (!c0187z0.f2991h.m() && !c0187z0.u()) {
                            z3 = false;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (c0187z0.f2985b) {
                        C0519A c0519a = c0187z0.f2990g;
                        c0519a.getClass();
                        for (Object obj : fVar) {
                            c0519a.f6248b[c0519a.d(obj)] = obj;
                        }
                        throw th;
                    }
                }
            } else if (!c0187z0.f2991h.m() && !c0187z0.u()) {
                z3 = false;
            }
        }
        return z3;
    }

    public static void r(C0221e c0221e) {
        try {
            if (c0221e.v() instanceof S.j) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c0221e.c();
        }
    }

    public static final void x(ArrayList arrayList, C0187z0 c0187z0, C0176u c0176u) {
        arrayList.clear();
        synchronized (c0187z0.f2985b) {
            Iterator it = c0187z0.f2993j.iterator();
            if (it.hasNext()) {
                ((AbstractC0138a0) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void B(C0176u c0176u) {
        ArrayList arrayList = this.f2996m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f2996m = arrayList;
        }
        if (!arrayList.contains(c0176u)) {
            arrayList.add(c0176u);
        }
        this.f2988e.remove(c0176u);
        this.f2989f = null;
    }

    @Override // I.r
    public final void a(C0176u c0176u, Q.a aVar) {
        C0221e B3;
        boolean z3 = c0176u.f2942t.f2853E;
        try {
            A0.l lVar = new A0.l(8, c0176u);
            C0022x c0022x = new C0022x(c0176u, 9, null);
            S.i k3 = S.p.k();
            C0221e c0221e = k3 instanceof C0221e ? (C0221e) k3 : null;
            if (c0221e == null || (B3 = c0221e.B(lVar, c0022x)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                S.i j3 = B3.j();
                try {
                    c0176u.i(aVar);
                    if (!z3) {
                        S.p.k().m();
                    }
                    synchronized (this.f2985b) {
                        if (((EnumC0175t0) this.f3001r.getValue()).compareTo(EnumC0175t0.f2920e) > 0 && !w().contains(c0176u)) {
                            this.f2988e.add(c0176u);
                            this.f2989f = null;
                        }
                    }
                    try {
                        synchronized (this.f2985b) {
                            ArrayList arrayList = this.f2993j;
                            if (arrayList.size() > 0) {
                                ((AbstractC0138a0) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            c0176u.d();
                            c0176u.f();
                            if (z3) {
                                return;
                            }
                            S.p.k().m();
                        } catch (Exception e3) {
                            A(this, e3, false, 6);
                        }
                    } catch (Exception e4) {
                        z(e4, c0176u, true);
                    }
                } finally {
                    S.i.p(j3);
                }
            } finally {
                r(B3);
            }
        } catch (Exception e5) {
            z(e5, c0176u, true);
        }
    }

    @Override // I.r
    public final boolean c() {
        return ((Boolean) f2983w.get()).booleanValue();
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
    public final V1.i h() {
        return this.f3003t;
    }

    @Override // I.r
    public final void i(C0176u c0176u) {
        InterfaceC0819f interfaceC0819f;
        synchronized (this.f2985b) {
            if (this.f2991h.i(c0176u)) {
                interfaceC0819f = null;
            } else {
                this.f2991h.b(c0176u);
                interfaceC0819f = t();
            }
        }
        if (interfaceC0819f != null) {
            ((C0821h) interfaceC0819f).u(R1.y.f4171a);
        }
    }

    @Override // I.r
    public final void l(C0176u c0176u) {
        synchronized (this.f2985b) {
            try {
                LinkedHashSet linkedHashSet = this.f2997n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f2997n = linkedHashSet;
                }
                linkedHashSet.add(c0176u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.r
    public final void o(C0176u c0176u) {
        synchronized (this.f2985b) {
            this.f2988e.remove(c0176u);
            this.f2989f = null;
            this.f2991h.n(c0176u);
            this.f2992i.remove(c0176u);
        }
    }

    public final void s() {
        synchronized (this.f2985b) {
            if (((EnumC0175t0) this.f3001r.getValue()).compareTo(EnumC0175t0.f2923h) >= 0) {
                C1045P c1045p = this.f3001r;
                EnumC0175t0 enumC0175t0 = EnumC0175t0.f2920e;
                c1045p.getClass();
                c1045p.l(null, enumC0175t0);
            }
        }
        this.f3002s.a(null);
    }

    public final InterfaceC0819f t() {
        C1045P c1045p = this.f3001r;
        int compareTo = ((EnumC0175t0) c1045p.getValue()).compareTo(EnumC0175t0.f2920e);
        ArrayList arrayList = this.f2993j;
        ArrayList arrayList2 = this.f2992i;
        K.d dVar = this.f2991h;
        if (compareTo <= 0) {
            this.f2988e.clear();
            this.f2989f = S1.u.f4320d;
            this.f2990g = new C0519A();
            dVar.h();
            arrayList2.clear();
            arrayList.clear();
            this.f2996m = null;
            C0821h c0821h = this.f2998o;
            if (c0821h != null) {
                c0821h.C(null);
            }
            this.f2998o = null;
            this.f2999p = null;
            return null;
        }
        B.Y y3 = this.f2999p;
        EnumC0175t0 enumC0175t0 = EnumC0175t0.f2924i;
        EnumC0175t0 enumC0175t02 = EnumC0175t0.f2921f;
        if (y3 == null) {
            if (this.f2986c == null) {
                this.f2990g = new C0519A();
                dVar.h();
                if (u()) {
                    enumC0175t02 = EnumC0175t0.f2922g;
                }
            } else {
                enumC0175t02 = (dVar.m() || this.f2990g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || u()) ? enumC0175t0 : EnumC0175t0.f2923h;
            }
        }
        c1045p.getClass();
        c1045p.l(null, enumC0175t02);
        if (enumC0175t02 != enumC0175t0) {
            return null;
        }
        C0821h c0821h2 = this.f2998o;
        this.f2998o = null;
        return c0821h2;
    }

    public final boolean u() {
        return (this.f3000q || this.f2984a.f2813i.get() == 0) ? false : true;
    }

    public final boolean v() {
        boolean z3;
        synchronized (this.f2985b) {
            if (!this.f2990g.h() && !this.f2991h.m()) {
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
        Object obj = this.f2989f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f2988e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? S1.u.f4320d : new ArrayList(arrayList);
            this.f2989f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r4 >= r3) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        if (((R1.i) r10.get(r4)).f4151e == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        if (r8 >= r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        r11 = (R1.i) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        if (r11.f4151e != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
    
        r11 = (I.AbstractC0138a0) r11.f4150d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r4 = r18.f2985b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        S1.r.G0(r3, r18.f2993j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0122, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0130, code lost:
    
        if (r8 >= r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0132, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
    
        if (((R1.i) r11).f4151e == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013d, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List y(List list, C0519A c0519a) {
        C0221e B3;
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = list.get(i3);
            ((AbstractC0138a0) obj2).getClass();
            Object obj3 = hashMap.get(null);
            if (obj3 == null) {
                obj3 = new ArrayList();
                hashMap.put(null, obj3);
            }
            ((ArrayList) obj3).add(obj2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C0176u c0176u = (C0176u) entry.getKey();
            List list2 = (List) entry.getValue();
            C0143d.P(!c0176u.f2942t.f2853E);
            A0.l lVar = new A0.l(8, c0176u);
            C0022x c0022x = new C0022x(c0176u, 9, c0519a);
            S.i k3 = S.p.k();
            C0221e c0221e = k3 instanceof C0221e ? (C0221e) k3 : null;
            if (c0221e == null || (B3 = c0221e.B(lVar, c0022x)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                S.i j3 = B3.j();
                try {
                    synchronized (this.f2985b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            AbstractC0138a0 abstractC0138a0 = (AbstractC0138a0) list2.get(i4);
                            LinkedHashMap linkedHashMap = this.f2994k;
                            abstractC0138a0.getClass();
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 != null) {
                                Object H02 = S1.r.H0(list3);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(null);
                                }
                                obj = H02;
                            } else {
                                obj = null;
                            }
                            arrayList.add(new R1.i(abstractC0138a0, obj));
                        }
                    }
                    int size3 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            break;
                        }
                        if (((R1.i) arrayList.get(i5)).f4151e != null) {
                            break;
                        }
                        i5++;
                    }
                    c0176u.o(arrayList);
                    S.i.p(j3);
                } catch (Throwable th) {
                    S.i.p(j3);
                    throw th;
                }
            } finally {
                r(B3);
            }
        }
        return S1.l.a1(hashMap.keySet());
    }

    public final void z(Exception exc, C0176u c0176u, boolean z3) {
        if (!((Boolean) f2983w.get()).booleanValue() || (exc instanceof C0157k)) {
            synchronized (this.f2985b) {
                B.Y y3 = this.f2999p;
                if (y3 != null) {
                    throw ((Exception) y3.f334d);
                }
                this.f2999p = new B.Y(exc);
            }
            throw exc;
        }
        synchronized (this.f2985b) {
            try {
                int i3 = AbstractC0139b.f2792b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f2992i.clear();
                this.f2991h.h();
                this.f2990g = new C0519A();
                this.f2993j.clear();
                this.f2994k.clear();
                this.f2995l.clear();
                this.f2999p = new B.Y(exc);
                if (c0176u != null) {
                    B(c0176u);
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
