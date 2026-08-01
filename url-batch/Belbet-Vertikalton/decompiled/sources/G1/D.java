package G1;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f345a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f346b = new int[10];

    public final int a() {
        if ((this.f345a & 128) != 0) {
            return this.f346b[7];
        }
        return 65535;
    }

    public final void b(D d2) {
        j1.h.e(d2, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & d2.f345a) != 0) {
                c(i, d2.f346b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f346b;
            if (i >= iArr.length) {
                return;
            }
            this.f345a = (1 << i) | this.f345a;
            iArr[i] = i2;
        }
    }
}
