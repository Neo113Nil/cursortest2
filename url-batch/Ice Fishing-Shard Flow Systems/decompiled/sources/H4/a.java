package H4;

import K4.h;
import K4.j;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final a f979f = new a("00000000000000000000000000000000", "0000000000000000", K4.e.f1457d, K4.a.f1453a, false);

    /* renamed from: a, reason: collision with root package name */
    public final String f980a;

    /* renamed from: b, reason: collision with root package name */
    public final String f981b;

    /* renamed from: c, reason: collision with root package name */
    public final j f982c;

    /* renamed from: d, reason: collision with root package name */
    public final K4.b f983d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f984e;

    public a(String str, String str2, j jVar, K4.b bVar, boolean z7) {
        this.f980a = str;
        this.f981b = str2;
        if (jVar == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f982c = jVar;
        if (bVar == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f983d = bVar;
        this.f984e = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f980a.equals(aVar.f980a) && this.f981b.equals(aVar.f981b) && this.f982c.equals(aVar.f982c) && this.f983d.equals(aVar.f983d) && this.f984e == aVar.f984e;
    }

    public final int hashCode() {
        return ((((((((((this.f980a.hashCode() ^ 1000003) * 1000003) ^ this.f981b.hashCode()) * 1000003) ^ this.f982c.hashCode()) * 1000003) ^ this.f983d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (this.f984e ? 1231 : 1237);
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=" + this.f980a + ", spanId=" + this.f981b + ", traceFlags=" + this.f982c + ", traceState=" + this.f983d + ", remote=false, valid=" + this.f984e + "}";
    }
}
