package G1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0002c[] f384a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f385b;

    static {
        C0002c c0002c = new C0002c(C0002c.i, "");
        M1.i iVar = C0002c.f367f;
        C0002c c0002c2 = new C0002c(iVar, "GET");
        C0002c c0002c3 = new C0002c(iVar, "POST");
        M1.i iVar2 = C0002c.f368g;
        C0002c c0002c4 = new C0002c(iVar2, "/");
        C0002c c0002c5 = new C0002c(iVar2, "/index.html");
        M1.i iVar3 = C0002c.h;
        C0002c c0002c6 = new C0002c(iVar3, "http");
        C0002c c0002c7 = new C0002c(iVar3, "https");
        M1.i iVar4 = C0002c.f366e;
        C0002c[] c0002cArr = {c0002c, c0002c2, c0002c3, c0002c4, c0002c5, c0002c6, c0002c7, new C0002c(iVar4, "200"), new C0002c(iVar4, "204"), new C0002c(iVar4, "206"), new C0002c(iVar4, "304"), new C0002c(iVar4, "400"), new C0002c(iVar4, "404"), new C0002c(iVar4, "500"), new C0002c("accept-charset", ""), new C0002c("accept-encoding", "gzip, deflate"), new C0002c("accept-language", ""), new C0002c("accept-ranges", ""), new C0002c("accept", ""), new C0002c("access-control-allow-origin", ""), new C0002c("age", ""), new C0002c("allow", ""), new C0002c("authorization", ""), new C0002c("cache-control", ""), new C0002c("content-disposition", ""), new C0002c("content-encoding", ""), new C0002c("content-language", ""), new C0002c("content-length", ""), new C0002c("content-location", ""), new C0002c("content-range", ""), new C0002c("content-type", ""), new C0002c("cookie", ""), new C0002c("date", ""), new C0002c("etag", ""), new C0002c("expect", ""), new C0002c("expires", ""), new C0002c("from", ""), new C0002c("host", ""), new C0002c("if-match", ""), new C0002c("if-modified-since", ""), new C0002c("if-none-match", ""), new C0002c("if-range", ""), new C0002c("if-unmodified-since", ""), new C0002c("last-modified", ""), new C0002c("link", ""), new C0002c("location", ""), new C0002c("max-forwards", ""), new C0002c("proxy-authenticate", ""), new C0002c("proxy-authorization", ""), new C0002c("range", ""), new C0002c("referer", ""), new C0002c("refresh", ""), new C0002c("retry-after", ""), new C0002c("server", ""), new C0002c("set-cookie", ""), new C0002c("strict-transport-security", ""), new C0002c("transfer-encoding", ""), new C0002c("user-agent", ""), new C0002c("vary", ""), new C0002c("via", ""), new C0002c("www-authenticate", "")};
        f384a = c0002cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0002cArr[i].f369a)) {
                linkedHashMap.put(c0002cArr[i].f369a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k1.e.d(unmodifiableMap, "unmodifiableMap(result)");
        f385b = unmodifiableMap;
    }

    public static void a(M1.i iVar) {
        k1.e.e(iVar, "name");
        int a2 = iVar.a();
        for (int i = 0; i < a2; i++) {
            byte d = iVar.d(i);
            if (65 <= d && d < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.h()));
            }
        }
    }
}
