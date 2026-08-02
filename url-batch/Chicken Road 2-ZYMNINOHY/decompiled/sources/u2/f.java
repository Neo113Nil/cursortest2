package u2;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f15510a;

    public f(List list) {
        this.f15510a = list;
    }

    @Override // u2.e
    public final boolean apply(Object obj) {
        int i4 = 0;
        while (true) {
            List list = this.f15510a;
            if (i4 >= list.size()) {
                return true;
            }
            if (!((e) list.get(i4)).apply(obj)) {
                return false;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f15510a.equals(((f) obj).f15510a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15510a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f15510a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
