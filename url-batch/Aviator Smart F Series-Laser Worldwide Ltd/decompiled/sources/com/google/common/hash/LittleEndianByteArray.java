package com.google.common.hash;

import com.google.common.primitives.Longs;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final LittleEndianBytes byteArray;

    private enum JavaLittleEndianBytes implements LittleEndianBytes {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i8) {
                return Longs.fromBytes(bArr[i8 + 7], bArr[i8 + 6], bArr[i8 + 5], bArr[i8 + 4], bArr[i8 + 3], bArr[i8 + 2], bArr[i8 + 1], bArr[i8]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i8, long j8) {
                long j9 = 255;
                for (int i9 = 0; i9 < 8; i9++) {
                    bArr[i8 + i9] = (byte) ((j8 & j9) >> (i9 * 8));
                    j9 <<= 8;
                }
            }
        }
    }

    private interface LittleEndianBytes {
        long getLongLittleEndian(byte[] bArr, int i8);

        void putLongLittleEndian(byte[] bArr, int i8, long j8);
    }

    private enum UnsafeByteArray implements LittleEndianBytes {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i8) {
                return UnsafeByteArray.theUnsafe.getLong(bArr, i8 + UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i8, long j8) {
                UnsafeByteArray.theUnsafe.putLong(bArr, i8 + UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET, j8);
            }
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i8) {
                return Long.reverseBytes(UnsafeByteArray.theUnsafe.getLong(bArr, i8 + UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i8, long j8) {
                UnsafeByteArray.theUnsafe.putLong(bArr, i8 + UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET, Long.reverseBytes(j8));
            }
        };

        private static final int BYTE_ARRAY_BASE_OFFSET;
        private static final Unsafe theUnsafe;

        static {
            Unsafe unsafe = getUnsafe();
            theUnsafe = unsafe;
            BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
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
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.3
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
    }

    static {
        LittleEndianBytes littleEndianBytes = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                littleEndianBytes = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        byteArray = littleEndianBytes;
    }

    private LittleEndianByteArray() {
    }

    static int load32(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    static long load64(byte[] bArr, int i8) {
        return byteArray.getLongLittleEndian(bArr, i8);
    }

    static long load64Safely(byte[] bArr, int i8, int i9) {
        long j8 = 0;
        for (int i10 = 0; i10 < Math.min(i9, 8); i10++) {
            j8 |= (bArr[i8 + i10] & 255) << (i10 * 8);
        }
        return j8;
    }

    static void store64(byte[] bArr, int i8, long j8) {
        byteArray.putLongLittleEndian(bArr, i8, j8);
    }

    static boolean usingUnsafe() {
        return byteArray instanceof UnsafeByteArray;
    }
}
