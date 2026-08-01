package o1;

import android.content.Context;
import com.gdmhkmf.belbet.R;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ZoneId f2892a;

    static {
        ZoneId systemDefault = ZoneId.systemDefault();
        i3.d.d(systemDefault, "systemDefault(...)");
        f2892a = systemDefault;
    }

    public static String a(Context context, LocalDate localDate) {
        LocalDate e4 = e();
        i3.d.e(localDate, "birthDate");
        if (c(localDate, e4) == 0) {
            int b2 = b(localDate, e4);
            String string = context.getString(R.string.age_current_format, Integer.valueOf(b2), g(context, b2));
            i3.d.b(string);
            return string;
        }
        int f5 = f(localDate, e4);
        String string2 = context.getString(R.string.age_format, Integer.valueOf(f5), g(context, f5));
        i3.d.b(string2);
        return string2;
    }

    public static int b(LocalDate localDate, LocalDate localDate2) {
        i3.d.e(localDate, "birthDate");
        int year = localDate2.getYear() - localDate.getYear();
        if (localDate2.isBefore(localDate.withYear(localDate2.getYear()))) {
            year--;
        }
        if (year < 0) {
            return 0;
        }
        return year;
    }

    public static long c(LocalDate localDate, LocalDate localDate2) {
        i3.d.e(localDate, "birthDate");
        LocalDate withYear = localDate.withYear(localDate2.getYear());
        if (withYear.isBefore(localDate2)) {
            withYear = withYear.plusYears(1L);
        }
        i3.d.b(withYear);
        return ChronoUnit.DAYS.between(localDate2, withYear);
    }

    public static LocalDate e() {
        LocalDate now = LocalDate.now(f2892a);
        i3.d.d(now, "now(...)");
        return now;
    }

    public static int f(LocalDate localDate, LocalDate localDate2) {
        i3.d.e(localDate, "birthDate");
        return c(localDate, localDate2) == 0 ? b(localDate, localDate2) : b(localDate, localDate2) + 1;
    }

    public static String g(Context context, int i) {
        int i4 = i % 100;
        int i5 = i % 10;
        if (11 <= i4 && i4 < 15) {
            String string = context.getString(R.string.year_many);
            i3.d.d(string, "getString(...)");
            return string;
        }
        if (i5 == 1) {
            String string2 = context.getString(R.string.year_one);
            i3.d.d(string2, "getString(...)");
            return string2;
        }
        if (2 > i5 || i5 >= 5) {
            String string3 = context.getString(R.string.year_many);
            i3.d.d(string3, "getString(...)");
            return string3;
        }
        String string4 = context.getString(R.string.year_few);
        i3.d.d(string4, "getString(...)");
        return string4;
    }

    public static int h(LocalDate localDate) {
        i3.d.e(localDate, "birthDate");
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        return (monthValue != 3 || dayOfMonth < 21) ? (monthValue != 4 || dayOfMonth > 19) ? (monthValue != 4 || dayOfMonth < 20) ? (monthValue != 5 || dayOfMonth > 20) ? (monthValue != 5 || dayOfMonth < 21) ? (monthValue != 6 || dayOfMonth > 20) ? (monthValue != 6 || dayOfMonth < 21) ? (monthValue != 7 || dayOfMonth > 22) ? (monthValue != 7 || dayOfMonth < 23) ? (monthValue != 8 || dayOfMonth > 22) ? (monthValue != 8 || dayOfMonth < 23) ? (monthValue != 9 || dayOfMonth > 22) ? (monthValue != 9 || dayOfMonth < 23) ? (monthValue != 10 || dayOfMonth > 22) ? (monthValue != 10 || dayOfMonth < 23) ? (monthValue != 11 || dayOfMonth > 21) ? (monthValue != 11 || dayOfMonth < 22) ? (monthValue != 12 || dayOfMonth > 21) ? (monthValue != 12 || dayOfMonth < 22) ? (monthValue != 1 || dayOfMonth > 19) ? (monthValue != 1 || dayOfMonth < 20) ? (monthValue != 2 || dayOfMonth > 18) ? R.string.zodiac_pisces : R.string.zodiac_aquarius : R.string.zodiac_aquarius : R.string.zodiac_capricorn : R.string.zodiac_capricorn : R.string.zodiac_sagittarius : R.string.zodiac_sagittarius : R.string.zodiac_scorpio : R.string.zodiac_scorpio : R.string.zodiac_libra : R.string.zodiac_libra : R.string.zodiac_virgo : R.string.zodiac_virgo : R.string.zodiac_leo : R.string.zodiac_leo : R.string.zodiac_cancer : R.string.zodiac_cancer : R.string.zodiac_gemini : R.string.zodiac_gemini : R.string.zodiac_taurus : R.string.zodiac_taurus : R.string.zodiac_aries : R.string.zodiac_aries;
    }

    public static String i(LocalDate localDate) {
        i3.d.e(localDate, "birthDate");
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        return (monthValue != 3 || dayOfMonth < 21) ? (monthValue != 4 || dayOfMonth > 19) ? (monthValue != 4 || dayOfMonth < 20) ? (monthValue != 5 || dayOfMonth > 20) ? (monthValue != 5 || dayOfMonth < 21) ? (monthValue != 6 || dayOfMonth > 20) ? (monthValue != 6 || dayOfMonth < 21) ? (monthValue != 7 || dayOfMonth > 22) ? (monthValue != 7 || dayOfMonth < 23) ? (monthValue != 8 || dayOfMonth > 22) ? (monthValue != 8 || dayOfMonth < 23) ? (monthValue != 9 || dayOfMonth > 22) ? (monthValue != 9 || dayOfMonth < 23) ? (monthValue != 10 || dayOfMonth > 22) ? (monthValue != 10 || dayOfMonth < 23) ? (monthValue != 11 || dayOfMonth > 21) ? (monthValue != 11 || dayOfMonth < 22) ? (monthValue != 12 || dayOfMonth > 21) ? (monthValue != 12 || dayOfMonth < 22) ? (monthValue != 1 || dayOfMonth > 19) ? (monthValue != 1 || dayOfMonth < 20) ? (monthValue != 2 || dayOfMonth > 18) ? "♓" : "♒" : "♒" : "♑" : "♑" : "♐" : "♐" : "♏" : "♏" : "♎" : "♎" : "♍" : "♍" : "♌" : "♌" : "♋" : "♋" : "♊" : "♊" : "♉" : "♉" : "♈" : "♈";
    }
}
