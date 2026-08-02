package v2;

import E.AbstractC0005f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: v2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1452A extends Z implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator[] f15557a;

    public C1452A(C1470q c1470q, C1470q c1470q2) {
        this.f15557a = new Comparator[]{c1470q, c1470q2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i4 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f15557a;
            if (i4 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i4].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i4++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1452A) {
            return Arrays.equals(this.f15557a, ((C1452A) obj).f15557a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15557a);
    }

    public final String toString() {
        return AbstractC0005f.q(new StringBuilder("Ordering.compound("), Arrays.toString(this.f15557a), ")");
    }
}
