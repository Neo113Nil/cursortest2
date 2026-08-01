package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n9 {
    public static final n9 c;
    public final Set a;
    public final l70 b;

    static {
        Set set;
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                set = new LinkedHashSet(bs.s0(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    set.add(obj);
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                set.getClass();
            }
        } else {
            set = xh.f;
        }
        c = new n9(set, null);
    }

    public n9(Set set, l70 l70Var) {
        this.a = set;
        this.b = l70Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return n9Var.a.equals(this.a) && op.d(n9Var.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        l70 l70Var = this.b;
        return hashCode + (l70Var != null ? l70Var.hashCode() : 0);
    }
}
