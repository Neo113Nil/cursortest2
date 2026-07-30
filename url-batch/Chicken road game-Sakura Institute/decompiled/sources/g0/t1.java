package g0;

import android.util.Log;
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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t1 extends r {

    /* renamed from: v, reason: collision with root package name */
    public static final f7.q0 f3905v = f7.f0.c(m0.b.f6291i);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f3906w = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final g f3907a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3908b;

    /* renamed from: c, reason: collision with root package name */
    public c7.x0 f3909c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f3910d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3911e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3912f;

    /* renamed from: g, reason: collision with root package name */
    public i.b0 f3913g;

    /* renamed from: h, reason: collision with root package name */
    public final i0.d f3914h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3915i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3916j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f3917k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f3918l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3919m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashSet f3920n;

    /* renamed from: o, reason: collision with root package name */
    public c7.h f3921o;

    /* renamed from: p, reason: collision with root package name */
    public b6.c f3922p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3923q;

    /* renamed from: r, reason: collision with root package name */
    public final f7.q0 f3924r;

    /* renamed from: s, reason: collision with root package name */
    public final c7.z0 f3925s;

    /* renamed from: t, reason: collision with root package name */
    public final h6.i f3926t;

    /* renamed from: u, reason: collision with root package name */
    public final t0 f3927u;

    public t1(h6.i iVar) {
        g gVar = new g(new androidx.lifecycle.r0(8, this));
        this.f3907a = gVar;
        this.f3908b = new Object();
        this.f3911e = new ArrayList();
        this.f3913g = new i.b0();
        this.f3914h = new i0.d(new u[16]);
        this.f3915i = new ArrayList();
        this.f3916j = new ArrayList();
        this.f3917k = new LinkedHashMap();
        this.f3918l = new LinkedHashMap();
        this.f3924r = f7.f0.c(q1.f3862h);
        c7.z0 z0Var = new c7.z0((c7.x0) iVar.u(c7.u.f1748g));
        z0Var.I(new c1.a(7, this));
        this.f3925s = z0Var;
        this.f3926t = iVar.z(gVar).z(z0Var);
        this.f3927u = new t0(8);
    }

    public static final u p(t1 t1Var, u uVar, i.b0 b0Var) {
        LinkedHashSet linkedHashSet;
        q0.c B;
        if (!uVar.f3944v.E && !uVar.f3945w && ((linkedHashSet = t1Var.f3920n) == null || !linkedHashSet.contains(uVar))) {
            c1.a aVar = new c1.a(8, uVar);
            a0.y yVar = new a0.y(uVar, 10, b0Var);
            q0.g k8 = q0.n.k();
            q0.c cVar = k8 instanceof q0.c ? (q0.c) k8 : null;
            if (cVar == null || (B = cVar.B(aVar, yVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                q0.g j8 = B.j();
                if (b0Var != null) {
                    try {
                        if (b0Var.h()) {
                            a0.b1 b1Var = new a0.b1(b0Var, 1, uVar);
                            p pVar = uVar.f3944v;
                            if (pVar.E) {
                                d.w("Preparing a composition while composing is not supported");
                                throw null;
                            }
                            pVar.E = true;
                            try {
                                b1Var.a();
                                pVar.E = false;
                            } catch (Throwable th) {
                                pVar.E = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        q0.g.p(j8);
                        throw th2;
                    }
                }
                boolean t2 = uVar.t();
                q0.g.p(j8);
                if (t2) {
                    return uVar;
                }
            } finally {
                r(B);
            }
        }
        return null;
    }

    public static final boolean q(t1 t1Var) {
        List w4;
        synchronized (t1Var.f3908b) {
            boolean z8 = true;
            if (t1Var.f3913g.g()) {
                if (!t1Var.f3914h.m() && !t1Var.u()) {
                    z8 = false;
                }
                return z8;
            }
            i0.f fVar = new i0.f(t1Var.f3913g);
            t1Var.f3913g = new i.b0();
            synchronized (t1Var.f3908b) {
                w4 = t1Var.w();
            }
            try {
                int size = w4.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((u) w4.get(i7)).u(fVar);
                    if (((q1) t1Var.f3924r.getValue()).compareTo(q1.f3861g) <= 0) {
                        break;
                    }
                }
                synchronized (t1Var.f3908b) {
                    t1Var.f3913g = new i.b0();
                }
                synchronized (t1Var.f3908b) {
                    if (t1Var.t() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (!t1Var.f3914h.m() && !t1Var.u()) {
                        z8 = false;
                    }
                }
                return z8;
            } catch (Throwable th) {
                synchronized (t1Var.f3908b) {
                    i.b0 b0Var = t1Var.f3913g;
                    b0Var.getClass();
                    for (Object obj : fVar) {
                        b0Var.f4722b[b0Var.d(obj)] = obj;
                    }
                    throw th;
                }
            }
        }
    }

    public static void r(q0.c cVar) {
        try {
            if (cVar.v() instanceof q0.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.c();
        }
    }

    public static final void x(ArrayList arrayList, t1 t1Var, u uVar) {
        arrayList.clear();
        synchronized (t1Var.f3908b) {
            Iterator it = t1Var.f3916j.iterator();
            if (it.hasNext()) {
                ((x0) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void A(u uVar) {
        ArrayList arrayList = this.f3919m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f3919m = arrayList;
        }
        if (!arrayList.contains(uVar)) {
            arrayList.add(uVar);
        }
        this.f3911e.remove(uVar);
        this.f3912f = null;
    }

    @Override // g0.r
    public final void a(u uVar, o0.a aVar) {
        q0.c B;
        boolean z8 = uVar.f3944v.E;
        try {
            c1.a aVar2 = new c1.a(8, uVar);
            a0.y yVar = new a0.y(uVar, 10, null);
            q0.g k8 = q0.n.k();
            q0.c cVar = k8 instanceof q0.c ? (q0.c) k8 : null;
            if (cVar == null || (B = cVar.B(aVar2, yVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                q0.g j8 = B.j();
                try {
                    uVar.i(aVar);
                    if (!z8) {
                        q0.n.k().m();
                    }
                    synchronized (this.f3908b) {
                        if (((q1) this.f3924r.getValue()).compareTo(q1.f3861g) > 0 && !w().contains(uVar)) {
                            this.f3911e.add(uVar);
                            this.f3912f = null;
                        }
                    }
                    try {
                        synchronized (this.f3908b) {
                            ArrayList arrayList = this.f3916j;
                            if (arrayList.size() > 0) {
                                ((x0) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            uVar.d();
                            uVar.f();
                            if (z8) {
                                return;
                            }
                            q0.n.k().m();
                        } catch (Exception e9) {
                            z(e9, null);
                        }
                    } catch (Exception e10) {
                        z(e10, uVar);
                    }
                } finally {
                    q0.g.p(j8);
                }
            } finally {
                r(B);
            }
        } catch (Exception e11) {
            z(e11, uVar);
        }
    }

    @Override // g0.r
    public final boolean c() {
        return ((Boolean) f3906w.get()).booleanValue();
    }

    @Override // g0.r
    public final boolean d() {
        return false;
    }

    @Override // g0.r
    public final boolean e() {
        return false;
    }

    @Override // g0.r
    public final int g() {
        return 1000;
    }

    @Override // g0.r
    public final h6.i h() {
        return this.f3926t;
    }

    @Override // g0.r
    public final void i(u uVar) {
        c7.f fVar;
        synchronized (this.f3908b) {
            if (this.f3914h.i(uVar)) {
                fVar = null;
            } else {
                this.f3914h.b(uVar);
                fVar = t();
            }
        }
        if (fVar != null) {
            ((c7.h) fVar).resumeWith(d6.z.f2639a);
        }
    }

    @Override // g0.r
    public final void l(u uVar) {
        synchronized (this.f3908b) {
            try {
                LinkedHashSet linkedHashSet = this.f3920n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f3920n = linkedHashSet;
                }
                linkedHashSet.add(uVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g0.r
    public final void o(u uVar) {
        synchronized (this.f3908b) {
            this.f3911e.remove(uVar);
            this.f3912f = null;
            this.f3914h.n(uVar);
            this.f3915i.remove(uVar);
        }
    }

    public final void s() {
        synchronized (this.f3908b) {
            if (((q1) this.f3924r.getValue()).compareTo(q1.f3864j) >= 0) {
                f7.q0 q0Var = this.f3924r;
                q1 q1Var = q1.f3861g;
                q0Var.getClass();
                q0Var.l(null, q1Var);
            }
        }
        this.f3925s.c(null);
    }

    public final c7.f t() {
        f7.q0 q0Var = this.f3924r;
        int compareTo = ((q1) q0Var.getValue()).compareTo(q1.f3861g);
        ArrayList arrayList = this.f3916j;
        ArrayList arrayList2 = this.f3915i;
        i0.d dVar = this.f3914h;
        if (compareTo <= 0) {
            this.f3911e.clear();
            this.f3912f = e6.u.f2826f;
            this.f3913g = new i.b0();
            dVar.h();
            arrayList2.clear();
            arrayList.clear();
            this.f3919m = null;
            c7.h hVar = this.f3921o;
            if (hVar != null) {
                hVar.g(null);
            }
            this.f3921o = null;
            this.f3922p = null;
            return null;
        }
        b6.c cVar = this.f3922p;
        q1 q1Var = q1.f3865k;
        q1 q1Var2 = q1.f3862h;
        if (cVar == null) {
            if (this.f3909c == null) {
                this.f3913g = new i.b0();
                dVar.h();
                if (u()) {
                    q1Var2 = q1.f3863i;
                }
            } else {
                q1Var2 = (dVar.m() || this.f3913g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || u()) ? q1Var : q1.f3864j;
            }
        }
        q0Var.getClass();
        q0Var.l(null, q1Var2);
        if (q1Var2 != q1Var) {
            return null;
        }
        c7.h hVar2 = this.f3921o;
        this.f3921o = null;
        return hVar2;
    }

    public final boolean u() {
        return (this.f3923q || this.f3907a.f3730k.get() == 0) ? false : true;
    }

    public final boolean v() {
        boolean z8;
        synchronized (this.f3908b) {
            if (!this.f3913g.h() && !this.f3914h.m()) {
                z8 = u();
            }
        }
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List w() {
        Object obj = this.f3912f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f3911e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? e6.u.f2826f : new ArrayList(arrayList);
            this.f3912f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r4 >= r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        if (((d6.j) r10.get(r4)).f2619g == null) goto L97;
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
    
        if (r8 >= r4) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        r11 = (d6.j) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        if (r11.f2619g != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
    
        r11 = (g0.x0) r11.f2618f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r4 = r18.f3908b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        e6.r.c0(r3, r18.f3916j);
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
    
        if (r8 >= r4) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0132, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
    
        if (((d6.j) r11).f2619g == null) goto L104;
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
    public final List y(List list, i.b0 b0Var) {
        q0.c B;
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = list.get(i7);
            ((x0) obj2).getClass();
            Object obj3 = hashMap.get(null);
            if (obj3 == null) {
                obj3 = new ArrayList();
                hashMap.put(null, obj3);
            }
            ((ArrayList) obj3).add(obj2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            u uVar = (u) entry.getKey();
            List list2 = (List) entry.getValue();
            d.O(!uVar.f3944v.E);
            c1.a aVar = new c1.a(8, uVar);
            a0.y yVar = new a0.y(uVar, 10, b0Var);
            q0.g k8 = q0.n.k();
            q0.c cVar = k8 instanceof q0.c ? (q0.c) k8 : null;
            if (cVar == null || (B = cVar.B(aVar, yVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                q0.g j8 = B.j();
                try {
                    synchronized (this.f3908b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            x0 x0Var = (x0) list2.get(i8);
                            LinkedHashMap linkedHashMap = this.f3917k;
                            x0Var.getClass();
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 != null) {
                                Object d02 = e6.r.d0(list3);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(null);
                                }
                                obj = d02;
                            } else {
                                obj = null;
                            }
                            arrayList.add(new d6.j(x0Var, obj));
                        }
                    }
                    int size3 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size3) {
                            break;
                        }
                        if (((d6.j) arrayList.get(i9)).f2619g != null) {
                            break;
                        }
                        i9++;
                    }
                    uVar.o(arrayList);
                    q0.g.p(j8);
                } catch (Throwable th) {
                    q0.g.p(j8);
                    throw th;
                }
            } finally {
                r(B);
            }
        }
        return e6.l.w0(hashMap.keySet());
    }

    public final void z(Exception exc, u uVar) {
        int i7 = 15;
        if (!((Boolean) f3906w.get()).booleanValue() || (exc instanceof k)) {
            synchronized (this.f3908b) {
                b6.c cVar = this.f3922p;
                if (cVar != null) {
                    throw ((Exception) cVar.f1394g);
                }
                this.f3922p = new b6.c(i7, exc);
            }
            throw exc;
        }
        synchronized (this.f3908b) {
            try {
                int i8 = b.f3689b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f3915i.clear();
                this.f3914h.h();
                this.f3913g = new i.b0();
                this.f3916j.clear();
                this.f3917k.clear();
                this.f3918l.clear();
                this.f3922p = new b6.c(i7, exc);
                if (uVar != null) {
                    A(uVar);
                }
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g0.r
    public final void j(Set set) {
    }
}
