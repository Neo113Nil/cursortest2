package com.startapp.simple.bloomfilter.creation;

/* loaded from: classes.dex */
class StringManipulations {
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    private boolean encodedLenghtIsNotEven(String str) {
        return str.length() % 2 != 0;
    }

    public String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i4 = i3 * 2;
            char[] cArr2 = HEX_CHARS;
            byte b3 = bArr[i3];
            cArr[i4] = cArr2[(b3 & 240) >>> 4];
            cArr[i4 + 1] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public byte[] hexToByte(String str) {
        if (encodedLenghtIsNotEven(str)) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        for (int i3 = 0; i3 < length; i3 += 2) {
            bArr[i3 / 2] = (byte) (Character.digit(str.charAt(i3 + 1), 16) + (Character.digit(str.charAt(i3), 16) << 4));
        }
        return bArr;
    }
}
