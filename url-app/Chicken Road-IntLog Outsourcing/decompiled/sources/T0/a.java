package T0;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f2763c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f2764d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2765e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f2766f;

    /* renamed from: a, reason: collision with root package name */
    public final String f2767a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2768b;

    static {
        String s2 = AbstractC1477a.s("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f2763c = s2;
        String s4 = AbstractC1477a.s("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String s5 = AbstractC1477a.s("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f2764d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new S0.c("proto"), new S0.c("json"))));
        f2765e = new a(s2, null);
        f2766f = new a(s4, s5);
    }

    public a(String str, String str2) {
        this.f2767a = str;
        this.f2768b = str2;
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
