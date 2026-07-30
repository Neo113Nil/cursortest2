package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class s13 extends l41 {
    public static final int[] l = {1, 1, 1};
    public static final int[] m = {1, 1, 1, 1, 1};
    public static final int[] n = {1, 1, 1, 1, 1, 1};
    public static final int[][] o;
    public static final int[][] p;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        o = iArr;
        int[][] iArr2 = new int[20][];
        p = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = o[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            p[i] = iArr4;
        }
    }

    public static boolean d0(String str) {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            if (e0(str.subSequence(0, i)) == Character.digit(str.charAt(i), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int e0(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                rq0 rq0Var = rq0.o;
                if (i62.m) {
                    throw new rq0();
                }
                throw rq0.o;
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                rq0 rq0Var2 = rq0.o;
                if (i62.m) {
                    throw new rq0();
                }
                throw rq0.o;
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }
}
