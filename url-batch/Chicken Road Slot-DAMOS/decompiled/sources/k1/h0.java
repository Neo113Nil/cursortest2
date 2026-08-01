package k1;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 extends v {

    /* renamed from: f, reason: collision with root package name */
    public final long f5325f;

    public h0(long j) {
        this.f5325f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return p.c(this.f5325f, ((h0) obj).f5325f);
        }
        return false;
    }

    @Override // k1.v
    public final void f(float f3, long j, y6.l lVar) {
        lVar.f(1.0f);
        long j3 = this.f5325f;
        if (f3 != 1.0f) {
            j3 = p.b(j3, p.d(j3) * f3);
        }
        lVar.h(j3);
        if (((Shader) lVar.f10661i) != null) {
            lVar.f10661i = null;
            ((Paint) lVar.f10660e).setShader(null);
        }
    }

    public final int hashCode() {
        int i3 = p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        return Long.hashCode(this.f5325f);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) p.h(this.f5325f)) + ')';
    }
}
