package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class tp {
    public static final gp[] a;
    public static final Map b;

    static {
        gp gpVar = new gp(gp.i, "");
        l9 l9Var = gp.f;
        gp gpVar2 = new gp(l9Var, "GET");
        gp gpVar3 = new gp(l9Var, "POST");
        l9 l9Var2 = gp.g;
        gp gpVar4 = new gp(l9Var2, "/");
        gp gpVar5 = new gp(l9Var2, "/index.html");
        l9 l9Var3 = gp.h;
        gp gpVar6 = new gp(l9Var3, "http");
        gp gpVar7 = new gp(l9Var3, "https");
        l9 l9Var4 = gp.e;
        gp[] gpVarArr = {gpVar, gpVar2, gpVar3, gpVar4, gpVar5, gpVar6, gpVar7, new gp(l9Var4, "200"), new gp(l9Var4, "204"), new gp(l9Var4, "206"), new gp(l9Var4, "304"), new gp(l9Var4, "400"), new gp(l9Var4, "404"), new gp(l9Var4, "500"), new gp("accept-charset", ""), new gp("accept-encoding", "gzip, deflate"), new gp("accept-language", ""), new gp("accept-ranges", ""), new gp("accept", ""), new gp("access-control-allow-origin", ""), new gp("age", ""), new gp("allow", ""), new gp("authorization", ""), new gp("cache-control", ""), new gp("content-disposition", ""), new gp("content-encoding", ""), new gp("content-language", ""), new gp("content-length", ""), new gp("content-location", ""), new gp("content-range", ""), new gp("content-type", ""), new gp("cookie", ""), new gp("date", ""), new gp("etag", ""), new gp("expect", ""), new gp("expires", ""), new gp("from", ""), new gp("host", ""), new gp("if-match", ""), new gp("if-modified-since", ""), new gp("if-none-match", ""), new gp("if-range", ""), new gp("if-unmodified-since", ""), new gp("last-modified", ""), new gp("link", ""), new gp("location", ""), new gp("max-forwards", ""), new gp("proxy-authenticate", ""), new gp("proxy-authorization", ""), new gp("range", ""), new gp("referer", ""), new gp("refresh", ""), new gp("retry-after", ""), new gp("server", ""), new gp("set-cookie", ""), new gp("strict-transport-security", ""), new gp("transfer-encoding", ""), new gp("user-agent", ""), new gp("vary", ""), new gp("via", ""), new gp("www-authenticate", "")};
        a = gpVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(gpVarArr[i].a)) {
                linkedHashMap.put(gpVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(l9 l9Var) {
        l9Var.getClass();
        int a2 = l9Var.a();
        for (int i = 0; i < a2; i++) {
            byte d = l9Var.d(i);
            if (65 <= d && d < 91) {
                g9.w("PROTOCOL_ERROR response malformed: mixed case name: ".concat(l9Var.h()));
                return;
            }
        }
    }
}
