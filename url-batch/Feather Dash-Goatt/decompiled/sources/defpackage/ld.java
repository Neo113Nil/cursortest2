package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ld extends mu0 {
    public final t5 d;
    public final long e;
    public final int f = 1;
    public final long g;
    public float h;

    public ld(t5 t5Var) {
        int i;
        long width = (t5Var.a.getWidth() << 32) | (t5Var.a.getHeight() & 4294967295L);
        this.d = t5Var;
        this.e = width;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > t5Var.a.getWidth() || i > t5Var.a.getHeight()) {
            dd0.e("Failed requirement.");
            throw null;
        }
        this.g = width;
        this.h = 1.0f;
    }

    @Override // defpackage.mu0
    public final void a(float f) {
        this.h = f;
    }

    @Override // defpackage.mu0
    public final long c() {
        return ca0.x(this.g);
    }

    @Override // defpackage.mu0
    public final void d(hu huVar) {
        int round = Math.round(Float.intBitsToFloat((int) (huVar.x() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (huVar.x() & 4294967295L)));
        hu.R(huVar, this.d, this.e, 0L, (round << 32) | (round2 & 4294967295L), this.h, null, this.f, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld)) {
            return false;
        }
        ld ldVar = (ld) obj;
        return Intrinsics.a(this.d, ldVar.d) && s90.a(0L, 0L) && ba0.a(this.e, ldVar.e) && this.f == ldVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qy0.e(this.e, qy0.e(0L, this.d.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.d);
        sb.append(", srcOffset=");
        sb.append((Object) s90.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) ba0.b(this.e));
        sb.append(", filterQuality=");
        int i = this.f;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
