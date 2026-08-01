package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class hn {
    public static final um[] a;
    public static final Map b;

    static {
        um umVar = new um(um.i, "");
        y8 y8Var = um.f;
        um umVar2 = new um(y8Var, "GET");
        um umVar3 = new um(y8Var, "POST");
        y8 y8Var2 = um.g;
        um umVar4 = new um(y8Var2, "/");
        um umVar5 = new um(y8Var2, "/index.html");
        y8 y8Var3 = um.h;
        um umVar6 = new um(y8Var3, "http");
        um umVar7 = new um(y8Var3, "https");
        y8 y8Var4 = um.e;
        um[] umVarArr = {umVar, umVar2, umVar3, umVar4, umVar5, umVar6, umVar7, new um(y8Var4, "200"), new um(y8Var4, "204"), new um(y8Var4, "206"), new um(y8Var4, "304"), new um(y8Var4, "400"), new um(y8Var4, "404"), new um(y8Var4, "500"), new um("accept-charset", ""), new um("accept-encoding", "gzip, deflate"), new um("accept-language", ""), new um("accept-ranges", ""), new um("accept", ""), new um("access-control-allow-origin", ""), new um("age", ""), new um("allow", ""), new um("authorization", ""), new um("cache-control", ""), new um("content-disposition", ""), new um("content-encoding", ""), new um("content-language", ""), new um("content-length", ""), new um("content-location", ""), new um("content-range", ""), new um("content-type", ""), new um("cookie", ""), new um("date", ""), new um("etag", ""), new um("expect", ""), new um("expires", ""), new um("from", ""), new um("host", ""), new um("if-match", ""), new um("if-modified-since", ""), new um("if-none-match", ""), new um("if-range", ""), new um("if-unmodified-since", ""), new um("last-modified", ""), new um("link", ""), new um("location", ""), new um("max-forwards", ""), new um("proxy-authenticate", ""), new um("proxy-authorization", ""), new um("range", ""), new um("referer", ""), new um("refresh", ""), new um("retry-after", ""), new um("server", ""), new um("set-cookie", ""), new um("strict-transport-security", ""), new um("transfer-encoding", ""), new um("user-agent", ""), new um("vary", ""), new um("via", ""), new um("www-authenticate", "")};
        a = umVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(umVarArr[i].a)) {
                linkedHashMap.put(umVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(y8 y8Var) {
        y8Var.getClass();
        int a2 = y8Var.a();
        for (int i = 0; i < a2; i++) {
            byte d = y8Var.d(i);
            if (65 <= d && d < 91) {
                t8.y("PROTOCOL_ERROR response malformed: mixed case name: ".concat(y8Var.h()));
                return;
            }
        }
    }
}
