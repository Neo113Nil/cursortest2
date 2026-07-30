package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nn2 extends cq {
    public final long a;

    public nn2(long j) {
        this.a = j;
    }

    @Override // defpackage.cq
    public final void a(float f, long j, vs3 vs3Var) {
        vs3Var.c(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            j2 = aw.b(j2, aw.d(j2) * f);
        }
        vs3Var.e(j2);
        if (((Shader) vs3Var.c) != null) {
            vs3Var.c = null;
            ((Paint) vs3Var.b).setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nn2) {
            return aw.c(this.a, ((nn2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) aw.i(this.a)) + ')';
    }
}
