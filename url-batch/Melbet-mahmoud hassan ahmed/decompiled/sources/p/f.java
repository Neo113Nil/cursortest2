package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class f implements g {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f19931c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f19932d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f19933e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f19934f = e.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f19935a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19936b;

    f(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f19935a = f19931c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = 0; i7 < localeArr.length; i7++) {
                Locale locale = localeArr[i7];
                if (locale == null) {
                    throw new NullPointerException("list[" + i7 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb2, locale2);
                    if (i7 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f19935a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
            sb = sb2.toString();
        }
        this.f19936b = sb;
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // p.g
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f19935a;
        if (this.f19935a.length != localeArr.length) {
            return false;
        }
        int i7 = 0;
        while (true) {
            Locale[] localeArr2 = this.f19935a;
            if (i7 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
            i7++;
        }
    }

    @Override // p.g
    public Locale get(int i7) {
        if (i7 >= 0) {
            Locale[] localeArr = this.f19935a;
            if (i7 < localeArr.length) {
                return localeArr[i7];
            }
        }
        return null;
    }

    public int hashCode() {
        int i7 = 1;
        int i8 = 0;
        while (true) {
            Locale[] localeArr = this.f19935a;
            if (i8 >= localeArr.length) {
                return i7;
            }
            i7 = (i7 * 31) + localeArr[i8].hashCode();
            i8++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f19935a;
            if (i7 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i7]);
            if (i7 < this.f19935a.length - 1) {
                sb.append(',');
            }
            i7++;
        }
    }
}
