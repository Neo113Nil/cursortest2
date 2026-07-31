package N2;

import T2.C0234i;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0204b[] f3605a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3606b;

    static {
        C0204b c0204b = new C0204b(C0204b.f3585i, "");
        C0234i c0234i = C0204b.f3582f;
        C0204b c0204b2 = new C0204b(c0234i, "GET");
        C0204b c0204b3 = new C0204b(c0234i, "POST");
        C0234i c0234i2 = C0204b.f3583g;
        C0204b c0204b4 = new C0204b(c0234i2, "/");
        C0204b c0204b5 = new C0204b(c0234i2, "/index.html");
        C0234i c0234i3 = C0204b.f3584h;
        C0204b c0204b6 = new C0204b(c0234i3, "http");
        C0204b c0204b7 = new C0204b(c0234i3, "https");
        C0234i c0234i4 = C0204b.f3581e;
        C0204b[] c0204bArr = {c0204b, c0204b2, c0204b3, c0204b4, c0204b5, c0204b6, c0204b7, new C0204b(c0234i4, "200"), new C0204b(c0234i4, "204"), new C0204b(c0234i4, "206"), new C0204b(c0234i4, "304"), new C0204b(c0234i4, "400"), new C0204b(c0234i4, "404"), new C0204b(c0234i4, "500"), new C0204b("accept-charset", ""), new C0204b("accept-encoding", "gzip, deflate"), new C0204b("accept-language", ""), new C0204b("accept-ranges", ""), new C0204b("accept", ""), new C0204b("access-control-allow-origin", ""), new C0204b("age", ""), new C0204b("allow", ""), new C0204b("authorization", ""), new C0204b("cache-control", ""), new C0204b("content-disposition", ""), new C0204b("content-encoding", ""), new C0204b("content-language", ""), new C0204b("content-length", ""), new C0204b("content-location", ""), new C0204b("content-range", ""), new C0204b("content-type", ""), new C0204b("cookie", ""), new C0204b("date", ""), new C0204b("etag", ""), new C0204b("expect", ""), new C0204b("expires", ""), new C0204b("from", ""), new C0204b("host", ""), new C0204b("if-match", ""), new C0204b("if-modified-since", ""), new C0204b("if-none-match", ""), new C0204b("if-range", ""), new C0204b("if-unmodified-since", ""), new C0204b("last-modified", ""), new C0204b("link", ""), new C0204b("location", ""), new C0204b("max-forwards", ""), new C0204b("proxy-authenticate", ""), new C0204b("proxy-authorization", ""), new C0204b("range", ""), new C0204b("referer", ""), new C0204b("refresh", ""), new C0204b("retry-after", ""), new C0204b("server", ""), new C0204b("set-cookie", ""), new C0204b("strict-transport-security", ""), new C0204b("transfer-encoding", ""), new C0204b("user-agent", ""), new C0204b("vary", ""), new C0204b("via", ""), new C0204b("www-authenticate", "")};
        f3605a = c0204bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i3 = 0; i3 < 61; i3++) {
            if (!linkedHashMap.containsKey(c0204bArr[i3].f3586a)) {
                linkedHashMap.put(c0204bArr[i3].f3586a, Integer.valueOf(i3));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        f2.j.e(unmodifiableMap, "unmodifiableMap(result)");
        f3606b = unmodifiableMap;
    }

    public static void a(C0234i c0234i) {
        f2.j.f(c0234i, "name");
        int b3 = c0234i.b();
        for (int i3 = 0; i3 < b3; i3++) {
            byte g3 = c0234i.g(i3);
            if (65 <= g3 && g3 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0234i.o()));
            }
        }
    }
}
