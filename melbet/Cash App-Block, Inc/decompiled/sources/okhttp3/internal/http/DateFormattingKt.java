package okhttp3.internal.http;

import com.google.android.gms.dynamite.zze;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes3.dex */
public abstract class DateFormattingKt {
    public static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
    public static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final zze STANDARD_DATE_FORMAT = new zze(7);

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = strArr;
        BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[strArr.length];
    }

    public static final Date toHttpDateOrNull(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) STANDARD_DATE_FORMAT.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    DateFormat[] dateFormatArr = BROWSER_COMPATIBLE_DATE_FORMATS;
                    DateFormat dateFormat = dateFormatArr[i];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
                        dateFormat.setTimeZone(_UtilJvmKt.UTC);
                        dateFormatArr[i] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
