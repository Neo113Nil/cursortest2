package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gk2 {
    public static final int PxuCJdSBwIXG(gk2 gk2Var, long j, int i) {
        gk2Var.getClass();
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static long lS5Rgt96tfkO(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }
}
