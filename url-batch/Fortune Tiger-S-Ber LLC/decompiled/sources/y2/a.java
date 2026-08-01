package y2;

import java.util.Iterator;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class a implements Iterable, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f3617f;
    public final int g;
    public final int h;

    public a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3617f = i4;
        this.g = g.j(i4, i5, i6);
        this.h = i6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f3617f == aVar.f3617f && this.g == aVar.g && this.h == aVar.h;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3617f * 31) + this.g) * 31) + this.h;
    }

    public boolean isEmpty() {
        int i4 = this.h;
        int i5 = this.g;
        int i6 = this.f3617f;
        return i4 > 0 ? i6 > i5 : i6 < i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3617f, this.g, this.h);
    }

    public String toString() {
        StringBuilder sb;
        int i4 = this.g;
        int i5 = this.f3617f;
        int i6 = this.h;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append("..");
            sb.append(i4);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append(" downTo ");
            sb.append(i4);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
