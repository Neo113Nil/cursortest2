package f2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: f, reason: collision with root package name */
    public final int f3267f;

    public a(int i7) {
        this.f3267f = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3267f == ((a) obj).f3267f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3267f);
    }

    public final String toString() {
        return a0.m.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f3267f, ')');
    }
}
