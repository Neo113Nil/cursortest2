package H;

import java.util.Objects;
import u0.t;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f869a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f870b;

    public b(String str, t tVar) {
        this.f869a = str;
        this.f870b = tVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f869a, this.f869a) && Objects.equals(bVar.f870b, this.f870b);
    }

    public final int hashCode() {
        Object obj = this.f869a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f870b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f869a + " " + this.f870b + "}";
    }
}
