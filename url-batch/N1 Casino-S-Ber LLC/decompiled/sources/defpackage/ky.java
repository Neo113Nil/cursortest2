package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ky {
    public final long a;
    public final e50 b;
    public final vn c;
    public final ConcurrentLinkedQueue d;

    public ky(f50 f50Var) {
        f50Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = f50Var.e();
        this.c = new vn(this, r70.g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(y1 y1Var, gy gyVar, ArrayList arrayList, boolean z) {
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            jy jyVar = (jy) it.next();
            jyVar.getClass();
            synchronized (jyVar) {
                if (z) {
                    try {
                        if (!(jyVar.g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (jyVar.h(y1Var, arrayList)) {
                    gyVar.b(jyVar);
                    return true;
                }
            }
        }
    }

    public final int b(jy jyVar, long j) {
        byte[] bArr = r70.a;
        ArrayList arrayList = jyVar.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + jyVar.b.a.h + " was leaked. Did you forget to close a response body?";
                ww wwVar = ww.a;
                ww.a.j(((ey) reference).a, str);
                arrayList.remove(i);
                jyVar.j = true;
                if (arrayList.isEmpty()) {
                    jyVar.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
