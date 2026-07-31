package H0;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f2586a;

    public a(int i3) {
        this.f2586a = i3;
    }

    @Override // H0.p
    public final k a(k kVar) {
        int i3 = this.f2586a;
        return (i3 == 0 || i3 == Integer.MAX_VALUE) ? kVar : new k(O2.d.y(kVar.f2601d + i3, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2586a == ((a) obj).f2586a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2586a);
    }

    public final String toString() {
        return A.k.j(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f2586a, ')');
    }
}
