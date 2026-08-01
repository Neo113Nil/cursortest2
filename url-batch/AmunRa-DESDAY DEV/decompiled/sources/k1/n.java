package k1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f2830j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f2831a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2832b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2833c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2834e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2835f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2836g;
    public final String h;
    public final boolean i;

    public n(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        Z0.d.e(str, "scheme");
        Z0.d.e(str4, "host");
        this.f2831a = str;
        this.f2832b = str2;
        this.f2833c = str3;
        this.d = str4;
        this.f2834e = i;
        this.f2835f = arrayList2;
        this.f2836g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f2833c.length() == 0) {
            return "";
        }
        int length = this.f2831a.length() + 3;
        String str = this.h;
        String substring = str.substring(g1.d.x0(str, ':', length, false, 4) + 1, g1.d.x0(str, '@', 0, false, 6));
        Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f2831a.length() + 3;
        String str = this.h;
        int x02 = g1.d.x0(str, '/', length, false, 4);
        String substring = str.substring(x02, l1.b.e(str, "?#", x02, str.length()));
        Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f2831a.length() + 3;
        String str = this.h;
        int x02 = g1.d.x0(str, '/', length, false, 4);
        int e2 = l1.b.e(str, "?#", x02, str.length());
        ArrayList arrayList = new ArrayList();
        while (x02 < e2) {
            int i = x02 + 1;
            int d = l1.b.d(str, '/', i, e2);
            String substring = str.substring(i, d);
            Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            x02 = d;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f2835f == null) {
            return null;
        }
        String str = this.h;
        int x02 = g1.d.x0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(x02, l1.b.d(str, '#', x02, str.length()));
        Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f2832b.length() == 0) {
            return "";
        }
        int length = this.f2831a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, l1.b.e(str, ":@", length, str.length()));
        Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && Z0.d.a(((n) obj).h, this.h);
    }

    public final String f() {
        m mVar;
        try {
            mVar = new m();
            mVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        Z0.d.b(mVar);
        mVar.f2825b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        mVar.f2826c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return mVar.a().h;
    }

    public final URI g() {
        String substring;
        String str;
        m mVar = new m();
        String str2 = this.f2831a;
        mVar.f2824a = str2;
        mVar.f2825b = e();
        mVar.f2826c = a();
        mVar.d = this.d;
        Z0.d.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.f2834e;
        mVar.f2827e = i2 != i ? i2 : -1;
        ArrayList arrayList = mVar.f2828f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        mVar.f2829g = d != null ? b.f(b.b(d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f2836g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(g1.d.x0(str3, '#', 0, false, 6) + 1);
            Z0.d.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        mVar.h = substring;
        String str4 = mVar.d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            Z0.d.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            Z0.d.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        mVar.d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = mVar.f2829g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str6 = mVar.h;
        mVar.h = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String mVar2 = mVar.toString();
        try {
            return new URI(mVar2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                Z0.d.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(mVar2).replaceAll("");
                Z0.d.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                Z0.d.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
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
