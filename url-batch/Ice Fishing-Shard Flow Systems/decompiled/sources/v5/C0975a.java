package v5;

import C4.f;
import java.util.Objects;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8219e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f8220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8221b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8222c;

    /* renamed from: d, reason: collision with root package name */
    public final f f8223d;

    static {
        a("", null, null, C4.b.f297l);
    }

    public C0975a(String str, String str2, String str3, f fVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f8220a = str;
        this.f8221b = str2;
        this.f8222c = str3;
        if (fVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f8223d = fVar;
    }

    public static C0975a a(String str, String str2, String str3, f fVar) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(fVar, "attributes");
        return new C0975a(str, str2, str3, fVar);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0975a) {
            C0975a c0975a = (C0975a) obj;
            String str3 = c0975a.f8220a;
            String str4 = c0975a.f8222c;
            String str5 = c0975a.f8221b;
            if (this.f8220a.equals(str3) && ((str = this.f8221b) != null ? str.equals(str5) : str5 == null) && ((str2 = this.f8222c) != null ? str2.equals(str4) : str4 == null) && this.f8223d.equals(c0975a.f8223d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f8220a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8221b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f8222c;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f8223d.hashCode();
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.f8220a + ", version=" + this.f8221b + ", schemaUrl=" + this.f8222c + ", attributes=" + this.f8223d + "}";
    }
}
