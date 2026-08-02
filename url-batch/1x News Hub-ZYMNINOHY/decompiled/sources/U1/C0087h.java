package U1;

import java.util.Objects;

/* renamed from: U1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087h {

    /* renamed from: a, reason: collision with root package name */
    public n f1508a;

    /* renamed from: b, reason: collision with root package name */
    public String f1509b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0087h.class == obj.getClass()) {
            C0087h c0087h = (C0087h) obj;
            if (this.f1508a.equals(c0087h.f1508a) && this.f1509b.equals(c0087h.f1509b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1508a, this.f1509b);
    }
}
