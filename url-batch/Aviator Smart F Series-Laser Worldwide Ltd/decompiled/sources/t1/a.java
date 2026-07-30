package t1;

import com.moyoung.dafit.module.common.utils.n;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a {
    public static int countDecimalPlaces(double d8) {
        int i8 = 0;
        while (d8 != Math.floor(d8)) {
            d8 *= 10.0d;
            i8++;
        }
        return i8;
    }

    public static String getMoneyString(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return "0.00";
        }
        double doubleValue = bigDecimal.doubleValue();
        if (countDecimalPlaces(doubleValue) > 4) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(new Locale("en"));
            decimalFormatSymbols.setMinusSign('-');
            DecimalFormat decimalFormat = new DecimalFormat("#.####", decimalFormatSymbols);
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            doubleValue = Double.parseDouble(decimalFormat.format(new BigDecimal(doubleValue)));
        }
        if (countDecimalPlaces(doubleValue) == 4) {
            String d8 = Double.toString(doubleValue);
            if (d8.endsWith(n.TWO_INTEGERS_PATTERN)) {
                doubleValue = Double.parseDouble(d8.substring(0, d8.length() - 2));
            }
        }
        String d9 = Double.toString(doubleValue);
        if (d9.endsWith(".0")) {
            d9 = d9 + "0";
        }
        if (d9.contains(".")) {
            return d9;
        }
        return d9 + ".00";
    }
}
