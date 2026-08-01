package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f41a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f42b;

    public n(Resources resources, Resources.Theme theme) {
        this.f41a = resources;
        this.f42b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f41a.equals(nVar.f41a) && Objects.equals(this.f42b, nVar.f42b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41a, this.f42b);
    }
}
