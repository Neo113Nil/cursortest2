package U1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public Long f1575a;

    /* renamed from: b, reason: collision with root package name */
    public Long f1576b;

    /* renamed from: c, reason: collision with root package name */
    public String f1577c;

    /* renamed from: d, reason: collision with root package name */
    public String f1578d;

    /* renamed from: e, reason: collision with root package name */
    public String f1579e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public List f1580g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f1575a.equals(xVar.f1575a) && this.f1576b.equals(xVar.f1576b) && Objects.equals(this.f1577c, xVar.f1577c) && this.f1578d.equals(xVar.f1578d) && this.f1579e.equals(xVar.f1579e) && this.f.equals(xVar.f) && this.f1580g.equals(xVar.f1580g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1575a, this.f1576b, this.f1577c, this.f1578d, this.f1579e, this.f, this.f1580g);
    }
}
