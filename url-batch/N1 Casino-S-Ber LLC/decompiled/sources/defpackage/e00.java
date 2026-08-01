package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class e00 {
    public final Resources a;
    public final Resources.Theme b;

    public e00(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e00.class == obj.getClass()) {
            e00 e00Var = (e00) obj;
            if (this.a.equals(e00Var.a) && Objects.equals(this.b, e00Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
