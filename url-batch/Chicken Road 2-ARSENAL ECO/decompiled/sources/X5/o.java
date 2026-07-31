package X5;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f2974a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2975b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2976c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2977d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2978e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2979f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2980g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2981h;

    public o(String str, String str2, String str3, String str4, int i7, ArrayList arrayList, String str5, String str6) {
        this.f2974a = str;
        this.f2975b = str2;
        this.f2976c = str3;
        this.f2977d = str4;
        this.f2978e = i7;
        this.f2979f = arrayList;
        this.f2980g = str5;
        this.f2981h = str6;
    }

    public final String a() {
        if (this.f2976c.length() == 0) {
            return "";
        }
        int length = this.f2974a.length() + 3;
        String str = this.f2981h;
        String substring = str.substring(F5.j.Q(str, ':', length, 4) + 1, F5.j.Q(str, '@', 0, 6));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.f2974a.length() + 3;
        String str = this.f2981h;
        int Q6 = F5.j.Q(str, '/', length, 4);
        String substring = str.substring(Q6, Y5.c.b(Q6, str.length(), str, "?#"));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f2974a.length() + 3;
        String str = this.f2981h;
        int Q6 = F5.j.Q(str, '/', length, 4);
        int b7 = Y5.c.b(Q6, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (Q6 < b7) {
            int i7 = Q6 + 1;
            int c7 = Y5.c.c(str, '/', i7, b7);
            String substring = str.substring(i7, c7);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
            arrayList.add(substring);
            Q6 = c7;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f2979f == null) {
            return null;
        }
        String str = this.f2981h;
        int Q6 = F5.j.Q(str, '?', 0, 6) + 1;
        String substring = str.substring(Q6, Y5.c.c(str, '#', Q6, str.length()));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f2975b.length() == 0) {
            return "";
        }
        int length = this.f2974a.length() + 3;
        String str = this.f2981h;
        String substring = str.substring(length, Y5.c.b(length, str.length(), str, ":@"));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.i.a(((o) obj).f2981h, this.f2981h);
    }

    public final String f() {
        F3.g gVar;
        try {
            gVar = new F3.g(2);
            gVar.q(this, "/...");
        } catch (IllegalArgumentException unused) {
            gVar = null;
        }
        kotlin.jvm.internal.i.b(gVar);
        gVar.f735i = m6.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        gVar.f736j = m6.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return gVar.a().f2981h;
    }

    public final URI g() {
        String substring;
        String str;
        F3.g gVar = new F3.g(2);
        ArrayList arrayList = (ArrayList) gVar.f738l;
        String scheme = this.f2974a;
        gVar.f734h = scheme;
        gVar.f735i = e();
        gVar.f736j = a();
        gVar.f737k = this.f2977d;
        kotlin.jvm.internal.i.e(scheme, "scheme");
        int i7 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i8 = this.f2978e;
        gVar.f733g = i8 != i7 ? i8 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String d7 = d();
        gVar.f739m = d7 != null ? F3.g.s(m6.a.a(d7, 0, 0, " \"'<>#", 83)) : null;
        if (this.f2980g == null) {
            substring = null;
        } else {
            String str2 = this.f2981h;
            substring = str2.substring(F5.j.Q(str2, '#', 0, 6) + 1);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
        }
        gVar.f740n = substring;
        String str3 = (String) gVar.f737k;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.i.d(compile, "compile(...)");
            str = compile.matcher(str3).replaceAll("");
            kotlin.jvm.internal.i.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        gVar.f737k = str;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.set(i9, m6.a.a((String) arrayList.get(i9), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) gVar.f739m;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str4 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str4 != null ? m6.a.a(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = (String) gVar.f740n;
        gVar.f740n = str5 != null ? m6.a.a(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String input = gVar.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e4) {
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
                throw new RuntimeException(e4);
            }
        }
    }

    public final int hashCode() {
        return this.f2981h.hashCode();
    }

    public final String toString() {
        return this.f2981h;
    }
}
