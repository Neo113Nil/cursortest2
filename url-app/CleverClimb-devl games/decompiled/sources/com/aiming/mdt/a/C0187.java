package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0187 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f654 = 0;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static long f655 = -5915439458480054541L;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f656 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m710(char[] cArr, int i, int i2) {
        int i3;
        char[] cArr2 = new char[i2];
        int i4 = 0;
        while (i < i2) {
            int i5 = i + 1;
            char c2 = cArr[i];
            if (c2 == '\\') {
                i = i5 + 1;
                char c3 = cArr[i5];
                if (c3 == 'u') {
                    int i6 = i;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < 4) {
                        int i9 = i6 + 1;
                        char c4 = cArr[i6];
                        switch (c4) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i8 = ((i8 << 4) + c4) - 48;
                                break;
                            default:
                                switch (c4) {
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                        i8 = (((i8 << 4) + 10) + c4) - 65;
                                        break;
                                    default:
                                        switch (c4) {
                                            case 'a':
                                            case 'b':
                                            case 'c':
                                            case 'd':
                                            case 'e':
                                            case 'f':
                                                i8 = (((i8 << 4) + 10) + c4) - 97;
                                                break;
                                            default:
                                                throw new IllegalArgumentException(m711("䰁튿ڐ窜꺑\ue299嚇誙ﺞ㊞曙\udaa4ຊ䊆뚅\uea84庛鋂욄㪎溄ꊉᚁ䪍뺅\uf28d⛇").intern());
                                        }
                                }
                        }
                        i7++;
                        i6 = i9;
                    }
                    int i10 = i4 + 1;
                    cArr2[i4] = (char) i8;
                    int i11 = f654 + 105;
                    f656 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = i10;
                    i = i6;
                } else {
                    if (c3 == 't') {
                        int i13 = f656 + 111;
                        f654 = i13 % 128;
                        int i14 = i13 % 2;
                        int i15 = f654 + 47;
                        f656 = i15 % 128;
                        int i16 = i15 % 2;
                        c3 = '\t';
                    } else {
                        if ((c3 != 'r' ? (char) 6 : '\t') != 6) {
                            int i17 = f654 + 21;
                            f656 = i17 % 128;
                            c3 = i17 % 2 != 0 ? '\r' : 'A';
                        } else if (c3 == 'n') {
                            c3 = '\n';
                        } else {
                            if ((c3 == 'f' ? '\b' : 'R') == '\b') {
                                int i18 = f656 + 73;
                                f654 = i18 % 128;
                                int i19 = i18 % 2;
                                c3 = '\f';
                            }
                        }
                    }
                    i3 = i4 + 1;
                    cArr2[i4] = c3;
                }
            } else {
                i3 = i4 + 1;
                cArr2[i4] = c2;
                i = i5;
            }
            i4 = i3;
        }
        return new String(cArr2, 0, i4);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m711(String str) {
        int i = f654 + 31;
        f656 = i % 128;
        if (i % 2 == 0) {
        }
        char[] charArray = str.toCharArray();
        char c2 = charArray[0];
        char[] cArr = new char[charArray.length - 1];
        int i2 = f654 + 31;
        f656 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 1;
        while (true) {
            if (i4 >= charArray.length) {
                return new String(cArr);
            }
            cArr[i4 - 1] = (char) ((charArray[i4] ^ (i4 * c2)) ^ f655);
            i4++;
        }
    }
}
