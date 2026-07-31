package com.bytedance.sdk.openadsdk.nqi;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zn {
    private final int fs;
    private final byte[][] zmn;
    private final int zn;

    public zn(int i, int i2) {
        this.zmn = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.fs = i;
        this.zn = i2;
    }

    public int zmn() {
        return this.zn;
    }

    public int fs() {
        return this.fs;
    }

    public byte zmn(int i, int i2) {
        return this.zmn[i2][i];
    }

    public byte[][] zn() {
        return this.zmn;
    }

    public void zmn(int i, int i2, int i3) {
        this.zmn[i2][i] = (byte) i3;
    }

    public void zmn(int i, int i2, boolean z) {
        this.zmn[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public void zmn(byte b) {
        for (byte[] bArr : this.zmn) {
            Arrays.fill(bArr, b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.fs * 2 * this.zn) + 2);
        for (int i = 0; i < this.zn; i++) {
            byte[] bArr = this.zmn[i];
            for (int i2 = 0; i2 < this.fs; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b == 1) {
                    sb.append(" 1");
                } else {
                    sb.append("  ");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
