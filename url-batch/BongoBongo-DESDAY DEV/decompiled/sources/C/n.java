package C;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f91a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f92b;

    public n(Resources resources, Resources.Theme theme) {
        this.f91a = resources;
        this.f92b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f91a.equals(nVar.f91a) && Objects.equals(this.f92b, nVar.f92b);
    }

    public final int hashCode() {
        return Objects.hash(this.f91a, this.f92b);
    }
}
