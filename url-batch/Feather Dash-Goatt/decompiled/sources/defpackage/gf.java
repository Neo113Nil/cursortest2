package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gf {
    public static final String c;
    public static final Set d;
    public static final gf e;
    public static final gf f;
    public final String a;
    public final String b;

    static {
        String w = y90.w("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = w;
        String w2 = y90.w("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String w3 = y90.w("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new vv("proto"), new vv("json"))));
        e = new gf(w, null);
        f = new gf(w2, w3);
    }

    public gf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static gf a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            dd0.e("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            dd0.e("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            dd0.e("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new gf(str2, str3.isEmpty() ? null : str3);
    }
}
