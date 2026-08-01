package g3;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f4255a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f4256b;

    public i(Resources resources, Resources.Theme theme) {
        this.f4255a = resources;
        this.f4256b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f4255a.equals(iVar.f4255a) && Objects.equals(this.f4256b, iVar.f4256b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f4255a, this.f4256b);
    }
}
