package j;

/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0489g {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f5164a;

    static {
        long[] jArr = AbstractC0478D.f5136a;
        int f3 = AbstractC0478D.f(0);
        int max = f3 > 0 ? Math.max(7, AbstractC0478D.e(f3)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            M1.k.d0(jArr);
        }
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        float[] fArr = new float[max];
        f5164a = new float[0];
    }
}
