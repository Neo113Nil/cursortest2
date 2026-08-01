package androidx.lifecycle;

import android.os.Looper;
import h0.C0129a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0275a;
import n.C0277a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1369a;

    /* renamed from: b, reason: collision with root package name */
    public C0277a f1370b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0069m f1371c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1372e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1373f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1374g;
    public final ArrayList h;
    public final f1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1369a = true;
        this.f1370b = new C0277a();
        EnumC0069m enumC0069m = EnumC0069m.f1362b;
        this.f1371c = enumC0069m;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new f1.a(enumC0069m);
    }

    public final void a(q qVar) {
        InterfaceC0072p c0061e;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        EnumC0069m enumC0069m = this.f1371c;
        EnumC0069m enumC0069m2 = EnumC0069m.f1361a;
        if (enumC0069m != enumC0069m2) {
            enumC0069m2 = EnumC0069m.f1362b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1375a;
        boolean z2 = qVar instanceof InterfaceC0072p;
        boolean z3 = qVar instanceof T.k;
        if (z2 && z3) {
            c0061e = new C0061e((T.k) qVar, r3, (InterfaceC0072p) qVar);
        } else if (z3) {
            c0061e = new C0061e((T.k) qVar, r3, obj);
        } else if (z2) {
            c0061e = (InterfaceC0072p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1376b.get(cls);
                X0.d.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0063g[] interfaceC0063gArr = new InterfaceC0063g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                c0061e = new C0129a(3, interfaceC0063gArr);
            } else {
                c0061e = new C0061e(qVar);
            }
        }
        sVar.f1368b = c0061e;
        sVar.f1367a = enumC0069m2;
        C0277a c0277a = this.f1370b;
        n.c a2 = c0277a.a(qVar);
        if (a2 != null) {
            obj = a2.f3272b;
        } else {
            HashMap hashMap2 = c0277a.f3267e;
            n.c cVar = new n.c(qVar, sVar);
            c0277a.d++;
            n.c cVar2 = c0277a.f3278b;
            if (cVar2 == null) {
                c0277a.f3277a = cVar;
                c0277a.f3278b = cVar;
            } else {
                cVar2.f3273c = cVar;
                cVar.d = cVar2;
                c0277a.f3278b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1372e != 0 || this.f1373f) ? 1 : 0;
            EnumC0069m b2 = b(qVar);
            this.f1372e++;
            while (sVar.f1367a.compareTo(b2) < 0 && this.f1370b.f3267e.containsKey(qVar)) {
                arrayList.add(sVar.f1367a);
                C0066j c0066j = EnumC0068l.Companion;
                EnumC0069m enumC0069m3 = sVar.f1367a;
                c0066j.getClass();
                EnumC0068l a3 = C0066j.a(enumC0069m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1367a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1372e--;
        }
    }

    public final EnumC0069m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1370b.f3267e;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).d : null;
        EnumC0069m enumC0069m = (cVar == null || (sVar = (s) cVar.f3272b) == null) ? null : sVar.f1367a;
        ArrayList arrayList = this.h;
        EnumC0069m enumC0069m2 = arrayList.isEmpty() ? null : (EnumC0069m) arrayList.get(arrayList.size() - 1);
        EnumC0069m enumC0069m3 = this.f1371c;
        X0.d.e(enumC0069m3, "state1");
        if (enumC0069m == null || enumC0069m.compareTo(enumC0069m3) >= 0) {
            enumC0069m = enumC0069m3;
        }
        return (enumC0069m2 == null || enumC0069m2.compareTo(enumC0069m) >= 0) ? enumC0069m : enumC0069m2;
    }

    public final void c(String str) {
        if (this.f1369a) {
            ((C0275a) C0275a.l().f3188b).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0068l enumC0068l) {
        X0.d.e(enumC0068l, "event");
        c("handleLifecycleEvent");
        e(enumC0068l.a());
    }

    public final void e(EnumC0069m enumC0069m) {
        EnumC0069m enumC0069m2 = this.f1371c;
        if (enumC0069m2 == enumC0069m) {
            return;
        }
        EnumC0069m enumC0069m3 = EnumC0069m.f1362b;
        EnumC0069m enumC0069m4 = EnumC0069m.f1361a;
        if (enumC0069m2 == enumC0069m3 && enumC0069m == enumC0069m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0069m + ", but was " + this.f1371c + " in component " + this.d.get()).toString());
        }
        this.f1371c = enumC0069m;
        if (this.f1373f || this.f1372e != 0) {
            this.f1374g = true;
            return;
        }
        this.f1373f = true;
        h();
        this.f1373f = false;
        if (this.f1371c == enumC0069m4) {
            this.f1370b = new C0277a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1370b.b(qVar);
    }

    public final void g() {
        EnumC0069m enumC0069m = EnumC0069m.f1363c;
        c("setCurrentState");
        e(enumC0069m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1374g = false;
        r0 = r7.f1371c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = g1.a.f2369a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = f1.a.f2189c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (X0.d.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f2190b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f2190b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f2190b;
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
    
        r1.f2190b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f2190b = r0 + 2;
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
            C0277a c0277a = this.f1370b;
            if (c0277a.d != 0) {
                n.c cVar = c0277a.f3277a;
                X0.d.b(cVar);
                EnumC0069m enumC0069m = ((s) cVar.f3272b).f1367a;
                n.c cVar2 = this.f1370b.f3278b;
                X0.d.b(cVar2);
                EnumC0069m enumC0069m2 = ((s) cVar2.f3272b).f1367a;
                if (enumC0069m == enumC0069m2 && this.f1371c == enumC0069m2) {
                    break;
                }
                this.f1374g = false;
                EnumC0069m enumC0069m3 = this.f1371c;
                n.c cVar3 = this.f1370b.f3277a;
                X0.d.b(cVar3);
                if (enumC0069m3.compareTo(((s) cVar3.f3272b).f1367a) < 0) {
                    C0277a c0277a2 = this.f1370b;
                    n.b bVar = new n.b(c0277a2.f3278b, c0277a2.f3277a, 1);
                    c0277a2.f3279c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1374g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        X0.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1367a.compareTo(this.f1371c) > 0 && !this.f1374g && this.f1370b.f3267e.containsKey(qVar)) {
                            C0066j c0066j = EnumC0068l.Companion;
                            EnumC0069m enumC0069m4 = sVar.f1367a;
                            c0066j.getClass();
                            X0.d.e(enumC0069m4, "state");
                            int ordinal = enumC0069m4.ordinal();
                            EnumC0068l enumC0068l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0068l.ON_PAUSE : EnumC0068l.ON_STOP : EnumC0068l.ON_DESTROY;
                            if (enumC0068l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1367a);
                            }
                            this.h.add(enumC0068l.a());
                            sVar.a(rVar, enumC0068l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1370b.f3278b;
                if (!this.f1374g && cVar4 != null && this.f1371c.compareTo(((s) cVar4.f3272b).f1367a) > 0) {
                    C0277a c0277a3 = this.f1370b;
                    c0277a3.getClass();
                    n.d dVar = new n.d(c0277a3);
                    c0277a3.f3279c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1374g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1367a.compareTo(this.f1371c) < 0 && !this.f1374g && this.f1370b.f3267e.containsKey(qVar2)) {
                            this.h.add(sVar2.f1367a);
                            C0066j c0066j2 = EnumC0068l.Companion;
                            EnumC0069m enumC0069m5 = sVar2.f1367a;
                            c0066j2.getClass();
                            EnumC0068l a2 = C0066j.a(enumC0069m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1367a);
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
