package J1;

import L1.m;
import U.i;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final String f1151c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f1152d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1153e;

    /* renamed from: a, reason: collision with root package name */
    public final String f1154a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1155b;

    static {
        String q4 = i.q("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f1151c = q4;
        i.q("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        i.q("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f1152d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new I1.b("proto"), new I1.b("json"))));
        f1153e = new a(q4, null);
    }

    public a(String str, String str2) {
        this.f1154a = str;
        this.f1155b = str2;
    }

    public static a a(byte[] bArr) {
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
        return new a(str2, str3);
    }
}
