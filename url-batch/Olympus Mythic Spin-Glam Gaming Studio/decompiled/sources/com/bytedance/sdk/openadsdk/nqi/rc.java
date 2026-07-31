package com.bytedance.sdk.openadsdk.nqi;

/* loaded from: classes3.dex */
final class rc {
    static int zmn(zn znVar) {
        return zmn(znVar, true) + zmn(znVar, false);
    }

    static int fs(zn znVar) {
        byte[][] zn = znVar.zn();
        int fs = znVar.fs();
        int zmn = znVar.zmn();
        int i = 0;
        for (int i2 = 0; i2 < zmn - 1; i2++) {
            byte[] bArr = zn[i2];
            int i3 = 0;
            while (i3 < fs - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = zn[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    static int zn(zn znVar) {
        byte[][] zn = znVar.zn();
        int fs = znVar.fs();
        int zmn = znVar.zmn();
        int i = 0;
        for (int i2 = 0; i2 < zmn; i2++) {
            for (int i3 = 0; i3 < fs; i3++) {
                byte[] bArr = zn[i2];
                int i4 = i3 + 6;
                if (i4 < fs && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (zmn(bArr, i3 - 4, i3) || zmn(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < zmn && zn[i2][i3] == 1 && zn[i2 + 1][i3] == 0 && zn[i2 + 2][i3] == 1 && zn[i2 + 3][i3] == 1 && zn[i2 + 4][i3] == 1 && zn[i2 + 5][i3] == 0 && zn[i5][i3] == 1 && (zmn(zn, i3, i2 - 4, i2) || zmn(zn, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    private static boolean zmn(byte[] bArr, int i, int i2) {
        if (i < 0 || bArr.length < i2) {
            return false;
        }
        while (i < i2) {
            if (bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean zmn(byte[][] bArr, int i, int i2, int i3) {
        if (i2 < 0 || bArr.length < i3) {
            return false;
        }
        while (i2 < i3) {
            if (bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    static int fb(zn znVar) {
        byte[][] zn = znVar.zn();
        int fs = znVar.fs();
        int zmn = znVar.zmn();
        int i = 0;
        for (int i2 = 0; i2 < zmn; i2++) {
            byte[] bArr = zn[i2];
            for (int i3 = 0; i3 < fs; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int zmn2 = znVar.zmn() * znVar.fs();
        return ((Math.abs((i * 2) - zmn2) * 10) / zmn2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean zmn(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                return i4 != 0;
            case 1:
                i4 = i3 & 1;
                if (i4 != 0) {
                }
                break;
            case 2:
                i4 = i2 % 3;
                if (i4 != 0) {
                }
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                if (i4 != 0) {
                }
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                if (i4 != 0) {
                }
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                if (i4 != 0) {
                }
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                if (i4 != 0) {
                }
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                if (i4 != 0) {
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
    }

    private static int zmn(zn znVar, boolean z) {
        int zmn = z ? znVar.zmn() : znVar.fs();
        int fs = z ? znVar.fs() : znVar.zmn();
        byte[][] zn = znVar.zn();
        int i = 0;
        for (int i2 = 0; i2 < zmn; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < fs; i4++) {
                byte b2 = z ? zn[i2][i4] : zn[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    i3 = 1;
                    b = b2;
                }
            }
            if (i3 >= 5) {
                i += i3 - 2;
            }
        }
        return i;
    }
}
