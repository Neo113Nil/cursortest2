package v1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f4074a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.c f4075b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.b f4076c;
    public final ConcurrentLinkedQueue d;

    public n(u1.d dVar, TimeUnit timeUnit) {
        g1.d.e(dVar, "taskRunner");
        this.f4074a = timeUnit.toNanos(5L);
        this.f4075b = dVar.e();
        this.f4076c = new u1.b(this, s1.b.f3726g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(r1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        g1.d.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            g1.d.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f4065g != null)) {
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
        byte[] bArr = s1.b.f3721a;
        ArrayList arrayList = mVar.f4072p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f4061b.f3542a.h + " was leaked. Did you forget to close a response body?";
                z1.n nVar = z1.n.f4366a;
                z1.n.f4366a.j(((h) reference).f4044a, str);
                arrayList.remove(i);
                mVar.f4066j = true;
                if (arrayList.isEmpty()) {
                    mVar.f4073q = j2 - this.f4074a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
