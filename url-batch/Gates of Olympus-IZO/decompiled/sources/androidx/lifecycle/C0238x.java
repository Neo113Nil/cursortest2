package androidx.lifecycle;

import android.os.Looper;
import h.C0413b;
import i.C0456a;
import i.C0457b;
import i.C0458c;
import i.C0459d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n2.AbstractC0682G;
import n2.C0692Q;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238x {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f4038a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4039b = true;

    /* renamed from: c, reason: collision with root package name */
    public C0456a f4040c = new C0456a();

    /* renamed from: d, reason: collision with root package name */
    public EnumC0230o f4041d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f4042e;

    /* renamed from: f, reason: collision with root package name */
    public int f4043f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4044g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4045h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4046i;

    /* renamed from: j, reason: collision with root package name */
    public final C0692Q f4047j;

    public C0238x(InterfaceC0236v interfaceC0236v) {
        EnumC0230o enumC0230o = EnumC0230o.f4026e;
        this.f4041d = enumC0230o;
        this.f4046i = new ArrayList();
        this.f4042e = new WeakReference(interfaceC0236v);
        this.f4047j = AbstractC0682G.b(enumC0230o);
    }

    public final void a(InterfaceC0235u interfaceC0235u) {
        InterfaceC0234t c0222g;
        InterfaceC0236v interfaceC0236v;
        ArrayList arrayList = this.f4046i;
        Object obj = null;
        int i3 = 1;
        Z1.i.f(interfaceC0235u, "observer");
        c("addObserver");
        EnumC0230o enumC0230o = this.f4041d;
        EnumC0230o enumC0230o2 = EnumC0230o.f4025d;
        if (enumC0230o != enumC0230o2) {
            enumC0230o2 = EnumC0230o.f4026e;
        }
        C0237w c0237w = new C0237w();
        HashMap hashMap = AbstractC0239y.f4048a;
        boolean z3 = interfaceC0235u instanceof InterfaceC0234t;
        boolean z4 = interfaceC0235u instanceof InterfaceC0220e;
        if (z3 && z4) {
            c0222g = new C0222g((InterfaceC0220e) interfaceC0235u, (InterfaceC0234t) interfaceC0235u);
        } else if (z4) {
            c0222g = new C0222g((InterfaceC0220e) interfaceC0235u, (InterfaceC0234t) null);
        } else if (z3) {
            c0222g = (InterfaceC0234t) interfaceC0235u;
        } else {
            Class<?> cls = interfaceC0235u.getClass();
            if (AbstractC0239y.b(cls) == 2) {
                Object obj2 = AbstractC0239y.f4049b.get(cls);
                Z1.i.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0239y.a((Constructor) list.get(0), interfaceC0235u);
                    throw null;
                }
                int size = list.size();
                InterfaceC0224i[] interfaceC0224iArr = new InterfaceC0224i[size];
                if (size > 0) {
                    AbstractC0239y.a((Constructor) list.get(0), interfaceC0235u);
                    throw null;
                }
                c0222g = new u1.b(i3, interfaceC0224iArr);
            } else {
                c0222g = new C0222g(interfaceC0235u);
            }
        }
        c0237w.f4037b = c0222g;
        c0237w.f4036a = enumC0230o2;
        C0456a c0456a = this.f4040c;
        C0458c b2 = c0456a.b(interfaceC0235u);
        if (b2 != null) {
            obj = b2.f5087e;
        } else {
            HashMap hashMap2 = c0456a.f5082h;
            C0458c c0458c = new C0458c(interfaceC0235u, c0237w);
            c0456a.f5096g++;
            C0458c c0458c2 = c0456a.f5094e;
            if (c0458c2 == null) {
                c0456a.f5093d = c0458c;
                c0456a.f5094e = c0458c;
            } else {
                c0458c2.f5088f = c0458c;
                c0458c.f5089g = c0458c2;
                c0456a.f5094e = c0458c;
            }
            hashMap2.put(interfaceC0235u, c0458c);
        }
        if (((C0237w) obj) == null && (interfaceC0236v = (InterfaceC0236v) this.f4042e.get()) != null) {
            boolean z5 = this.f4043f != 0 || this.f4044g;
            EnumC0230o b3 = b(interfaceC0235u);
            this.f4043f++;
            while (c0237w.f4036a.compareTo(b3) < 0 && this.f4040c.f5082h.containsKey(interfaceC0235u)) {
                arrayList.add(c0237w.f4036a);
                C0227l c0227l = EnumC0229n.Companion;
                EnumC0230o enumC0230o3 = c0237w.f4036a;
                c0227l.getClass();
                EnumC0229n b4 = C0227l.b(enumC0230o3);
                if (b4 == null) {
                    throw new IllegalStateException("no event up from " + c0237w.f4036a);
                }
                c0237w.a(interfaceC0236v, b4);
                arrayList.remove(arrayList.size() - 1);
                b3 = b(interfaceC0235u);
            }
            if (!z5) {
                h();
            }
            this.f4043f--;
        }
    }

    public final EnumC0230o b(InterfaceC0235u interfaceC0235u) {
        C0237w c0237w;
        HashMap hashMap = this.f4040c.f5082h;
        C0458c c0458c = hashMap.containsKey(interfaceC0235u) ? ((C0458c) hashMap.get(interfaceC0235u)).f5089g : null;
        EnumC0230o enumC0230o = (c0458c == null || (c0237w = (C0237w) c0458c.f5087e) == null) ? null : c0237w.f4036a;
        ArrayList arrayList = this.f4046i;
        EnumC0230o enumC0230o2 = arrayList.isEmpty() ? null : (EnumC0230o) arrayList.get(arrayList.size() - 1);
        EnumC0230o enumC0230o3 = this.f4041d;
        Z1.i.f(enumC0230o3, "state1");
        if (enumC0230o == null || enumC0230o.compareTo(enumC0230o3) >= 0) {
            enumC0230o = enumC0230o3;
        }
        return (enumC0230o2 == null || enumC0230o2.compareTo(enumC0230o) >= 0) ? enumC0230o : enumC0230o2;
    }

    public final void c(String str) {
        if (this.f4039b) {
            C0413b.A().f4861a.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0229n enumC0229n) {
        Z1.i.f(enumC0229n, "event");
        c("handleLifecycleEvent");
        e(enumC0229n.a());
    }

    public final void e(EnumC0230o enumC0230o) {
        EnumC0230o enumC0230o2 = this.f4041d;
        if (enumC0230o2 == enumC0230o) {
            return;
        }
        EnumC0230o enumC0230o3 = EnumC0230o.f4026e;
        EnumC0230o enumC0230o4 = EnumC0230o.f4025d;
        if (enumC0230o2 == enumC0230o3 && enumC0230o == enumC0230o4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0230o + ", but was " + this.f4041d + " in component " + this.f4042e.get()).toString());
        }
        this.f4041d = enumC0230o;
        if (this.f4044g || this.f4043f != 0) {
            this.f4045h = true;
            return;
        }
        this.f4044g = true;
        h();
        this.f4044g = false;
        if (this.f4041d == enumC0230o4) {
            this.f4040c = new C0456a();
        }
    }

    public final void f(InterfaceC0235u interfaceC0235u) {
        Z1.i.f(interfaceC0235u, "observer");
        c("removeObserver");
        this.f4040c.c(interfaceC0235u);
    }

    public final void g(EnumC0230o enumC0230o) {
        Z1.i.f(enumC0230o, "state");
        c("setCurrentState");
        e(enumC0230o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f4045h = false;
        r7.f4047j.j(r7.f4041d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0236v interfaceC0236v = (InterfaceC0236v) this.f4042e.get();
        if (interfaceC0236v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0456a c0456a = this.f4040c;
            if (c0456a.f5096g != 0) {
                C0458c c0458c = c0456a.f5093d;
                Z1.i.c(c0458c);
                EnumC0230o enumC0230o = ((C0237w) c0458c.f5087e).f4036a;
                C0458c c0458c2 = this.f4040c.f5094e;
                Z1.i.c(c0458c2);
                EnumC0230o enumC0230o2 = ((C0237w) c0458c2.f5087e).f4036a;
                if (enumC0230o == enumC0230o2 && this.f4041d == enumC0230o2) {
                    break;
                }
                this.f4045h = false;
                EnumC0230o enumC0230o3 = this.f4041d;
                C0458c c0458c3 = this.f4040c.f5093d;
                Z1.i.c(c0458c3);
                if (enumC0230o3.compareTo(((C0237w) c0458c3.f5087e).f4036a) < 0) {
                    C0456a c0456a2 = this.f4040c;
                    C0457b c0457b = new C0457b(c0456a2.f5094e, c0456a2.f5093d, 1);
                    c0456a2.f5095f.put(c0457b, Boolean.FALSE);
                    while (c0457b.hasNext() && !this.f4045h) {
                        Map.Entry entry = (Map.Entry) c0457b.next();
                        Z1.i.e(entry, "next()");
                        InterfaceC0235u interfaceC0235u = (InterfaceC0235u) entry.getKey();
                        C0237w c0237w = (C0237w) entry.getValue();
                        while (c0237w.f4036a.compareTo(this.f4041d) > 0 && !this.f4045h && this.f4040c.f5082h.containsKey(interfaceC0235u)) {
                            C0227l c0227l = EnumC0229n.Companion;
                            EnumC0230o enumC0230o4 = c0237w.f4036a;
                            c0227l.getClass();
                            EnumC0229n a3 = C0227l.a(enumC0230o4);
                            if (a3 == null) {
                                throw new IllegalStateException("no event down from " + c0237w.f4036a);
                            }
                            this.f4046i.add(a3.a());
                            c0237w.a(interfaceC0236v, a3);
                            this.f4046i.remove(r4.size() - 1);
                        }
                    }
                }
                C0458c c0458c4 = this.f4040c.f5094e;
                if (!this.f4045h && c0458c4 != null && this.f4041d.compareTo(((C0237w) c0458c4.f5087e).f4036a) > 0) {
                    C0456a c0456a3 = this.f4040c;
                    c0456a3.getClass();
                    C0459d c0459d = new C0459d(c0456a3);
                    c0456a3.f5095f.put(c0459d, Boolean.FALSE);
                    while (c0459d.hasNext() && !this.f4045h) {
                        Map.Entry entry2 = (Map.Entry) c0459d.next();
                        InterfaceC0235u interfaceC0235u2 = (InterfaceC0235u) entry2.getKey();
                        C0237w c0237w2 = (C0237w) entry2.getValue();
                        while (c0237w2.f4036a.compareTo(this.f4041d) < 0 && !this.f4045h && this.f4040c.f5082h.containsKey(interfaceC0235u2)) {
                            this.f4046i.add(c0237w2.f4036a);
                            C0227l c0227l2 = EnumC0229n.Companion;
                            EnumC0230o enumC0230o5 = c0237w2.f4036a;
                            c0227l2.getClass();
                            EnumC0229n b2 = C0227l.b(enumC0230o5);
                            if (b2 == null) {
                                throw new IllegalStateException("no event up from " + c0237w2.f4036a);
                            }
                            c0237w2.a(interfaceC0236v, b2);
                            this.f4046i.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
