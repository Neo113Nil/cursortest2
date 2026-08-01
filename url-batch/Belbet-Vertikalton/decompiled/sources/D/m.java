package D;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f184a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f185b;

    public m(Resources resources, Resources.Theme theme) {
        this.f184a = resources;
        this.f185b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f184a.equals(mVar.f184a) && Objects.equals(this.f185b, mVar.f185b);
    }

    public final int hashCode() {
        return Objects.hash(this.f184a, this.f185b);
    }
}
