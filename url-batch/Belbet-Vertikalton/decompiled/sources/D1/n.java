package D1;

import G1.AbstractC0001b;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f264a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.c f265b;

    /* renamed from: c, reason: collision with root package name */
    public final C1.b f266c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f267d;

    public n(C1.f fVar, TimeUnit timeUnit) {
        j1.h.e(fVar, "taskRunner");
        this.f264a = timeUnit.toNanos(5L);
        this.f265b = fVar.e();
        this.f266c = new C1.b(this, AbstractC0001b.g(new StringBuilder(), A1.c.f24g, " ConnectionPool"));
        this.f267d = new ConcurrentLinkedQueue();
    }

    public final boolean a(z1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        j1.h.e(jVar, "call");
        Iterator it = this.f267d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            j1.h.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f255g != null)) {
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

    public final int b(m mVar, long j) {
        byte[] bArr = A1.c.f19a;
        ArrayList arrayList = mVar.f262p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f251b.f4954a.f4813h + " was leaked. Did you forget to close a response body?";
                H1.n nVar = H1.n.f570a;
                H1.n.f570a.j(((h) reference).f233a, str);
                arrayList.remove(i);
                mVar.j = true;
                if (arrayList.isEmpty()) {
                    mVar.f263q = j - this.f264a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
