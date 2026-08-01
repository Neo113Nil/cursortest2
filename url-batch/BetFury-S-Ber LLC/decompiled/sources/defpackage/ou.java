package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ou {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;
    public final boolean i;

    public ou(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(mf0.w(str, ':', length, 4) + 1, mf0.w(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int w = mf0.w(str, '/', length, 4);
        return str.substring(w, zk0.d(w, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int w = mf0.w(str, '/', length, 4);
        int d = zk0.d(w, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (w < d) {
            int i = w + 1;
            int e = zk0.e(str, '/', i, d);
            arrayList.add(str.substring(i, e));
            w = e;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int w = mf0.w(str, '?', 0, 6) + 1;
        return str.substring(w, zk0.e(str, '#', w, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, zk0.d(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ou) && ((ou) obj).h.equals(this.h);
    }

    public final String f() {
        nu nuVar;
        try {
            nuVar = new nu(0);
            nuVar.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            nuVar = null;
        }
        nuVar.getClass();
        nuVar.d = sl.f("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        nuVar.e = sl.f("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return nuVar.b().h;
    }

    public final URI g() {
        String substring;
        String str;
        nu nuVar = new nu(0);
        ArrayList arrayList = (ArrayList) nuVar.h;
        String str2 = this.a;
        nuVar.c = str2;
        nuVar.d = e();
        nuVar.e = a();
        nuVar.f = this.d;
        str2.getClass();
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.e;
        nuVar.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        nuVar.i = d != null ? sl.o(sl.f(d, 0, 0, " \"'<>#", 211)) : null;
        if (this.g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(mf0.w(str3, '#', 0, 6) + 1);
        }
        nuVar.g = substring;
        String str4 = (String) nuVar.f;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str4).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        nuVar.f = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, sl.f((String) arrayList.get(i3), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = (ArrayList) nuVar.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? sl.f(str5, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str6 = (String) nuVar.g;
        nuVar.g = str6 != null ? sl.f(str6, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String nuVar2 = nuVar.toString();
        try {
            return new URI(nuVar2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(nuVar2).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
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
