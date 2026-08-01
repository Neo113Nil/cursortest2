package m1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3257a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.c f3258b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.b f3259c;
    public final ConcurrentLinkedQueue d;

    public n(l1.d dVar, TimeUnit timeUnit) {
        X0.d.e(dVar, "taskRunner");
        this.f3257a = timeUnit.toNanos(5L);
        this.f3258b = dVar.e();
        this.f3259c = new l1.b(this, j1.b.f2608f + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(i1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        X0.d.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            X0.d.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f3248g != null)) {
                        continue;
                    }
                }
                if (mVar.h(aVar, arrayList)) {
                    jVar.b(mVar);
                    return true;
                }
            }
        }
    }

    public final int b(m mVar, long j2) {
        byte[] bArr = j1.b.f2604a;
        ArrayList arrayList = mVar.f3255p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3244b.f2536a.h + " was leaked. Did you forget to close a response body?";
                q1.n nVar = q1.n.f3572a;
                q1.n.f3572a.j(((h) reference).f3227a, str);
                arrayList.remove(i);
                mVar.f3249j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3256q = j2 - this.f3257a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
