package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class Q3 implements InterfaceC3774q3 {

    /* renamed from: x, reason: collision with root package name */
    public static final C3558m3 f27110x;

    /* renamed from: n, reason: collision with root package name */
    public final Lr f27111n = new Lr();

    /* renamed from: u, reason: collision with root package name */
    public final Lr f27112u = new Lr();

    /* renamed from: v, reason: collision with root package name */
    public final P3 f27113v;

    /* renamed from: w, reason: collision with root package name */
    public Inflater f27114w;

    static {
        SB sb = UB.f27942u;
        f27110x = new C3558m3(C3675oC.f33115x, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b);
    }

    public Q3(List list) {
        int i;
        P3 p32 = new P3();
        this.f27113v = p32;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = AbstractC3548lu.f32613a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                p32.f26829f = new int[split.length];
                for (int i4 = 0; i4 < split.length; i4++) {
                    int[] iArr = p32.f26829f;
                    try {
                        i = Integer.parseInt(split[i4].trim(), 16);
                    } catch (RuntimeException e6) {
                        AbstractC3217fl.O("VobsubParser", "Parsing color failed", e6);
                        i = 0;
                    }
                    iArr[i4] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    StringBuilder sb = new StringBuilder(str2.length() + 36);
                    sb.append("Ignoring malformed IDX size line: '");
                    sb.append(str2);
                    sb.append("'");
                    AbstractC3217fl.I("VobsubParser", sb.toString());
                } else {
                    try {
                        p32.f26830g = Integer.parseInt(split2[0]);
                        p32.f26831h = Integer.parseInt(split2[1]);
                        p32.f26827d = true;
                    } catch (RuntimeException e9) {
                        AbstractC3217fl.O("VobsubParser", "Parsing IDX failed", e9);
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x00bd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02af  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3774q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(byte[] bArr, int i, int i4, X1.b bVar) {
        C3558m3 c3558m3;
        int i9;
        long j9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        C2522Dj c2522Dj;
        long j11;
        long j12;
        Rect rect;
        Lr lr = this.f27111n;
        lr.z(i + i4, bArr);
        lr.E(i);
        if (this.f27114w == null) {
            this.f27114w = new Inflater();
        }
        Inflater inflater = this.f27114w;
        Lr lr2 = this.f27112u;
        if (AbstractC3548lu.i(lr, lr2, inflater)) {
            lr.z(lr2.f26235c, lr2.f26233a);
        }
        P3 p32 = this.f27113v;
        long j13 = com.anythink.basead.exoplayer.b.f6539b;
        p32.f26825b = com.anythink.basead.exoplayer.b.f6539b;
        p32.f26826c = com.anythink.basead.exoplayer.b.f6539b;
        int i14 = 0;
        p32.f26828e = false;
        p32.i = null;
        p32.f26832j = -1;
        p32.f26833k = -1;
        int B8 = lr.B();
        if (B8 < 2 || lr.L() != B8) {
            c3558m3 = f27110x;
        } else {
            int i15 = 1;
            if (p32.f26829f == null) {
                AbstractC3217fl.I("VobsubParser", "Skipping SPU (no palette)");
            } else if (p32.f26827d) {
                int i16 = lr.f26234b - 2;
                lr.E(lr.L() + i16);
                while (true) {
                    int i17 = 4;
                    if (lr.B() < 4) {
                        i9 = i14;
                        i11 = i9;
                        j9 = j13;
                    } else {
                        int i18 = lr.f26234b;
                        int L8 = lr.L() * 10000;
                        int L9 = lr.L() + i16;
                        i9 = (L9 == i18 || L9 >= lr.f26235c) ? i14 : i15;
                        if (i9 != 0) {
                            j9 = j13;
                            i10 = L9;
                        } else {
                            j9 = j13;
                            i10 = lr.f26235c;
                        }
                        int i19 = i15;
                        while (lr.f26234b < i10 && i19 != 0) {
                            long j14 = L8;
                            int i20 = i14;
                            int K8 = lr.K();
                            if (K8 != 255) {
                                int[] iArr = p32.f26824a;
                                switch (K8) {
                                    case 0:
                                        i14 = i20;
                                        i19 = 1;
                                        i15 = 1;
                                        break;
                                    case 1:
                                        p32.f26825b = j14;
                                        i14 = i20;
                                        i19 = 1;
                                        i15 = 1;
                                        i17 = 4;
                                        break;
                                    case 2:
                                        p32.f26826c = j14;
                                        i14 = i20;
                                        i19 = 1;
                                        i15 = 1;
                                        i17 = 4;
                                        break;
                                    case 3:
                                        boolean z8 = i15;
                                        if (lr.B() < 2) {
                                            AbstractC3217fl.I("VobsubParser", "Incomplete color command");
                                            i13 = z8;
                                            i14 = i20;
                                            i19 = i14;
                                            i15 = i13;
                                            i17 = 4;
                                            break;
                                        } else {
                                            int K9 = lr.K();
                                            int K10 = lr.K();
                                            int[] iArr2 = p32.f26829f;
                                            int i21 = K9 >> 4;
                                            if (i21 >= iArr2.length) {
                                                i21 = i20;
                                            }
                                            iArr[3] = iArr2[i21];
                                            int i22 = K9 & 15;
                                            if (i22 >= iArr2.length) {
                                                i22 = i20;
                                            }
                                            iArr[2] = iArr2[i22];
                                            int i23 = K10 >> 4;
                                            if (i23 >= iArr2.length) {
                                                i23 = i20;
                                            }
                                            iArr[z8 ? 1 : 0] = iArr2[i23];
                                            int i24 = K10 & 15;
                                            if (i24 >= iArr2.length) {
                                                i24 = i20;
                                            }
                                            iArr[i20] = iArr2[i24];
                                            p32.f26828e = z8;
                                            i14 = i20;
                                            i19 = 1;
                                            i15 = 1;
                                            i17 = 4;
                                        }
                                    case 4:
                                        int i25 = i15;
                                        if (lr.B() >= 2) {
                                            if (p32.f26828e) {
                                                int K11 = lr.K();
                                                int K12 = lr.K();
                                                iArr[3] = P3.a(iArr[3], K11 >> 4);
                                                iArr[2] = P3.a(iArr[2], K11 & 15);
                                                iArr[i25 == true ? 1 : 0] = P3.a(iArr[i25 == true ? 1 : 0], K12 >> 4);
                                                iArr[i20] = P3.a(iArr[i20], K12 & 15);
                                                i12 = i25;
                                                i14 = i20;
                                                i19 = i12;
                                                i15 = i19;
                                                i17 = 4;
                                                break;
                                            } else {
                                                AbstractC3217fl.I("VobsubParser", "Ignoring alpha command before color command");
                                                i13 = i25;
                                            }
                                        } else {
                                            AbstractC3217fl.I("VobsubParser", "Incomplete alpha command");
                                            i13 = i25;
                                        }
                                        i14 = i20;
                                        i19 = i14;
                                        i15 = i13;
                                        i17 = 4;
                                    case 5:
                                        if (lr.B() >= 6) {
                                            int K13 = lr.K();
                                            int K14 = lr.K();
                                            int i26 = K14 >> 4;
                                            int K15 = ((K14 & 15) << 8) | lr.K();
                                            int K16 = lr.K();
                                            int K17 = lr.K();
                                            i12 = i15;
                                            p32.i = new Rect((K13 << i17) | i26, (K16 << i17) | (K17 >> 4), K15 + i15, (((K17 & 15) << 8) | lr.K()) + 1);
                                            i14 = i20;
                                            i19 = i12;
                                            i15 = i19;
                                            i17 = 4;
                                            break;
                                        } else {
                                            AbstractC3217fl.I("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (lr.B() >= i17) {
                                            p32.f26832j = lr.L();
                                            p32.f26833k = lr.L();
                                            i19 = i15;
                                            i14 = i20;
                                            break;
                                        } else {
                                            AbstractC3217fl.I("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        com.anythink.basead.b.c.i.s(K8, "Unrecognized command: ", "VobsubParser", new StringBuilder(String.valueOf(K8).length() + 22));
                                        break;
                                }
                            }
                            i14 = i20;
                            i19 = i14;
                        }
                        i11 = i14;
                        if (i9 != 0) {
                            lr.E(L9);
                        }
                    }
                    if (i9 == 0) {
                        j10 = p32.f26826c;
                        if (p32.f26829f != null || !p32.f26827d || !p32.f26828e || (rect = p32.i) == null || p32.f26832j == -1 || p32.f26833k == -1 || rect.width() < 2 || p32.i.height() < 2) {
                            c2522Dj = null;
                        } else {
                            Rect rect2 = p32.i;
                            int[] iArr3 = new int[rect2.height() * rect2.width()];
                            Er er = new Er();
                            lr.E(p32.f26832j);
                            er.a(lr);
                            p32.b(er, true, rect2, iArr3);
                            lr.E(p32.f26833k);
                            er.a(lr);
                            p32.b(er, i11, rect2, iArr3);
                            c2522Dj = new C2522Dj(null, null, null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / p32.f26831h, 0, 0, rect2.left / p32.f26830g, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / p32.f26830g, rect2.height() / p32.f26831h, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        if (j10 == j9) {
                            long j15 = p32.f26825b;
                            if (j15 != j9) {
                                long j16 = p32.f26826c;
                                if (j16 > j15) {
                                    j12 = j16 - j15;
                                    j11 = j12;
                                }
                            }
                            j12 = p32.f26826c;
                            j11 = j12;
                        } else {
                            j11 = j9;
                        }
                        c3558m3 = new C3558m3(c2522Dj == null ? UB.j(c2522Dj) : C3675oC.f33115x, p32.f26825b, j11);
                    } else {
                        j13 = j9;
                        i14 = i11;
                        i15 = 1;
                    }
                }
            } else {
                AbstractC3217fl.I("VobsubParser", "Skipping SPU (no plane)");
            }
            i11 = 0;
            j9 = -9223372036854775807L;
            j10 = p32.f26826c;
            if (p32.f26829f != null) {
            }
            c2522Dj = null;
            if (j10 == j9) {
            }
            c3558m3 = new C3558m3(c2522Dj == null ? UB.j(c2522Dj) : C3675oC.f33115x, p32.f26825b, j11);
        }
        bVar.mo2b(c3558m3);
    }
}
