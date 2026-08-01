package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class r9 {
    public static final r9 c;
    public final Set a;
    public final o8 b;

    static {
        Set set;
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                int size2 = arrayList.size();
                if (size2 >= 0) {
                    size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
                }
                set = new LinkedHashSet(size2);
                int size3 = arrayList.size();
                while (i < size3) {
                    Object obj = arrayList.get(i);
                    i++;
                    set.add(obj);
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                set.getClass();
            }
        } else {
            set = fi.f;
        }
        c = new r9(set, null);
    }

    public r9(Set set, o8 o8Var) {
        this.a = set;
        this.b = o8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        return r9Var.a.equals(this.a) && zo.b(r9Var.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        o8 o8Var = this.b;
        return hashCode + (o8Var != null ? o8Var.hashCode() : 0);
    }
}
