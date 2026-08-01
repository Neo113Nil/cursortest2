package i1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f2711j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f2712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2713b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2714c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2715d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2716e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2717f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2718g;
    public final String h;
    public final boolean i;

    public p(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        X0.f.e(str, "scheme");
        X0.f.e(str4, "host");
        this.f2712a = str;
        this.f2713b = str2;
        this.f2714c = str3;
        this.f2715d = str4;
        this.f2716e = i;
        this.f2717f = arrayList2;
        this.f2718g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f2714c.length() == 0) {
            return "";
        }
        int length = this.f2712a.length() + 3;
        String str = this.h;
        String substring = str.substring(e1.d.E0(str, ':', length, false, 4) + 1, e1.d.E0(str, '@', 0, false, 6));
        X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f2712a.length() + 3;
        String str = this.h;
        int E02 = e1.d.E0(str, '/', length, false, 4);
        String substring = str.substring(E02, j1.b.e(str, "?#", E02, str.length()));
        X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f2712a.length() + 3;
        String str = this.h;
        int E02 = e1.d.E0(str, '/', length, false, 4);
        int e2 = j1.b.e(str, "?#", E02, str.length());
        ArrayList arrayList = new ArrayList();
        while (E02 < e2) {
            int i = E02 + 1;
            int d2 = j1.b.d(str, '/', i, e2);
            String substring = str.substring(i, d2);
            X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            E02 = d2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f2717f == null) {
            return null;
        }
        String str = this.h;
        int E02 = e1.d.E0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(E02, j1.b.d(str, '#', E02, str.length()));
        X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f2713b.length() == 0) {
            return "";
        }
        int length = this.f2712a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, j1.b.e(str, ":@", length, str.length()));
        X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && X0.f.a(((p) obj).h, this.h);
    }

    public final String f() {
        o oVar;
        try {
            oVar = new o();
            oVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            oVar = null;
        }
        X0.f.b(oVar);
        oVar.f2705b = C0167b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        oVar.f2706c = C0167b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return oVar.a().h;
    }

    public final URI g() {
        String substring;
        String str;
        o oVar = new o();
        String str2 = this.f2712a;
        oVar.f2704a = str2;
        oVar.f2705b = e();
        oVar.f2706c = a();
        oVar.f2707d = this.f2715d;
        X0.f.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.f2716e;
        oVar.f2708e = i2 != i ? i2 : -1;
        ArrayList arrayList = oVar.f2709f;
        arrayList.clear();
        arrayList.addAll(c());
        String d2 = d();
        oVar.f2710g = d2 != null ? C0167b.f(C0167b.b(d2, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f2718g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(e1.d.E0(str3, '#', 0, false, 6) + 1);
            X0.f.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        oVar.h = substring;
        String str4 = oVar.f2707d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            X0.f.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            X0.f.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        oVar.f2707d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, C0167b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = oVar.f2710g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? C0167b.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str6 = oVar.h;
        oVar.h = str6 != null ? C0167b.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String oVar2 = oVar.toString();
        try {
            return new URI(oVar2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                X0.f.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(oVar2).replaceAll("");
                X0.f.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                X0.f.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
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
