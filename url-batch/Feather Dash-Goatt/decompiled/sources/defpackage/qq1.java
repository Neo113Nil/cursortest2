package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qq1 extends y01 implements Serializable {
    private static final pq1 m = new pq1(null);
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    @Override // defpackage.y01
    public final int a(int i) {
        return (b() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.y01
    public final int b() {
        int i = this.g;
        int i2 = i ^ (i >>> 2);
        this.g = this.h;
        this.h = this.i;
        this.i = this.j;
        int i3 = this.k;
        this.j = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.k = i4;
        int i5 = this.l + 362437;
        this.l = i5;
        return i4 + i5;
    }
}
