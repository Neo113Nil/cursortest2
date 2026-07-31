package T0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import u0.C0673c;
import u0.C0687q;
import u0.C0689s;

/* renamed from: T0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0182q implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2318f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2319g;

    public /* synthetic */ AbstractRunnableC0182q(r rVar) {
        this.f2318f = 0;
        this.f2319g = rVar;
    }

    public static void a(m0.o oVar, String str) {
        m0.q qVar;
        boolean z5;
        WorkDatabase workDatabase = oVar.f5375c;
        C0687q t6 = workDatabase.t();
        C0673c f7 = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e4 = t6.e(str2);
            if (e4 != 3 && e4 != 4) {
                t6.k(str2, 6);
            }
            linkedList.addAll(f7.f(str2));
        }
        m0.f fVar = oVar.f5378f;
        synchronized (fVar.f5354q) {
            try {
                l0.q.d().a(m0.f.f5342r, "Processor cancelling " + str);
                fVar.f5352o.add(str);
                qVar = (m0.q) fVar.f5348k.remove(str);
                z5 = qVar != null;
                if (qVar == null) {
                    qVar = (m0.q) fVar.f5349l.remove(str);
                }
                if (qVar != null) {
                    fVar.f5350m.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m0.f.b(str, qVar);
        if (z5) {
            fVar.i();
        }
        Iterator it = oVar.f5377e.iterator();
        while (it.hasNext()) {
            ((m0.h) it.next()).a(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2318f) {
            case 0:
                r rVar = (r) this.f2319g;
                Lock lock = rVar.f2321g;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e4) {
                        HandlerC0183s handlerC0183s = rVar.f2320f.f2369h;
                        handlerC0183s.sendMessage(handlerC0183s.obtainMessage(2, e4));
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                C0689s c0689s = (C0689s) this.f2319g;
                try {
                    b();
                    c0689s.u(l0.v.f5288d);
                    return;
                } catch (Throwable th) {
                    c0689s.u(new l0.s(th));
                    return;
                }
        }
    }

    public AbstractRunnableC0182q() {
        this.f2318f = 1;
        this.f2319g = new C0689s(11);
    }
}
