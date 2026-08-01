package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f36a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f37b;

    public n(Resources resources, Resources.Theme theme) {
        this.f36a = resources;
        this.f37b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f36a.equals(nVar.f36a) && Objects.equals(this.f37b, nVar.f37b);
    }

    public final int hashCode() {
        return Objects.hash(this.f36a, this.f37b);
    }
}
