package cn.hutool.core.util;

import androidx.exifinterface.media.ExifInterface;
import cn.hutool.core.exceptions.UtilException;
import com.google.common.primitives.Longs;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class d0 {
    private static final int DEFAULT_DIV_SCALE = 10;
    private static final long[] FACTORIALS = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    public static double add(float f8, float f9) {
        return add(Float.toString(f8), Float.toString(f9)).doubleValue();
    }

    public static Collection<Integer> appendRange(int i8, int i9, Collection<Integer> collection) {
        return appendRange(i8, i9, 1, collection);
    }

    public static int binaryToInt(String str) {
        return Integer.parseInt(str, 2);
    }

    public static long binaryToLong(String str) {
        return Long.parseLong(str, 2);
    }

    public static double calculate(String str) {
        return r.a.conversion(str);
    }

    public static int ceilDiv(int i8, int i9) {
        return (int) Math.ceil(i8 / i9);
    }

    public static int compare(char c8, char c9) {
        return Character.compare(c8, c9);
    }

    public static int count(int i8, int i9) {
        int i10 = i8 % i9;
        int i11 = i8 / i9;
        return i10 == 0 ? i11 : i11 + 1;
    }

    public static String decimalFormat(String str, double d8) {
        cn.hutool.core.lang.q.isTrue(isValid(d8), "value is NaN or Infinite!", new Object[0]);
        return new DecimalFormat(str).format(d8);
    }

    public static String decimalFormatMoney(double d8) {
        return decimalFormat(",##0.00", d8);
    }

    public static double div(float f8, float f9) {
        return div(f8, f9, 10);
    }

    public static int divisor(int i8, int i9) {
        while (true) {
            int i10 = i8 % i9;
            if (i10 == 0) {
                return i9;
            }
            int i11 = i9;
            i9 = i10;
            i8 = i11;
        }
    }

    public static boolean equals(long j8, long j9) {
        return j8 == j9;
    }

    public static BigInteger factorial(BigInteger bigInteger) {
        BigInteger bigInteger2 = BigInteger.ZERO;
        return bigInteger.equals(bigInteger2) ? BigInteger.ONE : factorial(bigInteger, bigInteger2);
    }

    private static long factorialMultiplyAndCheck(long j8, long j9) {
        if (j8 <= Long.MAX_VALUE / j9) {
            return j8 * j9;
        }
        throw new IllegalArgumentException(cn.hutool.core.text.l.format("Overflow in multiplication: {} * {}", Long.valueOf(j8), Long.valueOf(j9)));
    }

    public static String formatPercent(double d8, int i8) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMaximumFractionDigits(i8);
        return percentInstance.format(d8);
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static Integer[] generateBySet(int i8, int i9, int i10) {
        if (i8 <= i9) {
            i9 = i8;
            i8 = i9;
        }
        int i11 = i8 - i9;
        if (i11 < i10) {
            throw new UtilException("Size is larger than range between begin and end!");
        }
        HashSet hashSet = new HashSet(i10, 1.0f);
        while (hashSet.size() < i10) {
            hashSet.add(Integer.valueOf(i0.randomInt(i11) + i9));
        }
        return (Integer[]) hashSet.toArray(new Integer[0]);
    }

    public static int[] generateRandomNumber(int i8, int i9, int i10) {
        return generateRandomNumber(i8, i9, i10, g0.range(i8, i9));
    }

    public static String getBinaryStr(Number number) {
        return number instanceof Long ? Long.toBinaryString(((Long) number).longValue()) : number instanceof Integer ? Integer.toBinaryString(((Integer) number).intValue()) : Long.toBinaryString(number.longValue());
    }

    public static boolean isBeside(long j8, long j9) {
        return Math.abs(j8 - j9) == 1;
    }

    public static boolean isDouble(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return str.contains(".");
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isEven(int i8) {
        return !isOdd(i8);
    }

    public static boolean isGreater(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        cn.hutool.core.lang.q.notNull(bigDecimal);
        cn.hutool.core.lang.q.notNull(bigDecimal2);
        return bigDecimal.compareTo(bigDecimal2) > 0;
    }

    public static boolean isGreaterOrEqual(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        cn.hutool.core.lang.q.notNull(bigDecimal);
        cn.hutool.core.lang.q.notNull(bigDecimal2);
        return bigDecimal.compareTo(bigDecimal2) >= 0;
    }

    public static boolean isIn(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        cn.hutool.core.lang.q.notNull(bigDecimal);
        cn.hutool.core.lang.q.notNull(bigDecimal2);
        cn.hutool.core.lang.q.notNull(bigDecimal3);
        return isGreaterOrEqual(bigDecimal, bigDecimal2) && isLessOrEqual(bigDecimal, bigDecimal3);
    }

    public static boolean isInteger(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isLess(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        cn.hutool.core.lang.q.notNull(bigDecimal);
        cn.hutool.core.lang.q.notNull(bigDecimal2);
        return bigDecimal.compareTo(bigDecimal2) < 0;
    }

    public static boolean isLessOrEqual(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        cn.hutool.core.lang.q.notNull(bigDecimal);
        cn.hutool.core.lang.q.notNull(bigDecimal2);
        return bigDecimal.compareTo(bigDecimal2) <= 0;
    }

    public static boolean isLong(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return false;
        }
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        if (r3 >= r0.length) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0074, code lost:
    
        r0 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0076, code lost:
    
        if (r0 < '0') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0078, code lost:
    
        if (r0 > '9') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r0 == 'e') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007d, code lost:
    
        if (r0 != 'E') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r0 != '.') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r15 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0084, code lost:
    
        if (r14 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0089, code lost:
    
        if (r12 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008d, code lost:
    
        if (r0 == 'd') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0091, code lost:
    
        if (r0 == 'D') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0093, code lost:
    
        if (r0 == 'f') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0097, code lost:
    
        if (r0 != 'F') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0099, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009c, code lost:
    
        if (r0 == 'l') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a0, code lost:
    
        if (r0 != 'L') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a4, code lost:
    
        if (r13 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a6, code lost:
    
        if (r14 != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00aa, code lost:
    
        if (r12 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ac, code lost:
    
        if (r13 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ae, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isNumber(CharSequence charSequence) {
        char c8;
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return false;
        }
        char[] charArray = charSequence.toString().toCharArray();
        int length = charArray.length;
        char c9 = charArray[0];
        boolean z7 = true;
        int i8 = (c9 == '-' || c9 == '+') ? 1 : 0;
        int i9 = i8 + 1;
        if (length > i9 && charArray[i8] == '0' && ((c8 = charArray[i9]) == 'x' || c8 == 'X')) {
            int i10 = i8 + 2;
            if (i10 == length) {
                return false;
            }
            while (i10 < charArray.length) {
                char c10 = charArray[i10];
                if ((c10 < '0' || c10 > '9') && ((c10 < 'a' || c10 > 'f') && (c10 < 'A' || c10 > 'F'))) {
                    return false;
                }
                i10++;
            }
            return true;
        }
        int i11 = length - 1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (i8 < i11 || (i8 < length && z8 && !z9)) {
                char c11 = charArray[i8];
                if (c11 >= '0' && c11 <= '9') {
                    z8 = false;
                    z9 = true;
                } else if (c11 == '.') {
                    if (z11 || z10) {
                        break;
                    }
                    z11 = true;
                } else if (c11 == 'e' || c11 == 'E') {
                    if (z10 || !z9) {
                        return false;
                    }
                    z8 = true;
                    z10 = true;
                } else {
                    if ((c11 != '+' && c11 != '-') || !z8) {
                        return false;
                    }
                    z8 = false;
                    z9 = false;
                }
                i8++;
                z7 = true;
            }
        }
        return false;
    }

    public static boolean isOdd(int i8) {
        return (i8 & 1) == 1;
    }

    public static boolean isPowerOfTwo(long j8) {
        return j8 > 0 && (j8 & (j8 - 1)) == 0;
    }

    public static boolean isPrimes(int i8) {
        cn.hutool.core.lang.q.isTrue(i8 > 1, "The number must be > 1", new Object[0]);
        for (int i9 = 2; i9 <= Math.sqrt(i8); i9++) {
            if (i8 % i9 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(double d8) {
        return !(Double.isNaN(d8) || Double.isInfinite(d8));
    }

    public static boolean isValidNumber(Number number) {
        if (number == null) {
            return false;
        }
        if (number instanceof Double) {
            Double d8 = (Double) number;
            return (d8.isInfinite() || d8.isNaN()) ? false : true;
        }
        if (!(number instanceof Float)) {
            return true;
        }
        Float f8 = (Float) number;
        return (f8.isInfinite() || f8.isNaN()) ? false : true;
    }

    private static int mathNode(int i8) {
        if (i8 == 0) {
            return 1;
        }
        return i8 * mathNode(i8 - 1);
    }

    private static int mathSubNode(int i8, int i9) {
        if (i8 == i9) {
            return 1;
        }
        return i8 * mathSubNode(i8 - 1, i9);
    }

    public static <T extends Comparable<? super T>> T max(T[] tArr) {
        return (T) h.max(tArr);
    }

    public static <T extends Comparable<? super T>> T min(T[] tArr) {
        return (T) h.min(tArr);
    }

    public static double mul(float f8, float f9) {
        return mul(Float.toString(f8), Float.toString(f9)).doubleValue();
    }

    public static int multiple(int i8, int i9) {
        return (i8 * i9) / divisor(i8, i9);
    }

    public static BigInteger newBigInteger(String str) {
        int i8;
        String trimToNull = cn.hutool.core.text.l.trimToNull(str);
        if (trimToNull == null) {
            return null;
        }
        boolean startsWith = trimToNull.startsWith("-");
        int i9 = 16;
        if (trimToNull.startsWith("0x", startsWith ? 1 : 0) || trimToNull.startsWith("0X", startsWith ? 1 : 0)) {
            i8 = (startsWith ? 1 : 0) + 2;
        } else if (trimToNull.startsWith("#", startsWith ? 1 : 0)) {
            i8 = (startsWith ? 1 : 0) + 1;
        } else {
            if (trimToNull.startsWith("0", startsWith ? 1 : 0)) {
                int length = trimToNull.length();
                int i10 = (startsWith ? 1 : 0) + 1;
                if (length > i10) {
                    i8 = i10;
                    i9 = 8;
                }
            }
            i9 = 10;
            i8 = startsWith ? 1 : 0;
        }
        if (i8 > 0) {
            trimToNull = trimToNull.substring(i8);
        }
        BigInteger bigInteger = new BigInteger(trimToNull, i9);
        return startsWith ? bigInteger.negate() : bigInteger;
    }

    @Deprecated
    public static BigDecimal null2Zero(BigDecimal bigDecimal) {
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
    }

    public static int nullToZero(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static double parseDouble(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return parseNumber(str).doubleValue();
        }
    }

    public static float parseFloat(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return parseNumber(str).floatValue();
        }
    }

    public static int parseInt(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return 0;
        }
        if (cn.hutool.core.text.l.startWithIgnoreCase(str, "0x")) {
            return Integer.parseInt(str.substring(2), 16);
        }
        if (cn.hutool.core.text.l.containsIgnoreCase(str, ExifInterface.LONGITUDE_EAST)) {
            throw new NumberFormatException(cn.hutool.core.text.l.format("Unsupported int format: [{}]", str));
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return parseNumber(str).intValue();
        }
    }

    public static long parseLong(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return 0L;
        }
        if (str.startsWith("0x")) {
            return Long.parseLong(str.substring(2), 16);
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return parseNumber(str).longValue();
        }
    }

    public static Number parseNumber(String str) {
        if (cn.hutool.core.text.l.startWithIgnoreCase(str, "0x")) {
            return Long.valueOf(Long.parseLong(str.substring(2), 16));
        }
        if (cn.hutool.core.text.l.startWith((CharSequence) str, '+')) {
            str = cn.hutool.core.text.l.subSuf(str, 1);
        }
        try {
            NumberFormat numberFormat = NumberFormat.getInstance();
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setParseBigDecimal(true);
            }
            return numberFormat.parse(str);
        } catch (ParseException e8) {
            NumberFormatException numberFormatException = new NumberFormatException(e8.getMessage());
            numberFormatException.initCause(e8);
            throw numberFormatException;
        }
    }

    public static int partValue(int i8, int i9) {
        return partValue(i8, i9, true);
    }

    public static BigDecimal pow(Number number, int i8) {
        return pow(toBigDecimal(number), i8);
    }

    public static int processMultiple(int i8, int i9) {
        return mathSubNode(i8, i9) / mathNode(i8 - i9);
    }

    public static int[] range(int i8) {
        return range(0, i8);
    }

    public static BigDecimal round(double d8, int i8) {
        return round(d8, i8, RoundingMode.HALF_UP);
    }

    public static BigDecimal roundDown(Number number, int i8) {
        return roundDown(toBigDecimal(number), i8);
    }

    public static BigDecimal roundHalfEven(Number number, int i8) {
        return roundHalfEven(toBigDecimal(number), i8);
    }

    public static String roundStr(double d8, int i8) {
        return round(d8, i8).toPlainString();
    }

    public static long sqrt(long j8) {
        long j9 = 0;
        for (long j10 = Longs.MAX_POWER_OF_TWO; j10 > 0; j10 >>= 2) {
            long j11 = j9 + j10;
            if (j8 >= j11) {
                j8 -= j11;
                j9 = (j9 >> 1) + j10;
            } else {
                j9 >>= 1;
            }
        }
        return j9;
    }

    public static double sub(float f8, float f9) {
        return sub(Float.toString(f8), Float.toString(f9)).doubleValue();
    }

    public static BigDecimal toBigDecimal(Number number) {
        return number == null ? BigDecimal.ZERO : number instanceof BigDecimal ? (BigDecimal) number : number instanceof Long ? new BigDecimal(((Long) number).longValue()) : number instanceof Integer ? new BigDecimal(((Integer) number).intValue()) : number instanceof BigInteger ? new BigDecimal((BigInteger) number) : toBigDecimal(number.toString());
    }

    public static BigInteger toBigInteger(Number number) {
        return number == null ? BigInteger.ZERO : number instanceof BigInteger ? (BigInteger) number : number instanceof Long ? BigInteger.valueOf(((Long) number).longValue()) : toBigInteger(Long.valueOf(number.longValue()));
    }

    public static byte[] toBytes(int i8) {
        return new byte[]{(byte) (i8 >> 24), (byte) (i8 >> 16), (byte) (i8 >> 8), (byte) i8};
    }

    public static double toDouble(Number number) {
        return number instanceof Float ? Double.parseDouble(number.toString()) : number.doubleValue();
    }

    public static int toInt(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static String toStr(Number number, String str) {
        return number == null ? str : toStr(number);
    }

    public static byte[] toUnsignedByteArray(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    public static int zero2One(int i8) {
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    public static double add(float f8, double d8) {
        return add(Float.toString(f8), Double.toString(d8)).doubleValue();
    }

    public static Collection<Integer> appendRange(int i8, int i9, int i10, Collection<Integer> collection) {
        int i11;
        if (i8 < i9) {
            i11 = Math.abs(i10);
        } else {
            if (i8 <= i9) {
                collection.add(Integer.valueOf(i8));
                return collection;
            }
            i11 = -Math.abs(i10);
        }
        while (true) {
            if (i11 <= 0) {
                if (i8 < i9) {
                    break;
                }
                collection.add(Integer.valueOf(i8));
                i8 += i11;
            } else {
                if (i8 > i9) {
                    break;
                }
                collection.add(Integer.valueOf(i8));
                i8 += i11;
            }
        }
        return collection;
    }

    public static int compare(double d8, double d9) {
        return Double.compare(d8, d9);
    }

    public static double div(float f8, double d8) {
        return div(f8, d8, 10);
    }

    public static boolean equals(double d8, double d9) {
        return Double.doubleToLongBits(d8) == Double.doubleToLongBits(d9);
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr, int i8, int i9) {
        if (i8 != 0 || i9 != bArr.length) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static boolean isBeside(int i8, int i9) {
        return Math.abs(i8 - i9) == 1;
    }

    public static boolean isValid(float f8) {
        return !(Float.isNaN(f8) || Float.isInfinite(f8));
    }

    public static long max(long... jArr) {
        return g0.max(jArr);
    }

    public static long min(long... jArr) {
        return g0.min(jArr);
    }

    public static double mul(float f8, double d8) {
        return mul(Float.toString(f8), Double.toString(d8)).doubleValue();
    }

    public static long nullToZero(Long l8) {
        if (l8 == null) {
            return 0L;
        }
        return l8.longValue();
    }

    public static int partValue(int i8, int i9, boolean z7) {
        int i10 = i8 / i9;
        return (!z7 || i8 % i9 <= 0) ? i10 : i10 + 1;
    }

    public static BigDecimal pow(BigDecimal bigDecimal, int i8) {
        return bigDecimal.pow(i8);
    }

    public static int[] range(int i8, int i9) {
        return range(i8, i9, 1);
    }

    public static BigDecimal round(String str, int i8) {
        return round(str, i8, RoundingMode.HALF_UP);
    }

    public static BigDecimal roundDown(BigDecimal bigDecimal, int i8) {
        return round(bigDecimal, i8, RoundingMode.DOWN);
    }

    public static BigDecimal roundHalfEven(BigDecimal bigDecimal, int i8) {
        return round(bigDecimal, i8, RoundingMode.HALF_EVEN);
    }

    public static String roundStr(String str, int i8) {
        return round(str, i8).toPlainString();
    }

    public static double sub(float f8, double d8) {
        return sub(Float.toString(f8), Double.toString(d8)).doubleValue();
    }

    public static String toStr(Number number) {
        return toStr(number, true);
    }

    public static double add(double d8, float f8) {
        return add(Double.toString(d8), Float.toString(f8)).doubleValue();
    }

    public static int compare(int i8, int i9) {
        return Integer.compare(i8, i9);
    }

    public static String decimalFormat(String str, long j8) {
        return new DecimalFormat(str).format(j8);
    }

    public static double div(double d8, float f8) {
        return div(d8, f8, 10);
    }

    public static boolean equals(float f8, float f9) {
        return Float.floatToIntBits(f8) == Float.floatToIntBits(f9);
    }

    public static int[] generateRandomNumber(int i8, int i9, int i10, int[] iArr) {
        if (i8 <= i9) {
            i9 = i8;
            i8 = i9;
        }
        cn.hutool.core.lang.q.isTrue(i8 - i9 >= i10, "Size is larger than range between begin and end!", new Object[0]);
        cn.hutool.core.lang.q.isTrue(iArr.length >= i10, "Size is larger than seed size!", new Object[0]);
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int randomInt = i0.randomInt(iArr.length - i11);
            iArr2[i11] = iArr[randomInt];
            iArr[randomInt] = iArr[(iArr.length - 1) - i11];
        }
        return iArr2;
    }

    public static int max(int... iArr) {
        return g0.max(iArr);
    }

    public static int min(int... iArr) {
        return g0.min(iArr);
    }

    public static double mul(double d8, float f8) {
        return mul(Double.toString(d8), Float.toString(f8)).doubleValue();
    }

    public static double nullToZero(Double d8) {
        return d8 == null ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : d8.doubleValue();
    }

    public static int[] range(int i8, int i9, int i10) {
        int i11;
        if (i8 < i9) {
            i11 = Math.abs(i10);
        } else {
            if (i8 <= i9) {
                return new int[]{i8};
            }
            i11 = -Math.abs(i10);
        }
        int[] iArr = new int[Math.abs((i9 - i8) / i11) + 1];
        int i12 = 0;
        while (true) {
            if (i11 <= 0) {
                if (i8 < i9) {
                    break;
                }
                iArr[i12] = i8;
                i12++;
                i8 += i11;
            } else {
                if (i8 > i9) {
                    break;
                }
                iArr[i12] = i8;
                i12++;
                i8 += i11;
            }
        }
        return iArr;
    }

    public static BigDecimal round(BigDecimal bigDecimal, int i8) {
        return round(bigDecimal, i8, RoundingMode.HALF_UP);
    }

    public static String roundStr(double d8, int i8, RoundingMode roundingMode) {
        return round(d8, i8, roundingMode).toPlainString();
    }

    public static double sub(double d8, float f8) {
        return sub(Double.toString(d8), Float.toString(f8)).doubleValue();
    }

    public static String toStr(Number number, boolean z7) {
        cn.hutool.core.lang.q.notNull(number, "Number is null !", new Object[0]);
        if (number instanceof BigDecimal) {
            return toStr((BigDecimal) number, z7);
        }
        cn.hutool.core.lang.q.isTrue(isValidNumber(number), "Number is non-finite!", new Object[0]);
        String obj = number.toString();
        if (!z7 || obj.indexOf(46) <= 0 || obj.indexOf(101) >= 0 || obj.indexOf(69) >= 0) {
            return obj;
        }
        while (obj.endsWith("0")) {
            obj = obj.substring(0, obj.length() - 1);
        }
        return obj.endsWith(".") ? obj.substring(0, obj.length() - 1) : obj;
    }

    public static double add(double d8, double d9) {
        return add(Double.toString(d8), Double.toString(d9)).doubleValue();
    }

    public static int compare(long j8, long j9) {
        return Long.compare(j8, j9);
    }

    public static String decimalFormat(String str, Object obj) {
        return decimalFormat(str, obj, null);
    }

    public static double div(double d8, double d9) {
        return div(d8, d9, 10);
    }

    public static boolean equals(Number number, Number number2) {
        if ((number instanceof BigDecimal) && (number2 instanceof BigDecimal)) {
            return equals((BigDecimal) number, (BigDecimal) number2);
        }
        return Objects.equals(number, number2);
    }

    public static BigInteger factorial(BigInteger bigInteger, BigInteger bigInteger2) {
        cn.hutool.core.lang.q.notNull(bigInteger, "Factorial start must be not null!", new Object[0]);
        cn.hutool.core.lang.q.notNull(bigInteger2, "Factorial end must be not null!", new Object[0]);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigInteger.compareTo(bigInteger3) >= 0 && bigInteger2.compareTo(bigInteger3) >= 0) {
            if (bigInteger.equals(bigInteger3)) {
                bigInteger = BigInteger.ONE;
            }
            BigInteger bigInteger4 = BigInteger.ONE;
            if (bigInteger2.compareTo(bigInteger4) < 0) {
                bigInteger2 = bigInteger4;
            }
            BigInteger add = bigInteger2.add(bigInteger4);
            BigInteger bigInteger5 = bigInteger;
            while (bigInteger.compareTo(add) > 0) {
                bigInteger = bigInteger.subtract(BigInteger.ONE);
                bigInteger5 = bigInteger5.multiply(bigInteger);
            }
            return bigInteger5;
        }
        throw new IllegalArgumentException(cn.hutool.core.text.l.format("Factorial start and end both must be > 0, but got start={}, end={}", bigInteger, bigInteger2));
    }

    public static short max(short... sArr) {
        return g0.max(sArr);
    }

    public static short min(short... sArr) {
        return g0.min(sArr);
    }

    public static double mul(double d8, double d9) {
        return mul(Double.toString(d8), Double.toString(d9)).doubleValue();
    }

    public static float nullToZero(Float f8) {
        if (f8 == null) {
            return 0.0f;
        }
        return f8.floatValue();
    }

    public static Double parseDouble(String str, Double d8) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return d8;
        }
        try {
            return Double.valueOf(parseDouble(str));
        } catch (NumberFormatException unused) {
            return d8;
        }
    }

    public static Float parseFloat(String str, Float f8) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return f8;
        }
        try {
            return Float.valueOf(parseFloat(str));
        } catch (NumberFormatException unused) {
            return f8;
        }
    }

    public static BigDecimal round(double d8, int i8, RoundingMode roundingMode) {
        return round(Double.toString(d8), i8, roundingMode);
    }

    public static String roundStr(String str, int i8, RoundingMode roundingMode) {
        return round(str, i8, roundingMode).toPlainString();
    }

    public static double sub(double d8, double d9) {
        return sub(Double.toString(d8), Double.toString(d9)).doubleValue();
    }

    public static double add(Double d8, Double d9) {
        return add((Number) d8, (Number) d9).doubleValue();
    }

    public static int compare(short s7, short s8) {
        return Short.compare(s7, s8);
    }

    public static String decimalFormat(String str, Object obj, RoundingMode roundingMode) {
        if (obj instanceof Number) {
            cn.hutool.core.lang.q.isTrue(isValidNumber((Number) obj), "value is NaN or Infinite!", new Object[0]);
        }
        DecimalFormat decimalFormat = new DecimalFormat(str);
        if (roundingMode != null) {
            decimalFormat.setRoundingMode(roundingMode);
        }
        return decimalFormat.format(obj);
    }

    public static double div(Double d8, Double d9) {
        return div(d8, d9, 10);
    }

    public static double max(double... dArr) {
        return g0.max(dArr);
    }

    public static double min(double... dArr) {
        return g0.min(dArr);
    }

    public static double mul(Double d8, Double d9) {
        return mul((Number) d8, (Number) d9).doubleValue();
    }

    public static short nullToZero(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public static BigDecimal round(String str, int i8, RoundingMode roundingMode) {
        cn.hutool.core.lang.q.notBlank(str);
        if (i8 < 0) {
            i8 = 0;
        }
        return round(toBigDecimal(str), i8, roundingMode);
    }

    public static double sub(Double d8, Double d9) {
        return sub((Number) d8, (Number) d9).doubleValue();
    }

    public static byte[] toUnsignedByteArray(int i8, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i8) {
            return byteArray;
        }
        int i9 = byteArray[0] == 0 ? 1 : 0;
        int length = byteArray.length - i9;
        if (length <= i8) {
            byte[] bArr = new byte[i8];
            System.arraycopy(byteArray, i9, bArr, i8 - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public static BigDecimal add(Number number, Number number2) {
        return add(number, number2);
    }

    public static int compare(byte b8, byte b9) {
        return Byte.compare(b8, b9);
    }

    public static BigDecimal div(Number number, Number number2) {
        return div(number, number2, 10);
    }

    public static float max(float... fArr) {
        return g0.max(fArr);
    }

    public static float min(float... fArr) {
        return g0.min(fArr);
    }

    public static BigDecimal mul(Number number, Number number2) {
        return mul(number, number2);
    }

    public static byte nullToZero(Byte b8) {
        if (b8 == null) {
            return (byte) 0;
        }
        return b8.byteValue();
    }

    public static Long parseLong(String str, Long l8) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return l8;
        }
        try {
            return Long.valueOf(parseLong(str));
        } catch (NumberFormatException unused) {
            return l8;
        }
    }

    public static BigDecimal sub(Number number, Number number2) {
        return sub(number, number2);
    }

    public static BigDecimal add(Number... numberArr) {
        if (h.isEmpty((Object[]) numberArr)) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = toBigDecimal(numberArr[0]);
        for (int i8 = 1; i8 < numberArr.length; i8++) {
            Number number = numberArr[i8];
            if (number != null) {
                bigDecimal = bigDecimal.add(toBigDecimal(number));
            }
        }
        return bigDecimal;
    }

    public static BigDecimal div(String str, String str2) {
        return div(str, str2, 10);
    }

    public static boolean equals(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal == bigDecimal2) {
            return true;
        }
        return (bigDecimal == null || bigDecimal2 == null || bigDecimal.compareTo(bigDecimal2) != 0) ? false : true;
    }

    public static BigDecimal max(BigDecimal... bigDecimalArr) {
        return (BigDecimal) h.max(bigDecimalArr);
    }

    public static BigDecimal min(BigDecimal... bigDecimalArr) {
        return (BigDecimal) h.min(bigDecimalArr);
    }

    public static BigDecimal mul(Number... numberArr) {
        if (!h.isEmpty((Object[]) numberArr) && !h.hasNull(numberArr)) {
            BigDecimal bigDecimal = toBigDecimal(numberArr[0].toString());
            for (int i8 = 1; i8 < numberArr.length; i8++) {
                bigDecimal = bigDecimal.multiply(toBigDecimal(numberArr[i8].toString()));
            }
            return bigDecimal;
        }
        return BigDecimal.ZERO;
    }

    public static BigDecimal nullToZero(BigDecimal bigDecimal) {
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
    }

    public static BigDecimal round(BigDecimal bigDecimal, int i8, RoundingMode roundingMode) {
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return bigDecimal.setScale(i8, roundingMode);
    }

    public static BigDecimal sub(Number... numberArr) {
        if (h.isEmpty((Object[]) numberArr)) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = toBigDecimal(numberArr[0]);
        for (int i8 = 1; i8 < numberArr.length; i8++) {
            Number number = numberArr[i8];
            if (number != null) {
                bigDecimal = bigDecimal.subtract(toBigDecimal(number));
            }
        }
        return bigDecimal;
    }

    public static BigInteger toBigInteger(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? BigInteger.ZERO : new BigInteger(str);
    }

    public static double div(float f8, float f9, int i8) {
        return div(f8, f9, i8, RoundingMode.HALF_UP);
    }

    public static boolean equals(char c8, char c9, boolean z7) {
        return k.equals(c8, c9, z7);
    }

    public static BigInteger nullToZero(BigInteger bigInteger) {
        return bigInteger == null ? BigInteger.ZERO : bigInteger;
    }

    public static Integer parseInt(String str, Integer num) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return num;
        }
        try {
            return Integer.valueOf(parseInt(str));
        } catch (NumberFormatException unused) {
            return num;
        }
    }

    public static double div(float f8, double d8, int i8) {
        return div(f8, d8, i8, RoundingMode.HALF_UP);
    }

    public static double div(double d8, float f8, int i8) {
        return div(d8, f8, i8, RoundingMode.HALF_UP);
    }

    public static double div(double d8, double d9, int i8) {
        return div(d8, d9, i8, RoundingMode.HALF_UP);
    }

    public static BigDecimal toBigDecimal(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return BigDecimal.ZERO;
        }
        try {
            return new BigDecimal(str);
        } catch (Exception unused) {
            return toBigDecimal(parseNumber(str));
        }
    }

    public static double div(Double d8, Double d9, int i8) {
        return div(d8, d9, i8, RoundingMode.HALF_UP);
    }

    public static Number parseNumber(String str, Number number) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return number;
        }
        try {
            return parseNumber(str);
        } catch (NumberFormatException unused) {
            return number;
        }
    }

    public static BigDecimal div(Number number, Number number2, int i8) {
        return div(number, number2, i8, RoundingMode.HALF_UP);
    }

    public static String toStr(BigDecimal bigDecimal) {
        return toStr(bigDecimal, true);
    }

    public static BigDecimal add(String... strArr) {
        if (h.isEmpty((Object[]) strArr)) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = toBigDecimal(strArr[0]);
        for (int i8 = 1; i8 < strArr.length; i8++) {
            String str = strArr[i8];
            if (cn.hutool.core.text.l.isNotBlank(str)) {
                bigDecimal = bigDecimal.add(toBigDecimal(str));
            }
        }
        return bigDecimal;
    }

    public static BigDecimal div(String str, String str2, int i8) {
        return div(str, str2, i8, RoundingMode.HALF_UP);
    }

    public static BigDecimal mul(String str, String str2) {
        return mul(toBigDecimal(str), toBigDecimal(str2));
    }

    public static BigDecimal sub(String... strArr) {
        if (h.isEmpty((Object[]) strArr)) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = toBigDecimal(strArr[0]);
        for (int i8 = 1; i8 < strArr.length; i8++) {
            String str = strArr[i8];
            if (cn.hutool.core.text.l.isNotBlank(str)) {
                bigDecimal = bigDecimal.subtract(toBigDecimal(str));
            }
        }
        return bigDecimal;
    }

    public static String toStr(BigDecimal bigDecimal, boolean z7) {
        cn.hutool.core.lang.q.notNull(bigDecimal, "BigDecimal is null !", new Object[0]);
        if (z7) {
            bigDecimal = bigDecimal.stripTrailingZeros();
        }
        return bigDecimal.toPlainString();
    }

    public static double div(float f8, float f9, int i8, RoundingMode roundingMode) {
        return div(Float.toString(f8), Float.toString(f9), i8, roundingMode).doubleValue();
    }

    public static long factorial(long j8, long j9) {
        if (j8 < 0 || j9 < 0) {
            throw new IllegalArgumentException(cn.hutool.core.text.l.format("Factorial start and end both must be >= 0, but got start={}, end={}", Long.valueOf(j8), Long.valueOf(j9)));
        }
        if (0 == j8 || j8 == j9) {
            return 1L;
        }
        if (j8 < j9) {
            return 0L;
        }
        return factorialMultiplyAndCheck(j8, factorial(j8 - 1, j9));
    }

    public static BigDecimal mul(String... strArr) {
        if (!h.isEmpty((Object[]) strArr) && !h.hasNull(strArr)) {
            BigDecimal bigDecimal = toBigDecimal(strArr[0]);
            for (int i8 = 1; i8 < strArr.length; i8++) {
                bigDecimal = bigDecimal.multiply(toBigDecimal(strArr[i8]));
            }
            return bigDecimal;
        }
        return BigDecimal.ZERO;
    }

    public static double div(float f8, double d8, int i8, RoundingMode roundingMode) {
        return div(Float.toString(f8), Double.toString(d8), i8, roundingMode).doubleValue();
    }

    public static double div(double d8, float f8, int i8, RoundingMode roundingMode) {
        return div(Double.toString(d8), Float.toString(f8), i8, roundingMode).doubleValue();
    }

    public static long factorial(long j8) {
        if (j8 >= 0 && j8 <= 20) {
            return FACTORIALS[(int) j8];
        }
        throw new IllegalArgumentException(cn.hutool.core.text.l.format("Factorial must have n >= 0 and n <= 20 for n!, but got n = {}", Long.valueOf(j8)));
    }

    public static double div(double d8, double d9, int i8, RoundingMode roundingMode) {
        return div(Double.toString(d8), Double.toString(d9), i8, roundingMode).doubleValue();
    }

    public static double div(Double d8, Double d9, int i8, RoundingMode roundingMode) {
        return div((Number) d8, (Number) d9, i8, roundingMode).doubleValue();
    }

    public static BigDecimal div(Number number, Number number2, int i8, RoundingMode roundingMode) {
        if ((number instanceof BigDecimal) && (number2 instanceof BigDecimal)) {
            return div((BigDecimal) number, (BigDecimal) number2, i8, roundingMode);
        }
        return div(c1.toStringOrNull(number), c1.toStringOrNull(number2), i8, roundingMode);
    }

    public static BigDecimal mul(BigDecimal... bigDecimalArr) {
        if (!h.isEmpty((Object[]) bigDecimalArr) && !h.hasNull(bigDecimalArr)) {
            BigDecimal bigDecimal = bigDecimalArr[0];
            for (int i8 = 1; i8 < bigDecimalArr.length; i8++) {
                bigDecimal = bigDecimal.multiply(bigDecimalArr[i8]);
            }
            return bigDecimal;
        }
        return BigDecimal.ZERO;
    }

    public static BigDecimal add(BigDecimal... bigDecimalArr) {
        if (h.isEmpty((Object[]) bigDecimalArr)) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = toBigDecimal(bigDecimalArr[0]);
        for (int i8 = 1; i8 < bigDecimalArr.length; i8++) {
            BigDecimal bigDecimal2 = bigDecimalArr[i8];
            if (bigDecimal2 != null) {
                bigDecimal = bigDecimal.add(bigDecimal2);
            }
        }
        return bigDecimal;
    }

    public static BigDecimal sub(BigDecimal... bigDecimalArr) {
        if (h.isEmpty((Object[]) bigDecimalArr)) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = toBigDecimal(bigDecimalArr[0]);
        for (int i8 = 1; i8 < bigDecimalArr.length; i8++) {
            BigDecimal bigDecimal2 = bigDecimalArr[i8];
            if (bigDecimal2 != null) {
                bigDecimal = bigDecimal.subtract(bigDecimal2);
            }
        }
        return bigDecimal;
    }

    public static BigDecimal div(String str, String str2, int i8, RoundingMode roundingMode) {
        return div(toBigDecimal(str), toBigDecimal(str2), i8, roundingMode);
    }

    public static BigDecimal div(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i8, RoundingMode roundingMode) {
        cn.hutool.core.lang.q.notNull(bigDecimal2, "Divisor must be not null !", new Object[0]);
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        }
        if (i8 < 0) {
            i8 = -i8;
        }
        return bigDecimal.divide(bigDecimal2, i8, roundingMode);
    }
}
