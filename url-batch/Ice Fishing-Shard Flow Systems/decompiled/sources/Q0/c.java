package Q0;

import G0.A;
import G0.y;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import s1.C0883n;
import s1.HandlerC0884o;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2295d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2296e;

    public /* synthetic */ c(C0883n c0883n) {
        this.f2295d = 1;
        this.f2296e = c0883n;
    }

    public static void a(H0.p pVar, String str) {
        H0.r rVar;
        boolean z7;
        WorkDatabase workDatabase = pVar.f920c;
        P0.q t6 = workDatabase.t();
        P0.c f7 = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            A e7 = t6.e(str2);
            if (e7 != A.f772i && e7 != A.f773l) {
                t6.k(A.f775n, str2);
            }
            linkedList.addAll(f7.u(str2));
        }
        H0.f fVar = pVar.f923f;
        synchronized (fVar.f898t) {
            try {
                G0.s.d().a(H0.f.f886u, "Processor cancelling " + str);
                fVar.f896r.add(str);
                rVar = (H0.r) fVar.f892n.remove(str);
                z7 = rVar != null;
                if (rVar == null) {
                    rVar = (H0.r) fVar.f893o.remove(str);
                }
                if (rVar != null) {
                    fVar.f894p.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        H0.f.b(str, rVar);
        if (z7) {
            fVar.i();
        }
        Iterator it = pVar.f922e.iterator();
        while (it.hasNext()) {
            ((H0.h) it.next()).a(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2295d) {
            case 0:
                P0.c cVar = (P0.c) this.f2296e;
                try {
                    b();
                    cVar.w(y.f836b);
                    return;
                } catch (Throwable th) {
                    cVar.w(new G0.v(th));
                    return;
                }
            default:
                C0883n c0883n = (C0883n) this.f2296e;
                Lock lock = c0883n.f7677e;
                Lock lock2 = c0883n.f7677e;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e7) {
                        HandlerC0884o handlerC0884o = c0883n.f7676d.f7724i;
                        handlerC0884o.sendMessage(handlerC0884o.obtainMessage(2, e7));
                    }
                    return;
                } finally {
                    lock2.unlock();
                }
        }
    }

    public c() {
        this.f2295d = 0;
        this.f2296e = new P0.c(2);
    }
}
