package F0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f2603a;

    public a(int i2) {
        this.f2603a = i2;
    }

    @Override // F0.p
    public final k a(k kVar) {
        int i2 = this.f2603a;
        return (i2 == 0 || i2 == Integer.MAX_VALUE) ? kVar : new k(kotlin.ranges.b.e(kVar.f2618d + i2, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2603a == ((a) obj).f2603a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2603a);
    }

    public final String toString() {
        return AbstractC0017m.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f2603a, ')');
    }
}
