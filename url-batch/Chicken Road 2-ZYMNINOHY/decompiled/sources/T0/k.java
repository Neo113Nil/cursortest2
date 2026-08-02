package T0;

import T.C0096n;
import T.C0097o;
import T.E;
import T.F;
import T.G;
import W.AbstractC0108a;
import W.u;
import e0.t;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;
import v2.I;
import y0.AbstractC1569a;
import y0.w;

/* loaded from: classes.dex */
public final class k extends i {
    public j n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2952p;

    /* renamed from: q, reason: collision with root package name */
    public w f2953q;

    /* renamed from: r, reason: collision with root package name */
    public t f2954r;

    @Override // T0.i
    public final void a(long j4) {
        this.f2940g = j4;
        this.f2952p = j4 != 0;
        w wVar = this.f2953q;
        this.o = wVar != null ? wVar.f16219e : 0;
    }

    @Override // T0.i
    public final long b(u uVar) {
        byte b4 = uVar.f3351a[0];
        if ((b4 & 1) == 1) {
            return -1L;
        }
        j jVar = this.n;
        jVar.getClass();
        int i4 = jVar.f2947a;
        w wVar = (w) jVar.f2948b;
        int i5 = !((E2.b[]) jVar.f2951e)[(b4 >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - i4))].f675a ? wVar.f16219e : wVar.f16220f;
        long j4 = this.f2952p ? (this.o + i5) / 4 : 0;
        byte[] bArr = uVar.f3351a;
        int length = bArr.length;
        int i6 = uVar.f3353c + 4;
        if (length < i6) {
            byte[] copyOf = Arrays.copyOf(bArr, i6);
            uVar.K(copyOf.length, copyOf);
        } else {
            uVar.L(i6);
        }
        byte[] bArr2 = uVar.f3351a;
        int i7 = uVar.f3353c;
        bArr2[i7 - 4] = (byte) (j4 & 255);
        bArr2[i7 - 3] = (byte) ((j4 >>> 8) & 255);
        bArr2[i7 - 2] = (byte) ((j4 >>> 16) & 255);
        bArr2[i7 - 1] = (byte) ((j4 >>> 24) & 255);
        this.f2952p = true;
        this.o = i5;
        return j4;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // T0.i
    public final boolean c(u uVar, long j4, l2.e eVar) {
        j jVar;
        if (this.n != null) {
            ((C0097o) eVar.f14270b).getClass();
            return false;
        }
        w wVar = this.f2953q;
        int i4 = 4;
        if (wVar == null) {
            AbstractC1569a.B(1, uVar, false);
            uVar.r();
            int z = uVar.z();
            int r4 = uVar.r();
            int o = uVar.o();
            if (o <= 0) {
                o = -1;
            }
            int o4 = uVar.o();
            int i5 = o4 > 0 ? o4 : -1;
            uVar.o();
            int z4 = uVar.z();
            int pow = (int) Math.pow(2.0d, z4 & 15);
            int pow2 = (int) Math.pow(2.0d, (z4 & 240) >> 4);
            uVar.z();
            ?? copyOf = Arrays.copyOf(uVar.f3351a, uVar.f3353c);
            w wVar2 = new w();
            wVar2.f16215a = z;
            wVar2.f16216b = r4;
            wVar2.f16217c = o;
            wVar2.f16218d = i5;
            wVar2.f16219e = pow;
            wVar2.f16220f = pow2;
            wVar2.f16221g = copyOf;
            this.f2953q = wVar2;
        } else {
            t tVar = this.f2954r;
            if (tVar == null) {
                this.f2954r = AbstractC1569a.z(uVar, true, true);
            } else {
                int i6 = uVar.f3353c;
                byte[] bArr = new byte[i6];
                System.arraycopy(uVar.f3351a, 0, bArr, 0, i6);
                int i7 = wVar.f16215a;
                int i8 = 5;
                AbstractC1569a.B(5, uVar, false);
                int z5 = uVar.z() + 1;
                W.t tVar2 = new W.t(uVar.f3351a);
                int i9 = 8;
                tVar2.t(uVar.f3352b * 8);
                int i10 = 0;
                while (true) {
                    int i11 = 16;
                    if (i10 < z5) {
                        int i12 = i9;
                        if (tVar2.i(24) != 5653314) {
                            throw G.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((tVar2.f3344c * 8) + tVar2.f3346e));
                        }
                        int i13 = tVar2.i(16);
                        int i14 = tVar2.i(24);
                        if (tVar2.h()) {
                            tVar2.t(i8);
                            int i15 = 0;
                            while (i15 < i14) {
                                int i16 = 0;
                                for (int i17 = i14 - i15; i17 > 0; i17 >>>= 1) {
                                    i16++;
                                }
                                i15 += tVar2.i(i16);
                            }
                        } else {
                            boolean h2 = tVar2.h();
                            for (int i18 = 0; i18 < i14; i18++) {
                                if (!h2) {
                                    tVar2.t(i8);
                                } else if (tVar2.h()) {
                                    tVar2.t(i8);
                                }
                            }
                        }
                        int i19 = tVar2.i(4);
                        if (i19 > 2) {
                            throw G.a(null, "lookup type greater than 2 not decodable: " + i19);
                        }
                        if (i19 == 1 || i19 == 2) {
                            tVar2.t(32);
                            tVar2.t(32);
                            int i20 = tVar2.i(4) + 1;
                            tVar2.t(1);
                            tVar2.t((int) ((i19 == 1 ? i13 != 0 ? (long) Math.floor(Math.pow(i14, 1.0d / i13)) : 0L : i14 * i13) * i20));
                        }
                        i10++;
                        i9 = i12;
                        i8 = 5;
                    } else {
                        int i21 = i9;
                        int i22 = 6;
                        int i23 = tVar2.i(6) + 1;
                        for (int i24 = 0; i24 < i23; i24++) {
                            if (tVar2.i(16) != 0) {
                                throw G.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i25 = 1;
                        int i26 = tVar2.i(6) + 1;
                        int i27 = 0;
                        while (true) {
                            int i28 = 3;
                            if (i27 < i26) {
                                int i29 = tVar2.i(i11);
                                if (i29 == 0) {
                                    int i30 = i21;
                                    tVar2.t(i30);
                                    tVar2.t(16);
                                    tVar2.t(16);
                                    tVar2.t(6);
                                    tVar2.t(i30);
                                    int i31 = tVar2.i(4) + 1;
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        tVar2.t(i30);
                                        i32++;
                                        i30 = 8;
                                    }
                                } else {
                                    if (i29 != i25) {
                                        throw G.a(null, "floor type greater than 1 not decodable: " + i29);
                                    }
                                    int i33 = tVar2.i(5);
                                    int[] iArr = new int[i33];
                                    int i34 = -1;
                                    for (int i35 = 0; i35 < i33; i35++) {
                                        int i36 = tVar2.i(i4);
                                        iArr[i35] = i36;
                                        if (i36 > i34) {
                                            i34 = i36;
                                        }
                                    }
                                    int i37 = i34 + 1;
                                    int[] iArr2 = new int[i37];
                                    int i38 = 0;
                                    while (i38 < i37) {
                                        iArr2[i38] = tVar2.i(i28) + 1;
                                        int i39 = tVar2.i(2);
                                        int i40 = i21;
                                        if (i39 > 0) {
                                            tVar2.t(i40);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i41 = 0;
                                        for (int i42 = 1; i41 < (i42 << i39); i42 = 1) {
                                            tVar2.t(i40);
                                            i41++;
                                            i40 = 8;
                                        }
                                        i38++;
                                        iArr2 = iArr3;
                                        i21 = 8;
                                        i28 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    tVar2.t(2);
                                    int i43 = tVar2.i(4);
                                    int i44 = 0;
                                    int i45 = 0;
                                    for (int i46 = 0; i46 < i33; i46++) {
                                        i44 += iArr4[iArr[i46]];
                                        while (i45 < i44) {
                                            tVar2.t(i43);
                                            i45++;
                                        }
                                    }
                                }
                                i27++;
                                i21 = 8;
                                i22 = 6;
                                i4 = 4;
                                i11 = 16;
                                i25 = 1;
                            } else {
                                int i47 = tVar2.i(i22) + 1;
                                int i48 = 0;
                                while (i48 < i47) {
                                    if (tVar2.i(16) > 2) {
                                        throw G.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    tVar2.t(24);
                                    tVar2.t(24);
                                    tVar2.t(24);
                                    int i49 = tVar2.i(i22) + 1;
                                    int i50 = 8;
                                    tVar2.t(8);
                                    int[] iArr5 = new int[i49];
                                    for (int i51 = 0; i51 < i49; i51++) {
                                        iArr5[i51] = ((tVar2.h() ? tVar2.i(5) : 0) * 8) + tVar2.i(3);
                                    }
                                    int i52 = 0;
                                    while (i52 < i49) {
                                        int i53 = 0;
                                        while (i53 < i50) {
                                            if ((iArr5[i52] & (1 << i53)) != 0) {
                                                tVar2.t(i50);
                                            }
                                            i53++;
                                            i50 = 8;
                                        }
                                        i52++;
                                        i50 = 8;
                                    }
                                    i48++;
                                    i22 = 6;
                                }
                                int i54 = tVar2.i(i22) + 1;
                                for (int i55 = 0; i55 < i54; i55++) {
                                    int i56 = tVar2.i(16);
                                    if (i56 != 0) {
                                        AbstractC0108a.e("VorbisUtil", "mapping type other than 0 not supported: " + i56);
                                    } else {
                                        int i57 = tVar2.h() ? tVar2.i(4) + 1 : 1;
                                        if (tVar2.h()) {
                                            int i58 = tVar2.i(8) + 1;
                                            for (int i59 = 0; i59 < i58; i59++) {
                                                int i60 = i7 - 1;
                                                int i61 = 0;
                                                for (int i62 = i60; i62 > 0; i62 >>>= 1) {
                                                    i61++;
                                                }
                                                tVar2.t(i61);
                                                int i63 = 0;
                                                while (i60 > 0) {
                                                    i63++;
                                                    i60 >>>= 1;
                                                }
                                                tVar2.t(i63);
                                            }
                                        }
                                        if (tVar2.i(2) != 0) {
                                            throw G.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i57 > 1) {
                                            for (int i64 = 0; i64 < i7; i64++) {
                                                tVar2.t(4);
                                            }
                                        }
                                        for (int i65 = 0; i65 < i57; i65++) {
                                            tVar2.t(8);
                                            tVar2.t(8);
                                            tVar2.t(8);
                                        }
                                    }
                                }
                                int i66 = tVar2.i(6);
                                int i67 = i66 + 1;
                                E2.b[] bVarArr = new E2.b[i67];
                                for (int i68 = 0; i68 < i67; i68++) {
                                    boolean h4 = tVar2.h();
                                    tVar2.i(16);
                                    tVar2.i(16);
                                    tVar2.i(8);
                                    bVarArr[i68] = new E2.b(h4);
                                }
                                if (!tVar2.h()) {
                                    throw G.a(null, "framing bit after modes not set as expected");
                                }
                                int i69 = 0;
                                while (i66 > 0) {
                                    i69++;
                                    i66 >>>= 1;
                                }
                                jVar = new j(wVar, tVar, bArr, bVarArr, i69);
                            }
                        }
                    }
                }
            }
        }
        jVar = null;
        this.n = jVar;
        if (jVar == null) {
            return true;
        }
        w wVar3 = (w) jVar.f2948b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) wVar3.f16221g);
        arrayList.add((byte[]) jVar.f2950d);
        E w4 = AbstractC1569a.w(I.l((String[]) ((t) jVar.f2949c).f8416a));
        C0096n c0096n = new C0096n();
        c0096n.f2830l = F.n("audio/ogg");
        c0096n.f2831m = F.n("audio/vorbis");
        c0096n.f2826h = wVar3.f16218d;
        c0096n.f2827i = wVar3.f16217c;
        c0096n.f2810E = wVar3.f16215a;
        c0096n.f2811F = wVar3.f16216b;
        c0096n.f2832p = arrayList;
        c0096n.f2829k = w4;
        eVar.f14270b = new C0097o(c0096n);
        return true;
    }

    @Override // T0.i
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.f2953q = null;
            this.f2954r = null;
        }
        this.o = 0;
        this.f2952p = false;
    }
}
