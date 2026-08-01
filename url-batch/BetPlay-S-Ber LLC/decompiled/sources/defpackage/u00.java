package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class u00 {
    public final Resources a;
    public final Resources.Theme b;

    public u00(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u00.class == obj.getClass()) {
            u00 u00Var = (u00) obj;
            if (this.a.equals(u00Var.a) && Objects.equals(this.b, u00Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
