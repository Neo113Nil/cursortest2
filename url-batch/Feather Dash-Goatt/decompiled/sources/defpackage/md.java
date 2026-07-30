package defpackage;

import android.graphics.BlendModeColorFilter;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class md {
    public final BlendModeColorFilter a;
    public final long b;
    public final int c;

    public md(int i, long j) {
        this.a = new BlendModeColorFilter(la0.W(j), op.O(i));
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        return hi.c(this.b, mdVar.b) && this.c == mdVar.c;
    }

    public final int hashCode() {
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        qy0.r(this.b, sb, ", blendMode=");
        sb.append((Object) m90.N(this.c));
        sb.append(')');
        return sb.toString();
    }
}
