package c3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f1075j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f1076a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1077b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1078d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1079e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1080f;
    public final String g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1081i;

    public m(String str, String str2, String str3, String str4, int i4, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        u2.c.e(str, "scheme");
        u2.c.e(str4, "host");
        this.f1076a = str;
        this.f1077b = str2;
        this.c = str3;
        this.f1078d = str4;
        this.f1079e = i4;
        this.f1080f = arrayList2;
        this.g = str5;
        this.h = str6;
        this.f1081i = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.f1076a.length() + 3;
        String str = this.h;
        String substring = str.substring(b3.e.g0(str, ':', length, 4) + 1, b3.e.g0(str, '@', 0, 6));
        u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f1076a.length() + 3;
        String str = this.h;
        int g02 = b3.e.g0(str, '/', length, 4);
        String substring = str.substring(g02, d3.c.e(str, "?#", g02, str.length()));
        u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f1076a.length() + 3;
        String str = this.h;
        int g02 = b3.e.g0(str, '/', length, 4);
        int e4 = d3.c.e(str, "?#", g02, str.length());
        ArrayList arrayList = new ArrayList();
        while (g02 < e4) {
            int i4 = g02 + 1;
            int d4 = d3.c.d(str, '/', i4, e4);
            String substring = str.substring(i4, d4);
            u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            g02 = d4;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f1080f == null) {
            return null;
        }
        String str = this.h;
        int g02 = b3.e.g0(str, '?', 0, 6) + 1;
        String substring = str.substring(g02, d3.c.d(str, '#', g02, str.length()));
        u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f1077b.length() == 0) {
            return "";
        }
        int length = this.f1076a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, d3.c.e(str, ":@", length, str.length()));
        u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && u2.c.a(((m) obj).h, this.h);
    }

    public final String f() {
        l lVar;
        try {
            lVar = new l(0);
            lVar.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        u2.c.b(lVar);
        lVar.f1071d = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        lVar.f1072e = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return lVar.b().h;
    }

    public final URI g() {
        String substring;
        String str;
        l lVar = new l(0);
        ArrayList arrayList = (ArrayList) lVar.h;
        String str2 = this.f1076a;
        lVar.c = str2;
        lVar.f1071d = e();
        lVar.f1072e = a();
        lVar.f1073f = this.f1078d;
        u2.c.e(str2, "scheme");
        int i4 = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i5 = this.f1079e;
        lVar.f1070b = i5 != i4 ? i5 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String d4 = d();
        lVar.f1074i = d4 != null ? b.f(b.b(d4, 0, 0, " \"'<>#", 211)) : null;
        if (this.g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(b3.e.g0(str3, '#', 0, 6) + 1);
            u2.c.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        lVar.g = substring;
        String str4 = (String) lVar.f1073f;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            u2.c.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            u2.c.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        lVar.f1073f = str;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.set(i6, b.b((String) arrayList.get(i6), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = (ArrayList) lVar.f1074i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                String str5 = (String) arrayList2.get(i7);
                arrayList2.set(i7, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str6 = (String) lVar.g;
        lVar.g = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String lVar2 = lVar.toString();
        try {
            return new URI(lVar2);
        } catch (URISyntaxException e4) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                u2.c.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(lVar2).replaceAll("");
                u2.c.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                u2.c.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
