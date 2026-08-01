package io.ktor.utils.io.charsets;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: UTF.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a\"\u0010\u001f\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001\u001a&\u0010#\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0001\u001a$\u0010$\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a$\u0010%\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a$\u0010&\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a9\u0010&\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150(H\u0082\b\u001a$\u0010*\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a9\u0010*\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150(H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"HighSurrogateMagic", "", "MaxCodePoint", "MinHighSurrogate", "MinLowSurrogate", "MinSupplementary", "decodeUtf8Result", "", "numberOfChars", "requireBytes", "decodeUtf8ResultAcc", "preDecoded", "result", "highSurrogate", "cp", "indexOutOfBounds", "", TypedValues.CycleType.S_WAVE_OFFSET, "length", "arrayLength", "isBmpCodePoint", "", "isValidCodePoint", "codePoint", "lowSurrogate", "malformedCodePoint", "", "value", "unsupportedByteCount", "b", "", "decodeUTF", "Ljava/nio/ByteBuffer;", "out", "", "decodeUTF8Line", "decodeUTF8Line_array", "decodeUTF8Line_buffer", "decodeUTF8_array", "predicate", "Lkotlin/Function1;", "", "decodeUTF8_buffer", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UTFKt {
    private static final int HighSurrogateMagic = 55232;
    private static final int MaxCodePoint = 1114111;
    private static final int MinHighSurrogate = 55296;
    private static final int MinLowSurrogate = 56320;
    private static final int MinSupplementary = 65536;

    public static final long decodeUtf8Result(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    private static final int highSurrogate(int i) {
        return (i >>> 10) + HighSurrogateMagic;
    }

    private static final boolean isBmpCodePoint(int i) {
        return (i >>> 16) == 0;
    }

    private static final boolean isValidCodePoint(int i) {
        return i <= MaxCodePoint;
    }

    private static final int lowSurrogate(int i) {
        return (i & 1023) + MinLowSurrogate;
    }

    public static final long decodeUtf8ResultAcc(int i, long j) {
        return decodeUtf8Result(i + ((int) (j >> 32)), (int) (j & 4294967295L));
    }

    public static final long decodeUTF(ByteBuffer byteBuffer, char[] out, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        int decodeASCII = StringsKt.decodeASCII(byteBuffer, out, i, i2);
        if (!byteBuffer.hasRemaining() || decodeASCII == i2) {
            return decodeUtf8Result(decodeASCII, 0);
        }
        return byteBuffer.hasArray() ? decodeUtf8ResultAcc(decodeASCII, decodeUTF8_array(byteBuffer, out, i + decodeASCII, i2 - decodeASCII)) : decodeUtf8ResultAcc(decodeASCII, decodeUTF8_buffer(byteBuffer, out, i + decodeASCII, i2 - decodeASCII));
    }

    public static /* synthetic */ long decodeUTF8Line$default(ByteBuffer byteBuffer, char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return decodeUTF8Line(byteBuffer, cArr, i, i2);
    }

    public static final long decodeUTF8Line(ByteBuffer byteBuffer, char[] out, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        return byteBuffer.hasArray() ? decodeUTF8Line_array(byteBuffer, out, i, i2) : decodeUTF8Line_buffer(byteBuffer, out, i, i2);
    }

    private static final long decodeUTF8_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining() + arrayOffset;
        if (!(arrayOffset <= remaining)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(remaining <= array.length)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i + i2;
        if (i3 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i4 = i;
        while (arrayOffset < remaining && i4 < i3) {
            int i5 = arrayOffset + 1;
            byte b = array[arrayOffset];
            if (b >= 0) {
                cArr[i4] = (char) b;
                arrayOffset = i5;
                i4++;
            } else if ((b & 224) == 192) {
                if (i5 >= remaining) {
                    byteBuffer.position((i5 - 1) - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, 2);
                }
                cArr[i4] = (char) (((b & Ascii.US) << 6) | (array[i5] & 63));
                arrayOffset = i5 + 1;
                i4++;
            } else if ((b & 240) == 224) {
                if (remaining - i5 < 2) {
                    byteBuffer.position((i5 - 1) - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, 3);
                }
                int i6 = i5 + 1;
                byte b2 = array[i5];
                int i7 = i6 + 1;
                byte b3 = array[i6];
                int i8 = b & Ascii.SI;
                int i9 = ((b2 & 63) << 6) | (i8 << 12) | (b3 & 63);
                if (i8 == 0 || isBmpCodePoint(i9)) {
                    cArr[i4] = (char) i9;
                    i4++;
                    arrayOffset = i7;
                } else {
                    malformedCodePoint(i9);
                    throw new KotlinNothingValueException();
                }
            } else {
                if ((b & 248) != 240) {
                    unsupportedByteCount(b);
                    throw new KotlinNothingValueException();
                }
                if (remaining - i5 < 3) {
                    byteBuffer.position((i5 - 1) - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, 4);
                }
                int i10 = i5 + 1;
                int i11 = i10 + 1;
                int i12 = i11 + 1;
                int i13 = ((b & 7) << 18) | ((array[i5] & 63) << 12) | ((array[i10] & 63) << 6) | (array[i11] & 63);
                if (!isValidCodePoint(i13)) {
                    malformedCodePoint(i13);
                    throw new KotlinNothingValueException();
                }
                if (i3 - i4 >= 2) {
                    int highSurrogate = highSurrogate(i13);
                    int lowSurrogate = lowSurrogate(i13);
                    int i14 = i4 + 1;
                    cArr[i4] = (char) highSurrogate;
                    i4 = i14 + 1;
                    cArr[i14] = (char) lowSurrogate;
                    arrayOffset = i12;
                } else {
                    byteBuffer.position((i12 - 4) - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, 0);
                }
            }
        }
        byteBuffer.position(arrayOffset - byteBuffer.arrayOffset());
        return decodeUtf8Result(i4 - i, 0);
    }

    private static final long decodeUTF8_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2) {
        int i3 = i + i2;
        if (i3 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i4 = i;
        while (byteBuffer.hasRemaining() && i4 < i3) {
            byte b = byteBuffer.get();
            if (b >= 0) {
                cArr[i4] = (char) b;
                i4++;
            } else if ((b & 224) == 192) {
                if (byteBuffer.hasRemaining()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i4 - i, 2);
                }
                cArr[i4] = (char) (((b & Ascii.US) << 6) | (byteBuffer.get() & 63));
                i4++;
            } else if ((b & 240) == 224) {
                if (byteBuffer.remaining() < 2) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i4 - i, 3);
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                int i5 = b & Ascii.SI;
                int i6 = ((b2 & 63) << 6) | (i5 << 12) | (b3 & 63);
                if (i5 == 0 || isBmpCodePoint(i6)) {
                    cArr[i4] = (char) i6;
                    i4++;
                } else {
                    malformedCodePoint(i6);
                    throw new KotlinNothingValueException();
                }
            } else if ((b & 248) == 240) {
                if (byteBuffer.remaining() < 3) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i4 - i, 4);
                }
                int i7 = ((b & 7) << 18) | ((byteBuffer.get() & 63) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63);
                if (!isValidCodePoint(i7)) {
                    malformedCodePoint(i7);
                    throw new KotlinNothingValueException();
                }
                if (i3 - i4 >= 2) {
                    int highSurrogate = highSurrogate(i7);
                    int lowSurrogate = lowSurrogate(i7);
                    int i8 = i4 + 1;
                    cArr[i4] = (char) highSurrogate;
                    i4 = i8 + 1;
                    cArr[i8] = (char) lowSurrogate;
                } else {
                    byteBuffer.position(byteBuffer.position() - 4);
                    return decodeUtf8Result(i4 - i, 0);
                }
            } else {
                unsupportedByteCount(b);
                throw new KotlinNothingValueException();
            }
        }
        return decodeUtf8Result(i4 - i, 0);
    }

    private static final long decodeUTF8_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2, Function1<? super Character, Boolean> function1) {
        int i3;
        int i4;
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining() + arrayOffset;
        if (!(arrayOffset <= remaining)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(remaining <= array.length)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i5 = i + i2;
        if (i5 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i6 = i;
        while (arrayOffset < remaining && i6 < i5) {
            int i7 = arrayOffset + 1;
            byte b = array[arrayOffset];
            if (b >= 0) {
                char c = (char) b;
                if (!function1.invoke(Character.valueOf(c)).booleanValue()) {
                    byteBuffer.position((i7 - 1) - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i6 - i, -1);
                }
                cArr[i6] = c;
                arrayOffset = i7;
                i6++;
            } else {
                if ((b & 224) == 192) {
                    if (i7 >= remaining) {
                        byteBuffer.position((i7 - 1) - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i6 - i, 2);
                    }
                    i3 = i7 + 1;
                    char c2 = (char) (((b & Ascii.US) << 6) | (array[i7] & 63));
                    if (!function1.invoke(Character.valueOf(c2)).booleanValue()) {
                        byteBuffer.position((i3 - 2) - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i6 - i, -1);
                    }
                    i4 = i6 + 1;
                    cArr[i6] = c2;
                } else if ((b & 240) == 224) {
                    if (remaining - i7 < 2) {
                        byteBuffer.position((i7 - 1) - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i6 - i, 3);
                    }
                    int i8 = i7 + 1;
                    byte b2 = array[i7];
                    i3 = i8 + 1;
                    byte b3 = array[i8];
                    int i9 = b & Ascii.SI;
                    int i10 = (b3 & 63) | ((b2 & 63) << 6) | (i9 << 12);
                    if (i9 == 0 || isBmpCodePoint(i10)) {
                        char c3 = (char) i10;
                        if (!function1.invoke(Character.valueOf(c3)).booleanValue()) {
                            byteBuffer.position((i3 - 4) - byteBuffer.arrayOffset());
                            return decodeUtf8Result(i6 - i, -1);
                        }
                        i4 = i6 + 1;
                        cArr[i6] = c3;
                    } else {
                        malformedCodePoint(i10);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    if ((b & 248) != 240) {
                        unsupportedByteCount(b);
                        throw new KotlinNothingValueException();
                    }
                    if (remaining - i7 < 3) {
                        byteBuffer.position((i7 - 1) - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i6 - i, 4);
                    }
                    int i11 = i7 + 1;
                    int i12 = i11 + 1;
                    int i13 = i12 + 1;
                    int i14 = ((b & 7) << 18) | ((array[i7] & 63) << 12) | ((array[i11] & 63) << 6) | (array[i12] & 63);
                    if (!isValidCodePoint(i14)) {
                        malformedCodePoint(i14);
                        throw new KotlinNothingValueException();
                    }
                    if (i5 - i6 >= 2) {
                        char highSurrogate = (char) highSurrogate(i14);
                        char lowSurrogate = (char) lowSurrogate(i14);
                        if (!function1.invoke(Character.valueOf(highSurrogate)).booleanValue() || !function1.invoke(Character.valueOf(lowSurrogate)).booleanValue()) {
                            byteBuffer.position((i13 - 4) - byteBuffer.arrayOffset());
                            return decodeUtf8Result(i6 - i, -1);
                        }
                        int i15 = i6 + 1;
                        cArr[i6] = highSurrogate;
                        i6 = i15 + 1;
                        cArr[i15] = lowSurrogate;
                        arrayOffset = i13;
                    } else {
                        byteBuffer.position((i13 - 4) - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i6 - i, 0);
                    }
                }
                i6 = i4;
                arrayOffset = i3;
            }
        }
        byteBuffer.position(arrayOffset - byteBuffer.arrayOffset());
        return decodeUtf8Result(i6 - i, 0);
    }

    private static final long decodeUTF8_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2, Function1<? super Character, Boolean> function1) {
        int i3;
        int i4 = i + i2;
        if (i4 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i5 = i;
        while (byteBuffer.hasRemaining() && i5 < i4) {
            byte b = byteBuffer.get();
            if (b >= 0) {
                char c = (char) b;
                if (!function1.invoke(Character.valueOf(c)).booleanValue()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i5 - i, -1);
                }
                i3 = i5 + 1;
                cArr[i5] = c;
            } else if ((b & 224) == 192) {
                if (!byteBuffer.hasRemaining()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i5 - i, 2);
                }
                char c2 = (char) (((b & Ascii.US) << 6) | (byteBuffer.get() & 63));
                if (!function1.invoke(Character.valueOf(c2)).booleanValue()) {
                    byteBuffer.position(byteBuffer.position() - 2);
                    return decodeUtf8Result(i5 - i, -1);
                }
                i3 = i5 + 1;
                cArr[i5] = c2;
            } else if ((b & 240) == 224) {
                if (byteBuffer.remaining() < 2) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i5 - i, 3);
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                int i6 = b & Ascii.SI;
                int i7 = ((b2 & 63) << 6) | (i6 << 12) | (b3 & 63);
                if (i6 == 0 || isBmpCodePoint(i7)) {
                    char c3 = (char) i7;
                    if (!function1.invoke(Character.valueOf(c3)).booleanValue()) {
                        byteBuffer.position(byteBuffer.position() - 3);
                        return decodeUtf8Result(i5 - i, -1);
                    }
                    i3 = i5 + 1;
                    cArr[i5] = c3;
                } else {
                    malformedCodePoint(i7);
                    throw new KotlinNothingValueException();
                }
            } else if ((b & 248) == 240) {
                if (byteBuffer.remaining() < 3) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i5 - i, 4);
                }
                int i8 = ((b & 7) << 18) | ((byteBuffer.get() & 63) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63);
                if (!isValidCodePoint(i8)) {
                    malformedCodePoint(i8);
                    throw new KotlinNothingValueException();
                }
                if (i4 - i5 >= 2) {
                    char highSurrogate = (char) highSurrogate(i8);
                    char lowSurrogate = (char) lowSurrogate(i8);
                    if (!function1.invoke(Character.valueOf(highSurrogate)).booleanValue() || !function1.invoke(Character.valueOf(lowSurrogate)).booleanValue()) {
                        byteBuffer.position(byteBuffer.position() - 4);
                        return decodeUtf8Result(i5 - i, -1);
                    }
                    int i9 = i5 + 1;
                    cArr[i5] = highSurrogate;
                    i5 = i9 + 1;
                    cArr[i9] = lowSurrogate;
                } else {
                    byteBuffer.position(byteBuffer.position() - 4);
                    return decodeUtf8Result(i5 - i, 0);
                }
            } else {
                unsupportedByteCount(b);
                throw new KotlinNothingValueException();
            }
            i5 = i3;
        }
        return decodeUtf8Result(i5 - i, 0);
    }

    private static final Throwable indexOutOfBounds(int i, int i2, int i3) {
        return new IndexOutOfBoundsException(i + " (offset) + " + i2 + " (length) > " + i3 + " (array.length)");
    }

    private static final Void malformedCodePoint(int i) {
        throw new IllegalArgumentException("Malformed code-point " + Integer.toHexString(i) + " found");
    }

    private static final Void unsupportedByteCount(byte b) {
        StringBuilder sb = new StringBuilder("Unsupported byte code, first byte is 0x");
        String num = Integer.toString(b & 255, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        throw new IllegalStateException(sb.append(kotlin.text.StringsKt.padStart(num, 2, '0')).toString().toString());
    }

    private static final long decodeUTF8Line_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2) {
        long decodeUtf8Result;
        boolean z;
        int i3;
        boolean z2;
        long decodeUtf8Result2;
        char c;
        boolean z3;
        boolean z4;
        boolean z5;
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining() + arrayOffset;
        if (!(arrayOffset <= remaining)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(remaining <= array.length)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i4 = i + i2;
        if (i4 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i5 = i;
        boolean z6 = false;
        while (arrayOffset < remaining && i5 < i4) {
            int i6 = arrayOffset + 1;
            byte b = array[arrayOffset];
            if (b >= 0) {
                char c2 = (char) b;
                if (c2 == '\r') {
                    z6 = true;
                    z = true;
                } else {
                    if (c2 == '\n') {
                        z6 = false;
                    } else if (!z6) {
                        z = true;
                    }
                    z = false;
                }
                if (!z) {
                    byteBuffer.position((i6 - 1) - byteBuffer.arrayOffset());
                    decodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                    break;
                }
                i3 = i5 + 1;
                cArr[i5] = c2;
                i5 = i3;
                arrayOffset = i6;
            } else if ((b & 224) == 192) {
                if (i6 >= remaining) {
                    byteBuffer.position((i6 - 1) - byteBuffer.arrayOffset());
                    decodeUtf8Result = decodeUtf8Result(i5 - i, 2);
                    break;
                }
                int i7 = i6 + 1;
                char c3 = (char) (((b & Ascii.US) << 6) | (array[i6] & 63));
                if (c3 == '\r') {
                    z6 = true;
                    z5 = true;
                } else {
                    if (c3 == '\n') {
                        z6 = false;
                    } else if (!z6) {
                        z5 = true;
                    }
                    z5 = false;
                }
                if (!z5) {
                    byteBuffer.position((i7 - 2) - byteBuffer.arrayOffset());
                    decodeUtf8Result2 = decodeUtf8Result(i5 - i, -1);
                    decodeUtf8Result = decodeUtf8Result2;
                    break;
                }
                cArr[i5] = c3;
                arrayOffset = i7;
                i5++;
            } else {
                if ((b & 240) != 224) {
                    if ((b & 248) != 240) {
                        unsupportedByteCount(b);
                        throw new KotlinNothingValueException();
                    }
                    if (remaining - i6 < 3) {
                        byteBuffer.position((i6 - 1) - byteBuffer.arrayOffset());
                        decodeUtf8Result = decodeUtf8Result(i5 - i, 4);
                        break;
                    }
                    int i8 = i6 + 1;
                    byte b2 = array[i6];
                    int i9 = i8 + 1;
                    int i10 = i9 + 1;
                    int i11 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((array[i8] & 63) << 6) | (array[i9] & 63);
                    if (!isValidCodePoint(i11)) {
                        malformedCodePoint(i11);
                        throw new KotlinNothingValueException();
                    }
                    if (i4 - i5 >= 2) {
                        char highSurrogate = (char) highSurrogate(i11);
                        char lowSurrogate = (char) lowSurrogate(i11);
                        if (highSurrogate == '\r') {
                            z6 = true;
                            z3 = true;
                            c = '\n';
                        } else {
                            c = '\n';
                            if (highSurrogate == '\n') {
                                z6 = false;
                            } else if (!z6) {
                                z3 = true;
                            }
                            z3 = false;
                        }
                        if (z3) {
                            if (lowSurrogate == '\r') {
                                z6 = true;
                                z4 = true;
                            } else {
                                if (lowSurrogate == c) {
                                    z6 = false;
                                } else if (!z6) {
                                    z4 = true;
                                }
                                z4 = false;
                            }
                            if (z4) {
                                int i12 = i5 + 1;
                                cArr[i5] = highSurrogate;
                                i5 = i12 + 1;
                                cArr[i12] = lowSurrogate;
                                arrayOffset = i10;
                            }
                        }
                        byteBuffer.position((i10 - 4) - byteBuffer.arrayOffset());
                        decodeUtf8Result2 = decodeUtf8Result(i5 - i, -1);
                        decodeUtf8Result = decodeUtf8Result2;
                        break;
                    }
                    byteBuffer.position((i10 - 4) - byteBuffer.arrayOffset());
                    decodeUtf8Result = decodeUtf8Result(i5 - i, 0);
                    break;
                }
                if (remaining - i6 < 2) {
                    byteBuffer.position((i6 - 1) - byteBuffer.arrayOffset());
                    decodeUtf8Result = decodeUtf8Result(i5 - i, 3);
                    break;
                }
                int i13 = i6 + 1;
                byte b3 = array[i6];
                i6 = i13 + 1;
                byte b4 = array[i13];
                int i14 = b & Ascii.SI;
                int i15 = (b4 & 63) | ((b3 & 63) << 6) | (i14 << 12);
                if (i14 != 0 && !isBmpCodePoint(i15)) {
                    malformedCodePoint(i15);
                    throw new KotlinNothingValueException();
                }
                char c4 = (char) i15;
                if (c4 == '\r') {
                    z2 = true;
                    z6 = true;
                } else if (c4 == '\n') {
                    z2 = false;
                    z6 = false;
                } else {
                    z2 = !z6;
                }
                if (!z2) {
                    byteBuffer.position((i6 - 4) - byteBuffer.arrayOffset());
                    decodeUtf8Result2 = decodeUtf8Result(i5 - i, -1);
                    decodeUtf8Result = decodeUtf8Result2;
                    break;
                }
                i3 = i5 + 1;
                cArr[i5] = c4;
                i5 = i3;
                arrayOffset = i6;
            }
        }
        byteBuffer.position(arrayOffset - byteBuffer.arrayOffset());
        decodeUtf8Result = decodeUtf8Result(i5 - i, 0);
        int i16 = (int) (4294967295L & decodeUtf8Result);
        if (i16 == -1) {
            int i17 = (int) (decodeUtf8Result >> 32);
            if (z6) {
                return decodeUtf8Result(i17 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i17 > 0) {
                int i18 = i17 - 1;
                if (cArr[i18] == '\r') {
                    return decodeUtf8Result(i18, -1);
                }
            }
        } else if (i16 == 0 && z6) {
            int i19 = (int) (decodeUtf8Result >> 32);
            byteBuffer.position(byteBuffer.position() - 1);
            return decodeUtf8Result(i19 - 1, 2);
        }
        return decodeUtf8Result;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long decodeUTF8Line_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2) {
        long decodeUtf8Result;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4 = i + i2;
        if (i4 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i5 = i;
        boolean z6 = false;
        while (byteBuffer.hasRemaining() && i5 < i4) {
            byte b = byteBuffer.get();
            if (b >= 0) {
                char c = (char) b;
                if (c == '\r') {
                    z6 = true;
                } else if (c == '\n') {
                    z6 = false;
                } else {
                    z = !z6;
                    if (z) {
                        byteBuffer.position(byteBuffer.position() - 1);
                        decodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                        break;
                    }
                    i3 = i5 + 1;
                    cArr[i5] = c;
                    i5 = i3;
                }
                z = z6;
                if (z) {
                }
            } else if ((b & 224) == 192) {
                if (!byteBuffer.hasRemaining()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    decodeUtf8Result = decodeUtf8Result(i5 - i, 2);
                    break;
                }
                char c2 = (char) (((b & Ascii.US) << 6) | (byteBuffer.get() & 63));
                if (c2 == '\r') {
                    z6 = true;
                } else if (c2 == '\n') {
                    z6 = false;
                } else {
                    z2 = !z6;
                    if (z2) {
                        byteBuffer.position(byteBuffer.position() - 2);
                        decodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                        break;
                    }
                    i3 = i5 + 1;
                    cArr[i5] = c2;
                    i5 = i3;
                }
                z2 = z6;
                if (z2) {
                }
            } else {
                if ((b & 240) != 224) {
                    if ((b & 248) == 240) {
                        if (byteBuffer.remaining() < 3) {
                            byteBuffer.position(byteBuffer.position() - 1);
                            decodeUtf8Result = decodeUtf8Result(i5 - i, 4);
                            break;
                        }
                        int i6 = ((b & 7) << 18) | ((byteBuffer.get() & 63) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63);
                        if (!isValidCodePoint(i6)) {
                            malformedCodePoint(i6);
                            throw new KotlinNothingValueException();
                        }
                        if (i4 - i5 >= 2) {
                            char highSurrogate = (char) highSurrogate(i6);
                            char lowSurrogate = (char) lowSurrogate(i6);
                            if (highSurrogate != '\r') {
                                if (highSurrogate != '\n') {
                                    z4 = !z6;
                                    if (z4) {
                                        if (lowSurrogate == '\r') {
                                            z6 = true;
                                        } else if (lowSurrogate == '\n') {
                                            z6 = false;
                                        } else {
                                            z5 = !z6;
                                            if (!z5) {
                                                int i7 = i5 + 1;
                                                cArr[i5] = highSurrogate;
                                                i5 = i7 + 1;
                                                cArr[i7] = lowSurrogate;
                                            }
                                        }
                                        z5 = z6;
                                        if (!z5) {
                                        }
                                    }
                                    byteBuffer.position(byteBuffer.position() - 4);
                                    decodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                                    break;
                                }
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            z4 = z6;
                            if (z4) {
                            }
                            byteBuffer.position(byteBuffer.position() - 4);
                            decodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                            break;
                        }
                        byteBuffer.position(byteBuffer.position() - 4);
                        decodeUtf8Result = decodeUtf8Result(i5 - i, 0);
                        break;
                    }
                    unsupportedByteCount(b);
                    throw new KotlinNothingValueException();
                }
                if (byteBuffer.remaining() < 2) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    decodeUtf8Result = decodeUtf8Result(i5 - i, 3);
                    break;
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                int i8 = b & Ascii.SI;
                int i9 = (i8 << 12) | ((b2 & 63) << 6) | (b3 & 63);
                if (i8 != 0 && !isBmpCodePoint(i9)) {
                    malformedCodePoint(i9);
                    throw new KotlinNothingValueException();
                }
                char c3 = (char) i9;
                if (c3 == '\r') {
                    z6 = true;
                } else if (c3 == '\n') {
                    z6 = false;
                } else {
                    z3 = !z6;
                    if (z3) {
                        byteBuffer.position(byteBuffer.position() - 3);
                        decodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                        break;
                    }
                    i3 = i5 + 1;
                    cArr[i5] = c3;
                    i5 = i3;
                }
                z3 = z6;
                if (z3) {
                }
            }
        }
        decodeUtf8Result = decodeUtf8Result(i5 - i, 0);
        int i10 = (int) (4294967295L & decodeUtf8Result);
        if (i10 == -1) {
            int i11 = (int) (decodeUtf8Result >> 32);
            if (z6) {
                return decodeUtf8Result(i11 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (cArr[i12] == '\r') {
                    return decodeUtf8Result(i12, -1);
                }
            }
        } else if (i10 == 0 && z6) {
            int i13 = (int) (decodeUtf8Result >> 32);
            byteBuffer.position(byteBuffer.position() - 1);
            return decodeUtf8Result(i13 - 1, 2);
        }
        return decodeUtf8Result;
    }
}
