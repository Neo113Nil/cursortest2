package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyl {
    public final int[][] a;
    public final int[] b;

    public dyl(int[][] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyl)) {
            return false;
        }
        dyl dylVar = (dyl) obj;
        return ksp.b(this.a, dylVar.a) && ksp.b(this.b, dylVar.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        int[] iArr = this.b;
        return "LayoutConfig(constraints=" + Arrays.toString(this.a) + ", hiddenElements=" + Arrays.toString(iArr) + ")";
    }
}
