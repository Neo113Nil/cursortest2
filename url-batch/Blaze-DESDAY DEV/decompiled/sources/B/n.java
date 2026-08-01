package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f50a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f51b;

    public n(Resources resources, Resources.Theme theme) {
        this.f50a = resources;
        this.f51b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f50a.equals(nVar.f50a) && Objects.equals(this.f51b, nVar.f51b);
    }

    public final int hashCode() {
        return Objects.hash(this.f50a, this.f51b);
    }
}
