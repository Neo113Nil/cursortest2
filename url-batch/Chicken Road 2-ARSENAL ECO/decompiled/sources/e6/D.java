package e6;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f4034a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4035b = new int[10];

    public final int a() {
        if ((this.f4034a & 16) != 0) {
            return this.f4035b[4];
        }
        return 65535;
    }

    public final void b(D other) {
        kotlin.jvm.internal.i.e(other, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            if (((1 << i7) & other.f4034a) != 0) {
                c(i7, other.f4035b[i7]);
            }
        }
    }

    public final void c(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f4035b;
            if (i7 >= iArr.length) {
                return;
            }
            this.f4034a = (1 << i7) | this.f4034a;
            iArr[i7] = i8;
        }
    }
}
