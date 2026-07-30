package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24115c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24116d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24117e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24118f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24119g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24120h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24121j;

    /* renamed from: k, reason: collision with root package name */
    public final float f24122k;

    /* renamed from: l, reason: collision with root package name */
    public final String f24123l;

    public C0(ArrayList arrayList, int i, int i4, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f6, String str) {
        this.f24113a = arrayList;
        this.f24114b = i;
        this.f24115c = i4;
        this.f24116d = i9;
        this.f24117e = i10;
        this.f24118f = i11;
        this.f24119g = i12;
        this.f24120h = i13;
        this.i = i14;
        this.f24121j = i15;
        this.f24122k = f6;
        this.f24123l = str;
    }

    public static C0 a(Lr lr) {
        String str;
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        int i12;
        float f6;
        int i13;
        int i14;
        try {
            lr.G(4);
            int K8 = (lr.K() & 3) + 1;
            if (K8 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int K9 = lr.K() & 31;
            for (int i15 = 0; i15 < K9; i15++) {
                int L8 = lr.L();
                int i16 = lr.f26234b;
                lr.G(L8);
                byte[] bArr = lr.f26233a;
                byte[] bArr2 = AbstractC4295zm.f35602a;
                byte[] bArr3 = new byte[L8 + 4];
                System.arraycopy(AbstractC4295zm.f35602a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i16, bArr3, 4, L8);
                arrayList.add(bArr3);
            }
            int K10 = lr.K();
            for (int i17 = 0; i17 < K10; i17++) {
                int L9 = lr.L();
                int i18 = lr.f26234b;
                lr.G(L9);
                byte[] bArr4 = lr.f26233a;
                byte[] bArr5 = AbstractC4295zm.f35602a;
                byte[] bArr6 = new byte[L9 + 4];
                System.arraycopy(AbstractC4295zm.f35602a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i18, bArr6, 4, L9);
                arrayList.add(bArr6);
            }
            if (K9 > 0) {
                C3834rA I2 = PA.I((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i19 = I2.f33974e;
                int i20 = I2.f33975f;
                int i21 = I2.f33977h + 8;
                int i22 = I2.i + 8;
                int i23 = I2.f33978j;
                int i24 = I2.f33979k;
                int i25 = I2.f33980l;
                int i26 = I2.f33981m;
                float f9 = I2.f33976g;
                int i27 = I2.f33970a;
                int i28 = I2.f33971b;
                int i29 = I2.f33972c;
                byte[] bArr7 = AbstractC4295zm.f35602a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i27), Integer.valueOf(i28), Integer.valueOf(i29));
                i10 = i24;
                i11 = i25;
                i12 = i26;
                f6 = f9;
                i4 = i20;
                i9 = i21;
                i13 = i22;
                i14 = i23;
                i = i19;
            } else {
                str = null;
                i = -1;
                i4 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = 16;
                f6 = 1.0f;
                i13 = -1;
                i14 = -1;
            }
            return new C0(arrayList, K8, i, i4, i9, i13, i14, i10, i11, i12, f6, str);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw W4.a(e6, "Error parsing AVC config");
        }
    }
}
