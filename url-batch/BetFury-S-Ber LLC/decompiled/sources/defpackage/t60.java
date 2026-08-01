package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class t60 {
    public static u60 a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str.getClass();
        u60 u60Var = u60.HTTP_1_0;
        str2 = u60Var.protocol;
        if (str.equals(str2)) {
            return u60Var;
        }
        u60 u60Var2 = u60.HTTP_1_1;
        str3 = u60Var2.protocol;
        if (str.equals(str3)) {
            return u60Var2;
        }
        u60 u60Var3 = u60.H2_PRIOR_KNOWLEDGE;
        str4 = u60Var3.protocol;
        if (str.equals(str4)) {
            return u60Var3;
        }
        u60 u60Var4 = u60.HTTP_2;
        str5 = u60Var4.protocol;
        if (str.equals(str5)) {
            return u60Var4;
        }
        u60 u60Var5 = u60.SPDY_3;
        str6 = u60Var5.protocol;
        if (str.equals(str6)) {
            return u60Var5;
        }
        u60 u60Var6 = u60.QUIC;
        str7 = u60Var6.protocol;
        if (str.equals(str7)) {
            return u60Var6;
        }
        s9.w("Unexpected protocol: ".concat(str));
        return null;
    }
}
