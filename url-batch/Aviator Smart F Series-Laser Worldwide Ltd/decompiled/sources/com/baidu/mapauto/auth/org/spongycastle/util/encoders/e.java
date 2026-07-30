package com.baidu.mapauto.auth.org.spongycastle.util.encoders;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7870a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1};

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7871b = new byte[128];

    public e() {
        a();
    }

    public final void a() {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.f7871b;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = -1;
            i9++;
        }
        while (true) {
            byte[] bArr2 = this.f7870a;
            if (i8 >= bArr2.length) {
                byte[] bArr3 = this.f7871b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f7871b[bArr2[i8]] = (byte) i8;
            i8++;
        }
    }
}
