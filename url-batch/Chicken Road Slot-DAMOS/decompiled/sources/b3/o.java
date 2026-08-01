package b3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1075b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1076c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1077d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1078e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1079f;
    public final int g;

    public o() {
        r rVar = r.f1090d;
        this.f1074a = true;
        this.f1075b = true;
        this.f1076c = rVar;
        this.f1077d = true;
        this.f1078e = true;
        this.f1079f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f1074a == oVar.f1074a && this.f1075b == oVar.f1075b && this.f1076c == oVar.f1076c && this.f1077d == oVar.f1077d && this.f1078e == oVar.f1078e && this.g == oVar.g;
    }

    public final int hashCode() {
        return (n0.l.d(n0.l.d((this.f1076c.hashCode() + n0.l.d(Boolean.hashCode(this.f1074a) * 31, 31, this.f1075b)) * 31, 31, this.f1077d), 31, this.f1078e) + this.g) * 31;
    }
}
