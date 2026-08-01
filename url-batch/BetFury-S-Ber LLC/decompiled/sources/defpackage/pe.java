package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pe implements cb0, c30 {
    public final cb0 f;
    public final c30 g;
    public qg h;
    public Throwable i;

    public pe(cb0 cb0Var) {
        e30 e30Var = new e30();
        cb0Var.getClass();
        this.f = cb0Var;
        this.g = e30Var;
    }

    @Override // defpackage.cb0
    public final eb0 N(String str) {
        str.getClass();
        return this.f.N(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    @Override // defpackage.c30
    public final void i(Object obj) {
        this.g.i(null);
    }

    @Override // defpackage.c30
    public final Object n(eg egVar) {
        return this.g.n(egVar);
    }

    public final void r(StringBuilder sb) {
        Iterable iterable;
        if (this.h == null && this.i == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        qg qgVar = this.h;
        if (qgVar != null) {
            sb.append("\t\tCoroutine: " + qgVar);
            sb.append('\n');
        }
        Throwable th = this.i;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            stringWriter2.getClass();
            List A = mf0.A(stringWriter2);
            int size = A.size() - 1;
            if (size <= 0) {
                iterable = wm.f;
            } else if (size != 1) {
                ArrayList arrayList = new ArrayList(size);
                if (A instanceof RandomAccess) {
                    int size2 = A.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(A.get(i));
                    }
                } else {
                    ListIterator listIterator = A.listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                iterable = arrayList;
            } else {
                if (A.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                iterable = bi.K(A.get(A.size() - 1));
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f.toString();
    }
}
