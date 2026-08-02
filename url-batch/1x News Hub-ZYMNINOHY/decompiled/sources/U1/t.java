package U1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public String f1550a;

    /* renamed from: b, reason: collision with root package name */
    public String f1551b;

    /* renamed from: c, reason: collision with root package name */
    public String f1552c;

    /* renamed from: d, reason: collision with root package name */
    public v f1553d;

    /* renamed from: e, reason: collision with root package name */
    public String f1554e;
    public p f;

    /* renamed from: g, reason: collision with root package name */
    public List f1555g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f1550a.equals(tVar.f1550a) && this.f1551b.equals(tVar.f1551b) && this.f1552c.equals(tVar.f1552c) && this.f1553d.equals(tVar.f1553d) && this.f1554e.equals(tVar.f1554e) && Objects.equals(this.f, tVar.f) && Objects.equals(this.f1555g, tVar.f1555g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1550a, this.f1551b, this.f1552c, this.f1553d, this.f1554e, this.f, this.f1555g);
    }
}
