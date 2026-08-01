package m1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f3215j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f3216a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3217b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3218c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3219e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3220f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3221g;
    public final String h;
    public final boolean i;

    public m(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        b1.d.e(str, "scheme");
        b1.d.e(str4, "host");
        this.f3216a = str;
        this.f3217b = str2;
        this.f3218c = str3;
        this.d = str4;
        this.f3219e = i;
        this.f3220f = arrayList2;
        this.f3221g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f3218c.length() == 0) {
            return "";
        }
        int length = this.f3216a.length() + 3;
        String str = this.h;
        String substring = str.substring(i1.d.B0(str, ':', length, false, 4) + 1, i1.d.B0(str, '@', 0, false, 6));
        b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f3216a.length() + 3;
        String str = this.h;
        int B02 = i1.d.B0(str, '/', length, false, 4);
        String substring = str.substring(B02, n1.b.e(str, "?#", B02, str.length()));
        b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f3216a.length() + 3;
        String str = this.h;
        int B02 = i1.d.B0(str, '/', length, false, 4);
        int e2 = n1.b.e(str, "?#", B02, str.length());
        ArrayList arrayList = new ArrayList();
        while (B02 < e2) {
            int i = B02 + 1;
            int d = n1.b.d(str, '/', i, e2);
            String substring = str.substring(i, d);
            b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            B02 = d;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f3220f == null) {
            return null;
        }
        String str = this.h;
        int B02 = i1.d.B0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(B02, n1.b.d(str, '#', B02, str.length()));
        b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f3217b.length() == 0) {
            return "";
        }
        int length = this.f3216a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, n1.b.e(str, ":@", length, str.length()));
        b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && b1.d.a(((m) obj).h, this.h);
    }

    public final String f() {
        l lVar;
        try {
            lVar = new l();
            lVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        b1.d.b(lVar);
        lVar.f3210b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        lVar.f3211c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return lVar.a().h;
    }

    public final URI g() {
        String substring;
        String str;
        l lVar = new l();
        String str2 = this.f3216a;
        lVar.f3209a = str2;
        lVar.f3210b = e();
        lVar.f3211c = a();
        lVar.d = this.d;
        b1.d.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.f3219e;
        lVar.f3212e = i2 != i ? i2 : -1;
        ArrayList arrayList = lVar.f3213f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        lVar.f3214g = d != null ? b.f(b.b(d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f3221g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(i1.d.B0(str3, '#', 0, false, 6) + 1);
            b1.d.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        lVar.h = substring;
        String str4 = lVar.d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            b1.d.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            b1.d.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        lVar.d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = lVar.f3214g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str6 = lVar.h;
        lVar.h = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String lVar2 = lVar.toString();
        try {
            return new URI(lVar2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                b1.d.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(lVar2).replaceAll("");
                b1.d.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                b1.d.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
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
