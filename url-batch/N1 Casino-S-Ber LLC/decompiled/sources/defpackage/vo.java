package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class vo implements Iterable, kp {
    public final int f;
    public final int g;
    public final int h;

    public vo(int i, int i2, int i3) {
        if (i3 == 0) {
            t8.k("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            t8.k("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f = i;
        this.g = jw.y(i, i2, i3);
        this.h = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vo)) {
            return false;
        }
        if (isEmpty() && ((vo) obj).isEmpty()) {
            return true;
        }
        vo voVar = (vo) obj;
        return this.f == voVar.f && this.g == voVar.g && this.h == voVar.h;
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
        return new wo(this.f, this.g, this.h);
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
