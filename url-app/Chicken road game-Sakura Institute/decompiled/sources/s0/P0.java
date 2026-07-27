package s0;

/* loaded from: classes.dex */
public interface P0 {
    float a();

    default float b() {
        return 2.0f;
    }

    default float c() {
        return 16.0f;
    }

    default float d() {
        return Float.MAX_VALUE;
    }

    long e();

    long f();

    default long g() {
        float f4 = 48;
        return M1.a.d(f4, f4);
    }
}
