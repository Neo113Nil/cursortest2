package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wc0 extends yc0 {
    public static String j(vc0 vc0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : vc0Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            mc0.d(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static List k(vc0 vc0Var) {
        Iterator it = vc0Var.iterator();
        if (!it.hasNext()) {
            return wm.f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return bi.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
