package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class r80 {
    public static final float[] PxuCJdSBwIXG;

    static {
        long[] jArr = c02.PxuCJdSBwIXG;
        int Y1f8riQaR6yg = c02.Y1f8riQaR6yg(0);
        int max = Y1f8riQaR6yg > 0 ? Math.max(7, c02.TSizfFm2Yiuu(Y1f8riQaR6yg)) : 0;
        if (max != 0) {
            int i = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[max];
        PxuCJdSBwIXG = new float[0];
    }
}
