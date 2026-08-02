package U1;

import java.util.Objects;

/* renamed from: U1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086g {

    /* renamed from: a, reason: collision with root package name */
    public String f1506a;

    /* renamed from: b, reason: collision with root package name */
    public String f1507b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0086g.class == obj.getClass()) {
            C0086g c0086g = (C0086g) obj;
            if (Objects.equals(this.f1506a, c0086g.f1506a) && Objects.equals(this.f1507b, c0086g.f1507b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1506a, this.f1507b);
    }
}
