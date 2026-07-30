package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xj {
    public static final yj PxuCJdSBwIXG(xj xjVar, String str) {
        yj yjVar = new yj(str);
        yj.TSizfFm2Yiuu.put(str, yjVar);
        return yjVar;
    }

    public final synchronized yj lS5Rgt96tfkO(String str) {
        yj yjVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = yj.TSizfFm2Yiuu;
            yjVar = (yj) linkedHashMap.get(str);
            if (yjVar == null) {
                yjVar = (yj) linkedHashMap.get(pa2.yQRudnv4La6p(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : pa2.yQRudnv4La6p(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (yjVar == null) {
                    yjVar = new yj(str);
                }
                linkedHashMap.put(str, yjVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return yjVar;
    }
}
