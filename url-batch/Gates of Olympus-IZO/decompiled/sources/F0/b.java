package F0;

import H2.AbstractC0080b;
import e2.AbstractC0381e;

/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f1443a;

    public b(int i3) {
        this.f1443a = i3;
    }

    @Override // F0.q
    public final l a(l lVar) {
        int i3 = this.f1443a;
        return (i3 == 0 || i3 == Integer.MAX_VALUE) ? lVar : new l(AbstractC0381e.r(lVar.f1458d + i3, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f1443a == ((b) obj).f1443a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1443a);
    }

    public final String toString() {
        return AbstractC0080b.k(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f1443a, ')');
    }
}
