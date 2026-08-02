package U1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public List f1542a;

    /* renamed from: b, reason: collision with root package name */
    public String f1543b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f1542a.equals(qVar.f1542a) && this.f1543b.equals(qVar.f1543b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1542a, this.f1543b);
    }
}
