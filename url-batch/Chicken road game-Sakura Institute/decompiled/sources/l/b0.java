package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface b0 extends k {
    @Override // l.k
    default y1 a(w1 w1Var) {
        return new g3.k(this);
    }

    float b(long j8, float f9, float f10, float f11);

    float c(long j8, float f9, float f10, float f11);

    long d(float f9, float f10, float f11);

    default float e(float f9, float f10, float f11) {
        return c(d(f9, f10, f11), f9, f10, f11);
    }
}
