package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f46a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f47b;

    public m(Resources resources, Resources.Theme theme) {
        this.f46a = resources;
        this.f47b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f46a.equals(mVar.f46a) && Objects.equals(this.f47b, mVar.f47b);
    }

    public final int hashCode() {
        return Objects.hash(this.f46a, this.f47b);
    }
}
