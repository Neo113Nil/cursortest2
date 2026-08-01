package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class r70 {
    public final long a;
    public final jh0 b;
    public final au c;
    public final ConcurrentLinkedQueue d;

    public r70(kh0 kh0Var) {
        kh0Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = kh0Var.e();
        this.c = new au(this, r7.d(new StringBuilder(), zk0.g, " ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(n2 n2Var, n70 n70Var, ArrayList arrayList, boolean z) {
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            q70 q70Var = (q70) it.next();
            q70Var.getClass();
            synchronized (q70Var) {
                if (z) {
                    try {
                        if (!(q70Var.g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (q70Var.h(n2Var, arrayList)) {
                    n70Var.b(q70Var);
                    return true;
                }
            }
        }
    }

    public final int b(q70 q70Var, long j) {
        byte[] bArr = zk0.a;
        ArrayList arrayList = q70Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + q70Var.b.a.h + " was leaked. Did you forget to close a response body?";
                q50 q50Var = q50.a;
                q50.a.j(((l70) reference).a, str);
                arrayList.remove(i);
                q70Var.j = true;
                if (arrayList.isEmpty()) {
                    q70Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
