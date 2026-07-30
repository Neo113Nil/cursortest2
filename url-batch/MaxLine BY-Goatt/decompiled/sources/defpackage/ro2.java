package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ro2 {
    public static final ro2 e = new ro2(ay2.b, 0, 0, 0);
    public final int a;
    public final ay2 b;
    public final int c;
    public final int d;

    public ro2(ay2 ay2Var, int i, int i2, int i3) {
        this.b = ay2Var;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public final ro2 a(int i) {
        ay2 ay2Var = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = px0.b[i2];
            i2 = 0;
            int i4 = iArr[0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            ay2Var.getClass();
            i3 += i6;
            ay2Var = new il2(ay2Var, i5, i6);
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        ro2 ro2Var = new ro2(ay2Var, i2, i9, i3 + i8);
        return i9 == 2078 ? ro2Var.b(i + 1) : ro2Var;
    }

    public final ro2 b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        ay2 ay2Var = this.b;
        ay2Var.getClass();
        return new ro2(new bo(ay2Var, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(ro2 ro2Var) {
        int i;
        int i2 = this.d + (px0.b[this.a][ro2Var.a] >> 16);
        int i3 = ro2Var.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= ro2Var.d;
    }

    public final ro2 d(int i, int i2) {
        int i3 = this.d;
        ay2 ay2Var = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = px0.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            ay2Var.getClass();
            i3 += i7;
            ay2Var = new il2(ay2Var, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        ay2Var.getClass();
        return new ro2(new il2(ay2Var, i2, i8), i, 0, i3 + i8);
    }

    public final ro2 e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = px0.d[i3][i];
        ay2 ay2Var = this.b;
        ay2Var.getClass();
        return new ro2(new il2(new il2(ay2Var, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", px0.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
