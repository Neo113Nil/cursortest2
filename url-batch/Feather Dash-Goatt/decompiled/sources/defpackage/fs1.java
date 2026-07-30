package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fs1 {
    public final h8 a;
    public final vx b;

    public /* synthetic */ fs1(h8 h8Var, vx vxVar) {
        this.a = h8Var;
        this.b = vxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fs1)) {
            return false;
        }
        fs1 fs1Var = (fs1) obj;
        return xa0.m(this.a, fs1Var.a) && xa0.m(this.b, fs1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        yw ywVar = new yw(this);
        ywVar.g(this.a, "key");
        ywVar.g(this.b, "feature");
        return ywVar.toString();
    }
}
