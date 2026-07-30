package M5;

import C4.d;
import C4.e;
import C4.f;
import java.util.Objects;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1769c;

    /* renamed from: a, reason: collision with root package name */
    public final String f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1771b;

    static {
        Logger logger = Logger.getLogger(a.class.getName());
        e eVar = e.f301d;
        H4.e a7 = H4.e.a(eVar, "service.name");
        H4.e a8 = H4.e.a(eVar, "telemetry.sdk.language");
        H4.e a9 = H4.e.a(eVar, "telemetry.sdk.name");
        H4.e a10 = H4.e.a(eVar, "telemetry.sdk.version");
        a a11 = a(C4.b.f297l, null);
        a a12 = a(f.b(a7, "unknown_service:java"), null);
        d dVar = new d(0);
        dVar.e(a9, "opentelemetry");
        dVar.e(a8, "java");
        dVar.e(a10, "1.55.0");
        a a13 = a(dVar.b(), null);
        String str = a12.f1770a;
        String str2 = a13.f1770a;
        if (a13 != a11) {
            d dVar2 = new d(0);
            dVar2.g(a12.f1771b);
            dVar2.g(a13.f1771b);
            if (str2 == null) {
                a12 = a(dVar2.b(), str);
            } else if (str == null) {
                a12 = a(dVar2.b(), str2);
            } else if (str2.equals(str)) {
                a12 = a(dVar2.b(), str);
            } else {
                logger.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str + " Schema 2: " + str2);
                a12 = a(dVar2.b(), null);
            }
        }
        f1769c = a12;
    }

    public a(f fVar, String str) {
        this.f1770a = str;
        if (fVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f1771b = fVar;
    }

    public static a a(f fVar, String str) {
        Objects.requireNonNull(fVar, "attributes");
        fVar.forEach(new b());
        return new a(fVar, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str = this.f1770a;
            if (str != null ? str.equals(aVar.f1770a) : aVar.f1770a == null) {
                if (this.f1771b.equals(aVar.f1771b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1770a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f1771b.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.f1770a + ", attributes=" + this.f1771b + "}";
    }
}
