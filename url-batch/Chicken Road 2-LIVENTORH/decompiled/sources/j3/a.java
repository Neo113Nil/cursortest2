package j3;

import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class a implements Iterable, g3.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f1977f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1978g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1979h;

    public a(int i, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1977f = i;
        if (i5 > 0) {
            if (i < i4) {
                int i6 = i4 % i5;
                int i7 = i % i5;
                int i8 = ((i6 < 0 ? i6 + i5 : i6) - (i7 < 0 ? i7 + i5 : i7)) % i5;
                i4 -= i8 < 0 ? i8 + i5 : i8;
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i4) {
                int i9 = -i5;
                int i10 = i % i9;
                int i11 = i4 % i9;
                int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                i4 += i12 < 0 ? i12 + i9 : i12;
            }
        }
        this.f1978g = i4;
        this.f1979h = i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f1977f, this.f1978g, this.f1979h);
    }
}
