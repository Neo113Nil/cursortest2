package com.baidu.bbalbscesium.o;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4178d = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567=";

    /* renamed from: e, reason: collision with root package name */
    public static final String f4179e = "0123456789ABCDEFGHIJKLMNOPQRSTUV=";

    /* renamed from: a, reason: collision with root package name */
    private String f4180a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4181b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4182c;

    public a(String str, boolean z7, boolean z8) {
        this.f4180a = str;
        this.f4181b = z7;
        this.f4182c = z8;
    }

    private static int a(int i8) {
        if (i8 == 1) {
            return 6;
        }
        if (i8 == 2) {
            return 4;
        }
        if (i8 == 3) {
            return 3;
        }
        if (i8 != 4) {
            return i8 != 5 ? -1 : 0;
        }
        return 1;
    }

    private static int b(int i8) {
        if (i8 == 0) {
            return 5;
        }
        if (i8 == 1) {
            return 4;
        }
        if (i8 == 3) {
            return 3;
        }
        if (i8 != 4) {
            return i8 != 6 ? -1 : 1;
        }
        return 2;
    }

    public String a(byte[] bArr) {
        int i8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i9 = 0; i9 < (bArr.length + 4) / 5; i9++) {
            short[] sArr = new short[5];
            int[] iArr = new int[8];
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = (i9 * 5) + i11;
                if (i12 < bArr.length) {
                    sArr[i11] = (short) (bArr[i12] & 255);
                } else {
                    sArr[i11] = 0;
                    i10--;
                }
            }
            int a8 = a(i10);
            short s7 = sArr[0];
            iArr[0] = (byte) ((s7 >> 3) & 31);
            short s8 = sArr[1];
            iArr[1] = (byte) (((s7 & 7) << 2) | ((s8 >> 6) & 3));
            iArr[2] = (byte) ((s8 >> 1) & 31);
            short s9 = sArr[2];
            iArr[3] = (byte) (((s8 & 1) << 4) | ((s9 >> 4) & 15));
            int i13 = (s9 & 15) << 1;
            short s10 = sArr[3];
            iArr[4] = (byte) (i13 | (1 & (s10 >> 7)));
            iArr[5] = (byte) ((s10 >> 2) & 31);
            short s11 = sArr[4];
            iArr[6] = (byte) (((s11 >> 5) & 7) | ((s10 & 3) << 3));
            iArr[7] = (byte) (s11 & 31);
            int i14 = 0;
            while (true) {
                i8 = 8 - a8;
                if (i14 >= i8) {
                    break;
                }
                char charAt = this.f4180a.charAt(iArr[i14]);
                if (this.f4182c) {
                    charAt = Character.toLowerCase(charAt);
                }
                byteArrayOutputStream.write(charAt);
                i14++;
            }
            if (this.f4181b) {
                while (i8 < 8) {
                    byteArrayOutputStream.write(61);
                    i8++;
                }
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte b8 : str.getBytes()) {
            char c8 = (char) b8;
            if (!Character.isWhitespace(c8)) {
                byteArrayOutputStream.write((byte) Character.toUpperCase(c8));
            }
        }
        if (!this.f4181b) {
            while (byteArrayOutputStream.size() % 8 != 0) {
                byteArrayOutputStream.write(61);
            }
        } else if (byteArrayOutputStream.size() % 8 != 0) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (int i8 = 0; i8 < byteArray.length / 8; i8++) {
            short[] sArr = new short[8];
            int[] iArr = new int[5];
            int i9 = 8;
            for (int i10 = 0; i10 < 8; i10++) {
                byte b9 = byteArray[(i8 * 8) + i10];
                if (((char) b9) == '=') {
                    break;
                }
                short indexOf = (short) this.f4180a.indexOf(b9);
                sArr[i10] = indexOf;
                if (indexOf < 0) {
                    return null;
                }
                i9--;
            }
            int b10 = b(i9);
            if (b10 < 0) {
                return null;
            }
            int i11 = sArr[0] << 3;
            short s7 = sArr[1];
            iArr[0] = i11 | (s7 >> 2);
            int i12 = ((s7 & 3) << 6) | (sArr[2] << 1);
            short s8 = sArr[3];
            iArr[1] = i12 | (s8 >> 4);
            int i13 = (s8 & 15) << 4;
            short s9 = sArr[4];
            iArr[2] = i13 | ((s9 >> 1) & 15);
            int i14 = (s9 << 7) | (sArr[5] << 2);
            short s10 = sArr[6];
            iArr[3] = i14 | (s10 >> 3);
            iArr[4] = sArr[7] | ((s10 & 7) << 5);
            for (int i15 = 0; i15 < b10; i15++) {
                try {
                    dataOutputStream.writeByte((byte) (iArr[i15] & 255));
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
