package s7;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f8607j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f8608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8610c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8611d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8612e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8613f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8614g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8615h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8616i;

    public l(String str, String str2, String str3, String str4, int i7, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        r6.k.f(str, "scheme");
        r6.k.f(str4, "host");
        this.f8608a = str;
        this.f8609b = str2;
        this.f8610c = str3;
        this.f8611d = str4;
        this.f8612e = i7;
        this.f8613f = arrayList2;
        this.f8614g = str5;
        this.f8615h = str6;
        this.f8616i = str.equals("https");
    }

    public final String a() {
        if (this.f8610c.length() == 0) {
            return "";
        }
        int length = this.f8608a.length() + 3;
        String str = this.f8615h;
        String substring = str.substring(z6.h.D(str, ':', length, 4) + 1, z6.h.D(str, '@', 0, 6));
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f8608a.length() + 3;
        String str = this.f8615h;
        int D = z6.h.D(str, '/', length, 4);
        String substring = str.substring(D, t7.b.e(D, str.length(), str, "?#"));
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f8608a.length() + 3;
        String str = this.f8615h;
        int D = z6.h.D(str, '/', length, 4);
        int e9 = t7.b.e(D, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (D < e9) {
            int i7 = D + 1;
            int f9 = t7.b.f(str, '/', i7, e9);
            String substring = str.substring(i7, f9);
            r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            D = f9;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f8613f == null) {
            return null;
        }
        String str = this.f8615h;
        int D = z6.h.D(str, '?', 0, 6) + 1;
        String substring = str.substring(D, t7.b.f(str, '#', D, str.length()));
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f8609b.length() == 0) {
            return "";
        }
        int length = this.f8608a.length() + 3;
        String str = this.f8615h;
        String substring = str.substring(length, t7.b.e(length, str.length(), str, ":@"));
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && r6.k.a(((l) obj).f8615h, this.f8615h);
    }

    public final n3.k f() {
        n3.k kVar = new n3.k(1);
        String str = this.f8608a;
        kVar.f6539e = str;
        kVar.f6540f = e();
        kVar.f6541g = a();
        kVar.f6542h = this.f8611d;
        r6.k.f(str, "scheme");
        int i7 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i8 = this.f8612e;
        kVar.f6536b = i8 != i7 ? i8 : -1;
        ArrayList arrayList = kVar.f6537c;
        arrayList.clear();
        arrayList.addAll(c());
        String d8 = d();
        String str2 = null;
        kVar.f6538d = d8 != null ? b.f(b.b(d8, 0, 0, " \"'<>#", 211)) : null;
        if (this.f8614g != null) {
            String str3 = this.f8615h;
            str2 = str3.substring(z6.h.D(str3, '#', 0, 6) + 1);
            r6.k.e(str2, "this as java.lang.String).substring(startIndex)");
        }
        kVar.f6543i = str2;
        return kVar;
    }

    public final URI g() {
        String str;
        n3.k f9 = f();
        ArrayList arrayList = f9.f6537c;
        String str2 = (String) f9.f6542h;
        if (str2 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            r6.k.e(compile, "compile(...)");
            str = compile.matcher(str2).replaceAll("");
            r6.k.e(str, "replaceAll(...)");
        } else {
            str = null;
        }
        f9.f6542h = str;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.set(i7, b.b((String) arrayList.get(i7), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = f9.f6538d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                String str3 = (String) arrayList2.get(i8);
                arrayList2.set(i8, str3 != null ? b.b(str3, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str4 = (String) f9.f6543i;
        f9.f6543i = str4 != null ? b.b(str4, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String kVar = f9.toString();
        try {
            return new URI(kVar);
        } catch (URISyntaxException e9) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                r6.k.e(compile2, "compile(...)");
                String replaceAll = compile2.matcher(kVar).replaceAll("");
                r6.k.e(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                r6.k.e(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e9);
            }
        }
    }

    public final int hashCode() {
        return this.f8615h.hashCode();
    }

    public final String toString() {
        return this.f8615h;
    }
}
