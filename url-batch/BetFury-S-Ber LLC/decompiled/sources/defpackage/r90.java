package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class r90 {
    public final Resources a;
    public final Resources.Theme b;

    public r90(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r90.class == obj.getClass()) {
            r90 r90Var = (r90) obj;
            if (this.a.equals(r90Var.a) && Objects.equals(this.b, r90Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
