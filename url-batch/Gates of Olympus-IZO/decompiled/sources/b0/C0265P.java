package b0;

import android.graphics.Shader;

/* renamed from: b0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265P extends AbstractC0259J {

    /* renamed from: e, reason: collision with root package name */
    public final long f4257e;

    public C0265P(long j3) {
        this.f4257e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0265P) {
            return C0288u.c(this.f4257e, ((C0265P) obj).f4257e);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f4257e);
    }

    @Override // b0.AbstractC0259J
    public final void j(float f3, long j3, C0276i c0276i) {
        c0276i.c(1.0f);
        long j4 = this.f4257e;
        if (f3 != 1.0f) {
            j4 = C0288u.b(j4, C0288u.d(j4) * f3);
        }
        c0276i.e(j4);
        if (((Shader) c0276i.f4274c) != null) {
            c0276i.g(null);
        }
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C0288u.i(this.f4257e)) + ')';
    }
}
