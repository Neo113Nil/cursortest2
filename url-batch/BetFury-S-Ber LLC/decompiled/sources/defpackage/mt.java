package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class mt {
    public static final xs[] a;
    public static final Map b;

    static {
        xs xsVar = new xs(xs.i, "");
        y9 y9Var = xs.f;
        xs xsVar2 = new xs(y9Var, "GET");
        xs xsVar3 = new xs(y9Var, "POST");
        y9 y9Var2 = xs.g;
        xs xsVar4 = new xs(y9Var2, "/");
        xs xsVar5 = new xs(y9Var2, "/index.html");
        y9 y9Var3 = xs.h;
        xs xsVar6 = new xs(y9Var3, "http");
        xs xsVar7 = new xs(y9Var3, "https");
        y9 y9Var4 = xs.e;
        xs[] xsVarArr = {xsVar, xsVar2, xsVar3, xsVar4, xsVar5, xsVar6, xsVar7, new xs(y9Var4, "200"), new xs(y9Var4, "204"), new xs(y9Var4, "206"), new xs(y9Var4, "304"), new xs(y9Var4, "400"), new xs(y9Var4, "404"), new xs(y9Var4, "500"), new xs("accept-charset", ""), new xs("accept-encoding", "gzip, deflate"), new xs("accept-language", ""), new xs("accept-ranges", ""), new xs("accept", ""), new xs("access-control-allow-origin", ""), new xs("age", ""), new xs("allow", ""), new xs("authorization", ""), new xs("cache-control", ""), new xs("content-disposition", ""), new xs("content-encoding", ""), new xs("content-language", ""), new xs("content-length", ""), new xs("content-location", ""), new xs("content-range", ""), new xs("content-type", ""), new xs("cookie", ""), new xs("date", ""), new xs("etag", ""), new xs("expect", ""), new xs("expires", ""), new xs("from", ""), new xs("host", ""), new xs("if-match", ""), new xs("if-modified-since", ""), new xs("if-none-match", ""), new xs("if-range", ""), new xs("if-unmodified-since", ""), new xs("last-modified", ""), new xs("link", ""), new xs("location", ""), new xs("max-forwards", ""), new xs("proxy-authenticate", ""), new xs("proxy-authorization", ""), new xs("range", ""), new xs("referer", ""), new xs("refresh", ""), new xs("retry-after", ""), new xs("server", ""), new xs("set-cookie", ""), new xs("strict-transport-security", ""), new xs("transfer-encoding", ""), new xs("user-agent", ""), new xs("vary", ""), new xs("via", ""), new xs("www-authenticate", "")};
        a = xsVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(xsVarArr[i].a)) {
                linkedHashMap.put(xsVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(y9 y9Var) {
        y9Var.getClass();
        int a2 = y9Var.a();
        for (int i = 0; i < a2; i++) {
            byte d = y9Var.d(i);
            if (65 <= d && d < 91) {
                s9.w("PROTOCOL_ERROR response malformed: mixed case name: ".concat(y9Var.h()));
                return;
            }
        }
    }
}
