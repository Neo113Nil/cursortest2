package g0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f1756b = new d(new e(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final e f1757a;

    public d(e eVar) {
        this.f1757a = eVar;
    }

    public static d a(String str) {
        if (str == null || str.isEmpty()) {
            return f1756b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str2 = split[i4];
            int i5 = c.f1755a;
            localeArr[i4] = Locale.forLanguageTag(str2);
        }
        return new d(new e(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f1757a.equals(((d) obj).f1757a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1757a.f1758a.hashCode();
    }

    public final String toString() {
        return this.f1757a.f1758a.toString();
    }
}
