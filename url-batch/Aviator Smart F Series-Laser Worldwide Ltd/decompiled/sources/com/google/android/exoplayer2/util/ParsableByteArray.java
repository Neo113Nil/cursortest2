package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final ImmutableSet<Charset> SUPPORTED_CHARSETS_FOR_READLINE = ImmutableSet.of(Charsets.US_ASCII, Charsets.UTF_8, Charsets.UTF_16, Charsets.UTF_16BE, Charsets.UTF_16LE);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private int findNextLineTerminator(Charset charset) {
        int i8;
        if (charset.equals(Charsets.UTF_8) || charset.equals(Charsets.US_ASCII)) {
            i8 = 1;
        } else {
            if (!charset.equals(Charsets.UTF_16) && !charset.equals(Charsets.UTF_16LE) && !charset.equals(Charsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i8 = 2;
        }
        int i9 = this.position;
        while (true) {
            int i10 = this.limit;
            if (i9 >= i10 - (i8 - 1)) {
                return i10;
            }
            if ((charset.equals(Charsets.UTF_8) || charset.equals(Charsets.US_ASCII)) && Util.isLinebreak(this.data[i9])) {
                return i9;
            }
            if (charset.equals(Charsets.UTF_16) || charset.equals(Charsets.UTF_16BE)) {
                byte[] bArr = this.data;
                if (bArr[i9] == 0 && Util.isLinebreak(bArr[i9 + 1])) {
                    return i9;
                }
            }
            if (charset.equals(Charsets.UTF_16LE)) {
                byte[] bArr2 = this.data;
                if (bArr2[i9 + 1] == 0 && Util.isLinebreak(bArr2[i9])) {
                    return i9;
                }
            }
            i9 += i8;
        }
    }

    private int peekCharacterAndSize(Charset charset) {
        byte checkedCast;
        char fromBytes;
        int i8 = 1;
        if ((charset.equals(Charsets.UTF_8) || charset.equals(Charsets.US_ASCII)) && bytesLeft() >= 1) {
            checkedCast = (byte) Chars.checkedCast(UnsignedBytes.toInt(this.data[this.position]));
        } else {
            if ((charset.equals(Charsets.UTF_16) || charset.equals(Charsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i9 = this.position;
                fromBytes = Chars.fromBytes(bArr[i9], bArr[i9 + 1]);
            } else {
                if (!charset.equals(Charsets.UTF_16LE) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i10 = this.position;
                fromBytes = Chars.fromBytes(bArr2[i10 + 1], bArr2[i10]);
            }
            checkedCast = (byte) fromBytes;
            i8 = 2;
        }
        return (Chars.checkedCast(checkedCast) << 16) + i8;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int peekCharacterAndSize = peekCharacterAndSize(charset);
        if (peekCharacterAndSize == 0) {
            return (char) 0;
        }
        char c8 = (char) (peekCharacterAndSize >> 16);
        if (!Chars.contains(cArr, c8)) {
            return (char) 0;
        }
        this.position += peekCharacterAndSize & 65535;
        return c8;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i8) {
        if (i8 > capacity()) {
            this.data = Arrays.copyOf(this.data, i8);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i8 = this.position;
        return (char) ((bArr[i8 + 1] & 255) | ((bArr[i8] & 255) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i8) {
        readBytes(parsableBitArray.data, 0, i8);
        parsableBitArray.setPosition(0);
    }

    @Nullable
    public String readDelimiterTerminatedString(char c8) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i8 = this.position;
        while (i8 < this.limit && this.data[i8] != c8) {
            i8++;
        }
        byte[] bArr = this.data;
        int i9 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i9, i8 - i9);
        this.position = i8;
        if (i8 < this.limit) {
            this.position = i8 + 1;
        }
        return fromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8] & 255) << 24);
        int i10 = i8 + 3;
        int i11 = i9 | ((bArr[i8 + 2] & 255) << 8);
        this.position = i8 + 4;
        return (bArr[i10] & 255) | i11;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 2;
        int i10 = ((bArr[i8 + 1] & 255) << 8) | (((bArr[i8] & 255) << 24) >> 8);
        this.position = i8 + 3;
        return (bArr[i9] & 255) | i10;
    }

    @Nullable
    public String readLine() {
        return readLine(Charsets.UTF_8);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = ((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255);
        int i10 = i8 + 3;
        int i11 = i9 | ((bArr[i8 + 2] & 255) << 16);
        this.position = i8 + 4;
        return ((bArr[i10] & 255) << 24) | i11;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 2;
        int i10 = ((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255);
        this.position = i8 + 3;
        return ((bArr[i9] & 255) << 16) | i10;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 7;
        long j8 = (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
        this.position = i8 + 8;
        return ((bArr[i9] & 255) << 56) | j8;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        this.position = i8 + 2;
        return (short) (((bArr[i9] & 255) << 8) | i10);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 3;
        long j8 = (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        this.position = i8 + 4;
        return ((bArr[i9] & 255) << 24) | j8;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 2;
        int i10 = ((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255);
        this.position = i8 + 3;
        return ((bArr[i9] & 255) << 16) | i10;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readLittleEndianInt);
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        this.position = i8 + 2;
        return ((bArr[i9] & 255) << 8) | i10;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 7;
        long j8 = ((bArr[i8] & 255) << 56) | ((bArr[i8 + 1] & 255) << 48) | ((bArr[i8 + 2] & 255) << 40) | ((bArr[i8 + 3] & 255) << 32) | ((bArr[i8 + 4] & 255) << 24) | ((bArr[i8 + 5] & 255) << 16) | ((bArr[i8 + 6] & 255) << 8);
        this.position = i8 + 8;
        return (bArr[i9] & 255) | j8;
    }

    public String readNullTerminatedString(int i8) {
        if (i8 == 0) {
            return "";
        }
        int i9 = this.position;
        int i10 = (i9 + i8) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i9, (i10 >= this.limit || this.data[i10] != 0) ? i8 : i8 - 1);
        this.position += i8;
        return fromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        int i10 = (bArr[i8] & 255) << 8;
        this.position = i8 + 2;
        return (short) ((bArr[i9] & 255) | i10);
    }

    public String readString(int i8) {
        return readString(i8, Charsets.UTF_8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i8 = this.position;
        this.position = i8 + 1;
        return bArr[i8] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = (bArr[i8 + 1] & 255) | ((bArr[i8] & 255) << 8);
        this.position = i8 + 4;
        return i9;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 3;
        long j8 = ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
        this.position = i8 + 4;
        return (bArr[i9] & 255) | j8;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 2;
        int i10 = ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8] & 255) << 16);
        this.position = i8 + 3;
        return (bArr[i9] & 255) | i10;
    }

    public int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readInt);
    }

    public long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException("Top bit not zero: " + readLong);
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        int i10 = (bArr[i8] & 255) << 8;
        this.position = i8 + 2;
        return (bArr[i9] & 255) | i10;
    }

    public long readUtf8EncodedLong() {
        int i8;
        int i9;
        long j8 = this.data[this.position];
        int i10 = 7;
        while (true) {
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j8) != 0) {
                i10--;
            } else if (i10 < 6) {
                j8 &= r6 - 1;
                i9 = 7 - i10;
            } else if (i10 == 7) {
                i9 = 1;
            }
        }
        i9 = 0;
        if (i9 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j8);
        }
        for (i8 = 1; i8 < i9; i8++) {
            if ((this.data[this.position + i8] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j8);
            }
            j8 = (j8 << 6) | (r3 & 63);
        }
        this.position += i9;
        return j8;
    }

    @Nullable
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i8 = this.position;
            if (bArr[i8] == -17 && bArr[i8 + 1] == -69 && bArr[i8 + 2] == -65) {
                this.position = i8 + 3;
                return Charsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i9 = this.position;
        byte b8 = bArr2[i9];
        if (b8 == -2 && bArr2[i9 + 1] == -1) {
            this.position = i9 + 2;
            return Charsets.UTF_16BE;
        }
        if (b8 != -1 || bArr2[i9 + 1] != -2) {
            return null;
        }
        this.position = i9 + 2;
        return Charsets.UTF_16LE;
    }

    public void reset(byte[] bArr, int i8) {
        this.data = bArr;
        this.limit = i8;
        this.position = 0;
    }

    public void setLimit(int i8) {
        Assertions.checkArgument(i8 >= 0 && i8 <= this.data.length);
        this.limit = i8;
    }

    public void setPosition(int i8) {
        Assertions.checkArgument(i8 >= 0 && i8 <= this.limit);
        this.position = i8;
    }

    public void skipBytes(int i8) {
        setPosition(this.position + i8);
    }

    public char peekChar(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    @Nullable
    public String readLine(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(Charsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String readString = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return readString;
        }
        skipLineTerminator(charset);
        return readString;
    }

    public String readString(int i8, Charset charset) {
        String str = new String(this.data, this.position, i8, charset);
        this.position += i8;
        return str;
    }

    public void reset(int i8) {
        reset(capacity() < i8 ? new byte[i8] : this.data, i8);
    }

    public ParsableByteArray(int i8) {
        this.data = new byte[i8];
        this.limit = i8;
    }

    public void readBytes(byte[] bArr, int i8, int i9) {
        System.arraycopy(this.data, this.position, bArr, i8, i9);
        this.position += i9;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void readBytes(ByteBuffer byteBuffer, int i8) {
        byteBuffer.put(this.data, this.position, i8);
        this.position += i8;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i8) {
        this.data = bArr;
        this.limit = i8;
    }
}
