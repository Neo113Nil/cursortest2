package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yu0 {
    public static final yu0 g = new yu0(4201, 4096, 1);
    public static final yu0 h = new yu0(1033, 1024, 1);
    public static final yu0 i = new yu0(67, 64, 1);
    public static final yu0 j = new yu0(19, 16, 1);
    public static final yu0 k = new yu0(285, 256, 0);
    public static final yu0 l = new yu0(301, 256, 1);
    public final int[] a;
    public final int[] b;
    public final zu0 c;
    public final int d;
    public final int e;
    public final int f;

    public yu0(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new zu0(this, new int[]{0});
    }

    public final int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.e));
        sb.append(',');
        return q40.o(sb, this.d, ')');
    }
}
