package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 < length) {
                char charAt = charSequence.charAt(i8);
                if (charAt >= 2048) {
                    i9 += encodedLengthGeneral(charSequence, i8);
                    break;
                }
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                break;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        long j8 = i9 + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j8);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
            } else {
                i9 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i8) == charAt) {
                        throw new IllegalArgumentException(unpairedSurrogateMsg(i8));
                    }
                    i8++;
                }
            }
            i8++;
        }
        return i9;
    }

    public static boolean isWellFormed(byte[] bArr) {
        return isWellFormed(bArr, 0, bArr.length);
    }

    private static boolean isWellFormedSlowPath(byte[] bArr, int i8, int i9) {
        byte b8;
        while (i8 < i9) {
            int i10 = i8 + 1;
            byte b9 = bArr[i8];
            if (b9 < 0) {
                if (b9 < -32) {
                    if (i10 != i9 && b9 >= -62) {
                        i8 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return false;
                }
                if (b9 < -16) {
                    int i11 = i8 + 2;
                    if (i11 < i9 && (b8 = bArr[i10]) <= -65 && ((b9 != -32 || b8 >= -96) && (b9 != -19 || -96 > b8))) {
                        i8 += 3;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (i8 + 3 >= i9) {
                    return false;
                }
                int i12 = i8 + 2;
                byte b10 = bArr[i10];
                if (b10 <= -65 && (((b9 << 28) + (b10 + 112)) >> 30) == 0) {
                    int i13 = i8 + 3;
                    if (bArr[i12] <= -65) {
                        i8 += 4;
                        if (bArr[i13] > -65) {
                        }
                    }
                }
                return false;
            }
            i8 = i10;
        }
        return true;
    }

    private static String unpairedSurrogateMsg(int i8) {
        StringBuilder sb = new StringBuilder(39);
        sb.append("Unpaired surrogate at index ");
        sb.append(i8);
        return sb.toString();
    }

    public static boolean isWellFormed(byte[] bArr, int i8, int i9) {
        int i10 = i9 + i8;
        Preconditions.checkPositionIndexes(i8, i10, bArr.length);
        while (i8 < i10) {
            if (bArr[i8] < 0) {
                return isWellFormedSlowPath(bArr, i8, i10);
            }
            i8++;
        }
        return true;
    }
}
