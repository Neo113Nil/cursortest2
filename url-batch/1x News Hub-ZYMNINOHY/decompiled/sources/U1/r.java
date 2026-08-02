package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1544a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return this.f1544a.equals(((r) obj).f1544a);
    }

    public final int hashCode() {
        return Objects.hash(this.f1544a);
    }
}
