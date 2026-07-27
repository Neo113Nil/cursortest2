package G;

import A.C0028y;
import Q.AbstractC0274j;
import Q.C0269e;
import W2.C0286h;
import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0284f;
import android.util.Log;
import i.C0661B;
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
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;
import y2.AbstractC1341p;
import z2.C1400D;
import z2.C1403G;
import z2.C1405I;

/* renamed from: G.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236z0 extends r {

    /* renamed from: v, reason: collision with root package name */
    public static final Z2.S f2980v = Z2.H.c(M.b.f3531k);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f2981w = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final C0198g f2982a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2983b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0280c0 f2984c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f2985d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2986e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2987f;

    /* renamed from: g, reason: collision with root package name */
    public C0661B f2988g;

    /* renamed from: h, reason: collision with root package name */
    public final I.d f2989h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2990i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2991j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2992k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f2993l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2994m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashSet f2995n;

    /* renamed from: o, reason: collision with root package name */
    public C0286h f2996o;

    /* renamed from: p, reason: collision with root package name */
    public C1294c f2997p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2998q;

    /* renamed from: r, reason: collision with root package name */
    public final Z2.S f2999r;

    /* renamed from: s, reason: collision with root package name */
    public final W2.e0 f3000s;

    /* renamed from: t, reason: collision with root package name */
    public final CoroutineContext f3001t;

    /* renamed from: u, reason: collision with root package name */
    public final W f3002u;

    public C0236z0(CoroutineContext coroutineContext) {
        C0198g c0198g = new C0198g(new A3.e(4, this));
        this.f2982a = c0198g;
        this.f2983b = new Object();
        this.f2986e = new ArrayList();
        this.f2988g = new C0661B();
        this.f2989h = new I.d(new C0225u[16]);
        this.f2990i = new ArrayList();
        this.f2991j = new ArrayList();
        this.f2992k = new LinkedHashMap();
        this.f2993l = new LinkedHashMap();
        this.f2999r = Z2.H.c(EnumC0224t0.f2918i);
        W2.e0 e0Var = new W2.e0((InterfaceC0280c0) coroutineContext.k(C0299v.f4296e));
        e0Var.r(new A.g0(4, this));
        this.f3000s = e0Var;
        this.f3001t = coroutineContext.s(c0198g).s(e0Var);
        this.f3002u = new W(7);
    }

    public static /* synthetic */ void A(C0236z0 c0236z0, Exception exc, boolean z4, int i2) {
        if ((i2 & 4) != 0) {
            z4 = false;
        }
        c0236z0.z(exc, null, z4);
    }

    public static final C0225u p(C0236z0 c0236z0, C0225u c0225u, C0661B c0661b) {
        C0269e B;
        if (c0225u.f2939w.f2850E || c0225u.f2941y) {
            return null;
        }
        LinkedHashSet linkedHashSet = c0236z0.f2995n;
        if (linkedHashSet != null && linkedHashSet.contains(c0225u)) {
            return null;
        }
        A.g0 g0Var = new A.g0(5, c0225u);
        C0028y c0028y = new C0028y(c0225u, 11, c0661b);
        AbstractC0274j k4 = Q.q.k();
        C0269e c0269e = k4 instanceof C0269e ? (C0269e) k4 : null;
        if (c0269e == null || (B = c0269e.B(g0Var, c0028y)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            AbstractC0274j j4 = B.j();
            if (c0661b != null) {
                try {
                    if (c0661b.h()) {
                        A.f0 f0Var = new A.f0(c0661b, 1, c0225u);
                        C0216p c0216p = c0225u.f2939w;
                        if (c0216p.f2850E) {
                            C0192d.w("Preparing a composition while composing is not supported");
                            throw null;
                        }
                        c0216p.f2850E = true;
                        try {
                            f0Var.invoke();
                            c0216p.f2850E = false;
                        } catch (Throwable th) {
                            c0216p.f2850E = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC0274j.p(j4);
                    throw th2;
                }
            }
            boolean u4 = c0225u.u();
            AbstractC0274j.p(j4);
            if (!u4) {
                c0225u = null;
            }
            return c0225u;
        } finally {
            r(B);
        }
    }

    public static final boolean q(C0236z0 c0236z0) {
        List w4;
        boolean z4 = true;
        synchronized (c0236z0.f2983b) {
            if (!c0236z0.f2988g.g()) {
                I.f elements = new I.f(c0236z0.f2988g);
                c0236z0.f2988g = new C0661B();
                synchronized (c0236z0.f2983b) {
                    w4 = c0236z0.w();
                }
                try {
                    int size = w4.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C0225u) w4.get(i2)).v(elements);
                        if (((EnumC0224t0) c0236z0.f2999r.getValue()).compareTo(EnumC0224t0.f2917e) <= 0) {
                            break;
                        }
                    }
                    synchronized (c0236z0.f2983b) {
                        c0236z0.f2988g = new C0661B();
                        Unit unit = Unit.f7487a;
                    }
                    synchronized (c0236z0.f2983b) {
                        if (c0236z0.t() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        if (!c0236z0.f2989h.l() && !c0236z0.u()) {
                            z4 = false;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (c0236z0.f2983b) {
                        C0661B c0661b = c0236z0.f2988g;
                        c0661b.getClass();
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        for (Object obj : elements) {
                            c0661b.f6885b[c0661b.d(obj)] = obj;
                        }
                        throw th;
                    }
                }
            } else if (!c0236z0.f2989h.l() && !c0236z0.u()) {
                z4 = false;
            }
        }
        return z4;
    }

    public static void r(C0269e c0269e) {
        try {
            if (c0269e.v() instanceof Q.k) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c0269e.c();
        }
    }

    public static final void x(ArrayList arrayList, C0236z0 c0236z0, C0225u c0225u) {
        arrayList.clear();
        synchronized (c0236z0.f2983b) {
            Iterator it = c0236z0.f2991j.iterator();
            if (it.hasNext()) {
                ((AbstractC0187a0) it.next()).getClass();
                throw null;
            }
            Unit unit = Unit.f7487a;
        }
    }

    public final void B(C0225u c0225u) {
        ArrayList arrayList = this.f2994m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f2994m = arrayList;
        }
        if (!arrayList.contains(c0225u)) {
            arrayList.add(c0225u);
        }
        this.f2986e.remove(c0225u);
        this.f2987f = null;
    }

    @Override // G.r
    public final void a(C0225u c0225u, O.a aVar) {
        C0269e B;
        Object obj = null;
        boolean z4 = c0225u.f2939w.f2850E;
        try {
            A.g0 g0Var = new A.g0(5, c0225u);
            C0028y c0028y = new C0028y(c0225u, 11, obj);
            AbstractC0274j k4 = Q.q.k();
            C0269e c0269e = k4 instanceof C0269e ? (C0269e) k4 : null;
            if (c0269e == null || (B = c0269e.B(g0Var, c0028y)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0274j j4 = B.j();
                try {
                    c0225u.i(aVar);
                    Unit unit = Unit.f7487a;
                    if (!z4) {
                        Q.q.k().m();
                    }
                    synchronized (this.f2983b) {
                        if (((EnumC0224t0) this.f2999r.getValue()).compareTo(EnumC0224t0.f2917e) > 0 && !w().contains(c0225u)) {
                            this.f2986e.add(c0225u);
                            this.f2987f = null;
                        }
                    }
                    try {
                        synchronized (this.f2983b) {
                            ArrayList arrayList = this.f2991j;
                            if (arrayList.size() > 0) {
                                ((AbstractC0187a0) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            c0225u.d();
                            c0225u.f();
                            if (z4) {
                                return;
                            }
                            Q.q.k().m();
                        } catch (Exception e4) {
                            A(this, e4, false, 6);
                        }
                    } catch (Exception e5) {
                        z(e5, c0225u, true);
                    }
                } finally {
                    AbstractC0274j.p(j4);
                }
            } finally {
                r(B);
            }
        } catch (Exception e6) {
            z(e6, c0225u, true);
        }
    }

    @Override // G.r
    public final boolean c() {
        return ((Boolean) f2981w.get()).booleanValue();
    }

    @Override // G.r
    public final boolean d() {
        return false;
    }

    @Override // G.r
    public final boolean e() {
        return false;
    }

    @Override // G.r
    public final int g() {
        return 1000;
    }

    @Override // G.r
    public final CoroutineContext h() {
        return this.f3001t;
    }

    @Override // G.r
    public final void i(C0225u c0225u) {
        InterfaceC0284f interfaceC0284f;
        synchronized (this.f2983b) {
            if (this.f2989h.h(c0225u)) {
                interfaceC0284f = null;
            } else {
                this.f2989h.b(c0225u);
                interfaceC0284f = t();
            }
        }
        if (interfaceC0284f != null) {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            ((C0286h) interfaceC0284f).u(Unit.f7487a);
        }
    }

    @Override // G.r
    public final void j(Set set) {
    }

    @Override // G.r
    public final void l(C0225u c0225u) {
        synchronized (this.f2983b) {
            try {
                LinkedHashSet linkedHashSet = this.f2995n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f2995n = linkedHashSet;
                }
                linkedHashSet.add(c0225u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G.r
    public final void o(C0225u c0225u) {
        synchronized (this.f2983b) {
            this.f2986e.remove(c0225u);
            this.f2987f = null;
            this.f2989h.m(c0225u);
            this.f2990i.remove(c0225u);
            Unit unit = Unit.f7487a;
        }
    }

    public final void s() {
        synchronized (this.f2983b) {
            try {
                if (((EnumC0224t0) this.f2999r.getValue()).compareTo(EnumC0224t0.f2920k) >= 0) {
                    Z2.S s4 = this.f2999r;
                    EnumC0224t0 enumC0224t0 = EnumC0224t0.f2917e;
                    s4.getClass();
                    s4.l(null, enumC0224t0);
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3000s.a(null);
    }

    public final InterfaceC0284f t() {
        Z2.S s4 = this.f2999r;
        int compareTo = ((EnumC0224t0) s4.getValue()).compareTo(EnumC0224t0.f2917e);
        ArrayList arrayList = this.f2991j;
        ArrayList arrayList2 = this.f2990i;
        I.d dVar = this.f2989h;
        if (compareTo <= 0) {
            this.f2986e.clear();
            this.f2987f = C1405I.f11931d;
            this.f2988g = new C0661B();
            dVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f2994m = null;
            C0286h c0286h = this.f2996o;
            if (c0286h != null) {
                c0286h.H(null);
            }
            this.f2996o = null;
            this.f2997p = null;
            return null;
        }
        C1294c c1294c = this.f2997p;
        EnumC0224t0 enumC0224t0 = EnumC0224t0.f2921l;
        EnumC0224t0 enumC0224t02 = EnumC0224t0.f2918i;
        if (c1294c == null) {
            if (this.f2984c == null) {
                this.f2988g = new C0661B();
                dVar.g();
                if (u()) {
                    enumC0224t02 = EnumC0224t0.f2919j;
                }
            } else {
                enumC0224t02 = (dVar.l() || this.f2988g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || u()) ? enumC0224t0 : EnumC0224t0.f2920k;
            }
        }
        s4.getClass();
        s4.l(null, enumC0224t02);
        if (enumC0224t02 != enumC0224t0) {
            return null;
        }
        C0286h c0286h2 = this.f2996o;
        this.f2996o = null;
        return c0286h2;
    }

    public final boolean u() {
        return (this.f2998q || this.f2982a.f2810l.get() == 0) ? false : true;
    }

    public final boolean v() {
        boolean z4;
        synchronized (this.f2983b) {
            if (!this.f2988g.h() && !this.f2989h.l()) {
                z4 = u();
            }
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List w() {
        Object obj = this.f2987f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f2986e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? C1405I.f11931d : new ArrayList(arrayList);
            this.f2987f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r0 = r11.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r5 >= r0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        if (((kotlin.Pair) r11.get(r5)).f7486e == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r0 = new java.util.ArrayList(r11.size());
        r5 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        if (r9 >= r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        r12 = (kotlin.Pair) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        if (r12.f7486e != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
    
        r12 = (G.AbstractC0187a0) r12.f7485d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r5 = r18.f2983b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        z2.C1400D.j(r0, r18.f2991j);
        r0 = kotlin.Unit.f7487a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0124, code lost:
    
        r0 = new java.util.ArrayList(r11.size());
        r5 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
    
        if (r9 >= r5) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0134, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013d, code lost:
    
        if (((kotlin.Pair) r12).f7486e == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
    
        r0.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
    
        r11 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List y(List list, C0661B c0661b) {
        C0269e B;
        ArrayList arrayList;
        Object obj;
        C0269e c0269e = null;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            ((AbstractC0187a0) obj2).getClass();
            Object obj3 = hashMap.get(null);
            if (obj3 == null) {
                obj3 = new ArrayList();
                hashMap.put(null, obj3);
            }
            ((ArrayList) obj3).add(obj2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C0225u c0225u = (C0225u) entry.getKey();
            List list2 = (List) entry.getValue();
            C0192d.P(!c0225u.f2939w.f2850E);
            A.g0 g0Var = new A.g0(5, c0225u);
            C0028y c0028y = new C0028y(c0225u, 11, c0661b);
            AbstractC0274j k4 = Q.q.k();
            C0269e c0269e2 = k4 instanceof C0269e ? (C0269e) k4 : c0269e;
            if (c0269e2 == null || (B = c0269e2.B(g0Var, c0028y)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0274j j4 = B.j();
                try {
                    synchronized (this.f2983b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            AbstractC0187a0 abstractC0187a0 = (AbstractC0187a0) list2.get(i4);
                            LinkedHashMap linkedHashMap = this.f2992k;
                            abstractC0187a0.getClass();
                            List list3 = (List) linkedHashMap.get(c0269e);
                            if (list3 != null) {
                                Object m4 = C1400D.m(list3);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(c0269e);
                                }
                                obj = m4;
                            } else {
                                obj = c0269e;
                            }
                            arrayList.add(new Pair(abstractC0187a0, obj));
                            i4++;
                            c0269e = null;
                        }
                    }
                    int size3 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            break;
                        }
                        if (((Pair) arrayList.get(i5)).f7486e != null) {
                            break;
                        }
                        i5++;
                    }
                    c0225u.o(arrayList);
                    Unit unit = Unit.f7487a;
                    AbstractC0274j.p(j4);
                    r(B);
                    c0269e = null;
                } catch (Throwable th) {
                    AbstractC0274j.p(j4);
                    throw th;
                }
            } catch (Throwable th2) {
                r(B);
                throw th2;
            }
        }
        return C1403G.H(hashMap.keySet());
    }

    public final void z(Exception exc, C0225u c0225u, boolean z4) {
        if (!((Boolean) f2981w.get()).booleanValue() || (exc instanceof C0206k)) {
            synchronized (this.f2983b) {
                C1294c c1294c = this.f2997p;
                if (c1294c != null) {
                    throw ((Exception) c1294c.f11388d);
                }
                this.f2997p = new C1294c(exc);
                Unit unit = Unit.f7487a;
            }
            throw exc;
        }
        synchronized (this.f2983b) {
            try {
                int i2 = AbstractC0188b.f2789b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f2990i.clear();
                this.f2989h.g();
                this.f2988g = new C0661B();
                this.f2991j.clear();
                this.f2992k.clear();
                this.f2993l.clear();
                this.f2997p = new C1294c(exc);
                if (c0225u != null) {
                    B(c0225u);
                }
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
