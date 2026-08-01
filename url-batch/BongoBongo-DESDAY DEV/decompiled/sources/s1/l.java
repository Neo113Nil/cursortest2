package s1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f3648j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f3649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3651c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3652e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3653f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3654g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3655h;
    public final boolean i;

    public l(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        h1.d.e(str, "scheme");
        h1.d.e(str4, "host");
        this.f3649a = str;
        this.f3650b = str2;
        this.f3651c = str3;
        this.d = str4;
        this.f3652e = i;
        this.f3653f = arrayList2;
        this.f3654g = str5;
        this.f3655h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f3651c.length() == 0) {
            return "";
        }
        int length = this.f3649a.length() + 3;
        String str = this.f3655h;
        String substring = str.substring(o1.d.D(str, ':', length, false, 4) + 1, o1.d.D(str, '@', 0, false, 6));
        h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f3649a.length() + 3;
        String str = this.f3655h;
        int D2 = o1.d.D(str, '/', length, false, 4);
        String substring = str.substring(D2, t1.b.e(str, "?#", D2, str.length()));
        h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f3649a.length() + 3;
        String str = this.f3655h;
        int D2 = o1.d.D(str, '/', length, false, 4);
        int e2 = t1.b.e(str, "?#", D2, str.length());
        ArrayList arrayList = new ArrayList();
        while (D2 < e2) {
            int i = D2 + 1;
            int d = t1.b.d(str, '/', i, e2);
            String substring = str.substring(i, d);
            h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            D2 = d;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f3653f == null) {
            return null;
        }
        String str = this.f3655h;
        int D2 = o1.d.D(str, '?', 0, false, 6) + 1;
        String substring = str.substring(D2, t1.b.d(str, '#', D2, str.length()));
        h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f3650b.length() == 0) {
            return "";
        }
        int length = this.f3649a.length() + 3;
        String str = this.f3655h;
        String substring = str.substring(length, t1.b.e(str, ":@", length, str.length()));
        h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && h1.d.a(((l) obj).f3655h, this.f3655h);
    }

    public final String f() {
        k kVar;
        try {
            kVar = new k();
            kVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        h1.d.b(kVar);
        kVar.f3642b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        kVar.f3643c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return kVar.a().f3655h;
    }

    public final URI g() {
        String substring;
        String str;
        k kVar = new k();
        String str2 = this.f3649a;
        kVar.f3641a = str2;
        kVar.f3642b = e();
        kVar.f3643c = a();
        kVar.d = this.d;
        h1.d.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.f3652e;
        kVar.f3644e = i2 != i ? i2 : -1;
        ArrayList arrayList = kVar.f3645f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        kVar.f3646g = d != null ? b.f(b.b(d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f3654g == null) {
            substring = null;
        } else {
            String str3 = this.f3655h;
            substring = str3.substring(o1.d.D(str3, '#', 0, false, 6) + 1);
            h1.d.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        kVar.f3647h = substring;
        String str4 = kVar.d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            h1.d.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            h1.d.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        kVar.d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = kVar.f3646g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str6 = kVar.f3647h;
        kVar.f3647h = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String kVar2 = kVar.toString();
        try {
            return new URI(kVar2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                h1.d.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(kVar2).replaceAll("");
                h1.d.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                h1.d.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f3655h.hashCode();
    }

    public final String toString() {
        return this.f3655h;
    }
}
