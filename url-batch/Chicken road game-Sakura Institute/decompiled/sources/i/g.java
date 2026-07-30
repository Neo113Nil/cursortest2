package i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f4741a;

    static {
        long[] jArr = e0.f4736a;
        int f9 = e0.f(0);
        int max = f9 > 0 ? Math.max(7, e0.e(f9)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            e6.k.d0(jArr);
        }
        int i7 = max >> 3;
        long j8 = 255 << ((max & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j8)) | j8;
        float[] fArr = new float[max];
        f4741a = new float[0];
    }
}
