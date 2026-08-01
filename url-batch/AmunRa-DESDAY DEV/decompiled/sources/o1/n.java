package o1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3420a;

    /* renamed from: b, reason: collision with root package name */
    public final n1.c f3421b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.b f3422c;
    public final ConcurrentLinkedQueue d;

    public n(n1.d dVar, TimeUnit timeUnit) {
        Z0.d.e(dVar, "taskRunner");
        this.f3420a = timeUnit.toNanos(5L);
        this.f3421b = dVar.e();
        this.f3422c = new n1.b(this, l1.b.f3257g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(k1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        Z0.d.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            Z0.d.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f3411g != null)) {
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
        byte[] bArr = l1.b.f3252a;
        ArrayList arrayList = mVar.f3418p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3407b.f2910a.h + " was leaked. Did you forget to close a response body?";
                s1.n nVar = s1.n.f3825a;
                s1.n.f3825a.j(((h) reference).f3390a, str);
                arrayList.remove(i);
                mVar.f3412j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3419q = j2 - this.f3420a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
