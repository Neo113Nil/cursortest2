package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class zy {
    public final long a;
    public final l50 b;
    public final lo c;
    public final ConcurrentLinkedQueue d;

    public zy(m50 m50Var) {
        m50Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = m50Var.e();
        this.c = new lo(this, y70.g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(o2 o2Var, vy vyVar, ArrayList arrayList, boolean z) {
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            yy yyVar = (yy) it.next();
            yyVar.getClass();
            synchronized (yyVar) {
                if (z) {
                    try {
                        if (!(yyVar.g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (yyVar.h(o2Var, arrayList)) {
                    vyVar.b(yyVar);
                    return true;
                }
            }
        }
    }

    public final int b(yy yyVar, long j) {
        byte[] bArr = y70.a;
        ArrayList arrayList = yyVar.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + yyVar.b.a.h + " was leaked. Did you forget to close a response body?";
                jx jxVar = jx.a;
                jx.a.j(((ty) reference).a, str);
                arrayList.remove(i);
                yyVar.j = true;
                if (arrayList.isEmpty()) {
                    yyVar.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
