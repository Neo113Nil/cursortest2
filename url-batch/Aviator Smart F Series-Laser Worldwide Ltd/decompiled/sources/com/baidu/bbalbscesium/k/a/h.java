package com.baidu.bbalbscesium.k.a;

import javax.crypto.ShortBufferException;

/* loaded from: classes.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private int f4112a;

    h(int i8) {
        this.f4112a = i8;
    }

    @Override // com.baidu.bbalbscesium.k.a.i
    public int a(int i8) {
        int i9 = this.f4112a;
        return i9 - (i8 % i9);
    }

    @Override // com.baidu.bbalbscesium.k.a.i
    public int b(byte[] bArr, int i8, int i9) {
        int i10;
        if (bArr == null || i9 == 0) {
            return 0;
        }
        int i11 = i9 + i8;
        int i12 = bArr[i11 - 1];
        int i13 = i12 & 255;
        if (i13 < 1 || i13 > this.f4112a || (i10 = i11 - i13) < i8) {
            return -1;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (bArr[i10 + i14] != i12) {
                return -1;
            }
        }
        return i10;
    }

    @Override // com.baidu.bbalbscesium.k.a.i
    public void a(byte[] bArr, int i8, int i9) {
        if (bArr == null) {
            return;
        }
        if (i8 + i9 > bArr.length) {
            throw new ShortBufferException("Buffer too small to hold padding");
        }
        byte b8 = (byte) (i9 & 255);
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10 + i8] = b8;
        }
    }
}
