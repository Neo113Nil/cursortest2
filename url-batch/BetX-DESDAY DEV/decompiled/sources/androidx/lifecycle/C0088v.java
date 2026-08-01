package androidx.lifecycle;

import android.os.Looper;
import g0.C0164a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0303a;
import n.C0304a;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088v extends AbstractC0082o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1498a;

    /* renamed from: b, reason: collision with root package name */
    public C0304a f1499b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0081n f1500c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1501d;

    /* renamed from: e, reason: collision with root package name */
    public int f1502e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1503f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1504g;
    public final ArrayList h;
    public final f1.b i;

    public C0088v(InterfaceC0086t interfaceC0086t) {
        new AtomicReference(null);
        this.f1498a = true;
        this.f1499b = new C0304a();
        EnumC0081n enumC0081n = EnumC0081n.f1490b;
        this.f1500c = enumC0081n;
        this.h = new ArrayList();
        this.f1501d = new WeakReference(interfaceC0086t);
        this.i = new f1.b(enumC0081n);
    }

    @Override // androidx.lifecycle.AbstractC0082o
    public final void a(InterfaceC0085s interfaceC0085s) {
        r c0073f;
        InterfaceC0086t interfaceC0086t;
        ArrayList arrayList = this.h;
        Object obj = null;
        d("addObserver");
        EnumC0081n enumC0081n = this.f1500c;
        EnumC0081n enumC0081n2 = EnumC0081n.f1489a;
        if (enumC0081n != enumC0081n2) {
            enumC0081n2 = EnumC0081n.f1490b;
        }
        C0087u c0087u = new C0087u();
        HashMap hashMap = w.f1505a;
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
                Object obj2 = w.f1506b.get(cls);
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
                c0073f = new C0164a(3, interfaceC0075hArr);
            } else {
                c0073f = new C0073f(interfaceC0085s);
            }
        }
        c0087u.f1497b = c0073f;
        c0087u.f1496a = enumC0081n2;
        C0304a c0304a = this.f1499b;
        n.c a2 = c0304a.a(interfaceC0085s);
        if (a2 != null) {
            obj = a2.f3622b;
        } else {
            HashMap hashMap2 = c0304a.f3617e;
            n.c cVar = new n.c(interfaceC0085s, c0087u);
            c0304a.f3631d++;
            n.c cVar2 = c0304a.f3629b;
            if (cVar2 == null) {
                c0304a.f3628a = cVar;
                c0304a.f3629b = cVar;
            } else {
                cVar2.f3623c = cVar;
                cVar.f3624d = cVar2;
                c0304a.f3629b = cVar;
            }
            hashMap2.put(interfaceC0085s, cVar);
        }
        if (((C0087u) obj) == null && (interfaceC0086t = (InterfaceC0086t) this.f1501d.get()) != null) {
            r3 = (this.f1502e != 0 || this.f1503f) ? 1 : 0;
            EnumC0081n c2 = c(interfaceC0085s);
            this.f1502e++;
            while (c0087u.f1496a.compareTo(c2) < 0 && this.f1499b.f3617e.containsKey(interfaceC0085s)) {
                arrayList.add(c0087u.f1496a);
                C0078k c0078k = EnumC0080m.Companion;
                EnumC0081n enumC0081n3 = c0087u.f1496a;
                c0078k.getClass();
                EnumC0080m b2 = C0078k.b(enumC0081n3);
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + c0087u.f1496a);
                }
                c0087u.a(interfaceC0086t, b2);
                arrayList.remove(arrayList.size() - 1);
                c2 = c(interfaceC0085s);
            }
            if (r3 == 0) {
                h();
            }
            this.f1502e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0082o
    public final void b(InterfaceC0085s interfaceC0085s) {
        X0.f.e(interfaceC0085s, "observer");
        d("removeObserver");
        this.f1499b.b(interfaceC0085s);
    }

    public final EnumC0081n c(InterfaceC0085s interfaceC0085s) {
        C0087u c0087u;
        HashMap hashMap = this.f1499b.f3617e;
        n.c cVar = hashMap.containsKey(interfaceC0085s) ? ((n.c) hashMap.get(interfaceC0085s)).f3624d : null;
        EnumC0081n enumC0081n = (cVar == null || (c0087u = (C0087u) cVar.f3622b) == null) ? null : c0087u.f1496a;
        ArrayList arrayList = this.h;
        EnumC0081n enumC0081n2 = arrayList.isEmpty() ? null : (EnumC0081n) arrayList.get(arrayList.size() - 1);
        EnumC0081n enumC0081n3 = this.f1500c;
        X0.f.e(enumC0081n3, "state1");
        if (enumC0081n == null || enumC0081n.compareTo(enumC0081n3) >= 0) {
            enumC0081n = enumC0081n3;
        }
        return (enumC0081n2 == null || enumC0081n2.compareTo(enumC0081n) >= 0) ? enumC0081n : enumC0081n2;
    }

    public final void d(String str) {
        if (this.f1498a) {
            ((C0303a) C0303a.u().f3536d).getClass();
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
        EnumC0081n enumC0081n2 = this.f1500c;
        if (enumC0081n2 == enumC0081n) {
            return;
        }
        EnumC0081n enumC0081n3 = EnumC0081n.f1490b;
        EnumC0081n enumC0081n4 = EnumC0081n.f1489a;
        if (enumC0081n2 == enumC0081n3 && enumC0081n == enumC0081n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0081n + ", but was " + this.f1500c + " in component " + this.f1501d.get()).toString());
        }
        this.f1500c = enumC0081n;
        if (this.f1503f || this.f1502e != 0) {
            this.f1504g = true;
            return;
        }
        this.f1503f = true;
        h();
        this.f1503f = false;
        if (this.f1500c == enumC0081n4) {
            this.f1499b = new C0304a();
        }
    }

    public final void g() {
        EnumC0081n enumC0081n = EnumC0081n.f1491c;
        d("setCurrentState");
        f(enumC0081n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1504g = false;
        r7.i.a(r7.f1500c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0086t interfaceC0086t = (InterfaceC0086t) this.f1501d.get();
        if (interfaceC0086t == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0304a c0304a = this.f1499b;
            if (c0304a.f3631d != 0) {
                n.c cVar = c0304a.f3628a;
                X0.f.b(cVar);
                EnumC0081n enumC0081n = ((C0087u) cVar.f3622b).f1496a;
                n.c cVar2 = this.f1499b.f3629b;
                X0.f.b(cVar2);
                EnumC0081n enumC0081n2 = ((C0087u) cVar2.f3622b).f1496a;
                if (enumC0081n == enumC0081n2 && this.f1500c == enumC0081n2) {
                    break;
                }
                this.f1504g = false;
                EnumC0081n enumC0081n3 = this.f1500c;
                n.c cVar3 = this.f1499b.f3628a;
                X0.f.b(cVar3);
                if (enumC0081n3.compareTo(((C0087u) cVar3.f3622b).f1496a) < 0) {
                    C0304a c0304a2 = this.f1499b;
                    n.b bVar = new n.b(c0304a2.f3629b, c0304a2.f3628a, 1);
                    c0304a2.f3630c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1504g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        X0.f.d(entry, "next()");
                        InterfaceC0085s interfaceC0085s = (InterfaceC0085s) entry.getKey();
                        C0087u c0087u = (C0087u) entry.getValue();
                        while (c0087u.f1496a.compareTo(this.f1500c) > 0 && !this.f1504g && this.f1499b.f3617e.containsKey(interfaceC0085s)) {
                            C0078k c0078k = EnumC0080m.Companion;
                            EnumC0081n enumC0081n4 = c0087u.f1496a;
                            c0078k.getClass();
                            EnumC0080m a2 = C0078k.a(enumC0081n4);
                            if (a2 == null) {
                                throw new IllegalStateException("no event down from " + c0087u.f1496a);
                            }
                            this.h.add(a2.a());
                            c0087u.a(interfaceC0086t, a2);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1499b.f3629b;
                if (!this.f1504g && cVar4 != null && this.f1500c.compareTo(((C0087u) cVar4.f3622b).f1496a) > 0) {
                    C0304a c0304a3 = this.f1499b;
                    c0304a3.getClass();
                    n.d dVar = new n.d(c0304a3);
                    c0304a3.f3630c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1504g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0085s interfaceC0085s2 = (InterfaceC0085s) entry2.getKey();
                        C0087u c0087u2 = (C0087u) entry2.getValue();
                        while (c0087u2.f1496a.compareTo(this.f1500c) < 0 && !this.f1504g && this.f1499b.f3617e.containsKey(interfaceC0085s2)) {
                            this.h.add(c0087u2.f1496a);
                            C0078k c0078k2 = EnumC0080m.Companion;
                            EnumC0081n enumC0081n5 = c0087u2.f1496a;
                            c0078k2.getClass();
                            EnumC0080m b2 = C0078k.b(enumC0081n5);
                            if (b2 == null) {
                                throw new IllegalStateException("no event up from " + c0087u2.f1496a);
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
