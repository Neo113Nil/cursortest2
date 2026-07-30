package w6;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class b implements Iterable, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f9521f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9522g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9523h;

    public b(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f9521f = i7;
        this.f9522g = a.a.x(i7, i8, i9);
        this.f9523h = i9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f9521f == bVar.f9521f && this.f9522g == bVar.f9522g && this.f9523h == bVar.f9523h;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f9521f * 31) + this.f9522g) * 31) + this.f9523h;
    }

    public boolean isEmpty() {
        int i7 = this.f9523h;
        int i8 = this.f9522g;
        int i9 = this.f9521f;
        return i7 > 0 ? i9 > i8 : i9 < i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f9521f, this.f9522g, this.f9523h);
    }

    public String toString() {
        StringBuilder sb;
        int i7 = this.f9522g;
        int i8 = this.f9521f;
        int i9 = this.f9523h;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i7);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i7);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
