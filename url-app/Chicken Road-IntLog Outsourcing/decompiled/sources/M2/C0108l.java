package M2;

import java.util.Objects;

/* renamed from: M2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108l {

    /* renamed from: a, reason: collision with root package name */
    public r f1880a;

    /* renamed from: b, reason: collision with root package name */
    public String f1881b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0108l.class != obj.getClass()) {
            return false;
        }
        C0108l c0108l = (C0108l) obj;
        return this.f1880a.equals(c0108l.f1880a) && this.f1881b.equals(c0108l.f1881b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1880a, this.f1881b);
    }
}
