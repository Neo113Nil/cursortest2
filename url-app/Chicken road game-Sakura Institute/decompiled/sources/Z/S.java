package Z;

import android.graphics.Shader;
import y2.y;

/* loaded from: classes.dex */
public final class S extends AbstractC0319p {

    /* renamed from: a, reason: collision with root package name */
    public final long f4508a;

    public S(long j4) {
        this.f4508a = j4;
    }

    @Override // Z.AbstractC0319p
    public final void a(float f4, long j4, C0311h c0311h) {
        c0311h.c(1.0f);
        long j5 = this.f4508a;
        if (f4 != 1.0f) {
            j5 = C0323u.b(C0323u.d(j5) * f4, j5);
        }
        c0311h.e(j5);
        if (((Shader) c0311h.f4526c) != null) {
            c0311h.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S) {
            return C0323u.c(this.f4508a, ((S) obj).f4508a);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Long.hashCode(this.f4508a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C0323u.i(this.f4508a)) + ')';
    }
}
