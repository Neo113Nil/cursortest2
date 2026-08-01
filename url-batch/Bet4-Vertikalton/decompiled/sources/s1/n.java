package s1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3748a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.c f3749b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.b f3750c;
    public final ConcurrentLinkedQueue d;

    public n(r1.d dVar, TimeUnit timeUnit) {
        d1.d.e(dVar, "taskRunner");
        this.f3748a = timeUnit.toNanos(5L);
        this.f3749b = dVar.e();
        this.f3750c = new r1.b(this, p1.b.f3460g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(o1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        d1.d.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            d1.d.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f3739g != null)) {
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
        byte[] bArr = p1.b.f3455a;
        ArrayList arrayList = mVar.f3746p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3735b.f3396a.h + " was leaked. Did you forget to close a response body?";
                w1.n nVar = w1.n.f4190a;
                w1.n.f4190a.j(((h) reference).f3718a, str);
                arrayList.remove(i);
                mVar.f3740j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3747q = j2 - this.f3748a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
