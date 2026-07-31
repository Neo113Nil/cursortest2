package v6;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class b implements Iterable, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f7492d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7493e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7494f;

    public b(int i, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f7492d = i;
        if (i9 > 0) {
            if (i < i8) {
                int i10 = i8 % i9;
                int i11 = i % i9;
                int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                i8 -= i12 < 0 ? i12 + i9 : i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i8) {
                int i13 = -i9;
                int i14 = i % i13;
                int i15 = i8 % i13;
                int i16 = ((i14 < 0 ? i14 + i13 : i14) - (i15 < 0 ? i15 + i13 : i15)) % i13;
                i8 += i16 < 0 ? i16 + i13 : i16;
            }
        }
        this.f7493e = i8;
        this.f7494f = i9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f7492d == bVar.f7492d && this.f7493e == bVar.f7493e && this.f7494f == bVar.f7494f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f7492d * 31) + this.f7493e) * 31) + this.f7494f;
    }

    public boolean isEmpty() {
        int i = this.f7494f;
        int i8 = this.f7493e;
        int i9 = this.f7492d;
        return i > 0 ? i9 > i8 : i9 < i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f7492d, this.f7493e, this.f7494f);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f7493e;
        int i8 = this.f7492d;
        int i9 = this.f7494f;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
