package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p50 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p50(Function1 function1, o30 o30Var) {
        super(2, o30Var);
        this.m = 1;
        this.o = function1;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                p50 p50Var = new p50(0, o30Var, (q50) obj2);
                p50Var.n = obj;
                return p50Var;
            case 1:
                p50 p50Var2 = new p50((Function1) obj2, o30Var);
                p50Var2.n = obj;
                return p50Var2;
            case 2:
                p50 p50Var3 = new p50(2, o30Var, (qo2) obj2);
                p50Var3.n = obj;
                return p50Var3;
            case 3:
                p50 p50Var4 = new p50(3, o30Var, (dj) obj2);
                p50Var4.n = obj;
                return p50Var4;
            case 4:
                p50 p50Var5 = new p50(4, o30Var, (vj1) obj2);
                p50Var5.n = obj;
                return p50Var5;
            default:
                p50 p50Var6 = new p50(5, o30Var, (Set) obj2);
                p50Var6.n = obj;
                return p50Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((p50) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((p50) create((d32) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((p50) create((qo2) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((p50) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 4:
                ((p50) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
                throw null;
            default:
                return ((p50) create((d42) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.m;
        o30 o30Var = null;
        Object obj2 = this.o;
        switch (i2) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                a50 a50Var = (a50) this.n;
                q50 q50Var = (q50) obj2;
                g61 g61Var = (g61) q50Var.a.getAndSet(null);
                AtomicReference atomicReference = q50Var.a;
                jo2 H = z71.H(a50Var, null, new v(g61Var, q50Var, o30Var, 18), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, H)) {
                        if (atomicReference.get() != null) {
                            r3 = false;
                        }
                    }
                }
                return Boolean.valueOf(r3);
            case 1:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                d32 d32Var = (d32) this.n;
                d32Var.getClass();
                return ((Function1) obj2).invoke(d32Var.c());
            case 2:
                b50 b50Var3 = b50.m;
                ca2.b(obj);
                qo2 qo2Var = (qo2) this.n;
                return Boolean.valueOf((qo2Var instanceof h60) && qo2Var.a <= ((qo2) obj2).a);
            case 3:
                b50 b50Var4 = b50.m;
                ca2.b(obj);
                CoroutineContext n = ((a50) this.n).n();
                dj djVar = (dj) obj2;
                try {
                    hx2 hx2Var = new hx2();
                    hx2Var.u = l41.K(l41.E(n), true, hx2Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = hx2.v;
                    try {
                        do {
                            i = atomicIntegerFieldUpdater.get(hx2Var);
                            if (i != 0) {
                                if (i != 2 && i != 3) {
                                    hx2.u(i);
                                    throw null;
                                }
                            }
                            return io.a((io) djVar.n);
                        } while (!atomicIntegerFieldUpdater.compareAndSet(hx2Var, i, 0));
                        return io.a((io) djVar.n);
                    } finally {
                        hx2Var.t();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 4:
                b50 b50Var5 = b50.m;
                ca2.b(obj);
                throw null;
            default:
                b50 b50Var6 = b50.m;
                ca2.b(obj);
                Set keySet = ((d42) this.n).a().keySet();
                ArrayList arrayList = new ArrayList(rv.l(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b42) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set != xk2.a) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                    }
                    r3 = false;
                }
                return Boolean.valueOf(r3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p50(int i, o30 o30Var, Object obj) {
        super(2, o30Var);
        this.m = i;
        this.o = obj;
    }
}
