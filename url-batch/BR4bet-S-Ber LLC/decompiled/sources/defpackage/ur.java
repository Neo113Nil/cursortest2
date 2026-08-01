package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ur implements we {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(ur.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(ur.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public ur(boolean z) {
        this._state$volatile = z ? kr.i : kr.h;
    }

    public static qa t(zt ztVar) {
        while (ztVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zt.b;
            zt f2 = ztVar.f();
            if (f2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(ztVar);
                while (true) {
                    ztVar = (zt) obj;
                    if (!ztVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(ztVar);
                }
            } else {
                ztVar = f2;
            }
        }
        while (true) {
            ztVar = ztVar.h();
            if (!ztVar.i()) {
                if (ztVar instanceof qa) {
                    return (qa) ztVar;
                }
                if (ztVar instanceof iy) {
                    return null;
                }
            }
        }
    }

    public static String z(Object obj) {
        if (!(obj instanceof tr)) {
            return obj instanceof xq ? ((xq) obj).b() ? "Active" : "New" : obj instanceof kc ? "Cancelled" : "Completed";
        }
        tr trVar = (tr) obj;
        return trVar.e() ? "Cancelling" : tr.b.get(trVar) != 0 ? "Completing" : "Active";
    }

    public final Object A(Object obj, Object obj2) {
        if (!(obj instanceof xq)) {
            return kr.c;
        }
        if (((obj instanceof ek) || (obj instanceof rr)) && !(obj instanceof qa) && !(obj2 instanceof kc)) {
            xq xqVar = (xq) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object ejVar = obj2 instanceof xq ? new ej(27) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xqVar, ejVar)) {
                if (atomicReferenceFieldUpdater.get(this) != xqVar) {
                    return kr.e;
                }
            }
            v(obj2);
            i(xqVar, obj2);
            return obj2;
        }
        xq xqVar2 = (xq) obj;
        iy o = o(xqVar2);
        if (o == null) {
            return kr.e;
        }
        tr trVar = xqVar2 instanceof tr ? (tr) xqVar2 : null;
        if (trVar == null) {
            trVar = new tr(o, null);
        }
        synchronized (trVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = tr.b;
            if (atomicIntegerFieldUpdater.get(trVar) != 0) {
                return kr.c;
            }
            atomicIntegerFieldUpdater.set(trVar, 1);
            if (trVar != xqVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, xqVar2, trVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != xqVar2) {
                        return kr.e;
                    }
                }
            }
            boolean e = trVar.e();
            kc kcVar = obj2 instanceof kc ? (kc) obj2 : null;
            if (kcVar != null) {
                trVar.a(kcVar.a);
            }
            Throwable c = e ? null : trVar.c();
            if (c != null) {
                u(o, c);
            }
            qa t = t(o);
            if (t != null && B(trVar, t, obj2)) {
                return kr.d;
            }
            o.e(new et(2), 2);
            qa t2 = t(o);
            return (t2 == null || !B(trVar, t2, obj2)) ? l(trVar, obj2) : kr.d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r1 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        r11 = t(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [jy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(tr trVar, qa qaVar, Object obj) {
        boolean e;
        do {
            ur urVar = qaVar.e;
            sr srVar = new sr(this, trVar, qaVar, obj);
            srVar.d = urVar;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                Object obj2 = atomicReferenceFieldUpdater.get(urVar);
                boolean z = obj2 instanceof ek;
                ?? r6 = jy.a;
                if (!z) {
                    if (!(obj2 instanceof xq)) {
                        boolean z2 = false;
                        break;
                    }
                    xq xqVar = (xq) obj2;
                    iy d = xqVar.d();
                    if (d == null) {
                        urVar.y((rr) obj2);
                    } else {
                        if (srVar.k()) {
                            tr trVar2 = xqVar instanceof tr ? (tr) xqVar : null;
                            if ((trVar2 != null ? trVar2.c() : null) != null) {
                                break;
                            }
                            e = d.e(srVar, 5);
                        } else {
                            e = d.e(srVar, 1);
                        }
                        if (e) {
                            break;
                        }
                    }
                } else {
                    ek ekVar = (ek) obj2;
                    if (ekVar.a) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(urVar, obj2, srVar)) {
                            if (atomicReferenceFieldUpdater.get(urVar) != obj2) {
                                break;
                            }
                        }
                        break;
                    }
                    urVar.x(ekVar);
                }
            }
        } while (qaVar != null);
        return false;
    }

    public final boolean a(Object obj) {
        xj xjVar;
        Object obj2 = kr.c;
        if (this instanceof r70) {
            do {
                Object obj3 = f.get(this);
                if (obj3 instanceof xq) {
                    if (obj3 instanceof tr) {
                        if (tr.b.get((tr) obj3) != 0) {
                        }
                    }
                    obj2 = A(obj3, new kc(j(obj)));
                }
                obj2 = kr.c;
                break;
            } while (obj2 == kr.e);
            if (obj2 == kr.d) {
                return true;
            }
        }
        if (obj2 == kr.c) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof tr)) {
                    if (!(obj4 instanceof xq)) {
                        xjVar = kr.f;
                        break;
                    }
                    if (th == null) {
                        th = j(obj);
                    }
                    xq xqVar = (xq) obj4;
                    if (xqVar.b()) {
                        iy o = o(xqVar);
                        if (o != null) {
                            tr trVar = new tr(o, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, xqVar, trVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != xqVar) {
                                    break;
                                }
                            }
                            u(o, th);
                            xjVar = kr.c;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object A = A(obj4, new kc(th));
                        if (A == kr.c) {
                            g9.r(obj4, "Cannot happen in ");
                            return false;
                        }
                        if (A != kr.e) {
                            obj2 = A;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (tr.d.get((tr) obj4) == kr.g) {
                            xjVar = kr.f;
                        } else {
                            boolean e = ((tr) obj4).e();
                            if (th == null) {
                                th = j(obj);
                            }
                            ((tr) obj4).a(th);
                            Throwable c = e ? null : ((tr) obj4).c();
                            if (c != null) {
                                u(((tr) obj4).a, c);
                            }
                            xjVar = kr.c;
                        }
                    }
                }
            }
            obj2 = xjVar;
        }
        return obj2 == kr.c || obj2 == kr.d || obj2 != kr.f;
    }

    public String b() {
        return "Job was cancelled";
    }

    public boolean c(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return a(th) && n();
    }

    @Override // defpackage.ye
    public final Object f(Object obj, ho hoVar) {
        return hoVar.f(obj, this);
    }

    @Override // defpackage.ye
    public final ye g(ye yeVar) {
        return xf.E(this, yeVar);
    }

    @Override // defpackage.we
    public final xe getKey() {
        return ej.l;
    }

    @Override // defpackage.ye
    public final we h(xe xeVar) {
        xeVar.getClass();
        if (kr.b(ej.l, xeVar)) {
            return this;
        }
        return null;
    }

    public final void i(xq xqVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        pa paVar = (pa) atomicReferenceFieldUpdater.get(this);
        if (paVar != null) {
            paVar.a();
            atomicReferenceFieldUpdater.set(this, jy.a);
        }
        lc lcVar = null;
        kc kcVar = obj instanceof kc ? (kc) obj : null;
        Throwable th = kcVar != null ? kcVar.a : null;
        if (xqVar instanceof rr) {
            try {
                ((rr) xqVar).l(th);
                return;
            } catch (Throwable th2) {
                q(new lc("Exception in completion handler " + xqVar + " for " + this, th2));
                return;
            }
        }
        iy d = xqVar.d();
        if (d != null) {
            d.e(new et(1), 1);
            Object obj2 = zt.a.get(d);
            obj2.getClass();
            for (zt ztVar = (zt) obj2; !ztVar.equals(d); ztVar = ztVar.h()) {
                if (ztVar instanceof rr) {
                    try {
                        ((rr) ztVar).l(th);
                    } catch (Throwable th3) {
                        if (lcVar != null) {
                            la0.f(lcVar, th3);
                        } else {
                            lcVar = new lc("Exception in completion handler " + ztVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (lcVar != null) {
                q(lcVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable j(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        ur urVar = (ur) obj;
        Object obj2 = f.get(urVar);
        if (obj2 instanceof tr) {
            cancellationException = ((tr) obj2).c();
        } else if (obj2 instanceof kc) {
            cancellationException = ((kc) obj2).a;
        } else {
            if (obj2 instanceof xq) {
                g9.r(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new qr("Parent job is ".concat(z(obj2)), cancellationException, urVar) : cancellationException2;
    }

    @Override // defpackage.ye
    public final ye k(xe xeVar) {
        xeVar.getClass();
        return kr.b(ej.l, xeVar) ? gk.f : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object l(tr trVar, Object obj) {
        Throwable th = null;
        kc kcVar = obj instanceof kc ? (kc) obj : null;
        Throwable th2 = kcVar != null ? kcVar.a : null;
        synchronized (trVar) {
            trVar.e();
            ArrayList f2 = trVar.f(th2);
            if (!f2.isEmpty()) {
                int size = f2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj2 = f2.get(i);
                    i++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        th = obj2;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) f2.get(0);
                }
            } else if (trVar.e()) {
                th = new qr(b(), null, this);
            }
            if (th != null && f2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f2.size()));
                int size2 = f2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = f2.get(i2);
                    i2++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        la0.f(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new kc(th);
        }
        if (th != null) {
            boolean z = th instanceof CancellationException;
            pa paVar = (pa) g.get(this);
            if (paVar != null && paVar != jy.a) {
                z = paVar.c(th) || z;
            }
            if (z || p(th)) {
                obj.getClass();
                kc.b.compareAndSet((kc) obj, 0, 1);
            }
        }
        v(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object ejVar = obj instanceof xq ? new ej(27) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, trVar, ejVar) && atomicReferenceFieldUpdater.get(this) == trVar) {
        }
        i(trVar, obj);
        return obj;
    }

    public final CancellationException m() {
        CancellationException cancellationException;
        Object obj = f.get(this);
        if (obj instanceof tr) {
            Throwable c = ((tr) obj).c();
            if (c == null) {
                g9.r(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
            return cancellationException == null ? new qr(concat, c, this) : cancellationException;
        }
        if (obj instanceof xq) {
            g9.r(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof kc)) {
            return new qr(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((kc) obj).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new qr(b(), th, this) : cancellationException;
    }

    public boolean n() {
        return true;
    }

    public final iy o(xq xqVar) {
        iy d = xqVar.d();
        if (d != null) {
            return d;
        }
        if (xqVar instanceof ek) {
            return new iy();
        }
        if (xqVar instanceof rr) {
            y((rr) xqVar);
            return null;
        }
        g9.r(xqVar, "State should have list: ");
        return null;
    }

    public boolean p(Throwable th) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        if (r4 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qa, rr, zt] */
    /* JADX WARN: Type inference failed for: r3v2, types: [di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r5v10, types: [iy, zt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(ur urVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
        jy jyVar = jy.a;
        if (urVar == null) {
            atomicReferenceFieldUpdater2.set(this, jyVar);
            return;
        }
        loop0: while (true) {
            atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(urVar);
            if (!(obj instanceof ek)) {
                if (!(obj instanceof wq)) {
                    break;
                }
                iy iyVar = ((wq) obj).a;
                while (!atomicReferenceFieldUpdater.compareAndSet(urVar, obj, iyVar)) {
                    if (atomicReferenceFieldUpdater.get(urVar) != obj) {
                        break;
                    }
                }
                break loop0;
            }
            if (!((ek) obj).a) {
                ek ekVar = kr.i;
                while (!atomicReferenceFieldUpdater.compareAndSet(urVar, obj, ekVar)) {
                    if (atomicReferenceFieldUpdater.get(urVar) != obj) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        ?? qaVar = new qa(this);
        qaVar.d = urVar;
        loop2: while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(urVar);
            if (obj2 instanceof ek) {
                ek ekVar2 = (ek) obj2;
                if (ekVar2.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(urVar, obj2, qaVar)) {
                        if (atomicReferenceFieldUpdater.get(urVar) != obj2) {
                            break;
                        }
                    }
                    break loop2;
                }
                urVar.x(ekVar2);
            } else {
                if (obj2 instanceof xq) {
                    ?? d = ((xq) obj2).d();
                    if (d == 0) {
                        urVar.y((rr) obj2);
                    } else if (!d.e(qaVar, 7)) {
                        boolean e = d.e(qaVar, 3);
                        Object obj3 = atomicReferenceFieldUpdater.get(urVar);
                        if (obj3 instanceof tr) {
                            r6 = ((tr) obj3).c();
                        } else {
                            kc kcVar = obj3 instanceof kc ? (kc) obj3 : null;
                            if (kcVar != null) {
                                r6 = kcVar.a;
                            }
                        }
                        qaVar.l(r6);
                    }
                } else {
                    Object obj4 = atomicReferenceFieldUpdater.get(urVar);
                    kc kcVar2 = obj4 instanceof kc ? (kc) obj4 : null;
                    qaVar.l(kcVar2 != null ? kcVar2.a : null);
                }
            }
        }
        atomicReferenceFieldUpdater2.set(this, qaVar);
        if (atomicReferenceFieldUpdater.get(this) instanceof xq) {
            return;
        }
        qaVar.a();
        atomicReferenceFieldUpdater2.set(this, jyVar);
    }

    public boolean s() {
        Object obj = f.get(this);
        return (obj instanceof xq) && ((xq) obj).b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + z(f.get(this)) + '}');
        sb.append('@');
        sb.append(xf.s(this));
        return sb.toString();
    }

    public final void u(iy iyVar, Throwable th) {
        iyVar.e(new et(4), 4);
        Object obj = zt.a.get(iyVar);
        obj.getClass();
        lc lcVar = null;
        for (zt ztVar = (zt) obj; !ztVar.equals(iyVar); ztVar = ztVar.h()) {
            if ((ztVar instanceof rr) && ((rr) ztVar).k()) {
                try {
                    ((rr) ztVar).l(th);
                } catch (Throwable th2) {
                    if (lcVar != null) {
                        la0.f(lcVar, th2);
                    } else {
                        lcVar = new lc("Exception in completion handler " + ztVar + " for " + this, th2);
                    }
                }
            }
        }
        if (lcVar != null) {
            q(lcVar);
        }
        pa paVar = (pa) g.get(this);
        if (paVar == null || paVar == jy.a) {
            return;
        }
        paVar.c(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [wq] */
    public final void x(ek ekVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        iy iyVar = new iy();
        if (!ekVar.a) {
            iyVar = new wq(iyVar);
        }
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, ekVar, iyVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == ekVar);
    }

    public final void y(rr rrVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        iy iyVar = new iy();
        rrVar.getClass();
        zt.b.set(iyVar, rrVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = zt.a;
        atomicReferenceFieldUpdater2.set(iyVar, rrVar);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(rrVar) == rrVar) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(rrVar, rrVar, iyVar)) {
                    if (atomicReferenceFieldUpdater2.get(rrVar) != rrVar) {
                        break;
                    }
                }
                iyVar.g(rrVar);
                break loop0;
            }
            break;
        }
        zt h = rrVar.h();
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, rrVar, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == rrVar);
    }

    public void q(lc lcVar) {
        throw lcVar;
    }

    public void v(Object obj) {
    }

    public void w() {
    }
}
