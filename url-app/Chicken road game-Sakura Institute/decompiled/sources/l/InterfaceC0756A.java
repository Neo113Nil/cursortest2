package l;

/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0756A extends InterfaceC0787m {
    @Override // l.InterfaceC0787m
    default x0 a(v0 v0Var) {
        return new Y0.b(this);
    }

    float b(long j4, float f4, float f5, float f6);

    float c(long j4, float f4, float f5, float f6);

    long d(float f4, float f5, float f6);

    default float f(float f4, float f5, float f6) {
        return c(d(f4, f5, f6), f4, f5, f6);
    }
}
