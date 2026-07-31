package n;

import b0.C0338g;
import d0.C0401b;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690p {

    /* renamed from: a, reason: collision with root package name */
    public C0338g f7182a = null;

    /* renamed from: b, reason: collision with root package name */
    public b0.r f7183b = null;

    /* renamed from: c, reason: collision with root package name */
    public C0401b f7184c = null;

    /* renamed from: d, reason: collision with root package name */
    public b0.L f7185d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0690p)) {
            return false;
        }
        C0690p c0690p = (C0690p) obj;
        return f2.j.a(this.f7182a, c0690p.f7182a) && f2.j.a(this.f7183b, c0690p.f7183b) && f2.j.a(this.f7184c, c0690p.f7184c) && f2.j.a(this.f7185d, c0690p.f7185d);
    }

    public final int hashCode() {
        C0338g c0338g = this.f7182a;
        int hashCode = (c0338g == null ? 0 : c0338g.hashCode()) * 31;
        b0.r rVar = this.f7183b;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        C0401b c0401b = this.f7184c;
        int hashCode3 = (hashCode2 + (c0401b == null ? 0 : c0401b.hashCode())) * 31;
        b0.L l3 = this.f7185d;
        return hashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f7182a + ", canvas=" + this.f7183b + ", canvasDrawScope=" + this.f7184c + ", borderPath=" + this.f7185d + ')';
    }
}
