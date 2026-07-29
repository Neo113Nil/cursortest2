package p1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0285b[] f3399a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3400b;

    static {
        C0285b c0285b = new C0285b(C0285b.i, "");
        v1.i iVar = C0285b.f3382f;
        C0285b c0285b2 = new C0285b(iVar, "GET");
        C0285b c0285b3 = new C0285b(iVar, "POST");
        v1.i iVar2 = C0285b.f3383g;
        C0285b c0285b4 = new C0285b(iVar2, "/");
        C0285b c0285b5 = new C0285b(iVar2, "/index.html");
        v1.i iVar3 = C0285b.h;
        C0285b c0285b6 = new C0285b(iVar3, "http");
        C0285b c0285b7 = new C0285b(iVar3, "https");
        v1.i iVar4 = C0285b.f3381e;
        C0285b[] c0285bArr = {c0285b, c0285b2, c0285b3, c0285b4, c0285b5, c0285b6, c0285b7, new C0285b(iVar4, "200"), new C0285b(iVar4, "204"), new C0285b(iVar4, "206"), new C0285b(iVar4, "304"), new C0285b(iVar4, "400"), new C0285b(iVar4, "404"), new C0285b(iVar4, "500"), new C0285b("accept-charset", ""), new C0285b("accept-encoding", "gzip, deflate"), new C0285b("accept-language", ""), new C0285b("accept-ranges", ""), new C0285b("accept", ""), new C0285b("access-control-allow-origin", ""), new C0285b("age", ""), new C0285b("allow", ""), new C0285b("authorization", ""), new C0285b("cache-control", ""), new C0285b("content-disposition", ""), new C0285b("content-encoding", ""), new C0285b("content-language", ""), new C0285b("content-length", ""), new C0285b("content-location", ""), new C0285b("content-range", ""), new C0285b("content-type", ""), new C0285b("cookie", ""), new C0285b("date", ""), new C0285b("etag", ""), new C0285b("expect", ""), new C0285b("expires", ""), new C0285b("from", ""), new C0285b("host", ""), new C0285b("if-match", ""), new C0285b("if-modified-since", ""), new C0285b("if-none-match", ""), new C0285b("if-range", ""), new C0285b("if-unmodified-since", ""), new C0285b("last-modified", ""), new C0285b("link", ""), new C0285b("location", ""), new C0285b("max-forwards", ""), new C0285b("proxy-authenticate", ""), new C0285b("proxy-authorization", ""), new C0285b("range", ""), new C0285b("referer", ""), new C0285b("refresh", ""), new C0285b("retry-after", ""), new C0285b("server", ""), new C0285b("set-cookie", ""), new C0285b("strict-transport-security", ""), new C0285b("transfer-encoding", ""), new C0285b("user-agent", ""), new C0285b("vary", ""), new C0285b("via", ""), new C0285b("www-authenticate", "")};
        f3399a = c0285bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0285bArr[i].f3384a)) {
                linkedHashMap.put(c0285bArr[i].f3384a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        X0.e.d(unmodifiableMap, "unmodifiableMap(result)");
        f3400b = unmodifiableMap;
    }

    public static void a(v1.i iVar) {
        X0.e.e(iVar, "name");
        int a2 = iVar.a();
        for (int i = 0; i < a2; i++) {
            byte d = iVar.d(i);
            if (65 <= d && d < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.h()));
            }
        }
    }
}
