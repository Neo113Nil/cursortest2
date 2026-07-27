package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public Long f1919a;

    /* renamed from: b, reason: collision with root package name */
    public G f1920b;

    /* renamed from: c, reason: collision with root package name */
    public Long f1921c;

    /* renamed from: d, reason: collision with root package name */
    public String f1922d;

    /* renamed from: e, reason: collision with root package name */
    public String f1923e;

    /* renamed from: f, reason: collision with root package name */
    public String f1924f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f1919a.equals(wVar.f1919a) && this.f1920b.equals(wVar.f1920b) && this.f1921c.equals(wVar.f1921c) && this.f1922d.equals(wVar.f1922d) && this.f1923e.equals(wVar.f1923e) && this.f1924f.equals(wVar.f1924f);
    }

    public final int hashCode() {
        return Objects.hash(this.f1919a, this.f1920b, this.f1921c, this.f1922d, this.f1923e, this.f1924f);
    }
}
