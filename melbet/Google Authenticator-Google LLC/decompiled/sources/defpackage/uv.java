package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uv {
    public final Resources a;
    public final Resources.Theme b;

    public uv(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            uv uvVar = (uv) obj;
            if (this.a.equals(uvVar.a) && Objects.equals(this.b, uvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
