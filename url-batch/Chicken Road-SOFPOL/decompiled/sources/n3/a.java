package n3;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f5334a;

    /* renamed from: b, reason: collision with root package name */
    public String f5335b;

    /* renamed from: c, reason: collision with root package name */
    public List f5336c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f5334a, aVar.f5334a) && Objects.equals(this.f5335b, aVar.f5335b) && Objects.equals(this.f5336c, aVar.f5336c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5334a, this.f5335b, this.f5336c);
    }
}
