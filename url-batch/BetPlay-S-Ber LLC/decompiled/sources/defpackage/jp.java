package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class jp implements Iterable, vp {
    public final int f;
    public final int g;
    public final int h;

    public jp(int i, int i2, int i3) {
        if (i3 == 0) {
            o8.j("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            o8.j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f = i;
        this.g = l70.t(i, i2, i3);
        this.h = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jp)) {
            return false;
        }
        if (isEmpty() && ((jp) obj).isEmpty()) {
            return true;
        }
        jp jpVar = (jp) obj;
        return this.f == jpVar.f && this.g == jpVar.g && this.h == jpVar.h;
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
        return new kp(this.f, this.g, this.h);
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
