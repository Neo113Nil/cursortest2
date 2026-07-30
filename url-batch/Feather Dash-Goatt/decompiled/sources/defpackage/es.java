package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class es {
    public final float a;
    public final float b;
    public final long c;
    public final float d;
    public final float e;
    public final int f;
    public final float g;

    public es(float f, float f2, long j, float f3, float f4, int i, float f5) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = f3;
        this.e = f4;
        this.f = i;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es)) {
            return false;
        }
        es esVar = (es) obj;
        return Float.compare(this.a, esVar.a) == 0 && Float.compare(this.b, esVar.b) == 0 && this.c == esVar.c && Float.compare(this.d, esVar.d) == 0 && Float.compare(this.e, esVar.e) == 0 && this.f == esVar.f && Float.compare(this.g, esVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + qy0.c(this.f, qy0.b(this.e, qy0.b(this.d, qy0.e(this.c, qy0.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "DifficultyConfig(baselineSpeedMultiplier=" + this.a + ", dashSpeedMultiplier=" + this.b + ", dashDurationMillis=" + this.c + ", vehicleSpeedMultiplier=" + this.d + ", minimumHazardSpacing=" + this.e + ", strongerPatternsAfterSections=" + this.f + ", rewardMultiplier=" + this.g + ")";
    }
}
