package com.crrepa.x1;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    int f14016a;

    /* renamed from: b, reason: collision with root package name */
    int f14017b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<byte[]> f14018c;

    public b(byte[] bArr, int i8) {
        byte[] bArr2;
        int length = bArr.length;
        this.f14017b = length;
        if (length == 0) {
            this.f14016a = 0;
            this.f14018c = null;
            return;
        }
        this.f14016a = bArr.length % i8 == 0 ? bArr.length / i8 : (bArr.length / i8) + 1;
        this.f14018c = new ArrayList<>(this.f14016a);
        int i9 = 0;
        for (int i10 = 0; i10 < this.f14016a; i10++) {
            int i11 = i9 + i8;
            if (i11 <= bArr.length) {
                bArr2 = new byte[i8];
                System.arraycopy(bArr, i9, bArr2, 0, i8);
                i9 = i11;
            } else {
                int length2 = bArr.length - i9;
                bArr2 = new byte[length2];
                System.arraycopy(bArr, i9, bArr2, 0, length2);
                i9 += length2;
            }
            this.f14018c.add(i10, bArr2);
        }
    }

    public int a() {
        return this.f14016a;
    }

    public byte[] a(int i8) {
        return this.f14018c.get(i8);
    }
}
