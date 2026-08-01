package androidx.lifecycle;

import android.os.Looper;
import g0.C0163a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0301a;
import n.C0302a;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088v extends AbstractC0082o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1497a;

    /* renamed from: b, reason: collision with root package name */
    public C0302a f1498b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0081n f1499c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1500d;

    /* renamed from: e, reason: collision with root package name */
    public int f1501e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1502f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1503g;
    public final ArrayList h;
    public final f1.b i;

    public C0088v(InterfaceC0086t interfaceC0086t) {
        new AtomicReference(null);
        this.f1497a = true;
        this.f1498b = new C0302a();
        EnumC0081n enumC0081n = EnumC0081n.f1489b;
        this.f1499c = enumC0081n;
        this.h = new ArrayList();
        this.f1500d = new WeakReference(interfaceC0086t);
        this.i = new f1.b(enumC0081n);
    }

    @Override // androidx.lifecycle.AbstractC0082o
    public final void a(InterfaceC0085s interfaceC0085s) {
        r c0073f;
        InterfaceC0086t interfaceC0086t;
        ArrayList arrayList = this.h;
        Object obj = null;
        d("addObserver");
        EnumC0081n enumC0081n = this.f1499c;
        EnumC0081n enumC0081n2 = EnumC0081n.f1488a;
        if (enumC0081n != enumC0081n2) {
            enumC0081n2 = EnumC0081n.f1489b;
        }
        C0087u c0087u = new C0087u();
        HashMap hashMap = w.f1504a;
        boolean z2 = interfaceC0085s instanceof r;
        boolean z3 = interfaceC0085s instanceof T.k;
        if (z2 && z3) {
            c0073f = new C0073f((T.k) interfaceC0085s, r3, (r) interfaceC0085s);
        } else if (z3) {
            c0073f = new C0073f((T.k) interfaceC0085s, r3, obj);
        } else if (z2) {
            c0073f = (r) interfaceC0085s;
        } else {
            Class<?> cls = interfaceC0085s.getClass();
            if (w.b(cls) == 2) {
                Object obj2 = w.f1505b.get(cls);
                X0.f.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    w.a((Constructor) list.get(0), interfaceC0085s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0075h[] interfaceC0075hArr = new InterfaceC0075h[size];
                if (size > 0) {
                    w.a((Constructor) list.get(0), interfaceC0085s);
                    throw null;
                }
                c0073f = new C0163a(3, interfaceC0075hArr);
            } else {
                c0073f = new C0073f(interfaceC0085s);
            }
        }
        c0087u.f1496b = c0073f;
        c0087u.f1495a = enumC0081n2;
        C0302a c0302a = this.f1498b;
        n.c a2 = c0302a.a(interfaceC0085s);
        if (a2 != null) {
            obj = a2.f3618b;
        } else {
            HashMap hashMap2 = c0302a.f3613e;
            n.c cVar = new n.c(interfaceC0085s, c0087u);
            c0302a.f3627d++;
            n.c cVar2 = c0302a.f3625b;
            if (cVar2 == null) {
                c0302a.f3624a = cVar;
                c0302a.f3625b = cVar;
            } else {
                cVar2.f3619c = cVar;
                cVar.f3620d = cVar2;
                c0302a.f3625b = cVar;
            }
            hashMap2.put(interfaceC0085s, cVar);
        }
        if (((C0087u) obj) == null && (interfaceC0086t = (InterfaceC0086t) this.f1500d.get()) != null) {
            r3 = (this.f1501e != 0 || this.f1502f) ? 1 : 0;
            EnumC0081n c2 = c(interfaceC0085s);
            this.f1501e++;
            while (c0087u.f1495a.compareTo(c2) < 0 && this.f1498b.f3613e.containsKey(interfaceC0085s)) {
                arrayList.add(c0087u.f1495a);
                C0078k c0078k = EnumC0080m.Companion;
                EnumC0081n enumC0081n3 = c0087u.f1495a;
                c0078k.getClass();
                EnumC0080m b2 = C0078k.b(enumC0081n3);
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + c0087u.f1495a);
                }
                c0087u.a(interfaceC0086t, b2);
                arrayList.remove(arrayList.size() - 1);
                c2 = c(interfaceC0085s);
            }
            if (r3 == 0) {
                h();
            }
            this.f1501e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0082o
    public final void b(InterfaceC0085s interfaceC0085s) {
        X0.f.e(interfaceC0085s, "observer");
        d("removeObserver");
        this.f1498b.b(interfaceC0085s);
    }

    public final EnumC0081n c(InterfaceC0085s interfaceC0085s) {
        C0087u c0087u;
        HashMap hashMap = this.f1498b.f3613e;
        n.c cVar = hashMap.containsKey(interfaceC0085s) ? ((n.c) hashMap.get(interfaceC0085s)).f3620d : null;
        EnumC0081n enumC0081n = (cVar == null || (c0087u = (C0087u) cVar.f3618b) == null) ? null : c0087u.f1495a;
        ArrayList arrayList = this.h;
        EnumC0081n enumC0081n2 = arrayList.isEmpty() ? null : (EnumC0081n) arrayList.get(arrayList.size() - 1);
        EnumC0081n enumC0081n3 = this.f1499c;
        X0.f.e(enumC0081n3, "state1");
        if (enumC0081n == null || enumC0081n.compareTo(enumC0081n3) >= 0) {
            enumC0081n = enumC0081n3;
        }
        return (enumC0081n2 == null || enumC0081n2.compareTo(enumC0081n) >= 0) ? enumC0081n : enumC0081n2;
    }

    public final void d(String str) {
        if (this.f1497a) {
            ((C0301a) C0301a.u().f3532d).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void e(EnumC0080m enumC0080m) {
        X0.f.e(enumC0080m, "event");
        d("handleLifecycleEvent");
        f(enumC0080m.a());
    }

    public final void f(EnumC0081n enumC0081n) {
        EnumC0081n enumC0081n2 = this.f1499c;
        if (enumC0081n2 == enumC0081n) {
            return;
        }
        EnumC0081n enumC0081n3 = EnumC0081n.f1489b;
        EnumC0081n enumC0081n4 = EnumC0081n.f1488a;
        if (enumC0081n2 == enumC0081n3 && enumC0081n == enumC0081n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0081n + ", but was " + this.f1499c + " in component " + this.f1500d.get()).toString());
        }
        this.f1499c = enumC0081n;
        if (this.f1502f || this.f1501e != 0) {
            this.f1503g = true;
            return;
        }
        this.f1502f = true;
        h();
        this.f1502f = false;
        if (this.f1499c == enumC0081n4) {
            this.f1498b = new C0302a();
        }
    }

    public final void g() {
        EnumC0081n enumC0081n = EnumC0081n.f1490c;
        d("setCurrentState");
        f(enumC0081n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1503g = false;
        r7.i.a(r7.f1499c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0086t interfaceC0086t = (InterfaceC0086t) this.f1500d.get();
        if (interfaceC0086t == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0302a c0302a = this.f1498b;
            if (c0302a.f3627d != 0) {
                n.c cVar = c0302a.f3624a;
                X0.f.b(cVar);
                EnumC0081n enumC0081n = ((C0087u) cVar.f3618b).f1495a;
                n.c cVar2 = this.f1498b.f3625b;
                X0.f.b(cVar2);
                EnumC0081n enumC0081n2 = ((C0087u) cVar2.f3618b).f1495a;
                if (enumC0081n == enumC0081n2 && this.f1499c == enumC0081n2) {
                    break;
                }
                this.f1503g = false;
                EnumC0081n enumC0081n3 = this.f1499c;
                n.c cVar3 = this.f1498b.f3624a;
                X0.f.b(cVar3);
                if (enumC0081n3.compareTo(((C0087u) cVar3.f3618b).f1495a) < 0) {
                    C0302a c0302a2 = this.f1498b;
                    n.b bVar = new n.b(c0302a2.f3625b, c0302a2.f3624a, 1);
                    c0302a2.f3626c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1503g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        X0.f.d(entry, "next()");
                        InterfaceC0085s interfaceC0085s = (InterfaceC0085s) entry.getKey();
                        C0087u c0087u = (C0087u) entry.getValue();
                        while (c0087u.f1495a.compareTo(this.f1499c) > 0 && !this.f1503g && this.f1498b.f3613e.containsKey(interfaceC0085s)) {
                            C0078k c0078k = EnumC0080m.Companion;
                            EnumC0081n enumC0081n4 = c0087u.f1495a;
                            c0078k.getClass();
                            EnumC0080m a2 = C0078k.a(enumC0081n4);
                            if (a2 == null) {
                                throw new IllegalStateException("no event down from " + c0087u.f1495a);
                            }
                            this.h.add(a2.a());
                            c0087u.a(interfaceC0086t, a2);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1498b.f3625b;
                if (!this.f1503g && cVar4 != null && this.f1499c.compareTo(((C0087u) cVar4.f3618b).f1495a) > 0) {
                    C0302a c0302a3 = this.f1498b;
                    c0302a3.getClass();
                    n.d dVar = new n.d(c0302a3);
                    c0302a3.f3626c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1503g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0085s interfaceC0085s2 = (InterfaceC0085s) entry2.getKey();
                        C0087u c0087u2 = (C0087u) entry2.getValue();
                        while (c0087u2.f1495a.compareTo(this.f1499c) < 0 && !this.f1503g && this.f1498b.f3613e.containsKey(interfaceC0085s2)) {
                            this.h.add(c0087u2.f1495a);
                            C0078k c0078k2 = EnumC0080m.Companion;
                            EnumC0081n enumC0081n5 = c0087u2.f1495a;
                            c0078k2.getClass();
                            EnumC0080m b2 = C0078k.b(enumC0081n5);
                            if (b2 == null) {
                                throw new IllegalStateException("no event up from " + c0087u2.f1495a);
                            }
                            c0087u2.a(interfaceC0086t, b2);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
