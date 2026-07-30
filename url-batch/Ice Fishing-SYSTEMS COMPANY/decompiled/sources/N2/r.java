package N2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class r implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2085n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2086u;

    public /* synthetic */ r(C0332s c0332s) {
        this.f2085n = 0;
        this.f2086u = c0332s;
    }

    public static void a(K0.p pVar, String str) {
        K0.q qVar;
        boolean z8;
        WorkDatabase workDatabase = pVar.f1532c;
        S0.q t9 = workDatabase.t();
        S0.c f6 = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e6 = t9.e(str2);
            if (e6 != 3 && e6 != 4) {
                t9.m(6, str2);
            }
            linkedList.addAll(f6.v(str2));
        }
        K0.f fVar = pVar.f1535f;
        synchronized (fVar.f1503E) {
            try {
                J0.s.d().a(K0.f.f1498F, "Processor cancelling " + str);
                fVar.f1501C.add(str);
                qVar = (K0.q) fVar.f1509y.remove(str);
                z8 = qVar != null;
                if (qVar == null) {
                    qVar = (K0.q) fVar.f1510z.remove(str);
                }
                if (qVar != null) {
                    fVar.f1499A.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        K0.f.c(str, qVar);
        if (z8) {
            fVar.i();
        }
        Iterator it = pVar.f1534e.iterator();
        while (it.hasNext()) {
            ((K0.h) it.next()).d(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2085n) {
            case 0:
                C0332s c0332s = (C0332s) this.f2086u;
                ReentrantLock reentrantLock = c0332s.f2101u;
                ReentrantLock reentrantLock2 = c0332s.f2101u;
                reentrantLock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e6) {
                        HandlerC0333t handlerC0333t = c0332s.f2100n.f2143x;
                        handlerC0333t.sendMessage(handlerC0333t.obtainMessage(2, e6));
                    }
                    return;
                } finally {
                    reentrantLock2.unlock();
                }
            default:
                S0.e eVar = (S0.e) this.f2086u;
                try {
                    b();
                    eVar.j(J0.x.f1335f0);
                    return;
                } catch (Throwable th) {
                    eVar.j(new J0.u(th));
                    return;
                }
        }
    }

    public r() {
        this.f2085n = 1;
        this.f2086u = new S0.e(3);
    }
}
