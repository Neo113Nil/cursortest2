package m3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f8392j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f8393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8394b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8395c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8396d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8397e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8398f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8399g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8400h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8401i;

    public m(String scheme, String username, String password, String host, int i2, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f8393a = scheme;
        this.f8394b = username;
        this.f8395c = password;
        this.f8396d = host;
        this.f8397e = i2;
        this.f8398f = arrayList;
        this.f8399g = str;
        this.f8400h = url;
        this.f8401i = Intrinsics.a(scheme, "https");
    }

    public final String a() {
        if (this.f8395c.length() == 0) {
            return "";
        }
        int length = this.f8393a.length() + 3;
        String str = this.f8400h;
        String substring = str.substring(kotlin.text.y.u(str, ':', length, false, 4) + 1, kotlin.text.y.u(str, '@', 0, false, 6));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f8393a.length() + 3;
        String str = this.f8400h;
        int u4 = kotlin.text.y.u(str, '/', length, false, 4);
        String substring = str.substring(u4, n3.b.e(u4, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f8393a.length() + 3;
        String str = this.f8400h;
        int u4 = kotlin.text.y.u(str, '/', length, false, 4);
        int e4 = n3.b.e(u4, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (u4 < e4) {
            int i2 = u4 + 1;
            int f4 = n3.b.f(str, '/', i2, e4);
            String substring = str.substring(i2, f4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            u4 = f4;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f8398f == null) {
            return null;
        }
        String str = this.f8400h;
        int u4 = kotlin.text.y.u(str, '?', 0, false, 6) + 1;
        String substring = str.substring(u4, n3.b.f(str, '#', u4, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f8394b.length() == 0) {
            return "";
        }
        int length = this.f8393a.length() + 3;
        String str = this.f8400h;
        String substring = str.substring(length, n3.b.e(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && Intrinsics.a(((m) obj).f8400h, this.f8400h);
    }

    public final m1.k f() {
        String substring;
        m1.k kVar = new m1.k(1);
        String scheme = this.f8393a;
        kVar.f8283e = scheme;
        String e4 = e();
        Intrinsics.checkNotNullParameter(e4, "<set-?>");
        kVar.f8284f = e4;
        String a4 = a();
        Intrinsics.checkNotNullParameter(a4, "<set-?>");
        kVar.f8285g = a4;
        kVar.f8286h = this.f8396d;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        int i2 = Intrinsics.a(scheme, "http") ? 80 : Intrinsics.a(scheme, "https") ? 443 : -1;
        int i4 = this.f8397e;
        kVar.f8280b = i4 != i2 ? i4 : -1;
        ArrayList arrayList = kVar.f8281c;
        arrayList.clear();
        arrayList.addAll(c());
        kVar.l(d());
        if (this.f8399g == null) {
            substring = null;
        } else {
            String str = this.f8400h;
            substring = str.substring(kotlin.text.y.u(str, '#', 0, false, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        }
        kVar.f8287i = substring;
        return kVar;
    }

    public final URI g() {
        m1.k f4 = f();
        String str = (String) f4.f8286h;
        f4.f8286h = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        ArrayList arrayList = f4.f8281c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, j.b((String) arrayList.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = f4.f8282d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str2 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str2 != null ? j.b(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str3 = (String) f4.f8287i;
        f4.f8287i = str3 != null ? j.b(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String kVar = f4.toString();
        try {
            return new URI(kVar);
        } catch (URISyntaxException e4) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(kVar, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final int hashCode() {
        return this.f8400h.hashCode();
    }

    public final String toString() {
        return this.f8400h;
    }
}
