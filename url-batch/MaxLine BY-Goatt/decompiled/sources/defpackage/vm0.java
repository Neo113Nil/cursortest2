package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vm0 implements tm0 {
    public final int a;
    public final int b;
    public final bf0 c;
    public final long d;
    public final long e;

    public vm0(int i, int i2, bf0 bf0Var) {
        this.a = i;
        this.b = i2;
        this.c = bf0Var;
        this.d = i * 1000000;
        this.e = i2 * 1000000;
    }

    @Override // defpackage.tm0
    public final float b(long j, float f, float f2, float f3) {
        float d = this.a == 0 ? 1.0f : d.d(j - this.e, 0L, this.d) / this.d;
        if (d < 0.0f) {
            d = 0.0f;
        }
        if (d > 1.0f) {
            d = 1.0f;
        }
        float a = this.c.a(d);
        k03 k03Var = v33.a;
        return (f2 * a) + ((1.0f - a) * f);
    }

    @Override // defpackage.tm0
    public final float c(long j, float f, float f2, float f3) {
        long d = d.d(j - this.e, 0L, this.d);
        if (d < 0) {
            return 0.0f;
        }
        if (d == 0) {
            return f3;
        }
        return (b(d, f, f2, f3) - b(d - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.tm0
    public final long d(float f, float f2, float f3) {
        return (this.b + this.a) * 1000000;
    }
}
