package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface w extends j {
    @Override // r.j
    default t1 a(r1 r1Var) {
        return new c5.x(this);
    }

    float b(long j7, float f6, float f8, float f9);

    float c(long j7, float f6, float f8, float f9);

    long d(float f6, float f8, float f9);

    default float e(float f6, float f8, float f9) {
        return c(d(f6, f8, f9), f6, f8, f9);
    }
}
