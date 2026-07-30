package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Utf8;

/* compiled from: -Utf8.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class _Utf8Kt {
    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        if ((r16[r5] & 192) == 128) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008f, code lost:
    
        if ((r16[r5] & 192) == 128) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String commonToUtf8String(byte[] bArr, int i, int i2) {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i6 < 0 || i2 > bArr.length || i6 > i2) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i6 + " endIndex=" + i2);
        }
        char[] cArr = new char[i2 - i6];
        int i7 = 0;
        while (i6 < i2) {
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                int i8 = i7 + 1;
                cArr[i7] = (char) b2;
                i6++;
                while (true) {
                    i7 = i8;
                    if (i6 < i2 && (b = bArr[i6]) >= 0) {
                        i6++;
                        i8 = i7 + 1;
                        cArr[i7] = (char) b;
                    }
                }
            } else {
                if ((b2 >> 5) == -2) {
                    int i9 = i6 + 1;
                    if (i2 <= i9) {
                        i3 = i7 + 1;
                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                    } else {
                        byte b3 = bArr[i9];
                        if ((b3 & 192) == 128) {
                            int i10 = (b2 << 6) ^ (b3 ^ ByteCompanionObject.MIN_VALUE);
                            if (i10 < 128) {
                                i3 = i7 + 1;
                                cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit = Unit.INSTANCE;
                            } else {
                                int i11 = i7 + 1;
                                cArr[i7] = (char) i10;
                                Unit unit2 = Unit.INSTANCE;
                                i3 = i11;
                            }
                            i7 = i3;
                            i4 = 2;
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                    i7 = i3;
                    i4 = 1;
                } else if ((b2 >> 4) == -2) {
                    int i12 = i6 + 2;
                    if (i2 <= i12) {
                        i3 = i7 + 1;
                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                        Unit unit4 = Unit.INSTANCE;
                        int i13 = i6 + 1;
                        if (i2 > i13) {
                        }
                        i7 = i3;
                        i4 = 1;
                    } else {
                        byte b4 = bArr[i6 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i12];
                            if ((b5 & 192) == 128) {
                                int i14 = (b2 << 12) ^ ((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6));
                                if (i14 < 2048) {
                                    i3 = i7 + 1;
                                    cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                } else if (55296 > i14 || i14 >= 57344) {
                                    int i15 = i7 + 1;
                                    cArr[i7] = (char) i14;
                                    Unit unit5 = Unit.INSTANCE;
                                    i3 = i15;
                                    i7 = i3;
                                    i4 = 3;
                                } else {
                                    i3 = i7 + 1;
                                    cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                }
                                Unit unit6 = Unit.INSTANCE;
                                i7 = i3;
                                i4 = 3;
                            } else {
                                i3 = i7 + 1;
                                cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit7 = Unit.INSTANCE;
                                i7 = i3;
                                i4 = 2;
                            }
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit8 = Unit.INSTANCE;
                            i7 = i3;
                            i4 = 1;
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i16 = i6 + 3;
                    if (i2 <= i16) {
                        i3 = i7 + 1;
                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                        Unit unit9 = Unit.INSTANCE;
                        int i17 = i6 + 1;
                        if (i2 > i17 && (bArr[i17] & 192) == 128) {
                            int i18 = i6 + 2;
                            if (i2 > i18) {
                            }
                            i7 = i3;
                            i4 = 2;
                        }
                        i7 = i3;
                        i4 = 1;
                    } else {
                        byte b6 = bArr[i6 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i6 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i16];
                                if ((b8 & 192) == 128) {
                                    int i19 = (b2 << 18) ^ (((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i19 > 1114111) {
                                        i5 = i7 + 1;
                                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                    } else if (55296 <= i19 && i19 < 57344) {
                                        i5 = i7 + 1;
                                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                    } else if (i19 < 65536) {
                                        i5 = i7 + 1;
                                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                    } else if (i19 != 65533) {
                                        cArr[i7] = (char) ((i19 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                        cArr[i7 + 1] = (char) ((i19 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                        i5 = i7 + 2;
                                    } else {
                                        i5 = i7 + 1;
                                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                    }
                                    Unit unit10 = Unit.INSTANCE;
                                    i4 = 4;
                                    i7 = i5;
                                } else {
                                    i3 = i7 + 1;
                                    cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                    Unit unit11 = Unit.INSTANCE;
                                    i7 = i3;
                                    i4 = 3;
                                }
                            } else {
                                i3 = i7 + 1;
                                cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit12 = Unit.INSTANCE;
                                i7 = i3;
                                i4 = 2;
                            }
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit13 = Unit.INSTANCE;
                            i7 = i3;
                            i4 = 1;
                        }
                    }
                } else {
                    cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                    i6++;
                    i7++;
                }
                i6 += i4;
            }
        }
        return StringsKt.concatToString(cArr, 0, i7);
    }

    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i;
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (Intrinsics.compare((int) charAt2, 128) >= 0) {
                int length2 = str.length();
                int i3 = i2;
                while (i2 < length2) {
                    char charAt3 = str.charAt(i2);
                    if (Intrinsics.compare((int) charAt3, 128) < 0) {
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) charAt3;
                        i2++;
                        while (true) {
                            i3 = i4;
                            if (i2 < length2 && Intrinsics.compare((int) str.charAt(i2), 128) < 0) {
                                i4 = i3 + 1;
                                bArr[i3] = (byte) str.charAt(i2);
                                i2++;
                            }
                        }
                    } else {
                        if (Intrinsics.compare((int) charAt3, 2048) < 0) {
                            bArr[i3] = (byte) ((charAt3 >> 6) | 192);
                            i3 += 2;
                            bArr[i3 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || charAt3 >= 57344) {
                            bArr[i3] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i3 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i3 + 2] = (byte) ((charAt3 & '?') | 128);
                        } else if (Intrinsics.compare((int) charAt3, 56319) > 0 || length2 <= (i = i2 + 1) || 56320 > (charAt = str.charAt(i)) || charAt >= 57344) {
                            bArr[i3] = Utf8.REPLACEMENT_BYTE;
                            i2++;
                            i3++;
                        } else {
                            int charAt4 = ((charAt3 << '\n') + str.charAt(i)) - 56613888;
                            bArr[i3] = (byte) ((charAt4 >> 18) | 240);
                            bArr[i3 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i3 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i3 += 4;
                            bArr[i3 + 3] = (byte) ((charAt4 & 63) | 128);
                            i2 += 2;
                        }
                        i2++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i3);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i2] = (byte) charAt2;
            i2++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return copyOf2;
    }
}
