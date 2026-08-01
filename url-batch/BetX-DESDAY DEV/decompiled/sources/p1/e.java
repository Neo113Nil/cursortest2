package p1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0314b[] f3793a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3794b;

    static {
        C0314b c0314b = new C0314b(C0314b.i, "");
        v1.j jVar = C0314b.f3774f;
        C0314b c0314b2 = new C0314b(jVar, "GET");
        C0314b c0314b3 = new C0314b(jVar, "POST");
        v1.j jVar2 = C0314b.f3775g;
        C0314b c0314b4 = new C0314b(jVar2, "/");
        C0314b c0314b5 = new C0314b(jVar2, "/index.html");
        v1.j jVar3 = C0314b.h;
        C0314b c0314b6 = new C0314b(jVar3, "http");
        C0314b c0314b7 = new C0314b(jVar3, "https");
        v1.j jVar4 = C0314b.f3773e;
        C0314b[] c0314bArr = {c0314b, c0314b2, c0314b3, c0314b4, c0314b5, c0314b6, c0314b7, new C0314b(jVar4, "200"), new C0314b(jVar4, "204"), new C0314b(jVar4, "206"), new C0314b(jVar4, "304"), new C0314b(jVar4, "400"), new C0314b(jVar4, "404"), new C0314b(jVar4, "500"), new C0314b("accept-charset", ""), new C0314b("accept-encoding", "gzip, deflate"), new C0314b("accept-language", ""), new C0314b("accept-ranges", ""), new C0314b("accept", ""), new C0314b("access-control-allow-origin", ""), new C0314b("age", ""), new C0314b("allow", ""), new C0314b("authorization", ""), new C0314b("cache-control", ""), new C0314b("content-disposition", ""), new C0314b("content-encoding", ""), new C0314b("content-language", ""), new C0314b("content-length", ""), new C0314b("content-location", ""), new C0314b("content-range", ""), new C0314b("content-type", ""), new C0314b("cookie", ""), new C0314b("date", ""), new C0314b("etag", ""), new C0314b("expect", ""), new C0314b("expires", ""), new C0314b("from", ""), new C0314b("host", ""), new C0314b("if-match", ""), new C0314b("if-modified-since", ""), new C0314b("if-none-match", ""), new C0314b("if-range", ""), new C0314b("if-unmodified-since", ""), new C0314b("last-modified", ""), new C0314b("link", ""), new C0314b("location", ""), new C0314b("max-forwards", ""), new C0314b("proxy-authenticate", ""), new C0314b("proxy-authorization", ""), new C0314b("range", ""), new C0314b("referer", ""), new C0314b("refresh", ""), new C0314b("retry-after", ""), new C0314b("server", ""), new C0314b("set-cookie", ""), new C0314b("strict-transport-security", ""), new C0314b("transfer-encoding", ""), new C0314b("user-agent", ""), new C0314b("vary", ""), new C0314b("via", ""), new C0314b("www-authenticate", "")};
        f3793a = c0314bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0314bArr[i].f3776a)) {
                linkedHashMap.put(c0314bArr[i].f3776a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        X0.f.d(unmodifiableMap, "unmodifiableMap(result)");
        f3794b = unmodifiableMap;
    }

    public static void a(v1.j jVar) {
        X0.f.e(jVar, "name");
        int a2 = jVar.a();
        for (int i = 0; i < a2; i++) {
            byte d2 = jVar.d(i);
            if (65 <= d2 && d2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.h()));
            }
        }
    }
}
