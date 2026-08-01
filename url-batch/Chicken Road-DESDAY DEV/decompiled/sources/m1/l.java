package m1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f3182j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f3183a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3184b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3185c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3186e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3187f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3188g;
    public final String h;
    public final boolean i;

    public l(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        b1.d.e(str, "scheme");
        b1.d.e(str4, "host");
        this.f3183a = str;
        this.f3184b = str2;
        this.f3185c = str3;
        this.d = str4;
        this.f3186e = i;
        this.f3187f = arrayList2;
        this.f3188g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f3185c.length() == 0) {
            return "";
        }
        int length = this.f3183a.length() + 3;
        String str = this.h;
        String substring = str.substring(i1.d.t0(str, ':', length, false, 4) + 1, i1.d.t0(str, '@', 0, false, 6));
        b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f3183a.length() + 3;
        String str = this.h;
        int t02 = i1.d.t0(str, '/', length, false, 4);
        String substring = str.substring(t02, n1.b.e(str, "?#", t02, str.length()));
        b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f3183a.length() + 3;
        String str = this.h;
        int t02 = i1.d.t0(str, '/', length, false, 4);
        int e2 = n1.b.e(str, "?#", t02, str.length());
        ArrayList arrayList = new ArrayList();
        while (t02 < e2) {
            int i = t02 + 1;
            int d = n1.b.d(str, '/', i, e2);
            String substring = str.substring(i, d);
            b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            t02 = d;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f3187f == null) {
            return null;
        }
        String str = this.h;
        int t02 = i1.d.t0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(t02, n1.b.d(str, '#', t02, str.length()));
        b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f3184b.length() == 0) {
            return "";
        }
        int length = this.f3183a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, n1.b.e(str, ":@", length, str.length()));
        b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && b1.d.a(((l) obj).h, this.h);
    }

    public final String f() {
        k kVar;
        try {
            kVar = new k();
            kVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        b1.d.b(kVar);
        kVar.f3177b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        kVar.f3178c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return kVar.a().h;
    }

    public final URI g() {
        String substring;
        String str;
        k kVar = new k();
        String str2 = this.f3183a;
        kVar.f3176a = str2;
        kVar.f3177b = e();
        kVar.f3178c = a();
        kVar.d = this.d;
        b1.d.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.f3186e;
        kVar.f3179e = i2 != i ? i2 : -1;
        ArrayList arrayList = kVar.f3180f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        kVar.f3181g = d != null ? b.f(b.b(d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f3188g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(i1.d.t0(str3, '#', 0, false, 6) + 1);
            b1.d.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        kVar.h = substring;
        String str4 = kVar.d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            b1.d.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            b1.d.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        kVar.d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = kVar.f3181g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str6 = kVar.h;
        kVar.h = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String kVar2 = kVar.toString();
        try {
            return new URI(kVar2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                b1.d.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(kVar2).replaceAll("");
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
