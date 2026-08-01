package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class m10 {
    public final long a;
    public final k80 b;
    public final hq c;
    public final ConcurrentLinkedQueue d;

    public m10(l80 l80Var) {
        l80Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = l80Var.e();
        this.c = new hq(this, cb0.g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(e2 e2Var, i10 i10Var, ArrayList arrayList, boolean z) {
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            l10 l10Var = (l10) it.next();
            l10Var.getClass();
            synchronized (l10Var) {
                if (z) {
                    try {
                        if (!(l10Var.g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (l10Var.h(e2Var, arrayList)) {
                    i10Var.b(l10Var);
                    return true;
                }
            }
        }
    }

    public final int b(l10 l10Var, long j) {
        byte[] bArr = cb0.a;
        ArrayList arrayList = l10Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + l10Var.b.a.h + " was leaked. Did you forget to close a response body?";
                zz zzVar = zz.a;
                zz.a.j(((g10) reference).a, str);
                arrayList.remove(i);
                l10Var.j = true;
                if (arrayList.isEmpty()) {
                    l10Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
