package B0;

import D0.l;
import a.AbstractC0219a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final String f62c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f63d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f64e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f65f;

    /* renamed from: a, reason: collision with root package name */
    public final String f66a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67b;

    static {
        String x6 = AbstractC0219a.x("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f62c = x6;
        String x7 = AbstractC0219a.x("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String x8 = AbstractC0219a.x("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f63d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new A0.c("proto"), new A0.c("json"))));
        f64e = new a(x6, null);
        f65f = new a(x7, x8);
    }

    public a(String str, String str2) {
        this.f66a = str;
        this.f67b = str2;
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
