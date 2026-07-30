package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h8 {
    public final int a;
    public final yw b;
    public final sg1 c;
    public final String d;

    public h8(yw ywVar, sg1 sg1Var, String str) {
        this.b = ywVar;
        this.c = sg1Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{ywVar, sg1Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return xa0.m(this.b, h8Var.b) && xa0.m(this.c, h8Var.c) && xa0.m(this.d, h8Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
