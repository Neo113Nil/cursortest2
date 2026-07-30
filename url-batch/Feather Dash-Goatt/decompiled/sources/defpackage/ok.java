package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt;
import kotlin.text.b;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ok extends RuntimeException {
    public final mn0 d;
    public final mn0 e;
    public final dn0 g;
    public final int h;

    public ok(mn0 mn0Var, mn0 mn0Var2, dn0 dn0Var, int i, Exception exc) {
        super(exc);
        this.d = mn0Var;
        this.e = mn0Var2;
        this.g = dn0Var;
        this.h = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.h);
        sb.append(":\n            |");
        f91 a = h91.a(new nk(this, null));
        if (a.hasNext()) {
            Object next = a.next();
            if (a.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (a.hasNext()) {
                    arrayList.add(a.next());
                }
                list = arrayList;
            } else {
                list = yh.b(next);
            }
        } else {
            list = nv.d;
        }
        list.getClass();
        int size = list.size();
        if (50 >= size) {
            collection = CollectionsKt.y(list);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (list instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(list.get(i));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collection = arrayList2;
        }
        sb.append(CollectionsKt.r(collection, "\n", null, null, null, 62));
        sb.append("\n            ");
        return b.c(sb.toString());
    }
}
