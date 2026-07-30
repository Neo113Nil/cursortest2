package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface zz extends p7 {
    @Override // defpackage.p7
    default qm1 a(c51 c51Var) {
        return new o91(this);
    }

    float b(long j, float f, float f2, float f3);

    float c(long j, float f, float f2, float f3);

    long e(float f, float f2, float f3);

    default float j(float f, float f2, float f3) {
        return c(e(f, f2, f3), f, f2, f3);
    }
}
