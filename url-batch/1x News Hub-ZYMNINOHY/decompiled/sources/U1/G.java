package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public String f1484a;

    /* renamed from: b, reason: collision with root package name */
    public String f1485b;

    /* renamed from: c, reason: collision with root package name */
    public v f1486c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G.class == obj.getClass()) {
            G g3 = (G) obj;
            if (this.f1484a.equals(g3.f1484a) && Objects.equals(this.f1485b, g3.f1485b) && this.f1486c.equals(g3.f1486c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1484a, this.f1485b, this.f1486c);
    }
}
