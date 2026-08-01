package m1;

import i1.C0166a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3600a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.c f3601b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.b f3602c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3603d;

    public n(l1.d dVar, TimeUnit timeUnit) {
        X0.f.e(dVar, "taskRunner");
        this.f3600a = timeUnit.toNanos(5L);
        this.f3601b = dVar.e();
        this.f3602c = new l1.b(this, j1.b.f2973g + " ConnectionPool");
        this.f3603d = new ConcurrentLinkedQueue();
    }

    public final boolean a(C0166a c0166a, j jVar, ArrayList arrayList, boolean z2) {
        X0.f.e(jVar, "call");
        Iterator it = this.f3603d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            X0.f.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f3591g != null)) {
                        continue;
                    }
                }
                if (mVar.h(c0166a, arrayList)) {
                    jVar.b(mVar);
                    return true;
                }
            }
        }
    }

    public final int b(m mVar, long j2) {
        byte[] bArr = j1.b.f2967a;
        ArrayList arrayList = mVar.f3598p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3586b.f2623a.h + " was leaked. Did you forget to close a response body?";
                q1.n nVar = q1.n.f3960a;
                q1.n.f3960a.j(((h) reference).f3567a, str);
                arrayList.remove(i);
                mVar.f3592j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3599q = j2 - this.f3600a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
