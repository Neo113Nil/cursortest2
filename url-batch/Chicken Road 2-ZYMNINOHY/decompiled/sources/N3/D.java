package N3;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f1817a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1818b = new int[10];

    public final int a() {
        if ((this.f1817a & 128) != 0) {
            return this.f1818b[7];
        }
        return 65535;
    }

    public final void b(D other) {
        kotlin.jvm.internal.i.e(other, "other");
        int i4 = 0;
        while (i4 < 10) {
            int i5 = i4 + 1;
            if (((1 << i4) & other.f1817a) != 0) {
                c(i4, other.f1818b[i4]);
            }
            i4 = i5;
        }
    }

    public final void c(int i4, int i5) {
        if (i4 >= 0) {
            int[] iArr = this.f1818b;
            if (i4 >= iArr.length) {
                return;
            }
            this.f1817a = (1 << i4) | this.f1817a;
            iArr[i4] = i5;
        }
    }
}
