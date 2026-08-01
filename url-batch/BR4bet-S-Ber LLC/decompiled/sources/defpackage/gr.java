package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class gr implements Iterable, wr {
    public final int f;
    public final int g;
    public final int h;

    public gr(int i, int i2, int i3) {
        if (i3 == 0) {
            g9.i("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            g9.i("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f = i;
        this.g = xf.t(i, i2, i3);
        this.h = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gr)) {
            return false;
        }
        if (isEmpty() && ((gr) obj).isEmpty()) {
            return true;
        }
        gr grVar = (gr) obj;
        return this.f == grVar.f && this.g == grVar.g && this.h == grVar.h;
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
        return new hr(this.f, this.g, this.h);
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
