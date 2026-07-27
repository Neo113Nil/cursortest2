package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1918a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        return this.f1918a.equals(((v) obj).f1918a);
    }

    public final int hashCode() {
        return Objects.hash(this.f1918a);
    }
}
