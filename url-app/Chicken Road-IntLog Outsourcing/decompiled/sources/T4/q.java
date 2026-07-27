package T4;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2923a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2925c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2926d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2927e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2928f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2929g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2930h;

    public q(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, String str5, String str6) {
        this.f2923a = str;
        this.f2924b = str2;
        this.f2925c = str3;
        this.f2926d = str4;
        this.f2927e = i2;
        this.f2928f = arrayList;
        this.f2929g = str5;
        this.f2930h = str6;
    }

    public final String a() {
        if (this.f2925c.length() == 0) {
            return "";
        }
        int length = this.f2923a.length() + 3;
        String str = this.f2930h;
        String substring = str.substring(B4.k.W(str, ':', length, false, 4) + 1, B4.k.W(str, '@', 0, false, 6));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.f2923a.length() + 3;
        String str = this.f2930h;
        int W5 = B4.k.W(str, '/', length, false, 4);
        String substring = str.substring(W5, U4.c.d(str, W5, str.length(), "?#"));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f2923a.length() + 3;
        String str = this.f2930h;
        int W5 = B4.k.W(str, '/', length, false, 4);
        int d6 = U4.c.d(str, W5, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (W5 < d6) {
            int i2 = W5 + 1;
            int c2 = U4.c.c(str, '/', i2, d6);
            String substring = str.substring(i2, c2);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
            arrayList.add(substring);
            W5 = c2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f2928f == null) {
            return null;
        }
        String str = this.f2930h;
        int W5 = B4.k.W(str, '?', 0, false, 6) + 1;
        String substring = str.substring(W5, U4.c.c(str, '#', W5, str.length()));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f2924b.length() == 0) {
            return "";
        }
        int length = this.f2923a.length() + 3;
        String str = this.f2930h;
        String substring = str.substring(length, U4.c.d(str, length, str.length(), ":@"));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && kotlin.jvm.internal.i.a(((q) obj).f2930h, this.f2930h);
    }

    public final String f() {
        p pVar;
        try {
            pVar = new p();
            pVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            pVar = null;
        }
        kotlin.jvm.internal.i.b(pVar);
        pVar.f2916b = i5.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123);
        pVar.f2917c = i5.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123);
        return pVar.a().f2930h;
    }

    public final URI g() {
        String substring;
        String str;
        p pVar = new p();
        String scheme = this.f2923a;
        pVar.f2915a = scheme;
        pVar.f2916b = e();
        pVar.f2917c = a();
        pVar.f2918d = this.f2926d;
        kotlin.jvm.internal.i.e(scheme, "scheme");
        int i2 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i3 = this.f2927e;
        pVar.f2919e = i3 != i2 ? i3 : -1;
        ArrayList arrayList = pVar.f2920f;
        arrayList.clear();
        arrayList.addAll(c());
        String d6 = d();
        pVar.f2921g = d6 != null ? p.d(i5.a.a(d6, 0, 0, " \"'<>#", true, false, true, false, 83)) : null;
        if (this.f2929g == null) {
            substring = null;
        } else {
            String str2 = this.f2930h;
            substring = str2.substring(B4.k.W(str2, '#', 0, false, 6) + 1);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
        }
        pVar.f2922h = substring;
        String str3 = pVar.f2918d;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.i.d(compile, "compile(...)");
            str = compile.matcher(str3).replaceAll("");
            kotlin.jvm.internal.i.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        pVar.f2918d = str;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.set(i6, i5.a.a((String) arrayList.get(i6), 0, 0, "[]", true, true, false, false, 99));
        }
        ArrayList arrayList2 = pVar.f2921g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                String str4 = (String) arrayList2.get(i7);
                arrayList2.set(i7, str4 != null ? i5.a.a(str4, 0, 0, "\\^`{|}", true, true, true, false, 67) : null);
            }
        }
        String str5 = pVar.f2922h;
        pVar.f2922h = str5 != null ? i5.a.a(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35) : null;
        String input = pVar.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e3) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.i.d(compile2, "compile(...)");
                kotlin.jvm.internal.i.e(input, "input");
                String replaceAll = compile2.matcher(input).replaceAll("");
                kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                kotlin.jvm.internal.i.b(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final int hashCode() {
        return this.f2930h.hashCode();
    }

    public final String toString() {
        return this.f2930h;
    }
}
