package kotlin.ranges;

import defpackage.dd0;
import defpackage.u90;
import defpackage.v90;
import defpackage.yb0;
import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class a implements Iterable, yb0 {
    public static final u90 h = new u90(null);
    public final int d;
    public final int e;
    public final int g;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            dd0.e("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            dd0.e("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.d = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                dd0.e("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.e = i2;
        this.g = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.d == aVar.d && this.e == aVar.e && this.g == aVar.g;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.d * 31) + this.e) * 31) + this.g;
    }

    public boolean isEmpty() {
        int i = this.e;
        int i2 = this.g;
        int i3 = this.d;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new v90(this.d, this.e, this.g);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.e;
        int i2 = this.g;
        int i3 = this.d;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
