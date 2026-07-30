package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ja0 {
    public final int a;
    public final int b;
    public final yw c;

    public ja0(int i, int i2, yw ywVar) {
        this.a = i;
        this.b = i2;
        this.c = ywVar;
        if (i < 0) {
            r80.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        r80.a("size should be > 0");
    }
}
