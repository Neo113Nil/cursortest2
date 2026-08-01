package i6;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4647c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f4648d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4649e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f4650f;

    /* renamed from: a, reason: collision with root package name */
    public final String f4651a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4652b;

    static {
        String X = i7.a.X("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4647c = X;
        String X2 = i7.a.X("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String X3 = i7.a.X("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4648d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new h6.c("proto"), new h6.c("json"))));
        f4649e = new a(X, null);
        f4650f = new a(X2, X3);
    }

    public a(String str, String str2) {
        this.f4651a = str;
        this.f4652b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            a1.e("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            a1.e("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            a1.e("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
