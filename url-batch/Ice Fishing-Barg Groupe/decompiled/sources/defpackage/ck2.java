package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ck2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static dk2 PxuCJdSBwIXG(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return dk2.dgRBjINgWbAK;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return dk2.wdg6QnbFHrFF;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return dk2.OPXfSBeufaJ8;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return dk2.x50lh2ztY7Y5;
            }
        } else if (str.equals("SSLv3")) {
            return dk2.cpQdD2nAriOS;
        }
        u9.XL4ISE6Oc65B("Unexpected TLS version: ".concat(str));
        return null;
    }
}
