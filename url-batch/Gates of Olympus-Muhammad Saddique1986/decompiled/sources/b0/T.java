package b0;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class T extends AbstractC0347p {

    /* renamed from: a, reason: collision with root package name */
    public final long f5399a;

    public T(long j3) {
        this.f5399a = j3;
    }

    @Override // b0.AbstractC0347p
    public final void a(float f3, long j3, C0339h c0339h) {
        c0339h.c(1.0f);
        long j4 = this.f5399a;
        if (f3 != 1.0f) {
            j4 = C0352v.b(j4, C0352v.d(j4) * f3);
        }
        c0339h.e(j4);
        if (((Shader) c0339h.f5416c) != null) {
            c0339h.f5416c = null;
            ((Paint) c0339h.f5415b).setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T) {
            return C0352v.c(this.f5399a, ((T) obj).f5399a);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f5399a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C0352v.i(this.f5399a)) + ')';
    }
}
