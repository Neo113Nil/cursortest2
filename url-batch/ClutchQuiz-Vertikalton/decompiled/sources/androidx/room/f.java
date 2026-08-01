package androidx.room;

import android.os.CancellationSignal;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o1.AbstractC0296o;
import o1.AbstractC0299s;
import o1.C0283b;
import o1.C0285d;
import o1.C0286e;
import o1.C0290i;
import o1.C0291j;
import o1.C0297p;
import o1.F;
import o1.G;
import o1.InterfaceC0306z;
import o1.K;
import o1.M;
import o1.U;
import o1.W;
import o1.X;

/* loaded from: classes.dex */
public abstract class f {
    public static final Object a(t tVar, CancellationSignal cancellationSignal, Callable callable, X0.d dVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        if (tVar.isOpenInternal() && tVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.h().j(z.f1694a) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = tVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = new F(tVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        AbstractC0296o abstractC0296o = (AbstractC0296o) obj;
        C0285d c0285d = new C0285d(T.d.y(dVar));
        InterfaceC0306z m2 = c0285d.m();
        if (m2 != null && !(C0285d.f3335g.get(c0285d) instanceof X)) {
            m2.e();
            C0285d.h.set(c0285d, W.f3329a);
        }
        K k2 = new K(new d(cancellationSignal, AbstractC0299s.h(G.f3311a, abstractC0296o, new e(callable, c0285d, null))));
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0285d.f3335g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0285d);
            if (obj2 instanceof C0283b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c0285d, obj2, k2)) {
                    if (atomicReferenceFieldUpdater.get(c0285d) != obj2) {
                        break;
                    }
                }
                break loop0;
            }
            if (!(obj2 instanceof K)) {
                if (!(obj2 instanceof C0291j)) {
                    if (!(obj2 instanceof C0290i)) {
                        C0290i c0290i = new C0290i(obj2, k2, (f1.l) null, (CancellationException) null, 28);
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0285d, obj2, c0290i)) {
                            if (atomicReferenceFieldUpdater.get(c0285d) != obj2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    C0290i c0290i2 = (C0290i) obj2;
                    if (c0290i2.f3344b != null) {
                        C0285d.o(k2, obj2);
                        throw null;
                    }
                    Throwable th = c0290i2.f3346e;
                    if (th == null) {
                        C0290i a2 = C0290i.a(c0290i2, k2, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0285d, obj2, a2)) {
                            if (atomicReferenceFieldUpdater.get(c0285d) != obj2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    c0285d.j(k2, th);
                    break;
                }
                C0291j c0291j = (C0291j) obj2;
                c0291j.getClass();
                if (!C0291j.f3347b.compareAndSet(c0291j, 0, 1)) {
                    C0285d.o(k2, obj2);
                    throw null;
                }
                if (obj2 instanceof C0286e) {
                    if (!(obj2 instanceof C0291j)) {
                        c0291j = null;
                    }
                    c0285d.j(k2, c0291j != null ? c0291j.f3348a : null);
                }
            } else {
                C0285d.o(k2, obj2);
                throw null;
            }
        }
        boolean n2 = c0285d.n();
        do {
            atomicIntegerFieldUpdater = C0285d.f3334f;
            i = atomicIntegerFieldUpdater.get(c0285d);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (n2) {
                    c0285d.p();
                }
                Object obj3 = C0285d.f3335g.get(c0285d);
                if (obj3 instanceof C0291j) {
                    throw ((C0291j) obj3).f3348a;
                }
                if (AbstractC0299s.g(c0285d.f3368c)) {
                    M m3 = (M) c0285d.f3336e.j(C0297p.f3358b);
                    if (m3 != null && !m3.a()) {
                        CancellationException s2 = ((U) m3).s();
                        c0285d.a(obj3, s2);
                        throw s2;
                    }
                }
                return c0285d.f(obj3);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0285d, i, 536870912 + (536870911 & i)));
        if (((InterfaceC0306z) C0285d.h.get(c0285d)) == null) {
            c0285d.m();
        }
        if (n2) {
            c0285d.p();
        }
        return Y0.a.f1163a;
    }

    public static final Object b(t tVar, Callable callable, X0.d dVar) {
        if (tVar.isOpenInternal() && tVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.h().j(z.f1694a) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = tVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = new F(tVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        return AbstractC0299s.m((AbstractC0296o) obj, new c(callable, null), dVar);
    }

    public static String c(String str, String str2) {
        g1.f.e(str, "tableName");
        g1.f.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
