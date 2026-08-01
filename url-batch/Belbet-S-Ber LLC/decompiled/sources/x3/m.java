package x3;

import a4.p;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f3942a;

    /* renamed from: b, reason: collision with root package name */
    public final w3.b f3943b;

    /* renamed from: c, reason: collision with root package name */
    public final p f3944c;
    public final ConcurrentLinkedQueue d;

    public m(w3.c cVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        i3.d.e(cVar, "taskRunner");
        i3.d.e(timeUnit, "timeUnit");
        this.f3942a = timeUnit.toNanos(5L);
        this.f3943b = cVar.e();
        this.f3944c = new p(this, u3.b.f3586g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(t3.a aVar, i iVar, ArrayList arrayList, boolean z4) {
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            l lVar = (l) it.next();
            i3.d.d(lVar, "connection");
            synchronized (lVar) {
                if (z4) {
                    try {
                        if (!(lVar.f3933g != null)) {
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

    public final int b(l lVar, long j2) {
        byte[] bArr = u3.b.f3581a;
        ArrayList arrayList = lVar.f3940p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + lVar.f3929b.f3533a.h + " was leaked. Did you forget to close a response body?";
                b4.n nVar = b4.n.f853a;
                b4.n.f853a.j(((g) reference).f3911a, str);
                arrayList.remove(i);
                lVar.f3934j = true;
                if (arrayList.isEmpty()) {
                    lVar.f3941q = j2 - this.f3942a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
