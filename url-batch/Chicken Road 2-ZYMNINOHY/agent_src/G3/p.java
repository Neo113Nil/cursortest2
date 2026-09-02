package G3;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f946j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f948b;

    /* renamed from: c, reason: collision with root package name */
    public final String f949c;

    /* renamed from: d, reason: collision with root package name */
    public final String f950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f951e;

    /* renamed from: f, reason: collision with root package name */
    public final List f952f;

    /* renamed from: g, reason: collision with root package name */
    public final String f953g;

    /* renamed from: h, reason: collision with root package name */
    public final String f954h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f955i;

    public p(String scheme, String str, String str2, String host, int i4, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        kotlin.jvm.internal.i.e(scheme, "scheme");
        kotlin.jvm.internal.i.e(host, "host");
        this.f947a = scheme;
        this.f948b = str;
        this.f949c = str2;
        this.f950d = host;
        this.f951e = i4;
        this.f952f = arrayList2;
        this.f953g = str3;
        this.f954h = str4;
        this.f955i = scheme.equals("https");
    }

    public final String a() {
        if (this.f949c.length() == 0) {
            return "";
        }
        int length = this.f947a.length() + 3;
        String str = this.f954h;
        String substring = str.substring(AbstractC1510g.g0(str, ':', length, 4) + 1, AbstractC1510g.g0(str, '@', 0, 6));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f947a.length() + 3;
        String str = this.f954h;
        int g02 = AbstractC1510g.g0(str, IOUtils.DIR_SEPARATOR_UNIX, length, 4);
        String substring = str.substring(g02, H3.b.e(g02, str.length(), str, "?#"));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f947a.length() + 3;
        String str = this.f954h;
        int g02 = AbstractC1510g.g0(str, IOUtils.DIR_SEPARATOR_UNIX, length, 4);
        int e4 = H3.b.e(g02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (g02 < e4) {
            int i4 = g02 + 1;
            int f4 = H3.b.f(str, IOUtils.DIR_SEPARATOR_UNIX, i4, e4);
            String substring = str.substring(i4, f4);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            g02 = f4;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f952f == null) {
            return null;
        }
        String str = this.f954h;
        int g02 = AbstractC1510g.g0(str, '?', 0, 6) + 1;
        String substring = str.substring(g02, H3.b.f(str, '#', g02, str.length()));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f948b.length() == 0) {
            return "";
        }
        int length = this.f947a.length() + 3;
        String str = this.f954h;
        String substring = str.substring(length, H3.b.e(length, str.length(), str, ":@"));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && kotlin.jvm.internal.i.a(((p) obj).f954h, this.f954h);
    }

    public final URI f() {
        String substring;
        String replaceAll;
        o oVar = new o();
        String scheme = this.f947a;
        oVar.f938a = scheme;
        oVar.f939b = e();
        oVar.f940c = a();
        oVar.f941d = this.f950d;
        kotlin.jvm.internal.i.e(scheme, "scheme");
        int i4 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i5 = this.f951e;
        oVar.f942e = i5 != i4 ? i5 : -1;
        ArrayList arrayList = oVar.f943f;
        arrayList.clear();
        arrayList.addAll(c());
        String d4 = d();
        oVar.f944g = d4 == null ? null : C0051b.g(C0051b.b(d4, 0, " \"'<>#", 0, 211));
        if (this.f953g == null) {
            substring = null;
        } else {
            String str = this.f954h;
            substring = str.substring(AbstractC1510g.g0(str, '#', 0, 6) + 1);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        oVar.f945h = substring;
        String str2 = oVar.f941d;
        if (str2 == null) {
            replaceAll = null;
        } else {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.i.d(compile, "compile(...)");
            replaceAll = compile.matcher(str2).replaceAll("");
            kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        }
        oVar.f941d = replaceAll;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.set(i6, C0051b.b((String) arrayList.get(i6), 0, "[]", 0, 227));
        }
        ArrayList arrayList2 = oVar.f944g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                int i8 = i7 + 1;
                String str3 = (String) arrayList2.get(i7);
                arrayList2.set(i7, str3 == null ? null : C0051b.b(str3, 0, "\\^`{|}", 0, 195));
                i7 = i8;
            }
        }
        String str4 = oVar.f945h;
        oVar.f945h = str4 != null ? C0051b.b(str4, 0, " \"#<>\\^`{|}", 0, 163) : null;
        String oVar2 = oVar.toString();
        try {
            return new URI(oVar2);
        } catch (URISyntaxException e4) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.i.d(compile2, "compile(...)");
                String replaceAll2 = compile2.matcher(oVar2).replaceAll("");
                kotlin.jvm.internal.i.d(replaceAll2, "replaceAll(...)");
                URI create = URI.create(replaceAll2);
                kotlin.jvm.internal.i.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final int hashCode() {
        return this.f954h.hashCode();
    }

    public final String toString() {
        return this.f954h;
    }
}
