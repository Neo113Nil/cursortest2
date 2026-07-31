package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3865a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3866b = l0.j.f4557b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3867c = l0.j.f4558c;

    public static final void a(h1.d dVar, int i, long j7, float f6, float f8) {
        if (i == 1) {
            float f9 = f6 / 2.0f;
            float intBitsToFloat = (Float.intBitsToFloat((int) (dVar.c() >> 32)) - f9) - f8;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) / 2.0f;
            h1.d.w(dVar, j7, f9, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 120);
            return;
        }
        float intBitsToFloat3 = (Float.intBitsToFloat((int) (dVar.c() >> 32)) - f6) - f8;
        float intBitsToFloat4 = (Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) - f6) / 2.0f;
        h1.d.r(dVar, j7, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32), (Float.floatToRawIntBits(f6) << 32) | (4294967295L & Float.floatToRawIntBits(f6)), 120);
    }
}
