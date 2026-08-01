package androidx.lifecycle;

import android.os.Looper;
import h0.C0135a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0271a;
import n.C0273a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1404a;

    /* renamed from: b, reason: collision with root package name */
    public C0273a f1405b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0071m f1406c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1407e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1408f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1409g;
    public final ArrayList h;
    public final h1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1404a = true;
        this.f1405b = new C0273a();
        EnumC0071m enumC0071m = EnumC0071m.f1397b;
        this.f1406c = enumC0071m;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new h1.a(enumC0071m);
    }

    public final void a(q qVar) {
        InterfaceC0074p c0063e;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        EnumC0071m enumC0071m = this.f1406c;
        EnumC0071m enumC0071m2 = EnumC0071m.f1396a;
        if (enumC0071m != enumC0071m2) {
            enumC0071m2 = EnumC0071m.f1397b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1410a;
        boolean z2 = qVar instanceof InterfaceC0074p;
        boolean z3 = qVar instanceof T.k;
        if (z2 && z3) {
            c0063e = new C0063e((T.k) qVar, r3, (InterfaceC0074p) qVar);
        } else if (z3) {
            c0063e = new C0063e((T.k) qVar, r3, obj);
        } else if (z2) {
            c0063e = (InterfaceC0074p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1411b.get(cls);
                Z0.d.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0065g[] interfaceC0065gArr = new InterfaceC0065g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                c0063e = new C0135a(3, interfaceC0065gArr);
            } else {
                c0063e = new C0063e(qVar);
            }
        }
        sVar.f1403b = c0063e;
        sVar.f1402a = enumC0071m2;
        C0273a c0273a = this.f1405b;
        n.c a2 = c0273a.a(qVar);
        if (a2 != null) {
            obj = a2.f3273b;
        } else {
            HashMap hashMap2 = c0273a.f3268e;
            n.c cVar = new n.c(qVar, sVar);
            c0273a.d++;
            n.c cVar2 = c0273a.f3279b;
            if (cVar2 == null) {
                c0273a.f3278a = cVar;
                c0273a.f3279b = cVar;
            } else {
                cVar2.f3274c = cVar;
                cVar.d = cVar2;
                c0273a.f3279b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1407e != 0 || this.f1408f) ? 1 : 0;
            EnumC0071m b2 = b(qVar);
            this.f1407e++;
            while (sVar.f1402a.compareTo(b2) < 0 && this.f1405b.f3268e.containsKey(qVar)) {
                arrayList.add(sVar.f1402a);
                C0068j c0068j = EnumC0070l.Companion;
                EnumC0071m enumC0071m3 = sVar.f1402a;
                c0068j.getClass();
                EnumC0070l a3 = C0068j.a(enumC0071m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1402a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1407e--;
        }
    }

    public final EnumC0071m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1405b.f3268e;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).d : null;
        EnumC0071m enumC0071m = (cVar == null || (sVar = (s) cVar.f3273b) == null) ? null : sVar.f1402a;
        ArrayList arrayList = this.h;
        EnumC0071m enumC0071m2 = arrayList.isEmpty() ? null : (EnumC0071m) arrayList.get(arrayList.size() - 1);
        EnumC0071m enumC0071m3 = this.f1406c;
        Z0.d.e(enumC0071m3, "state1");
        if (enumC0071m == null || enumC0071m.compareTo(enumC0071m3) >= 0) {
            enumC0071m = enumC0071m3;
        }
        return (enumC0071m2 == null || enumC0071m2.compareTo(enumC0071m) >= 0) ? enumC0071m : enumC0071m2;
    }

    public final void c(String str) {
        if (this.f1404a) {
            ((C0271a) C0271a.n().d).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0070l enumC0070l) {
        Z0.d.e(enumC0070l, "event");
        c("handleLifecycleEvent");
        e(enumC0070l.a());
    }

    public final void e(EnumC0071m enumC0071m) {
        EnumC0071m enumC0071m2 = this.f1406c;
        if (enumC0071m2 == enumC0071m) {
            return;
        }
        EnumC0071m enumC0071m3 = EnumC0071m.f1397b;
        EnumC0071m enumC0071m4 = EnumC0071m.f1396a;
        if (enumC0071m2 == enumC0071m3 && enumC0071m == enumC0071m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0071m + ", but was " + this.f1406c + " in component " + this.d.get()).toString());
        }
        this.f1406c = enumC0071m;
        if (this.f1408f || this.f1407e != 0) {
            this.f1409g = true;
            return;
        }
        this.f1408f = true;
        h();
        this.f1408f = false;
        if (this.f1406c == enumC0071m4) {
            this.f1405b = new C0273a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1405b.b(qVar);
    }

    public final void g() {
        EnumC0071m enumC0071m = EnumC0071m.f1398c;
        c("setCurrentState");
        e(enumC0071m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1409g = false;
        r0 = r7.f1406c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = i1.a.f2467a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = h1.a.f2461c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (Z0.d.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f2462b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f2462b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f2462b;
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
    
        r1.f2462b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f2462b = r0 + 2;
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
            C0273a c0273a = this.f1405b;
            if (c0273a.d != 0) {
                n.c cVar = c0273a.f3278a;
                Z0.d.b(cVar);
                EnumC0071m enumC0071m = ((s) cVar.f3273b).f1402a;
                n.c cVar2 = this.f1405b.f3279b;
                Z0.d.b(cVar2);
                EnumC0071m enumC0071m2 = ((s) cVar2.f3273b).f1402a;
                if (enumC0071m == enumC0071m2 && this.f1406c == enumC0071m2) {
                    break;
                }
                this.f1409g = false;
                EnumC0071m enumC0071m3 = this.f1406c;
                n.c cVar3 = this.f1405b.f3278a;
                Z0.d.b(cVar3);
                if (enumC0071m3.compareTo(((s) cVar3.f3273b).f1402a) < 0) {
                    C0273a c0273a2 = this.f1405b;
                    n.b bVar = new n.b(c0273a2.f3279b, c0273a2.f3278a, 1);
                    c0273a2.f3280c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1409g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        Z0.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1402a.compareTo(this.f1406c) > 0 && !this.f1409g && this.f1405b.f3268e.containsKey(qVar)) {
                            C0068j c0068j = EnumC0070l.Companion;
                            EnumC0071m enumC0071m4 = sVar.f1402a;
                            c0068j.getClass();
                            Z0.d.e(enumC0071m4, "state");
                            int ordinal = enumC0071m4.ordinal();
                            EnumC0070l enumC0070l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0070l.ON_PAUSE : EnumC0070l.ON_STOP : EnumC0070l.ON_DESTROY;
                            if (enumC0070l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1402a);
                            }
                            this.h.add(enumC0070l.a());
                            sVar.a(rVar, enumC0070l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1405b.f3279b;
                if (!this.f1409g && cVar4 != null && this.f1406c.compareTo(((s) cVar4.f3273b).f1402a) > 0) {
                    C0273a c0273a3 = this.f1405b;
                    c0273a3.getClass();
                    n.d dVar = new n.d(c0273a3);
                    c0273a3.f3280c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1409g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1402a.compareTo(this.f1406c) < 0 && !this.f1409g && this.f1405b.f3268e.containsKey(qVar2)) {
                            this.h.add(sVar2.f1402a);
                            C0068j c0068j2 = EnumC0070l.Companion;
                            EnumC0071m enumC0071m5 = sVar2.f1402a;
                            c0068j2.getClass();
                            EnumC0070l a2 = C0068j.a(enumC0071m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1402a);
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
