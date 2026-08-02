package B;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f151a;

    /* renamed from: b, reason: collision with root package name */
    public String f152b;

    /* renamed from: c, reason: collision with root package name */
    public List f153c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f151a, dVar.f151a) && Objects.equals(this.f152b, dVar.f152b) && Objects.equals(this.f153c, dVar.f153c);
    }

    public final int hashCode() {
        return Objects.hash(this.f151a, this.f152b, this.f153c);
    }
}
