package l2;

import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final long f5863a;

    public c(long j8) {
        this.f5863a = j8;
        if (j8 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // l2.m
    public final float a() {
        return u.d(this.f5863a);
    }

    @Override // l2.m
    public final long b() {
        return this.f5863a;
    }

    @Override // l2.m
    public final z0.p c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && u.c(this.f5863a, ((c) obj).f5863a);
    }

    public final int hashCode() {
        int i7 = u.f10058h;
        return Long.hashCode(this.f5863a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) u.i(this.f5863a)) + ')';
    }
}
