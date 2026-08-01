package androidx.lifecycle;

import android.os.Looper;
import h0.C0136a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0273a;
import n.C0275a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1474a;

    /* renamed from: b, reason: collision with root package name */
    public C0275a f1475b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0070m f1476c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1477e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1478f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1479g;
    public final ArrayList h;
    public final m1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1474a = true;
        this.f1475b = new C0275a();
        EnumC0070m enumC0070m = EnumC0070m.f1467b;
        this.f1476c = enumC0070m;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new m1.a(enumC0070m);
    }

    public final void a(q qVar) {
        InterfaceC0073p c0062e;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        EnumC0070m enumC0070m = this.f1476c;
        EnumC0070m enumC0070m2 = EnumC0070m.f1466a;
        if (enumC0070m != enumC0070m2) {
            enumC0070m2 = EnumC0070m.f1467b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1480a;
        boolean z2 = qVar instanceof InterfaceC0073p;
        boolean z3 = qVar instanceof T.k;
        if (z2 && z3) {
            c0062e = new C0062e((T.k) qVar, r3, (InterfaceC0073p) qVar);
        } else if (z3) {
            c0062e = new C0062e((T.k) qVar, r3, obj);
        } else if (z2) {
            c0062e = (InterfaceC0073p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1481b.get(cls);
                e1.d.b(obj2);
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
                c0062e = new C0136a(3, interfaceC0064gArr);
            } else {
                c0062e = new C0062e(qVar);
            }
        }
        sVar.f1473b = c0062e;
        sVar.f1472a = enumC0070m2;
        C0275a c0275a = this.f1475b;
        n.c a2 = c0275a.a(qVar);
        if (a2 != null) {
            obj = a2.f3189b;
        } else {
            HashMap hashMap2 = c0275a.f3184e;
            n.c cVar = new n.c(qVar, sVar);
            c0275a.d++;
            n.c cVar2 = c0275a.f3195b;
            if (cVar2 == null) {
                c0275a.f3194a = cVar;
                c0275a.f3195b = cVar;
            } else {
                cVar2.f3190c = cVar;
                cVar.d = cVar2;
                c0275a.f3195b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1477e != 0 || this.f1478f) ? 1 : 0;
            EnumC0070m b2 = b(qVar);
            this.f1477e++;
            while (sVar.f1472a.compareTo(b2) < 0 && this.f1475b.f3184e.containsKey(qVar)) {
                arrayList.add(sVar.f1472a);
                C0067j c0067j = EnumC0069l.Companion;
                EnumC0070m enumC0070m3 = sVar.f1472a;
                c0067j.getClass();
                EnumC0069l a3 = C0067j.a(enumC0070m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1472a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1477e--;
        }
    }

    public final EnumC0070m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1475b.f3184e;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).d : null;
        EnumC0070m enumC0070m = (cVar == null || (sVar = (s) cVar.f3189b) == null) ? null : sVar.f1472a;
        ArrayList arrayList = this.h;
        EnumC0070m enumC0070m2 = arrayList.isEmpty() ? null : (EnumC0070m) arrayList.get(arrayList.size() - 1);
        EnumC0070m enumC0070m3 = this.f1476c;
        e1.d.e(enumC0070m3, "state1");
        if (enumC0070m == null || enumC0070m.compareTo(enumC0070m3) >= 0) {
            enumC0070m = enumC0070m3;
        }
        return (enumC0070m2 == null || enumC0070m2.compareTo(enumC0070m) >= 0) ? enumC0070m : enumC0070m2;
    }

    public final void c(String str) {
        if (this.f1474a) {
            ((C0273a) C0273a.u().d).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0069l enumC0069l) {
        e1.d.e(enumC0069l, "event");
        c("handleLifecycleEvent");
        e(enumC0069l.a());
    }

    public final void e(EnumC0070m enumC0070m) {
        EnumC0070m enumC0070m2 = this.f1476c;
        if (enumC0070m2 == enumC0070m) {
            return;
        }
        EnumC0070m enumC0070m3 = EnumC0070m.f1467b;
        EnumC0070m enumC0070m4 = EnumC0070m.f1466a;
        if (enumC0070m2 == enumC0070m3 && enumC0070m == enumC0070m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0070m + ", but was " + this.f1476c + " in component " + this.d.get()).toString());
        }
        this.f1476c = enumC0070m;
        if (this.f1478f || this.f1477e != 0) {
            this.f1479g = true;
            return;
        }
        this.f1478f = true;
        h();
        this.f1478f = false;
        if (this.f1476c == enumC0070m4) {
            this.f1475b = new C0275a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1475b.b(qVar);
    }

    public final void g() {
        EnumC0070m enumC0070m = EnumC0070m.f1468c;
        c("setCurrentState");
        e(enumC0070m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1479g = false;
        r0 = r7.f1476c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = n1.a.f3197a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = m1.a.f3182c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (e1.d.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f3183b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f3183b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f3183b;
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
    
        r1.f3183b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f3183b = r0 + 2;
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
            C0275a c0275a = this.f1475b;
            if (c0275a.d != 0) {
                n.c cVar = c0275a.f3194a;
                e1.d.b(cVar);
                EnumC0070m enumC0070m = ((s) cVar.f3189b).f1472a;
                n.c cVar2 = this.f1475b.f3195b;
                e1.d.b(cVar2);
                EnumC0070m enumC0070m2 = ((s) cVar2.f3189b).f1472a;
                if (enumC0070m == enumC0070m2 && this.f1476c == enumC0070m2) {
                    break;
                }
                this.f1479g = false;
                EnumC0070m enumC0070m3 = this.f1476c;
                n.c cVar3 = this.f1475b.f3194a;
                e1.d.b(cVar3);
                if (enumC0070m3.compareTo(((s) cVar3.f3189b).f1472a) < 0) {
                    C0275a c0275a2 = this.f1475b;
                    n.b bVar = new n.b(c0275a2.f3195b, c0275a2.f3194a, 1);
                    c0275a2.f3196c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1479g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        e1.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1472a.compareTo(this.f1476c) > 0 && !this.f1479g && this.f1475b.f3184e.containsKey(qVar)) {
                            C0067j c0067j = EnumC0069l.Companion;
                            EnumC0070m enumC0070m4 = sVar.f1472a;
                            c0067j.getClass();
                            e1.d.e(enumC0070m4, "state");
                            int ordinal = enumC0070m4.ordinal();
                            EnumC0069l enumC0069l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0069l.ON_PAUSE : EnumC0069l.ON_STOP : EnumC0069l.ON_DESTROY;
                            if (enumC0069l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1472a);
                            }
                            this.h.add(enumC0069l.a());
                            sVar.a(rVar, enumC0069l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1475b.f3195b;
                if (!this.f1479g && cVar4 != null && this.f1476c.compareTo(((s) cVar4.f3189b).f1472a) > 0) {
                    C0275a c0275a3 = this.f1475b;
                    c0275a3.getClass();
                    n.d dVar = new n.d(c0275a3);
                    c0275a3.f3196c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1479g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1472a.compareTo(this.f1476c) < 0 && !this.f1479g && this.f1475b.f3184e.containsKey(qVar2)) {
                            this.h.add(sVar2.f1472a);
                            C0067j c0067j2 = EnumC0069l.Companion;
                            EnumC0070m enumC0070m5 = sVar2.f1472a;
                            c0067j2.getClass();
                            EnumC0069l a2 = C0067j.a(enumC0070m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1472a);
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
