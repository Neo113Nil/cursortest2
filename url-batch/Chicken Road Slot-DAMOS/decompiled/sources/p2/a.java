package p2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: d, reason: collision with root package name */
    public final int f7602d;

    public a(int i3) {
        this.f7602d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f7602d == ((a) obj).f7602d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7602d);
    }

    public final String toString() {
        return v4.a.m(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f7602d, ')');
    }
}
