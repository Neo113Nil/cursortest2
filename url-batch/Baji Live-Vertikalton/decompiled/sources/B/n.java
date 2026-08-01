package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f35a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f36b;

    public n(Resources resources, Resources.Theme theme) {
        this.f35a = resources;
        this.f36b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f35a.equals(nVar.f35a) && Objects.equals(this.f36b, nVar.f36b);
    }

    public final int hashCode() {
        return Objects.hash(this.f35a, this.f36b);
    }
}
