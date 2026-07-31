package E2;

import A2.C0002a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f836a;

    /* renamed from: b, reason: collision with root package name */
    public final D2.c f837b;

    /* renamed from: c, reason: collision with root package name */
    public final D2.b f838c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f839d;

    public l(D2.e eVar, TimeUnit timeUnit) {
        Z1.i.f(eVar, "taskRunner");
        this.f836a = timeUnit.toNanos(5L);
        this.f837b = eVar.e();
        this.f838c = new D2.b(this, B2.c.f421g + " ConnectionPool");
        this.f839d = new ConcurrentLinkedQueue();
    }

    public final boolean a(C0002a c0002a, h hVar, ArrayList arrayList, boolean z3) {
        Z1.i.f(hVar, "call");
        Iterator it = this.f839d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            k kVar = (k) it.next();
            Z1.i.e(kVar, "connection");
            synchronized (kVar) {
                if (z3) {
                    if (!(kVar.f826g != null)) {
                        continue;
                    }
                }
                if (kVar.h(c0002a, arrayList)) {
                    hVar.a(kVar);
                    return true;
                }
            }
        }
    }

    public final int b(k kVar, long j3) {
        byte[] bArr = B2.c.f415a;
        ArrayList arrayList = kVar.p;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i3);
            if (reference.get() != null) {
                i3++;
            } else {
                String str = "A connection to " + kVar.f821b.f23a.f40h + " was leaked. Did you forget to close a response body?";
                I2.n nVar = I2.n.f2519a;
                I2.n.f2519a.j(((f) reference).f800a, str);
                arrayList.remove(i3);
                kVar.f829j = true;
                if (arrayList.isEmpty()) {
                    kVar.f835q = j3 - this.f836a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
