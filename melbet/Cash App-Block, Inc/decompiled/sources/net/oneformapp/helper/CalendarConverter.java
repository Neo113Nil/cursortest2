package net.oneformapp.helper;

import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import net.oneformapp.schema.ElementType;

/* loaded from: classes4.dex */
public abstract class CalendarConverter {
    public static final AnonymousClass1 DATE_FORMAT_REGEXPS;
    public static final String[] MONTH_FORMAT_ARRAY = {"MMMM", "MM", "MMM", "(MM)"};
    public static final AnonymousClass1 MONTH_YEAR_FORMAT_REGEXPS;

    /* renamed from: net.oneformapp.helper.CalendarConverter$1, reason: invalid class name */
    public final class AnonymousClass1 extends HashMap {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("^\\d{8}$", "yyyyMMdd");
        anonymousClass1.put("^\\d{1,2}-\\d{1,2}-\\d{4}$", "MM-dd-yyyy");
        anonymousClass1.put("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
        anonymousClass1.put("^\\d{1,2}/\\d{1,2}/\\d{4}$", "MM/dd/yyyy");
        anonymousClass1.put("^\\d{2,4}/\\d{1,2}/\\d{1,2}$", "yyyy/MM/dd");
        anonymousClass1.put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}$", "dd MMM yyyy");
        anonymousClass1.put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}$", "dd MMMM yyyy");
        DATE_FORMAT_REGEXPS = anonymousClass1;
        AnonymousClass1 anonymousClass12 = new AnonymousClass1();
        anonymousClass12.put("^\\d{6}$", "yyyyMM");
        anonymousClass12.put("^\\d{1,2}-\\d{4}$", "MM-yyyy");
        anonymousClass12.put("^\\[a-z]{3}\\s\\d{4}$", "MMM yyyy");
        anonymousClass12.put("^[a-z]{4,}\\s\\d{4}$", "MMMM yyyy");
        anonymousClass12.put("^\\d{4}-\\d{1,2}", "yyyy-MM");
        anonymousClass12.put("^\\d{1,2}/\\d{4}$", "MM/yyyy");
        anonymousClass12.put("^\\d{4}/\\d{1,2}$", "yyyy/MM");
        anonymousClass12.put("^\\d{1,2}/\\d{2}$", "MM/yy");
        anonymousClass12.put("^\\d{1,2}-\\d{2}$", "MM-yy");
        MONTH_YEAR_FORMAT_REGEXPS = anonymousClass12;
    }

    public static Calendar fromMonthYearString(String str) {
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat("MM-yyyy", Locale.ENGLISH).parse(str));
            return calendar;
        } catch (Exception unused) {
            Log.w(CalendarConverter.class.getClass().getName(), Recorder$$ExternalSyntheticOutline2.m("There was a problem parsing the date ", str));
            return null;
        }
    }

    public static Calendar fromString(String str) {
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(str));
            return calendar;
        } catch (Exception unused) {
            Log.w(CalendarConverter.class.getClass().getName(), Recorder$$ExternalSyntheticOutline2.m("There was a problem parsing the date ", str));
            return null;
        }
    }

    public static String getLocaleFormattedDate(String str, ElementType elementType) {
        if (str.trim().length() == 0) {
            return "";
        }
        int i = elementType.f1544type;
        if (i == 4) {
            Calendar fromMonthYearString = fromMonthYearString(str);
            if (fromMonthYearString == null) {
                fromMonthYearString = Calendar.getInstance();
            }
            return getShortDateInstance(Locale.getDefault(), true).format(fromMonthYearString.getTime());
        }
        if (i != 3) {
            return str;
        }
        SimpleDateFormat shortDateInstance = getShortDateInstance(Locale.getDefault(), false);
        Calendar fromString = fromString(str);
        if (fromString == null) {
            fromString = Calendar.getInstance();
        }
        return shortDateInstance.format(fromString.getTime());
    }

    public static SimpleDateFormat getShortDateInstance(Locale locale, boolean z) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getDateInstance(3, locale);
        simpleDateFormat.applyPattern(z ? simpleDateFormat.toPattern().replaceAll("[^\\p{Alpha}]*d+[^\\p{Alpha}]*|[^\\p{Alpha}]*d*日[^\\p{Alpha}]*", "/").replaceAll("^\\/|\\/$", "") : simpleDateFormat.toPattern());
        return simpleDateFormat;
    }
}
