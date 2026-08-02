package U1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public Long f1545a;

    /* renamed from: b, reason: collision with root package name */
    public C f1546b;

    /* renamed from: c, reason: collision with root package name */
    public Long f1547c;

    /* renamed from: d, reason: collision with root package name */
    public String f1548d;

    /* renamed from: e, reason: collision with root package name */
    public String f1549e;
    public String f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f1545a.equals(sVar.f1545a) && this.f1546b.equals(sVar.f1546b) && this.f1547c.equals(sVar.f1547c) && this.f1548d.equals(sVar.f1548d) && this.f1549e.equals(sVar.f1549e) && this.f.equals(sVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1545a, this.f1546b, this.f1547c, this.f1548d, this.f1549e, this.f);
    }
}
