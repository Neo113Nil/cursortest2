package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f32a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f33b;

    public n(Resources resources, Resources.Theme theme) {
        this.f32a = resources;
        this.f33b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f32a.equals(nVar.f32a) && Objects.equals(this.f33b, nVar.f33b);
    }

    public final int hashCode() {
        return Objects.hash(this.f32a, this.f33b);
    }
}
