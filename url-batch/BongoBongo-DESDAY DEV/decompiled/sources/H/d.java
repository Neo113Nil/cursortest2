package H;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale[] f291a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f291a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String c2 = J.c.c(J.c.a(J.c.b(locale)));
                if (!c2.isEmpty()) {
                    return c2.equals(J.c.c(J.c.a(J.c.b(locale2))));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i].equals(locale)) {
                break;
            }
            i++;
        }
        return false;
    }
}
