package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public interface m80 extends i8 {
    @Override // defpackage.i8
    default sp2 PxuCJdSBwIXG(lm2 lm2Var) {
        return new e0(this);
    }

    float TSizfFm2Yiuu(long j, float f, float f2, float f3);

    long Y1f8riQaR6yg(float f, float f2, float f3);

    default float e9gEMXR7LXtO(float f, float f2, float f3) {
        return TSizfFm2Yiuu(Y1f8riQaR6yg(f, f2, f3), f, f2, f3);
    }

    float lS5Rgt96tfkO(long j, float f, float f2, float f3);
}
