package com.google.protobuf.micro;

import cn.hutool.core.util.l;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class ByteStringMicro {
    public static final ByteStringMicro EMPTY = new ByteStringMicro(new byte[0]);
    private final byte[] bytes;
    private volatile int hash = 0;

    private ByteStringMicro(byte[] bArr) {
        this.bytes = bArr;
    }

    public static ByteStringMicro copyFrom(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new ByteStringMicro(bArr2);
    }

    public static ByteStringMicro copyFromUtf8(String str) {
        try {
            return new ByteStringMicro(str.getBytes(l.UTF_8));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported?");
        }
    }

    public byte byteAt(int i8) {
        return this.bytes[i8];
    }

    public void copyTo(byte[] bArr, int i8) {
        byte[] bArr2 = this.bytes;
        System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteStringMicro)) {
            return false;
        }
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = ((ByteStringMicro) obj).bytes;
        if (length != bArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i8 = this.hash;
        if (i8 == 0) {
            byte[] bArr = this.bytes;
            int length = bArr.length;
            for (byte b8 : bArr) {
                length = (length * 31) + b8;
            }
            i8 = length == 0 ? 1 : length;
            this.hash = i8;
        }
        return i8;
    }

    public boolean isEmpty() {
        return this.bytes.length == 0;
    }

    public int size() {
        return this.bytes.length;
    }

    public byte[] toByteArray() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public String toString(String str) {
        return new String(this.bytes, str);
    }

    public String toStringUtf8() {
        try {
            return new String(this.bytes, l.UTF_8);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported?");
        }
    }

    public void copyTo(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.bytes, i8, bArr, i9, i10);
    }

    public static ByteStringMicro copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteStringMicro copyFrom(String str, String str2) {
        return new ByteStringMicro(str.getBytes(str2));
    }
}
