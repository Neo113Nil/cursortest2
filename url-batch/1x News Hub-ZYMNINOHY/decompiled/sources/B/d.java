package B;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f79a;

    /* renamed from: b, reason: collision with root package name */
    public String f80b;

    /* renamed from: c, reason: collision with root package name */
    public List f81c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f79a, dVar.f79a) && Objects.equals(this.f80b, dVar.f80b) && Objects.equals(this.f81c, dVar.f81c);
    }

    public final int hashCode() {
        return Objects.hash(this.f79a, this.f80b, this.f81c);
    }
}
