package com.startapp.simple.bloomfilter.codec;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class BaseNCodec {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    protected final byte PAD = PAD_DEFAULT;
    private final int chunkSeparatorLength;
    private final int encodedBlockSize;
    protected final int lineLength;
    private final int unencodedBlockSize;

    public static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        public String toString() {
            return getClass().getSimpleName() + "[buffer=" + Arrays.toString(this.buffer) + ", currentLinePos=" + this.currentLinePos + ", eof=" + this.eof + ", ibitWorkArea=" + this.ibitWorkArea + ", lbitWorkArea=" + this.lbitWorkArea + ", modulus=" + this.modulus + ", pos=" + this.pos + ", readPos=" + this.readPos + "]";
        }
    }

    public BaseNCodec(int i3, int i4, int i5, int i6) {
        this.unencodedBlockSize = i3;
        this.encodedBlockSize = i4;
        this.lineLength = (i5 <= 0 || i6 <= 0) ? 0 : (i5 / i4) * i4;
        this.chunkSeparatorLength = i6;
    }

    public static boolean isWhiteSpace(byte b3) {
        return b3 == 9 || b3 == 10 || b3 == 13 || b3 == 32;
    }

    private byte[] resizeBuffer(Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            context.buffer = bArr2;
        }
        return context.buffer;
    }

    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b3 : bArr) {
            if (61 == b3 || isInAlphabet(b3)) {
                return true;
            }
        }
        return false;
    }

    public Object decode(Object obj) throws RuntimeException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new RuntimeException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void decode(byte[] bArr, int i3, int i4, Context context);

    public Object encode(Object obj) throws RuntimeException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new RuntimeException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public abstract void encode(byte[] bArr, int i3, int i4, Context context);

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i3, Context context) {
        byte[] bArr = context.buffer;
        return (bArr == null || bArr.length < context.pos + i3) ? resizeBuffer(context) : bArr;
    }

    public int getDefaultBufferSize() {
        return DEFAULT_BUFFER_SIZE;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i3 = this.unencodedBlockSize;
        long j3 = (((length + i3) - 1) / i3) * this.encodedBlockSize;
        int i4 = this.lineLength;
        return i4 > 0 ? ((((i4 + j3) - 1) / i4) * this.chunkSeparatorLength) + j3 : j3;
    }

    public boolean hasData(Context context) {
        return context.buffer != null;
    }

    public abstract boolean isInAlphabet(byte b3);

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        byte b3;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (!isInAlphabet(bArr[i3]) && (!z || ((b3 = bArr[i3]) != 61 && !isWhiteSpace(b3)))) {
                return false;
            }
        }
        return true;
    }

    public int readResults(byte[] bArr, int i3, int i4, Context context) {
        if (context.buffer == null) {
            return context.eof ? -1 : 0;
        }
        int min = Math.min(available(context), i4);
        System.arraycopy(context.buffer, context.readPos, bArr, i3, min);
        int i5 = context.readPos + min;
        context.readPos = i5;
        if (i5 >= context.pos) {
            context.buffer = null;
        }
        return min;
    }

    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, 0, bArr.length, context);
        encode(bArr, 0, -1, context);
        int i3 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i3];
        readResults(bArr2, 0, i3, context);
        return bArr2;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }

    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i3 = context.pos;
        byte[] bArr2 = new byte[i3];
        readResults(bArr2, 0, i3, context);
        return bArr2;
    }
}
