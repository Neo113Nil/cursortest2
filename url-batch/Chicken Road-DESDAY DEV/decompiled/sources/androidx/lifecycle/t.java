package androidx.lifecycle;

import android.os.Looper;
import h0.C0137a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0274a;
import n.C0276a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1429a;

    /* renamed from: b, reason: collision with root package name */
    public C0276a f1430b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0073m f1431c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1432e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1433f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1434g;
    public final ArrayList h;
    public final j1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1429a = true;
        this.f1430b = new C0276a();
        EnumC0073m enumC0073m = EnumC0073m.f1422b;
        this.f1431c = enumC0073m;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new j1.a(enumC0073m);
    }

    public final void a(q qVar) {
        InterfaceC0076p c0065e;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        EnumC0073m enumC0073m = this.f1431c;
        EnumC0073m enumC0073m2 = EnumC0073m.f1421a;
        if (enumC0073m != enumC0073m2) {
            enumC0073m2 = EnumC0073m.f1422b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1435a;
        boolean z2 = qVar instanceof InterfaceC0076p;
        boolean z3 = qVar instanceof T.k;
        if (z2 && z3) {
            c0065e = new C0065e((T.k) qVar, r3, (InterfaceC0076p) qVar);
        } else if (z3) {
            c0065e = new C0065e((T.k) qVar, r3, obj);
        } else if (z2) {
            c0065e = (InterfaceC0076p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1436b.get(cls);
                b1.d.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0067g[] interfaceC0067gArr = new InterfaceC0067g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                c0065e = new C0137a(3, interfaceC0067gArr);
            } else {
                c0065e = new C0065e(qVar);
            }
        }
        sVar.f1428b = c0065e;
        sVar.f1427a = enumC0073m2;
        C0276a c0276a = this.f1430b;
        n.c a2 = c0276a.a(qVar);
        if (a2 != null) {
            obj = a2.f3276b;
        } else {
            HashMap hashMap2 = c0276a.f3271e;
            n.c cVar = new n.c(qVar, sVar);
            c0276a.d++;
            n.c cVar2 = c0276a.f3282b;
            if (cVar2 == null) {
                c0276a.f3281a = cVar;
                c0276a.f3282b = cVar;
            } else {
                cVar2.f3277c = cVar;
                cVar.d = cVar2;
                c0276a.f3282b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1432e != 0 || this.f1433f) ? 1 : 0;
            EnumC0073m b2 = b(qVar);
            this.f1432e++;
            while (sVar.f1427a.compareTo(b2) < 0 && this.f1430b.f3271e.containsKey(qVar)) {
                arrayList.add(sVar.f1427a);
                C0070j c0070j = EnumC0072l.Companion;
                EnumC0073m enumC0073m3 = sVar.f1427a;
                c0070j.getClass();
                EnumC0072l a3 = C0070j.a(enumC0073m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1427a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1432e--;
        }
    }

    public final EnumC0073m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1430b.f3271e;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).d : null;
        EnumC0073m enumC0073m = (cVar == null || (sVar = (s) cVar.f3276b) == null) ? null : sVar.f1427a;
        ArrayList arrayList = this.h;
        EnumC0073m enumC0073m2 = arrayList.isEmpty() ? null : (EnumC0073m) arrayList.get(arrayList.size() - 1);
        EnumC0073m enumC0073m3 = this.f1431c;
        b1.d.e(enumC0073m3, "state1");
        if (enumC0073m == null || enumC0073m.compareTo(enumC0073m3) >= 0) {
            enumC0073m = enumC0073m3;
        }
        return (enumC0073m2 == null || enumC0073m2.compareTo(enumC0073m) >= 0) ? enumC0073m : enumC0073m2;
    }

    public final void c(String str) {
        if (this.f1429a) {
            ((C0274a) C0274a.w().d).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0072l enumC0072l) {
        b1.d.e(enumC0072l, "event");
        c("handleLifecycleEvent");
        e(enumC0072l.a());
    }

    public final void e(EnumC0073m enumC0073m) {
        EnumC0073m enumC0073m2 = this.f1431c;
        if (enumC0073m2 == enumC0073m) {
            return;
        }
        EnumC0073m enumC0073m3 = EnumC0073m.f1422b;
        EnumC0073m enumC0073m4 = EnumC0073m.f1421a;
        if (enumC0073m2 == enumC0073m3 && enumC0073m == enumC0073m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0073m + ", but was " + this.f1431c + " in component " + this.d.get()).toString());
        }
        this.f1431c = enumC0073m;
        if (this.f1433f || this.f1432e != 0) {
            this.f1434g = true;
            return;
        }
        this.f1433f = true;
        h();
        this.f1433f = false;
        if (this.f1431c == enumC0073m4) {
            this.f1430b = new C0276a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1430b.b(qVar);
    }

    public final void g() {
        EnumC0073m enumC0073m = EnumC0073m.f1423c;
        c("setCurrentState");
        e(enumC0073m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1434g = false;
        r0 = r7.f1431c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = k1.a.f2771a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = j1.a.f2533c;
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
        r0 = r1.f2534b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f2534b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f2534b;
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
    
        r1.f2534b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f2534b = r0 + 2;
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
            C0276a c0276a = this.f1430b;
            if (c0276a.d != 0) {
                n.c cVar = c0276a.f3281a;
                b1.d.b(cVar);
                EnumC0073m enumC0073m = ((s) cVar.f3276b).f1427a;
                n.c cVar2 = this.f1430b.f3282b;
                b1.d.b(cVar2);
                EnumC0073m enumC0073m2 = ((s) cVar2.f3276b).f1427a;
                if (enumC0073m == enumC0073m2 && this.f1431c == enumC0073m2) {
                    break;
                }
                this.f1434g = false;
                EnumC0073m enumC0073m3 = this.f1431c;
                n.c cVar3 = this.f1430b.f3281a;
                b1.d.b(cVar3);
                if (enumC0073m3.compareTo(((s) cVar3.f3276b).f1427a) < 0) {
                    C0276a c0276a2 = this.f1430b;
                    n.b bVar = new n.b(c0276a2.f3282b, c0276a2.f3281a, 1);
                    c0276a2.f3283c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1434g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        b1.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1427a.compareTo(this.f1431c) > 0 && !this.f1434g && this.f1430b.f3271e.containsKey(qVar)) {
                            C0070j c0070j = EnumC0072l.Companion;
                            EnumC0073m enumC0073m4 = sVar.f1427a;
                            c0070j.getClass();
                            b1.d.e(enumC0073m4, "state");
                            int ordinal = enumC0073m4.ordinal();
                            EnumC0072l enumC0072l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0072l.ON_PAUSE : EnumC0072l.ON_STOP : EnumC0072l.ON_DESTROY;
                            if (enumC0072l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1427a);
                            }
                            this.h.add(enumC0072l.a());
                            sVar.a(rVar, enumC0072l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1430b.f3282b;
                if (!this.f1434g && cVar4 != null && this.f1431c.compareTo(((s) cVar4.f3276b).f1427a) > 0) {
                    C0276a c0276a3 = this.f1430b;
                    c0276a3.getClass();
                    n.d dVar = new n.d(c0276a3);
                    c0276a3.f3283c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1434g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1427a.compareTo(this.f1431c) < 0 && !this.f1434g && this.f1430b.f3271e.containsKey(qVar2)) {
                            this.h.add(sVar2.f1427a);
                            C0070j c0070j2 = EnumC0072l.Companion;
                            EnumC0073m enumC0073m5 = sVar2.f1427a;
                            c0070j2.getClass();
                            EnumC0072l a2 = C0070j.a(enumC0073m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1427a);
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
