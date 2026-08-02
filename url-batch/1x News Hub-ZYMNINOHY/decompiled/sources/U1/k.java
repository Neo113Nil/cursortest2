package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public n f1514a;

    /* renamed from: b, reason: collision with root package name */
    public String f1515b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f1514a.equals(kVar.f1514a) && this.f1515b.equals(kVar.f1515b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1514a, this.f1515b);
    }
}
