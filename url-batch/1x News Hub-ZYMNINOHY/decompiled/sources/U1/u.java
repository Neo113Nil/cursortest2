package U1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public n f1556a;

    /* renamed from: b, reason: collision with root package name */
    public List f1557b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f1556a.equals(uVar.f1556a) && this.f1557b.equals(uVar.f1557b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1556a, this.f1557b);
    }
}
