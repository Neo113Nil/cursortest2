package cn.hutool.core.net;

import cn.hutool.core.lang.n0;
import cn.hutool.core.lang.q;
import cn.hutool.core.util.c1;
import cn.hutool.core.util.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.regex.Matcher;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class e {
    public static final int IP_MASK_MAX = 32;
    public static final String IP_MASK_SPLIT_MARK = "/";
    public static final String IP_SPLIT_MARK = "-";
    public static final String LOCAL_IP = "127.0.0.1";

    public static int countByIpRange(String str, String str2) {
        Stream stream;
        IntStream mapToInt;
        int[] array;
        Stream stream2;
        IntStream mapToInt2;
        int[] array2;
        if (ipv4ToLong(str) > ipv4ToLong(str2)) {
            throw new IllegalArgumentException("to IP must be greater than from IP!");
        }
        stream = cn.hutool.core.text.l.split((CharSequence) str, '.').stream();
        mapToInt = stream.mapToInt(new ToIntFunction() { // from class: cn.hutool.core.net.d
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return Integer.parseInt((String) obj);
            }
        });
        array = mapToInt.toArray();
        stream2 = cn.hutool.core.text.l.split((CharSequence) str2, '.').stream();
        mapToInt2 = stream2.mapToInt(new ToIntFunction() { // from class: cn.hutool.core.net.d
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return Integer.parseInt((String) obj);
            }
        });
        array2 = mapToInt2.toArray();
        int i8 = 1;
        for (int length = array.length - 1; length >= 0; length--) {
            i8 = (int) (i8 + ((array2[length] - array[length]) * Math.pow(256.0d, (array.length - length) - 1)));
        }
        return i8;
    }

    public static int countByMaskBit(int i8, boolean z7) {
        if (!z7 && (i8 <= 0 || i8 >= 32)) {
            return 0;
        }
        int pow = (int) Math.pow(2.0d, 32 - i8);
        return z7 ? pow : pow - 2;
    }

    public static String formatIpBlock(String str, String str2) {
        return str + "/" + getMaskBitByMask(str2);
    }

    public static Long getBeginIpLong(String str, int i8) {
        return Long.valueOf(ipv4ToLong(getMaskByMaskBit(i8)) & ipv4ToLong(str));
    }

    public static String getBeginIpStr(String str, int i8) {
        return longToIpv4(getBeginIpLong(str, i8).longValue());
    }

    public static Long getEndIpLong(String str, int i8) {
        return Long.valueOf(getBeginIpLong(str, i8).longValue() + ((~ipv4ToLong(getMaskByMaskBit(i8))) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    public static String getEndIpStr(String str, int i8) {
        return longToIpv4(getEndIpLong(str, i8).longValue());
    }

    public static int getMaskBitByMask(String str) {
        Integer maskBit = f.getMaskBit(str);
        if (maskBit != null) {
            return maskBit.intValue();
        }
        throw new IllegalArgumentException("Invalid netmask " + str);
    }

    public static String getMaskByIpRange(String str, String str2) {
        q.isTrue(ipv4ToLong(str) < ipv4ToLong(str2), "to IP must be greater than from IP!", new Object[0]);
        String[] splitToArray = cn.hutool.core.text.l.splitToArray((CharSequence) str, '.');
        String[] splitToArray2 = cn.hutool.core.text.l.splitToArray((CharSequence) str2, '.');
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < splitToArray2.length; i8++) {
            sb.append((255 - Integer.parseInt(splitToArray2[i8])) + Integer.parseInt(splitToArray[i8]));
            sb.append('.');
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String getMaskByMaskBit(int i8) {
        return f.get(i8);
    }

    public static long ipv4ToLong(String str) {
        Matcher matcher = n0.IPV4.matcher(str);
        if (matcher.matches()) {
            return matchAddress(matcher);
        }
        throw new IllegalArgumentException("Invalid IPv4 address!");
    }

    private static boolean isInner(long j8, long j9, long j10) {
        return j8 >= j9 && j8 <= j10;
    }

    public static boolean isInnerIP(String str) {
        long ipv4ToLong = ipv4ToLong(str);
        return isInner(ipv4ToLong, ipv4ToLong("10.0.0.0"), ipv4ToLong("10.255.255.255")) || isInner(ipv4ToLong, ipv4ToLong("172.16.0.0"), ipv4ToLong("172.31.255.255")) || isInner(ipv4ToLong, ipv4ToLong("192.168.0.0"), ipv4ToLong("192.168.255.255")) || "127.0.0.1".equals(str);
    }

    public static boolean isMaskBitValid(int i8) {
        return f.get(i8) != null;
    }

    public static boolean isMaskValid(String str) {
        return f.getMaskBit(str) != null;
    }

    public static List<String> list(String str, boolean z7) {
        if (str.contains("-")) {
            String[] splitToArray = cn.hutool.core.text.l.splitToArray(str, "-");
            return list(splitToArray[0], splitToArray[1]);
        }
        if (!str.contains("/")) {
            return cn.hutool.core.collection.n0.toList(str);
        }
        String[] splitToArray2 = cn.hutool.core.text.l.splitToArray(str, "/");
        return list(splitToArray2[0], Integer.parseInt(splitToArray2[1]), z7);
    }

    public static String longToIpv4(long j8) {
        StringBuilder builder = c1.builder();
        builder.append((j8 >> 24) & 255);
        builder.append('.');
        builder.append((j8 >> 16) & 255);
        builder.append('.');
        builder.append((j8 >> 8) & 255);
        builder.append('.');
        builder.append(j8 & 255);
        return builder.toString();
    }

    private static long matchAddress(Matcher matcher) {
        long j8 = 0;
        for (int i8 = 1; i8 <= 4; i8++) {
            j8 |= Long.parseLong(matcher.group(i8)) << ((4 - i8) * 8);
        }
        return j8;
    }

    public static boolean matches(String str, String str2) {
        if (!p0.isMatch(n0.IPV4, str2)) {
            return false;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length != split2.length) {
            return false;
        }
        for (int i8 = 0; i8 < split.length; i8++) {
            if (!"*".equals(split[i8]) && !split[i8].equals(split2[i8])) {
                return false;
            }
        }
        return true;
    }

    public static long ipv4ToLong(String str, long j8) {
        return cn.hutool.core.lang.c1.isIpv4(str) ? ipv4ToLong(str) : j8;
    }

    public static List<String> list(String str, int i8, boolean z7) {
        if (i8 == 32) {
            ArrayList arrayList = new ArrayList();
            if (z7) {
                arrayList.add(str);
            }
            return arrayList;
        }
        String beginIpStr = getBeginIpStr(str, i8);
        String endIpStr = getEndIpStr(str, i8);
        if (z7) {
            return list(beginIpStr, endIpStr);
        }
        int lastIndexOf = beginIpStr.lastIndexOf(46) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(cn.hutool.core.text.l.subPre(beginIpStr, lastIndexOf));
        String subSuf = cn.hutool.core.text.l.subSuf(beginIpStr, lastIndexOf);
        Objects.requireNonNull(subSuf);
        sb.append(Integer.parseInt(subSuf) + 1);
        String sb2 = sb.toString();
        int lastIndexOf2 = endIpStr.lastIndexOf(46) + 1;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(cn.hutool.core.text.l.subPre(endIpStr, lastIndexOf2));
        Objects.requireNonNull(cn.hutool.core.text.l.subSuf(endIpStr, lastIndexOf2));
        sb3.append(Integer.parseInt(r3) - 1);
        return list(sb2, sb3.toString());
    }

    public static List<String> list(String str, String str2) {
        int countByIpRange = countByIpRange(str, str2);
        int[] iArr = (int[]) cn.hutool.core.convert.d.convert(int[].class, (Object) cn.hutool.core.text.l.splitToArray((CharSequence) str, '.'));
        int[] iArr2 = (int[]) cn.hutool.core.convert.d.convert(int[].class, (Object) cn.hutool.core.text.l.splitToArray((CharSequence) str2, '.'));
        ArrayList arrayList = new ArrayList(countByIpRange);
        int i8 = iArr2[0];
        int i9 = iArr[0];
        char c8 = 1;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        while (i9 <= i8) {
            boolean z10 = i9 == i8;
            int i10 = z10 ? iArr2[c8] : 255;
            int i11 = z7 ? iArr[c8] : 0;
            while (i11 <= i10) {
                boolean z11 = z10 && i11 == i10;
                int i12 = z11 ? iArr2[2] : 255;
                int i13 = z8 ? iArr[2] : 0;
                while (i13 <= i12) {
                    int i14 = (z11 && i13 == i12) ? iArr2[3] : 255;
                    for (int i15 = z9 ? iArr[3] : 0; i15 <= i14; i15++) {
                        arrayList.add(i9 + "." + i11 + "." + i13 + "." + i15);
                    }
                    i13++;
                    z9 = false;
                }
                i11++;
                z8 = false;
            }
            i9++;
            c8 = 1;
            z7 = false;
        }
        return arrayList;
    }
}
