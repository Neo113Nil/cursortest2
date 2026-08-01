package r1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0291b[] f3548a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3549b;

    static {
        C0291b c0291b = new C0291b(C0291b.i, "");
        x1.i iVar = C0291b.f3531f;
        C0291b c0291b2 = new C0291b(iVar, "GET");
        C0291b c0291b3 = new C0291b(iVar, "POST");
        x1.i iVar2 = C0291b.f3532g;
        C0291b c0291b4 = new C0291b(iVar2, "/");
        C0291b c0291b5 = new C0291b(iVar2, "/index.html");
        x1.i iVar3 = C0291b.h;
        C0291b c0291b6 = new C0291b(iVar3, "http");
        C0291b c0291b7 = new C0291b(iVar3, "https");
        x1.i iVar4 = C0291b.f3530e;
        C0291b[] c0291bArr = {c0291b, c0291b2, c0291b3, c0291b4, c0291b5, c0291b6, c0291b7, new C0291b(iVar4, "200"), new C0291b(iVar4, "204"), new C0291b(iVar4, "206"), new C0291b(iVar4, "304"), new C0291b(iVar4, "400"), new C0291b(iVar4, "404"), new C0291b(iVar4, "500"), new C0291b("accept-charset", ""), new C0291b("accept-encoding", "gzip, deflate"), new C0291b("accept-language", ""), new C0291b("accept-ranges", ""), new C0291b("accept", ""), new C0291b("access-control-allow-origin", ""), new C0291b("age", ""), new C0291b("allow", ""), new C0291b("authorization", ""), new C0291b("cache-control", ""), new C0291b("content-disposition", ""), new C0291b("content-encoding", ""), new C0291b("content-language", ""), new C0291b("content-length", ""), new C0291b("content-location", ""), new C0291b("content-range", ""), new C0291b("content-type", ""), new C0291b("cookie", ""), new C0291b("date", ""), new C0291b("etag", ""), new C0291b("expect", ""), new C0291b("expires", ""), new C0291b("from", ""), new C0291b("host", ""), new C0291b("if-match", ""), new C0291b("if-modified-since", ""), new C0291b("if-none-match", ""), new C0291b("if-range", ""), new C0291b("if-unmodified-since", ""), new C0291b("last-modified", ""), new C0291b("link", ""), new C0291b("location", ""), new C0291b("max-forwards", ""), new C0291b("proxy-authenticate", ""), new C0291b("proxy-authorization", ""), new C0291b("range", ""), new C0291b("referer", ""), new C0291b("refresh", ""), new C0291b("retry-after", ""), new C0291b("server", ""), new C0291b("set-cookie", ""), new C0291b("strict-transport-security", ""), new C0291b("transfer-encoding", ""), new C0291b("user-agent", ""), new C0291b("vary", ""), new C0291b("via", ""), new C0291b("www-authenticate", "")};
        f3548a = c0291bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0291bArr[i].f3533a)) {
                linkedHashMap.put(c0291bArr[i].f3533a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Z0.d.d(unmodifiableMap, "unmodifiableMap(result)");
        f3549b = unmodifiableMap;
    }

    public static void a(x1.i iVar) {
        Z0.d.e(iVar, "name");
        int a2 = iVar.a();
        for (int i = 0; i < a2; i++) {
            byte d = iVar.d(i);
            if (65 <= d && d < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.h()));
            }
        }
    }
}
