package U5;

/* loaded from: classes.dex */
public final class r extends B {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2665f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2666g;

    public r(String body, boolean z5) {
        kotlin.jvm.internal.i.e(body, "body");
        this.f2665f = z5;
        this.f2666g = body.toString();
    }

    @Override // U5.B
    public final String a() {
        return this.f2666g;
    }

    @Override // U5.B
    public final boolean b() {
        return this.f2665f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f2665f == rVar.f2665f && kotlin.jvm.internal.i.a(this.f2666g, rVar.f2666g);
    }

    public final int hashCode() {
        return this.f2666g.hashCode() + (Boolean.hashCode(this.f2665f) * 31);
    }

    @Override // U5.B
    public final String toString() {
        boolean z5 = this.f2665f;
        String str = this.f2666g;
        if (!z5) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        V5.v.a(sb, str);
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }
}
