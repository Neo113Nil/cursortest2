package h0;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f1975a;

    /* renamed from: b, reason: collision with root package name */
    public String f1976b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f1975a, bVar.f1975a) && Objects.equals(this.f1976b, bVar.f1976b) && Objects.equals(this.c, bVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1975a, this.f1976b, this.c);
    }
}
