package X1;

import W2.e;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3810c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f3811d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3812e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f3813f;

    /* renamed from: a, reason: collision with root package name */
    public final String f3814a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3815b;

    static {
        String m8 = e.m("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f3810c = m8;
        String m9 = e.m("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String m10 = e.m("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f3811d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new W1.c("proto"), new W1.c("json"))));
        f3812e = new a(m8, null);
        f3813f = new a(m9, m10);
    }

    public a(String str, String str2) {
        this.f3814a = str;
        this.f3815b = str2;
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
