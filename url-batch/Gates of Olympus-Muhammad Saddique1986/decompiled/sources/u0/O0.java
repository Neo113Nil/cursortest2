package u0;

import a.AbstractC0235a;

/* loaded from: classes.dex */
public interface O0 {
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
        float f3 = 48;
        return AbstractC0235a.d(f3, f3);
    }
}
