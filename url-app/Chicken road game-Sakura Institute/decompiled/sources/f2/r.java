package f2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f3285a;

    /* renamed from: b, reason: collision with root package name */
    public final k f3286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3287c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3288d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3289e;

    public r(q qVar, k kVar, int i7, int i8, Object obj) {
        this.f3285a = qVar;
        this.f3286b = kVar;
        this.f3287c = i7;
        this.f3288d = i8;
        this.f3289e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return r6.k.a(this.f3285a, rVar.f3285a) && r6.k.a(this.f3286b, rVar.f3286b) && this.f3287c == rVar.f3287c && this.f3288d == rVar.f3288d && r6.k.a(this.f3289e, rVar.f3289e);
    }

    public final int hashCode() {
        q qVar = this.f3285a;
        int c4 = l.h.c(this.f3288d, l.h.c(this.f3287c, (((qVar == null ? 0 : qVar.hashCode()) * 31) + this.f3286b.f3280f) * 31, 31), 31);
        Object obj = this.f3289e;
        return c4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f3285a);
        sb.append(", fontWeight=");
        sb.append(this.f3286b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i7 = this.f3287c;
        sb.append((Object) (i7 == 0 ? "Normal" : i7 == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i8 = this.f3288d;
        if (i8 == 0) {
            str = "None";
        } else if (i8 == 1) {
            str = "All";
        } else if (i8 == 2) {
            str = "Weight";
        } else if (i8 == 3) {
            str = "Style";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f3289e);
        sb.append(')');
        return sb.toString();
    }
}
