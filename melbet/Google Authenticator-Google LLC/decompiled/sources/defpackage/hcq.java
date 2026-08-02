package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hcq extends hin implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator[] a;

    public hcq(Comparator comparator, Comparator comparator2) {
        this.a = new Comparator[]{comparator, comparator2};
    }

    @Override // defpackage.hin, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (int i = 0; i < 2; i++) {
            int compare = this.a[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hcq) {
            return Arrays.equals(this.a, ((hcq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Ordering.compound(" + Arrays.toString(this.a) + ")";
    }
}
