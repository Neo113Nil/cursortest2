package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ko extends RuntimeException {
    public final p81 OPXfSBeufaJ8;
    public final int dgRBjINgWbAK;
    public final p81 rtx2ld2ELZv4;
    public final b81 wdg6QnbFHrFF;

    public ko(p81 p81Var, p81 p81Var2, b81 b81Var, int i, Exception exc) {
        super(exc);
        this.rtx2ld2ELZv4 = p81Var;
        this.OPXfSBeufaJ8 = p81Var2;
        this.wdg6QnbFHrFF = b81Var;
        this.dgRBjINgWbAK = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.dgRBjINgWbAK);
        sb.append(":\n            |");
        y32 nLZGh9p8gVSu = xi0.nLZGh9p8gVSu(new jo(this, null));
        if (nLZGh9p8gVSu.hasNext()) {
            Object next = nLZGh9p8gVSu.next();
            if (nLZGh9p8gVSu.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (nLZGh9p8gVSu.hasNext()) {
                    arrayList.add(nLZGh9p8gVSu.next());
                }
                list = arrayList;
            } else {
                list = fx1.jJwa0q7P5wHq(next);
            }
        } else {
            list = p50.rtx2ld2ELZv4;
        }
        int size = list.size();
        if (50 >= size) {
            collection = zk.i(list);
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
        sb.append(zk.ctD2u3GUHhtA(collection, "\n", null, null, null, 62));
        sb.append("\n            ");
        return ja2.zf8DYfih6EZu(sb.toString());
    }
}
