package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ed3 extends ok3 {
    public long o;
    public String p;

    public final long A() {
        y();
        return this.o;
    }

    public final String B() {
        y();
        return this.p;
    }

    @Override // defpackage.ok3
    public final boolean x() {
        Calendar calendar = Calendar.getInstance();
        this.o = (calendar.get(16) + calendar.get(15)) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.p = sb.toString();
        return false;
    }
}
