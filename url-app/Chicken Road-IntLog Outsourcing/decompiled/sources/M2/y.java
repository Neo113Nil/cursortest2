package M2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public r f1932a;

    /* renamed from: b, reason: collision with root package name */
    public List f1933b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f1932a.equals(yVar.f1932a) && this.f1933b.equals(yVar.f1933b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1932a, this.f1933b);
    }
}
