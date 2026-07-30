package K6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f1487a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1488b = new int[10];

    public final int a() {
        if ((this.f1487a & 16) != 0) {
            return this.f1488b[4];
        }
        return 65535;
    }

    public final void b(E other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (((1 << i2) & other.f1487a) != 0) {
                c(i2, other.f1488b[i2]);
            }
        }
    }

    public final void c(int i2, int i5) {
        if (i2 >= 0) {
            int[] iArr = this.f1488b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f1487a = (1 << i2) | this.f1487a;
            iArr[i2] = i5;
        }
    }
}
