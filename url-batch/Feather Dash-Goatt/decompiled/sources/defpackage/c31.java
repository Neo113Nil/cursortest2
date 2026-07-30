package defpackage;

import com.feathherdashh.dashgame.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class c31 {
    public final x20 a;
    public final w20 b;

    public c31(x20 x20Var, w20 w20Var) {
        this.a = x20Var;
        this.b = w20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c31)) {
            return false;
        }
        c31 c31Var = (c31) obj;
        return Intrinsics.a(this.a, c31Var.a) && this.b.equals(c31Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + qy0.c(0, qy0.c(0, ((R.font.brlnsdb * 31) + this.a.d) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n = qy0.n("ResourceFont(resId=", R.font.brlnsdb, ", weight=");
        n.append(this.a);
        n.append(", style=");
        n.append((Object) "Normal");
        n.append(", loadingStrategy=Blocking)");
        return n.toString();
    }
}
