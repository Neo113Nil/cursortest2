package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f5478a;

    static {
        long[] jArr = r0.f5528a;
        int d8 = r0.d(0);
        int max = d8 > 0 ? Math.max(7, r0.c(d8)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        int i = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i] = (jArr[i] & (~j7)) | j7;
        float[] fArr = new float[max];
        f5478a = new float[0];
    }
}
