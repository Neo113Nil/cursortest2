package i;

import z2.C1436t;

/* renamed from: i.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0672g {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f6919a;

    static {
        long[] jArr = AbstractC0664E.f6891a;
        int f4 = AbstractC0664E.f(0);
        int max = f4 > 0 ? Math.max(7, AbstractC0664E.e(f4)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        int i2 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j4)) | j4;
        float[] fArr = new float[max];
        f6919a = new float[0];
    }
}
