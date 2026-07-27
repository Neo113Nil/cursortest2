package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public q f1909a;

    /* renamed from: b, reason: collision with root package name */
    public String f1910b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f1909a.equals(rVar.f1909a) && this.f1910b.equals(rVar.f1910b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1909a, this.f1910b);
    }
}
