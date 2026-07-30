package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = Byte.MIN_VALUE;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    @VisibleForTesting
    static class LexicographicalComparatorHolder {
        static final String UNSAFE_COMPARATOR_NAME = LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");
        static final Comparator<byte[]> BEST_COMPARATOR = getBestComparator();

        enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i8 = 0; i8 < min; i8++) {
                    int compare = UnsignedBytes.compare(bArr[i8], bArr2[i8]);
                    if (compare != 0) {
                        return compare;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        @VisibleForTesting
        enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int arrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || arrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e8) {
                        throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
                        @Override // java.security.PrivilegedExceptionAction
                        public Unsafe run() {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i8 = min & (-8);
                int i9 = 0;
                while (i9 < i8) {
                    Unsafe unsafe = theUnsafe;
                    int i10 = BYTE_ARRAY_BASE_OFFSET;
                    long j8 = i9;
                    long j9 = unsafe.getLong(bArr, i10 + j8);
                    long j10 = unsafe.getLong(bArr2, i10 + j8);
                    if (j9 != j10) {
                        if (BIG_ENDIAN) {
                            return UnsignedLongs.compare(j9, j10);
                        }
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j9 ^ j10) & (-8);
                        return ((int) ((j9 >>> numberOfTrailingZeros) & 255)) - ((int) ((j10 >>> numberOfTrailingZeros) & 255));
                    }
                    i9 += 8;
                }
                while (i9 < min) {
                    int compare = UnsignedBytes.compare(bArr[i9], bArr2[i9]);
                    if (compare != 0) {
                        return compare;
                    }
                    i9++;
                }
                return bArr.length - bArr2.length;
            }
        }

        LexicographicalComparatorHolder() {
        }

        static Comparator<byte[]> getBestComparator() {
            try {
                Object[] enumConstants = Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }
    }

    private UnsignedBytes() {
    }

    @CanIgnoreReturnValue
    public static byte checkedCast(long j8) {
        Preconditions.checkArgument((j8 >> 8) == 0, "out of range: %s", j8);
        return (byte) j8;
    }

    public static int compare(byte b8, byte b9) {
        return toInt(b8) - toInt(b9);
    }

    private static byte flip(byte b8) {
        return (byte) (b8 ^ MAX_POWER_OF_TWO);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * (str.length() + 3));
        sb.append(toInt(bArr[0]));
        for (int i8 = 1; i8 < bArr.length; i8++) {
            sb.append(str);
            sb.append(toString(bArr[i8]));
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    @VisibleForTesting
    static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i8 = toInt(bArr[0]);
        for (int i9 = 1; i9 < bArr.length; i9++) {
            int i10 = toInt(bArr[i9]);
            if (i10 > i8) {
                i8 = i10;
            }
        }
        return (byte) i8;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i8 = toInt(bArr[0]);
        for (int i9 = 1; i9 < bArr.length; i9++) {
            int i10 = toInt(bArr[i9]);
            if (i10 < i8) {
                i8 = i10;
            }
        }
        return (byte) i8;
    }

    @CanIgnoreReturnValue
    @Beta
    public static byte parseUnsignedByte(String str) {
        return parseUnsignedByte(str, 10);
    }

    public static byte saturatedCast(long j8) {
        if (j8 > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (j8 < 0) {
            return (byte) 0;
        }
        return (byte) j8;
    }

    public static void sort(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static int toInt(byte b8) {
        return b8 & 255;
    }

    @Beta
    public static String toString(byte b8) {
        return toString(b8, 10);
    }

    @CanIgnoreReturnValue
    @Beta
    public static byte parseUnsignedByte(String str, int i8) {
        int parseInt = Integer.parseInt((String) Preconditions.checkNotNull(str), i8);
        if ((parseInt >> 8) == 0) {
            return (byte) parseInt;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("out of range: ");
        sb.append(parseInt);
        throw new NumberFormatException(sb.toString());
    }

    @Beta
    public static String toString(byte b8, int i8) {
        Preconditions.checkArgument(i8 >= 2 && i8 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i8);
        return Integer.toString(toInt(b8), i8);
    }

    public static void sort(byte[] bArr, int i8, int i9) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i8, i9, bArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            bArr[i10] = flip(bArr[i10]);
        }
        Arrays.sort(bArr, i8, i9);
        while (i8 < i9) {
            bArr[i8] = flip(bArr[i8]);
            i8++;
        }
    }

    public static void sortDescending(byte[] bArr, int i8, int i9) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i8, i9, bArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ Byte.MAX_VALUE);
        }
        Arrays.sort(bArr, i8, i9);
        while (i8 < i9) {
            bArr[i8] = (byte) (bArr[i8] ^ Byte.MAX_VALUE);
            i8++;
        }
    }
}
