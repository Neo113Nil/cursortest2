package cn.hutool.core.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.WeightRandom;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public class i0 {
    public static final String BASE_CHAR = "abcdefghijklmnopqrstuvwxyz";
    public static final String BASE_CHAR_NUMBER = "abcdefghijklmnopqrstuvwxyz".toUpperCase() + "abcdefghijklmnopqrstuvwxyz0123456789";
    public static final String BASE_CHAR_NUMBER_LOWER = "abcdefghijklmnopqrstuvwxyz0123456789";
    public static final String BASE_NUMBER = "0123456789";

    public static SecureRandom createSecureRandom(byte[] bArr) {
        return bArr == null ? new SecureRandom() : new SecureRandom(bArr);
    }

    public static ThreadLocalRandom getRandom() {
        return ThreadLocalRandom.current();
    }

    public static SecureRandom getSHA1PRNGRandom(byte[] bArr) {
        try {
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            if (bArr != null) {
                secureRandom.setSeed(bArr);
            }
            return secureRandom;
        } catch (NoSuchAlgorithmException e8) {
            throw new UtilException(e8);
        }
    }

    public static SecureRandom getSecureRandom() {
        return getSecureRandom(null);
    }

    public static SecureRandom getSecureRandomStrong() {
        SecureRandom instanceStrong;
        try {
            instanceStrong = SecureRandom.getInstanceStrong();
            return instanceStrong;
        } catch (NoSuchAlgorithmException e8) {
            throw new UtilException(e8);
        }
    }

    public static BigDecimal randomBigDecimal() {
        return d0.toBigDecimal(Double.valueOf(getRandom().nextDouble()));
    }

    public static boolean randomBoolean() {
        return randomInt(2) == 0;
    }

    public static byte[] randomBytes(int i8) {
        byte[] bArr = new byte[i8];
        getRandom().nextBytes(bArr);
        return bArr;
    }

    public static char randomChar() {
        return randomChar(BASE_CHAR_NUMBER);
    }

    public static char randomChinese() {
        return (char) randomInt(19968, 40959);
    }

    public static DateTime randomDate(Date date, DateField dateField, int i8, int i9) {
        if (date == null) {
            date = cn.hutool.core.date.z.date();
        }
        return cn.hutool.core.date.z.offset(date, dateField, randomInt(i8, i9));
    }

    public static DateTime randomDay(int i8, int i9) {
        return randomDate(cn.hutool.core.date.z.date(), DateField.DAY_OF_YEAR, i8, i9);
    }

    public static double randomDouble(double d8, double d9) {
        return getRandom().nextDouble(d8, d9);
    }

    public static <T> T randomEle(List<T> list) {
        return (T) randomEle(list, list.size());
    }

    public static <T> List<T> randomEleList(List<T> list, int i8) {
        if (i8 >= list.size()) {
            return cn.hutool.core.collection.n0.toList((Collection) list);
        }
        int[] sub = g0.sub(randomInts(list.size()), 0, i8);
        ArrayList arrayList = new ArrayList();
        for (int i9 : sub) {
            arrayList.add(list.get(i9));
        }
        return arrayList;
    }

    public static <T> Set<T> randomEleSet(Collection<T> collection, int i8) {
        ArrayList distinct = CollUtil.distinct(collection);
        if (i8 > distinct.size()) {
            throw new IllegalArgumentException("Count is larger than collection distinct size !");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i8);
        int size = distinct.size();
        while (linkedHashSet.size() < i8) {
            linkedHashSet.add(randomEle(distinct, size));
        }
        return linkedHashSet;
    }

    public static <T> List<T> randomEles(List<T> list, int i8) {
        ArrayList arrayList = new ArrayList(i8);
        int size = list.size();
        while (arrayList.size() < i8) {
            arrayList.add(randomEle(list, size));
        }
        return arrayList;
    }

    public static float randomFloat() {
        return getRandom().nextFloat();
    }

    public static int randomInt() {
        return getRandom().nextInt();
    }

    public static int[] randomInts(int i8) {
        int[] range = g0.range(i8);
        for (int i9 = 0; i9 < i8; i9++) {
            g0.swap(range, i9, randomInt(i9, i8));
        }
        return range;
    }

    public static long randomLong() {
        return getRandom().nextLong();
    }

    public static char randomNumber() {
        return randomChar("0123456789");
    }

    public static String randomNumbers(int i8) {
        return randomString("0123456789", i8);
    }

    public static String randomString(int i8) {
        return randomString(BASE_CHAR_NUMBER, i8);
    }

    public static String randomStringUpper(int i8) {
        return randomString(BASE_CHAR_NUMBER, i8).toUpperCase();
    }

    public static String randomStringWithoutStr(int i8, String str) {
        return randomString(cn.hutool.core.text.l.removeAll(BASE_CHAR_NUMBER, str.toLowerCase().toCharArray()), i8);
    }

    public static <T> WeightRandom<T> weightRandom(WeightRandom.a[] aVarArr) {
        return new WeightRandom<>(aVarArr);
    }

    public static Random getRandom(boolean z7) {
        return z7 ? getSecureRandom() : getRandom();
    }

    public static SecureRandom getSecureRandom(byte[] bArr) {
        return createSecureRandom(bArr);
    }

    public static BigDecimal randomBigDecimal(BigDecimal bigDecimal) {
        return d0.toBigDecimal(Double.valueOf(getRandom().nextDouble(bigDecimal.doubleValue())));
    }

    public static char randomChar(String str) {
        return str.charAt(randomInt(str.length()));
    }

    public static double randomDouble(double d8, double d9, int i8, RoundingMode roundingMode) {
        return d0.round(randomDouble(d8, d9), i8, roundingMode).doubleValue();
    }

    public static <T> T randomEle(List<T> list, int i8) {
        if (list.size() < i8) {
            i8 = list.size();
        }
        return list.get(randomInt(i8));
    }

    public static float randomFloat(float f8) {
        return randomFloat(0.0f, f8);
    }

    public static int randomInt(int i8) {
        return getRandom().nextInt(i8);
    }

    public static long randomLong(long j8) {
        return getRandom().nextLong(j8);
    }

    public static String randomString(String str, int i8) {
        if (cn.hutool.core.text.l.isEmpty(str)) {
            return "";
        }
        if (i8 < 1) {
            i8 = 1;
        }
        StringBuilder sb = new StringBuilder(i8);
        int length = str.length();
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append(str.charAt(randomInt(length)));
        }
        return sb.toString();
    }

    public static <T> WeightRandom<T> weightRandom(Iterable<WeightRandom.a> iterable) {
        return new WeightRandom<>(iterable);
    }

    public static BigDecimal randomBigDecimal(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return d0.toBigDecimal(Double.valueOf(getRandom().nextDouble(bigDecimal.doubleValue(), bigDecimal2.doubleValue())));
    }

    public static double randomDouble() {
        return getRandom().nextDouble();
    }

    public static float randomFloat(float f8, float f9) {
        return f8 == f9 ? f8 : f8 + ((f9 - f8) * getRandom().nextFloat());
    }

    public static int randomInt(int i8, int i9) {
        return randomInt(i8, i9, true, false);
    }

    public static long randomLong(long j8, long j9) {
        return randomLong(j8, j9, true, false);
    }

    public static double randomDouble(int i8, RoundingMode roundingMode) {
        return d0.round(randomDouble(), i8, roundingMode).doubleValue();
    }

    public static int randomInt(int i8, int i9, boolean z7, boolean z8) {
        if (!z7) {
            i8++;
        }
        if (z8) {
            i9--;
        }
        return getRandom().nextInt(i8, i9);
    }

    public static long randomLong(long j8, long j9, boolean z7, boolean z8) {
        if (!z7) {
            j8++;
        }
        if (z8) {
            j9--;
        }
        return getRandom().nextLong(j8, j9);
    }

    public static double randomDouble(double d8) {
        return getRandom().nextDouble(d8);
    }

    public static <T> T randomEle(T[] tArr) {
        return (T) randomEle(tArr, tArr.length);
    }

    public static double randomDouble(double d8, int i8, RoundingMode roundingMode) {
        return d0.round(randomDouble(d8), i8, roundingMode).doubleValue();
    }

    public static <T> T randomEle(T[] tArr, int i8) {
        if (tArr.length < i8) {
            i8 = tArr.length;
        }
        return tArr[randomInt(i8)];
    }
}
