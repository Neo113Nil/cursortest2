package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class hv implements Iterable, pw {
    public final int f;
    public final int g;
    public final int h;

    public hv(int i, int i2, int i3) {
        if (i3 == 0) {
            s9.k("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            s9.k("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f = i;
        this.g = mv.w(i, i2, i3);
        this.h = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hv)) {
            return false;
        }
        if (isEmpty() && ((hv) obj).isEmpty()) {
            return true;
        }
        hv hvVar = (hv) obj;
        return this.f == hvVar.f && this.g == hvVar.g && this.h == hvVar.h;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f * 31) + this.g) * 31) + this.h;
    }

    public boolean isEmpty() {
        int i = this.g;
        int i2 = this.h;
        int i3 = this.f;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new iv(this.f, this.g, this.h);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.g;
        int i2 = this.h;
        int i3 = this.f;
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
