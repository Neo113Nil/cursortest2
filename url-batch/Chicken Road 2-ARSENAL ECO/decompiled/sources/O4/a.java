package O4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f1777e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f1778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1779b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1780c;

    /* renamed from: d, reason: collision with root package name */
    public final V3.c f1781d;

    static {
        a("", null, null, V3.a.f2706i);
    }

    public a(String str, String str2, String str3, V3.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f1778a = str;
        this.f1779b = str2;
        this.f1780c = str3;
        if (cVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f1781d = cVar;
    }

    public static a a(String str, String str2, String str3, V3.c cVar) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(cVar, "attributes");
        return new a(str, str2, str3, cVar);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str3 = aVar.f1778a;
            String str4 = aVar.f1780c;
            String str5 = aVar.f1779b;
            if (this.f1778a.equals(str3) && ((str = this.f1779b) != null ? str.equals(str5) : str5 == null) && ((str2 = this.f1780c) != null ? str2.equals(str4) : str4 == null) && this.f1781d.equals(aVar.f1781d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1778a.hashCode() ^ 1000003) * 1000003;
        String str = this.f1779b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1780c;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f1781d.hashCode();
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.f1778a + ", version=" + this.f1779b + ", schemaUrl=" + this.f1780c + ", attributes=" + this.f1781d + "}";
    }
}
