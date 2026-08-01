package D1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f206a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.c f207b;

    /* renamed from: c, reason: collision with root package name */
    public final C1.b f208c;
    public final ConcurrentLinkedQueue d;

    public n(C1.d dVar, TimeUnit timeUnit) {
        k1.e.e(dVar, "taskRunner");
        this.f206a = timeUnit.toNanos(5L);
        this.f207b = dVar.e();
        this.f208c = new C1.b(this, A1.c.f18g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(z1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        k1.e.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            k1.e.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f197g != null)) {
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
        byte[] bArr = A1.c.f13a;
        ArrayList arrayList = mVar.f204p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f193b.f4769a.h + " was leaked. Did you forget to close a response body?";
                H1.n nVar = H1.n.f525a;
                H1.n.f525a.j(((h) reference).f176a, str);
                arrayList.remove(i);
                mVar.f198j = true;
                if (arrayList.isEmpty()) {
                    mVar.f205q = j2 - this.f206a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
