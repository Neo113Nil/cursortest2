package M2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public String f1838a;

    /* renamed from: b, reason: collision with root package name */
    public String f1839b;

    /* renamed from: c, reason: collision with root package name */
    public List f1840c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j2 = (J) obj;
        return Objects.equals(this.f1838a, j2.f1838a) && this.f1839b.equals(j2.f1839b) && this.f1840c.equals(j2.f1840c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1838a, this.f1839b, this.f1840c);
    }
}
