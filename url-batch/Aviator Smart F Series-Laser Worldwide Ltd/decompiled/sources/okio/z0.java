package okio;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes5.dex */
public abstract class z0 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i8) {
        return (i8 >= 0 && i8 <= 31) || (127 <= i8 && i8 <= 159);
    }

    public static final boolean isUtf8Continuation(byte b8) {
        return (b8 & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i8, int i9, f6.l yield) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(yield, "yield");
        int i10 = i8 + 1;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i9 <= i10) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b8 = bArr[i8];
        byte b9 = bArr[i10];
        if ((b9 & 192) != 128) {
            yield.invoke(valueOf);
            return 1;
        }
        int i11 = (b9 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b8 << 6);
        if (i11 < 128) {
            yield.invoke(valueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i11));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i8, int i9, f6.l yield) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(yield, "yield");
        int i10 = i8 + 2;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i9 <= i10) {
            yield.invoke(valueOf);
            int i11 = i8 + 1;
            return (i9 <= i11 || (bArr[i11] & 192) != 128) ? 1 : 2;
        }
        byte b8 = bArr[i8];
        byte b9 = bArr[i8 + 1];
        if ((b9 & 192) != 128) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b10 = bArr[i10];
        if ((b10 & 192) != 128) {
            yield.invoke(valueOf);
            return 2;
        }
        int i12 = ((b10 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b9 << 6)) ^ (b8 << 12);
        if (i12 < 2048) {
            yield.invoke(valueOf);
            return 3;
        }
        if (55296 > i12 || i12 > 57343) {
            yield.invoke(Integer.valueOf(i12));
            return 3;
        }
        yield.invoke(valueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i8, int i9, f6.l yield) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(yield, "yield");
        int i10 = i8 + 3;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i9 <= i10) {
            yield.invoke(valueOf);
            int i11 = i8 + 1;
            if (i9 <= i11 || (bArr[i11] & 192) != 128) {
                return 1;
            }
            int i12 = i8 + 2;
            return (i9 <= i12 || (bArr[i12] & 192) != 128) ? 2 : 3;
        }
        byte b8 = bArr[i8];
        byte b9 = bArr[i8 + 1];
        if ((b9 & 192) != 128) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b10 = bArr[i8 + 2];
        if ((b10 & 192) != 128) {
            yield.invoke(valueOf);
            return 2;
        }
        byte b11 = bArr[i10];
        if ((b11 & 192) != 128) {
            yield.invoke(valueOf);
            return 3;
        }
        int i13 = (((b11 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b8 << 18);
        if (i13 > 1114111) {
            yield.invoke(valueOf);
            return 4;
        }
        if (55296 <= i13 && i13 <= 57343) {
            yield.invoke(valueOf);
            return 4;
        }
        if (i13 < 65536) {
            yield.invoke(valueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i13));
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        if ((r11[r0] & 192) == 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0084, code lost:
    
        if ((r11[r0] & 192) == 128) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processUtf16Chars(byte[] bArr, int i8, int i9, f6.l yield) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(yield, "yield");
        while (i8 < i9) {
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                yield.invoke(Character.valueOf((char) b8));
                i8++;
                while (i8 < i9) {
                    byte b9 = bArr[i8];
                    if (b9 >= 0) {
                        i8++;
                        yield.invoke(Character.valueOf((char) b9));
                    }
                }
            } else {
                int i10 = 2;
                if ((b8 >> 5) == -2) {
                    int i11 = i8 + 1;
                    if (i9 > i11) {
                        byte b10 = bArr[i11];
                        if ((b10 & 192) == 128) {
                            int i12 = (b8 << 6) ^ (b10 ^ UnsignedBytes.MAX_POWER_OF_TWO);
                            yield.invoke(Character.valueOf(i12 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i12));
                            y5.w wVar = y5.w.INSTANCE;
                            i8 += i10;
                        }
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    y5.w wVar2 = y5.w.INSTANCE;
                    i10 = 1;
                    i8 += i10;
                } else if ((b8 >> 4) == -2) {
                    int i13 = i8 + 2;
                    if (i9 <= i13) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        y5.w wVar3 = y5.w.INSTANCE;
                        int i14 = i8 + 1;
                        if (i9 > i14) {
                        }
                        i10 = 1;
                        i8 += i10;
                    } else {
                        byte b11 = bArr[i8 + 1];
                        if ((b11 & 192) == 128) {
                            byte b12 = bArr[i13];
                            if ((b12 & 192) == 128) {
                                int i15 = (b8 << 12) ^ ((b12 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b11 << 6));
                                yield.invoke(Character.valueOf((i15 >= 2048 && (55296 > i15 || i15 > 57343)) ? (char) i15 : (char) REPLACEMENT_CODE_POINT));
                                y5.w wVar4 = y5.w.INSTANCE;
                                i10 = 3;
                                i8 += i10;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                y5.w wVar5 = y5.w.INSTANCE;
                                i8 += i10;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            y5.w wVar6 = y5.w.INSTANCE;
                            i10 = 1;
                            i8 += i10;
                        }
                    }
                } else if ((b8 >> 3) == -2) {
                    int i16 = i8 + 3;
                    if (i9 <= i16) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        y5.w wVar7 = y5.w.INSTANCE;
                        int i17 = i8 + 1;
                        if (i9 > i17 && (bArr[i17] & 192) == 128) {
                            int i18 = i8 + 2;
                            if (i9 > i18) {
                            }
                            i8 += i10;
                        }
                        i10 = 1;
                        i8 += i10;
                    } else {
                        byte b13 = bArr[i8 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i8 + 2];
                            if ((b14 & 192) == 128) {
                                byte b15 = bArr[i16];
                                if ((b15 & 192) == 128) {
                                    int i19 = (b8 << 18) ^ (((b15 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b14 << 6)) ^ (b13 << 12));
                                    if (i19 <= 1114111 && ((55296 > i19 || i19 > 57343) && i19 >= 65536 && i19 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i19 >>> 10) + HIGH_SURROGATE_HEADER)));
                                        yield.invoke(Character.valueOf((char) ((i19 & 1023) + LOG_SURROGATE_HEADER)));
                                    } else {
                                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    }
                                    y5.w wVar8 = y5.w.INSTANCE;
                                    i10 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    y5.w wVar9 = y5.w.INSTANCE;
                                    i10 = 3;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                y5.w wVar10 = y5.w.INSTANCE;
                            }
                            i8 += i10;
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            y5.w wVar11 = y5.w.INSTANCE;
                            i10 = 1;
                            i8 += i10;
                        }
                    }
                } else {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    i8++;
                }
            }
        }
    }

    public static final void processUtf8Bytes(String str, int i8, int i9, f6.l yield) {
        int i10;
        char charAt;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(yield, "yield");
        while (i8 < i9) {
            char charAt2 = str.charAt(i8);
            if (kotlin.jvm.internal.s.compare((int) charAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) charAt2));
                i8++;
                while (i8 < i9 && kotlin.jvm.internal.s.compare((int) str.charAt(i8), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i8)));
                    i8++;
                }
            } else {
                if (kotlin.jvm.internal.s.compare((int) charAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM)));
                    yield.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || charAt2 > 57343) {
                    yield.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (kotlin.jvm.internal.s.compare((int) charAt2, 56319) > 0 || i9 <= (i10 = i8 + 1) || 56320 > (charAt = str.charAt(i10)) || charAt > 57343) {
                    yield.invoke((byte) 63);
                } else {
                    int charAt3 = ((charAt2 << '\n') + str.charAt(i10)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i8 += 2;
                }
                i8++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        if ((r11[r0] & 192) == 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if ((r11[r0] & 192) == 128) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processUtf8CodePoints(byte[] bArr, int i8, int i9, f6.l yield) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(yield, "yield");
        while (i8 < i9) {
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                yield.invoke(Integer.valueOf(b8));
                i8++;
                while (i8 < i9) {
                    byte b9 = bArr[i8];
                    if (b9 >= 0) {
                        i8++;
                        yield.invoke(Integer.valueOf(b9));
                    }
                }
            } else {
                int i10 = 2;
                if ((b8 >> 5) == -2) {
                    int i11 = i8 + 1;
                    if (i9 > i11) {
                        byte b10 = bArr[i11];
                        if ((b10 & 192) == 128) {
                            int i12 = (b8 << 6) ^ (b10 ^ UnsignedBytes.MAX_POWER_OF_TWO);
                            yield.invoke(i12 < 128 ? Integer.valueOf(REPLACEMENT_CODE_POINT) : Integer.valueOf(i12));
                            y5.w wVar = y5.w.INSTANCE;
                            i8 += i10;
                        }
                    }
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    y5.w wVar2 = y5.w.INSTANCE;
                    i10 = 1;
                    i8 += i10;
                } else if ((b8 >> 4) == -2) {
                    int i13 = i8 + 2;
                    if (i9 <= i13) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        y5.w wVar3 = y5.w.INSTANCE;
                        int i14 = i8 + 1;
                        if (i9 > i14) {
                        }
                        i10 = 1;
                        i8 += i10;
                    } else {
                        byte b11 = bArr[i8 + 1];
                        if ((b11 & 192) == 128) {
                            byte b12 = bArr[i13];
                            if ((b12 & 192) == 128) {
                                int i15 = (b8 << 12) ^ ((b12 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b11 << 6));
                                yield.invoke((i15 >= 2048 && (55296 > i15 || i15 > 57343)) ? Integer.valueOf(i15) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                y5.w wVar4 = y5.w.INSTANCE;
                                i10 = 3;
                                i8 += i10;
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                y5.w wVar5 = y5.w.INSTANCE;
                                i8 += i10;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            y5.w wVar6 = y5.w.INSTANCE;
                            i10 = 1;
                            i8 += i10;
                        }
                    }
                } else if ((b8 >> 3) == -2) {
                    int i16 = i8 + 3;
                    if (i9 <= i16) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        y5.w wVar7 = y5.w.INSTANCE;
                        int i17 = i8 + 1;
                        if (i9 > i17 && (bArr[i17] & 192) == 128) {
                            int i18 = i8 + 2;
                            if (i9 > i18) {
                            }
                            i8 += i10;
                        }
                        i10 = 1;
                        i8 += i10;
                    } else {
                        byte b13 = bArr[i8 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i8 + 2];
                            if ((b14 & 192) == 128) {
                                byte b15 = bArr[i16];
                                if ((b15 & 192) == 128) {
                                    int i19 = (b8 << 18) ^ (((b15 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b14 << 6)) ^ (b13 << 12));
                                    yield.invoke((i19 <= 1114111 && (55296 > i19 || i19 > 57343) && i19 >= 65536) ? Integer.valueOf(i19) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    y5.w wVar8 = y5.w.INSTANCE;
                                    i10 = 4;
                                } else {
                                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    y5.w wVar9 = y5.w.INSTANCE;
                                    i10 = 3;
                                }
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                y5.w wVar10 = y5.w.INSTANCE;
                            }
                            i8 += i10;
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            y5.w wVar11 = y5.w.INSTANCE;
                            i10 = 1;
                            i8 += i10;
                        }
                    }
                } else {
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    i8++;
                }
            }
        }
    }

    public static final long size(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return size(str, i8, i9);
    }

    public static final long size(String str, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return size$default(str, i8, 0, 2, null);
    }

    public static final long size(String str, int i8, int i9) {
        int i10;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("beginIndex < 0: ", Integer.valueOf(i8)).toString());
        }
        if (i9 >= i8) {
            if (!(i9 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + str.length()).toString());
            }
            long j8 = 0;
            while (i8 < i9) {
                char charAt = str.charAt(i8);
                if (charAt < 128) {
                    j8++;
                } else {
                    if (charAt < 2048) {
                        i10 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i10 = 3;
                    } else {
                        int i11 = i8 + 1;
                        char charAt2 = i11 < i9 ? str.charAt(i11) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j8++;
                            i8 = i11;
                        } else {
                            j8 += 4;
                            i8 += 2;
                        }
                    }
                    j8 += i10;
                }
                i8++;
            }
            return j8;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
    }
}
