package com.android.mltcode.paycertification.utils;

import androidx.annotation.Keep;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Keep
/* loaded from: classes.dex */
public class RandomUtil {
    public static final String BASE_CHAR = "abcdefghijklmnopqrstuvwxyz";
    public static final String BASE_CHAR_NUMBER = "abcdefghijklmnopqrstuvwxyz0123456789";
    public static final String BASE_NUMBER = "0123456789";

    public static SecureRandom createSecureRandom(byte[] bArr) {
        return bArr == null ? new SecureRandom() : new SecureRandom(bArr);
    }

    public static ThreadLocalRandom getRandom() {
        return ThreadLocalRandom.current();
    }

    public static SecureRandom getSecureRandom() {
        return getSecureRandom(null);
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
        return randomChar("abcdefghijklmnopqrstuvwxyz0123456789");
    }

    public static char randomChinese() {
        return (char) randomInt(19968, 40959);
    }

    public static double randomDouble(double d8, double d9) {
        return getRandom().nextDouble(d8, d9);
    }

    public static <T> T randomEle(List<T> list) {
        return (T) randomEle(list, list.size());
    }

    public static <T> List<T> randomEles(List<T> list, int i8) {
        ArrayList arrayList = new ArrayList(i8);
        int size = list.size();
        while (arrayList.size() < i8) {
            arrayList.add(randomEle(list, size));
        }
        return arrayList;
    }

    public static int randomInt(int i8, int i9) {
        return getRandom().nextInt(i8, i9);
    }

    public static long randomLong(long j8, long j9) {
        return getRandom().nextLong(j8, j9);
    }

    public static char randomNumber() {
        return randomChar("0123456789");
    }

    public static Random getRandom(boolean z7) {
        return z7 ? getSecureRandom() : getRandom();
    }

    public static SecureRandom getSecureRandom(byte[] bArr) {
        return createSecureRandom(bArr);
    }

    public static char randomChar(String str) {
        return str.charAt(randomInt(str.length()));
    }

    public static double randomDouble() {
        return getRandom().nextDouble();
    }

    public static <T> T randomEle(List<T> list, int i8) {
        if (list.size() < i8) {
            i8 = list.size();
        }
        return list.get(randomInt(i8));
    }

    public static int randomInt() {
        return getRandom().nextInt();
    }

    public static long randomLong() {
        return getRandom().nextLong();
    }

    public static double randomDouble(double d8) {
        return getRandom().nextDouble(d8);
    }

    public static int randomInt(int i8) {
        return getRandom().nextInt(i8);
    }

    public static long randomLong(long j8) {
        return getRandom().nextLong(j8);
    }

    public static <T> T randomEle(T[] tArr) {
        return (T) randomEle(tArr, tArr.length);
    }

    public static <T> T randomEle(T[] tArr, int i8) {
        if (tArr.length < i8) {
            i8 = tArr.length;
        }
        return tArr[randomInt(i8)];
    }
}
