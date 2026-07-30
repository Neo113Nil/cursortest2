package okio.internal;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import kotlin.jvm.internal.s;
import kotlin.text.t;
import okio.z0;
import y5.w;

/* loaded from: classes5.dex */
public abstract class h {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i8;
        char charAt;
        s.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        if (length > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                char charAt2 = str.charAt(i9);
                if (s.compare((int) charAt2, 128) >= 0) {
                    int length2 = str.length();
                    int i11 = i9;
                    while (i9 < length2) {
                        char charAt3 = str.charAt(i9);
                        if (s.compare((int) charAt3, 128) < 0) {
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) charAt3;
                            i9++;
                            while (true) {
                                i11 = i12;
                                if (i9 < length2 && s.compare((int) str.charAt(i9), 128) < 0) {
                                    i12 = i11 + 1;
                                    bArr[i11] = (byte) str.charAt(i9);
                                    i9++;
                                }
                            }
                        } else {
                            if (s.compare((int) charAt3, 2048) < 0) {
                                bArr[i11] = (byte) ((charAt3 >> 6) | PsExtractor.AUDIO_STREAM);
                                i11 += 2;
                                bArr[i11 + 1] = (byte) ((charAt3 & '?') | 128);
                            } else if (55296 > charAt3 || charAt3 > 57343) {
                                bArr[i11] = (byte) ((charAt3 >> '\f') | 224);
                                bArr[i11 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                                i11 += 3;
                                bArr[i11 + 2] = (byte) ((charAt3 & '?') | 128);
                            } else if (s.compare((int) charAt3, 56319) > 0 || length2 <= (i8 = i9 + 1) || 56320 > (charAt = str.charAt(i8)) || charAt > 57343) {
                                bArr[i11] = 63;
                                i9++;
                                i11++;
                            } else {
                                int charAt4 = ((charAt3 << '\n') + str.charAt(i8)) - 56613888;
                                bArr[i11] = (byte) ((charAt4 >> 18) | 240);
                                bArr[i11 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                                bArr[i11 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                                i11 += 4;
                                bArr[i11 + 3] = (byte) ((charAt4 & 63) | 128);
                                i9 += 2;
                            }
                            i9++;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr, i11);
                    s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                    return copyOf;
                }
                bArr[i9] = (byte) charAt2;
                if (i10 >= length) {
                    break;
                }
                i9 = i10;
            }
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        s.checkNotNullExpressionValue(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fc, code lost:
    
        if ((r16[r5] & 192) == 128) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0091, code lost:
    
        if ((r16[r5] & 192) == 128) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String commonToUtf8String(byte[] bArr, int i8, int i9) {
        byte b8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i8;
        s.checkNotNullParameter(bArr, "<this>");
        if (i15 < 0 || i9 > bArr.length || i15 > i9) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i15 + " endIndex=" + i9);
        }
        char[] cArr = new char[i9 - i15];
        int i16 = 0;
        while (i15 < i9) {
            byte b9 = bArr[i15];
            if (b9 >= 0) {
                int i17 = i16 + 1;
                cArr[i16] = (char) b9;
                i15++;
                while (true) {
                    i16 = i17;
                    if (i15 < i9 && (b8 = bArr[i15]) >= 0) {
                        i15++;
                        i17 = i16 + 1;
                        cArr[i16] = (char) b8;
                    }
                }
            } else {
                if ((b9 >> 5) == -2) {
                    int i18 = i15 + 1;
                    if (i9 <= i18) {
                        i10 = i16 + 1;
                        cArr[i16] = (char) z0.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b10 = bArr[i18];
                        if ((b10 & 192) == 128) {
                            int i19 = (b9 << 6) ^ (b10 ^ UnsignedBytes.MAX_POWER_OF_TWO);
                            if (i19 < 128) {
                                i10 = i16 + 1;
                                cArr[i16] = (char) z0.REPLACEMENT_CODE_POINT;
                            } else {
                                i10 = i16 + 1;
                                cArr[i16] = (char) i19;
                            }
                            w wVar = w.INSTANCE;
                            i16 = i10;
                            i11 = 2;
                        } else {
                            i10 = i16 + 1;
                            cArr[i16] = (char) z0.REPLACEMENT_CODE_POINT;
                        }
                    }
                    w wVar2 = w.INSTANCE;
                    i16 = i10;
                    i11 = 1;
                } else {
                    if ((b9 >> 4) == -2) {
                        int i20 = i15 + 2;
                        if (i9 <= i20) {
                            i10 = i16 + 1;
                            cArr[i16] = (char) z0.REPLACEMENT_CODE_POINT;
                            w wVar3 = w.INSTANCE;
                            int i21 = i15 + 1;
                            if (i9 > i21) {
                            }
                            i16 = i10;
                            i11 = 1;
                        } else {
                            byte b11 = bArr[i15 + 1];
                            if ((b11 & 192) == 128) {
                                byte b12 = bArr[i20];
                                if ((b12 & 192) == 128) {
                                    int i22 = (b9 << 12) ^ ((b12 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b11 << 6));
                                    if (i22 < 2048) {
                                        i12 = i16 + 1;
                                        cArr[i16] = (char) z0.REPLACEMENT_CODE_POINT;
                                    } else if (55296 > i22 || i22 > 57343) {
                                        i12 = i16 + 1;
                                        cArr[i16] = (char) i22;
                                    } else {
                                        i12 = i16 + 1;
                                        cArr[i16] = (char) z0.REPLACEMENT_CODE_POINT;
                                    }
                                    w wVar4 = w.INSTANCE;
                                    i16 = i12;
                                } else {
                                    i10 = i16 + 1;
                                    cArr[i16] = (char) z0.REPLACEMENT_CODE_POINT;
                                    w wVar5 = w.INSTANCE;
                                    i16 = i10;
                                    i11 = 2;
                                }
                            } else {
                                i10 = i16 + 1;
                                cArr[i16] = (char) z0.REPLACEMENT_CODE_POINT;
                                w wVar6 = w.INSTANCE;
                                i16 = i10;
                                i11 = 1;
                            }
                        }
                    } else if ((b9 >> 3) == -2) {
                        int i23 = i15 + 3;
                        if (i9 <= i23) {
                            i13 = i16 + 1;
                            cArr[i16] = z0.REPLACEMENT_CHARACTER;
                            w wVar7 = w.INSTANCE;
                            int i24 = i15 + 1;
                            if (i9 > i24 && (bArr[i24] & 192) == 128) {
                                int i25 = i15 + 2;
                                if (i9 > i25) {
                                }
                                i16 = i13;
                                i11 = 2;
                            }
                            i16 = i13;
                            i11 = 1;
                        } else {
                            byte b13 = bArr[i15 + 1];
                            if ((b13 & 192) == 128) {
                                byte b14 = bArr[i15 + 2];
                                if ((b14 & 192) == 128) {
                                    byte b15 = bArr[i23];
                                    if ((b15 & 192) == 128) {
                                        int i26 = (b9 << 18) ^ (((b15 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b14 << 6)) ^ (b13 << 12));
                                        if (i26 > 1114111) {
                                            i14 = i16 + 1;
                                            cArr[i16] = z0.REPLACEMENT_CHARACTER;
                                        } else if (55296 <= i26 && i26 <= 57343) {
                                            i14 = i16 + 1;
                                            cArr[i16] = z0.REPLACEMENT_CHARACTER;
                                        } else if (i26 < 65536) {
                                            i14 = i16 + 1;
                                            cArr[i16] = z0.REPLACEMENT_CHARACTER;
                                        } else if (i26 != 65533) {
                                            cArr[i16] = (char) ((i26 >>> 10) + z0.HIGH_SURROGATE_HEADER);
                                            cArr[i16 + 1] = (char) ((i26 & 1023) + z0.LOG_SURROGATE_HEADER);
                                            i14 = i16 + 2;
                                        } else {
                                            i14 = i16 + 1;
                                            cArr[i16] = z0.REPLACEMENT_CHARACTER;
                                        }
                                        w wVar8 = w.INSTANCE;
                                        i11 = 4;
                                        i16 = i14;
                                    } else {
                                        i13 = i16 + 1;
                                        cArr[i16] = z0.REPLACEMENT_CHARACTER;
                                        w wVar9 = w.INSTANCE;
                                        i16 = i13;
                                    }
                                } else {
                                    i13 = i16 + 1;
                                    cArr[i16] = z0.REPLACEMENT_CHARACTER;
                                    w wVar10 = w.INSTANCE;
                                    i16 = i13;
                                    i11 = 2;
                                }
                            } else {
                                i13 = i16 + 1;
                                cArr[i16] = z0.REPLACEMENT_CHARACTER;
                                w wVar11 = w.INSTANCE;
                                i16 = i13;
                                i11 = 1;
                            }
                        }
                    } else {
                        cArr[i16] = z0.REPLACEMENT_CHARACTER;
                        i15++;
                        i16++;
                    }
                    i11 = 3;
                }
                i15 += i11;
            }
        }
        return t.concatToString(cArr, 0, i16);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = bArr.length;
        }
        return commonToUtf8String(bArr, i8, i9);
    }
}
