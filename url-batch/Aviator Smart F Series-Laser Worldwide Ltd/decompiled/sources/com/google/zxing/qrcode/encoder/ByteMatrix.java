package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ByteMatrix {
    private final byte[][] bytes;
    private final int height;
    private final int width;

    public ByteMatrix(int i8, int i9) {
        this.bytes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i9, i8);
        this.width = i8;
        this.height = i9;
    }

    public void clear(byte b8) {
        for (byte[] bArr : this.bytes) {
            Arrays.fill(bArr, b8);
        }
    }

    public byte get(int i8, int i9) {
        return this.bytes[i9][i8];
    }

    public byte[][] getArray() {
        return this.bytes;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void set(int i8, int i9, byte b8) {
        this.bytes[i9][i8] = b8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.width * 2 * this.height) + 2);
        for (int i8 = 0; i8 < this.height; i8++) {
            byte[] bArr = this.bytes[i8];
            for (int i9 = 0; i9 < this.width; i9++) {
                byte b8 = bArr[i9];
                if (b8 == 0) {
                    sb.append(" 0");
                } else if (b8 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public void set(int i8, int i9, int i10) {
        this.bytes[i9][i8] = (byte) i10;
    }

    public void set(int i8, int i9, boolean z7) {
        this.bytes[i9][i8] = z7 ? (byte) 1 : (byte) 0;
    }
}
