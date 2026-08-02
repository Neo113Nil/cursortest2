package s;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: s.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301l {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f3419a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f3420b;

    public C0301l(Resources resources, Resources.Theme theme) {
        this.f3419a = resources;
        this.f3420b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0301l.class != obj.getClass()) {
            return false;
        }
        C0301l c0301l = (C0301l) obj;
        return this.f3419a.equals(c0301l.f3419a) && Objects.equals(this.f3420b, c0301l.f3420b);
    }

    public final int hashCode() {
        return Objects.hash(this.f3419a, this.f3420b);
    }
}
