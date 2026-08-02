package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixg {
    public static final Object a(Object obj, kqj kqjVar) {
        if (!(obj instanceof kve)) {
            return obj;
        }
        Throwable th = ((kve) obj).b;
        if (kvo.b && (kqjVar instanceof kqx)) {
            th = lda.a(th, (kqx) kqjVar);
        }
        return ixc.X(th);
    }

    public static final Object b(Object obj) {
        Throwable a = kon.a(obj);
        return a == null ? obj : new kve(a, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002a, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r3 = defpackage.kvo.a;
        r3 = r0.d;
        r1 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if ((r1 instanceof defpackage.kvd) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        r1 = ((defpackage.kvd) r1).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003a, code lost:
    
        r0.c.b = 536870911;
        r3.c(defpackage.kun.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        return new defpackage.kuw(r3, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kuw c(kqj kqjVar) {
        kuw kuwVar;
        if (!(kqjVar instanceof lcc)) {
            return new kuw(kqjVar, 1);
        }
        kuk kukVar = ((lcc) kqjVar).f;
        while (true) {
            Object obj = kukVar.a;
            if (obj == null) {
                kukVar.c(lcd.b);
                kuwVar = null;
                break;
            }
            if (obj instanceof kuw) {
                if (kukVar.d(obj, lcd.b)) {
                    kuwVar = (kuw) obj;
                    break;
                }
            } else if (obj != lcd.b && !(obj instanceof Throwable)) {
                Objects.toString(obj);
                throw new IllegalStateException("Inconsistent state ".concat(obj.toString()));
            }
        }
    }

    public static final void d(kuv kuvVar, kwc kwcVar) {
        ((kuw) kuvVar).z(new kut(kwcVar, 2));
    }

    public static final Object e(kqn kqnVar, krx krxVar) {
        kwf kwfVar;
        kqn b;
        long l;
        if (((kqk) kqnVar.get(kqk.b)) == null) {
            ThreadLocal threadLocal = kxv.a;
            kwfVar = kxv.a();
            b = kvi.b(kwo.a, kqnVar.plus(kwfVar));
        } else {
            ThreadLocal threadLocal2 = kxv.a;
            kwfVar = (kwf) kxv.a.get();
            b = kvi.b(kwo.a, kqnVar);
        }
        kur kurVar = new kur(b, Thread.currentThread(), kwfVar);
        kvp.d(1, krxVar, kurVar, kurVar);
        kwf kwfVar2 = kurVar.c;
        if (kwfVar2 != null) {
            kwfVar2.o(false);
        }
        while (true) {
            if (kwfVar2 != null) {
                try {
                    l = kwfVar2.l();
                } catch (Throwable th) {
                    kwf kwfVar3 = kurVar.c;
                    if (kwfVar3 != null) {
                        kwfVar3.m(false);
                    }
                    throw th;
                }
            } else {
                l = Long.MAX_VALUE;
            }
            if (kurVar.N()) {
                break;
            }
            LockSupport.parkNanos(kurVar, l);
            if (Thread.interrupted()) {
                kurVar.K(new InterruptedException());
            }
        }
        kwf kwfVar4 = kurVar.c;
        if (kwfVar4 != null) {
            kwfVar4.m(false);
        }
        Object b2 = kxc.b(kurVar.B());
        kve kveVar = b2 instanceof kve ? (kve) b2 : null;
        if (kveVar == null) {
            return b2;
        }
        throw kveVar.b;
    }

    public static final Object f(kqn kqnVar, krx krxVar, kqj kqjVar) {
        Object b;
        kqn bU = kqjVar.bU();
        kqn a = kvi.a(bU, kqnVar);
        ixi.i(a);
        if (a == bU) {
            lcy lcyVar = new lcy(a, kqjVar);
            b = jav.j(lcyVar, true, lcyVar, krxVar);
        } else {
            ale aleVar = kqk.b;
            if (ksp.b(a.get(aleVar), bU.get(aleVar))) {
                kya kyaVar = new kya(a, kqjVar);
                kqn kqnVar2 = ((kum) kyaVar).a;
                Object b2 = ldd.b(kqnVar2, null);
                try {
                    Object j = jav.j(kyaVar, true, kyaVar, krxVar);
                    ldd.c(kqnVar2, b2);
                    b = j;
                } catch (Throwable th) {
                    ldd.c(kqnVar2, b2);
                    throw th;
                }
            } else {
                kvx kvxVar = new kvx(a, kqjVar);
                jav.l(krxVar, kvxVar, kvxVar);
                kui kuiVar = kvxVar.b;
                while (true) {
                    int i = kuiVar.b;
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        b = kxc.b(kvxVar.B());
                        if (b instanceof kve) {
                            throw ((kve) b).b;
                        }
                    } else if (kuiVar.d(0, 1)) {
                        b = kqp.a;
                        break;
                    }
                }
            }
        }
        if (b == kqp.a) {
            kqjVar.getClass();
        }
        return b;
    }

    public static /* synthetic */ kvs g(kvm kvmVar, krx krxVar) {
        kqn b = kvi.b(kvmVar, kqo.a);
        kvt kxdVar = kvp.e(1) ? new kxd(b, krxVar) : new kvt(b, true);
        kvp.d(1, krxVar, kxdVar, kxdVar);
        return kxdVar;
    }

    public static final kwu h(kvm kvmVar, kqn kqnVar, int i, krx krxVar) {
        boolean e = kvp.e(i);
        kqn b = kvi.b(kvmVar, kqnVar);
        kum kxeVar = e ? new kxe(b, krxVar) : new kxs(b, true);
        kvp.d(i, krxVar, kxeVar, kxeVar);
        return kxeVar;
    }

    public static /* synthetic */ kwu i(kvm kvmVar, kqn kqnVar, int i, krx krxVar, int i2) {
        if ((i2 & 1) != 0) {
            kqnVar = kqo.a;
        }
        return h(kvmVar, kqnVar, i | (((i2 & 2) != 0 ? 0 : 1) ^ 1), krxVar);
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.List] */
    public static final kuq j(String str, kbl kblVar, Map map) {
        if (kblVar == null) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((kuq) it.next()).b);
            }
            kuq kuqVar = new kuq(str);
            kuqVar.a.addAll(arrayList);
            kblVar = new kbl(kuqVar);
        }
        HashMap hashMap = new HashMap(map);
        for (kae kaeVar : kblVar.b) {
            String str2 = kaeVar.b;
            kuq kuqVar2 = (kuq) hashMap.remove(str2);
            if (kuqVar2 == null) {
                throw new IllegalStateException("No method bound for descriptor entry ".concat(str2));
            }
            if (kuqVar2.b != kaeVar) {
                throw new IllegalStateException(a.Z(str2, "Bound method for ", " not same instance as method in service descriptor"));
            }
        }
        if (hashMap.size() <= 0) {
            return new kuq(kblVar, map);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method ".concat(((kae) ((kuq) hashMap.values().iterator().next()).b).b));
    }

    public static final void k(kuq kuqVar, String str, Map map) {
        kae kaeVar = (kae) kuqVar.b;
        boolean equals = str.equals(kaeVar.c);
        String str2 = kaeVar.b;
        hoq.F(equals, "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, str2);
        hoq.K(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, kuqVar);
    }
}
