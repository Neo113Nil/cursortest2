package D;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f138a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f139b;

    public n(Resources resources, Resources.Theme theme) {
        this.f138a = resources;
        this.f139b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f138a.equals(nVar.f138a) && Objects.equals(this.f139b, nVar.f139b);
    }

    public final int hashCode() {
        return Objects.hash(this.f138a, this.f139b);
    }
}
