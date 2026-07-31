package m;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0605A extends InterfaceC0627l {
    @Override // m.InterfaceC0627l
    default w0 a(u0 u0Var) {
        return new G1.g(this);
    }

    float b(long j3, float f3, float f4, float f5);

    float c(long j3, float f3, float f4, float f5);

    long d(float f3, float f4, float f5);

    default float f(float f3, float f4, float f5) {
        return c(d(f3, f4, f5), f3, f4, f5);
    }
}
