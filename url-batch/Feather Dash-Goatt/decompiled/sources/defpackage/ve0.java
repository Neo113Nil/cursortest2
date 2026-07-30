package defpackage;

import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ve0 implements yd1 {
    public final av0 d;
    public int e;

    public ve0(int i) {
        int i2 = (i / 30) * 30;
        this.d = new av0(b11.g(Math.max(i2 - 100, 0), i2 + 130), j41.o);
        this.e = i;
    }

    @Override // defpackage.yd1
    public final Object getValue() {
        return (IntRange) this.d.getValue();
    }
}
