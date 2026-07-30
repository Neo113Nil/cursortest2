package l7;

import I1.f;
import b6.C0530a;
import b6.c;
import g6.e;
import java.util.Objects;
import java.util.logging.Logger;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4707a {

    /* renamed from: c, reason: collision with root package name */
    public static final C4707a f39080c;

    /* renamed from: a, reason: collision with root package name */
    public final String f39081a;

    /* renamed from: b, reason: collision with root package name */
    public final C0530a f39082b;

    static {
        Logger logger = Logger.getLogger(C4707a.class.getName());
        b6.b bVar = b6.b.f5560n;
        e a9 = e.a(bVar, "service.name");
        e a10 = e.a(bVar, "telemetry.sdk.language");
        e a11 = e.a(bVar, "telemetry.sdk.name");
        e a12 = e.a(bVar, "telemetry.sdk.version");
        C4707a a13 = a(C0530a.f5557w, null);
        C4707a a14 = a(c.b(a9, "unknown_service:java"), null);
        f fVar = new f(2);
        fVar.d(a11, "opentelemetry");
        fVar.d(a10, "java");
        fVar.d(a12, "1.55.0");
        C4707a a15 = a(fVar.b(), null);
        if (a15 != a13) {
            f fVar2 = new f(2);
            fVar2.f(a14.f39082b);
            fVar2.f(a15.f39082b);
            String str = a14.f39081a;
            String str2 = a15.f39081a;
            if (str2 == null) {
                a14 = a(fVar2.b(), str);
            } else if (str == null) {
                a14 = a(fVar2.b(), str2);
            } else if (str2.equals(str)) {
                a14 = a(fVar2.b(), str);
            } else {
                logger.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str + " Schema 2: " + str2);
                a14 = a(fVar2.b(), null);
            }
        }
        f39080c = a14;
    }

    public C4707a(C0530a c0530a, String str) {
        this.f39081a = str;
        if (c0530a == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f39082b = c0530a;
    }

    public static C4707a a(C0530a c0530a, String str) {
        Objects.requireNonNull(c0530a, "attributes");
        c0530a.forEach(new C4708b());
        return new C4707a(c0530a, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4707a)) {
            return false;
        }
        C4707a c4707a = (C4707a) obj;
        String str = this.f39081a;
        if (str == null) {
            if (c4707a.f39081a != null) {
                return false;
            }
        } else if (!str.equals(c4707a.f39081a)) {
            return false;
        }
        return this.f39082b.equals(c4707a.f39082b);
    }

    public final int hashCode() {
        String str = this.f39081a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f39082b.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.f39081a + ", attributes=" + this.f39082b + "}";
    }
}
