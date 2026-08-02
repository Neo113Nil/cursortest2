package com.startapp.simple.bloomfilter.creation;

/* loaded from: classes.dex */
class StringManipulations {
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    private boolean encodedLenghtIsNotEven(String str) {
        return str.length() % 2 != 0;
    }

    public String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int i5 = i4 * 2;
            char[] cArr2 = HEX_CHARS;
            byte b4 = bArr[i4];
            cArr[i5] = cArr2[(b4 & 240) >>> 4];
            cArr[i5 + 1] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public byte[] hexToByte(String str) {
        if (encodedLenghtIsNotEven(str)) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        for (int i4 = 0; i4 < length; i4 += 2) {
            bArr[i4 / 2] = (byte) (Character.digit(str.charAt(i4 + 1), 16) + (Character.digit(str.charAt(i4), 16) << 4));
        }
        return bArr;
    }
}
