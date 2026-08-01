package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mi0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ni0 a(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return ni0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return ni0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return ni0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return ni0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return ni0.SSL_3_0;
        }
        s9.k("Unexpected TLS version: ".concat(str));
        return null;
    }
}
