package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class jo {
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

    public jo(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
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
        return str.substring(c40.r0(str, ':', length, 4) + 1, c40.r0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int r0 = c40.r0(str, '/', length, 4);
        return str.substring(r0, r70.d(r0, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int r0 = c40.r0(str, '/', length, 4);
        int d = r70.d(r0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (r0 < d) {
            int i = r0 + 1;
            int e = r70.e(str, '/', i, d);
            arrayList.add(str.substring(i, e));
            r0 = e;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int r0 = c40.r0(str, '?', 0, 6) + 1;
        return str.substring(r0, r70.e(str, '#', r0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, r70.d(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jo) && ((jo) obj).h.equals(this.h);
    }

    public final String f() {
        io ioVar;
        try {
            ioVar = new io(0);
            ioVar.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            ioVar = null;
        }
        ioVar.getClass();
        ioVar.d = dh.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        ioVar.e = dh.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return ioVar.b().h;
    }

    public final URI g() {
        String substring;
        String str;
        io ioVar = new io(0);
        ArrayList arrayList = (ArrayList) ioVar.h;
        String str2 = this.a;
        ioVar.c = str2;
        ioVar.d = e();
        ioVar.e = a();
        ioVar.f = this.d;
        str2.getClass();
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.e;
        ioVar.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        ioVar.i = d != null ? dh.q(dh.g(d, 0, 0, " \"'<>#", 211)) : null;
        if (this.g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(c40.r0(str3, '#', 0, 6) + 1);
        }
        ioVar.g = substring;
        String str4 = (String) ioVar.f;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str4).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        ioVar.f = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, dh.g((String) arrayList.get(i3), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = (ArrayList) ioVar.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? dh.g(str5, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str6 = (String) ioVar.g;
        ioVar.g = str6 != null ? dh.g(str6, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String ioVar2 = ioVar.toString();
        try {
            return new URI(ioVar2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(ioVar2).replaceAll("");
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
