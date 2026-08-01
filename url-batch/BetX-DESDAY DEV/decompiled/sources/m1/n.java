package m1;

import i1.C0167a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3604a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.c f3605b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.b f3606c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3607d;

    public n(l1.e eVar, TimeUnit timeUnit) {
        X0.f.e(eVar, "taskRunner");
        this.f3604a = timeUnit.toNanos(5L);
        this.f3605b = eVar.e();
        this.f3606c = new l1.b(this, j1.b.f2977g + " ConnectionPool");
        this.f3607d = new ConcurrentLinkedQueue();
    }

    public final boolean a(C0167a c0167a, j jVar, ArrayList arrayList, boolean z2) {
        X0.f.e(jVar, "call");
        Iterator it = this.f3607d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            X0.f.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f3595g != null)) {
                        continue;
                    }
                }
                if (mVar.h(c0167a, arrayList)) {
                    jVar.b(mVar);
                    return true;
                }
            }
        }
    }

    public final int b(m mVar, long j2) {
        byte[] bArr = j1.b.f2971a;
        ArrayList arrayList = mVar.f3602p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3590b.f2627a.h + " was leaked. Did you forget to close a response body?";
                q1.n nVar = q1.n.f3964a;
                q1.n.f3964a.j(((h) reference).f3571a, str);
                arrayList.remove(i);
                mVar.f3596j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3603q = j2 - this.f3604a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
