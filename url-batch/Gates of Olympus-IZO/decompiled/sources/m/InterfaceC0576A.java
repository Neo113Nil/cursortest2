package m;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0576A extends InterfaceC0602l {
    @Override // m.InterfaceC0602l
    default A0 a(y0 y0Var) {
        return new A2.k(this);
    }

    float b(long j3, float f3, float f4, float f5);

    float c(long j3, float f3, float f4, float f5);

    long d(float f3, float f4, float f5);

    default float f(float f3, float f4, float f5) {
        return c(d(f3, f4, f5), f3, f4, f5);
    }
}
