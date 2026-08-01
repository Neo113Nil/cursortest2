package z1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f4692j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f4693a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4694b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4695c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4696e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4697f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4698g;
    public final String h;
    public final boolean i;

    public l(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        k1.e.e(str, "scheme");
        k1.e.e(str4, "host");
        this.f4693a = str;
        this.f4694b = str2;
        this.f4695c = str3;
        this.d = str4;
        this.f4696e = i;
        this.f4697f = arrayList2;
        this.f4698g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f4695c.length() == 0) {
            return "";
        }
        int length = this.f4693a.length() + 3;
        String str = this.h;
        String substring = str.substring(r1.d.I(str, ':', length, false, 4) + 1, r1.d.I(str, '@', 0, false, 6));
        k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f4693a.length() + 3;
        String str = this.h;
        int I2 = r1.d.I(str, '/', length, false, 4);
        String substring = str.substring(I2, A1.c.d(I2, str.length(), str, "?#"));
        k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f4693a.length() + 3;
        String str = this.h;
        int I2 = r1.d.I(str, '/', length, false, 4);
        int d = A1.c.d(I2, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (I2 < d) {
            int i = I2 + 1;
            int e2 = A1.c.e(str, '/', i, d);
            String substring = str.substring(i, e2);
            k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            I2 = e2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f4697f == null) {
            return null;
        }
        String str = this.h;
        int I2 = r1.d.I(str, '?', 0, false, 6) + 1;
        String substring = str.substring(I2, A1.c.e(str, '#', I2, str.length()));
        k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f4694b.length() == 0) {
            return "";
        }
        int length = this.f4693a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, A1.c.d(length, str.length(), str, ":@"));
        k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && k1.e.a(((l) obj).h, this.h);
    }

    public final String f() {
        k kVar;
        try {
            kVar = new k();
            kVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        k1.e.b(kVar);
        kVar.f4687b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        kVar.f4688c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return kVar.a().h;
    }

    public final URI g() {
        String substring;
        String str;
        k kVar = new k();
        String str2 = this.f4693a;
        kVar.f4686a = str2;
        kVar.f4687b = e();
        kVar.f4688c = a();
        kVar.d = this.d;
        k1.e.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.f4696e;
        kVar.f4689e = i2 != i ? i2 : -1;
        ArrayList arrayList = kVar.f4690f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        kVar.f4691g = d != null ? b.f(b.b(d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f4698g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(r1.d.I(str3, '#', 0, false, 6) + 1);
            k1.e.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        kVar.h = substring;
        String str4 = kVar.d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            k1.e.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            k1.e.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        kVar.d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = kVar.f4691g;
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
                k1.e.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(kVar2).replaceAll("");
                k1.e.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                k1.e.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
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
