package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes5.dex */
public final class b {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private b() {
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int deepHashCode(byte[] bArr) {
        int i8 = 1;
        for (byte b8 : bArr) {
            i8 = (i8 * 31) + b8;
        }
        return i8;
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        boolean z7 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z7 &= bArr[length] == bArr2[length];
        }
        return z7;
    }

    public static byte[] fromHexString(String str) {
        char[] charArray = str.toUpperCase().toCharArray();
        int i8 = 0;
        for (char c8 : charArray) {
            if ((c8 >= '0' && c8 <= '9') || (c8 >= 'A' && c8 <= 'F')) {
                i8++;
            }
        }
        byte[] bArr = new byte[(i8 + 1) >> 1];
        int i9 = i8 & 1;
        for (char c9 : charArray) {
            if (c9 < '0' || c9 > '9') {
                if (c9 >= 'A' && c9 <= 'F') {
                    int i10 = i9 >> 1;
                    byte b8 = (byte) (bArr[i10] << 4);
                    bArr[i10] = b8;
                    bArr[i10] = (byte) ((c9 - '7') | b8);
                }
            } else {
                int i11 = i9 >> 1;
                byte b9 = (byte) (bArr[i11] << 4);
                bArr[i11] = b9;
                bArr[i11] = (byte) ((c9 - '0') | b9);
            }
            i9++;
        }
        return bArr;
    }

    public static byte[][] split(byte[] bArr, int i8) {
        if (i8 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        byte[] bArr2 = new byte[i8];
        byte[][] bArr3 = {bArr2, new byte[bArr.length - i8]};
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        System.arraycopy(bArr, i8, bArr3[1], 0, bArr.length - i8);
        return bArr3;
    }

    public static byte[] subArray(byte[] bArr, int i8) {
        return subArray(bArr, i8, bArr.length);
    }

    public static String toBinaryString(byte[] bArr) {
        String str = "";
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b8 = bArr[i8];
            for (int i9 = 0; i9 < 8; i9++) {
                str = str + ((b8 >>> i9) & 1);
            }
            if (i8 != bArr.length - 1) {
                str = str + cn.hutool.core.text.l.SPACE;
            }
        }
        return str;
    }

    public static char[] toCharArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            cArr[i8] = (char) bArr[i8];
        }
        return cArr;
    }

    public static String toHexString(byte[] bArr) {
        String str = "";
        for (int i8 = 0; i8 < bArr.length; i8++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            char[] cArr = HEX_CHARS;
            sb.append(cArr[(bArr[i8] >>> 4) & 15]);
            str = sb.toString() + cArr[bArr[i8] & 15];
        }
        return str;
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr3[length] = (byte) (bArr[length] ^ bArr2[length]);
        }
        return bArr3;
    }

    public static byte[] concatenate(byte[][] bArr) {
        int length = bArr[0].length;
        byte[] bArr2 = new byte[bArr.length * length];
        int i8 = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i8, length);
            i8 += length;
        }
        return bArr2;
    }

    public static int deepHashCode(byte[][] bArr) {
        int i8 = 1;
        for (byte[] bArr2 : bArr) {
            i8 = (i8 * 31) + deepHashCode(bArr2);
        }
        return i8;
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z7 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z7 &= equals(bArr[length], bArr2[length]);
        }
        return z7;
    }

    public static byte[] subArray(byte[] bArr, int i8, int i9) {
        int i10 = i9 - i8;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i8, bArr2, 0, i10);
        return bArr2;
    }

    public static String toHexString(byte[] bArr, String str, String str2) {
        String str3 = new String(str);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            char[] cArr = HEX_CHARS;
            sb.append(cArr[(bArr[i8] >>> 4) & 15]);
            str3 = sb.toString() + cArr[bArr[i8] & 15];
            if (i8 < bArr.length - 1) {
                str3 = str3 + str2;
            }
        }
        return str3;
    }

    public static int deepHashCode(byte[][][] bArr) {
        int i8 = 1;
        for (byte[][] bArr2 : bArr) {
            i8 = (i8 * 31) + deepHashCode(bArr2);
        }
        return i8;
    }

    public static boolean equals(byte[][][] bArr, byte[][][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z7 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte[][] bArr3 = bArr[length];
            if (bArr3.length != bArr2[length].length) {
                return false;
            }
            for (int length2 = bArr3.length - 1; length2 >= 0; length2--) {
                z7 &= equals(bArr[length][length2], bArr2[length][length2]);
            }
        }
        return z7;
    }
}
