package cn.hutool.core.io.unit;

import cn.hutool.core.text.l;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class b {
    public static String format(long j8) {
        if (j8 <= 0) {
            return "0";
        }
        String[] strArr = DataUnit.UNIT_NAMES;
        double d8 = j8;
        int min = Math.min(strArr.length - 1, (int) (Math.log10(d8) / Math.log10(1024.0d)));
        return new DecimalFormat("#,##0.##").format(d8 / Math.pow(1024.0d, min)) + l.SPACE + strArr[min];
    }

    public static long parse(String str) {
        return a.parse(str).toBytes();
    }
}
