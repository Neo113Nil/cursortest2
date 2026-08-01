package l3;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f5829a;

    /* renamed from: b, reason: collision with root package name */
    public String f5830b;

    /* renamed from: c, reason: collision with root package name */
    public List f5831c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f5829a, aVar.f5829a) && Objects.equals(this.f5830b, aVar.f5830b) && Objects.equals(this.f5831c, aVar.f5831c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5829a, this.f5830b, this.f5831c);
    }
}
