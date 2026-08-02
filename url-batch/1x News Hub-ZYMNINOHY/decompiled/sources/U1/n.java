package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public m f1535a;

    /* renamed from: b, reason: collision with root package name */
    public String f1536b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f1535a.equals(nVar.f1535a) && this.f1536b.equals(nVar.f1536b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1535a, this.f1536b);
    }
}
