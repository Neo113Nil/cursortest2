package w1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f4267a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.c f4268b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.b f4269c;
    public final ConcurrentLinkedQueue d;

    public n(v1.d dVar, TimeUnit timeUnit) {
        h1.d.e(dVar, "taskRunner");
        this.f4267a = timeUnit.toNanos(5L);
        this.f4268b = dVar.e();
        this.f4269c = new v1.b(this, t1.b.f3903g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(s1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        h1.d.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            h1.d.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f4257g != null)) {
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
        byte[] bArr = t1.b.f3898a;
        ArrayList arrayList = mVar.f4265p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f4253b.f3716a.f3583h + " was leaked. Did you forget to close a response body?";
                A1.o oVar = A1.o.f39a;
                A1.o.f39a.j(((h) reference).f4235a, str);
                arrayList.remove(i);
                mVar.f4259j = true;
                if (arrayList.isEmpty()) {
                    mVar.f4266q = j2 - this.f4267a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
