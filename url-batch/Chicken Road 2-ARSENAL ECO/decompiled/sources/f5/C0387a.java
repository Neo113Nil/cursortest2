package f5;

import D3.M;
import V3.c;
import a4.e;
import java.util.Objects;
import java.util.logging.Logger;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0387a f4248c;

    /* renamed from: a, reason: collision with root package name */
    public final String f4249a;

    /* renamed from: b, reason: collision with root package name */
    public final c f4250b;

    static {
        Logger logger = Logger.getLogger(C0387a.class.getName());
        V3.b bVar = V3.b.f2707f;
        e a7 = e.a(bVar, "service.name");
        e a8 = e.a(bVar, "telemetry.sdk.language");
        e a9 = e.a(bVar, "telemetry.sdk.name");
        e a10 = e.a(bVar, "telemetry.sdk.version");
        C0387a a11 = a(V3.a.f2706i, null);
        C0387a a12 = a(c.c(a7, "unknown_service:java"), null);
        M m4 = new M(27);
        m4.u(a9, "opentelemetry");
        m4.u(a8, "java");
        m4.u(a10, "1.55.0");
        C0387a a13 = a(m4.t(), null);
        String str = a12.f4249a;
        String str2 = a13.f4249a;
        if (a13 != a11) {
            M m7 = new M(27);
            m7.w(a12.f4250b);
            m7.w(a13.f4250b);
            if (str2 == null) {
                a12 = a(m7.t(), str);
            } else if (str == null) {
                a12 = a(m7.t(), str2);
            } else if (str2.equals(str)) {
                a12 = a(m7.t(), str);
            } else {
                logger.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str + " Schema 2: " + str2);
                a12 = a(m7.t(), null);
            }
        }
        f4248c = a12;
    }

    public C0387a(c cVar, String str) {
        this.f4249a = str;
        if (cVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f4250b = cVar;
    }

    public static C0387a a(c cVar, String str) {
        Objects.requireNonNull(cVar, "attributes");
        cVar.forEach(new C0388b());
        return new C0387a(cVar, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0387a) {
            C0387a c0387a = (C0387a) obj;
            String str = this.f4249a;
            if (str != null ? str.equals(c0387a.f4249a) : c0387a.f4249a == null) {
                if (this.f4250b.equals(c0387a.f4250b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4249a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f4250b.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.f4249a + ", attributes=" + this.f4250b + "}";
    }
}
