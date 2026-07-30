package cn.hutool.core.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.DoubleAdder;

/* loaded from: classes.dex */
public class j {
    public static final ByteOrder CPU_ENDIAN;
    public static final ByteOrder DEFAULT_ORDER;

    static {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        DEFAULT_ORDER = byteOrder;
        if (!"little".equals(System.getProperty("sun.cpu.endian"))) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        CPU_ENDIAN = byteOrder;
    }

    public static int byteToUnsignedInt(byte b8) {
        return b8 & 255;
    }

    public static double bytesToDouble(byte[] bArr) {
        return bytesToDouble(bArr, DEFAULT_ORDER);
    }

    public static float bytesToFloat(byte[] bArr) {
        return bytesToFloat(bArr, DEFAULT_ORDER);
    }

    public static int bytesToInt(byte[] bArr) {
        return bytesToInt(bArr, DEFAULT_ORDER);
    }

    public static long bytesToLong(byte[] bArr) {
        return bytesToLong(bArr, DEFAULT_ORDER);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.atomic.LongAdder] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.concurrent.atomic.AtomicLong] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.concurrent.atomic.AtomicInteger] */
    public static <T extends Number> T bytesToNumber(byte[] bArr, Class<T> cls, ByteOrder byteOrder) {
        DoubleAdder doubleAdder;
        if (Byte.class == cls) {
            return Byte.valueOf(bArr[0]);
        }
        if (Short.class == cls) {
            return Short.valueOf(bytesToShort(bArr, byteOrder));
        }
        if (Integer.class == cls) {
            return Integer.valueOf(bytesToInt(bArr, byteOrder));
        }
        if (AtomicInteger.class == cls) {
            doubleAdder = new AtomicInteger(bytesToInt(bArr, byteOrder));
        } else {
            if (Long.class == cls) {
                return Long.valueOf(bytesToLong(bArr, byteOrder));
            }
            if (AtomicLong.class == cls) {
                doubleAdder = new AtomicLong(bytesToLong(bArr, byteOrder));
            } else if (cn.hutool.core.convert.g.a() == cls) {
                ?? a8 = cn.hutool.core.convert.impl.x.a();
                a8.add(bytesToLong(bArr, byteOrder));
                doubleAdder = a8;
            } else {
                if (Float.class == cls) {
                    return Float.valueOf(bytesToFloat(bArr, byteOrder));
                }
                if (Double.class == cls) {
                    return Double.valueOf(bytesToDouble(bArr, byteOrder));
                }
                if (cn.hutool.core.convert.k.a() != cls) {
                    if (BigDecimal.class == cls) {
                        return d0.toBigDecimal(Double.valueOf(bytesToDouble(bArr, byteOrder)));
                    }
                    if (BigInteger.class == cls) {
                        return BigInteger.valueOf(bytesToLong(bArr, byteOrder));
                    }
                    if (Number.class == cls) {
                        return Double.valueOf(bytesToDouble(bArr, byteOrder));
                    }
                    throw new IllegalArgumentException("Unsupported Number type: " + cls.getName());
                }
                DoubleAdder a9 = cn.hutool.core.convert.impl.y.a();
                a9.add(bytesToDouble(bArr, byteOrder));
                doubleAdder = a9;
            }
        }
        return doubleAdder;
    }

    public static short bytesToShort(byte[] bArr) {
        return bytesToShort(bArr, DEFAULT_ORDER);
    }

    public static byte[] doubleToBytes(double d8) {
        return doubleToBytes(d8, DEFAULT_ORDER);
    }

    public static byte[] floatToBytes(float f8) {
        return floatToBytes(f8, DEFAULT_ORDER);
    }

    public static byte intToByte(int i8) {
        return (byte) i8;
    }

    public static byte[] intToBytes(int i8) {
        return intToBytes(i8, DEFAULT_ORDER);
    }

    public static byte[] longToBytes(long j8) {
        return longToBytes(j8, DEFAULT_ORDER);
    }

    public static byte[] numberToBytes(Number number) {
        return numberToBytes(number, DEFAULT_ORDER);
    }

    public static byte[] shortToBytes(short s7) {
        return shortToBytes(s7, DEFAULT_ORDER);
    }

    public static double bytesToDouble(byte[] bArr, ByteOrder byteOrder) {
        return Double.longBitsToDouble(bytesToLong(bArr, byteOrder));
    }

    public static float bytesToFloat(byte[] bArr, ByteOrder byteOrder) {
        return Float.intBitsToFloat(bytesToInt(bArr, byteOrder));
    }

    public static int bytesToInt(byte[] bArr, ByteOrder byteOrder) {
        return bytesToInt(bArr, 0, byteOrder);
    }

    public static long bytesToLong(byte[] bArr, ByteOrder byteOrder) {
        return bytesToLong(bArr, 0, byteOrder);
    }

    public static short bytesToShort(byte[] bArr, ByteOrder byteOrder) {
        return bytesToShort(bArr, 0, byteOrder);
    }

    public static byte[] doubleToBytes(double d8, ByteOrder byteOrder) {
        return longToBytes(Double.doubleToLongBits(d8), byteOrder);
    }

    public static byte[] floatToBytes(float f8, ByteOrder byteOrder) {
        return intToBytes(Float.floatToIntBits(f8), byteOrder);
    }

    public static byte[] intToBytes(int i8, ByteOrder byteOrder) {
        return ByteOrder.LITTLE_ENDIAN == byteOrder ? new byte[]{(byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) ((i8 >> 16) & 255), (byte) ((i8 >> 24) & 255)} : new byte[]{(byte) ((i8 >> 24) & 255), (byte) ((i8 >> 16) & 255), (byte) ((i8 >> 8) & 255), (byte) (i8 & 255)};
    }

    public static byte[] longToBytes(long j8, ByteOrder byteOrder) {
        byte[] bArr = new byte[8];
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            for (int i8 = 0; i8 < 8; i8++) {
                bArr[i8] = (byte) (j8 & 255);
                j8 >>= 8;
            }
        } else {
            for (int i9 = 7; i9 >= 0; i9--) {
                bArr[i9] = (byte) (j8 & 255);
                j8 >>= 8;
            }
        }
        return bArr;
    }

    public static byte[] numberToBytes(Number number, ByteOrder byteOrder) {
        return number instanceof Byte ? new byte[]{number.byteValue()} : number instanceof Double ? doubleToBytes(((Double) number).doubleValue(), byteOrder) : number instanceof Long ? longToBytes(((Long) number).longValue(), byteOrder) : number instanceof Integer ? intToBytes(((Integer) number).intValue(), byteOrder) : number instanceof Short ? shortToBytes(((Short) number).shortValue(), byteOrder) : number instanceof Float ? floatToBytes(((Float) number).floatValue(), byteOrder) : doubleToBytes(number.doubleValue(), byteOrder);
    }

    public static byte[] shortToBytes(short s7, ByteOrder byteOrder) {
        byte[] bArr = new byte[2];
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            bArr[0] = (byte) (s7 & 255);
            bArr[1] = (byte) ((s7 >> 8) & 255);
        } else {
            bArr[1] = (byte) (s7 & 255);
            bArr[0] = (byte) ((s7 >> 8) & 255);
        }
        return bArr;
    }

    public static int bytesToInt(byte[] bArr, int i8, ByteOrder byteOrder) {
        int i9;
        byte b8;
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            i9 = (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
            b8 = bArr[i8 + 3];
        } else {
            i9 = (bArr[i8 + 3] & 255) | ((bArr[i8 + 2] & 255) << 8) | ((bArr[i8 + 1] & 255) << 16);
            b8 = bArr[i8];
        }
        return ((b8 & 255) << 24) | i9;
    }

    public static long bytesToLong(byte[] bArr, int i8, ByteOrder byteOrder) {
        long j8 = 0;
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            for (int i9 = 7; i9 >= 0; i9--) {
                j8 = (j8 << 8) | (bArr[i9 + i8] & 255);
            }
        } else {
            for (int i10 = 0; i10 < 8; i10++) {
                j8 = (j8 << 8) | (bArr[i10 + i8] & 255);
            }
        }
        return j8;
    }

    public static short bytesToShort(byte[] bArr, int i8, ByteOrder byteOrder) {
        int i9;
        byte b8;
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            i9 = bArr[i8] & 255;
            b8 = bArr[i8 + 1];
        } else {
            i9 = bArr[i8 + 1] & 255;
            b8 = bArr[i8];
        }
        return (short) (((b8 & 255) << 8) | i9);
    }
}
