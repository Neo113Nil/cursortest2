package cn.hutool.core.convert;

import cn.hutool.core.convert.impl.EnumConverter;
import cn.hutool.core.convert.impl.MapConverter;
import cn.hutool.core.lang.y0;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d {
    public static int byteToUnsignedInt(byte b8) {
        return b8 & 255;
    }

    public static int bytesToInt(byte[] bArr) {
        return cn.hutool.core.util.j.bytesToInt(bArr);
    }

    public static long bytesToLong(byte[] bArr) {
        return cn.hutool.core.util.j.bytesToLong(bArr);
    }

    public static short bytesToShort(byte[] bArr) {
        return cn.hutool.core.util.j.bytesToShort(bArr);
    }

    public static BigDecimal chineseMoneyToNumber(String str) {
        return z.chineseMoneyToNumber(str);
    }

    public static int chineseToNumber(String str) {
        return z.chineseToNumber(str);
    }

    public static <T> T convert(Class<T> cls, Object obj) {
        return (T) convert((Type) cls, obj);
    }

    public static <T> T convertByClassName(String str, Object obj) {
        return (T) convert(cn.hutool.core.util.p.loadClass(str), obj);
    }

    public static String convertCharset(String str, String str2, String str3) {
        return cn.hutool.core.text.l.hasBlank(str, str2, str3) ? str : cn.hutool.core.util.l.convert(str, str2, str3);
    }

    public static <T> T convertQuietly(Type type, Object obj) {
        return (T) convertQuietly(type, obj, null);
    }

    public static long convertTime(long j8, TimeUnit timeUnit, TimeUnit timeUnit2) {
        cn.hutool.core.lang.q.notNull(timeUnit, "sourceUnit is null !", new Object[0]);
        cn.hutool.core.lang.q.notNull(timeUnit2, "destUnit is null !", new Object[0]);
        return timeUnit2.convert(j8, timeUnit);
    }

    public static <T> T convertWithCheck(Type type, Object obj, T t7, boolean z7) {
        try {
            return (T) ConverterRegistry.getInstance().convert(type, obj, t7);
        } catch (Exception e8) {
            if (z7) {
                return t7;
            }
            throw e8;
        }
    }

    public static String digitToChinese(Number number) {
        return number == null ? "零" : z.format(number.doubleValue(), true, true);
    }

    public static byte[] hexToBytes(String str) {
        return cn.hutool.core.util.z.decodeHex(str.toCharArray());
    }

    public static String hexToStr(String str, Charset charset) {
        return cn.hutool.core.util.z.decodeHexStr(str, charset);
    }

    public static byte intToByte(int i8) {
        return (byte) i8;
    }

    public static byte[] intToBytes(int i8) {
        return cn.hutool.core.util.j.intToBytes(i8);
    }

    public static byte[] longToBytes(long j8) {
        return cn.hutool.core.util.j.longToBytes(j8);
    }

    public static String numberToChinese(double d8, boolean z7) {
        return z.format(d8, z7);
    }

    public static String numberToSimple(Number number) {
        return a0.formatSimple(number.longValue());
    }

    public static String numberToWord(Number number) {
        return a0.format(number);
    }

    public static byte[] shortToBytes(short s7) {
        return cn.hutool.core.util.j.shortToBytes(s7);
    }

    public static String strToUnicode(String str) {
        return cn.hutool.core.text.s.toUnicode(str);
    }

    public static BigDecimal toBigDecimal(Object obj, BigDecimal bigDecimal) {
        return (BigDecimal) convertQuietly(BigDecimal.class, obj, bigDecimal);
    }

    public static BigInteger toBigInteger(Object obj, BigInteger bigInteger) {
        return (BigInteger) convertQuietly(BigInteger.class, obj, bigInteger);
    }

    public static Boolean toBool(Object obj, Boolean bool) {
        return (Boolean) convertQuietly(Boolean.class, obj, bool);
    }

    public static Boolean[] toBooleanArray(Object obj) {
        return (Boolean[]) convert(Boolean[].class, obj);
    }

    public static Byte toByte(Object obj, Byte b8) {
        return (Byte) convertQuietly(Byte.class, obj, b8);
    }

    public static Byte[] toByteArray(Object obj) {
        return (Byte[]) convert(Byte[].class, obj);
    }

    public static Character toChar(Object obj, Character ch) {
        return (Character) convertQuietly(Character.class, obj, ch);
    }

    public static Character[] toCharArray(Object obj) {
        return (Character[]) convert(Character[].class, obj);
    }

    public static Collection<?> toCollection(Class<?> cls, Class<?> cls2, Object obj) {
        return new cn.hutool.core.convert.impl.a(cls, cls2).convert(obj, (Collection<?>) null);
    }

    public static String toDBC(String str) {
        return toDBC(str, null);
    }

    public static Date toDate(Object obj, Date date) {
        return (Date) convertQuietly(Date.class, obj, date);
    }

    public static Double toDouble(Object obj, Double d8) {
        return (Double) convertQuietly(Double.class, obj, d8);
    }

    public static Double[] toDoubleArray(Object obj) {
        return (Double[]) convert(Double[].class, obj);
    }

    public static <E extends Enum<E>> E toEnum(Class<E> cls, Object obj, E e8) {
        return (E) new EnumConverter(cls).convertQuietly(obj, e8);
    }

    public static Float toFloat(Object obj, Float f8) {
        return (Float) convertQuietly(Float.class, obj, f8);
    }

    public static Float[] toFloatArray(Object obj) {
        return (Float[]) convert(Float[].class, obj);
    }

    public static String toHex(String str, Charset charset) {
        return cn.hutool.core.util.z.encodeHexStr(str, charset);
    }

    public static Date toInstant(Object obj, Date date) {
        return (Date) convertQuietly(c.a(), obj, date);
    }

    public static Integer toInt(Object obj, Integer num) {
        return (Integer) convertQuietly(Integer.class, obj, num);
    }

    public static Integer[] toIntArray(Object obj) {
        return (Integer[]) convert(Integer[].class, obj);
    }

    public static List<?> toList(Object obj) {
        return (List) convert(List.class, obj);
    }

    public static LocalDateTime toLocalDateTime(Object obj, LocalDateTime localDateTime) {
        return b.a(convertQuietly(a.a(), obj, localDateTime));
    }

    public static Long toLong(Object obj, Long l8) {
        return (Long) convertQuietly(Long.class, obj, l8);
    }

    public static Long[] toLongArray(Object obj) {
        return (Long[]) convert(Long[].class, obj);
    }

    public static <K, V> Map<K, V> toMap(Class<K> cls, Class<V> cls2, Object obj) {
        return obj instanceof Map ? toMap(obj.getClass(), cls, cls2, obj) : toMap(HashMap.class, cls, cls2, obj);
    }

    public static Number toNumber(Object obj, Number number) {
        return (Number) convertQuietly(Number.class, obj, number);
    }

    public static Number[] toNumberArray(Object obj) {
        return (Number[]) convert(Number[].class, obj);
    }

    public static byte[] toPrimitiveByteArray(Object obj) {
        return (byte[]) convert(byte[].class, obj);
    }

    public static String toSBC(String str) {
        return toSBC(str, null);
    }

    public static <T> Set<T> toSet(Class<T> cls, Object obj) {
        return (Set) toCollection(HashSet.class, cls, obj);
    }

    public static Short toShort(Object obj, Short sh) {
        return (Short) convertQuietly(Short.class, obj, sh);
    }

    public static Short[] toShortArray(Object obj) {
        return (Short[]) convert(Short[].class, obj);
    }

    public static String toStr(Object obj, String str) {
        return (String) convertQuietly(String.class, obj, str);
    }

    public static String[] toStrArray(Object obj) {
        return (String[]) convert(String[].class, obj);
    }

    public static Class<?> unWrap(Class<?> cls) {
        return BasicType.unWrap(cls);
    }

    public static String unicodeToStr(String str) {
        return cn.hutool.core.text.s.toString(str);
    }

    public static Class<?> wrap(Class<?> cls) {
        return BasicType.wrap(cls);
    }

    public static <T> T convert(y0 y0Var, Object obj) {
        return (T) convert(y0Var.getType(), obj, (Object) null);
    }

    public static <T> T convertQuietly(Type type, Object obj, T t7) {
        return (T) convertWithCheck(type, obj, t7, true);
    }

    public static BigDecimal toBigDecimal(Object obj) {
        return toBigDecimal(obj, null);
    }

    public static BigInteger toBigInteger(Object obj) {
        return toBigInteger(obj, null);
    }

    public static Boolean toBool(Object obj) {
        return toBool(obj, null);
    }

    public static Byte toByte(Object obj) {
        return toByte(obj, null);
    }

    public static Character toChar(Object obj) {
        return toChar(obj, null);
    }

    public static String toDBC(String str, Set<Character> set) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i8 = 0; i8 < charArray.length; i8++) {
            if (set == null || !set.contains(Character.valueOf(charArray[i8]))) {
                char c8 = charArray[i8];
                if (c8 == 12288 || c8 == 160 || c8 == 8199 || c8 == 8239) {
                    charArray[i8] = ' ';
                } else if (c8 > 65280 && c8 < 65375) {
                    charArray[i8] = (char) (c8 - 65248);
                }
            }
        }
        return new String(charArray);
    }

    public static Date toDate(Object obj) {
        return toDate(obj, null);
    }

    public static Double toDouble(Object obj) {
        return toDouble(obj, null);
    }

    public static <E extends Enum<E>> E toEnum(Class<E> cls, Object obj) {
        return (E) toEnum(cls, obj, null);
    }

    public static Float toFloat(Object obj) {
        return toFloat(obj, null);
    }

    public static String toHex(byte[] bArr) {
        return cn.hutool.core.util.z.encodeHexStr(bArr);
    }

    public static Integer toInt(Object obj) {
        return toInt(obj, null);
    }

    public static <T> List<T> toList(Class<T> cls, Object obj) {
        return (List) toCollection(ArrayList.class, cls, obj);
    }

    public static LocalDateTime toLocalDateTime(Object obj) {
        return toLocalDateTime(obj, null);
    }

    public static Long toLong(Object obj) {
        return toLong(obj, null);
    }

    public static Number toNumber(Object obj) {
        return toNumber(obj, null);
    }

    public static String toSBC(String str, Set<Character> set) {
        if (cn.hutool.core.text.l.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i8 = 0; i8 < charArray.length; i8++) {
            if (set == null || !set.contains(Character.valueOf(charArray[i8]))) {
                char c8 = charArray[i8];
                if (c8 == ' ') {
                    charArray[i8] = 12288;
                } else if (c8 < 127) {
                    charArray[i8] = (char) (c8 + 65248);
                }
            }
        }
        return new String(charArray);
    }

    public static Short toShort(Object obj) {
        return toShort(obj, null);
    }

    public static String toStr(Object obj) {
        return toStr(obj, null);
    }

    public static <T> T convert(Type type, Object obj) {
        return (T) convert(type, obj, (Object) null);
    }

    public static <T> T convert(Class<T> cls, Object obj, T t7) {
        return (T) convert((Type) cls, obj, (Object) t7);
    }

    public static <K, V> Map<K, V> toMap(Class<? extends Map> cls, Class<K> cls2, Class<V> cls3, Object obj) {
        return (Map) new MapConverter(cls, cls2, cls3).convert(obj, null);
    }

    public static <T> T convert(Type type, Object obj, T t7) {
        return (T) convertWithCheck(type, obj, t7, false);
    }
}
