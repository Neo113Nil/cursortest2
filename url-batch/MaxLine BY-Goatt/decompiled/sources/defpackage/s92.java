package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s92 {
    public final Resources a;
    public final Resources.Theme b;

    public s92(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s92.class == obj.getClass()) {
            s92 s92Var = (s92) obj;
            if (this.a.equals(s92Var.a) && Objects.equals(this.b, s92Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
