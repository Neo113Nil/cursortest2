package s7;

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends x1 {

    /* renamed from: i, reason: collision with root package name */
    public long f8905i;

    /* renamed from: r, reason: collision with root package name */
    public String f8906r;

    @Override // s7.x1
    public final boolean t() {
        Calendar calendar = Calendar.getInstance();
        this.f8905i = (calendar.get(16) + calendar.get(15)) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f8906r = v4.a.p(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long w() {
        u();
        return this.f8905i;
    }

    public final String x() {
        u();
        return this.f8906r;
    }
}
