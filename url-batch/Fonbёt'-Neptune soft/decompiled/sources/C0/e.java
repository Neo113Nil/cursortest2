package C0;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f223a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f224b;

    /* renamed from: c, reason: collision with root package name */
    public Map f225c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f223a.equals(eVar.f223a) && this.f224b.equals(eVar.f224b) && this.f225c.equals(eVar.f225c);
    }

    public final int hashCode() {
        return Objects.hash(this.f223a, this.f224b, this.f225c);
    }
}
