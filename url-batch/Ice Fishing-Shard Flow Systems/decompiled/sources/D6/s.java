package D6;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f562a;

    /* renamed from: b, reason: collision with root package name */
    public final String f563b;

    /* renamed from: c, reason: collision with root package name */
    public final String f564c;

    /* renamed from: d, reason: collision with root package name */
    public final String f565d;

    /* renamed from: e, reason: collision with root package name */
    public final int f566e;

    /* renamed from: f, reason: collision with root package name */
    public final List f567f;

    /* renamed from: g, reason: collision with root package name */
    public final String f568g;

    /* renamed from: h, reason: collision with root package name */
    public final String f569h;

    public s(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, String str5, String str6) {
        this.f562a = str;
        this.f563b = str2;
        this.f564c = str3;
        this.f565d = str4;
        this.f566e = i2;
        this.f567f = arrayList;
        this.f568g = str5;
        this.f569h = str6;
    }

    public final String a() {
        if (this.f564c.length() == 0) {
            return "";
        }
        int length = this.f562a.length() + 3;
        String str = this.f569h;
        String substring = str.substring(StringsKt.x(str, ':', length, 4) + 1, StringsKt.x(str, '@', 0, 6));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.f562a.length() + 3;
        String str = this.f569h;
        int x7 = StringsKt.x(str, '/', length, 4);
        String substring = str.substring(x7, E6.c.c(str, "?#", x7, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f562a.length() + 3;
        String str = this.f569h;
        int x7 = StringsKt.x(str, '/', length, 4);
        int c7 = E6.c.c(str, "?#", x7, str.length());
        ArrayList arrayList = new ArrayList();
        while (x7 < c7) {
            int i2 = x7 + 1;
            int b7 = E6.c.b(str, '/', i2, c7);
            String substring = str.substring(i2, b7);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            arrayList.add(substring);
            x7 = b7;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f567f == null) {
            return null;
        }
        String str = this.f569h;
        int x7 = StringsKt.x(str, '?', 0, 6) + 1;
        String substring = str.substring(x7, E6.c.b(str, '#', x7, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f563b.length() == 0) {
            return "";
        }
        int length = this.f562a.length() + 3;
        String str = this.f569h;
        String substring = str.substring(length, E6.c.c(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && Intrinsics.a(((s) obj).f569h, this.f569h);
    }

    public final String f() {
        r rVar;
        Intrinsics.checkNotNullParameter("/...", "link");
        try {
            rVar = new r();
            rVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        Intrinsics.b(rVar);
        Intrinsics.checkNotNullParameter("", URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME);
        rVar.f555b = S6.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        Intrinsics.checkNotNullParameter("", URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
        rVar.f556c = S6.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return rVar.a().f569h;
    }

    public final URI g() {
        String substring;
        String a7;
        r rVar = new r();
        String scheme = this.f562a;
        rVar.f554a = scheme;
        String e7 = e();
        Intrinsics.checkNotNullParameter(e7, "<set-?>");
        rVar.f555b = e7;
        String a8 = a();
        Intrinsics.checkNotNullParameter(a8, "<set-?>");
        rVar.f556c = a8;
        rVar.f557d = this.f565d;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        int i2 = Intrinsics.a(scheme, "http") ? 80 : Intrinsics.a(scheme, "https") ? 443 : -1;
        int i5 = this.f566e;
        rVar.f558e = i5 != i2 ? i5 : -1;
        ArrayList arrayList = rVar.f559f;
        arrayList.clear();
        arrayList.addAll(c());
        String d7 = d();
        rVar.f560g = (d7 == null || (a7 = S6.a.a(d7, 0, 0, " \"'<>#", 83)) == null) ? null : r.d(a7);
        if (this.f568g == null) {
            substring = null;
        } else {
            String str = this.f569h;
            substring = str.substring(StringsKt.x(str, '#', 0, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        rVar.f561h = substring;
        String str2 = rVar.f557d;
        rVar.f557d = str2 != null ? new Regex("[\"<>^`{|}]").replace(str2, "") : null;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.set(i7, S6.a.a((String) arrayList.get(i7), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = rVar.f560g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                String str3 = (String) arrayList2.get(i8);
                arrayList2.set(i8, str3 != null ? S6.a.a(str3, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str4 = rVar.f561h;
        rVar.f561h = str4 != null ? S6.a.a(str4, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String rVar2 = rVar.toString();
        try {
            return new URI(rVar2);
        } catch (URISyntaxException e8) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(rVar2, ""));
                Intrinsics.b(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }

    public final int hashCode() {
        return this.f569h.hashCode();
    }

    public final String toString() {
        return this.f569h;
    }
}
