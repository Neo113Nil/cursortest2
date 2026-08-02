package X1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1729a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return this.f1729a.equals(((a) obj).f1729a);
    }

    public final int hashCode() {
        return Objects.hash(this.f1729a);
    }
}
