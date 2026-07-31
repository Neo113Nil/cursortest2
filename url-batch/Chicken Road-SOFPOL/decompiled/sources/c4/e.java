package c4;

import q.p0;
import q.q0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public float f1624a;

    /* renamed from: b, reason: collision with root package name */
    public float f1625b;

    public p0 a(float f6) {
        double b8 = b(f6);
        double d8 = q0.f5895a;
        double d9 = d8 - 1.0d;
        return new p0(f6, (float) (Math.exp((d8 / d9) * b8) * this.f1624a * this.f1625b), (long) (Math.exp(b8 / d9) * 1000.0d));
    }

    public double b(float f6) {
        float[] fArr = q.b.f5800a;
        return Math.log((Math.abs(f6) * 0.35f) / (this.f1624a * this.f1625b));
    }
}
