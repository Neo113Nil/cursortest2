package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpf {
    public static final jpf a;
    public final int[] b;
    public final int[] c;
    public final jpg d;
    public final int e;
    public final int f;
    private final int g;

    static {
        new jpf(4201, 4096, 1);
        new jpf(1033, 1024, 1);
        new jpf(67, 64, 1);
        new jpf(19, 16, 1);
        a = new jpf(285, 256, 0);
        new jpf(301, 256, 1);
    }

    public jpf(int i, int i2, int i3) {
        int i4;
        this.g = i;
        this.e = i2;
        this.f = i3;
        this.b = new int[i2];
        this.c = new int[i2];
        int i5 = 0;
        int i6 = 1;
        while (true) {
            i4 = i2 - 1;
            if (i5 >= i2) {
                break;
            }
            this.b[i5] = i6;
            i6 += i6;
            if (i6 >= i2) {
                i6 = (i6 ^ i) & i4;
            }
            i5++;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            this.c[this.b[i7]] = i7;
        }
        this.d = new jpg(this, new int[]{0});
        new jpg(this, new int[]{1});
    }

    public final int a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.g) + "," + this.e + ")";
    }
}
