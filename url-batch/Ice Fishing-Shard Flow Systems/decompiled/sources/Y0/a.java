package Y0;

import a.AbstractC0169a;
import a1.k;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f2895c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f2896d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2897e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f2898f;

    /* renamed from: a, reason: collision with root package name */
    public final String f2899a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2900b;

    static {
        String r7 = AbstractC0169a.r("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f2895c = r7;
        String r8 = AbstractC0169a.r("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String r9 = AbstractC0169a.r("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f2896d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new X0.c("proto"), new X0.c("json"))));
        f2897e = new a(r7, null);
        f2898f = new a(r8, r9);
    }

    public a(String str, String str2) {
        this.f2899a = str;
        this.f2900b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
