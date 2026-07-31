package f1;

import android.graphics.Shader;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k0 extends p {

    /* renamed from: e, reason: collision with root package name */
    public final long f2682e;

    public k0(long j7) {
        this.f2682e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return s.c(this.f2682e, ((k0) obj).f2682e);
        }
        return false;
    }

    @Override // f1.p
    public final void g(float f6, long j7, h hVar) {
        hVar.c(1.0f);
        long j8 = this.f2682e;
        if (f6 != 1.0f) {
            j8 = s.b(j8, s.d(j8) * f6);
        }
        hVar.e(j8);
        if (((Shader) hVar.f2661c) != null) {
            hVar.g(null);
        }
    }

    public final int hashCode() {
        int i = s.i;
        return Long.hashCode(this.f2682e);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) s.i(this.f2682e)) + ')';
    }
}
