package androidx.core.os;

import android.os.LocaleList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f11828b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final j f11829a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f11830a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f11830a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a4 = androidx.core.text.b.a(locale);
            if (!a4.isEmpty()) {
                return a4.equals(androidx.core.text.b.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private i(j jVar) {
        this.f11829a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] split = str.split(StringUtils.COMMA, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i4 = 0; i4 < length; i4++) {
            localeArr[i4] = a.a(split[i4]);
        }
        return a(localeArr);
    }

    public static i d() {
        return f11828b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i4) {
        return this.f11829a.get(i4);
    }

    public boolean e() {
        return this.f11829a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f11829a.equals(((i) obj).f11829a);
    }

    public int f() {
        return this.f11829a.size();
    }

    public String g() {
        return this.f11829a.a();
    }

    public Object h() {
        return this.f11829a.b();
    }

    public int hashCode() {
        return this.f11829a.hashCode();
    }

    public String toString() {
        return this.f11829a.toString();
    }
}
