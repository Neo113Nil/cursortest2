package X1;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1734a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f1735b;

    /* renamed from: c, reason: collision with root package name */
    public Map f1736c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f1734a.equals(eVar.f1734a) && this.f1735b.equals(eVar.f1735b) && this.f1736c.equals(eVar.f1736c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1734a, this.f1735b, this.f1736c);
    }
}
