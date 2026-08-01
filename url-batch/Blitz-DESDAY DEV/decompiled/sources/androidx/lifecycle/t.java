package androidx.lifecycle;

import android.os.Looper;
import j0.C0157a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0227a;
import n.C0240a;
import n.C0241b;
import n.C0242c;
import n.C0243d;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1576a;

    /* renamed from: b, reason: collision with root package name */
    public C0240a f1577b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0070m f1578c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1579e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1580f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1581g;
    public final ArrayList h;
    public final o1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1576a = true;
        this.f1577b = new C0240a();
        EnumC0070m enumC0070m = EnumC0070m.f1569b;
        this.f1578c = enumC0070m;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new o1.a(enumC0070m);
    }

    public final void a(q qVar) {
        InterfaceC0073p c0062e;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        EnumC0070m enumC0070m = this.f1578c;
        EnumC0070m enumC0070m2 = EnumC0070m.f1568a;
        if (enumC0070m != enumC0070m2) {
            enumC0070m2 = EnumC0070m.f1569b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1582a;
        boolean z2 = qVar instanceof InterfaceC0073p;
        boolean z3 = qVar instanceof V.k;
        if (z2 && z3) {
            c0062e = new C0062e((V.k) qVar, r3, (InterfaceC0073p) qVar);
        } else if (z3) {
            c0062e = new C0062e((V.k) qVar, r3, obj);
        } else if (z2) {
            c0062e = (InterfaceC0073p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1583b.get(cls);
                g1.d.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0064g[] interfaceC0064gArr = new InterfaceC0064g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                c0062e = new C0157a(3, interfaceC0064gArr);
            } else {
                c0062e = new C0062e(qVar);
            }
        }
        sVar.f1575b = c0062e;
        sVar.f1574a = enumC0070m2;
        C0240a c0240a = this.f1577b;
        C0242c a2 = c0240a.a(qVar);
        if (a2 != null) {
            obj = a2.f3218b;
        } else {
            HashMap hashMap2 = c0240a.f3213e;
            C0242c c0242c = new C0242c(qVar, sVar);
            c0240a.d++;
            C0242c c0242c2 = c0240a.f3224b;
            if (c0242c2 == null) {
                c0240a.f3223a = c0242c;
                c0240a.f3224b = c0242c;
            } else {
                c0242c2.f3219c = c0242c;
                c0242c.d = c0242c2;
                c0240a.f3224b = c0242c;
            }
            hashMap2.put(qVar, c0242c);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1579e != 0 || this.f1580f) ? 1 : 0;
            EnumC0070m b2 = b(qVar);
            this.f1579e++;
            while (sVar.f1574a.compareTo(b2) < 0 && this.f1577b.f3213e.containsKey(qVar)) {
                arrayList.add(sVar.f1574a);
                C0067j c0067j = EnumC0069l.Companion;
                EnumC0070m enumC0070m3 = sVar.f1574a;
                c0067j.getClass();
                EnumC0069l a3 = C0067j.a(enumC0070m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1574a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1579e--;
        }
    }

    public final EnumC0070m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1577b.f3213e;
        C0242c c0242c = hashMap.containsKey(qVar) ? ((C0242c) hashMap.get(qVar)).d : null;
        EnumC0070m enumC0070m = (c0242c == null || (sVar = (s) c0242c.f3218b) == null) ? null : sVar.f1574a;
        ArrayList arrayList = this.h;
        EnumC0070m enumC0070m2 = arrayList.isEmpty() ? null : (EnumC0070m) arrayList.get(arrayList.size() - 1);
        EnumC0070m enumC0070m3 = this.f1578c;
        g1.d.e(enumC0070m3, "state1");
        if (enumC0070m == null || enumC0070m.compareTo(enumC0070m3) >= 0) {
            enumC0070m = enumC0070m3;
        }
        return (enumC0070m2 == null || enumC0070m2.compareTo(enumC0070m) >= 0) ? enumC0070m : enumC0070m2;
    }

    public final void c(String str) {
        if (this.f1576a) {
            ((C0227a) C0227a.k().f3117a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0069l enumC0069l) {
        g1.d.e(enumC0069l, "event");
        c("handleLifecycleEvent");
        e(enumC0069l.a());
    }

    public final void e(EnumC0070m enumC0070m) {
        EnumC0070m enumC0070m2 = this.f1578c;
        if (enumC0070m2 == enumC0070m) {
            return;
        }
        EnumC0070m enumC0070m3 = EnumC0070m.f1569b;
        EnumC0070m enumC0070m4 = EnumC0070m.f1568a;
        if (enumC0070m2 == enumC0070m3 && enumC0070m == enumC0070m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0070m + ", but was " + this.f1578c + " in component " + this.d.get()).toString());
        }
        this.f1578c = enumC0070m;
        if (this.f1580f || this.f1579e != 0) {
            this.f1581g = true;
            return;
        }
        this.f1580f = true;
        h();
        this.f1580f = false;
        if (this.f1578c == enumC0070m4) {
            this.f1577b = new C0240a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1577b.b(qVar);
    }

    public final void g() {
        EnumC0070m enumC0070m = EnumC0070m.f1570c;
        c("setCurrentState");
        e(enumC0070m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1581g = false;
        r0 = r7.f1578c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = p1.a.f3335a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = o1.a.f3312c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (g1.d.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f3313b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f3313b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f3313b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r2 != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r1.f3313b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f3313b = r0 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        r rVar = (r) this.d.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0240a c0240a = this.f1577b;
            if (c0240a.d != 0) {
                C0242c c0242c = c0240a.f3223a;
                g1.d.b(c0242c);
                EnumC0070m enumC0070m = ((s) c0242c.f3218b).f1574a;
                C0242c c0242c2 = this.f1577b.f3224b;
                g1.d.b(c0242c2);
                EnumC0070m enumC0070m2 = ((s) c0242c2.f3218b).f1574a;
                if (enumC0070m == enumC0070m2 && this.f1578c == enumC0070m2) {
                    break;
                }
                this.f1581g = false;
                EnumC0070m enumC0070m3 = this.f1578c;
                C0242c c0242c3 = this.f1577b.f3223a;
                g1.d.b(c0242c3);
                if (enumC0070m3.compareTo(((s) c0242c3.f3218b).f1574a) < 0) {
                    C0240a c0240a2 = this.f1577b;
                    C0241b c0241b = new C0241b(c0240a2.f3224b, c0240a2.f3223a, 1);
                    c0240a2.f3225c.put(c0241b, Boolean.FALSE);
                    while (c0241b.hasNext() && !this.f1581g) {
                        Map.Entry entry = (Map.Entry) c0241b.next();
                        g1.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1574a.compareTo(this.f1578c) > 0 && !this.f1581g && this.f1577b.f3213e.containsKey(qVar)) {
                            C0067j c0067j = EnumC0069l.Companion;
                            EnumC0070m enumC0070m4 = sVar.f1574a;
                            c0067j.getClass();
                            g1.d.e(enumC0070m4, "state");
                            int ordinal = enumC0070m4.ordinal();
                            EnumC0069l enumC0069l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0069l.ON_PAUSE : EnumC0069l.ON_STOP : EnumC0069l.ON_DESTROY;
                            if (enumC0069l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1574a);
                            }
                            this.h.add(enumC0069l.a());
                            sVar.a(rVar, enumC0069l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                C0242c c0242c4 = this.f1577b.f3224b;
                if (!this.f1581g && c0242c4 != null && this.f1578c.compareTo(((s) c0242c4.f3218b).f1574a) > 0) {
                    C0240a c0240a3 = this.f1577b;
                    c0240a3.getClass();
                    C0243d c0243d = new C0243d(c0240a3);
                    c0240a3.f3225c.put(c0243d, Boolean.FALSE);
                    while (c0243d.hasNext() && !this.f1581g) {
                        Map.Entry entry2 = (Map.Entry) c0243d.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1574a.compareTo(this.f1578c) < 0 && !this.f1581g && this.f1577b.f3213e.containsKey(qVar2)) {
                            this.h.add(sVar2.f1574a);
                            C0067j c0067j2 = EnumC0069l.Companion;
                            EnumC0070m enumC0070m5 = sVar2.f1574a;
                            c0067j2.getClass();
                            EnumC0069l a2 = C0067j.a(enumC0070m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1574a);
                            }
                            sVar2.a(rVar, a2);
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
