package t1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0303b[] f3851a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3852b;

    static {
        C0303b c0303b = new C0303b(C0303b.i, "");
        z1.i iVar = C0303b.f3834f;
        C0303b c0303b2 = new C0303b(iVar, "GET");
        C0303b c0303b3 = new C0303b(iVar, "POST");
        z1.i iVar2 = C0303b.f3835g;
        C0303b c0303b4 = new C0303b(iVar2, "/");
        C0303b c0303b5 = new C0303b(iVar2, "/index.html");
        z1.i iVar3 = C0303b.h;
        C0303b c0303b6 = new C0303b(iVar3, "http");
        C0303b c0303b7 = new C0303b(iVar3, "https");
        z1.i iVar4 = C0303b.f3833e;
        C0303b[] c0303bArr = {c0303b, c0303b2, c0303b3, c0303b4, c0303b5, c0303b6, c0303b7, new C0303b(iVar4, "200"), new C0303b(iVar4, "204"), new C0303b(iVar4, "206"), new C0303b(iVar4, "304"), new C0303b(iVar4, "400"), new C0303b(iVar4, "404"), new C0303b(iVar4, "500"), new C0303b("accept-charset", ""), new C0303b("accept-encoding", "gzip, deflate"), new C0303b("accept-language", ""), new C0303b("accept-ranges", ""), new C0303b("accept", ""), new C0303b("access-control-allow-origin", ""), new C0303b("age", ""), new C0303b("allow", ""), new C0303b("authorization", ""), new C0303b("cache-control", ""), new C0303b("content-disposition", ""), new C0303b("content-encoding", ""), new C0303b("content-language", ""), new C0303b("content-length", ""), new C0303b("content-location", ""), new C0303b("content-range", ""), new C0303b("content-type", ""), new C0303b("cookie", ""), new C0303b("date", ""), new C0303b("etag", ""), new C0303b("expect", ""), new C0303b("expires", ""), new C0303b("from", ""), new C0303b("host", ""), new C0303b("if-match", ""), new C0303b("if-modified-since", ""), new C0303b("if-none-match", ""), new C0303b("if-range", ""), new C0303b("if-unmodified-since", ""), new C0303b("last-modified", ""), new C0303b("link", ""), new C0303b("location", ""), new C0303b("max-forwards", ""), new C0303b("proxy-authenticate", ""), new C0303b("proxy-authorization", ""), new C0303b("range", ""), new C0303b("referer", ""), new C0303b("refresh", ""), new C0303b("retry-after", ""), new C0303b("server", ""), new C0303b("set-cookie", ""), new C0303b("strict-transport-security", ""), new C0303b("transfer-encoding", ""), new C0303b("user-agent", ""), new C0303b("vary", ""), new C0303b("via", ""), new C0303b("www-authenticate", "")};
        f3851a = c0303bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0303bArr[i].f3836a)) {
                linkedHashMap.put(c0303bArr[i].f3836a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        b1.d.d(unmodifiableMap, "unmodifiableMap(result)");
        f3852b = unmodifiableMap;
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
