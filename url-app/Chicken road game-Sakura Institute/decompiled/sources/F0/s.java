package F0;

import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f2627a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2630d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2631e;

    public s(r rVar, k kVar, int i2, int i4, Object obj) {
        this.f2627a = rVar;
        this.f2628b = kVar;
        this.f2629c = i2;
        this.f2630d = i4;
        this.f2631e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.f2627a, sVar.f2627a) && Intrinsics.a(this.f2628b, sVar.f2628b) && i.a(this.f2629c, sVar.f2629c) && j.a(this.f2630d, sVar.f2630d) && Intrinsics.a(this.f2631e, sVar.f2631e);
    }

    public final int hashCode() {
        r rVar = this.f2627a;
        int c4 = AbstractC0784j.c(this.f2630d, AbstractC0784j.c(this.f2629c, (((rVar == null ? 0 : rVar.hashCode()) * 31) + this.f2628b.f2618d) * 31, 31), 31);
        Object obj = this.f2631e;
        return c4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f2627a);
        sb.append(", fontWeight=");
        sb.append(this.f2628b);
        sb.append(", fontStyle=");
        int i2 = this.f2629c;
        sb.append((Object) (i.a(i2, 0) ? "Normal" : i.a(i2, 1) ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        sb.append((Object) j.b(this.f2630d));
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f2631e);
        sb.append(')');
        return sb.toString();
    }
}
