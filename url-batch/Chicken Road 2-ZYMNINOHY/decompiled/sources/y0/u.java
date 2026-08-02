package y0;

import W.AbstractC0110c;
import java.util.Collections;
import java.util.List;
import v2.I;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final List f16199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16202d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16203e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16204f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16205g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16206h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16207i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16208j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16209k;

    /* renamed from: l, reason: collision with root package name */
    public final float f16210l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16211m;
    public final String n;
    public final G1.c o;

    public u(List list, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f4, int i14, String str, G1.c cVar) {
        this.f16199a = list;
        this.f16200b = i4;
        this.f16201c = i5;
        this.f16202d = i6;
        this.f16203e = i7;
        this.f16204f = i8;
        this.f16205g = i9;
        this.f16206h = i10;
        this.f16207i = i11;
        this.f16208j = i12;
        this.f16209k = i13;
        this.f16210l = f4;
        this.f16211m = i14;
        this.n = str;
        this.o = cVar;
    }

    public static u a(W.u uVar, boolean z, G1.c cVar) {
        boolean z4;
        E3.j h2;
        int i4;
        int i5 = 4;
        try {
            if (z) {
                uVar.N(4);
            } else {
                uVar.N(21);
            }
            int z5 = uVar.z() & 3;
            int z6 = uVar.z();
            int i6 = uVar.f3352b;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                z4 = true;
                if (i8 >= z6) {
                    break;
                }
                uVar.N(1);
                int G4 = uVar.G();
                for (int i10 = 0; i10 < G4; i10++) {
                    int G5 = uVar.G();
                    i9 += G5 + 4;
                    uVar.N(G5);
                }
                i8++;
            }
            uVar.M(i6);
            byte[] bArr = new byte[i9];
            G1.c cVar2 = cVar;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f4 = 1.0f;
            String str = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < z6) {
                int z7 = uVar.z() & 63;
                int G6 = uVar.G();
                int i23 = i7;
                G1.c cVar3 = cVar2;
                while (i23 < G6) {
                    boolean z8 = z4;
                    int G7 = uVar.G();
                    int i24 = z5;
                    System.arraycopy(X.p.f3552a, i7, bArr, i22, i5);
                    int i25 = i22 + 4;
                    System.arraycopy(uVar.f3351a, uVar.f3352b, bArr, i25, G7);
                    if (z7 == 32 && i23 == 0) {
                        cVar3 = X.p.j(bArr, i25, i25 + G7);
                    } else {
                        if (z7 == 33 && i23 == 0) {
                            X.l i26 = X.p.i(bArr, i25, i25 + G7, cVar3);
                            i11 = i26.f3517a + 1;
                            i12 = i26.f3523g;
                            int i27 = i26.f3524h;
                            i14 = i26.f3519c + 8;
                            i15 = i26.f3520d + 8;
                            int i28 = i26.f3527k;
                            i13 = i27;
                            int i29 = i26.f3528l;
                            int i30 = i26.f3529m;
                            float f5 = i26.f3525i;
                            int i31 = i26.f3526j;
                            X.i iVar = i26.f3518b;
                            if (iVar != null) {
                                i4 = i31;
                                str = AbstractC0110c.b(iVar.f3504a, iVar.f3505b, iVar.f3506c, iVar.f3507d, iVar.f3508e, iVar.f3509f);
                            } else {
                                i4 = i31;
                            }
                            i20 = i4;
                            f4 = f5;
                            i18 = i30;
                            i17 = i29;
                            i16 = i28;
                        } else if (z7 == 39 && i23 == 0 && (h2 = X.p.h(bArr, i25, i25 + G7)) != null && cVar3 != null) {
                            i7 = 0;
                            i19 = h2.f716a == ((X.h) ((I) cVar3.f835b).get(0)).f3503b ? 4 : 5;
                        }
                        i7 = 0;
                    }
                    i22 = i25 + G7;
                    uVar.N(G7);
                    i23++;
                    z4 = z8;
                    z5 = i24;
                    i5 = 4;
                }
                i21++;
                cVar2 = cVar3;
                i5 = 4;
            }
            return new u(i9 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), z5 + 1, i11, i12, i13, i14, i15, i16, i17, i18, i19, f4, i20, str, cVar2);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw T.G.a(e4, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
