package s;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f8311a;

    static {
        long[] jArr = p0.f8356a;
        int d10 = p0.d(0);
        int max = d10 > 0 ? Math.max(7, p0.c(d10)) : 0;
        if (max != 0) {
            int i3 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, -9187201950435737472L);
            jArr = jArr2;
        }
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        float[] fArr = new float[max];
        f8311a = new float[0];
    }
}
