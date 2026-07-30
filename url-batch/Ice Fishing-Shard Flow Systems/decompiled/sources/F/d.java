package F;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f719a;

    /* renamed from: b, reason: collision with root package name */
    public String f720b;

    /* renamed from: c, reason: collision with root package name */
    public List f721c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f719a, dVar.f719a) && Objects.equals(this.f720b, dVar.f720b) && Objects.equals(this.f721c, dVar.f721c);
    }

    public final int hashCode() {
        return Objects.hash(this.f719a, this.f720b, this.f721c);
    }
}
