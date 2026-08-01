package G1;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f363a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f364b = new int[10];

    public final int a() {
        if ((this.f363a & 128) != 0) {
            return this.f364b[7];
        }
        return 65535;
    }

    public final void b(D d) {
        k1.e.e(d, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & d.f363a) != 0) {
                c(i, d.f364b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f364b;
            if (i >= iArr.length) {
                return;
            }
            this.f363a = (1 << i) | this.f363a;
            iArr[i] = i2;
        }
    }
}
