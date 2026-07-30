package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yh implements xh, zh {
    public final float m;
    public final boolean n;
    public final Function2 o;
    public final float p;

    public yh(float f, boolean z, sc scVar) {
        this.m = f;
        this.n = z;
        this.o = scVar;
        this.p = f;
    }

    @Override // defpackage.xh, defpackage.zh
    public final float a() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh)) {
            return false;
        }
        yh yhVar = (yh) obj;
        return pc0.a(this.m, yhVar.m) && this.n == yhVar.n && Intrinsics.b(this.o, yhVar.o);
    }

    @Override // defpackage.xh
    public final void f(ca0 ca0Var, int i, int[] iArr, u81 u81Var, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int R = ca0Var.R(this.m);
        if (this.n && u81Var == u81.n) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int min = Math.min(i2, i - i4);
                iArr2[length] = min;
                int min2 = Math.min(R, (i - min) - i4);
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
                int min4 = Math.min(R, (i - min3) - i8);
                int i9 = iArr2[i7] + i8 + min4;
                i6++;
                i3 = min4;
                i2 = i9;
                i7++;
            }
        }
        int i10 = i2 - i3;
        Function2 function2 = this.o;
        if (function2 == null || i10 >= i) {
            return;
        }
        int intValue = ((Number) function2.invoke(Integer.valueOf(i - i10), u81Var)).intValue();
        int length3 = iArr2.length;
        for (int i11 = 0; i11 < length3; i11++) {
            iArr2[i11] = iArr2[i11] + intValue;
        }
    }

    public final int hashCode() {
        int i = in1.i(Float.hashCode(this.m) * 31, 31, this.n);
        Function2 function2 = this.o;
        return i + (function2 == null ? 0 : function2.hashCode());
    }

    @Override // defpackage.zh
    public final void i(ca0 ca0Var, int i, int[] iArr, int[] iArr2) {
        f(ca0Var, i, iArr, u81.m, iArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.n ? BuildConfig.FLAVOR : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) pc0.b(this.m));
        sb.append(", ");
        sb.append(this.o);
        sb.append(')');
        return sb.toString();
    }
}
