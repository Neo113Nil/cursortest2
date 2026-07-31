package androidx.lifecycle;

import android.os.Looper;
import h.C0445b;
import i.C0509a;
import i.C0510b;
import i.C0511c;
import i.C0512d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import t2.AbstractC1035F;
import t2.C1045P;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294x {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f5239a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5240b = true;

    /* renamed from: c, reason: collision with root package name */
    public C0509a f5241c = new C0509a();

    /* renamed from: d, reason: collision with root package name */
    public EnumC0286o f5242d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f5243e;

    /* renamed from: f, reason: collision with root package name */
    public int f5244f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5245g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5246h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5247i;

    /* renamed from: j, reason: collision with root package name */
    public final C1045P f5248j;

    public C0294x(InterfaceC0292v interfaceC0292v) {
        EnumC0286o enumC0286o = EnumC0286o.f5227e;
        this.f5242d = enumC0286o;
        this.f5247i = new ArrayList();
        this.f5243e = new WeakReference(interfaceC0292v);
        this.f5248j = AbstractC1035F.c(enumC0286o);
    }

    public final void a(InterfaceC0291u interfaceC0291u) {
        InterfaceC0290t c0278g;
        InterfaceC0292v interfaceC0292v;
        ArrayList arrayList = this.f5247i;
        Object obj = null;
        int i3 = 1;
        f2.j.f(interfaceC0291u, "observer");
        c("addObserver");
        EnumC0286o enumC0286o = this.f5242d;
        EnumC0286o enumC0286o2 = EnumC0286o.f5226d;
        if (enumC0286o != enumC0286o2) {
            enumC0286o2 = EnumC0286o.f5227e;
        }
        C0293w c0293w = new C0293w();
        HashMap hashMap = AbstractC0295y.f5249a;
        boolean z3 = interfaceC0291u instanceof InterfaceC0290t;
        boolean z4 = interfaceC0291u instanceof InterfaceC0276e;
        if (z3 && z4) {
            c0278g = new C0278g((InterfaceC0276e) interfaceC0291u, (InterfaceC0290t) interfaceC0291u);
        } else if (z4) {
            c0278g = new C0278g((InterfaceC0276e) interfaceC0291u, (InterfaceC0290t) null);
        } else if (z3) {
            c0278g = (InterfaceC0290t) interfaceC0291u;
        } else {
            Class<?> cls = interfaceC0291u.getClass();
            if (AbstractC0295y.b(cls) == 2) {
                Object obj2 = AbstractC0295y.f5250b.get(cls);
                f2.j.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0295y.a((Constructor) list.get(0), interfaceC0291u);
                    throw null;
                }
                int size = list.size();
                InterfaceC0280i[] interfaceC0280iArr = new InterfaceC0280i[size];
                if (size > 0) {
                    AbstractC0295y.a((Constructor) list.get(0), interfaceC0291u);
                    throw null;
                }
                c0278g = new y1.b(i3, interfaceC0280iArr);
            } else {
                c0278g = new C0278g(interfaceC0291u);
            }
        }
        c0293w.f5238b = c0278g;
        c0293w.f5237a = enumC0286o2;
        C0509a c0509a = this.f5241c;
        C0511c b3 = c0509a.b(interfaceC0291u);
        if (b3 != null) {
            obj = b3.f6227e;
        } else {
            HashMap hashMap2 = c0509a.f6222h;
            C0511c c0511c = new C0511c(interfaceC0291u, c0293w);
            c0509a.f6236g++;
            C0511c c0511c2 = c0509a.f6234e;
            if (c0511c2 == null) {
                c0509a.f6233d = c0511c;
                c0509a.f6234e = c0511c;
            } else {
                c0511c2.f6228f = c0511c;
                c0511c.f6229g = c0511c2;
                c0509a.f6234e = c0511c;
            }
            hashMap2.put(interfaceC0291u, c0511c);
        }
        if (((C0293w) obj) == null && (interfaceC0292v = (InterfaceC0292v) this.f5243e.get()) != null) {
            boolean z5 = this.f5244f != 0 || this.f5245g;
            EnumC0286o b4 = b(interfaceC0291u);
            this.f5244f++;
            while (c0293w.f5237a.compareTo(b4) < 0 && this.f5241c.f6222h.containsKey(interfaceC0291u)) {
                arrayList.add(c0293w.f5237a);
                C0283l c0283l = EnumC0285n.Companion;
                EnumC0286o enumC0286o3 = c0293w.f5237a;
                c0283l.getClass();
                EnumC0285n b5 = C0283l.b(enumC0286o3);
                if (b5 == null) {
                    throw new IllegalStateException("no event up from " + c0293w.f5237a);
                }
                c0293w.a(interfaceC0292v, b5);
                arrayList.remove(arrayList.size() - 1);
                b4 = b(interfaceC0291u);
            }
            if (!z5) {
                h();
            }
            this.f5244f--;
        }
    }

    public final EnumC0286o b(InterfaceC0291u interfaceC0291u) {
        C0293w c0293w;
        HashMap hashMap = this.f5241c.f6222h;
        C0511c c0511c = hashMap.containsKey(interfaceC0291u) ? ((C0511c) hashMap.get(interfaceC0291u)).f6229g : null;
        EnumC0286o enumC0286o = (c0511c == null || (c0293w = (C0293w) c0511c.f6227e) == null) ? null : c0293w.f5237a;
        ArrayList arrayList = this.f5247i;
        EnumC0286o enumC0286o2 = arrayList.isEmpty() ? null : (EnumC0286o) arrayList.get(arrayList.size() - 1);
        EnumC0286o enumC0286o3 = this.f5242d;
        f2.j.f(enumC0286o3, "state1");
        if (enumC0286o == null || enumC0286o.compareTo(enumC0286o3) >= 0) {
            enumC0286o = enumC0286o3;
        }
        return (enumC0286o2 == null || enumC0286o2.compareTo(enumC0286o) >= 0) ? enumC0286o : enumC0286o2;
    }

    public final void c(String str) {
        if (this.f5240b) {
            C0445b.b0().f5849d.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0285n enumC0285n) {
        f2.j.f(enumC0285n, "event");
        c("handleLifecycleEvent");
        e(enumC0285n.a());
    }

    public final void e(EnumC0286o enumC0286o) {
        EnumC0286o enumC0286o2 = this.f5242d;
        if (enumC0286o2 == enumC0286o) {
            return;
        }
        EnumC0286o enumC0286o3 = EnumC0286o.f5227e;
        EnumC0286o enumC0286o4 = EnumC0286o.f5226d;
        if (enumC0286o2 == enumC0286o3 && enumC0286o == enumC0286o4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0286o + ", but was " + this.f5242d + " in component " + this.f5243e.get()).toString());
        }
        this.f5242d = enumC0286o;
        if (this.f5245g || this.f5244f != 0) {
            this.f5246h = true;
            return;
        }
        this.f5245g = true;
        h();
        this.f5245g = false;
        if (this.f5242d == enumC0286o4) {
            this.f5241c = new C0509a();
        }
    }

    public final void f(InterfaceC0291u interfaceC0291u) {
        f2.j.f(interfaceC0291u, "observer");
        c("removeObserver");
        this.f5241c.c(interfaceC0291u);
    }

    public final void g(EnumC0286o enumC0286o) {
        f2.j.f(enumC0286o, "state");
        c("setCurrentState");
        e(enumC0286o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f5246h = false;
        r7.f5248j.k(r7.f5242d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0292v interfaceC0292v = (InterfaceC0292v) this.f5243e.get();
        if (interfaceC0292v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0509a c0509a = this.f5241c;
            if (c0509a.f6236g != 0) {
                C0511c c0511c = c0509a.f6233d;
                f2.j.c(c0511c);
                EnumC0286o enumC0286o = ((C0293w) c0511c.f6227e).f5237a;
                C0511c c0511c2 = this.f5241c.f6234e;
                f2.j.c(c0511c2);
                EnumC0286o enumC0286o2 = ((C0293w) c0511c2.f6227e).f5237a;
                if (enumC0286o == enumC0286o2 && this.f5242d == enumC0286o2) {
                    break;
                }
                this.f5246h = false;
                EnumC0286o enumC0286o3 = this.f5242d;
                C0511c c0511c3 = this.f5241c.f6233d;
                f2.j.c(c0511c3);
                if (enumC0286o3.compareTo(((C0293w) c0511c3.f6227e).f5237a) < 0) {
                    C0509a c0509a2 = this.f5241c;
                    C0510b c0510b = new C0510b(c0509a2.f6234e, c0509a2.f6233d, 1);
                    c0509a2.f6235f.put(c0510b, Boolean.FALSE);
                    while (c0510b.hasNext() && !this.f5246h) {
                        Map.Entry entry = (Map.Entry) c0510b.next();
                        f2.j.e(entry, "next()");
                        InterfaceC0291u interfaceC0291u = (InterfaceC0291u) entry.getKey();
                        C0293w c0293w = (C0293w) entry.getValue();
                        while (c0293w.f5237a.compareTo(this.f5242d) > 0 && !this.f5246h && this.f5241c.f6222h.containsKey(interfaceC0291u)) {
                            C0283l c0283l = EnumC0285n.Companion;
                            EnumC0286o enumC0286o4 = c0293w.f5237a;
                            c0283l.getClass();
                            EnumC0285n a3 = C0283l.a(enumC0286o4);
                            if (a3 == null) {
                                throw new IllegalStateException("no event down from " + c0293w.f5237a);
                            }
                            this.f5247i.add(a3.a());
                            c0293w.a(interfaceC0292v, a3);
                            this.f5247i.remove(r4.size() - 1);
                        }
                    }
                }
                C0511c c0511c4 = this.f5241c.f6234e;
                if (!this.f5246h && c0511c4 != null && this.f5242d.compareTo(((C0293w) c0511c4.f6227e).f5237a) > 0) {
                    C0509a c0509a3 = this.f5241c;
                    c0509a3.getClass();
                    C0512d c0512d = new C0512d(c0509a3);
                    c0509a3.f6235f.put(c0512d, Boolean.FALSE);
                    while (c0512d.hasNext() && !this.f5246h) {
                        Map.Entry entry2 = (Map.Entry) c0512d.next();
                        InterfaceC0291u interfaceC0291u2 = (InterfaceC0291u) entry2.getKey();
                        C0293w c0293w2 = (C0293w) entry2.getValue();
                        while (c0293w2.f5237a.compareTo(this.f5242d) < 0 && !this.f5246h && this.f5241c.f6222h.containsKey(interfaceC0291u2)) {
                            this.f5247i.add(c0293w2.f5237a);
                            C0283l c0283l2 = EnumC0285n.Companion;
                            EnumC0286o enumC0286o5 = c0293w2.f5237a;
                            c0283l2.getClass();
                            EnumC0285n b3 = C0283l.b(enumC0286o5);
                            if (b3 == null) {
                                throw new IllegalStateException("no event up from " + c0293w2.f5237a);
                            }
                            c0293w2.a(interfaceC0292v, b3);
                            this.f5247i.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
