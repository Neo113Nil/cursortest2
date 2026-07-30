package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class I4 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public PQ f25522a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3448k1 f25523b;

    /* renamed from: c, reason: collision with root package name */
    public int f25524c;

    /* renamed from: d, reason: collision with root package name */
    public long f25525d;

    /* renamed from: e, reason: collision with root package name */
    public G4 f25526e;

    /* renamed from: f, reason: collision with root package name */
    public int f25527f;

    /* renamed from: g, reason: collision with root package name */
    public long f25528g;

    static {
        int i = AbstractC3194fG.f30672t0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        PQ pq = (PQ) q02;
        this.f25522a = pq;
        this.f25523b = pq.x(0, 1);
        pq.v();
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        return AbstractC2655Lg.k((J0) p02);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f25524c = j9 == 0 ? 0 : 4;
        G4 g42 = this.f25526e;
        if (g42 != null) {
            g42.d(j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0275  */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        byte[] bArr;
        int i;
        int i4;
        byte[] bArr2;
        int b9;
        int i9;
        this.f25523b.getClass();
        String str = AbstractC3548lu.f32613a;
        int i10 = this.f25524c;
        if (i10 == 0) {
            PA.T(((J0) p02).f25675w == 0);
            int i11 = this.f25527f;
            if (i11 != -1) {
                ((J0) p02).b(i11, false);
                this.f25524c = 4;
                return 0;
            }
            J0 j02 = (J0) p02;
            if (!AbstractC2655Lg.k(j02)) {
                throw W4.a(null, "Unsupported or unrecognized wav file type.");
            }
            j02.b((int) (j02.m() - j02.f25675w), false);
            this.f25524c = 1;
            return 0;
        }
        long j9 = -1;
        if (i10 == 1) {
            Lr lr = new Lr(8);
            J0 j03 = (J0) p02;
            B a9 = B.a(j03, lr);
            if (a9.f23935a != 1685272116) {
                j03.f25677y = 0;
            } else {
                j03.d(8, false);
                lr.E(0);
                J0 j04 = (J0) p02;
                j04.I(lr.f26233a, 0, 8, false);
                j9 = lr.e();
                j04.b(((int) a9.f23936b) + 8, false);
            }
            this.f25525d = j9;
            this.f25524c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                PA.T(this.f25528g != -1);
                long j10 = this.f25528g - ((J0) p02).f25675w;
                G4 g42 = this.f25526e;
                g42.getClass();
                return g42.b((J0) p02, j10) ? -1 : 0;
            }
            ((J0) p02).f25677y = 0;
            J0 j05 = (J0) p02;
            B u7 = AbstractC2655Lg.u(1684108385, j05, new Lr(8));
            j05.b(8, false);
            Pair create = Pair.create(Long.valueOf(j05.f25675w), Long.valueOf(u7.f23936b));
            this.f25527f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j11 = this.f25525d;
            if (j11 != -1 && longValue == 4294967295L) {
                longValue = j11;
            }
            long j12 = this.f25527f + longValue;
            this.f25528g = j12;
            long j13 = j05.f25674v;
            if (j13 != -1 && j12 > j13) {
                StringBuilder sb = new StringBuilder(String.valueOf(j12).length() + 29 + String.valueOf(j13).length());
                com.anythink.basead.b.c.i.x(sb, "Data exceeds input length: ", j12, ", ");
                sb.append(j13);
                AbstractC3217fl.I("WavExtractor", sb.toString());
                this.f25528g = j13;
                j12 = j13;
            }
            G4 g43 = this.f25526e;
            g43.getClass();
            g43.a(this.f25527f, j12);
            this.f25524c = 4;
            return 0;
        }
        Lr lr2 = new Lr(16);
        J0 j06 = (J0) p02;
        long j14 = AbstractC2655Lg.u(1718449184, j06, lr2).f23936b;
        PA.T(j14 >= 16);
        j06.I(lr2.f26233a, 0, 16, false);
        lr2.E(0);
        int M8 = lr2.M();
        int M9 = lr2.M();
        int i12 = lr2.i();
        lr2.i();
        int M10 = lr2.M();
        int M11 = lr2.M();
        int i13 = ((int) j14) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            ((J0) p02).I(bArr, 0, i13, false);
            if (M8 == 65534) {
                if (i13 != 24) {
                    i = 0;
                    i4 = 65534;
                    bArr2 = bArr;
                    J0 j07 = (J0) p02;
                    j07.b((int) (j07.m() - j07.f25675w), false);
                    J4 j42 = new J4(i4, M9, i12, M10, M11, bArr2, i);
                    if (i4 == 17) {
                    }
                    this.f25524c = 3;
                    return 0;
                }
                Lr lr3 = new Lr(bArr);
                lr3.M();
                int M12 = lr3.M();
                if (M12 != 0 && M12 != M11) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(M11).length() + String.valueOf(M12).length() + 33 + 19);
                    AbstractC5051n.i(sb2, "validBits ( ", M12, ")  != bitsPerSample( ", M11);
                    sb2.append(") are not supported");
                    throw W4.c(sb2.toString());
                }
                int i14 = lr3.i();
                if ((i14 >> 18) != 0 || (i14 != 0 && Integer.bitCount(i14) != M9)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 57 + String.valueOf(M9).length());
                    sb3.append("Channel mask ");
                    sb3.append(i14);
                    sb3.append(" is invalid or does not match channel count ");
                    sb3.append(M9);
                    throw W4.c(sb3.toString());
                }
                int M13 = lr3.M();
                byte[] bArr3 = new byte[14];
                lr3.H(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, AbstractC2655Lg.f26166A) && !Arrays.equals(bArr3, AbstractC2655Lg.f26167B)) {
                    throw W4.c("invalid wav format extension guid");
                }
                i = i14;
                bArr2 = bArr;
                i4 = M13;
                J0 j072 = (J0) p02;
                j072.b((int) (j072.m() - j072.f25675w), false);
                J4 j422 = new J4(i4, M9, i12, M10, M11, bArr2, i);
                if (i4 == 17) {
                    this.f25526e = new F4(this.f25522a, this.f25523b, j422);
                } else if (i4 == 6) {
                    this.f25526e = new H4(this.f25522a, this.f25523b, j422, com.anythink.basead.exoplayer.k.o.f8623x, -1);
                } else if (i4 == 7) {
                    this.f25526e = new H4(this.f25522a, this.f25523b, j422, com.anythink.basead.exoplayer.k.o.f8624y, -1);
                } else {
                    if (i4 != 1) {
                        if (i4 == 3) {
                            b9 = AbstractC3548lu.c(M11, ByteOrder.LITTLE_ENDIAN);
                            i9 = b9;
                            if (i9 == 0) {
                            }
                        } else if (i4 != 65534) {
                            i9 = 0;
                            if (i9 == 0) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i4).length() + 29);
                                sb4.append("Unsupported WAV format type: ");
                                sb4.append(i4);
                                throw W4.c(sb4.toString());
                            }
                            this.f25526e = new H4(this.f25522a, this.f25523b, j422, com.anythink.basead.exoplayer.k.o.f8622w, i9);
                        }
                    }
                    b9 = AbstractC3548lu.b(M11, ByteOrder.LITTLE_ENDIAN);
                    i9 = b9;
                    if (i9 == 0) {
                    }
                }
                this.f25524c = 3;
                return 0;
            }
        } else {
            bArr = AbstractC3548lu.f32614b;
        }
        i = 0;
        i4 = M8;
        bArr2 = bArr;
        J0 j0722 = (J0) p02;
        j0722.b((int) (j0722.m() - j0722.f25675w), false);
        J4 j4222 = new J4(i4, M9, i12, M10, M11, bArr2, i);
        if (i4 == 17) {
        }
        this.f25524c = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
