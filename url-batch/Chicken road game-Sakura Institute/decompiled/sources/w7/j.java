package w7;

import a0.m;
import a8.o;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f9583a;

    /* renamed from: b, reason: collision with root package name */
    public final v7.c f9584b;

    /* renamed from: c, reason: collision with root package name */
    public final v7.b f9585c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f9586d;

    public j(v7.d dVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        r6.k.f(dVar, "taskRunner");
        r6.k.f(timeUnit, "timeUnit");
        this.f9583a = timeUnit.toNanos(5L);
        this.f9584b = dVar.e();
        this.f9585c = new v7.b(this, m.m(new StringBuilder(), t7.b.f8938g, " ConnectionPool"));
        this.f9586d = new ConcurrentLinkedQueue();
    }

    public final boolean a(s7.a aVar, g gVar, ArrayList arrayList, boolean z8) {
        Iterator it = this.f9586d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            i iVar = (i) it.next();
            r6.k.e(iVar, "connection");
            synchronized (iVar) {
                if (z8) {
                    try {
                        if (!(iVar.f9572g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (iVar.h(aVar, arrayList)) {
                    gVar.a(iVar);
                    return true;
                }
            }
        }
    }

    public final int b(i iVar, long j8) {
        byte[] bArr = t7.b.f8932a;
        ArrayList arrayList = iVar.f9581p;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                String str = "A connection to " + iVar.f9567b.f8698a.f8536h + " was leaked. Did you forget to close a response body?";
                o oVar = o.f570a;
                o.f570a.j(((e) reference).f9549a, str);
                arrayList.remove(i7);
                iVar.f9575j = true;
                if (arrayList.isEmpty()) {
                    iVar.f9582q = j8 - this.f9583a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
