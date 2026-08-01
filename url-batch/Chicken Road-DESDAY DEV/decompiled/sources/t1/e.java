package t1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0316b[] f3769a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3770b;

    static {
        C0316b c0316b = new C0316b(C0316b.i, "");
        z1.i iVar = C0316b.f3752f;
        C0316b c0316b2 = new C0316b(iVar, "GET");
        C0316b c0316b3 = new C0316b(iVar, "POST");
        z1.i iVar2 = C0316b.f3753g;
        C0316b c0316b4 = new C0316b(iVar2, "/");
        C0316b c0316b5 = new C0316b(iVar2, "/index.html");
        z1.i iVar3 = C0316b.h;
        C0316b c0316b6 = new C0316b(iVar3, "http");
        C0316b c0316b7 = new C0316b(iVar3, "https");
        z1.i iVar4 = C0316b.f3751e;
        C0316b[] c0316bArr = {c0316b, c0316b2, c0316b3, c0316b4, c0316b5, c0316b6, c0316b7, new C0316b(iVar4, "200"), new C0316b(iVar4, "204"), new C0316b(iVar4, "206"), new C0316b(iVar4, "304"), new C0316b(iVar4, "400"), new C0316b(iVar4, "404"), new C0316b(iVar4, "500"), new C0316b("accept-charset", ""), new C0316b("accept-encoding", "gzip, deflate"), new C0316b("accept-language", ""), new C0316b("accept-ranges", ""), new C0316b("accept", ""), new C0316b("access-control-allow-origin", ""), new C0316b("age", ""), new C0316b("allow", ""), new C0316b("authorization", ""), new C0316b("cache-control", ""), new C0316b("content-disposition", ""), new C0316b("content-encoding", ""), new C0316b("content-language", ""), new C0316b("content-length", ""), new C0316b("content-location", ""), new C0316b("content-range", ""), new C0316b("content-type", ""), new C0316b("cookie", ""), new C0316b("date", ""), new C0316b("etag", ""), new C0316b("expect", ""), new C0316b("expires", ""), new C0316b("from", ""), new C0316b("host", ""), new C0316b("if-match", ""), new C0316b("if-modified-since", ""), new C0316b("if-none-match", ""), new C0316b("if-range", ""), new C0316b("if-unmodified-since", ""), new C0316b("last-modified", ""), new C0316b("link", ""), new C0316b("location", ""), new C0316b("max-forwards", ""), new C0316b("proxy-authenticate", ""), new C0316b("proxy-authorization", ""), new C0316b("range", ""), new C0316b("referer", ""), new C0316b("refresh", ""), new C0316b("retry-after", ""), new C0316b("server", ""), new C0316b("set-cookie", ""), new C0316b("strict-transport-security", ""), new C0316b("transfer-encoding", ""), new C0316b("user-agent", ""), new C0316b("vary", ""), new C0316b("via", ""), new C0316b("www-authenticate", "")};
        f3769a = c0316bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0316bArr[i].f3754a)) {
                linkedHashMap.put(c0316bArr[i].f3754a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        b1.d.d(unmodifiableMap, "unmodifiableMap(result)");
        f3770b = unmodifiableMap;
    }

    public static void a(z1.i iVar) {
        b1.d.e(iVar, "name");
        int a2 = iVar.a();
        for (int i = 0; i < a2; i++) {
            byte d = iVar.d(i);
            if (65 <= d && d < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.h()));
            }
        }
    }
}
