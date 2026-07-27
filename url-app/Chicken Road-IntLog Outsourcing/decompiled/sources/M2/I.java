package M2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public String f1832a;

    /* renamed from: b, reason: collision with root package name */
    public String f1833b;

    /* renamed from: c, reason: collision with root package name */
    public String f1834c;

    /* renamed from: d, reason: collision with root package name */
    public List f1835d;

    /* renamed from: e, reason: collision with root package name */
    public List f1836e;

    /* renamed from: f, reason: collision with root package name */
    public s f1837f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        I i2 = (I) obj;
        return this.f1832a.equals(i2.f1832a) && Objects.equals(this.f1833b, i2.f1833b) && this.f1834c.equals(i2.f1834c) && this.f1835d.equals(i2.f1835d) && this.f1836e.equals(i2.f1836e) && Objects.equals(this.f1837f, i2.f1837f);
    }

    public final int hashCode() {
        return Objects.hash(this.f1832a, this.f1833b, this.f1834c, this.f1835d, this.f1836e, this.f1837f);
    }
}
