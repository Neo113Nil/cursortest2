package N3;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0079c[] f1852a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1853b;

    static {
        C0079c c0079c = new C0079c(C0079c.f1833i, "");
        T3.j jVar = C0079c.f1830f;
        C0079c c0079c2 = new C0079c(jVar, "GET");
        C0079c c0079c3 = new C0079c(jVar, "POST");
        T3.j jVar2 = C0079c.f1831g;
        C0079c c0079c4 = new C0079c(jVar2, "/");
        C0079c c0079c5 = new C0079c(jVar2, "/index.html");
        T3.j jVar3 = C0079c.f1832h;
        C0079c c0079c6 = new C0079c(jVar3, "http");
        C0079c c0079c7 = new C0079c(jVar3, "https");
        T3.j jVar4 = C0079c.f1829e;
        C0079c[] c0079cArr = {c0079c, c0079c2, c0079c3, c0079c4, c0079c5, c0079c6, c0079c7, new C0079c(jVar4, "200"), new C0079c(jVar4, "204"), new C0079c(jVar4, "206"), new C0079c(jVar4, "304"), new C0079c(jVar4, "400"), new C0079c(jVar4, "404"), new C0079c(jVar4, "500"), new C0079c("accept-charset", ""), new C0079c("accept-encoding", "gzip, deflate"), new C0079c("accept-language", ""), new C0079c("accept-ranges", ""), new C0079c("accept", ""), new C0079c("access-control-allow-origin", ""), new C0079c("age", ""), new C0079c("allow", ""), new C0079c("authorization", ""), new C0079c("cache-control", ""), new C0079c("content-disposition", ""), new C0079c("content-encoding", ""), new C0079c("content-language", ""), new C0079c("content-length", ""), new C0079c("content-location", ""), new C0079c("content-range", ""), new C0079c("content-type", ""), new C0079c("cookie", ""), new C0079c("date", ""), new C0079c("etag", ""), new C0079c("expect", ""), new C0079c("expires", ""), new C0079c("from", ""), new C0079c("host", ""), new C0079c("if-match", ""), new C0079c("if-modified-since", ""), new C0079c("if-none-match", ""), new C0079c("if-range", ""), new C0079c("if-unmodified-since", ""), new C0079c("last-modified", ""), new C0079c("link", ""), new C0079c("location", ""), new C0079c("max-forwards", ""), new C0079c("proxy-authenticate", ""), new C0079c("proxy-authorization", ""), new C0079c("range", ""), new C0079c("referer", ""), new C0079c("refresh", ""), new C0079c("retry-after", ""), new C0079c("server", ""), new C0079c("set-cookie", ""), new C0079c("strict-transport-security", ""), new C0079c("transfer-encoding", ""), new C0079c("user-agent", ""), new C0079c("vary", ""), new C0079c("via", ""), new C0079c("www-authenticate", "")};
        f1852a = c0079cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i4 = 0;
        while (i4 < 61) {
            int i5 = i4 + 1;
            if (!linkedHashMap.containsKey(c0079cArr[i4].f1834a)) {
                linkedHashMap.put(c0079cArr[i4].f1834a, Integer.valueOf(i4));
            }
            i4 = i5;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(result)");
        f1853b = unmodifiableMap;
    }

    public static void a(T3.j name) {
        kotlin.jvm.internal.i.e(name, "name");
        int a3 = name.a();
        int i4 = 0;
        while (i4 < a3) {
            int i5 = i4 + 1;
            byte d4 = name.d(i4);
            if (65 <= d4 && d4 <= 90) {
                throw new IOException(kotlin.jvm.internal.i.h(name.h(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i4 = i5;
        }
    }
}
