package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f1516a;

    /* renamed from: b, reason: collision with root package name */
    public D f1517b;

    /* renamed from: c, reason: collision with root package name */
    public String f1518c;

    /* renamed from: d, reason: collision with root package name */
    public String f1519d;

    /* renamed from: e, reason: collision with root package name */
    public String f1520e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f1521g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f1516a.equals(lVar.f1516a) && this.f1517b.equals(lVar.f1517b) && Objects.equals(this.f1518c, lVar.f1518c) && Objects.equals(this.f1519d, lVar.f1519d) && Objects.equals(this.f1520e, lVar.f1520e) && Objects.equals(this.f, lVar.f) && Objects.equals(this.f1521g, lVar.f1521g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1516a, this.f1517b, this.f1518c, this.f1519d, this.f1520e, this.f, this.f1521g);
    }
}
