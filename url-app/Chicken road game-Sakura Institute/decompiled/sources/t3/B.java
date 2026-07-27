package t3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public int f10745a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10746b = new int[10];

    public final int a() {
        if ((this.f10745a & 128) != 0) {
            return this.f10746b[7];
        }
        return 65535;
    }

    public final void b(B other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (((1 << i2) & other.f10745a) != 0) {
                c(i2, other.f10746b[i2]);
            }
        }
    }

    public final void c(int i2, int i4) {
        if (i2 >= 0) {
            int[] iArr = this.f10746b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f10745a = (1 << i2) | this.f10745a;
            iArr[i2] = i4;
        }
    }
}
