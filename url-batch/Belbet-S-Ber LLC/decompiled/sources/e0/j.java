package e0;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f1335a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1336b;

    public j(Resources resources, Resources.Theme theme) {
        this.f1335a = resources;
        this.f1336b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f1335a.equals(jVar.f1335a) && Objects.equals(this.f1336b, jVar.f1336b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1335a, this.f1336b);
    }
}
