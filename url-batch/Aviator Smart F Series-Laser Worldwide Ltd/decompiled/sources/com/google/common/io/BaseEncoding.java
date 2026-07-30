package com.google.common.io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public abstract class BaseEncoding {
    private static final BaseEncoding BASE64 = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding BASE64_URL = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final BaseEncoding BASE32 = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final BaseEncoding BASE32_HEX = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");

    private static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        final int mask;
        private final String name;
        private final boolean[] validPadding;

        Alphabet(String str, char[] cArr) {
            this.name = (String) Preconditions.checkNotNull(str);
            this.chars = (char[]) Preconditions.checkNotNull(cArr);
            try {
                int log2 = IntMath.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.bitsPerChar = log2;
                int min = Math.min(8, Integer.lowestOneBit(log2));
                try {
                    this.charsPerChunk = 8 / min;
                    this.bytesPerChunk = log2 / min;
                    this.mask = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i8 = 0; i8 < cArr.length; i8++) {
                        char c8 = cArr[i8];
                        Preconditions.checkArgument(c8 < 128, "Non-ASCII character: %s", c8);
                        Preconditions.checkArgument(bArr[c8] == -1, "Duplicate character: %s", c8);
                        bArr[c8] = (byte) i8;
                    }
                    this.decodabet = bArr;
                    boolean[] zArr = new boolean[this.charsPerChunk];
                    for (int i9 = 0; i9 < this.bytesPerChunk; i9++) {
                        zArr[IntMath.divide(i9 * 8, this.bitsPerChar, RoundingMode.CEILING)] = true;
                    }
                    this.validPadding = zArr;
                } catch (ArithmeticException e8) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e8);
                }
            } catch (ArithmeticException e9) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e9);
            }
        }

        private boolean hasLowerCase() {
            for (char c8 : this.chars) {
                if (Ascii.isLowerCase(c8)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char c8 : this.chars) {
                if (Ascii.isUpperCase(c8)) {
                    return true;
                }
            }
            return false;
        }

        boolean canDecode(char c8) {
            return c8 <= 127 && this.decodabet[c8] != -1;
        }

        int decode(char c8) {
            if (c8 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c8));
                throw new DecodingException(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b8 = this.decodabet[c8];
            if (b8 != -1) {
                return b8;
            }
            if (c8 <= ' ' || c8 == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c8));
                throw new DecodingException(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c8);
            throw new DecodingException(sb.toString());
        }

        char encode(int i8) {
            return this.chars[i8];
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof Alphabet) {
                return Arrays.equals(this.chars, ((Alphabet) obj).chars);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.chars);
        }

        boolean isValidPaddingStartPosition(int i8) {
            return this.validPadding[i8 % this.charsPerChunk];
        }

        Alphabet lowerCase() {
            if (!hasUpperCase()) {
                return this;
            }
            Preconditions.checkState(!hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i8 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i8 >= cArr2.length) {
                    return new Alphabet(String.valueOf(this.name).concat(".lowerCase()"), cArr);
                }
                cArr[i8] = Ascii.toLowerCase(cArr2[i8]);
                i8++;
            }
        }

        public boolean matches(char c8) {
            byte[] bArr = this.decodabet;
            return c8 < bArr.length && bArr[c8] != -1;
        }

        public String toString() {
            return this.name;
        }

        Alphabet upperCase() {
            if (!hasLowerCase()) {
                return this;
            }
            Preconditions.checkState(!hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i8 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i8 >= cArr2.length) {
                    return new Alphabet(String.valueOf(this.name).concat(".upperCase()"), cArr);
                }
                cArr[i8] = Ascii.toUpperCase(cArr2[i8]);
                i8++;
            }
        }
    }

    static final class Base16Encoding extends StandardBaseEncoding {
        final char[] encoding;

        Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) {
            Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 == 1) {
                int length = charSequence.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new DecodingException(sb.toString());
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < charSequence.length()) {
                bArr[i9] = (byte) ((this.alphabet.decode(charSequence.charAt(i8)) << 4) | this.alphabet.decode(charSequence.charAt(i8 + 1)));
                i8 += 2;
                i9++;
            }
            return i9;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i8, int i9) {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i8, i8 + i9, bArr.length);
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = bArr[i8 + i10] & 255;
                appendable.append(this.encoding[i11]);
                appendable.append(this.encoding[i11 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character ch) {
            return new Base16Encoding(alphabet);
        }

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[512];
            Preconditions.checkArgument(alphabet.chars.length == 16);
            for (int i8 = 0; i8 < 256; i8++) {
                this.encoding[i8] = alphabet.encode(i8 >>> 4);
                this.encoding[i8 | 256] = alphabet.encode(i8 & 15);
            }
        }
    }

    static final class Base64Encoding extends StandardBaseEncoding {
        Base64Encoding(String str, String str2, @CheckForNull Character ch) {
            this(new Alphabet(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) {
            Preconditions.checkNotNull(bArr);
            CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                int length = trimTrailingPadding.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new DecodingException(sb.toString());
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < trimTrailingPadding.length()) {
                int i10 = i8 + 2;
                int decode = (this.alphabet.decode(trimTrailingPadding.charAt(i8)) << 18) | (this.alphabet.decode(trimTrailingPadding.charAt(i8 + 1)) << 12);
                int i11 = i9 + 1;
                bArr[i9] = (byte) (decode >>> 16);
                if (i10 < trimTrailingPadding.length()) {
                    int i12 = i8 + 3;
                    int decode2 = decode | (this.alphabet.decode(trimTrailingPadding.charAt(i10)) << 6);
                    int i13 = i9 + 2;
                    bArr[i11] = (byte) ((decode2 >>> 8) & 255);
                    if (i12 < trimTrailingPadding.length()) {
                        i8 += 4;
                        i9 += 3;
                        bArr[i13] = (byte) ((decode2 | this.alphabet.decode(trimTrailingPadding.charAt(i12))) & 255);
                    } else {
                        i9 = i13;
                        i8 = i12;
                    }
                } else {
                    i9 = i11;
                    i8 = i10;
                }
            }
            return i9;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i8, int i9) {
            Preconditions.checkNotNull(appendable);
            int i10 = i8 + i9;
            Preconditions.checkPositionIndexes(i8, i10, bArr.length);
            while (i9 >= 3) {
                int i11 = i8 + 2;
                int i12 = ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8] & 255) << 16);
                i8 += 3;
                int i13 = i12 | (bArr[i11] & 255);
                appendable.append(this.alphabet.encode(i13 >>> 18));
                appendable.append(this.alphabet.encode((i13 >>> 12) & 63));
                appendable.append(this.alphabet.encode((i13 >>> 6) & 63));
                appendable.append(this.alphabet.encode(i13 & 63));
                i9 -= 3;
            }
            if (i8 < i10) {
                encodeChunkTo(appendable, bArr, i8, i10 - i8);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character ch) {
            return new Base64Encoding(alphabet, ch);
        }

        private Base64Encoding(Alphabet alphabet, @CheckForNull Character ch) {
            super(alphabet, ch);
            Preconditions.checkArgument(alphabet.chars.length == 64);
        }
    }

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }

        DecodingException(Throwable th) {
            super(th);
        }
    }

    static final class SeparatedBaseEncoding extends BaseEncoding {
        private final int afterEveryChars;
        private final BaseEncoding delegate;
        private final String separator;

        SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i8) {
            this.delegate = (BaseEncoding) Preconditions.checkNotNull(baseEncoding);
            this.separator = (String) Preconditions.checkNotNull(str);
            this.afterEveryChars = i8;
            Preconditions.checkArgument(i8 > 0, "Cannot add a separator after every %s chars", i8);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < charSequence.length(); i8++) {
                char charAt = charSequence.charAt(i8);
                if (this.separator.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.delegate.canDecode(sb);
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i8 = 0; i8 < charSequence.length(); i8++) {
                char charAt = charSequence.charAt(i8);
                if (this.separator.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.delegate.decodeTo(bArr, sb);
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
            return this.delegate.decodingStream(BaseEncoding.ignoringReader(reader, this.separator));
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i8, int i9) {
            this.delegate.encodeTo(BaseEncoding.separatingAppendable(appendable, this.separator, this.afterEveryChars), bArr, i8, i9);
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
            return this.delegate.encodingStream(BaseEncoding.separatingWriter(writer, this.separator, this.afterEveryChars));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.delegate.lowerCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int i8) {
            return this.delegate.maxDecodedSize(i8);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int i8) {
            int maxEncodedSize = this.delegate.maxEncodedSize(i8);
            return maxEncodedSize + (this.separator.length() * IntMath.divide(Math.max(0, maxEncodedSize - 1), this.afterEveryChars, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.delegate.omitPadding().withSeparator(this.separator, this.afterEveryChars);
        }

        public String toString() {
            String valueOf = String.valueOf(this.delegate);
            String str = this.separator;
            int i8 = this.afterEveryChars;
            StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(".withSeparator(\"");
            sb.append(str);
            sb.append("\", ");
            sb.append(i8);
            sb.append(")");
            return sb.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence trimTrailingPadding(CharSequence charSequence) {
            return this.delegate.trimTrailingPadding(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.delegate.upperCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c8) {
            return this.delegate.withPadChar(c8).withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i8) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    static class StandardBaseEncoding extends BaseEncoding {
        final Alphabet alphabet;

        @CheckForNull
        @LazyInit
        private transient BaseEncoding lowerCase;

        @CheckForNull
        final Character paddingChar;

        @CheckForNull
        @LazyInit
        private transient BaseEncoding upperCase;

        StandardBaseEncoding(String str, String str2, @CheckForNull Character ch) {
            this(new Alphabet(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                return false;
            }
            for (int i8 = 0; i8 < trimTrailingPadding.length(); i8++) {
                if (!this.alphabet.canDecode(trimTrailingPadding.charAt(i8))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) {
            Alphabet alphabet;
            Preconditions.checkNotNull(bArr);
            CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                int length = trimTrailingPadding.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new DecodingException(sb.toString());
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < trimTrailingPadding.length()) {
                long j8 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    alphabet = this.alphabet;
                    if (i10 >= alphabet.charsPerChunk) {
                        break;
                    }
                    j8 <<= alphabet.bitsPerChar;
                    if (i8 + i10 < trimTrailingPadding.length()) {
                        j8 |= this.alphabet.decode(trimTrailingPadding.charAt(i11 + i8));
                        i11++;
                    }
                    i10++;
                }
                int i12 = alphabet.bytesPerChunk;
                int i13 = (i12 * 8) - (i11 * alphabet.bitsPerChar);
                int i14 = (i12 - 1) * 8;
                while (i14 >= i13) {
                    bArr[i9] = (byte) ((j8 >>> i14) & 255);
                    i14 -= 8;
                    i9++;
                }
                i8 += this.alphabet.charsPerChunk;
            }
            return i9;
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(final Reader reader) {
            Preconditions.checkNotNull(reader);
            return new InputStream() { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.2
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int readChars = 0;
                boolean hitPadding = false;

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    reader.close();
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
                
                    r1 = r5.readChars;
                    r2 = new java.lang.StringBuilder(41);
                    r2.append("Padding cannot start at index ");
                    r2.append(r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
                
                    throw new com.google.common.io.BaseEncoding.DecodingException(r2.toString());
                 */
                @Override // java.io.InputStream
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public int read() {
                    int i8;
                    while (true) {
                        int read = reader.read();
                        if (read == -1) {
                            if (this.hitPadding || StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars)) {
                                return -1;
                            }
                            int i9 = this.readChars;
                            StringBuilder sb = new StringBuilder(32);
                            sb.append("Invalid input length ");
                            sb.append(i9);
                            throw new DecodingException(sb.toString());
                        }
                        this.readChars++;
                        char c8 = (char) read;
                        Character ch = StandardBaseEncoding.this.paddingChar;
                        if (ch == null || ch.charValue() != c8) {
                            if (this.hitPadding) {
                                int i10 = this.readChars;
                                StringBuilder sb2 = new StringBuilder(61);
                                sb2.append("Expected padding character but found '");
                                sb2.append(c8);
                                sb2.append("' at index ");
                                sb2.append(i10);
                                throw new DecodingException(sb2.toString());
                            }
                            int i11 = this.bitBuffer;
                            Alphabet alphabet = StandardBaseEncoding.this.alphabet;
                            int i12 = i11 << alphabet.bitsPerChar;
                            this.bitBuffer = i12;
                            int decode = alphabet.decode(c8) | i12;
                            this.bitBuffer = decode;
                            int i13 = this.bitBufferLength + StandardBaseEncoding.this.alphabet.bitsPerChar;
                            this.bitBufferLength = i13;
                            if (i13 >= 8) {
                                int i14 = i13 - 8;
                                this.bitBufferLength = i14;
                                return (decode >> i14) & 255;
                            }
                        } else if (this.hitPadding || ((i8 = this.readChars) != 1 && StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(i8 - 1))) {
                            this.hitPadding = true;
                        }
                    }
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i8, int i9) {
                    int i10 = i9 + i8;
                    Preconditions.checkPositionIndexes(i8, i10, bArr.length);
                    int i11 = i8;
                    while (i11 < i10) {
                        int read = read();
                        if (read == -1) {
                            int i12 = i11 - i8;
                            if (i12 == 0) {
                                return -1;
                            }
                            return i12;
                        }
                        bArr[i11] = (byte) read;
                        i11++;
                    }
                    return i11 - i8;
                }
            };
        }

        void encodeChunkTo(Appendable appendable, byte[] bArr, int i8, int i9) {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i8, i8 + i9, bArr.length);
            int i10 = 0;
            Preconditions.checkArgument(i9 <= this.alphabet.bytesPerChunk);
            long j8 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                j8 = (j8 | (bArr[i8 + i11] & 255)) << 8;
            }
            int i12 = ((i9 + 1) * 8) - this.alphabet.bitsPerChar;
            while (i10 < i9 * 8) {
                Alphabet alphabet = this.alphabet;
                appendable.append(alphabet.encode(((int) (j8 >>> (i12 - i10))) & alphabet.mask));
                i10 += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i10 < this.alphabet.bytesPerChunk * 8) {
                    appendable.append(this.paddingChar.charValue());
                    i10 += this.alphabet.bitsPerChar;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i8, int i9) {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i8, i8 + i9, bArr.length);
            int i10 = 0;
            while (i10 < i9) {
                encodeChunkTo(appendable, bArr, i8 + i10, Math.min(this.alphabet.bytesPerChunk, i9 - i10));
                i10 += this.alphabet.bytesPerChunk;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(final Writer writer) {
            Preconditions.checkNotNull(writer);
            return new OutputStream() { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.1
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int writtenChars = 0;

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    int i8 = this.bitBufferLength;
                    if (i8 > 0) {
                        int i9 = this.bitBuffer;
                        Alphabet alphabet = StandardBaseEncoding.this.alphabet;
                        writer.write(alphabet.encode((i9 << (alphabet.bitsPerChar - i8)) & alphabet.mask));
                        this.writtenChars++;
                        if (StandardBaseEncoding.this.paddingChar != null) {
                            while (true) {
                                int i10 = this.writtenChars;
                                StandardBaseEncoding standardBaseEncoding = StandardBaseEncoding.this;
                                if (i10 % standardBaseEncoding.alphabet.charsPerChunk == 0) {
                                    break;
                                }
                                writer.write(standardBaseEncoding.paddingChar.charValue());
                                this.writtenChars++;
                            }
                        }
                    }
                    writer.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() {
                    writer.flush();
                }

                @Override // java.io.OutputStream
                public void write(int i8) {
                    this.bitBuffer = (i8 & 255) | (this.bitBuffer << 8);
                    this.bitBufferLength += 8;
                    while (true) {
                        int i9 = this.bitBufferLength;
                        Alphabet alphabet = StandardBaseEncoding.this.alphabet;
                        int i10 = alphabet.bitsPerChar;
                        if (i9 < i10) {
                            return;
                        }
                        writer.write(alphabet.encode((this.bitBuffer >> (i9 - i10)) & alphabet.mask));
                        this.writtenChars++;
                        this.bitBufferLength -= StandardBaseEncoding.this.alphabet.bitsPerChar;
                    }
                }
            };
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof StandardBaseEncoding)) {
                return false;
            }
            StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
            return this.alphabet.equals(standardBaseEncoding.alphabet) && Objects.equal(this.paddingChar, standardBaseEncoding.paddingChar);
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ Objects.hashCode(this.paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncoding = this.lowerCase;
            if (baseEncoding == null) {
                Alphabet lowerCase = this.alphabet.lowerCase();
                baseEncoding = lowerCase == this.alphabet ? this : newInstance(lowerCase, this.paddingChar);
                this.lowerCase = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int i8) {
            return (int) (((this.alphabet.bitsPerChar * i8) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int i8) {
            Alphabet alphabet = this.alphabet;
            return alphabet.charsPerChunk * IntMath.divide(i8, alphabet.bytesPerChunk, RoundingMode.CEILING);
        }

        BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character ch) {
            return new StandardBaseEncoding(alphabet, ch);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : newInstance(this.alphabet, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.alphabet.toString());
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.paddingChar);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence trimTrailingPadding(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch = this.paddingChar;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncoding = this.upperCase;
            if (baseEncoding == null) {
                Alphabet upperCase = this.alphabet.upperCase();
                baseEncoding = upperCase == this.alphabet ? this : newInstance(upperCase, this.paddingChar);
                this.upperCase = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c8) {
            Character ch;
            return (8 % this.alphabet.bitsPerChar == 0 || ((ch = this.paddingChar) != null && ch.charValue() == c8)) ? this : newInstance(this.alphabet, Character.valueOf(c8));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i8) {
            for (int i9 = 0; i9 < str.length(); i9++) {
                Preconditions.checkArgument(!this.alphabet.matches(str.charAt(i9)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch = this.paddingChar;
            if (ch != null) {
                Preconditions.checkArgument(str.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new SeparatedBaseEncoding(this, str, i8);
        }

        StandardBaseEncoding(Alphabet alphabet, @CheckForNull Character ch) {
            this.alphabet = (Alphabet) Preconditions.checkNotNull(alphabet);
            Preconditions.checkArgument(ch == null || !alphabet.matches(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.paddingChar = ch;
        }
    }

    BaseEncoding() {
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    public static BaseEncoding base32() {
        return BASE32;
    }

    public static BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    private static byte[] extract(byte[] bArr, int i8) {
        if (i8 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        return bArr2;
    }

    @GwtIncompatible
    static Reader ignoringReader(final Reader reader, final String str) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(str);
        return new Reader() { // from class: com.google.common.io.BaseEncoding.3
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                reader.close();
            }

            @Override // java.io.Reader
            public int read() {
                int read;
                do {
                    read = reader.read();
                    if (read == -1) {
                        break;
                    }
                } while (str.indexOf((char) read) >= 0);
                return read;
            }

            @Override // java.io.Reader
            public int read(char[] cArr, int i8, int i9) {
                throw new UnsupportedOperationException();
            }
        };
    }

    static Appendable separatingAppendable(Appendable appendable, String str, int i8) {
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(i8 > 0);
        return new Appendable(i8, appendable, str) { // from class: com.google.common.io.BaseEncoding.4
            int charsUntilSeparator;
            final /* synthetic */ int val$afterEveryChars;
            final /* synthetic */ Appendable val$delegate;
            final /* synthetic */ String val$separator;

            {
                this.val$afterEveryChars = i8;
                this.val$delegate = appendable;
                this.val$separator = str;
                this.charsUntilSeparator = i8;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c8) {
                if (this.charsUntilSeparator == 0) {
                    this.val$delegate.append(this.val$separator);
                    this.charsUntilSeparator = this.val$afterEveryChars;
                }
                this.val$delegate.append(c8);
                this.charsUntilSeparator--;
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(@CheckForNull CharSequence charSequence, int i9, int i10) {
                throw new UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public Appendable append(@CheckForNull CharSequence charSequence) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @GwtIncompatible
    static Writer separatingWriter(final Writer writer, String str, int i8) {
        final Appendable separatingAppendable = separatingAppendable(writer, str, i8);
        return new Writer() { // from class: com.google.common.io.BaseEncoding.5
            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                writer.close();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() {
                writer.flush();
            }

            @Override // java.io.Writer
            public void write(int i9) {
                separatingAppendable.append((char) i9);
            }

            @Override // java.io.Writer
            public void write(char[] cArr, int i9, int i10) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
        try {
            return decodeChecked(charSequence);
        } catch (DecodingException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    final byte[] decodeChecked(CharSequence charSequence) {
        CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
        byte[] bArr = new byte[maxDecodedSize(trimTrailingPadding.length())];
        return extract(bArr, decodeTo(bArr, trimTrailingPadding));
    }

    abstract int decodeTo(byte[] bArr, CharSequence charSequence);

    @GwtIncompatible
    public final ByteSource decodingSource(final CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        return new ByteSource() { // from class: com.google.common.io.BaseEncoding.2
            @Override // com.google.common.io.ByteSource
            public InputStream openStream() {
                return BaseEncoding.this.decodingStream(charSource.openStream());
            }
        };
    }

    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    abstract void encodeTo(Appendable appendable, byte[] bArr, int i8, int i9);

    @GwtIncompatible
    public final ByteSink encodingSink(final CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        return new ByteSink() { // from class: com.google.common.io.BaseEncoding.1
            @Override // com.google.common.io.ByteSink
            public OutputStream openStream() {
                return BaseEncoding.this.encodingStream(charSink.openStream());
            }
        };
    }

    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    public abstract BaseEncoding lowerCase();

    abstract int maxDecodedSize(int i8);

    abstract int maxEncodedSize(int i8);

    public abstract BaseEncoding omitPadding();

    CharSequence trimTrailingPadding(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c8);

    public abstract BaseEncoding withSeparator(String str, int i8);

    public final String encode(byte[] bArr, int i8, int i9) {
        Preconditions.checkPositionIndexes(i8, i8 + i9, bArr.length);
        StringBuilder sb = new StringBuilder(maxEncodedSize(i9));
        try {
            encodeTo(sb, bArr, i8, i9);
            return sb.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
