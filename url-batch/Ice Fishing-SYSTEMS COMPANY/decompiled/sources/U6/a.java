package U6;

import b6.C0530a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3300e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f3301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3302b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3303c;

    /* renamed from: d, reason: collision with root package name */
    public final b6.c f3304d;

    static {
        a("", null, null, C0530a.f5557w);
    }

    public a(String str, String str2, String str3, b6.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f3301a = str;
        this.f3302b = str2;
        this.f3303c = str3;
        if (cVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f3304d = cVar;
    }

    public static a a(String str, String str2, String str3, b6.c cVar) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(cVar, "attributes");
        return new a(str, str2, str3, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3301a.equals(aVar.f3301a)) {
                String str = aVar.f3302b;
                String str2 = this.f3302b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = aVar.f3303c;
                    String str4 = this.f3303c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        if (this.f3304d.equals(aVar.f3304d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3301a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3302b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3303c;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f3304d.hashCode();
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.f3301a + ", version=" + this.f3302b + ", schemaUrl=" + this.f3303c + ", attributes=" + this.f3304d + "}";
    }
}
