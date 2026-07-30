package com.realsil.sdk.dfu.u;

import com.realsil.sdk.bbpro.core.transportlayer.Command;

/* loaded from: classes4.dex */
public abstract class d {
    public static Command a(int i8, int i9, byte[] bArr, int i10) {
        if (bArr != null && bArr.length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            bArr = bArr2;
        }
        return new Command.Builder().writeType(i9).packet(i8, bArr).build();
    }

    public static Command a(int i8, byte[] bArr, int i9) {
        if (bArr != null && bArr.length >= i9) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, 0, bArr2, 0, i9);
            bArr = bArr2;
        }
        return new Command.Builder().writeType(2).packet(i8, bArr).build();
    }
}
