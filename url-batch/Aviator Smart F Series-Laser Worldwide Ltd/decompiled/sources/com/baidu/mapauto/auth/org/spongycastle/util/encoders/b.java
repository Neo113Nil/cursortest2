package com.baidu.mapauto.auth.org.spongycastle.util.encoders;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7866a = {a4.a.I0, 66, 67, a4.a.L0, a4.a.M0, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, a4.a.N0, a4.a.O0, a4.a.P0, a4.a.Q0, 85, 86, a4.a.R0, 88, a4.a.S0, a4.a.T0, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1, a4.a.f27d1, a4.a.f31e1, a4.a.f35f1, a4.a.f39g1, a4.a.f43h1, a4.a.f47i1, a4.a.f51j1, a4.a.f55k1, a4.a.f59l1, 112, a4.a.f63m1, a4.a.f67n1, a4.a.f70o1, a4.a.f73p1, a4.a.f76q1, 118, a4.a.f79r1, a4.a.f82s1, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7867b = new byte[128];

    public b() {
        a();
    }

    public final void a() {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.f7867b;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = -1;
            i9++;
        }
        while (true) {
            byte[] bArr2 = this.f7866a;
            if (i8 >= bArr2.length) {
                return;
            }
            this.f7867b[bArr2[i8]] = (byte) i8;
            i8++;
        }
    }
}
