package b7;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1339d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1340e;

    public r() {
        this.f1339d = 1;
        this.f1340e = new c6.c(13);
    }

    public static void a(u5.m mVar, String str) {
        u5.o oVar;
        boolean z10;
        WorkDatabase workDatabase = mVar.f9651c;
        c6.q B = workDatabase.B();
        c6.c w6 = workDatabase.w();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int i3 = B.i(str2);
            if (i3 != 3 && i3 != 4) {
                B.p(6, str2);
            }
            linkedList.addAll(w6.e(str2));
        }
        u5.e eVar = mVar.f9654f;
        synchronized (eVar.f9632z) {
            try {
                t5.o.d().a(u5.e.A, "Processor cancelling " + str);
                eVar.f9630x.add(str);
                oVar = (u5.o) eVar.f9626t.remove(str);
                z10 = oVar != null;
                if (oVar == null) {
                    oVar = (u5.o) eVar.f9627u.remove(str);
                }
                if (oVar != null) {
                    eVar.f9628v.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u5.e.b(str, oVar);
        if (z10) {
            eVar.i();
        }
        Iterator it = mVar.f9653e.iterator();
        while (it.hasNext()) {
            ((u5.g) it.next()).a(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1339d) {
            case 0:
                s sVar = (s) this.f1340e;
                Lock lock = sVar.f1345e;
                Lock lock2 = sVar.f1345e;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e2) {
                        t tVar = sVar.f1344d.f1400h;
                        tVar.sendMessage(tVar.obtainMessage(2, e2));
                    }
                    return;
                } finally {
                    lock2.unlock();
                }
            default:
                c6.c cVar = (c6.c) this.f1340e;
                try {
                    b();
                    cVar.g(t5.t.f9319p);
                    return;
                } catch (Throwable th) {
                    cVar.g(new t5.q(th));
                    return;
                }
        }
    }

    public /* synthetic */ r(s sVar) {
        this.f1339d = 0;
        this.f1340e = sVar;
    }
}
