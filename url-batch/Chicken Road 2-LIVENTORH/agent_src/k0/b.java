package k0;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f2128a;

    /* renamed from: b, reason: collision with root package name */
    public String f2129b;

    /* renamed from: c, reason: collision with root package name */
    public List f2130c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f2128a, bVar.f2128a) && Objects.equals(this.f2129b, bVar.f2129b) && Objects.equals(this.f2130c, bVar.f2130c);
    }

    public final int hashCode() {
        return Objects.hash(this.f2128a, this.f2129b, this.f2130c);
    }
}
