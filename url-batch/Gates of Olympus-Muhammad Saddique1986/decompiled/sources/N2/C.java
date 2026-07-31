package N2;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public int f3577a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3578b = new int[10];

    public final int a() {
        if ((this.f3577a & 128) != 0) {
            return this.f3578b[7];
        }
        return 65535;
    }

    public final void b(C c2) {
        f2.j.f(c2, "other");
        for (int i3 = 0; i3 < 10; i3++) {
            if (((1 << i3) & c2.f3577a) != 0) {
                c(i3, c2.f3578b[i3]);
            }
        }
    }

    public final void c(int i3, int i4) {
        if (i3 >= 0) {
            int[] iArr = this.f3578b;
            if (i3 >= iArr.length) {
                return;
            }
            this.f3577a = (1 << i3) | this.f3577a;
            iArr[i3] = i4;
        }
    }
}
