package androidx.core.util;

import androidx.annotation.RestrictTo;
import com.baidu.mapapi.http.HttpClient;
import java.io.PrintWriter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class TimeUtils {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private TimeUtils() {
    }

    private static int accumField(int i8, int i9, boolean z7, int i10) {
        if (i8 > 99 || (z7 && i10 >= 3)) {
            return i9 + 3;
        }
        if (i8 > 9 || (z7 && i10 >= 2)) {
            return i9 + 2;
        }
        if (z7 || i8 > 0) {
            return i9 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j8, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j8, 0));
        }
    }

    private static int formatDurationLocked(long j8, int i8) {
        char c8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j9 = j8;
        if (sFormatStr.length < i8) {
            sFormatStr = new char[i8];
        }
        char[] cArr = sFormatStr;
        if (j9 == 0) {
            int i14 = i8 - 1;
            while (i14 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j9 > 0) {
            c8 = '+';
        } else {
            j9 = -j9;
            c8 = '-';
        }
        int i15 = (int) (j9 % 1000);
        int floor = (int) Math.floor(j9 / 1000);
        if (floor > SECONDS_PER_DAY) {
            i9 = floor / SECONDS_PER_DAY;
            floor -= SECONDS_PER_DAY * i9;
        } else {
            i9 = 0;
        }
        if (floor > SECONDS_PER_HOUR) {
            i10 = floor / SECONDS_PER_HOUR;
            floor -= i10 * SECONDS_PER_HOUR;
        } else {
            i10 = 0;
        }
        if (floor > 60) {
            int i16 = floor / 60;
            i11 = floor - (i16 * 60);
            i12 = i16;
        } else {
            i11 = floor;
            i12 = 0;
        }
        if (i8 != 0) {
            int accumField = accumField(i9, 1, false, 0);
            int accumField2 = accumField + accumField(i10, 1, accumField > 0, 2);
            int accumField3 = accumField2 + accumField(i12, 1, accumField2 > 0, 2);
            int accumField4 = accumField3 + accumField(i11, 1, accumField3 > 0, 2);
            i13 = 0;
            for (int accumField5 = accumField4 + accumField(i15, 2, true, accumField4 > 0 ? 3 : 0) + 1; accumField5 < i8; accumField5++) {
                cArr[i13] = ' ';
                i13++;
            }
        } else {
            i13 = 0;
        }
        cArr[i13] = c8;
        int i17 = i13 + 1;
        boolean z7 = i8 != 0;
        int printField = printField(cArr, i9, 'd', i17, false, 0);
        int printField2 = printField(cArr, i10, 'h', printField, printField != i17, z7 ? 2 : 0);
        int printField3 = printField(cArr, i12, 'm', printField2, printField2 != i17, z7 ? 2 : 0);
        int printField4 = printField(cArr, i11, 's', printField3, printField3 != i17, z7 ? 2 : 0);
        int printField5 = printField(cArr, i15, 'm', printField4, true, (!z7 || printField4 == i17) ? 0 : 3);
        cArr[printField5] = 's';
        return printField5 + 1;
    }

    private static int printField(char[] cArr, int i8, char c8, int i9, boolean z7, int i10) {
        int i11;
        if (!z7 && i8 <= 0) {
            return i9;
        }
        if ((!z7 || i10 < 3) && i8 <= 99) {
            i11 = i9;
        } else {
            int i12 = i8 / 100;
            cArr[i9] = (char) (i12 + 48);
            i11 = i9 + 1;
            i8 -= i12 * 100;
        }
        if ((z7 && i10 >= 2) || i8 > 9 || i9 != i11) {
            int i13 = i8 / 10;
            cArr[i11] = (char) (i13 + 48);
            i11++;
            i8 -= i13 * 10;
        }
        cArr[i11] = (char) (i8 + 48);
        cArr[i11 + 1] = c8;
        return i11 + 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j8, PrintWriter printWriter, int i8) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j8, i8)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j8, PrintWriter printWriter) {
        formatDuration(j8, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j8, long j9, PrintWriter printWriter) {
        if (j8 == 0) {
            printWriter.print(HttpClient.ENDFLAG);
        } else {
            formatDuration(j8 - j9, printWriter, 0);
        }
    }
}
