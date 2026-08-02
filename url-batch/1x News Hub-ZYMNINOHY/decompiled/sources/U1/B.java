package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public String f1466a;

    /* renamed from: b, reason: collision with root package name */
    public v f1467b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b3 = (B) obj;
            if (this.f1466a.equals(b3.f1466a) && this.f1467b.equals(b3.f1467b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1466a, this.f1467b);
    }
}
