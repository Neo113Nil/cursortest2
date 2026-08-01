package k0;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f2276a;

    /* renamed from: b, reason: collision with root package name */
    public String f2277b;

    /* renamed from: c, reason: collision with root package name */
    public List f2278c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f2276a, bVar.f2276a) && Objects.equals(this.f2277b, bVar.f2277b) && Objects.equals(this.f2278c, bVar.f2278c);
    }

    public final int hashCode() {
        return Objects.hash(this.f2276a, this.f2277b, this.f2278c);
    }
}
