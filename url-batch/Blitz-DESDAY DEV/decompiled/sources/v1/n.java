package v1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3904a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.c f3905b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.b f3906c;
    public final ConcurrentLinkedQueue d;

    public n(u1.d dVar, TimeUnit timeUnit) {
        g1.d.e(dVar, "taskRunner");
        this.f3904a = timeUnit.toNanos(5L);
        this.f3905b = dVar.e();
        this.f3906c = new u1.b(this, s1.b.f3612g + " ConnectionPool");
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
                    if (!(mVar.f3895g != null)) {
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
        byte[] bArr = s1.b.f3607a;
        ArrayList arrayList = mVar.f3902p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3891b.f3558a.h + " was leaked. Did you forget to close a response body?";
                z1.o oVar = z1.o.f4365a;
                z1.o.f4365a.j(((h) reference).f3874a, str);
                arrayList.remove(i);
                mVar.f3896j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3903q = j2 - this.f3904a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
