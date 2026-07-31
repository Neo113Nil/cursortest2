package H2;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public int f1925a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1926b = new int[10];

    public final int a() {
        if ((this.f1925a & 128) != 0) {
            return this.f1926b[7];
        }
        return 65535;
    }

    public final void b(C c3) {
        Z1.i.f(c3, "other");
        for (int i3 = 0; i3 < 10; i3++) {
            if (((1 << i3) & c3.f1925a) != 0) {
                c(i3, c3.f1926b[i3]);
            }
        }
    }

    public final void c(int i3, int i4) {
        if (i3 >= 0) {
            int[] iArr = this.f1926b;
            if (i3 >= iArr.length) {
                return;
            }
            this.f1925a = (1 << i3) | this.f1925a;
            iArr[i3] = i4;
        }
    }
}
