package g1;

import java.util.Iterator;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final int f366b;

    /* renamed from: c, reason: collision with root package name */
    public final int f367c;

    /* renamed from: d, reason: collision with root package name */
    public final int f368d;

    static {
        new b(1, 0, 1);
    }

    public b(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f366b = i2;
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                int i6 = i2 % i4;
                int i7 = ((i5 < 0 ? i5 + i4 : i5) - (i6 < 0 ? i6 + i4 : i6)) % i4;
                i3 -= i7 < 0 ? i7 + i4 : i7;
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                int i10 = i3 % i8;
                int i11 = ((i9 < 0 ? i9 + i8 : i9) - (i10 < 0 ? i10 + i8 : i10)) % i8;
                i3 += i11 < 0 ? i11 + i8 : i11;
            }
        }
        this.f367c = i3;
        this.f368d = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f366b == bVar.f366b && this.f367c == bVar.f367c;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f366b * 31) + this.f367c;
    }

    public final boolean isEmpty() {
        return this.f366b > this.f367c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f366b, this.f367c, this.f368d);
    }

    public final String toString() {
        return this.f366b + ".." + this.f367c;
    }
}
