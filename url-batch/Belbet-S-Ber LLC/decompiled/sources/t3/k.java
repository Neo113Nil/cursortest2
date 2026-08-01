package t3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import o2.b0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f3454j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f3455a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3456b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3457c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3458e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3459f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3460g;
    public final String h;
    public final boolean i;

    public k(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        i3.d.e(str, "scheme");
        i3.d.e(str4, "host");
        this.f3455a = str;
        this.f3456b = str2;
        this.f3457c = str3;
        this.d = str4;
        this.f3458e = i;
        this.f3459f = arrayList2;
        this.f3460g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f3457c.length() == 0) {
            return "";
        }
        int length = this.f3455a.length() + 3;
        String str = this.h;
        String substring = str.substring(p3.d.w0(str, ':', length, 4) + 1, p3.d.w0(str, '@', 0, 6));
        i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f3455a.length() + 3;
        String str = this.h;
        int w02 = p3.d.w0(str, '/', length, 4);
        String substring = str.substring(w02, u3.b.d(w02, str.length(), str, "?#"));
        i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f3455a.length() + 3;
        String str = this.h;
        int w02 = p3.d.w0(str, '/', length, 4);
        int d = u3.b.d(w02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (w02 < d) {
            int i = w02 + 1;
            int e4 = u3.b.e(str, '/', i, d);
            String substring = str.substring(i, e4);
            i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            w02 = e4;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f3459f == null) {
            return null;
        }
        String str = this.h;
        int w02 = p3.d.w0(str, '?', 0, 6) + 1;
        String substring = str.substring(w02, u3.b.e(str, '#', w02, str.length()));
        i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f3456b.length() == 0) {
            return "";
        }
        int length = this.f3455a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, u3.b.d(length, str.length(), str, ":@"));
        i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && i3.d.a(((k) obj).h, this.h);
    }

    public final String f() {
        b0 b0Var;
        try {
            b0Var = new b0(1);
            b0Var.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            b0Var = null;
        }
        i3.d.b(b0Var);
        b0Var.d = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        b0Var.f2923e = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return b0Var.c().h;
    }

    public final URI g() {
        String substring;
        String str;
        b0 b0Var = new b0(1);
        ArrayList arrayList = (ArrayList) b0Var.f2925g;
        String str2 = this.f3455a;
        b0Var.f2922c = str2;
        b0Var.d = e();
        b0Var.f2923e = a();
        b0Var.f2924f = this.d;
        i3.d.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i4 = this.f3458e;
        b0Var.f2921b = i4 != i ? i4 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        b0Var.h = d != null ? b.f(b.b(d, 0, 0, " \"'<>#", 211)) : null;
        if (this.f3460g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(p3.d.w0(str3, '#', 0, 6) + 1);
            i3.d.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        b0Var.i = substring;
        String str4 = (String) b0Var.f2924f;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            i3.d.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            i3.d.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        b0Var.f2924f = str;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.set(i5, b.b((String) arrayList.get(i5), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = (ArrayList) b0Var.h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String str5 = (String) arrayList2.get(i6);
                arrayList2.set(i6, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str6 = (String) b0Var.i;
        b0Var.i = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String b0Var2 = b0Var.toString();
        try {
            return new URI(b0Var2);
        } catch (URISyntaxException e4) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                i3.d.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(b0Var2).replaceAll("");
                i3.d.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                i3.d.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
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
