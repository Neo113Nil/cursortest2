package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public String f1841a;

    /* renamed from: b, reason: collision with root package name */
    public String f1842b;

    /* renamed from: c, reason: collision with root package name */
    public z f1843c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k3 = (K) obj;
        return this.f1841a.equals(k3.f1841a) && Objects.equals(this.f1842b, k3.f1842b) && this.f1843c.equals(k3.f1843c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1841a, this.f1842b, this.f1843c);
    }
}
