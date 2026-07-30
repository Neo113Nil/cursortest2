package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b00 implements zz {
    public final int d;
    public final pu e;
    public final long g;
    public final long h = 0;

    public b00(int i, pu puVar) {
        this.d = i;
        this.e = puVar;
        this.g = i * 1000000;
    }

    @Override // defpackage.zz
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.h;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.g;
        if (j2 > j3) {
            j2 = j3;
        }
        float a = this.e.a(this.d == 0 ? 1.0f : j2 / j3);
        return (f2 * a) + ((1.0f - a) * f);
    }

    @Override // defpackage.zz
    public final float c(long j, float f, float f2, float f3) {
        long j2 = j - this.h;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.g;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (b(j4, f, f2, f3) - b(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.zz
    public final long e(float f, float f2, float f3) {
        return this.h + this.g;
    }
}
