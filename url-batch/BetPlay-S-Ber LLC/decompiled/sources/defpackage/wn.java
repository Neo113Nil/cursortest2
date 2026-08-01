package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class wn {
    public static final mn[] a;
    public static final Map b;

    static {
        mn mnVar = new mn(mn.i, "");
        t8 t8Var = mn.f;
        mn mnVar2 = new mn(t8Var, "GET");
        mn mnVar3 = new mn(t8Var, "POST");
        t8 t8Var2 = mn.g;
        mn mnVar4 = new mn(t8Var2, "/");
        mn mnVar5 = new mn(t8Var2, "/index.html");
        t8 t8Var3 = mn.h;
        mn mnVar6 = new mn(t8Var3, "http");
        mn mnVar7 = new mn(t8Var3, "https");
        t8 t8Var4 = mn.e;
        mn[] mnVarArr = {mnVar, mnVar2, mnVar3, mnVar4, mnVar5, mnVar6, mnVar7, new mn(t8Var4, "200"), new mn(t8Var4, "204"), new mn(t8Var4, "206"), new mn(t8Var4, "304"), new mn(t8Var4, "400"), new mn(t8Var4, "404"), new mn(t8Var4, "500"), new mn("accept-charset", ""), new mn("accept-encoding", "gzip, deflate"), new mn("accept-language", ""), new mn("accept-ranges", ""), new mn("accept", ""), new mn("access-control-allow-origin", ""), new mn("age", ""), new mn("allow", ""), new mn("authorization", ""), new mn("cache-control", ""), new mn("content-disposition", ""), new mn("content-encoding", ""), new mn("content-language", ""), new mn("content-length", ""), new mn("content-location", ""), new mn("content-range", ""), new mn("content-type", ""), new mn("cookie", ""), new mn("date", ""), new mn("etag", ""), new mn("expect", ""), new mn("expires", ""), new mn("from", ""), new mn("host", ""), new mn("if-match", ""), new mn("if-modified-since", ""), new mn("if-none-match", ""), new mn("if-range", ""), new mn("if-unmodified-since", ""), new mn("last-modified", ""), new mn("link", ""), new mn("location", ""), new mn("max-forwards", ""), new mn("proxy-authenticate", ""), new mn("proxy-authorization", ""), new mn("range", ""), new mn("referer", ""), new mn("refresh", ""), new mn("retry-after", ""), new mn("server", ""), new mn("set-cookie", ""), new mn("strict-transport-security", ""), new mn("transfer-encoding", ""), new mn("user-agent", ""), new mn("vary", ""), new mn("via", ""), new mn("www-authenticate", "")};
        a = mnVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(mnVarArr[i].a)) {
                linkedHashMap.put(mnVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(t8 t8Var) {
        t8Var.getClass();
        int a2 = t8Var.a();
        for (int i = 0; i < a2; i++) {
            byte d = t8Var.d(i);
            if (65 <= d && d < 91) {
                o8.x("PROTOCOL_ERROR response malformed: mixed case name: ".concat(t8Var.h()));
                return;
            }
        }
    }
}
