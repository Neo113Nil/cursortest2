package p7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends z {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7233f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, boolean z8) {
        super(null);
        r6.k.f(str, "body");
        this.f7233f = z8;
        this.f7234g = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f7233f == pVar.f7233f && r6.k.a(this.f7234g, pVar.f7234g);
    }

    @Override // p7.z
    public final String getContent() {
        return this.f7234g;
    }

    public final int hashCode() {
        return this.f7234g.hashCode() + (Boolean.hashCode(this.f7233f) * 31);
    }

    @Override // p7.z
    public final boolean isString() {
        return this.f7233f;
    }

    @Override // p7.z
    public final String toString() {
        boolean z8 = this.f7233f;
        String str = this.f7234g;
        if (!z8) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        q7.m.a(sb, str);
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString(...)");
        return sb2;
    }
}
