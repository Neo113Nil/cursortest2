package defpackage;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xf1 extends q91 {
    public final ArrayList v;
    public final ArrayList w;

    public xf1(ArrayList arrayList, ArrayList arrayList2) {
        this.v = arrayList;
        this.w = arrayList2;
    }

    @Override // defpackage.q91
    public final Shader T(long j) {
        float[] fArr;
        long q = t90.q(j);
        ArrayList arrayList = this.v;
        ArrayList arrayList2 = this.w;
        uq1.U(arrayList, arrayList2);
        float intBitsToFloat = Float.intBitsToFloat((int) (q >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (q & 4294967295L));
        int size = arrayList.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = la0.W(((hi) arrayList.get(i2)).a);
        }
        if (arrayList2 != null) {
            fArr = new float[arrayList2.size()];
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList2.get(i3);
                i3++;
                fArr[i] = ((Number) obj).floatValue();
                i++;
            }
        } else {
            fArr = null;
        }
        return new SweepGradient(intBitsToFloat, intBitsToFloat2, iArr, fArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf1)) {
            return false;
        }
        xf1 xf1Var = (xf1) obj;
        return wq0.b(9205357640488583168L, 9205357640488583168L) && this.v.equals(xf1Var.v) && this.w.equals(xf1Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.v.hashCode() + (Long.hashCode(9205357640488583168L) * 31)) * 31);
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.v + ", stops=" + this.w + ')';
    }
}
