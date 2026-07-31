package K2;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f3323a;

    /* renamed from: b, reason: collision with root package name */
    public final J2.c f3324b;

    /* renamed from: c, reason: collision with root package name */
    public final J2.b f3325c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3326d;

    public k(J2.e eVar, TimeUnit timeUnit) {
        f2.j.f(eVar, "taskRunner");
        this.f3323a = timeUnit.toNanos(5L);
        this.f3324b = eVar.e();
        this.f3325c = new J2.b(this, H2.b.f2638g + " ConnectionPool");
        this.f3326d = new ConcurrentLinkedQueue();
    }

    public final boolean a(G2.a aVar, g gVar, ArrayList arrayList, boolean z3) {
        f2.j.f(gVar, "call");
        Iterator it = this.f3326d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            j jVar = (j) it.next();
            f2.j.e(jVar, "connection");
            synchronized (jVar) {
                if (z3) {
                    if (!(jVar.f3312g != null)) {
                        continue;
                    }
                }
                if (jVar.h(aVar, arrayList)) {
                    gVar.a(jVar);
                    return true;
                }
            }
        }
    }

    public final int b(j jVar, long j3) {
        byte[] bArr = H2.b.f2632a;
        ArrayList arrayList = jVar.f3321p;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i3);
            if (reference.get() != null) {
                i3++;
            } else {
                String str = "A connection to " + jVar.f3307b.f2311a.f2133h + " was leaked. Did you forget to close a response body?";
                O2.n nVar = O2.n.f3910a;
                O2.n.f3910a.j(((e) reference).f3285a, str);
                arrayList.remove(i3);
                jVar.f3315j = true;
                if (arrayList.isEmpty()) {
                    jVar.f3322q = j3 - this.f3323a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
