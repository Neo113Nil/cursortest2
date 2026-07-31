package j2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: d, reason: collision with root package name */
    public final int f3984d;

    public a(int i) {
        this.f3984d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3984d == ((a) obj).f3984d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3984d);
    }

    public final String toString() {
        return a0.q.k(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f3984d, ')');
    }
}
