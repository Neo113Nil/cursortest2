package m3;

import android.text.TextUtils;
import com.moyoung.dafit.module.common.utils.n;
import java.text.DecimalFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public class d {
    private d() {
    }

    public static String formatRunDistance(int i8) {
        return n.getDecimalFormat("0.00").format(i8 / 1000.0f);
    }

    public static String formatRunTime(Date date, Date date2) {
        return formatRunTime((int) ((date2.getTime() - date.getTime()) / 1000));
    }

    public static String formatRunTime(int i8) {
        int i9 = i8 % 60;
        int i10 = i8 / 60;
        DecimalFormat decimalFormat = n.getDecimalFormat(n.TWO_INTEGERS_PATTERN);
        return (String) TextUtils.concat(decimalFormat.format(i10 / 60) + ":" + decimalFormat.format(i10 % 60) + ":" + decimalFormat.format(i9));
    }
}
