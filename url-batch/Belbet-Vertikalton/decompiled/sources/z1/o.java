package z1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f4875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4877c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4878d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4879f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4880g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4881h;
    public final boolean i;

    public o(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        j1.h.e(str, "scheme");
        j1.h.e(str4, "host");
        this.f4875a = str;
        this.f4876b = str2;
        this.f4877c = str3;
        this.f4878d = str4;
        this.e = i;
        this.f4879f = arrayList2;
        this.f4880g = str5;
        this.f4881h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f4877c.length() == 0) {
            return "";
        }
        int length = this.f4875a.length() + 3;
        String str = this.f4881h;
        String substring = str.substring(q1.e.y0(str, ':', length, false, 4) + 1, q1.e.y0(str, '@', 0, false, 6));
        j1.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f4875a.length() + 3;
        String str = this.f4881h;
        int y02 = q1.e.y0(str, '/', length, false, 4);
        String substring = str.substring(y02, A1.c.d(y02, str.length(), str, "?#"));
        j1.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f4875a.length() + 3;
        String str = this.f4881h;
        int y02 = q1.e.y0(str, '/', length, false, 4);
        int d2 = A1.c.d(y02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (y02 < d2) {
            int i = y02 + 1;
            int e = A1.c.e(str, '/', i, d2);
            String substring = str.substring(i, e);
            j1.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            y02 = e;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f4879f == null) {
            return null;
        }
        String str = this.f4881h;
        int y02 = q1.e.y0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(y02, A1.c.e(str, '#', y02, str.length()));
        j1.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f4876b.length() == 0) {
            return "";
        }
        int length = this.f4875a.length() + 3;
        String str = this.f4881h;
        String substring = str.substring(length, A1.c.d(length, str.length(), str, ":@"));
        j1.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && j1.h.a(((o) obj).f4881h, this.f4881h);
    }

    public final String f() {
        n nVar;
        try {
            nVar = new n();
            nVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            nVar = null;
        }
        j1.h.b(nVar);
        nVar.f4869b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        nVar.f4870c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return nVar.a().f4881h;
    }

    public final URI g() {
        String substring;
        String str;
        n nVar = new n();
        String str2 = this.f4875a;
        nVar.f4868a = str2;
        nVar.f4869b = e();
        nVar.f4870c = a();
        nVar.f4871d = this.f4878d;
        j1.h.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.e;
        nVar.e = i2 != i ? i2 : -1;
        ArrayList arrayList = nVar.f4872f;
        arrayList.clear();
        arrayList.addAll(c());
        String d2 = d();
        nVar.f4873g = d2 != null ? b.f(b.b(d2, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f4880g == null) {
            substring = null;
        } else {
            String str3 = this.f4881h;
            substring = str3.substring(q1.e.y0(str3, '#', 0, false, 6) + 1);
            j1.h.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        nVar.f4874h = substring;
        String str4 = nVar.f4871d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            j1.h.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            j1.h.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        nVar.f4871d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = nVar.f4873g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str6 = nVar.f4874h;
        nVar.f4874h = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String nVar2 = nVar.toString();
        try {
            return new URI(nVar2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                j1.h.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(nVar2).replaceAll("");
                j1.h.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                j1.h.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.f4881h.hashCode();
    }

    public final String toString() {
        return this.f4881h;
    }
}
