package t1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3787a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.c f3788b;

    /* renamed from: c, reason: collision with root package name */
    public final s1.b f3789c;
    public final ConcurrentLinkedQueue d;

    public n(s1.d dVar, TimeUnit timeUnit) {
        e1.d.e(dVar, "taskRunner");
        this.f3787a = timeUnit.toNanos(5L);
        this.f3788b = dVar.e();
        this.f3789c = new s1.b(this, q1.b.f3496g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(p1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        e1.d.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            e1.d.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f3778g != null)) {
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
        byte[] bArr = q1.b.f3491a;
        ArrayList arrayList = mVar.f3785p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3774b.f3442a.h + " was leaked. Did you forget to close a response body?";
                x1.n nVar = x1.n.f4286a;
                x1.n.f4286a.j(((h) reference).f3757a, str);
                arrayList.remove(i);
                mVar.f3779j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3786q = j2 - this.f3787a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
