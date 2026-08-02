package C0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f218a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return this.f218a.equals(((a) obj).f218a);
    }

    public final int hashCode() {
        return Objects.hash(this.f218a);
    }
}
