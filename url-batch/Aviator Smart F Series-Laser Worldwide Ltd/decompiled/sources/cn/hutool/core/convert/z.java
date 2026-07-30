package cn.hutool.core.convert;

import cn.hutool.core.util.d0;
import cn.hutool.core.util.g0;
import com.google.android.exoplayer2.MediaPeriodQueue;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public class z {
    private static final char[] DIGITS = {38646, 19968, 22777, 20108, 36144, 19977, 21441, 22235, 32902, 20116, 20237, 20845, 38470, 19971, 26578, 20843, 25420, 20061, 29590};
    private static final a[] CHINESE_NAME_VALUE = {new a(' ', 1, false), new a(21313, 10, false), new a(25342, 10, false), new a(30334, 100, false), new a(20336, 100, false), new a(21315, 1000, false), new a(20191, 1000, false), new a(19975, 10000, true), new a(20159, 100000000, true)};

    private static class a {
        private final char name;
        private final boolean secUnit;
        private final int value;

        public a(char c8, int i8, boolean z7) {
            this.name = c8;
            this.value = i8;
            this.secUnit = z7;
        }
    }

    private static void addPreZero(StringBuilder sb) {
        if (cn.hutool.core.text.l.isEmpty(sb) || 38646 == sb.charAt(0)) {
            return;
        }
        sb.insert(0, (char) 38646);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BigDecimal chineseMoneyToNumber(String str) {
        String str2;
        String str3 = null;
        if (cn.hutool.core.text.l.isBlank(str)) {
            return null;
        }
        int indexOf = str.indexOf("元");
        if (indexOf == -1) {
            indexOf = str.indexOf("圆");
        }
        int indexOf2 = str.indexOf("角");
        int indexOf3 = str.indexOf("分");
        String substring = indexOf > 0 ? str.substring(0, indexOf) : null;
        if (indexOf2 > 0) {
            if (indexOf < 0) {
                str2 = str.substring(0, indexOf2);
            } else if (indexOf2 > indexOf) {
                str2 = str.substring(indexOf + 1, indexOf2);
            }
            if (indexOf3 > 0) {
                if (indexOf2 >= 0) {
                    if (indexOf3 > indexOf2) {
                        str3 = str.substring(indexOf2 + 1, indexOf3);
                    }
                } else if (indexOf <= 0) {
                    str3 = str.substring(0, indexOf3);
                } else if (indexOf3 > indexOf) {
                    str3 = str.substring(indexOf + 1, indexOf3);
                }
            }
            int chineseToNumber = !cn.hutool.core.text.l.isNotBlank(substring) ? chineseToNumber(substring) : 0;
            int chineseToNumber2 = !cn.hutool.core.text.l.isNotBlank(str2) ? chineseToNumber(str2) : 0;
            int chineseToNumber3 = cn.hutool.core.text.l.isNotBlank(str3) ? chineseToNumber(str3) : 0;
            BigDecimal bigDecimal = new BigDecimal(chineseToNumber);
            BigDecimal valueOf = BigDecimal.valueOf(chineseToNumber2);
            BigDecimal bigDecimal2 = BigDecimal.TEN;
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            return bigDecimal.add(valueOf.divide(bigDecimal2, 2, roundingMode)).add(BigDecimal.valueOf(chineseToNumber3).divide(BigDecimal.valueOf(100L), 2, roundingMode));
        }
        str2 = null;
        if (indexOf3 > 0) {
        }
        if (!cn.hutool.core.text.l.isNotBlank(substring)) {
        }
        if (!cn.hutool.core.text.l.isNotBlank(str2)) {
        }
        if (cn.hutool.core.text.l.isNotBlank(str3)) {
        }
        BigDecimal bigDecimal3 = new BigDecimal(chineseToNumber);
        BigDecimal valueOf2 = BigDecimal.valueOf(chineseToNumber2);
        BigDecimal bigDecimal22 = BigDecimal.TEN;
        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
        return bigDecimal3.add(valueOf2.divide(bigDecimal22, 2, roundingMode2)).add(BigDecimal.valueOf(chineseToNumber3).divide(BigDecimal.valueOf(100L), 2, roundingMode2));
    }

    public static int chineseToNumber(String str) {
        int length = str.length();
        a aVar = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            int chineseToNumber = chineseToNumber(charAt);
            if (chineseToNumber >= 0) {
                if (chineseToNumber == 0) {
                    if (i8 > 0 && aVar != null) {
                        i10 += i8 * (aVar.value / 10);
                    }
                    aVar = null;
                } else if (i8 > 0) {
                    throw new IllegalArgumentException(cn.hutool.core.text.l.format("Bad number '{}{}' at: {}", Character.valueOf(str.charAt(i11 - 1)), Character.valueOf(charAt), Integer.valueOf(i11)));
                }
                i8 = chineseToNumber;
            } else {
                aVar = chineseToUnit(charAt);
                if (aVar == null) {
                    throw new IllegalArgumentException(cn.hutool.core.text.l.format("Unknown unit '{}' at: {}", Character.valueOf(charAt), Integer.valueOf(i11)));
                }
                if (aVar.secUnit) {
                    i9 += (i10 + i8) * aVar.value;
                    i10 = 0;
                } else {
                    if (i8 == 0 && i11 == 0) {
                        i8 = 1;
                    }
                    i10 += i8 * aVar.value;
                }
                i8 = 0;
            }
        }
        if (i8 > 0 && aVar != null) {
            i8 *= aVar.value / 10;
        }
        return i9 + i10 + i8;
    }

    private static a chineseToUnit(char c8) {
        for (a aVar : CHINESE_NAME_VALUE) {
            if (aVar.name == c8) {
                return aVar;
            }
        }
        return null;
    }

    public static String format(double d8, boolean z7) {
        return format(d8, z7, false);
    }

    public static String formatSimple(long j8) {
        if (j8 < 10000 && j8 > -10000) {
            return String.valueOf(j8);
        }
        if (j8 < 100000000 && j8 > -100000000) {
            return d0.div(j8, 10000.0f, 2) + "万";
        }
        if (j8 >= MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US || j8 <= -1000000000000L) {
            return d0.div(j8, 1.0E12f, 2) + "万亿";
        }
        return d0.div(j8, 1.0E8f, 2) + "亿";
    }

    public static String formatThousand(int i8, boolean z7) {
        cn.hutool.core.lang.q.checkBetween(i8, -999, 999, "Number support only: (-999 ~ 999)！", new Object[0]);
        String thousandToChinese = thousandToChinese(i8, z7);
        return (i8 >= 20 || i8 < 10) ? thousandToChinese : thousandToChinese.substring(1);
    }

    private static String getUnitName(int i8, boolean z7) {
        return i8 == 0 ? "" : String.valueOf(CHINESE_NAME_VALUE[(i8 * 2) - (!z7 ? 1 : 0)].name);
    }

    private static String longToChinese(long j8, boolean z7) {
        if (0 == j8) {
            return "零";
        }
        int[] iArr = new int[4];
        int i8 = 0;
        while (j8 != 0) {
            iArr[i8] = (int) (j8 % 10000);
            j8 /= 10000;
            i8++;
        }
        StringBuilder sb = new StringBuilder();
        int i9 = iArr[0];
        if (i9 > 0) {
            sb.insert(0, thousandToChinese(i9, z7));
            if (i9 < 1000) {
                addPreZero(sb);
            }
        }
        int i10 = iArr[1];
        if (i10 > 0) {
            if (i10 % 10 == 0 && iArr[0] > 0) {
                addPreZero(sb);
            }
            sb.insert(0, thousandToChinese(i10, z7) + "万");
            if (i10 < 1000) {
                addPreZero(sb);
            }
        } else {
            addPreZero(sb);
        }
        int i11 = iArr[2];
        if (i11 > 0) {
            if (i11 % 10 == 0 && iArr[1] > 0) {
                addPreZero(sb);
            }
            sb.insert(0, thousandToChinese(i11, z7) + "亿");
            if (i11 < 1000) {
                addPreZero(sb);
            }
        } else {
            addPreZero(sb);
        }
        int i12 = iArr[3];
        if (i12 > 0) {
            if (iArr[2] == 0) {
                sb.insert(0, "亿");
            }
            sb.insert(0, thousandToChinese(i12, z7) + "万");
        }
        return (cn.hutool.core.text.l.isNotEmpty(sb) && 38646 == sb.charAt(0)) ? sb.substring(1) : sb.toString();
    }

    public static String numberCharToChinese(char c8, boolean z7) {
        return (c8 < '0' || c8 > '9') ? String.valueOf(c8) : String.valueOf(numberToChinese(c8 - '0', z7));
    }

    private static char numberToChinese(int i8, boolean z7) {
        return i8 == 0 ? DIGITS[0] : DIGITS[(i8 * 2) - (!z7 ? 1 : 0)];
    }

    private static String thousandToChinese(int i8, boolean z7) {
        if (i8 == 0) {
            return String.valueOf(DIGITS[0]);
        }
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        boolean z8 = true;
        while (i8 > 0) {
            int i10 = i8 % 10;
            if (i10 == 0) {
                if (!z8) {
                    sb.insert(0, "零");
                }
                z8 = true;
            } else {
                sb.insert(0, numberToChinese(i10, z7) + getUnitName(i9, z7));
                z8 = false;
            }
            i8 /= 10;
            i9++;
        }
        return sb.toString();
    }

    public static String format(double d8, boolean z7, boolean z8, String str, String str2) {
        double d9;
        if (com.github.mikephil.charting.utils.i.DOUBLE_EPSILON == d8) {
            return "零";
        }
        cn.hutool.core.lang.q.checkBetween(d8, -9.999999999999998E13d, 9.999999999999998E13d, "Number support only: (-99999999999999.99 ~ 99999999999999.99)！", new Object[0]);
        StringBuilder sb = new StringBuilder();
        if (d8 < com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            sb.append(cn.hutool.core.text.l.isNullOrUndefined(str) ? "负" : str);
            d9 = -d8;
        } else {
            d9 = d8;
        }
        long round = Math.round(d9 * 100.0d);
        int i8 = (int) (round % 10);
        long j8 = round / 10;
        int i9 = (int) (j8 % 10);
        long j9 = j8 / 10;
        if (!z8 || 0 != j9) {
            sb.append(longToChinese(j9, z7));
            if (z8) {
                sb.append(cn.hutool.core.text.l.isNullOrUndefined(str2) ? "元" : str2);
            }
        }
        if (i9 == 0 && i8 == 0) {
            if (z8) {
                sb.append("整");
            }
            return sb.toString();
        }
        if (!z8) {
            sb.append("点");
        }
        if (0 != j9 || i9 != 0) {
            sb.append(numberToChinese(i9, z7));
            if (z8 && i9 != 0) {
                sb.append("角");
            }
        } else if (!z8) {
            sb.append("零");
        }
        if (i8 != 0) {
            sb.append(numberToChinese(i8, z7));
            if (z8) {
                sb.append("分");
            }
        }
        return sb.toString();
    }

    private static int chineseToNumber(char c8) {
        if (20004 == c8) {
            c8 = 20108;
        }
        int indexOf = g0.indexOf(DIGITS, c8);
        return indexOf > 0 ? (indexOf + 1) / 2 : indexOf;
    }

    public static String format(double d8, boolean z7, boolean z8) {
        return format(d8, z7, z8, "负", "元");
    }

    public static String format(long j8, boolean z7) {
        if (0 == j8) {
            return "零";
        }
        cn.hutool.core.lang.q.checkBetween(j8, -9.999999999999998E13d, 9.999999999999998E13d, "Number support only: (-99999999999999.99 ~ 99999999999999.99)！", new Object[0]);
        StringBuilder sb = new StringBuilder();
        if (j8 < 0) {
            sb.append("负");
            j8 = -j8;
        }
        sb.append(longToChinese(j8, z7));
        return sb.toString();
    }
}
