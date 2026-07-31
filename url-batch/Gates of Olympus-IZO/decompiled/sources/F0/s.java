package F0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f1463a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1465c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1466d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1467e;

    public s(r rVar, l lVar, int i3, int i4, Object obj) {
        this.f1463a = rVar;
        this.f1464b = lVar;
        this.f1465c = i3;
        this.f1466d = i4;
        this.f1467e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Z1.i.a(this.f1463a, sVar.f1463a) && Z1.i.a(this.f1464b, sVar.f1464b) && j.a(this.f1465c, sVar.f1465c) && k.a(this.f1466d, sVar.f1466d) && Z1.i.a(this.f1467e, sVar.f1467e);
    }

    public final int hashCode() {
        r rVar = this.f1463a;
        int b2 = AbstractC0080b.b(this.f1466d, AbstractC0080b.b(this.f1465c, (((rVar == null ? 0 : rVar.hashCode()) * 31) + this.f1464b.f1458d) * 31, 31), 31);
        Object obj = this.f1467e;
        return b2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f1463a);
        sb.append(", fontWeight=");
        sb.append(this.f1464b);
        sb.append(", fontStyle=");
        int i3 = this.f1465c;
        sb.append((Object) (j.a(i3, 0) ? "Normal" : j.a(i3, 1) ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        sb.append((Object) k.b(this.f1466d));
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f1467e);
        sb.append(')');
        return sb.toString();
    }
}
