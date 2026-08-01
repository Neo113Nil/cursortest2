package kotlin.text;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5617a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f5618b;

    static {
        int[] iArr = new int[256];
        int i3 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f5617a = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i3 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i3)] = i20;
            i3++;
            i20++;
        }
        f5618b = jArr;
    }
}
