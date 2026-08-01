package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f30a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f31b;

    public n(Resources resources, Resources.Theme theme) {
        this.f30a = resources;
        this.f31b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f30a.equals(nVar.f30a) && Objects.equals(this.f31b, nVar.f31b);
    }

    public final int hashCode() {
        return Objects.hash(this.f30a, this.f31b);
    }
}
