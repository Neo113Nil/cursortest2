package com.startapp.simple.bloomfilter.codec;

import E.AbstractC0005f;
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
            String simpleName = getClass().getSimpleName();
            String arrays = Arrays.toString(this.buffer);
            int i4 = this.currentLinePos;
            boolean z = this.eof;
            int i5 = this.ibitWorkArea;
            long j4 = this.lbitWorkArea;
            int i6 = this.modulus;
            int i7 = this.pos;
            int i8 = this.readPos;
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("[buffer=");
            sb.append(arrays);
            sb.append(", currentLinePos=");
            sb.append(i4);
            sb.append(", eof=");
            sb.append(z);
            sb.append(", ibitWorkArea=");
            sb.append(i5);
            sb.append(", lbitWorkArea=");
            sb.append(j4);
            sb.append(", modulus=");
            sb.append(i6);
            sb.append(", pos=");
            sb.append(i7);
            sb.append(", readPos=");
            return AbstractC0005f.o(sb, i8, "]");
        }
    }

    public BaseNCodec(int i4, int i5, int i6, int i7) {
        this.unencodedBlockSize = i4;
        this.encodedBlockSize = i5;
        this.lineLength = (i6 <= 0 || i7 <= 0) ? 0 : (i6 / i5) * i5;
        this.chunkSeparatorLength = i7;
    }

    public static boolean isWhiteSpace(byte b4) {
        return b4 == 9 || b4 == 10 || b4 == 13 || b4 == 32;
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
        for (byte b4 : bArr) {
            if (61 == b4 || isInAlphabet(b4)) {
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

    public abstract void decode(byte[] bArr, int i4, int i5, Context context);

    public Object encode(Object obj) throws RuntimeException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new RuntimeException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public abstract void encode(byte[] bArr, int i4, int i5, Context context);

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i4, Context context) {
        byte[] bArr = context.buffer;
        return (bArr == null || bArr.length < context.pos + i4) ? resizeBuffer(context) : bArr;
    }

    public int getDefaultBufferSize() {
        return DEFAULT_BUFFER_SIZE;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i4 = this.unencodedBlockSize;
        long j4 = (((length + i4) - 1) / i4) * this.encodedBlockSize;
        int i5 = this.lineLength;
        return i5 > 0 ? ((((i5 + j4) - 1) / i5) * this.chunkSeparatorLength) + j4 : j4;
    }

    public boolean hasData(Context context) {
        return context.buffer != null;
    }

    public abstract boolean isInAlphabet(byte b4);

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        byte b4;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (!isInAlphabet(bArr[i4]) && (!z || ((b4 = bArr[i4]) != 61 && !isWhiteSpace(b4)))) {
                return false;
            }
        }
        return true;
    }

    public int readResults(byte[] bArr, int i4, int i5, Context context) {
        if (context.buffer == null) {
            return context.eof ? -1 : 0;
        }
        int min = Math.min(available(context), i5);
        System.arraycopy(context.buffer, context.readPos, bArr, i4, min);
        int i6 = context.readPos + min;
        context.readPos = i6;
        if (i6 >= context.pos) {
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
        int i4 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i4];
        readResults(bArr2, 0, i4, context);
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
        int i4 = context.pos;
        byte[] bArr2 = new byte[i4];
        readResults(bArr2, 0, i4, context);
        return bArr2;
    }
}
