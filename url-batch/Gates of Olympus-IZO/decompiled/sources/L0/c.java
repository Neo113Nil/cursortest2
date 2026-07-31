package L0;

import b0.AbstractC0259J;
import b0.C0288u;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f2674a;

    public c(long j3) {
        this.f2674a = j3;
        if (j3 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // L0.j
    public final float a() {
        return C0288u.d(this.f2674a);
    }

    @Override // L0.j
    public final long b() {
        return this.f2674a;
    }

    @Override // L0.j
    public final AbstractC0259J c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C0288u.c(this.f2674a, ((c) obj).f2674a);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f2674a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0288u.i(this.f2674a)) + ')';
    }
}
