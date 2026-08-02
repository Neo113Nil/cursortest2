package U1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public String f1476a;

    /* renamed from: b, reason: collision with root package name */
    public String f1477b;

    /* renamed from: c, reason: collision with root package name */
    public String f1478c;

    /* renamed from: d, reason: collision with root package name */
    public List f1479d;

    /* renamed from: e, reason: collision with root package name */
    public List f1480e;
    public o f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e3 = (E) obj;
            if (this.f1476a.equals(e3.f1476a) && Objects.equals(this.f1477b, e3.f1477b) && this.f1478c.equals(e3.f1478c) && this.f1479d.equals(e3.f1479d) && this.f1480e.equals(e3.f1480e) && Objects.equals(this.f, e3.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1476a, this.f1477b, this.f1478c, this.f1479d, this.f1480e, this.f);
    }
}
