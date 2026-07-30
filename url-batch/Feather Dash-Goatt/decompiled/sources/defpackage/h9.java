package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h9 implements g9, j9 {
    public final float d;
    public final boolean e;
    public final Function2 g;
    public final float h;

    public h9(float f, boolean z, Function2 function2) {
        this.d = f;
        this.e = z;
        this.g = function2;
        this.h = f;
    }

    @Override // defpackage.g9, defpackage.j9
    public final float a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        return bt.a(this.d, h9Var.d) && this.e == h9Var.e && this.g.equals(h9Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + qy0.d(Float.hashCode(this.d) * 31, 31, this.e);
    }

    @Override // defpackage.j9
    public final void l(xk0 xk0Var, int i, int[] iArr, int[] iArr2) {
        m(xk0Var, i, iArr, vc0.d, iArr2);
    }

    @Override // defpackage.g9
    public final void m(xk0 xk0Var, int i, int[] iArr, vc0 vc0Var, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int H = xk0Var.H(this.d);
        if (this.e && vc0Var == vc0.e) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int min = Math.min(i2, i - i4);
                iArr2[length] = min;
                int min2 = Math.min(H, (i - min) - i4);
                int i5 = iArr2[length] + i4 + min2;
                length--;
                i3 = min2;
                i2 = i5;
            }
        } else {
            int length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int min3 = Math.min(i2, i - i8);
                iArr2[i7] = min3;
                int min4 = Math.min(H, (i - min3) - i8);
                int i9 = iArr2[i7] + i8 + min4;
                i6++;
                i3 = min4;
                i2 = i9;
                i7++;
            }
        }
        int i10 = i2 - i3;
        if (i10 < i) {
            int intValue = ((Number) this.g.b(Integer.valueOf(i - i10), vc0Var)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + intValue;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) bt.b(this.d));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
