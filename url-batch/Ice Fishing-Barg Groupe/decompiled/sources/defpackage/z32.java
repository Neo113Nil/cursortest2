package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z32 extends a42 {
    public static List KUoIVIumpKat(x32 x32Var) {
        Iterator it = x32Var.iterator();
        if (!it.hasNext()) {
            return p50.rtx2ld2ELZv4;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return fx1.jJwa0q7P5wHq(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static x32 bEKsvqmvPh2y(Iterator it) {
        it.getClass();
        return new pr(new fl(1, it));
    }

    public static x32 ngxnMNrpiKat(Object obj, le0 le0Var) {
        return obj == null ? s50.PxuCJdSBwIXG : new fy(new uy1(6, obj), le0Var, 2);
    }

    public static String yQRudnv4La6p(x32 x32Var, String str) {
        x32Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : x32Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            th0.OPXfSBeufaJ8(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
