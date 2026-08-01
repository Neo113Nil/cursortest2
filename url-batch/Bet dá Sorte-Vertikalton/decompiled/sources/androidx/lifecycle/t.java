package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0252a;
import n.C0256a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1446a;

    /* renamed from: b, reason: collision with root package name */
    public C0256a f1447b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0072m f1448c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1449e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1450f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1451g;
    public final ArrayList h;
    public final j1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1446a = true;
        this.f1447b = new C0256a();
        EnumC0072m enumC0072m = EnumC0072m.f1439b;
        this.f1448c = enumC0072m;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new j1.a(enumC0072m);
    }

    public final void a(q qVar) {
        InterfaceC0075p c0064e;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        EnumC0072m enumC0072m = this.f1448c;
        EnumC0072m enumC0072m2 = EnumC0072m.f1438a;
        if (enumC0072m != enumC0072m2) {
            enumC0072m2 = EnumC0072m.f1439b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1452a;
        boolean z2 = qVar instanceof InterfaceC0075p;
        boolean z3 = qVar instanceof T.k;
        if (z2 && z3) {
            c0064e = new C0064e((T.k) qVar, r3, (InterfaceC0075p) qVar);
        } else if (z3) {
            c0064e = new C0064e((T.k) qVar, r3, obj);
        } else if (z2) {
            c0064e = (InterfaceC0075p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1453b.get(cls);
                b1.d.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0066g[] interfaceC0066gArr = new InterfaceC0066g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                c0064e = new h0.a(3, interfaceC0066gArr);
            } else {
                c0064e = new C0064e(qVar);
            }
        }
        sVar.f1445b = c0064e;
        sVar.f1444a = enumC0072m2;
        C0256a c0256a = this.f1447b;
        n.c a2 = c0256a.a(qVar);
        if (a2 != null) {
            obj = a2.f3309b;
        } else {
            HashMap hashMap2 = c0256a.f3304e;
            n.c cVar = new n.c(qVar, sVar);
            c0256a.d++;
            n.c cVar2 = c0256a.f3315b;
            if (cVar2 == null) {
                c0256a.f3314a = cVar;
                c0256a.f3315b = cVar;
            } else {
                cVar2.f3310c = cVar;
                cVar.d = cVar2;
                c0256a.f3315b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1449e != 0 || this.f1450f) ? 1 : 0;
            EnumC0072m b2 = b(qVar);
            this.f1449e++;
            while (sVar.f1444a.compareTo(b2) < 0 && this.f1447b.f3304e.containsKey(qVar)) {
                arrayList.add(sVar.f1444a);
                C0069j c0069j = EnumC0071l.Companion;
                EnumC0072m enumC0072m3 = sVar.f1444a;
                c0069j.getClass();
                EnumC0071l a3 = C0069j.a(enumC0072m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1444a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1449e--;
        }
    }

    public final EnumC0072m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1447b.f3304e;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).d : null;
        EnumC0072m enumC0072m = (cVar == null || (sVar = (s) cVar.f3309b) == null) ? null : sVar.f1444a;
        ArrayList arrayList = this.h;
        EnumC0072m enumC0072m2 = arrayList.isEmpty() ? null : (EnumC0072m) arrayList.get(arrayList.size() - 1);
        EnumC0072m enumC0072m3 = this.f1448c;
        b1.d.e(enumC0072m3, "state1");
        if (enumC0072m == null || enumC0072m.compareTo(enumC0072m3) >= 0) {
            enumC0072m = enumC0072m3;
        }
        return (enumC0072m2 == null || enumC0072m2.compareTo(enumC0072m) >= 0) ? enumC0072m : enumC0072m2;
    }

    public final void c(String str) {
        if (this.f1446a) {
            ((C0252a) C0252a.q().d).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0071l enumC0071l) {
        b1.d.e(enumC0071l, "event");
        c("handleLifecycleEvent");
        e(enumC0071l.a());
    }

    public final void e(EnumC0072m enumC0072m) {
        EnumC0072m enumC0072m2 = this.f1448c;
        if (enumC0072m2 == enumC0072m) {
            return;
        }
        EnumC0072m enumC0072m3 = EnumC0072m.f1439b;
        EnumC0072m enumC0072m4 = EnumC0072m.f1438a;
        if (enumC0072m2 == enumC0072m3 && enumC0072m == enumC0072m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0072m + ", but was " + this.f1448c + " in component " + this.d.get()).toString());
        }
        this.f1448c = enumC0072m;
        if (this.f1450f || this.f1449e != 0) {
            this.f1451g = true;
            return;
        }
        this.f1450f = true;
        h();
        this.f1450f = false;
        if (this.f1448c == enumC0072m4) {
            this.f1447b = new C0256a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1447b.b(qVar);
    }

    public final void g() {
        EnumC0072m enumC0072m = EnumC0072m.f1440c;
        c("setCurrentState");
        e(enumC0072m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1451g = false;
        r0 = r7.f1448c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = k1.a.f2808a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = j1.a.f2569c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (b1.d.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f2570b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f2570b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f2570b;
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
    
        r1.f2570b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f2570b = r0 + 2;
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
            C0256a c0256a = this.f1447b;
            if (c0256a.d != 0) {
                n.c cVar = c0256a.f3314a;
                b1.d.b(cVar);
                EnumC0072m enumC0072m = ((s) cVar.f3309b).f1444a;
                n.c cVar2 = this.f1447b.f3315b;
                b1.d.b(cVar2);
                EnumC0072m enumC0072m2 = ((s) cVar2.f3309b).f1444a;
                if (enumC0072m == enumC0072m2 && this.f1448c == enumC0072m2) {
                    break;
                }
                this.f1451g = false;
                EnumC0072m enumC0072m3 = this.f1448c;
                n.c cVar3 = this.f1447b.f3314a;
                b1.d.b(cVar3);
                if (enumC0072m3.compareTo(((s) cVar3.f3309b).f1444a) < 0) {
                    C0256a c0256a2 = this.f1447b;
                    n.b bVar = new n.b(c0256a2.f3315b, c0256a2.f3314a, 1);
                    c0256a2.f3316c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1451g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        b1.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1444a.compareTo(this.f1448c) > 0 && !this.f1451g && this.f1447b.f3304e.containsKey(qVar)) {
                            C0069j c0069j = EnumC0071l.Companion;
                            EnumC0072m enumC0072m4 = sVar.f1444a;
                            c0069j.getClass();
                            b1.d.e(enumC0072m4, "state");
                            int ordinal = enumC0072m4.ordinal();
                            EnumC0071l enumC0071l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0071l.ON_PAUSE : EnumC0071l.ON_STOP : EnumC0071l.ON_DESTROY;
                            if (enumC0071l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1444a);
                            }
                            this.h.add(enumC0071l.a());
                            sVar.a(rVar, enumC0071l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1447b.f3315b;
                if (!this.f1451g && cVar4 != null && this.f1448c.compareTo(((s) cVar4.f3309b).f1444a) > 0) {
                    C0256a c0256a3 = this.f1447b;
                    c0256a3.getClass();
                    n.d dVar = new n.d(c0256a3);
                    c0256a3.f3316c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1451g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1444a.compareTo(this.f1448c) < 0 && !this.f1451g && this.f1447b.f3304e.containsKey(qVar2)) {
                            this.h.add(sVar2.f1444a);
                            C0069j c0069j2 = EnumC0071l.Companion;
                            EnumC0072m enumC0072m5 = sVar2.f1444a;
                            c0069j2.getClass();
                            EnumC0071l a2 = C0069j.a(enumC0072m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1444a);
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
