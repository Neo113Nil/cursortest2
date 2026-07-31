package A2;

import h2.AbstractC0447i;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f128j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132d;

    /* renamed from: e, reason: collision with root package name */
    public final int f133e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f134f;

    /* renamed from: g, reason: collision with root package name */
    public final String f135g;

    /* renamed from: h, reason: collision with root package name */
    public final String f136h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f137i;

    public q(String str, String str2, String str3, String str4, int i3, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        Z1.i.f(str, "scheme");
        Z1.i.f(str4, "host");
        this.f129a = str;
        this.f130b = str2;
        this.f131c = str3;
        this.f132d = str4;
        this.f133e = i3;
        this.f134f = arrayList2;
        this.f135g = str5;
        this.f136h = str6;
        this.f137i = str.equals("https");
    }

    public final String a() {
        if (this.f131c.length() == 0) {
            return "";
        }
        int length = this.f129a.length() + 3;
        String str = this.f136h;
        String substring = str.substring(AbstractC0447i.q0(str, ':', length, false, 4) + 1, AbstractC0447i.q0(str, '@', 0, false, 6));
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f129a.length() + 3;
        String str = this.f136h;
        int q0 = AbstractC0447i.q0(str, '/', length, false, 4);
        String substring = str.substring(q0, B2.c.e(q0, str.length(), str, "?#"));
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f129a.length() + 3;
        String str = this.f136h;
        int q0 = AbstractC0447i.q0(str, '/', length, false, 4);
        int e3 = B2.c.e(q0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (q0 < e3) {
            int i3 = q0 + 1;
            int f3 = B2.c.f(str, '/', i3, e3);
            String substring = str.substring(i3, f3);
            Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            q0 = f3;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f134f == null) {
            return null;
        }
        String str = this.f136h;
        int q0 = AbstractC0447i.q0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(q0, B2.c.f(str, '#', q0, str.length()));
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f130b.length() == 0) {
            return "";
        }
        int length = this.f129a.length() + 3;
        String str = this.f136h;
        String substring = str.substring(length, B2.c.e(length, str.length(), str, ":@"));
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && Z1.i.a(((q) obj).f136h, this.f136h);
    }

    public final p f() {
        p pVar = new p();
        String str = this.f129a;
        pVar.f120a = str;
        pVar.f121b = e();
        pVar.f122c = a();
        pVar.f123d = this.f132d;
        Z1.i.f(str, "scheme");
        int i3 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i4 = this.f133e;
        pVar.f124e = i4 != i3 ? i4 : -1;
        ArrayList arrayList = pVar.f125f;
        arrayList.clear();
        arrayList.addAll(c());
        String d3 = d();
        String str2 = null;
        pVar.f126g = d3 != null ? C0003b.f(C0003b.b(d3, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f135g != null) {
            String str3 = this.f136h;
            str2 = str3.substring(AbstractC0447i.q0(str3, '#', 0, false, 6) + 1);
            Z1.i.e(str2, "this as java.lang.String).substring(startIndex)");
        }
        pVar.f127h = str2;
        return pVar;
    }

    public final URI g() {
        String str;
        p f3 = f();
        String str2 = f3.f123d;
        if (str2 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            Z1.i.e(compile, "compile(...)");
            str = compile.matcher(str2).replaceAll("");
            Z1.i.e(str, "replaceAll(...)");
        } else {
            str = null;
        }
        f3.f123d = str;
        ArrayList arrayList = f3.f125f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, C0003b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = f3.f126g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str3 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str3 != null ? C0003b.b(str3, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str4 = f3.f127h;
        f3.f127h = str4 != null ? C0003b.b(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String pVar = f3.toString();
        try {
            return new URI(pVar);
        } catch (URISyntaxException e3) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                Z1.i.e(compile2, "compile(...)");
                String replaceAll = compile2.matcher(pVar).replaceAll("");
                Z1.i.e(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                Z1.i.e(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final int hashCode() {
        return this.f136h.hashCode();
    }

    public final String toString() {
        return this.f136h;
    }
}
