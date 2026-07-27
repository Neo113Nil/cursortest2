package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public String f1822a;

    /* renamed from: b, reason: collision with root package name */
    public z f1823b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f3 = (F) obj;
        return this.f1822a.equals(f3.f1822a) && this.f1823b.equals(f3.f1823b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1822a, this.f1823b);
    }
}
