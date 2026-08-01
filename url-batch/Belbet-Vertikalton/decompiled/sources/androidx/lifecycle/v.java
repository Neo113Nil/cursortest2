package androidx.lifecycle;

import android.os.Looper;
import j0.C0196a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.C0318a;
import p.C0319a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f1946a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1947b = true;

    /* renamed from: c, reason: collision with root package name */
    public C0319a f1948c = new C0319a();

    /* renamed from: d, reason: collision with root package name */
    public EnumC0078m f1949d;
    public final WeakReference e;

    /* renamed from: f, reason: collision with root package name */
    public int f1950f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1951g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1952h;
    public final ArrayList i;
    public final u1.f j;

    public v(t tVar) {
        EnumC0078m enumC0078m = EnumC0078m.f1935b;
        this.f1949d = enumC0078m;
        this.i = new ArrayList();
        this.e = new WeakReference(tVar);
        this.j = new u1.f(enumC0078m);
    }

    public final void a(InterfaceC0083s interfaceC0083s) {
        r c0070e;
        t tVar;
        ArrayList arrayList = this.i;
        int i = 2;
        Object obj = null;
        c("addObserver");
        EnumC0078m enumC0078m = this.f1949d;
        EnumC0078m enumC0078m2 = EnumC0078m.f1934a;
        if (enumC0078m != enumC0078m2) {
            enumC0078m2 = EnumC0078m.f1935b;
        }
        u uVar = new u();
        HashMap hashMap = w.f1953a;
        boolean z2 = interfaceC0083s instanceof r;
        boolean z3 = interfaceC0083s instanceof V.k;
        if (z2 && z3) {
            c0070e = new C0070e((V.k) interfaceC0083s, r4, (r) interfaceC0083s);
        } else if (z3) {
            c0070e = new C0070e((V.k) interfaceC0083s, r4, obj);
        } else if (z2) {
            c0070e = (r) interfaceC0083s;
        } else {
            Class<?> cls = interfaceC0083s.getClass();
            if (w.b(cls) == 2) {
                Object obj2 = w.f1954b.get(cls);
                j1.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    w.a((Constructor) list.get(0), interfaceC0083s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0072g[] interfaceC0072gArr = new InterfaceC0072g[size];
                if (size > 0) {
                    w.a((Constructor) list.get(0), interfaceC0083s);
                    throw null;
                }
                c0070e = new C0196a(i, interfaceC0072gArr);
            } else {
                c0070e = new C0070e(interfaceC0083s);
            }
        }
        uVar.f1945b = c0070e;
        uVar.f1944a = enumC0078m2;
        C0319a c0319a = this.f1948c;
        p.c a2 = c0319a.a(interfaceC0083s);
        if (a2 != null) {
            obj = a2.f3779b;
        } else {
            HashMap hashMap2 = c0319a.e;
            p.c cVar = new p.c(interfaceC0083s, uVar);
            c0319a.f3788d++;
            p.c cVar2 = c0319a.f3786b;
            if (cVar2 == null) {
                c0319a.f3785a = cVar;
                c0319a.f3786b = cVar;
            } else {
                cVar2.f3780c = cVar;
                cVar.f3781d = cVar2;
                c0319a.f3786b = cVar;
            }
            hashMap2.put(interfaceC0083s, cVar);
        }
        if (((u) obj) == null && (tVar = (t) this.e.get()) != null) {
            r4 = (this.f1950f != 0 || this.f1951g) ? 1 : 0;
            EnumC0078m b2 = b(interfaceC0083s);
            this.f1950f++;
            while (uVar.f1944a.compareTo(b2) < 0 && this.f1948c.e.containsKey(interfaceC0083s)) {
                arrayList.add(uVar.f1944a);
                C0075j c0075j = EnumC0077l.Companion;
                EnumC0078m enumC0078m3 = uVar.f1944a;
                c0075j.getClass();
                EnumC0077l a3 = C0075j.a(enumC0078m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + uVar.f1944a);
                }
                uVar.a(tVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(interfaceC0083s);
            }
            if (r4 == 0) {
                h();
            }
            this.f1950f--;
        }
    }

    public final EnumC0078m b(InterfaceC0083s interfaceC0083s) {
        u uVar;
        HashMap hashMap = this.f1948c.e;
        p.c cVar = hashMap.containsKey(interfaceC0083s) ? ((p.c) hashMap.get(interfaceC0083s)).f3781d : null;
        EnumC0078m enumC0078m = (cVar == null || (uVar = (u) cVar.f3779b) == null) ? null : uVar.f1944a;
        ArrayList arrayList = this.i;
        EnumC0078m enumC0078m2 = arrayList.isEmpty() ? null : (EnumC0078m) arrayList.get(arrayList.size() - 1);
        EnumC0078m enumC0078m3 = this.f1949d;
        j1.h.e(enumC0078m3, "state1");
        if (enumC0078m == null || enumC0078m.compareTo(enumC0078m3) >= 0) {
            enumC0078m = enumC0078m3;
        }
        return (enumC0078m2 == null || enumC0078m2.compareTo(enumC0078m) >= 0) ? enumC0078m : enumC0078m2;
    }

    public final void c(String str) {
        if (this.f1947b) {
            C0318a.l0().f3765b.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0077l enumC0077l) {
        j1.h.e(enumC0077l, "event");
        c("handleLifecycleEvent");
        e(enumC0077l.a());
    }

    public final void e(EnumC0078m enumC0078m) {
        EnumC0078m enumC0078m2 = this.f1949d;
        if (enumC0078m2 == enumC0078m) {
            return;
        }
        EnumC0078m enumC0078m3 = EnumC0078m.f1935b;
        EnumC0078m enumC0078m4 = EnumC0078m.f1934a;
        if (enumC0078m2 == enumC0078m3 && enumC0078m == enumC0078m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0078m + ", but was " + this.f1949d + " in component " + this.e.get()).toString());
        }
        this.f1949d = enumC0078m;
        if (this.f1951g || this.f1950f != 0) {
            this.f1952h = true;
            return;
        }
        this.f1951g = true;
        h();
        this.f1951g = false;
        if (this.f1949d == enumC0078m4) {
            this.f1948c = new C0319a();
        }
    }

    public final void f(InterfaceC0083s interfaceC0083s) {
        c("removeObserver");
        this.f1948c.b(interfaceC0083s);
    }

    public final void g() {
        EnumC0078m enumC0078m = EnumC0078m.f1936c;
        c("setCurrentState");
        e(enumC0078m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1952h = false;
        r7.j.a(r7.f1949d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        t tVar = (t) this.e.get();
        if (tVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0319a c0319a = this.f1948c;
            if (c0319a.f3788d != 0) {
                p.c cVar = c0319a.f3785a;
                j1.h.b(cVar);
                EnumC0078m enumC0078m = ((u) cVar.f3779b).f1944a;
                p.c cVar2 = this.f1948c.f3786b;
                j1.h.b(cVar2);
                EnumC0078m enumC0078m2 = ((u) cVar2.f3779b).f1944a;
                if (enumC0078m == enumC0078m2 && this.f1949d == enumC0078m2) {
                    break;
                }
                this.f1952h = false;
                EnumC0078m enumC0078m3 = this.f1949d;
                p.c cVar3 = this.f1948c.f3785a;
                j1.h.b(cVar3);
                if (enumC0078m3.compareTo(((u) cVar3.f3779b).f1944a) < 0) {
                    C0319a c0319a2 = this.f1948c;
                    p.b bVar = new p.b(c0319a2.f3786b, c0319a2.f3785a, 1);
                    c0319a2.f3787c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1952h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        j1.h.d(entry, "next()");
                        InterfaceC0083s interfaceC0083s = (InterfaceC0083s) entry.getKey();
                        u uVar = (u) entry.getValue();
                        while (uVar.f1944a.compareTo(this.f1949d) > 0 && !this.f1952h && this.f1948c.e.containsKey(interfaceC0083s)) {
                            C0075j c0075j = EnumC0077l.Companion;
                            EnumC0078m enumC0078m4 = uVar.f1944a;
                            c0075j.getClass();
                            j1.h.e(enumC0078m4, "state");
                            int ordinal = enumC0078m4.ordinal();
                            EnumC0077l enumC0077l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0077l.ON_PAUSE : EnumC0077l.ON_STOP : EnumC0077l.ON_DESTROY;
                            if (enumC0077l == null) {
                                throw new IllegalStateException("no event down from " + uVar.f1944a);
                            }
                            this.i.add(enumC0077l.a());
                            uVar.a(tVar, enumC0077l);
                            this.i.remove(r4.size() - 1);
                        }
                    }
                }
                p.c cVar4 = this.f1948c.f3786b;
                if (!this.f1952h && cVar4 != null && this.f1949d.compareTo(((u) cVar4.f3779b).f1944a) > 0) {
                    C0319a c0319a3 = this.f1948c;
                    c0319a3.getClass();
                    p.d dVar = new p.d(c0319a3);
                    c0319a3.f3787c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1952h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0083s interfaceC0083s2 = (InterfaceC0083s) entry2.getKey();
                        u uVar2 = (u) entry2.getValue();
                        while (uVar2.f1944a.compareTo(this.f1949d) < 0 && !this.f1952h && this.f1948c.e.containsKey(interfaceC0083s2)) {
                            this.i.add(uVar2.f1944a);
                            C0075j c0075j2 = EnumC0077l.Companion;
                            EnumC0078m enumC0078m5 = uVar2.f1944a;
                            c0075j2.getClass();
                            EnumC0077l a2 = C0075j.a(enumC0078m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + uVar2.f1944a);
                            }
                            uVar2.a(tVar, a2);
                            this.i.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
