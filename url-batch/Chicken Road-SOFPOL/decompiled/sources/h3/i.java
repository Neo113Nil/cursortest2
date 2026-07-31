package h3;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f3146b;

    public i(Resources resources, Resources.Theme theme) {
        this.f3145a = resources;
        this.f3146b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f3145a.equals(iVar.f3145a) && Objects.equals(this.f3146b, iVar.f3146b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3145a, this.f3146b);
    }
}
