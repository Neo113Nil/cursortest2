package p2;

import java.util.Collections;
import java.util.List;
import o2.a0;
import o2.w;
import r0.n2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f20002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20004c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20005d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20006e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20007f;

    private f(List<byte[]> list, int i7, int i8, int i9, float f7, String str) {
        this.f20002a = list;
        this.f20003b = i7;
        this.f20004c = i8;
        this.f20005d = i9;
        this.f20006e = f7;
        this.f20007f = str;
    }

    public static f a(a0 a0Var) {
        int i7;
        int i8;
        try {
            a0Var.P(21);
            int C = a0Var.C() & 3;
            int C2 = a0Var.C();
            int e7 = a0Var.e();
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < C2; i11++) {
                a0Var.P(1);
                int I = a0Var.I();
                for (int i12 = 0; i12 < I; i12++) {
                    int I2 = a0Var.I();
                    i10 += I2 + 4;
                    a0Var.P(I2);
                }
            }
            a0Var.O(e7);
            byte[] bArr = new byte[i10];
            String str = null;
            int i13 = 0;
            int i14 = 0;
            int i15 = -1;
            int i16 = -1;
            float f7 = 1.0f;
            while (i13 < C2) {
                int C3 = a0Var.C() & 127;
                int I3 = a0Var.I();
                int i17 = 0;
                while (i17 < I3) {
                    int I4 = a0Var.I();
                    byte[] bArr2 = o2.w.f19796a;
                    int i18 = C2;
                    System.arraycopy(bArr2, i9, bArr, i14, bArr2.length);
                    int length = i14 + bArr2.length;
                    System.arraycopy(a0Var.d(), a0Var.e(), bArr, length, I4);
                    if (C3 == 33 && i17 == 0) {
                        w.a h7 = o2.w.h(bArr, length, length + I4);
                        int i19 = h7.f19807h;
                        i16 = h7.f19808i;
                        f7 = h7.f19809j;
                        i7 = C3;
                        i8 = I3;
                        i15 = i19;
                        str = o2.e.c(h7.f19800a, h7.f19801b, h7.f19802c, h7.f19803d, h7.f19804e, h7.f19805f);
                    } else {
                        i7 = C3;
                        i8 = I3;
                    }
                    i14 = length + I4;
                    a0Var.P(I4);
                    i17++;
                    C2 = i18;
                    C3 = i7;
                    I3 = i8;
                    i9 = 0;
                }
                i13++;
                i9 = 0;
            }
            return new f(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), C + 1, i15, i16, f7, str);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw n2.a("Error parsing HEVC config", e8);
        }
    }
}
