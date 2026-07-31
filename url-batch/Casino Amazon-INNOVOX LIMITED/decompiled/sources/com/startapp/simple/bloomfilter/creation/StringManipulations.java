package com.startapp.simple.bloomfilter.creation;

/* loaded from: classes3.dex */
class StringManipulations {
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    StringManipulations() {
    }

    byte[] hexToByte(String str) {
        if (encodedLenghtIsNotEven(str)) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private boolean encodedLenghtIsNotEven(String str) {
        return str.length() % 2 != 0;
    }

    String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            char[] cArr2 = HEX_CHARS;
            byte b = bArr[i];
            cArr[i2] = cArr2[(b & 240) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
