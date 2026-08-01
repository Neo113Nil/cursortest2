package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class j30 {
    public final Resources a;
    public final Resources.Theme b;

    public j30(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j30.class == obj.getClass()) {
            j30 j30Var = (j30) obj;
            if (this.a.equals(j30Var.a) && Objects.equals(this.b, j30Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
