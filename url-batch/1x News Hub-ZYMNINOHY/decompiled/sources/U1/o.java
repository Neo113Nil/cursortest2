package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public Long f1537a;

    /* renamed from: b, reason: collision with root package name */
    public Long f1538b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f1537a.equals(oVar.f1537a) && this.f1538b.equals(oVar.f1538b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1537a, this.f1538b);
    }
}
