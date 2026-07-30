package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j10 implements nc2, oo1 {
    public final nc2 m;
    public final oo1 n;
    public CoroutineContext o;
    public Throwable p;

    public j10(nc2 nc2Var) {
        qo1 qo1Var = new qo1();
        nc2Var.getClass();
        this.m = nc2Var;
        this.n = qo1Var;
    }

    @Override // defpackage.nc2
    public final uc2 M(String str) {
        str.getClass();
        return this.m.M(str);
    }

    @Override // defpackage.oo1
    public final void b(Object obj) {
        this.n.b(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // defpackage.oo1
    public final Object f(r30 r30Var) {
        return this.n.f(r30Var);
    }

    public final void m(StringBuilder sb) {
        List list;
        if (this.o == null && this.p == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        CoroutineContext coroutineContext = this.o;
        if (coroutineContext != null) {
            sb.append("\t\tCoroutine: " + coroutineContext);
            sb.append('\n');
        }
        Throwable th = this.p;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            String b = wi0.b(th);
            b.getClass();
            ae1 ae1Var = new ae1(b);
            if (ae1Var.hasNext()) {
                Object next = ae1Var.next();
                if (ae1Var.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (ae1Var.hasNext()) {
                        arrayList.add(ae1Var.next());
                    }
                    list = arrayList;
                } else {
                    list = pv.c(next);
                }
            } else {
                list = ah0.m;
            }
            Iterator it = zv.r(1, list).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.m.toString();
    }
}
