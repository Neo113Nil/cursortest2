package G2;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f2214j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f2215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2216b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2217c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2218d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2219e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2220f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2221g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2222h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2223i;

    public n(String str, String str2, String str3, String str4, int i3, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        f2.j.f(str, "scheme");
        f2.j.f(str4, "host");
        this.f2215a = str;
        this.f2216b = str2;
        this.f2217c = str3;
        this.f2218d = str4;
        this.f2219e = i3;
        this.f2220f = arrayList2;
        this.f2221g = str5;
        this.f2222h = str6;
        this.f2223i = str.equals("https");
    }

    public final String a() {
        if (this.f2217c.length() == 0) {
            return "";
        }
        int length = this.f2215a.length() + 3;
        String str = this.f2222h;
        String substring = str.substring(AbstractC0730j.H(str, ':', length, false, 4) + 1, AbstractC0730j.H(str, '@', 0, false, 6));
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f2215a.length() + 3;
        String str = this.f2222h;
        int H3 = AbstractC0730j.H(str, '/', length, false, 4);
        String substring = str.substring(H3, H2.b.e(H3, str.length(), str, "?#"));
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f2215a.length() + 3;
        String str = this.f2222h;
        int H3 = AbstractC0730j.H(str, '/', length, false, 4);
        int e3 = H2.b.e(H3, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (H3 < e3) {
            int i3 = H3 + 1;
            int f3 = H2.b.f(str, '/', i3, e3);
            String substring = str.substring(i3, f3);
            f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            H3 = f3;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f2220f == null) {
            return null;
        }
        String str = this.f2222h;
        int H3 = AbstractC0730j.H(str, '?', 0, false, 6) + 1;
        String substring = str.substring(H3, H2.b.f(str, '#', H3, str.length()));
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f2216b.length() == 0) {
            return "";
        }
        int length = this.f2215a.length() + 3;
        String str = this.f2222h;
        String substring = str.substring(length, H2.b.e(length, str.length(), str, ":@"));
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && f2.j.a(((n) obj).f2222h, this.f2222h);
    }

    public final m f() {
        m mVar = new m();
        String str = this.f2215a;
        mVar.f2209e = str;
        mVar.f2210f = e();
        mVar.f2211g = a();
        mVar.f2212h = this.f2218d;
        f2.j.f(str, "scheme");
        int i3 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i4 = this.f2219e;
        mVar.f2207c = i4 != i3 ? i4 : -1;
        ArrayList arrayList = mVar.f2206b;
        arrayList.clear();
        arrayList.addAll(c());
        String d3 = d();
        String str2 = null;
        mVar.f2208d = d3 != null ? b.f(b.b(d3, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f2221g != null) {
            String str3 = this.f2222h;
            str2 = str3.substring(AbstractC0730j.H(str3, '#', 0, false, 6) + 1);
            f2.j.e(str2, "this as java.lang.String).substring(startIndex)");
        }
        mVar.f2213i = str2;
        return mVar;
    }

    public final URI g() {
        String str;
        m f3 = f();
        String str2 = (String) f3.f2212h;
        if (str2 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            f2.j.e(compile, "compile(...)");
            str = compile.matcher(str2).replaceAll("");
            f2.j.e(str, "replaceAll(...)");
        } else {
            str = null;
        }
        f3.f2212h = str;
        ArrayList arrayList = f3.f2206b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = f3.f2208d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str3 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str3 != null ? b.b(str3, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str4 = (String) f3.f2213i;
        f3.f2213i = str4 != null ? b.b(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String mVar = f3.toString();
        try {
            return new URI(mVar);
        } catch (URISyntaxException e3) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                f2.j.e(compile2, "compile(...)");
                String replaceAll = compile2.matcher(mVar).replaceAll("");
                f2.j.e(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                f2.j.e(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final int hashCode() {
        return this.f2222h.hashCode();
    }

    public final String toString() {
        return this.f2222h;
    }
}
