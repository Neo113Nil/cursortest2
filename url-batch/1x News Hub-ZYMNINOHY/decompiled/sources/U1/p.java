package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public Long f1539a;

    /* renamed from: b, reason: collision with root package name */
    public String f1540b;

    /* renamed from: c, reason: collision with root package name */
    public String f1541c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f1539a.equals(pVar.f1539a) && this.f1540b.equals(pVar.f1540b) && this.f1541c.equals(pVar.f1541c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1539a, this.f1540b, this.f1541c);
    }
}
