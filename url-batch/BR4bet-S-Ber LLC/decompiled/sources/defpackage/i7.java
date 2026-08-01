package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i7 {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j) {
        if (j < this.e) {
            return 0.0f;
        }
        long j2 = this.g;
        if (j2 < 0 || j < j2) {
            return rt.b((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.h;
        return (rt.b((j - j2) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
