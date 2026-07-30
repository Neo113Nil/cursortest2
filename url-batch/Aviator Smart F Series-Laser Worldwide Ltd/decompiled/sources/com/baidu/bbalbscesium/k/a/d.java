package com.baidu.bbalbscesium.k.a;

import java.security.InvalidKeyException;

/* loaded from: classes.dex */
class d extends f {

    /* renamed from: d, reason: collision with root package name */
    protected byte[] f4088d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f4089e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f4090f;

    d(b bVar) {
        super(bVar);
        this.f4090f = null;
        int i8 = this.f4109b;
        this.f4089e = new byte[i8];
        this.f4088d = new byte[i8];
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void a(boolean z7, String str, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr2.length != this.f4109b) {
            throw new InvalidKeyException("Internal error");
        }
        this.f4110c = bArr2;
        b();
        this.f4108a.a(z7, str, bArr);
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void b() {
        System.arraycopy(this.f4110c, 0, this.f4088d, 0, this.f4109b);
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void c() {
        System.arraycopy(this.f4090f, 0, this.f4088d, 0, this.f4109b);
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void d() {
        if (this.f4090f == null) {
            this.f4090f = new byte[this.f4109b];
        }
        System.arraycopy(this.f4088d, 0, this.f4090f, 0, this.f4109b);
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void a(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11;
        int i12 = i9 + i8;
        byte[] bArr3 = (bArr != bArr2 || i8 < i10 || i8 - i10 >= this.f4109b) ? null : (byte[]) bArr.clone();
        while (i8 < i12) {
            this.f4108a.a(bArr, i8, this.f4089e, 0);
            int i13 = 0;
            while (true) {
                i11 = this.f4109b;
                if (i13 >= i11) {
                    break;
                }
                bArr2[i13 + i10] = (byte) (this.f4089e[i13] ^ this.f4088d[i13]);
                i13++;
            }
            byte[] bArr4 = this.f4088d;
            if (bArr3 == null) {
                System.arraycopy(bArr, i8, bArr4, 0, i11);
            } else {
                System.arraycopy(bArr3, i8, bArr4, 0, i11);
            }
            int i14 = this.f4109b;
            i8 += i14;
            i10 += i14;
        }
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void c(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11 = i9 + i8;
        while (i8 < i11) {
            for (int i12 = 0; i12 < this.f4109b; i12++) {
                this.f4089e[i12] = (byte) (bArr[i12 + i8] ^ this.f4088d[i12]);
            }
            this.f4108a.b(this.f4089e, 0, bArr2, i10);
            System.arraycopy(bArr2, i10, this.f4088d, 0, this.f4109b);
            int i13 = this.f4109b;
            i8 += i13;
            i10 += i13;
        }
    }
}
