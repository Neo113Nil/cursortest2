package X5;

import D3.M;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.AbstractC0506j;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public ExecutorService f2962c;

    /* renamed from: a, reason: collision with root package name */
    public final int f2960a = 64;

    /* renamed from: b, reason: collision with root package name */
    public final int f2961b = 5;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f2963d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f2964e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f2965f = new ArrayDeque();

    public static void c(k kVar, b6.n nVar, b6.n nVar2, int i7) {
        M m4;
        if ((i7 & 1) != 0) {
            nVar = null;
        }
        if ((i7 & 4) != 0) {
            nVar2 = null;
        }
        kVar.getClass();
        TimeZone timeZone = Y5.e.f3102a;
        boolean isShutdown = kVar.a().isShutdown();
        synchronized (kVar) {
            if (nVar2 != null) {
                try {
                    nVar2.f3676g.decrementAndGet();
                    if (!kVar.f2964e.remove(nVar2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (nVar != null) {
                kVar.f2963d.add(nVar);
                b6.n b7 = kVar.b(((o) nVar.f3677h.f3681g.f331c).f2977d);
                if (b7 != null) {
                    nVar.f3676g = b7.f3676g;
                }
            }
            if (nVar2 != null && (isShutdown || kVar.f2964e.isEmpty())) {
                kVar.f2965f.isEmpty();
            }
            if (isShutdown) {
                List P6 = AbstractC0506j.P(kVar.f2963d);
                kVar.f2963d.clear();
                m4 = new M(29, P6);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = kVar.f2963d.iterator();
                kotlin.jvm.internal.i.d(it, "iterator(...)");
                while (it.hasNext()) {
                    b6.n nVar3 = (b6.n) it.next();
                    if (kVar.f2964e.size() >= kVar.f2960a) {
                        break;
                    }
                    if (nVar3.f3676g.get() < kVar.f2961b) {
                        it.remove();
                        nVar3.f3676g.incrementAndGet();
                        arrayList.add(nVar3);
                        kVar.f2964e.add(nVar3);
                    }
                }
                m4 = new M(29, arrayList);
            }
        }
        int size = ((List) m4.f401g).size();
        for (int i8 = 0; i8 < size; i8++) {
            b6.n nVar4 = (b6.n) ((List) m4.f401g).get(i8);
            if (nVar4 != nVar) {
                b6.q qVar = nVar4.f3677h;
            }
            if (isShutdown) {
                nVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                nVar4.f3677h.g(interruptedIOException);
                ((C4.a) nVar4.f3675f.f5975b).accept(interruptedIOException);
            } else {
                ExecutorService a7 = kVar.a();
                nVar4.getClass();
                b6.q qVar2 = nVar4.f3677h;
                kotlin.jvm.internal.i.e(qVar2.f3680f.f3011a, "<this>");
                try {
                    try {
                        a7.execute(nVar4);
                    } catch (RejectedExecutionException e4) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e4);
                        nVar4.f3677h.g(interruptedIOException2);
                        ((C4.a) nVar4.f3675f.f5975b).accept(interruptedIOException2);
                        k kVar2 = qVar2.f3680f.f3011a;
                        kVar2.getClass();
                        c(kVar2, null, nVar4, 3);
                    }
                } catch (Throwable th2) {
                    k kVar3 = qVar2.f3680f.f3011a;
                    kVar3.getClass();
                    c(kVar3, null, nVar4, 3);
                    throw th2;
                }
            }
        }
    }

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        try {
            if (this.f2962c == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = Y5.e.f3103b + " Dispatcher";
                kotlin.jvm.internal.i.e(name, "name");
                this.f2962c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new Y5.d(name, false));
            }
            executorService = this.f2962c;
            kotlin.jvm.internal.i.b(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final b6.n b(String str) {
        Iterator it = this.f2964e.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            b6.n nVar = (b6.n) it.next();
            if (kotlin.jvm.internal.i.a(((o) nVar.f3677h.f3681g.f331c).f2977d, str)) {
                return nVar;
            }
        }
        Iterator it2 = this.f2963d.iterator();
        kotlin.jvm.internal.i.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            b6.n nVar2 = (b6.n) it2.next();
            if (kotlin.jvm.internal.i.a(((o) nVar2.f3677h.f3681g.f331c).f2977d, str)) {
                return nVar2;
            }
        }
        return null;
    }
}
