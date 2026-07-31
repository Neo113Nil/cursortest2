package H2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import okio.h;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f767a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(byte[] bArr, int i4) {
        byte b4;
        int i5;
        int i6 = 1;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        loop0: while (true) {
            if (i7 >= length) {
                break;
            }
            byte b5 = bArr[i7];
            if (b5 >= 0) {
                int i10 = i9 + 1;
                if (i9 == i4) {
                    break;
                }
                if ((b5 == 10 || b5 == 13 || ((b5 < 0 || b5 >= 32) && (Byte.MAX_VALUE > b5 || b5 >= 160))) && b5 != 65533) {
                    i8 += b5 < 65536 ? i6 : 2;
                    i7 += i6;
                    while (true) {
                        i9 = i10;
                        if (i7 < length && (b4 = bArr[i7]) >= 0) {
                            i7 += i6;
                            i10 = i9 + 1;
                            if (i9 == i4) {
                                return i8;
                            }
                            if ((b4 == 10 || b4 == 13 || ((b4 < 0 || b4 >= 32) && (Byte.MAX_VALUE > b4 || b4 >= 160))) && b4 != 65533) {
                                i8 += b4 < 65536 ? i6 : 2;
                            }
                        }
                    }
                }
            } else {
                int i11 = i6;
                if ((b5 >> 5) == -2) {
                    int i12 = i7 + 1;
                    if (length <= i12) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    byte b6 = bArr[i12];
                    if ((b6 & 192) != 128) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    int i13 = (b6 ^ 3968) ^ (b5 << 6);
                    if (i13 < 128) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    i5 = i9 + 1;
                    if (i9 == i4) {
                        break;
                    }
                    if ((i13 == 10 || i13 == 13 || ((i13 < 0 || i13 >= 32) && (127 > i13 || i13 >= 160))) && i13 != 65533) {
                        i8 += i13 < 65536 ? i11 : 2;
                        Unit unit = Unit.f41027a;
                        i7 += 2;
                        i9 = i5;
                        i6 = i11;
                    }
                } else if ((b5 >> 4) == -2) {
                    int i14 = i7 + 2;
                    if (length <= i14) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    byte b7 = bArr[i7 + 1];
                    if ((b7 & 192) != 128) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    byte b8 = bArr[i14];
                    if ((b8 & 192) != 128) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    int i15 = ((b8 ^ (-123008)) ^ (b7 << 6)) ^ (b5 << 12);
                    if (i15 < 2048) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    if (55296 <= i15 && i15 < 57344) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    i5 = i9 + 1;
                    if (i9 == i4) {
                        break;
                    }
                    if ((i15 == 10 || i15 == 13 || ((i15 < 0 || i15 >= 32) && (127 > i15 || i15 >= 160))) && i15 != 65533) {
                        i8 += i15 < 65536 ? i11 : 2;
                        Unit unit2 = Unit.f41027a;
                        i7 += 3;
                        i9 = i5;
                        i6 = i11;
                    }
                } else {
                    if ((b5 >> 3) != -2) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    int i16 = i7 + 3;
                    if (length <= i16) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    byte b9 = bArr[i7 + 1];
                    if ((b9 & 192) != 128) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    byte b10 = bArr[i7 + 2];
                    if ((b10 & 192) != 128) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i16];
                    if ((b11 & 192) != 128) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    int i17 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b5 << 18);
                    if (i17 > 1114111) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    if (55296 <= i17 && i17 < 57344) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    if (i17 < 65536) {
                        if (i9 == i4) {
                            break;
                        }
                        return -1;
                    }
                    i5 = i9 + 1;
                    if (i9 == i4) {
                        break;
                    }
                    if ((i17 == 10 || i17 == 13 || ((i17 < 0 || i17 >= 32) && (127 > i17 || i17 >= 160))) && i17 != 65533) {
                        i8 += i17 < 65536 ? i11 : 2;
                        Unit unit3 = Unit.f41027a;
                        i7 += 4;
                        i9 = i5;
                        i6 = i11;
                    }
                }
            }
        }
        return i8;
    }

    public static final void d(h hVar, C3372e buffer, int i4, int i5) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(hVar.h(), i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public static final char[] f() {
        return f767a;
    }
}
