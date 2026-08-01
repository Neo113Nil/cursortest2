package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f61a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f62b;

    public n(Resources resources, Resources.Theme theme) {
        this.f61a = resources;
        this.f62b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f61a.equals(nVar.f61a) && Objects.equals(this.f62b, nVar.f62b);
    }

    public final int hashCode() {
        return Objects.hash(this.f61a, this.f62b);
    }
}
