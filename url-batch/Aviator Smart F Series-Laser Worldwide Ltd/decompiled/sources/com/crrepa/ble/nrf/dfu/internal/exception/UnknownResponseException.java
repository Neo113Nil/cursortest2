package com.crrepa.ble.nrf.dfu.internal.exception;

/* loaded from: classes3.dex */
public class UnknownResponseException extends Exception {
    private static final char[] HEX_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final long serialVersionUID = -8716125467309979289L;
    private final int mExpectedOpCode;
    private final int mExpectedReturnCode;
    private final byte[] mResponse;

    public UnknownResponseException(String str, byte[] bArr, int i8, int i9) {
        super(str);
        this.mResponse = bArr == null ? new byte[0] : bArr;
        this.mExpectedReturnCode = i8;
        this.mExpectedOpCode = i9;
    }

    public static String bytesToHex(byte[] bArr, int i8, int i9) {
        if (bArr == null || bArr.length <= i8 || i9 <= 0) {
            return "";
        }
        int min = Math.min(i9, bArr.length - i8);
        char[] cArr = new char[min * 2];
        for (int i10 = 0; i10 < min; i10++) {
            byte b8 = bArr[i8 + i10];
            int i11 = i10 * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i11] = cArr2[(b8 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b8 & 15];
        }
        return "0x" + new String(cArr);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        byte[] bArr = this.mResponse;
        return String.format("%s (response: %s, expected: 0x%02X%02X..)", super.getMessage(), bytesToHex(bArr, 0, bArr.length), Integer.valueOf(this.mExpectedReturnCode), Integer.valueOf(this.mExpectedOpCode));
    }
}
