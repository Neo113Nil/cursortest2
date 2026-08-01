package p1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0312b[] f3789a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3790b;

    static {
        C0312b c0312b = new C0312b(C0312b.i, "");
        v1.j jVar = C0312b.f3770f;
        C0312b c0312b2 = new C0312b(jVar, "GET");
        C0312b c0312b3 = new C0312b(jVar, "POST");
        v1.j jVar2 = C0312b.f3771g;
        C0312b c0312b4 = new C0312b(jVar2, "/");
        C0312b c0312b5 = new C0312b(jVar2, "/index.html");
        v1.j jVar3 = C0312b.h;
        C0312b c0312b6 = new C0312b(jVar3, "http");
        C0312b c0312b7 = new C0312b(jVar3, "https");
        v1.j jVar4 = C0312b.f3769e;
        C0312b[] c0312bArr = {c0312b, c0312b2, c0312b3, c0312b4, c0312b5, c0312b6, c0312b7, new C0312b(jVar4, "200"), new C0312b(jVar4, "204"), new C0312b(jVar4, "206"), new C0312b(jVar4, "304"), new C0312b(jVar4, "400"), new C0312b(jVar4, "404"), new C0312b(jVar4, "500"), new C0312b("accept-charset", ""), new C0312b("accept-encoding", "gzip, deflate"), new C0312b("accept-language", ""), new C0312b("accept-ranges", ""), new C0312b("accept", ""), new C0312b("access-control-allow-origin", ""), new C0312b("age", ""), new C0312b("allow", ""), new C0312b("authorization", ""), new C0312b("cache-control", ""), new C0312b("content-disposition", ""), new C0312b("content-encoding", ""), new C0312b("content-language", ""), new C0312b("content-length", ""), new C0312b("content-location", ""), new C0312b("content-range", ""), new C0312b("content-type", ""), new C0312b("cookie", ""), new C0312b("date", ""), new C0312b("etag", ""), new C0312b("expect", ""), new C0312b("expires", ""), new C0312b("from", ""), new C0312b("host", ""), new C0312b("if-match", ""), new C0312b("if-modified-since", ""), new C0312b("if-none-match", ""), new C0312b("if-range", ""), new C0312b("if-unmodified-since", ""), new C0312b("last-modified", ""), new C0312b("link", ""), new C0312b("location", ""), new C0312b("max-forwards", ""), new C0312b("proxy-authenticate", ""), new C0312b("proxy-authorization", ""), new C0312b("range", ""), new C0312b("referer", ""), new C0312b("refresh", ""), new C0312b("retry-after", ""), new C0312b("server", ""), new C0312b("set-cookie", ""), new C0312b("strict-transport-security", ""), new C0312b("transfer-encoding", ""), new C0312b("user-agent", ""), new C0312b("vary", ""), new C0312b("via", ""), new C0312b("www-authenticate", "")};
        f3789a = c0312bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0312bArr[i].f3772a)) {
                linkedHashMap.put(c0312bArr[i].f3772a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        X0.f.d(unmodifiableMap, "unmodifiableMap(result)");
        f3790b = unmodifiableMap;
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
