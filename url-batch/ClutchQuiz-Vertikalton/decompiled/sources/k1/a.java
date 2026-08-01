package k1;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a implements Iterable, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2818a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2820c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2818a = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.f2819b = i2;
        this.f2820c = i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2818a, this.f2819b, this.f2820c);
    }
}
