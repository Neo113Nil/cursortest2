package e6;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0358d[] f4071a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f4072b;

    static {
        C0358d c0358d = new C0358d(C0358d.f4052i, "");
        n6.i iVar = C0358d.f4049f;
        C0358d c0358d2 = new C0358d(iVar, "GET");
        C0358d c0358d3 = new C0358d(iVar, "POST");
        n6.i iVar2 = C0358d.f4050g;
        C0358d c0358d4 = new C0358d(iVar2, "/");
        C0358d c0358d5 = new C0358d(iVar2, "/index.html");
        n6.i iVar3 = C0358d.f4051h;
        C0358d c0358d6 = new C0358d(iVar3, "http");
        C0358d c0358d7 = new C0358d(iVar3, "https");
        n6.i iVar4 = C0358d.f4048e;
        C0358d[] c0358dArr = {c0358d, c0358d2, c0358d3, c0358d4, c0358d5, c0358d6, c0358d7, new C0358d(iVar4, "200"), new C0358d(iVar4, "204"), new C0358d(iVar4, "206"), new C0358d(iVar4, "304"), new C0358d(iVar4, "400"), new C0358d(iVar4, "404"), new C0358d(iVar4, "500"), new C0358d("accept-charset", ""), new C0358d("accept-encoding", "gzip, deflate"), new C0358d("accept-language", ""), new C0358d("accept-ranges", ""), new C0358d("accept", ""), new C0358d("access-control-allow-origin", ""), new C0358d("age", ""), new C0358d("allow", ""), new C0358d("authorization", ""), new C0358d("cache-control", ""), new C0358d("content-disposition", ""), new C0358d("content-encoding", ""), new C0358d("content-language", ""), new C0358d("content-length", ""), new C0358d("content-location", ""), new C0358d("content-range", ""), new C0358d("content-type", ""), new C0358d("cookie", ""), new C0358d("date", ""), new C0358d("etag", ""), new C0358d("expect", ""), new C0358d("expires", ""), new C0358d("from", ""), new C0358d("host", ""), new C0358d("if-match", ""), new C0358d("if-modified-since", ""), new C0358d("if-none-match", ""), new C0358d("if-range", ""), new C0358d("if-unmodified-since", ""), new C0358d("last-modified", ""), new C0358d("link", ""), new C0358d("location", ""), new C0358d("max-forwards", ""), new C0358d("proxy-authenticate", ""), new C0358d("proxy-authorization", ""), new C0358d("range", ""), new C0358d("referer", ""), new C0358d("refresh", ""), new C0358d("retry-after", ""), new C0358d("server", ""), new C0358d("set-cookie", ""), new C0358d("strict-transport-security", ""), new C0358d("transfer-encoding", ""), new C0358d("user-agent", ""), new C0358d("vary", ""), new C0358d("via", ""), new C0358d("www-authenticate", "")};
        f4071a = c0358dArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i7 = 0; i7 < 61; i7++) {
            if (!linkedHashMap.containsKey(c0358dArr[i7].f4053a)) {
                linkedHashMap.put(c0358dArr[i7].f4053a, Integer.valueOf(i7));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(...)");
        f4072b = unmodifiableMap;
    }

    public static void a(n6.i name) {
        kotlin.jvm.internal.i.e(name, "name");
        int a7 = name.a();
        for (int i7 = 0; i7 < a7; i7++) {
            byte d7 = name.d(i7);
            if (65 <= d7 && d7 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.k()));
            }
        }
    }
}
