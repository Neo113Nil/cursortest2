package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixi {
    public static List a(Class cls, Iterator it, hac hacVar, kbm kbmVar) {
        if (!(it instanceof ListIterator)) {
            if (b(cls.getClassLoader())) {
                Iterable<Class> iterable = (Iterable) hacVar.bB();
                ArrayList arrayList = new ArrayList();
                for (Class cls2 : iterable) {
                    Object obj = null;
                    try {
                        obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (ClassCastException unused) {
                    } catch (Throwable th) {
                        throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                it = arrayList.iterator();
            } else if (!it.hasNext()) {
                it = ServiceLoader.load(cls).iterator();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            kbmVar.b(next);
            arrayList2.add(next);
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new hfn(kbmVar, 2)));
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    public static boolean b(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(long j, krx krxVar, kqj kqjVar) {
        kxy kxyVar;
        int i;
        kxw e;
        ksw kswVar;
        if (kqjVar instanceof kxy) {
            kxyVar = (kxy) kqjVar;
            int i2 = kxyVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kxyVar.c = i2 - Integer.MIN_VALUE;
                Object obj = kxyVar.b;
                kqp kqpVar = kqp.a;
                i = kxyVar.c;
                if (i != 0) {
                    ixc.Y(obj);
                    if (j <= 0) {
                        return null;
                    }
                    ksw kswVar2 = new ksw();
                    try {
                        kxyVar.e = (alg) krxVar;
                        kxyVar.d = kswVar2;
                        kxyVar.a = j;
                        kxyVar.c = 1;
                        kxx kxxVar = new kxx(j, kxyVar);
                        kswVar2.a = kxxVar;
                        g(kxxVar, true, new kwd(ixh.g(kxxVar.c.bU()).h(kxxVar.b, kxxVar, ((kum) kxxVar).a)));
                        Object j2 = jav.j(kxxVar, false, kxxVar, krxVar);
                        if (j2 == kqpVar) {
                            kxyVar.getClass();
                        }
                        return j2 == kqpVar ? kqpVar : j2;
                    } catch (kxw e2) {
                        e = e2;
                        kswVar = kswVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = kxyVar.a;
                    kswVar = kxyVar.d;
                    alg algVar = kxyVar.e;
                    try {
                        ixc.Y(obj);
                        return obj;
                    } catch (kxw e3) {
                        e = e3;
                    }
                }
                if (e.a != kswVar.a) {
                    return null;
                }
                throw e;
            }
        }
        kxyVar = new kxy(kqjVar);
        Object obj2 = kxyVar.b;
        kqp kqpVar2 = kqp.a;
        i = kxyVar.c;
        if (i != 0) {
        }
        if (e.a != kswVar.a) {
        }
    }

    public static kqx d(List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return new kxo(i, list);
    }

    public static boolean e(StackTraceElement stackTraceElement) {
        return ksp.s(stackTraceElement.getMethodName(), "runBlocking") && ksp.s(stackTraceElement.getClassName(), "kotlinx.coroutines.BuildersKt");
    }

    public static kqx f(kxm kxmVar) {
        if (!kxq.a) {
            return null;
        }
        ktr ktrVar = new ktr(new kts(ksl.d(kxmVar.cd(), new kss() { // from class: kxk
            @Override // defpackage.kss
            public final Object g(Object obj) {
                return ((kwu) obj).cd();
            }
        }), true, kxl.a));
        return (kqx) (ktrVar.hasNext() ? ktrVar.next() : null);
    }

    public static final kwc g(kwu kwuVar, boolean z, kwx kwxVar) {
        return kwuVar instanceof kxb ? ((kxb) kwuVar).F(z, kwxVar) : kwuVar.q(kwxVar.b(), z, new gdg(kwxVar, 10, (int[][]) null));
    }

    public static final void h(kqn kqnVar, CancellationException cancellationException) {
        kwu kwuVar = (kwu) kqnVar.get(kwu.d);
        if (kwuVar != null) {
            kwuVar.s(cancellationException);
        }
    }

    public static final void i(kqn kqnVar) {
        kwu kwuVar = (kwu) kqnVar.get(kwu.d);
        if (kwuVar != null) {
            j(kwuVar);
        }
    }

    public static final void j(kwu kwuVar) {
        if (!kwuVar.t()) {
            throw kwuVar.p();
        }
    }
}
