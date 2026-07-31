package H0;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f2606a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2608c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2609d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2610e;

    public r(q qVar, k kVar, int i3, int i4, Object obj) {
        this.f2606a = qVar;
        this.f2607b = kVar;
        this.f2608c = i3;
        this.f2609d = i4;
        this.f2610e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return f2.j.a(this.f2606a, rVar.f2606a) && f2.j.a(this.f2607b, rVar.f2607b) && i.a(this.f2608c, rVar.f2608c) && j.a(this.f2609d, rVar.f2609d) && f2.j.a(this.f2610e, rVar.f2610e);
    }

    public final int hashCode() {
        q qVar = this.f2606a;
        int a3 = AbstractC0625j.a(this.f2609d, AbstractC0625j.a(this.f2608c, (((qVar == null ? 0 : qVar.hashCode()) * 31) + this.f2607b.f2601d) * 31, 31), 31);
        Object obj = this.f2610e;
        return a3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f2606a);
        sb.append(", fontWeight=");
        sb.append(this.f2607b);
        sb.append(", fontStyle=");
        int i3 = this.f2608c;
        sb.append((Object) (i.a(i3, 0) ? "Normal" : i.a(i3, 1) ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        sb.append((Object) j.b(this.f2609d));
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f2610e);
        sb.append(')');
        return sb.toString();
    }
}
