package U1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public String f1481a;

    /* renamed from: b, reason: collision with root package name */
    public String f1482b;

    /* renamed from: c, reason: collision with root package name */
    public List f1483c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f = (F) obj;
            if (Objects.equals(this.f1481a, f.f1481a) && this.f1482b.equals(f.f1482b) && this.f1483c.equals(f.f1483c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1481a, this.f1482b, this.f1483c);
    }
}
