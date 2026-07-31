package H2;

import N2.C0153i;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0081c[] f1953a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1954b;

    static {
        C0081c c0081c = new C0081c(C0081c.f1933i, "");
        C0153i c0153i = C0081c.f1930f;
        C0081c c0081c2 = new C0081c(c0153i, "GET");
        C0081c c0081c3 = new C0081c(c0153i, "POST");
        C0153i c0153i2 = C0081c.f1931g;
        C0081c c0081c4 = new C0081c(c0153i2, "/");
        C0081c c0081c5 = new C0081c(c0153i2, "/index.html");
        C0153i c0153i3 = C0081c.f1932h;
        C0081c c0081c6 = new C0081c(c0153i3, "http");
        C0081c c0081c7 = new C0081c(c0153i3, "https");
        C0153i c0153i4 = C0081c.f1929e;
        C0081c[] c0081cArr = {c0081c, c0081c2, c0081c3, c0081c4, c0081c5, c0081c6, c0081c7, new C0081c(c0153i4, "200"), new C0081c(c0153i4, "204"), new C0081c(c0153i4, "206"), new C0081c(c0153i4, "304"), new C0081c(c0153i4, "400"), new C0081c(c0153i4, "404"), new C0081c(c0153i4, "500"), new C0081c("accept-charset", ""), new C0081c("accept-encoding", "gzip, deflate"), new C0081c("accept-language", ""), new C0081c("accept-ranges", ""), new C0081c("accept", ""), new C0081c("access-control-allow-origin", ""), new C0081c("age", ""), new C0081c("allow", ""), new C0081c("authorization", ""), new C0081c("cache-control", ""), new C0081c("content-disposition", ""), new C0081c("content-encoding", ""), new C0081c("content-language", ""), new C0081c("content-length", ""), new C0081c("content-location", ""), new C0081c("content-range", ""), new C0081c("content-type", ""), new C0081c("cookie", ""), new C0081c("date", ""), new C0081c("etag", ""), new C0081c("expect", ""), new C0081c("expires", ""), new C0081c("from", ""), new C0081c("host", ""), new C0081c("if-match", ""), new C0081c("if-modified-since", ""), new C0081c("if-none-match", ""), new C0081c("if-range", ""), new C0081c("if-unmodified-since", ""), new C0081c("last-modified", ""), new C0081c("link", ""), new C0081c("location", ""), new C0081c("max-forwards", ""), new C0081c("proxy-authenticate", ""), new C0081c("proxy-authorization", ""), new C0081c("range", ""), new C0081c("referer", ""), new C0081c("refresh", ""), new C0081c("retry-after", ""), new C0081c("server", ""), new C0081c("set-cookie", ""), new C0081c("strict-transport-security", ""), new C0081c("transfer-encoding", ""), new C0081c("user-agent", ""), new C0081c("vary", ""), new C0081c("via", ""), new C0081c("www-authenticate", "")};
        f1953a = c0081cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i3 = 0; i3 < 61; i3++) {
            if (!linkedHashMap.containsKey(c0081cArr[i3].f1934a)) {
                linkedHashMap.put(c0081cArr[i3].f1934a, Integer.valueOf(i3));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Z1.i.e(unmodifiableMap, "unmodifiableMap(result)");
        f1954b = unmodifiableMap;
    }

    public static void a(C0153i c0153i) {
        Z1.i.f(c0153i, "name");
        int b2 = c0153i.b();
        for (int i3 = 0; i3 < b2; i3++) {
            byte g3 = c0153i.g(i3);
            if (65 <= g3 && g3 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0153i.o()));
            }
        }
    }
}
