package a4;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final c[] f169a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f170b;

    static {
        c cVar = new c(c.i, "");
        g4.i iVar = c.f146f;
        c cVar2 = new c(iVar, "GET");
        c cVar3 = new c(iVar, "POST");
        g4.i iVar2 = c.f147g;
        c cVar4 = new c(iVar2, "/");
        c cVar5 = new c(iVar2, "/index.html");
        g4.i iVar3 = c.h;
        c cVar6 = new c(iVar3, "http");
        c cVar7 = new c(iVar3, "https");
        g4.i iVar4 = c.f145e;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f169a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(cVarArr[i].f148a)) {
                linkedHashMap.put(cVarArr[i].f148a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i3.d.d(unmodifiableMap, "unmodifiableMap(result)");
        f170b = unmodifiableMap;
    }

    public static void a(g4.i iVar) {
        i3.d.e(iVar, "name");
        int a5 = iVar.a();
        for (int i = 0; i < a5; i++) {
            byte d = iVar.d(i);
            if (65 <= d && d < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.h()));
            }
        }
    }
}
