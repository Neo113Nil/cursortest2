package g3;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import k3.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f1971a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.c f1972b;
    public final f3.b c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1973d;

    public m(f3.d dVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        u2.c.e(dVar, "taskRunner");
        u2.c.e(timeUnit, "timeUnit");
        this.f1971a = timeUnit.toNanos(5L);
        this.f1972b = dVar.e();
        this.c = new f3.b(this, d3.c.g + " ConnectionPool");
        this.f1973d = new ConcurrentLinkedQueue();
    }

    public final boolean a(c3.a aVar, i iVar, ArrayList arrayList, boolean z3) {
        Iterator it = this.f1973d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            l lVar = (l) it.next();
            u2.c.d(lVar, "connection");
            synchronized (lVar) {
                if (z3) {
                    try {
                        if (!(lVar.g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (lVar.h(aVar, arrayList)) {
                    iVar.b(lVar);
                    return true;
                }
            }
        }
    }

    public final int b(l lVar, long j4) {
        byte[] bArr = d3.c.f1490a;
        ArrayList arrayList = lVar.f1969p;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                String str = "A connection to " + lVar.f1958b.f1153a.h + " was leaked. Did you forget to close a response body?";
                o oVar = o.f2841a;
                o.f2841a.j(((g) reference).f1941a, str);
                arrayList.remove(i4);
                lVar.f1963j = true;
                if (arrayList.isEmpty()) {
                    lVar.f1970q = j4 - this.f1971a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
