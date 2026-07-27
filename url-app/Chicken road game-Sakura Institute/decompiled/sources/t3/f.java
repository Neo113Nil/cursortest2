package t3;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import z3.C1451i;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1212c[] f10781a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f10782b;

    static {
        C1212c c1212c = new C1212c(C1212c.f10761i, "");
        C1451i c1451i = C1212c.f10758f;
        C1212c c1212c2 = new C1212c(c1451i, "GET");
        C1212c c1212c3 = new C1212c(c1451i, "POST");
        C1451i c1451i2 = C1212c.f10759g;
        C1212c c1212c4 = new C1212c(c1451i2, "/");
        C1212c c1212c5 = new C1212c(c1451i2, "/index.html");
        C1451i c1451i3 = C1212c.f10760h;
        C1212c c1212c6 = new C1212c(c1451i3, "http");
        C1212c c1212c7 = new C1212c(c1451i3, "https");
        C1451i c1451i4 = C1212c.f10757e;
        C1212c[] c1212cArr = {c1212c, c1212c2, c1212c3, c1212c4, c1212c5, c1212c6, c1212c7, new C1212c(c1451i4, "200"), new C1212c(c1451i4, "204"), new C1212c(c1451i4, "206"), new C1212c(c1451i4, "304"), new C1212c(c1451i4, "400"), new C1212c(c1451i4, "404"), new C1212c(c1451i4, "500"), new C1212c("accept-charset", ""), new C1212c("accept-encoding", "gzip, deflate"), new C1212c("accept-language", ""), new C1212c("accept-ranges", ""), new C1212c("accept", ""), new C1212c("access-control-allow-origin", ""), new C1212c("age", ""), new C1212c("allow", ""), new C1212c("authorization", ""), new C1212c("cache-control", ""), new C1212c("content-disposition", ""), new C1212c("content-encoding", ""), new C1212c("content-language", ""), new C1212c("content-length", ""), new C1212c("content-location", ""), new C1212c("content-range", ""), new C1212c("content-type", ""), new C1212c("cookie", ""), new C1212c("date", ""), new C1212c("etag", ""), new C1212c("expect", ""), new C1212c("expires", ""), new C1212c("from", ""), new C1212c("host", ""), new C1212c("if-match", ""), new C1212c("if-modified-since", ""), new C1212c("if-none-match", ""), new C1212c("if-range", ""), new C1212c("if-unmodified-since", ""), new C1212c("last-modified", ""), new C1212c("link", ""), new C1212c("location", ""), new C1212c("max-forwards", ""), new C1212c("proxy-authenticate", ""), new C1212c("proxy-authorization", ""), new C1212c("range", ""), new C1212c("referer", ""), new C1212c("refresh", ""), new C1212c("retry-after", ""), new C1212c("server", ""), new C1212c("set-cookie", ""), new C1212c("strict-transport-security", ""), new C1212c("transfer-encoding", ""), new C1212c("user-agent", ""), new C1212c("vary", ""), new C1212c("via", ""), new C1212c("www-authenticate", "")};
        f10781a = c1212cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i2 = 0; i2 < 61; i2++) {
            if (!linkedHashMap.containsKey(c1212cArr[i2].f10762a)) {
                linkedHashMap.put(c1212cArr[i2].f10762a, Integer.valueOf(i2));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
        f10782b = unmodifiableMap;
    }

    public static void a(C1451i name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int c4 = name.c();
        for (int i2 = 0; i2 < c4; i2++) {
            byte n2 = name.n(i2);
            if (65 <= n2 && n2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.C()));
            }
        }
    }
}
