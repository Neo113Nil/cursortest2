package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class se implements zg1 {
    public final q91 d;
    public final float e;

    public se(q91 q91Var, float f) {
        this.d = q91Var;
        this.e = f;
    }

    @Override // defpackage.zg1
    public final long c() {
        int i = hi.h;
        return hi.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return Intrinsics.a(this.d, seVar.d) && Float.compare(this.e, seVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    @Override // defpackage.zg1
    public final op j() {
        return this.d;
    }

    @Override // defpackage.zg1
    public final float k() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.d);
        sb.append(", alpha=");
        return qy0.l(sb, this.e, ')');
    }
}
