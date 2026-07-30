package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sq {
    public final String a;
    public final s40 b;

    public sq(Set set, s40 s40Var) {
        this.a = b(set);
        this.b = s40Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pb pbVar = (pb) it.next();
            sb.append(pbVar.a);
            sb.append('/');
            sb.append(pbVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        s40 s40Var = this.b;
        synchronized (((HashSet) s40Var.e)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) s40Var.e);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) s40Var.e)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) s40Var.e);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
