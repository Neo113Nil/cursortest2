package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Hi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0542Hi {
    public static String[] A04 = {"BtHKr", "GAfuq", "1TcIbYyYGpE6Ekv4glvvfZz9bC", "q9fmd3d0ImW5Daxca", "ooOXUvpeMSptobOLnq6qd7gNdq", "VwsWXVZM3brBJlmy9", "pSziVAe", "zUHU2CyO73eexnRwL2LOOWJW4Jr0bcWv"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C0542Hi(byte[] bArr, int i, int i2) {
        A08(bArr, i, i2);
    }

    private int A00() {
        int i = 0;
        while (!A0A()) {
            i++;
        }
        int i2 = (1 << i) - 1;
        int leadingZeros = i > 0 ? A05(i) : 0;
        return i2 + leadingZeros;
    }

    private void A01() {
        boolean z;
        int i = this.A02;
        if (i >= 0) {
            int i2 = this.A01;
            if (A04[1].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "f06qvbC";
            strArr[0] = "HuIz9";
            if (i < i2 || (i == i2 && this.A00 == 0)) {
                z = true;
                HI.A04(z);
            }
        }
        z = false;
        HI.A04(z);
    }

    private boolean A02(int i) {
        if (2 <= i && i < this.A01) {
            byte[] bArr = this.A03;
            byte b = bArr[i];
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                String[] strArr2 = A04;
                strArr2[5] = "Jod3dkhqFQ8qWj2s5";
                strArr2[3] = "0zxF2BZpdiUX5xaGz";
                if (b == 3 && bArr[i - 2] == 0) {
                    byte b2 = bArr[i - 1];
                    String[] strArr3 = A04;
                    if (strArr3[6].length() != strArr3[0].length()) {
                        String[] strArr4 = A04;
                        strArr4[6] = "lQKXp2Z";
                        strArr4[0] = "Kosug";
                        if (b2 == 0) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int A03() {
        int A00 = A00();
        int codeNum = A00 % 2;
        int i = codeNum == 0 ? -1 : 1;
        int codeNum2 = A00 + 1;
        return i * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i) {
        int i2;
        int i3 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i;
        while (true) {
            i2 = this.A00;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.A00 = i4;
            byte[] bArr = this.A03;
            int i5 = this.A02;
            int returnValue2 = bArr[i5];
            i3 |= (returnValue2 & 255) << i4;
            int returnValue3 = i5 + 1;
            if (!A02(returnValue3)) {
                r7 = 1;
            }
            this.A02 = i5 + r7;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int returnValue4 = bArr2[i6];
        int i7 = returnValue4 & 255;
        String[] strArr = A04;
        String str = strArr[5];
        String str2 = strArr[3];
        int length = str.length();
        int returnValue5 = str2.length();
        if (length != returnValue5) {
            throw new RuntimeException();
        }
        A04[7] = "CI85ryy9UuGcWp4q0bXmx78DrLL4QG6i";
        int returnValue6 = 8 - i2;
        int i8 = i3 | (i7 >> returnValue6);
        int returnValue7 = (-1) >>> (32 - i);
        int i9 = i8 & returnValue7;
        if (i2 == 8) {
            this.A00 = 0;
            int returnValue8 = i6 + 1;
            this.A02 = i6 + (A02(returnValue8) ? 2 : 1);
        }
        A01();
        return i9;
    }

    public final void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            int i2 = this.A02;
            this.A02 = i2 + (A02(i2 + 1) ? 2 : 1);
        }
        A01();
    }

    public final void A07(int i) {
        int i2 = this.A02;
        int oldByteOffset = i / 8;
        int numBytes = this.A02 + oldByteOffset;
        this.A02 = numBytes;
        int i3 = this.A00 + (i - (oldByteOffset * 8));
        this.A00 = i3;
        if (i3 > 7) {
            int i4 = numBytes + 1;
            String[] strArr = A04;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "WKnUhbHg5PXpVOXLjQbslPOixC";
            strArr2[4] = "5elOCNAU3UTje1WUqtoqjArHkZ";
            this.A02 = i4;
            this.A00 = i3 - 8;
        }
        int numBytes2 = i2 + 1;
        while (numBytes2 <= this.A02) {
            if (A02(numBytes2)) {
                this.A02++;
                numBytes2 += 2;
            }
            numBytes2++;
        }
        A01();
    }

    public final void A08(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = 0;
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A09() {
        int i = this.A02;
        int i2 = this.A00;
        int i3 = 0;
        while (initialBitOffset < initialByteOffset && !A0A()) {
            i3++;
        }
        int i4 = this.A02;
        int initialByteOffset = this.A01;
        int initialByteOffset2 = i4 == initialByteOffset ? 1 : 0;
        this.A02 = i;
        this.A00 = i2;
        if (initialByteOffset2 != 0) {
            return false;
        }
        int initialByteOffset3 = i3 * 2;
        return A0B(initialByteOffset3 + 1);
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    public final boolean A0B(int i) {
        int numBytes = this.A02;
        int oldByteOffset = i / 8;
        int i2 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i2++;
            newBitOffset -= 8;
        }
        int newByteOffset = numBytes + 1;
        while (newByteOffset <= i2 && i2 < this.A01) {
            if (A02(newByteOffset)) {
                i2++;
                newByteOffset += 2;
            }
            newByteOffset++;
        }
        int oldByteOffset2 = this.A01;
        if (i2 >= oldByteOffset2) {
            return i2 == oldByteOffset2 && newBitOffset == 0;
        }
        return true;
    }
}
