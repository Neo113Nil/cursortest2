package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f919a = new c0(b0.f805e, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f920b = new c0(b0.f806i, 1.0f);

    public static final d1.l a(float f3) {
        return f3 == 1.0f ? f920b : new c0(b0.f806i, f3);
    }

    public static final d1.l b(float f3) {
        return f3 == 1.0f ? f919a : new c0(b0.f805e, f3);
    }

    public static final d1.l c(d1.l lVar, float f3) {
        return lVar.c(new v0(0.0f, f3, 0.0f, f3, 5));
    }

    public static final d1.l d(float f3) {
        return new v0(f3, f3, f3, f3);
    }

    public static final d1.l e(d1.l lVar, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return lVar.c(new v0(intBitsToFloat, intBitsToFloat2, intBitsToFloat, intBitsToFloat2));
    }

    public static final d1.l f(d1.l lVar, float f3) {
        return lVar.c(new v0(f3, 0.0f, f3, 0.0f, 10));
    }
}
