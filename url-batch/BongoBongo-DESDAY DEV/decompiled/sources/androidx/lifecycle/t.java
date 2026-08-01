package androidx.lifecycle;

import android.os.Looper;
import j0.C0146a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n.C0263a;
import o.C0280a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1580a;

    /* renamed from: b, reason: collision with root package name */
    public C0280a f1581b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0079m f1582c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1583e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1584f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1585g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1586h;
    public final p1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1580a = true;
        this.f1581b = new C0280a();
        EnumC0079m enumC0079m = EnumC0079m.f1573b;
        this.f1582c = enumC0079m;
        this.f1586h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new p1.a(enumC0079m);
    }

    public final void a(q qVar) {
        InterfaceC0082p c0071e;
        r rVar;
        ArrayList arrayList = this.f1586h;
        Object obj = null;
        c("addObserver");
        EnumC0079m enumC0079m = this.f1582c;
        EnumC0079m enumC0079m2 = EnumC0079m.f1572a;
        if (enumC0079m != enumC0079m2) {
            enumC0079m2 = EnumC0079m.f1573b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1587a;
        boolean z2 = qVar instanceof InterfaceC0082p;
        boolean z3 = qVar instanceof V.k;
        if (z2 && z3) {
            c0071e = new C0071e((V.k) qVar, r3, (InterfaceC0082p) qVar);
        } else if (z3) {
            c0071e = new C0071e((V.k) qVar, r3, obj);
        } else if (z2) {
            c0071e = (InterfaceC0082p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1588b.get(cls);
                h1.d.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0073g[] interfaceC0073gArr = new InterfaceC0073g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                c0071e = new C0146a(3, interfaceC0073gArr);
            } else {
                c0071e = new C0071e(qVar);
            }
        }
        sVar.f1579b = c0071e;
        sVar.f1578a = enumC0079m2;
        C0280a c0280a = this.f1581b;
        o.c a2 = c0280a.a(qVar);
        if (a2 != null) {
            obj = a2.f3399b;
        } else {
            HashMap hashMap2 = c0280a.f3394e;
            o.c cVar = new o.c(qVar, sVar);
            c0280a.d++;
            o.c cVar2 = c0280a.f3405b;
            if (cVar2 == null) {
                c0280a.f3404a = cVar;
                c0280a.f3405b = cVar;
            } else {
                cVar2.f3400c = cVar;
                cVar.d = cVar2;
                c0280a.f3405b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1583e != 0 || this.f1584f) ? 1 : 0;
            EnumC0079m b2 = b(qVar);
            this.f1583e++;
            while (sVar.f1578a.compareTo(b2) < 0 && this.f1581b.f3394e.containsKey(qVar)) {
                arrayList.add(sVar.f1578a);
                C0076j c0076j = EnumC0078l.Companion;
                EnumC0079m enumC0079m3 = sVar.f1578a;
                c0076j.getClass();
                EnumC0078l a3 = C0076j.a(enumC0079m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1578a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1583e--;
        }
    }

    public final EnumC0079m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1581b.f3394e;
        o.c cVar = hashMap.containsKey(qVar) ? ((o.c) hashMap.get(qVar)).d : null;
        EnumC0079m enumC0079m = (cVar == null || (sVar = (s) cVar.f3399b) == null) ? null : sVar.f1578a;
        ArrayList arrayList = this.f1586h;
        EnumC0079m enumC0079m2 = arrayList.isEmpty() ? null : (EnumC0079m) arrayList.get(arrayList.size() - 1);
        EnumC0079m enumC0079m3 = this.f1582c;
        h1.d.e(enumC0079m3, "state1");
        if (enumC0079m == null || enumC0079m.compareTo(enumC0079m3) >= 0) {
            enumC0079m = enumC0079m3;
        }
        return (enumC0079m2 == null || enumC0079m2.compareTo(enumC0079m) >= 0) ? enumC0079m : enumC0079m2;
    }

    public final void c(String str) {
        if (this.f1580a) {
            ((C0263a) C0263a.s().d).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0078l enumC0078l) {
        h1.d.e(enumC0078l, "event");
        c("handleLifecycleEvent");
        e(enumC0078l.a());
    }

    public final void e(EnumC0079m enumC0079m) {
        EnumC0079m enumC0079m2 = this.f1582c;
        if (enumC0079m2 == enumC0079m) {
            return;
        }
        EnumC0079m enumC0079m3 = EnumC0079m.f1573b;
        EnumC0079m enumC0079m4 = EnumC0079m.f1572a;
        if (enumC0079m2 == enumC0079m3 && enumC0079m == enumC0079m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0079m + ", but was " + this.f1582c + " in component " + this.d.get()).toString());
        }
        this.f1582c = enumC0079m;
        if (this.f1584f || this.f1583e != 0) {
            this.f1585g = true;
            return;
        }
        this.f1584f = true;
        h();
        this.f1584f = false;
        if (this.f1582c == enumC0079m4) {
            this.f1581b = new C0280a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1581b.b(qVar);
    }

    public final void g() {
        EnumC0079m enumC0079m = EnumC0079m.f1574c;
        c("setCurrentState");
        e(enumC0079m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1585g = false;
        r0 = r7.f1582c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = q1.a.f3524a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = p1.a.f3477c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (h1.d.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f3478b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f3478b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f3478b;
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
    
        r1.f3478b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f3478b = r0 + 2;
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
            C0280a c0280a = this.f1581b;
            if (c0280a.d != 0) {
                o.c cVar = c0280a.f3404a;
                h1.d.b(cVar);
                EnumC0079m enumC0079m = ((s) cVar.f3399b).f1578a;
                o.c cVar2 = this.f1581b.f3405b;
                h1.d.b(cVar2);
                EnumC0079m enumC0079m2 = ((s) cVar2.f3399b).f1578a;
                if (enumC0079m == enumC0079m2 && this.f1582c == enumC0079m2) {
                    break;
                }
                this.f1585g = false;
                EnumC0079m enumC0079m3 = this.f1582c;
                o.c cVar3 = this.f1581b.f3404a;
                h1.d.b(cVar3);
                if (enumC0079m3.compareTo(((s) cVar3.f3399b).f1578a) < 0) {
                    C0280a c0280a2 = this.f1581b;
                    o.b bVar = new o.b(c0280a2.f3405b, c0280a2.f3404a, 1);
                    c0280a2.f3406c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1585g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        h1.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1578a.compareTo(this.f1582c) > 0 && !this.f1585g && this.f1581b.f3394e.containsKey(qVar)) {
                            C0076j c0076j = EnumC0078l.Companion;
                            EnumC0079m enumC0079m4 = sVar.f1578a;
                            c0076j.getClass();
                            h1.d.e(enumC0079m4, "state");
                            int ordinal = enumC0079m4.ordinal();
                            EnumC0078l enumC0078l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0078l.ON_PAUSE : EnumC0078l.ON_STOP : EnumC0078l.ON_DESTROY;
                            if (enumC0078l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1578a);
                            }
                            this.f1586h.add(enumC0078l.a());
                            sVar.a(rVar, enumC0078l);
                            this.f1586h.remove(r4.size() - 1);
                        }
                    }
                }
                o.c cVar4 = this.f1581b.f3405b;
                if (!this.f1585g && cVar4 != null && this.f1582c.compareTo(((s) cVar4.f3399b).f1578a) > 0) {
                    C0280a c0280a3 = this.f1581b;
                    c0280a3.getClass();
                    o.d dVar = new o.d(c0280a3);
                    c0280a3.f3406c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1585g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1578a.compareTo(this.f1582c) < 0 && !this.f1585g && this.f1581b.f3394e.containsKey(qVar2)) {
                            this.f1586h.add(sVar2.f1578a);
                            C0076j c0076j2 = EnumC0078l.Companion;
                            EnumC0079m enumC0079m5 = sVar2.f1578a;
                            c0076j2.getClass();
                            EnumC0078l a2 = C0076j.a(enumC0079m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1578a);
                            }
                            sVar2.a(rVar, a2);
                            this.f1586h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
