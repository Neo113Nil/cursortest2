package u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7333a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7334b = true;

    /* renamed from: c, reason: collision with root package name */
    public final q f7335c = q.f7347d;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7336d = true;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7337e = true;

    /* renamed from: f, reason: collision with root package name */
    public final String f7338f = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f7333a == oVar.f7333a && this.f7334b == oVar.f7334b && this.f7335c == oVar.f7335c && this.f7336d == oVar.f7336d && this.f7337e == oVar.f7337e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7337e) + a0.q.d((this.f7335c.hashCode() + a0.q.d(Boolean.hashCode(this.f7333a) * 31, 31, this.f7334b)) * 31, 31, this.f7336d);
    }
}
