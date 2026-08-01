package androidx.lifecycle;

import android.os.Looper;
import i0.C0141a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0260a;
import n.C0277a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1488a;

    /* renamed from: b, reason: collision with root package name */
    public C0277a f1489b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0072m f1490c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1491e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1492f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1493g;
    public final ArrayList h;
    public final l1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1488a = true;
        this.f1489b = new C0277a();
        EnumC0072m enumC0072m = EnumC0072m.f1481b;
        this.f1490c = enumC0072m;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new l1.a(enumC0072m);
    }

    public final void a(q qVar) {
        InterfaceC0075p c0064e;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        EnumC0072m enumC0072m = this.f1490c;
        EnumC0072m enumC0072m2 = EnumC0072m.f1480a;
        if (enumC0072m != enumC0072m2) {
            enumC0072m2 = EnumC0072m.f1481b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1494a;
        boolean z2 = qVar instanceof InterfaceC0075p;
        boolean z3 = qVar instanceof U.k;
        if (z2 && z3) {
            c0064e = new C0064e((U.k) qVar, r3, (InterfaceC0075p) qVar);
        } else if (z3) {
            c0064e = new C0064e((U.k) qVar, r3, obj);
        } else if (z2) {
            c0064e = (InterfaceC0075p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1495b.get(cls);
                d1.d.b(obj2);
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
                c0064e = new C0141a(3, interfaceC0066gArr);
            } else {
                c0064e = new C0064e(qVar);
            }
        }
        sVar.f1487b = c0064e;
        sVar.f1486a = enumC0072m2;
        C0277a c0277a = this.f1489b;
        n.c a2 = c0277a.a(qVar);
        if (a2 != null) {
            obj = a2.f3194b;
        } else {
            HashMap hashMap2 = c0277a.f3189e;
            n.c cVar = new n.c(qVar, sVar);
            c0277a.d++;
            n.c cVar2 = c0277a.f3200b;
            if (cVar2 == null) {
                c0277a.f3199a = cVar;
                c0277a.f3200b = cVar;
            } else {
                cVar2.f3195c = cVar;
                cVar.d = cVar2;
                c0277a.f3200b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1491e != 0 || this.f1492f) ? 1 : 0;
            EnumC0072m b2 = b(qVar);
            this.f1491e++;
            while (sVar.f1486a.compareTo(b2) < 0 && this.f1489b.f3189e.containsKey(qVar)) {
                arrayList.add(sVar.f1486a);
                C0069j c0069j = EnumC0071l.Companion;
                EnumC0072m enumC0072m3 = sVar.f1486a;
                c0069j.getClass();
                EnumC0071l a3 = C0069j.a(enumC0072m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1486a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1491e--;
        }
    }

    public final EnumC0072m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1489b.f3189e;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).d : null;
        EnumC0072m enumC0072m = (cVar == null || (sVar = (s) cVar.f3194b) == null) ? null : sVar.f1486a;
        ArrayList arrayList = this.h;
        EnumC0072m enumC0072m2 = arrayList.isEmpty() ? null : (EnumC0072m) arrayList.get(arrayList.size() - 1);
        EnumC0072m enumC0072m3 = this.f1490c;
        d1.d.e(enumC0072m3, "state1");
        if (enumC0072m == null || enumC0072m.compareTo(enumC0072m3) >= 0) {
            enumC0072m = enumC0072m3;
        }
        return (enumC0072m2 == null || enumC0072m2.compareTo(enumC0072m) >= 0) ? enumC0072m : enumC0072m2;
    }

    public final void c(String str) {
        if (this.f1488a) {
            ((C0260a) C0260a.k().f3122a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0071l enumC0071l) {
        d1.d.e(enumC0071l, "event");
        c("handleLifecycleEvent");
        e(enumC0071l.a());
    }

    public final void e(EnumC0072m enumC0072m) {
        EnumC0072m enumC0072m2 = this.f1490c;
        if (enumC0072m2 == enumC0072m) {
            return;
        }
        EnumC0072m enumC0072m3 = EnumC0072m.f1481b;
        EnumC0072m enumC0072m4 = EnumC0072m.f1480a;
        if (enumC0072m2 == enumC0072m3 && enumC0072m == enumC0072m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0072m + ", but was " + this.f1490c + " in component " + this.d.get()).toString());
        }
        this.f1490c = enumC0072m;
        if (this.f1492f || this.f1491e != 0) {
            this.f1493g = true;
            return;
        }
        this.f1492f = true;
        h();
        this.f1492f = false;
        if (this.f1490c == enumC0072m4) {
            this.f1489b = new C0277a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1489b.b(qVar);
    }

    public final void g() {
        EnumC0072m enumC0072m = EnumC0072m.f1482c;
        c("setCurrentState");
        e(enumC0072m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1493g = false;
        r0 = r7.f1490c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = m1.a.f3188a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = l1.a.f3118c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (d1.d.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f3119b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f3119b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f3119b;
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
    
        r1.f3119b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f3119b = r0 + 2;
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
            C0277a c0277a = this.f1489b;
            if (c0277a.d != 0) {
                n.c cVar = c0277a.f3199a;
                d1.d.b(cVar);
                EnumC0072m enumC0072m = ((s) cVar.f3194b).f1486a;
                n.c cVar2 = this.f1489b.f3200b;
                d1.d.b(cVar2);
                EnumC0072m enumC0072m2 = ((s) cVar2.f3194b).f1486a;
                if (enumC0072m == enumC0072m2 && this.f1490c == enumC0072m2) {
                    break;
                }
                this.f1493g = false;
                EnumC0072m enumC0072m3 = this.f1490c;
                n.c cVar3 = this.f1489b.f3199a;
                d1.d.b(cVar3);
                if (enumC0072m3.compareTo(((s) cVar3.f3194b).f1486a) < 0) {
                    C0277a c0277a2 = this.f1489b;
                    n.b bVar = new n.b(c0277a2.f3200b, c0277a2.f3199a, 1);
                    c0277a2.f3201c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1493g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        d1.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1486a.compareTo(this.f1490c) > 0 && !this.f1493g && this.f1489b.f3189e.containsKey(qVar)) {
                            C0069j c0069j = EnumC0071l.Companion;
                            EnumC0072m enumC0072m4 = sVar.f1486a;
                            c0069j.getClass();
                            d1.d.e(enumC0072m4, "state");
                            int ordinal = enumC0072m4.ordinal();
                            EnumC0071l enumC0071l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0071l.ON_PAUSE : EnumC0071l.ON_STOP : EnumC0071l.ON_DESTROY;
                            if (enumC0071l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1486a);
                            }
                            this.h.add(enumC0071l.a());
                            sVar.a(rVar, enumC0071l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1489b.f3200b;
                if (!this.f1493g && cVar4 != null && this.f1490c.compareTo(((s) cVar4.f3194b).f1486a) > 0) {
                    C0277a c0277a3 = this.f1489b;
                    c0277a3.getClass();
                    n.d dVar = new n.d(c0277a3);
                    c0277a3.f3201c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1493g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1486a.compareTo(this.f1490c) < 0 && !this.f1493g && this.f1489b.f3189e.containsKey(qVar2)) {
                            this.h.add(sVar2.f1486a);
                            C0069j c0069j2 = EnumC0071l.Companion;
                            EnumC0072m enumC0072m5 = sVar2.f1486a;
                            c0069j2.getClass();
                            EnumC0071l a2 = C0069j.a(enumC0072m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1486a);
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
