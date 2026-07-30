package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public final class f1 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7782a;

    public f1(byte[] bArr) {
        this.f7782a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(this.f7782a, 12);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f7782a.length) + 1 + this.f7782a.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(this.f7782a);
    }

    public final String toString() {
        char c8;
        int i8;
        byte b8;
        byte[] bArr = this.f7782a;
        int i9 = com.baidu.mapauto.auth.org.spongycastle.util.d.f7864a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            int i13 = i12 + 1;
            byte b9 = bArr[i11];
            if ((b9 & 240) == 240) {
                i12 += 2;
                i11 += 4;
            } else {
                i11 = (b9 & 224) == 224 ? i11 + 3 : (b9 & 192) == 192 ? i11 + 2 : i11 + 1;
                i12 = i13;
            }
        }
        char[] cArr = new char[i12];
        int i14 = 0;
        while (i10 < bArr.length) {
            byte b10 = bArr[i10];
            if ((b10 & 240) == 240) {
                int i15 = (((((b10 & 3) << 18) | ((bArr[i10 + 1] & 63) << 12)) | ((bArr[i10 + 2] & 63) << 6)) | (bArr[i10 + 3] & 63)) - 65536;
                char c9 = (char) ((i15 >> 10) | 55296);
                c8 = (char) ((i15 & 1023) | okio.z0.LOG_SURROGATE_HEADER);
                cArr[i14] = c9;
                i10 += 4;
                i14++;
            } else if ((b10 & 224) == 224) {
                c8 = (char) (((b10 & 15) << 12) | ((bArr[i10 + 1] & 63) << 6) | (bArr[i10 + 2] & 63));
                i10 += 3;
            } else {
                if ((b10 & 208) == 208) {
                    i8 = (b10 & 31) << 6;
                    b8 = bArr[i10 + 1];
                } else if ((b10 & 192) == 192) {
                    i8 = (b10 & 31) << 6;
                    b8 = bArr[i10 + 1];
                } else {
                    c8 = (char) (b10 & 255);
                    i10++;
                }
                c8 = (char) (i8 | (b8 & 63));
                i10 += 2;
            }
            cArr[i14] = c8;
            i14++;
        }
        return new String(cArr);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof f1) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7782a, ((f1) rVar).f7782a);
        }
        return false;
    }
}
