package io.ktor.utils.io.core;

import io.ktor.http.ContentDisposition;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.charsets.EncodingKt;
import io.ktor.utils.io.core.internal.CharArraySequence;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.EncodeResult;
import io.ktor.utils.io.core.internal.UTF8Kt;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;

/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\r\u0010\t\u001a\u00020\n*\u00020\u000bH\u0082\b\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u001a\n\u0010\f\u001a\u00020\r*\u00020\u0010\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003\u001a\u001e\u0010\u0011\u001a\u00020\r*\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u001a\"\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u001a\"\u0010\u0014\u001a\u00020\u0015*\u00020\u00102\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u001a\"\u0010\u0014\u001a\u00020\u0015*\u00020\u00102\n\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u0007\u001a.\u0010\u0014\u001a\u00020\u0003*\u00020\u00102\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u001a\"\u0010 \u001a\u00020\u0015*\u00020\u00102\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u000f\u001a\u00020\u0003H\u0007\u001a\"\u0010!\u001a\u00020\u0015*\u00020\u00102\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\"\u001a\u00020\u0003H\u0007\u001a \u0010!\u001a\u00020\u0015*\u00020\u00102\u0006\u0010#\u001a\u00020\u00032\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019\u001a \u0010$\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\b\u001a\u00020\u00032\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019\u001a \u0010%\u001a\u0004\u0018\u00010\u0015*\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a \u0010%\u001a\u0004\u0018\u00010\u0015*\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u001e\u0010'\u001a\u00020\n*\u00020\u00102\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010(\u001a\u00020\u0015*\u00020\u00102\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a$\u0010*\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u001d\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a(\u0010*\u001a\u00020\u0003*\u00020\u00102\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a,\u0010,\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u001d\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a0\u0010,\u001a\u00020\u0003*\u00020\u00102\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a$\u0010.\u001a\u00020\u0003*\u00020\u00102\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020+H\u0002\u001a\u001b\u0010/\u001a\u00020\r*\u00020\u00152\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0086\b\u001a4\u00100\u001a\u000201*\u00020+2\u0006\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019\u001a4\u00100\u001a\u000201*\u00020+2\u0006\u00102\u001a\u0002062\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019\u001a$\u00107\u001a\u000201*\u00020+2\u0006\u00102\u001a\u0002062\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003H\u0002¨\u00068"}, d2 = {"bufferLimitExceeded", "", "limit", "", "prematureEndOfStream", ContentDisposition.Parameters.Size, "", "prematureEndOfStreamToReadChars", "charactersCount", "isAsciiChar", "", "", "readBytes", "", "Lio/ktor/utils/io/core/ByteReadPacket;", "n", "Lio/ktor/utils/io/core/Input;", "readBytesOf", "min", "max", "readText", "", "Lio/ktor/utils/io/core/Buffer;", HttpAuthHeader.Parameters.Charset, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "decoder", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "readTextExact", "readTextExactBytes", "bytes", "bytesCount", "readTextExactCharacters", "readUTF8Line", "estimate", "readUTF8LineTo", "readUTF8UntilDelimiter", "delimiters", "readUTF8UntilDelimiterTo", "Lio/ktor/utils/io/core/Output;", "readUTF8UntilDelimiterToSlowUtf8", "decoded0", "readUTFUntilDelimiterToSlowAscii", "toByteArray", "writeText", "", "text", "", "fromIndex", "toIndex", "", "writeTextUtf8", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringsKt {
    private static final boolean isAsciiChar(char c) {
        return c <= 127;
    }

    public static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return kotlin.text.StringsKt.encodeToByteArray(str);
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
        return CharsetJVMKt.encodeToByteArray(newEncoder, str, 0, str.length());
    }

    public static final byte[] toByteArray(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return kotlin.text.StringsKt.encodeToByteArray(str);
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
        return CharsetJVMKt.encodeToByteArray(newEncoder, str, 0, str.length());
    }

    public static /* synthetic */ String readUTF8Line$default(ByteReadPacket byteReadPacket, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 16;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return readUTF8Line(byteReadPacket, i, i2);
    }

    public static /* synthetic */ String readUTF8Line$default(Input input, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 16;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return readUTF8Line(input, i, i2);
    }

    public static final String readUTF8Line(Input input, int i, int i2) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        StringBuilder sb = new StringBuilder(i);
        if (readUTF8LineTo(input, sb, i2)) {
            return sb.toString();
        }
        return null;
    }

    public static /* synthetic */ String readUTF8UntilDelimiter$default(Input input, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiter(input, str, i);
    }

    public static final String readUTF8UntilDelimiter(Input input, String delimiters, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        StringBuilder sb = new StringBuilder();
        readUTF8UntilDelimiterTo(input, sb, delimiters, i);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ int readUTF8UntilDelimiterTo$default(Input input, Appendable appendable, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiterTo(input, appendable, str, i);
    }

    public static /* synthetic */ int readUTF8UntilDelimiterTo$default(Input input, Output output, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiterTo(input, output, str, i);
    }

    public static final int readUTF8UntilDelimiterTo(Input input, Output out, String delimiters, int i) {
        long readUntilDelimiters;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        int length = delimiters.length();
        if (length == 1) {
            if (delimiters.charAt(0) <= 127) {
                readUntilDelimiters = ScannerKt.readUntilDelimiter(input, (byte) delimiters.charAt(0), out);
                return (int) readUntilDelimiters;
            }
        }
        if (length == 2) {
            if (delimiters.charAt(0) <= 127) {
                if (delimiters.charAt(1) <= 127) {
                    readUntilDelimiters = ScannerKt.readUntilDelimiters(input, (byte) delimiters.charAt(0), (byte) delimiters.charAt(1), out);
                    return (int) readUntilDelimiters;
                }
            }
        }
        return readUTFUntilDelimiterToSlowAscii(input, delimiters, i, out);
    }

    public static /* synthetic */ byte[] readBytes$default(ByteReadPacket byteReadPacket, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            long remaining = byteReadPacket.getRemaining();
            if (remaining > 2147483647L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i = (int) remaining;
        }
        return readBytes(byteReadPacket, i);
    }

    public static final byte[] readBytes(ByteReadPacket byteReadPacket, int i) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        if (i != 0) {
            byte[] bArr = new byte[i];
            InputArraysKt.readFully((Input) byteReadPacket, bArr, 0, i);
            return bArr;
        }
        return UnsafeKt.EmptyByteArray;
    }

    public static final byte[] readBytes(Input input, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return readBytesOf(input, i, i);
    }

    public static final byte[] readBytes(Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return readBytesOf$default(input, 0, 0, 3, null);
    }

    public static /* synthetic */ byte[] readBytesOf$default(Input input, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return readBytesOf(input, i, i2);
    }

    public static final byte[] readBytesOf(Input input, int i, int i2) {
        int readAvailable;
        Intrinsics.checkNotNullParameter(input, "<this>");
        if (i == i2 && i == 0) {
            return UnsafeKt.EmptyByteArray;
        }
        int i3 = 0;
        if (i == i2) {
            byte[] bArr = new byte[i];
            InputArraysKt.readFully(input, bArr, 0, i);
            return bArr;
        }
        byte[] bArr2 = new byte[(int) RangesKt.coerceAtLeast(RangesKt.coerceAtMost(i2, EncodingKt.sizeEstimate(input)), i)];
        while (i3 < i2 && (readAvailable = InputArraysKt.readAvailable(input, bArr2, i3, Math.min(i2, bArr2.length) - i3)) > 0) {
            i3 += readAvailable;
            if (bArr2.length == i3) {
                bArr2 = Arrays.copyOf(bArr2, i3 * 2);
                Intrinsics.checkNotNullExpressionValue(bArr2, "copyOf(this, newSize)");
            }
        }
        if (i3 < i) {
            throw new EOFException("Not enough bytes available to read " + i + " bytes: " + (i - i3) + " more required");
        }
        if (i3 == bArr2.length) {
            return bArr2;
        }
        byte[] copyOf = Arrays.copyOf(bArr2, i3);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ int readText$default(Input input, Appendable appendable, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(input, appendable, charset, i);
    }

    public static final int readText(Input input, Appendable out, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "newDecoder(...)");
        return CharsetJVMKt.decode(newDecoder, input, out, i);
    }

    public static /* synthetic */ String readText$default(Input input, CharsetDecoder charsetDecoder, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(input, charsetDecoder, i);
    }

    @Deprecated(message = "Use CharsetDecoder.decode instead", replaceWith = @ReplaceWith(expression = "decoder.decode(this, max)", imports = {"io.ktor.utils.io.charsets.decode"}))
    public static final String readText(Input input, CharsetDecoder decoder, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return EncodingKt.decode(decoder, input, i);
    }

    public static /* synthetic */ String readText$default(Input input, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(input, charset, i);
    }

    public static final String readText(Input input, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "newDecoder(...)");
        return EncodingKt.decode(newDecoder, input, i);
    }

    public static final String readText(Buffer buffer, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "newDecoder(...)");
        CharsetJVMKt.decodeBuffer(newDecoder, buffer, sb, true, i);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String readText$default(Buffer buffer, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(buffer, charset, i);
    }

    public static /* synthetic */ String readTextExact$default(Input input, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExact(input, charset, i);
    }

    @Deprecated(message = "Use readTextExactCharacters instead.", replaceWith = @ReplaceWith(expression = "readTextExactCharacters(n, charset)", imports = {}))
    public static final String readTextExact(Input input, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readTextExactCharacters(input, i, charset);
    }

    public static /* synthetic */ String readTextExactCharacters$default(Input input, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExactCharacters(input, i, charset);
    }

    public static final String readTextExactCharacters(Input input, int i, Charset charset) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String readText = readText(input, charset, i);
        if (readText.length() >= i) {
            return readText;
        }
        prematureEndOfStreamToReadChars(i);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ String readTextExactBytes$default(Input input, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExactBytes(input, charset, i);
    }

    @Deprecated(message = "Parameters order is changed.", replaceWith = @ReplaceWith(expression = "readTextExactBytes(bytes, charset)", imports = {}))
    public static final String readTextExactBytes(Input input, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readTextExactBytes(input, i, charset);
    }

    public static /* synthetic */ String readTextExactBytes$default(Input input, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExactBytes(input, i, charset);
    }

    public static final String readTextExactBytes(Input input, int i, Charset charset) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "newDecoder(...)");
        return CharsetJVMKt.decodeExactBytes(newDecoder, input, i);
    }

    public static /* synthetic */ void writeText$default(Output output, CharSequence charSequence, int i, int i2, Charset charset, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        if ((i3 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(output, charSequence, i, i2, charset);
    }

    public static final void writeText(Output output, CharSequence text, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == Charsets.UTF_8) {
            writeTextUtf8(output, text, i, i2);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
        EncodingKt.encodeToImpl(newEncoder, output, text, i, i2);
    }

    public static /* synthetic */ void writeText$default(Output output, char[] cArr, int i, int i2, Charset charset, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        if ((i3 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(output, cArr, i, i2, charset);
    }

    public static final void writeText(Output output, char[] text, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == Charsets.UTF_8) {
            writeTextUtf8(output, new CharArraySequence(text, 0, text.length), i, i2);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
        EncodingKt.encode(newEncoder, text, i, i2, output);
    }

    private static final Void bufferLimitExceeded(int i) {
        throw new BufferLimitExceededException("Too many characters before delimiter: limit " + i + " exceeded");
    }

    public static final Void prematureEndOfStream(int i) {
        throw new EOFException("Premature end of stream: expected " + i + " bytes");
    }

    public static final Void prematureEndOfStream(long j) {
        throw new EOFException("Premature end of stream: expected " + j + " bytes");
    }

    private static final Void prematureEndOfStreamToReadChars(int i) {
        throw new EOFException("Not enough input bytes to read " + i + " characters.");
    }

    public static final String readUTF8Line(ByteReadPacket byteReadPacket, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        if (byteReadPacket.getEndOfInput()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(i);
        if (readUTF8LineTo(byteReadPacket, sb, i2)) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x015e, code lost:
    
        r6.discardExact(((r13 - r11) - r16) + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e1, code lost:
    
        if (r3 == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01e3, code lost:
    
        io.ktor.utils.io.core.internal.UnsafeKt.completeReadHead(r20, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e6, code lost:
    
        r3 = r9;
        r5 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x012d A[Catch: all -> 0x01a5, TryCatch #2 {all -> 0x01a5, blocks: (B:45:0x002e, B:47:0x0046, B:50:0x0058, B:56:0x0079, B:59:0x018a, B:64:0x0191, B:67:0x017a, B:75:0x0071, B:77:0x0083, B:78:0x008b, B:80:0x008c, B:81:0x0094, B:86:0x009e, B:88:0x00a2, B:90:0x00ab, B:95:0x00b1, B:97:0x00bf, B:99:0x00c9, B:101:0x00cf, B:109:0x00f0, B:117:0x00e8, B:119:0x00f9, B:120:0x0101, B:121:0x0102, B:123:0x0108, B:128:0x012d, B:143:0x014a, B:145:0x0155, B:146:0x015d, B:135:0x015e, B:155:0x0125, B:157:0x0168, B:158:0x0170, B:160:0x0171, B:161:0x0179, B:164:0x0181), top: B:44:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x015e A[EDGE_INSN: B:147:0x015e->B:135:0x015e BREAK  A[LOOP:1: B:46:0x0044->B:67:0x017a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean readUTF8LineTo(Input input, Appendable out, int i) {
        int i2;
        ChunkBuffer chunkBuffer;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChunkBuffer prepareReadNextHead;
        int i4;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        int i5 = 1;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            i4 = 1;
            i2 = 0;
        } else {
            int i6 = 1;
            int i7 = 1;
            boolean z5 = false;
            i2 = 0;
            boolean z6 = false;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i6) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            ByteBuffer memory = chunkBuffer2.getMemory();
                            int readPosition = chunkBuffer2.getReadPosition();
                            int writePosition2 = chunkBuffer2.getWritePosition();
                            int i8 = readPosition;
                            int i9 = 0;
                            int i10 = 0;
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                if (i8 >= writePosition2) {
                                    chunkBuffer2.discardExact(writePosition2 - readPosition);
                                    i3 = i12;
                                    i7 = 0;
                                    break;
                                }
                                int i13 = memory.get(i8) & 255;
                                ByteBuffer byteBuffer = memory;
                                if ((i13 & 128) != 0) {
                                    if (i9 == 0) {
                                        int i14 = 128;
                                        i10 = i13;
                                        for (int i15 = 1; i15 < 7 && (i10 & i14) != 0; i15++) {
                                            i10 &= ~i14;
                                            i14 >>= 1;
                                            i9++;
                                        }
                                        int i16 = i9 - 1;
                                        if (i9 > writePosition2 - i8) {
                                            chunkBuffer2.discardExact(i8 - readPosition);
                                            i7 = i9;
                                            i3 = i12;
                                            break;
                                        }
                                        i11 = i9;
                                        i9 = i16;
                                    } else {
                                        i10 = (i10 << 6) | (i13 & 127);
                                        i9--;
                                        if (i9 != 0) {
                                            continue;
                                        } else if (UTF8Kt.isBmpCodePoint(i10)) {
                                            char c = (char) i10;
                                            if (c == '\r') {
                                                if (!z5) {
                                                    z3 = true;
                                                    z5 = true;
                                                    if (!z3) {
                                                        chunkBuffer2.discardExact(((i8 - readPosition) - i11) + 1);
                                                        break;
                                                    }
                                                    i10 = 0;
                                                }
                                                z3 = false;
                                                z6 = true;
                                                if (!z3) {
                                                }
                                                i10 = 0;
                                            } else {
                                                if (c == '\n') {
                                                    z3 = false;
                                                    z6 = true;
                                                    i12 = 1;
                                                } else if (z5) {
                                                    z3 = false;
                                                    z6 = true;
                                                } else {
                                                    if (i2 == i) {
                                                        bufferLimitExceeded(i);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    i2++;
                                                    out.append(c);
                                                    z3 = true;
                                                }
                                                if (!z3) {
                                                }
                                                i10 = 0;
                                            }
                                        } else {
                                            if (!UTF8Kt.isValidCodePoint(i10)) {
                                                UTF8Kt.malformedCodePoint(i10);
                                                throw new KotlinNothingValueException();
                                            }
                                            char highSurrogate = (char) UTF8Kt.highSurrogate(i10);
                                            if (highSurrogate == '\r') {
                                                if (!z5) {
                                                    z = true;
                                                    z5 = true;
                                                    if (!z) {
                                                        break;
                                                    }
                                                    char lowSurrogate = (char) UTF8Kt.lowSurrogate(i10);
                                                    if (lowSurrogate == '\r') {
                                                        if (!z5) {
                                                            z2 = true;
                                                            z5 = true;
                                                            if (!z2) {
                                                                break;
                                                            }
                                                            i10 = 0;
                                                        }
                                                        z2 = false;
                                                        z6 = true;
                                                        if (!z2) {
                                                        }
                                                        i10 = 0;
                                                    } else {
                                                        if (lowSurrogate == '\n') {
                                                            z2 = false;
                                                            z6 = true;
                                                            i12 = 1;
                                                        } else if (z5) {
                                                            z2 = false;
                                                            z6 = true;
                                                        } else {
                                                            if (i2 == i) {
                                                                bufferLimitExceeded(i);
                                                                throw new KotlinNothingValueException();
                                                            }
                                                            i2++;
                                                            out.append(lowSurrogate);
                                                            z2 = true;
                                                        }
                                                        if (!z2) {
                                                        }
                                                        i10 = 0;
                                                    }
                                                }
                                                z = false;
                                                z6 = true;
                                                if (!z) {
                                                }
                                            } else {
                                                if (highSurrogate == '\n') {
                                                    z = false;
                                                    z6 = true;
                                                    i12 = 1;
                                                } else if (z5) {
                                                    z = false;
                                                    z6 = true;
                                                } else {
                                                    if (i2 == i) {
                                                        bufferLimitExceeded(i);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    i2++;
                                                    out.append(highSurrogate);
                                                    z = true;
                                                }
                                                if (!z) {
                                                }
                                            }
                                        }
                                    }
                                    i8++;
                                    memory = byteBuffer;
                                } else {
                                    if (i9 != 0) {
                                        UTF8Kt.malformedByteCount(i9);
                                        throw new KotlinNothingValueException();
                                    }
                                    char c2 = (char) i13;
                                    if (c2 == '\r') {
                                        if (!z5) {
                                            z4 = true;
                                            z5 = true;
                                            if (!z4) {
                                                chunkBuffer2.discardExact(i8 - readPosition);
                                                break;
                                            }
                                            i8++;
                                            memory = byteBuffer;
                                        }
                                        z4 = false;
                                        z6 = true;
                                        if (!z4) {
                                        }
                                    } else {
                                        if (c2 == '\n') {
                                            z4 = false;
                                            z6 = true;
                                            i12 = 1;
                                        } else if (z5) {
                                            z4 = false;
                                            z6 = true;
                                        } else {
                                            if (i2 == i) {
                                                bufferLimitExceeded(i);
                                                throw new KotlinNothingValueException();
                                            }
                                            i2++;
                                            out.append(c2);
                                            z4 = true;
                                        }
                                        if (!z4) {
                                        }
                                    }
                                }
                            }
                            i3 = i12;
                            i7 = -1;
                            if (i3 > 0) {
                                chunkBuffer2.discardExact(i3);
                            }
                            i6 = z6 ? 0 : RangesKt.coerceAtLeast(i7, 1);
                            try {
                                ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                                writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                            } catch (Throwable th) {
                                th = th;
                                i5 = 1;
                                if (i5 != 0) {
                                    UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                                }
                                throw th;
                            }
                        } finally {
                            chunkBuffer = prepareReadFirstHead;
                            chunkBuffer.getWritePosition();
                            chunkBuffer.getReadPosition();
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            i5 = 0;
                            if (i5 != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i6) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i6);
                    }
                    if (prepareReadNextHead == null) {
                        i5 = 0;
                        break;
                    }
                    prepareReadFirstHead = prepareReadNextHead;
                    i5 = 1;
                    if (i6 <= 0) {
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (i5 > i4) {
            prematureEndOfStream(i5);
            throw new KotlinNothingValueException();
        }
        if (i2 > 0 || !input.getEndOfInput()) {
            return i4;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0064, code lost:
    
        bufferLimitExceeded(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int readUTF8UntilDelimiterTo(Input input, Appendable out, String delimiters, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        boolean z5 = false;
        if (prepareReadFirstHead == null) {
            i2 = 0;
        } else {
            i2 = 0;
            boolean z6 = false;
            loop0: while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    ByteBuffer memory = chunkBuffer.getMemory();
                    int readPosition = chunkBuffer.getReadPosition();
                    int writePosition = chunkBuffer.getWritePosition();
                    for (int i3 = readPosition; i3 < writePosition; i3++) {
                        int i4 = memory.get(i3) & 255;
                        if ((i4 & 128) != 128) {
                            char c = (char) i4;
                            boolean z7 = z6;
                            if (!kotlin.text.StringsKt.contains$default((CharSequence) delimiters, c, false, 2, (Object) null)) {
                                if (i2 == i) {
                                    break loop0;
                                }
                                i2++;
                                out.append(c);
                                z6 = z7;
                                z4 = true;
                            } else {
                                z4 = false;
                                z6 = true;
                            }
                            if (z4) {
                            }
                        }
                        chunkBuffer.discardExact(i3 - readPosition);
                        z2 = false;
                        break;
                    }
                    boolean z8 = z6;
                    chunkBuffer.discardExact(writePosition - readPosition);
                    z6 = z8;
                    z2 = true;
                    if (!z2) {
                        z3 = true;
                        break;
                    }
                    try {
                        ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        if (prepareReadNextHead == null) {
                            z3 = false;
                            break;
                        }
                        prepareReadFirstHead = prepareReadNextHead;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
            if (z3) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
            z5 = z6;
        }
        return !z5 ? readUTF8UntilDelimiterToSlowUtf8(input, out, delimiters, i, i2) : i2;
    }

    private static final void writeTextUtf8(Output output, CharSequence charSequence, int i, int i2) {
        ChunkBuffer prepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                ChunkBuffer chunkBuffer = prepareWriteHead;
                int m578encodeUTF8lBXzO7A = UTF8Kt.m578encodeUTF8lBXzO7A(chunkBuffer.getMemory(), charSequence, i, i2, chunkBuffer.getWritePosition(), chunkBuffer.getLimit());
                short m567component1Mh2AYeg = EncodeResult.m567component1Mh2AYeg(m578encodeUTF8lBXzO7A);
                short m568component2Mh2AYeg = EncodeResult.m568component2Mh2AYeg(m578encodeUTF8lBXzO7A);
                int i3 = m567component1Mh2AYeg & UShort.MAX_VALUE;
                i += i3;
                chunkBuffer.commitWritten(m568component2Mh2AYeg & UShort.MAX_VALUE);
                int i4 = (i3 != 0 || i >= i2) ? i < i2 ? 1 : 0 : 8;
                if (i4 <= 0) {
                    return;
                } else {
                    prepareWriteHead = UnsafeKt.prepareWriteHead(output, i4, prepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0060, code lost:
    
        bufferLimitExceeded(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0068, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int readUTFUntilDelimiterToSlowAscii(Input input, String str, int i, Output output) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            z5 = false;
            i2 = 0;
        } else {
            i2 = 0;
            boolean z7 = false;
            loop0: while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    ByteBuffer memory = chunkBuffer.getMemory();
                    int readPosition = chunkBuffer.getReadPosition();
                    int writePosition2 = chunkBuffer.getWritePosition();
                    int i3 = readPosition;
                    while (i3 < writePosition2) {
                        int i4 = memory.get(i3) & 255;
                        if ((i4 & 128) != 128) {
                            boolean z8 = z7;
                            ByteBuffer byteBuffer = memory;
                            z2 = false;
                            if (!kotlin.text.StringsKt.contains$default((CharSequence) str, (char) i4, false, 2, (Object) null)) {
                                if (i2 == i) {
                                    break loop0;
                                }
                                i2++;
                                z7 = z8;
                                z6 = true;
                            } else {
                                z6 = false;
                                z7 = true;
                            }
                            if (z6) {
                                i3++;
                                memory = byteBuffer;
                            }
                        } else {
                            z2 = false;
                        }
                        chunkBuffer.discardExact(i3 - readPosition);
                        z3 = z2;
                        break;
                    }
                    z2 = false;
                    chunkBuffer.discardExact(writePosition2 - readPosition);
                    z7 = z7;
                    z3 = true;
                    int writePosition3 = writePosition - (chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
                    if (writePosition3 > 0) {
                        chunkBuffer.rewind(writePosition3);
                        OutputKt.writeFully(output, chunkBuffer, writePosition3);
                    }
                    if (!z3) {
                        z4 = true;
                        break;
                    }
                    try {
                        ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        if (prepareReadNextHead == null) {
                            z4 = z2;
                            break;
                        }
                        prepareReadFirstHead = prepareReadNextHead;
                    } catch (Throwable th) {
                        th = th;
                        z = z2;
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
            if (z4) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
            z5 = z7;
        }
        return (z5 || input.getEndOfInput()) ? i2 : readUTF8UntilDelimiterToSlowUtf8(input, output, str, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01cb, code lost:
    
        if (r7 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01cd, code lost:
    
        io.ktor.utils.io.core.internal.UnsafeKt.completeReadHead(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01d0, code lost:
    
        r1 = r6;
        r8 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int readUTF8UntilDelimiterToSlowUtf8(Input input, Output output, String str, int i, int i2) {
        int i3;
        ChunkBuffer chunkBuffer;
        int i4;
        int i5;
        ByteBuffer byteBuffer;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChunkBuffer prepareReadFirstHead;
        int i6;
        int i7;
        int i8;
        Input input2 = input;
        int i9 = 1;
        ChunkBuffer prepareReadFirstHead2 = UnsafeKt.prepareReadFirstHead(input2, 1);
        if (prepareReadFirstHead2 == null) {
            i3 = i2;
            i7 = 1;
            i8 = 1;
        } else {
            int i10 = 1;
            int i11 = 1;
            ChunkBuffer chunkBuffer2 = prepareReadFirstHead2;
            i3 = i2;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i10) {
                        try {
                            ChunkBuffer chunkBuffer3 = chunkBuffer2;
                            int writePosition2 = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                            ByteBuffer memory = chunkBuffer3.getMemory();
                            int readPosition = chunkBuffer3.getReadPosition();
                            int writePosition3 = chunkBuffer3.getWritePosition();
                            int i12 = readPosition;
                            int i13 = 0;
                            int i14 = 0;
                            int i15 = 0;
                            while (i12 < writePosition3) {
                                int i16 = memory.get(i12) & 255;
                                if ((i16 & 128) != 0) {
                                    byteBuffer = memory;
                                    if (i13 == 0) {
                                        int i17 = 128;
                                        i14 = i16;
                                        for (int i18 = 1; i18 < 7 && (i14 & i17) != 0; i18++) {
                                            i14 &= ~i17;
                                            i17 >>= 1;
                                            i13++;
                                        }
                                        int i19 = i13 - 1;
                                        if (i13 > writePosition3 - i12) {
                                            chunkBuffer3.discardExact(i12 - readPosition);
                                            i5 = i13;
                                            i4 = 0;
                                            break;
                                        }
                                        i15 = i13;
                                        i13 = i19;
                                    } else {
                                        i14 = (i14 << 6) | (i16 & 127);
                                        i13--;
                                        if (i13 == 0) {
                                            if (!UTF8Kt.isBmpCodePoint(i14)) {
                                                if (!UTF8Kt.isValidCodePoint(i14)) {
                                                    UTF8Kt.malformedCodePoint(i14);
                                                    throw new KotlinNothingValueException();
                                                }
                                                if (kotlin.text.StringsKt.contains$default((CharSequence) str, (char) UTF8Kt.highSurrogate(i14), false, 2, (Object) null)) {
                                                    z = false;
                                                } else {
                                                    if (i3 == i) {
                                                        bufferLimitExceeded(i);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    i3++;
                                                    z = true;
                                                }
                                                if (z) {
                                                    i4 = 0;
                                                    if (kotlin.text.StringsKt.contains$default((CharSequence) str, (char) UTF8Kt.lowSurrogate(i14), false, 2, (Object) null)) {
                                                        z2 = false;
                                                    } else {
                                                        if (i3 == i) {
                                                            bufferLimitExceeded(i);
                                                            throw new KotlinNothingValueException();
                                                        }
                                                        i3++;
                                                        z2 = true;
                                                    }
                                                    if (!z2) {
                                                    }
                                                } else {
                                                    i4 = 0;
                                                }
                                                chunkBuffer3.discardExact(((i12 - readPosition) - i15) + 1);
                                                i5 = -1;
                                                break;
                                            }
                                            if (kotlin.text.StringsKt.contains$default((CharSequence) str, (char) i14, false, 2, (Object) null)) {
                                                z3 = false;
                                            } else {
                                                if (i3 == i) {
                                                    bufferLimitExceeded(i);
                                                    throw new KotlinNothingValueException();
                                                }
                                                i3++;
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                chunkBuffer3.discardExact(((i12 - readPosition) - i15) + 1);
                                                i5 = -1;
                                                i4 = 0;
                                                break;
                                            }
                                            i4 = 0;
                                            i14 = i4;
                                        }
                                    }
                                    i12++;
                                    memory = byteBuffer;
                                } else {
                                    if (i13 != 0) {
                                        UTF8Kt.malformedByteCount(i13);
                                        throw new KotlinNothingValueException();
                                    }
                                    byteBuffer = memory;
                                    if (kotlin.text.StringsKt.contains$default((CharSequence) str, (char) i16, false, 2, (Object) null)) {
                                        z4 = false;
                                    } else {
                                        if (i3 == i) {
                                            bufferLimitExceeded(i);
                                            throw new KotlinNothingValueException();
                                        }
                                        i3++;
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        chunkBuffer3.discardExact(i12 - readPosition);
                                        i5 = -1;
                                        i4 = 0;
                                        break;
                                    }
                                    i12++;
                                    memory = byteBuffer;
                                }
                            }
                            i4 = 0;
                            chunkBuffer3.discardExact(writePosition3 - readPosition);
                            i5 = 0;
                            int writePosition4 = writePosition2 - (chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition());
                            if (writePosition4 > 0) {
                                chunkBuffer3.rewind(writePosition4);
                                OutputKt.writeFully(output, chunkBuffer3, writePosition4);
                            }
                            i10 = i5 == -1 ? i4 : RangesKt.coerceAtLeast(i5, 1);
                            try {
                                ChunkBuffer chunkBuffer4 = chunkBuffer2;
                                writePosition = chunkBuffer4.getWritePosition() - chunkBuffer4.getReadPosition();
                                i11 = i10;
                            } catch (Throwable th) {
                                th = th;
                                i9 = 1;
                                input2 = input;
                                if (i9 != 0) {
                                    UnsafeKt.completeReadHead(input2, chunkBuffer2);
                                }
                                throw th;
                            }
                        } finally {
                            chunkBuffer = chunkBuffer2;
                            chunkBuffer.getWritePosition();
                            chunkBuffer.getReadPosition();
                        }
                    } else {
                        i4 = 0;
                    }
                    if (writePosition == 0) {
                        input2 = input;
                        try {
                            prepareReadFirstHead = UnsafeKt.prepareReadNextHead(input2, chunkBuffer2);
                        } catch (Throwable th2) {
                            th = th2;
                            i9 = i4;
                            if (i9 != 0) {
                            }
                            throw th;
                        }
                    } else {
                        input2 = input;
                        if (writePosition >= i10) {
                            ChunkBuffer chunkBuffer5 = chunkBuffer2;
                            if (chunkBuffer5.getCapacity() - chunkBuffer5.getLimit() >= 8) {
                                prepareReadFirstHead = chunkBuffer2;
                            }
                        }
                        UnsafeKt.completeReadHead(input2, chunkBuffer2);
                        prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input2, i10);
                    }
                    if (prepareReadFirstHead == null) {
                        i6 = i4;
                        break;
                    }
                    chunkBuffer2 = prepareReadFirstHead;
                    if (i10 <= 0) {
                        i6 = 1;
                        break;
                    }
                    i9 = 1;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (i7 <= i8) {
            return i3;
        }
        prematureEndOfStream(i7);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01b8, code lost:
    
        if (r8 == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ba, code lost:
    
        io.ktor.utils.io.core.internal.UnsafeKt.completeReadHead(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01bd, code lost:
    
        r1 = r7;
        r8 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int readUTF8UntilDelimiterToSlowUtf8(Input input, Appendable appendable, String str, int i, int i2) {
        int i3;
        ChunkBuffer chunkBuffer;
        int i4;
        int i5;
        int i6;
        ByteBuffer byteBuffer;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChunkBuffer prepareReadFirstHead;
        int i7;
        int i8;
        int i9;
        Input input2 = input;
        int i10 = 1;
        ChunkBuffer prepareReadFirstHead2 = UnsafeKt.prepareReadFirstHead(input2, 1);
        if (prepareReadFirstHead2 == null) {
            i3 = i2;
            i8 = 1;
            i9 = 1;
        } else {
            int i11 = 1;
            int i12 = 1;
            ChunkBuffer chunkBuffer2 = prepareReadFirstHead2;
            i3 = i2;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i11) {
                        try {
                            ChunkBuffer chunkBuffer3 = chunkBuffer2;
                            ByteBuffer memory = chunkBuffer3.getMemory();
                            int readPosition = chunkBuffer3.getReadPosition();
                            int writePosition2 = chunkBuffer3.getWritePosition();
                            int i13 = readPosition;
                            int i14 = 0;
                            int i15 = 0;
                            int i16 = 0;
                            while (i13 < writePosition2) {
                                int i17 = memory.get(i13) & 255;
                                if ((i17 & 128) != 0) {
                                    byteBuffer = memory;
                                    if (i14 == 0) {
                                        int i18 = 128;
                                        i15 = i17;
                                        for (int i19 = 1; i19 < 7 && (i15 & i18) != 0; i19++) {
                                            i15 &= ~i18;
                                            i18 >>= 1;
                                            i14++;
                                        }
                                        int i20 = i14 - 1;
                                        if (i14 > writePosition2 - i13) {
                                            chunkBuffer3.discardExact(i13 - readPosition);
                                            i5 = i14;
                                            i6 = -1;
                                            i4 = 0;
                                            break;
                                        }
                                        i16 = i14;
                                        i14 = i20;
                                    } else {
                                        i15 = (i15 << 6) | (i17 & 127);
                                        i14--;
                                        if (i14 == 0) {
                                            if (!UTF8Kt.isBmpCodePoint(i15)) {
                                                if (!UTF8Kt.isValidCodePoint(i15)) {
                                                    UTF8Kt.malformedCodePoint(i15);
                                                    throw new KotlinNothingValueException();
                                                }
                                                char highSurrogate = (char) UTF8Kt.highSurrogate(i15);
                                                if (kotlin.text.StringsKt.contains$default((CharSequence) str, highSurrogate, false, 2, (Object) null)) {
                                                    z = false;
                                                } else {
                                                    if (i3 == i) {
                                                        bufferLimitExceeded(i);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    i3++;
                                                    appendable.append(highSurrogate);
                                                    z = true;
                                                }
                                                if (z) {
                                                    char lowSurrogate = (char) UTF8Kt.lowSurrogate(i15);
                                                    i4 = 0;
                                                    if (kotlin.text.StringsKt.contains$default((CharSequence) str, lowSurrogate, false, 2, (Object) null)) {
                                                        z2 = false;
                                                    } else {
                                                        if (i3 == i) {
                                                            bufferLimitExceeded(i);
                                                            throw new KotlinNothingValueException();
                                                        }
                                                        i3++;
                                                        appendable.append(lowSurrogate);
                                                        z2 = true;
                                                    }
                                                    if (!z2) {
                                                    }
                                                } else {
                                                    i4 = 0;
                                                }
                                                chunkBuffer3.discardExact(((i13 - readPosition) - i16) + 1);
                                                i5 = -1;
                                                break;
                                            }
                                            char c = (char) i15;
                                            if (kotlin.text.StringsKt.contains$default((CharSequence) str, c, false, 2, (Object) null)) {
                                                z3 = false;
                                            } else {
                                                if (i3 == i) {
                                                    bufferLimitExceeded(i);
                                                    throw new KotlinNothingValueException();
                                                }
                                                i3++;
                                                appendable.append(c);
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                chunkBuffer3.discardExact(((i13 - readPosition) - i16) + 1);
                                                i5 = -1;
                                                i6 = -1;
                                                i4 = 0;
                                                break;
                                            }
                                            i4 = 0;
                                            i15 = i4;
                                        }
                                    }
                                    i13++;
                                    memory = byteBuffer;
                                } else {
                                    if (i14 != 0) {
                                        UTF8Kt.malformedByteCount(i14);
                                        throw new KotlinNothingValueException();
                                    }
                                    char c2 = (char) i17;
                                    byteBuffer = memory;
                                    if (kotlin.text.StringsKt.contains$default((CharSequence) str, c2, false, 2, (Object) null)) {
                                        z4 = false;
                                    } else {
                                        if (i3 == i) {
                                            bufferLimitExceeded(i);
                                            throw new KotlinNothingValueException();
                                        }
                                        i3++;
                                        appendable.append(c2);
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        chunkBuffer3.discardExact(i13 - readPosition);
                                        i5 = -1;
                                        i6 = -1;
                                        i4 = 0;
                                        break;
                                    }
                                    i13++;
                                    memory = byteBuffer;
                                }
                            }
                            i4 = 0;
                            chunkBuffer3.discardExact(writePosition2 - readPosition);
                            i5 = 0;
                            i6 = -1;
                            i11 = i5 == i6 ? i4 : RangesKt.coerceAtLeast(i5, 1);
                            try {
                                ChunkBuffer chunkBuffer4 = chunkBuffer2;
                                writePosition = chunkBuffer4.getWritePosition() - chunkBuffer4.getReadPosition();
                                i12 = i11;
                            } catch (Throwable th) {
                                th = th;
                                i10 = 1;
                                input2 = input;
                                if (i10 != 0) {
                                    UnsafeKt.completeReadHead(input2, chunkBuffer2);
                                }
                                throw th;
                            }
                        } finally {
                            chunkBuffer = chunkBuffer2;
                            chunkBuffer.getWritePosition();
                            chunkBuffer.getReadPosition();
                        }
                    } else {
                        i4 = 0;
                    }
                    if (writePosition == 0) {
                        input2 = input;
                        try {
                            prepareReadFirstHead = UnsafeKt.prepareReadNextHead(input2, chunkBuffer2);
                        } catch (Throwable th2) {
                            th = th2;
                            i10 = i4;
                            if (i10 != 0) {
                            }
                            throw th;
                        }
                    } else {
                        input2 = input;
                        if (writePosition >= i11) {
                            ChunkBuffer chunkBuffer5 = chunkBuffer2;
                            if (chunkBuffer5.getCapacity() - chunkBuffer5.getLimit() >= 8) {
                                prepareReadFirstHead = chunkBuffer2;
                            }
                        }
                        UnsafeKt.completeReadHead(input2, chunkBuffer2);
                        prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input2, i11);
                    }
                    if (prepareReadFirstHead == null) {
                        i7 = i4;
                        break;
                    }
                    chunkBuffer2 = prepareReadFirstHead;
                    if (i11 <= 0) {
                        i7 = 1;
                        break;
                    }
                    i10 = 1;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (i8 <= i9) {
            return i3;
        }
        prematureEndOfStream(i8);
        throw new KotlinNothingValueException();
    }
}
