package h0;

import android.os.CancellationSignal;
import c1.AbstractC0091d;
import c1.EnumC0088a;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import d1.AbstractC0095c;
import e0.ExecutorC0105d;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s1.AbstractC0332o;
import s1.AbstractC0335s;
import s1.C0319b;
import s1.C0321d;
import s1.C0322e;
import s1.C0326i;
import s1.C0327j;
import s1.C0329l;
import s1.C0333p;
import s1.C0339w;
import s1.F;
import s1.G;
import s1.I;
import s1.InterfaceC0342z;
import s1.J;
import s1.K;
import s1.M;
import s1.U;
import s1.W;
import s1.X;
import s1.e0;

/* loaded from: classes.dex */
public abstract class e {
    public static final Object a(FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl, CancellationSignal cancellationSignal, Callable callable, AbstractC0095c abstractC0095c) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        if (fortuneQuestDatabase_Impl.k() && fortuneQuestDatabase_Impl.f().m().r()) {
            return callable.call();
        }
        b1.j jVar = abstractC0095c.f2474b;
        k1.e.b(jVar);
        if (jVar.p(s.f2999a) != null) {
            throw new ClassCastException();
        }
        Map map = fortuneQuestDatabase_Impl.f2102j;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            ExecutorC0105d executorC0105d = fortuneQuestDatabase_Impl.f2097b;
            if (executorC0105d == null) {
                k1.e.h("internalQueryExecutor");
                throw null;
            }
            obj = new F(executorC0105d);
            map.put("QueryDispatcher", obj);
        }
        AbstractC0332o abstractC0332o = (AbstractC0332o) obj;
        C0321d c0321d = new C0321d(AbstractC0091d.m(abstractC0095c));
        InterfaceC0342z m2 = c0321d.m();
        if (m2 != null && !(C0321d.f4038g.get(c0321d) instanceof X)) {
            m2.e();
            C0321d.h.set(c0321d, W.f4032a);
        }
        K k2 = new K(new c(cancellationSignal, AbstractC0335s.g(G.f4014a, abstractC0332o, new d(callable, c0321d, null), 2)));
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0321d.f4038g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0321d);
            if (obj2 instanceof C0319b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c0321d, obj2, k2)) {
                    if (atomicReferenceFieldUpdater.get(c0321d) != obj2) {
                        break;
                    }
                }
                break loop0;
            }
            if (!(obj2 instanceof K)) {
                if (!(obj2 instanceof C0327j)) {
                    if (!(obj2 instanceof C0326i)) {
                        C0326i c0326i = new C0326i(obj2, k2, (j1.l) null, (CancellationException) null, 28);
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0321d, obj2, c0326i)) {
                            if (atomicReferenceFieldUpdater.get(c0321d) != obj2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    C0326i c0326i2 = (C0326i) obj2;
                    if (c0326i2.f4047b != null) {
                        C0321d.o(k2, obj2);
                        throw null;
                    }
                    Throwable th = c0326i2.f4049e;
                    if (th == null) {
                        C0326i a2 = C0326i.a(c0326i2, k2, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0321d, obj2, a2)) {
                            if (atomicReferenceFieldUpdater.get(c0321d) != obj2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    c0321d.j(k2, th);
                    break;
                }
                C0327j c0327j = (C0327j) obj2;
                c0327j.getClass();
                if (!C0327j.f4050b.compareAndSet(c0327j, 0, 1)) {
                    C0321d.o(k2, obj2);
                    throw null;
                }
                if (obj2 instanceof C0322e) {
                    if (!(obj2 instanceof C0327j)) {
                        c0327j = null;
                    }
                    c0321d.j(k2, c0327j != null ? c0327j.f4051a : null);
                }
            } else {
                C0321d.o(k2, obj2);
                throw null;
            }
        }
        boolean n2 = c0321d.n();
        do {
            atomicIntegerFieldUpdater = C0321d.f4037f;
            i = atomicIntegerFieldUpdater.get(c0321d);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (n2) {
                    c0321d.p();
                }
                Object obj3 = C0321d.f4038g.get(c0321d);
                if (obj3 instanceof C0327j) {
                    throw ((C0327j) obj3).f4051a;
                }
                if (AbstractC0335s.f(c0321d.f4071c)) {
                    M m3 = (M) c0321d.f4039e.p(C0333p.f4061b);
                    if (m3 != null && !m3.a()) {
                        CancellationException u2 = ((U) m3).u();
                        c0321d.a(obj3, u2);
                        throw u2;
                    }
                }
                return c0321d.f(obj3);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0321d, i, 536870912 + (536870911 & i)));
        if (((InterfaceC0342z) C0321d.h.get(c0321d)) == null) {
            c0321d.m();
        }
        if (n2) {
            c0321d.p();
        }
        return EnumC0088a.f2060a;
    }

    public static final Object b(FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl, Callable callable, AbstractC0095c abstractC0095c) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        I i;
        if (fortuneQuestDatabase_Impl.k() && fortuneQuestDatabase_Impl.f().m().r()) {
            return callable.call();
        }
        b1.j jVar = abstractC0095c.f2474b;
        k1.e.b(jVar);
        if (jVar.p(s.f2999a) != null) {
            throw new ClassCastException();
        }
        Map map = fortuneQuestDatabase_Impl.f2102j;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            g.m mVar = fortuneQuestDatabase_Impl.f2098c;
            if (mVar == null) {
                k1.e.h("internalTransactionExecutor");
                throw null;
            }
            obj = new F(mVar);
            map.put("TransactionDispatcher", obj);
        }
        AbstractC0332o abstractC0332o = (AbstractC0332o) obj;
        b bVar = new b(callable, null);
        k1.e.b(jVar);
        b1.j j2 = !((Boolean) abstractC0332o.k(Boolean.FALSE, C0329l.d)).booleanValue() ? jVar.j(abstractC0332o) : AbstractC0335s.b(jVar, abstractC0332o, false);
        M m2 = (M) j2.p(C0333p.f4061b);
        if (m2 != null && !m2.a()) {
            throw ((U) m2).u();
        }
        if (j2 == jVar) {
            w1.q qVar = new w1.q(j2, abstractC0095c);
            return AbstractC0091d.u(qVar, qVar, bVar);
        }
        b1.e eVar = b1.e.f2046a;
        if (k1.e.a(j2.p(eVar), jVar.p(eVar))) {
            e0 e0Var = new e0(j2, abstractC0095c);
            b1.j jVar2 = e0Var.f4033c;
            Object g2 = w1.a.g(jVar2, null);
            try {
                return AbstractC0091d.u(e0Var, e0Var, bVar);
            } finally {
                w1.a.b(jVar2, g2);
            }
        }
        C0339w c0339w = new C0339w(j2, abstractC0095c);
        b1.g.A(bVar, c0339w, c0339w);
        do {
            atomicIntegerFieldUpdater = C0339w.f4070e;
            int i2 = atomicIntegerFieldUpdater.get(c0339w);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object x2 = c0339w.x();
                J j3 = x2 instanceof J ? (J) x2 : null;
                if (j3 != null && (i = j3.f4016a) != null) {
                    x2 = i;
                }
                if (x2 instanceof C0327j) {
                    throw ((C0327j) x2).f4051a;
                }
                return x2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0339w, 0, 1));
        return EnumC0088a.f2060a;
    }

    public static String c(String str, String str2) {
        k1.e.e(str, "tableName");
        k1.e.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
