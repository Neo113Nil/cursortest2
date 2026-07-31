package j2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f4003a;

    /* renamed from: b, reason: collision with root package name */
    public final k f4004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4005c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4006d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4007e;

    public q(p pVar, k kVar, int i, int i8, Object obj) {
        this.f4003a = pVar;
        this.f4004b = kVar;
        this.f4005c = i;
        this.f4006d = i8;
        this.f4007e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return q6.i.a(this.f4003a, qVar.f4003a) && q6.i.a(this.f4004b, qVar.f4004b) && this.f4005c == qVar.f4005c && this.f4006d == qVar.f4006d && q6.i.a(this.f4007e, qVar.f4007e);
    }

    public final int hashCode() {
        p pVar = this.f4003a;
        int b8 = a0.q.b(this.f4006d, a0.q.b(this.f4005c, (((pVar == null ? 0 : pVar.hashCode()) * 31) + this.f4004b.f3998d) * 31, 31), 31);
        Object obj = this.f4007e;
        return b8 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f4003a);
        sb.append(", fontWeight=");
        sb.append(this.f4004b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f4005c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i8 = this.f4006d;
        if (i8 == 0) {
            str = "None";
        } else if (i8 == 1) {
            str = "Weight";
        } else if (i8 == 2) {
            str = "Style";
        } else if (i8 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f4007e);
        sb.append(')');
        return sb.toString();
    }
}
