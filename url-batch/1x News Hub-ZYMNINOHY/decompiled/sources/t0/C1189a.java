package t0;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import s0.C1185b;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f10356c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f10357d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1189a f10358e;

    /* renamed from: a, reason: collision with root package name */
    public final String f10359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10360b;

    static {
        String C3 = android.support.v4.media.session.a.C("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f10356c = C3;
        android.support.v4.media.session.a.C("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        android.support.v4.media.session.a.C("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f10357d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1185b("proto"), new C1185b("json"))));
        f10358e = new C1189a(C3, null);
    }

    public C1189a(String str, String str2) {
        this.f10359a = str;
        this.f10360b = str2;
    }

    public static C1189a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(CharEncoding.UTF_8));
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
        return new C1189a(str2, str3);
    }
}
