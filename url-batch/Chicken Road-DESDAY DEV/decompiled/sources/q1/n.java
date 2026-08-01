package q1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3501a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.c f3502b;

    /* renamed from: c, reason: collision with root package name */
    public final p1.b f3503c;
    public final ConcurrentLinkedQueue d;

    public n(p1.d dVar, TimeUnit timeUnit) {
        b1.d.e(dVar, "taskRunner");
        this.f3501a = timeUnit.toNanos(5L);
        this.f3502b = dVar.e();
        this.f3503c = new p1.b(this, n1.b.f3291g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(m1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        b1.d.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            b1.d.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f3492g != null)) {
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
        byte[] bArr = n1.b.f3286a;
        ArrayList arrayList = mVar.f3499p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3488b.f3262a.h + " was leaked. Did you forget to close a response body?";
                u1.n nVar = u1.n.f3904a;
                u1.n.f3904a.j(((h) reference).f3471a, str);
                arrayList.remove(i);
                mVar.f3493j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3500q = j2 - this.f3501a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
