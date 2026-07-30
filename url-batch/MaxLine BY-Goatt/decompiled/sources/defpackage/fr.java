package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fr {
    public static final String c;
    public static final Set d;
    public static final fr e;
    public static final fr f;
    public final String a;
    public final String b;

    static {
        String h = ij2.h("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = h;
        String h2 = ij2.h("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String h3 = ij2.h("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new kh0("proto"), new kh0("json"))));
        e = new fr(h, null);
        f = new fr(h2, h3);
    }

    public fr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static fr a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            lh.e("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            lh.e("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            lh.e("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new fr(str2, str3.isEmpty() ? null : str3);
    }
}
