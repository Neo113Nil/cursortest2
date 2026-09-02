package e0;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f1153a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1154b;

    public j(Resources resources, Resources.Theme theme) {
        this.f1153a = resources;
        this.f1154b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f1153a.equals(jVar.f1153a) && Objects.equals(this.f1154b, jVar.f1154b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1153a, this.f1154b);
    }
}
