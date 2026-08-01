package b0;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f713a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f714b;

    public j(Resources resources, Resources.Theme theme) {
        this.f713a = resources;
        this.f714b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f713a.equals(jVar.f713a) && Objects.equals(this.f714b, jVar.f714b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f713a, this.f714b);
    }
}
