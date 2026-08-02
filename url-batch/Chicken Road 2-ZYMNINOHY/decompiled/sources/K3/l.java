package K3;

import G3.C0050a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f1589a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.c f1590b;

    /* renamed from: c, reason: collision with root package name */
    public final J3.b f1591c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1592d;

    public l(J3.d taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        this.f1589a = timeUnit.toNanos(5L);
        this.f1590b = taskRunner.e();
        this.f1591c = new J3.b(this, kotlin.jvm.internal.i.h(" ConnectionPool", H3.b.f1108f));
        this.f1592d = new ConcurrentLinkedQueue();
    }

    public final boolean a(C0050a c0050a, i iVar, ArrayList arrayList, boolean z) {
        Iterator it = this.f1592d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            k connection = (k) it.next();
            kotlin.jvm.internal.i.d(connection, "connection");
            synchronized (connection) {
                if (z) {
                    try {
                        if (!(connection.f1580g != null)) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (connection.h(c0050a, arrayList)) {
                    iVar.a(connection);
                    return true;
                }
            }
        }
    }

    public final int b(k kVar, long j4) {
        byte[] bArr = H3.b.f1103a;
        ArrayList arrayList = kVar.f1587p;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                String str = "A connection to " + kVar.f1575b.f846a.f863h + " was leaked. Did you forget to close a response body?";
                O3.n nVar = O3.n.f2081a;
                O3.n.f2081a.j(((g) reference).f1559a, str);
                arrayList.remove(i4);
                kVar.f1583j = true;
                if (arrayList.isEmpty()) {
                    kVar.f1588q = j4 - this.f1589a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
