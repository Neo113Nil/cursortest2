package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class sk0 {
    public static final fj0[] PxuCJdSBwIXG;
    public static final Map lS5Rgt96tfkO;

    static {
        fj0 fj0Var = new fj0(fj0.OPXfSBeufaJ8, "");
        ah ahVar = fj0.a92UlCVFR9N8;
        fj0 fj0Var2 = new fj0(ahVar, "GET");
        fj0 fj0Var3 = new fj0(ahVar, "POST");
        ah ahVar2 = fj0.RAsUl2FVSrh6;
        fj0 fj0Var4 = new fj0(ahVar2, "/");
        fj0 fj0Var5 = new fj0(ahVar2, "/index.html");
        ah ahVar3 = fj0.rtx2ld2ELZv4;
        fj0 fj0Var6 = new fj0(ahVar3, "http");
        fj0 fj0Var7 = new fj0(ahVar3, "https");
        ah ahVar4 = fj0.e9gEMXR7LXtO;
        fj0[] fj0VarArr = {fj0Var, fj0Var2, fj0Var3, fj0Var4, fj0Var5, fj0Var6, fj0Var7, new fj0(ahVar4, "200"), new fj0(ahVar4, "204"), new fj0(ahVar4, "206"), new fj0(ahVar4, "304"), new fj0(ahVar4, "400"), new fj0(ahVar4, "404"), new fj0(ahVar4, "500"), new fj0("accept-charset", ""), new fj0("accept-encoding", "gzip, deflate"), new fj0("accept-language", ""), new fj0("accept-ranges", ""), new fj0("accept", ""), new fj0("access-control-allow-origin", ""), new fj0("age", ""), new fj0("allow", ""), new fj0("authorization", ""), new fj0("cache-control", ""), new fj0("content-disposition", ""), new fj0("content-encoding", ""), new fj0("content-language", ""), new fj0("content-length", ""), new fj0("content-location", ""), new fj0("content-range", ""), new fj0("content-type", ""), new fj0("cookie", ""), new fj0("date", ""), new fj0("etag", ""), new fj0("expect", ""), new fj0("expires", ""), new fj0("from", ""), new fj0("host", ""), new fj0("if-match", ""), new fj0("if-modified-since", ""), new fj0("if-none-match", ""), new fj0("if-range", ""), new fj0("if-unmodified-since", ""), new fj0("last-modified", ""), new fj0("link", ""), new fj0("location", ""), new fj0("max-forwards", ""), new fj0("proxy-authenticate", ""), new fj0("proxy-authorization", ""), new fj0("range", ""), new fj0("referer", ""), new fj0("refresh", ""), new fj0("retry-after", ""), new fj0("server", ""), new fj0("set-cookie", ""), new fj0("strict-transport-security", ""), new fj0("transfer-encoding", ""), new fj0("user-agent", ""), new fj0("vary", ""), new fj0("via", ""), new fj0("www-authenticate", "")};
        PxuCJdSBwIXG = fj0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(fj0VarArr[i].PxuCJdSBwIXG)) {
                linkedHashMap.put(fj0VarArr[i].PxuCJdSBwIXG, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        lS5Rgt96tfkO = unmodifiableMap;
    }

    public static void PxuCJdSBwIXG(ah ahVar) {
        ahVar.getClass();
        int TSizfFm2Yiuu = ahVar.TSizfFm2Yiuu();
        for (int i = 0; i < TSizfFm2Yiuu; i++) {
            byte a92UlCVFR9N8 = ahVar.a92UlCVFR9N8(i);
            if (65 <= a92UlCVFR9N8 && a92UlCVFR9N8 < 91) {
                u9.S9EYkSpbGuxq("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ahVar.x50lh2ztY7Y5()));
                return;
            }
        }
    }
}
