package androidx.room;

import a.AbstractC0058a;
import b1.EnumC0098a;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r1.AbstractC0366p;
import r1.AbstractC0369t;
import r1.C0361k;
import r1.C0363m;
import r1.C0367q;
import r1.C0373x;
import r1.G;
import r1.J;
import r1.K;
import r1.N;
import r1.V;
import r1.f0;

/* loaded from: classes.dex */
public abstract class i {
    public static final Object a(w wVar, Callable callable, a1.d dVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        J j;
        if (wVar.isOpenInternal() && wVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.getContext().d(C.f2073a) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = wVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = new G(wVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        AbstractC0366p abstractC0366p = (AbstractC0366p) obj;
        f fVar = new f(callable, null);
        a1.i context = dVar.getContext();
        a1.i B2 = !((Boolean) abstractC0366p.q(Boolean.FALSE, C0363m.f4083d)).booleanValue() ? context.B(abstractC0366p) : AbstractC0369t.b(context, abstractC0366p, false);
        N n2 = (N) B2.d(C0367q.f4090b);
        if (n2 != null && !n2.a()) {
            throw ((V) n2).o();
        }
        if (B2 == context) {
            w1.s sVar = new w1.s(dVar, B2);
            return AbstractC0058a.b0(sVar, sVar, fVar);
        }
        a1.e eVar = a1.e.f1672a;
        if (j1.h.a(B2.d(eVar), context.d(eVar))) {
            f0 f0Var = new f0(dVar, B2);
            a1.i iVar = f0Var.f4063c;
            Object m2 = w1.a.m(iVar, null);
            try {
                return AbstractC0058a.b0(f0Var, f0Var, fVar);
            } finally {
                w1.a.h(iVar, m2);
            }
        }
        C0373x c0373x = new C0373x(dVar, B2);
        H1.l.g0(fVar, c0373x, c0373x);
        do {
            atomicIntegerFieldUpdater = C0373x.e;
            int i = atomicIntegerFieldUpdater.get(c0373x);
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object s2 = c0373x.s();
                K k2 = s2 instanceof K ? (K) s2 : null;
                if (k2 != null && (j = k2.f4045a) != null) {
                    s2 = j;
                }
                if (s2 instanceof C0361k) {
                    throw ((C0361k) s2).f4079a;
                }
                return s2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0373x, 0, 1));
        return EnumC0098a.f2223a;
    }

    public static final AbstractC0366p b(w wVar) {
        Map<String, Object> backingFieldMap = wVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = new G(wVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        return (AbstractC0366p) obj;
    }

    public static String c(String str, String str2) {
        j1.h.e(str, "tableName");
        j1.h.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
