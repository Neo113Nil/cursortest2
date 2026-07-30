package defpackage;

import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.firebase.encoders.json.BuildConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kz0 {
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

    public kz0(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
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
        this.i = str.equals(TournamentShareDialogURIBuilder.scheme);
    }

    public final String a() {
        if (this.c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(up2.v(str, ':', length, 4) + 1, up2.v(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int v = up2.v(str, '/', length, 4);
        return str.substring(v, n33.e(str, v, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int v = up2.v(str, '/', length, 4);
        int e = n33.e(str, v, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (v < e) {
            int i = v + 1;
            int d = n33.d(str, '/', i, e);
            arrayList.add(str.substring(i, d));
            v = d;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int v = up2.v(str, '?', 0, 6) + 1;
        return str.substring(v, n33.d(str, '#', v, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, n33.e(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kz0) && ((kz0) obj).h.equals(this.h);
    }

    public final String f() {
        jz0 jz0Var;
        try {
            jz0Var = new jz0();
            jz0Var.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            jz0Var = null;
        }
        jz0Var.getClass();
        jz0Var.b = u30.g(BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        jz0Var.c = u30.g(BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return jz0Var.a().h;
    }

    public final URI g() {
        String substring;
        jz0 jz0Var = new jz0();
        String str = this.a;
        jz0Var.a = str;
        jz0Var.b = e();
        jz0Var.c = a();
        jz0Var.d = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals(TournamentShareDialogURIBuilder.scheme) ? 443 : -1;
        int i2 = this.e;
        jz0Var.e = i2 != i ? i2 : -1;
        ArrayList arrayList = jz0Var.f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        jz0Var.g = d != null ? u30.s(u30.g(d, 0, 0, " \"'<>#", 211)) : null;
        if (this.g == null) {
            substring = null;
        } else {
            String str2 = this.h;
            substring = str2.substring(up2.v(str2, '#', 0, 6) + 1);
        }
        jz0Var.h = substring;
        String str3 = jz0Var.d;
        jz0Var.d = str3 != null ? new Regex("[\"<>^`{|}]").replace(str3, BuildConfig.FLAVOR) : null;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, u30.g((String) arrayList.get(i3), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = jz0Var.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? u30.g(str4, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str5 = jz0Var.h;
        jz0Var.h = str5 != null ? u30.g(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String jz0Var2 = jz0Var.toString();
        try {
            return new URI(jz0Var2);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(jz0Var2, BuildConfig.FLAVOR));
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
