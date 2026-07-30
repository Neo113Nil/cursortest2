package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.d.d;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3933t1 implements InterfaceC3664o1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3675oC f34334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34335b;

    public C3933t1(int i, C3675oC c3675oC) {
        this.f34335b = i;
        this.f34334a = c3675oC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3933t1 b(int i, Lr lr) {
        int i4;
        String str;
        InterfaceC3664o1 c4041v1;
        String str2;
        int i9 = 1;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = lr.f26235c;
        int i11 = -2;
        int i12 = 0;
        while (lr.B() > 8) {
            int c4 = lr.c();
            int c9 = lr.f26234b + lr.c();
            lr.C(c9);
            if (c4 == 1414744396) {
                c4041v1 = b(lr.c(), lr);
            } else {
                C3825r1 c3825r1 = null;
                switch (c4) {
                    case 1718776947:
                        if (i11 != 2) {
                            if (i11 != i9) {
                                i4 = i9;
                                String str3 = AbstractC3548lu.f32613a;
                                switch (i11) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = com.anythink.core.common.v.m.f16967e;
                                        break;
                                    case 0:
                                        str = com.anythink.core.express.b.a.f17688f;
                                        break;
                                    case 1:
                                        str = com.anythink.basead.exoplayer.k.o.f8602b;
                                        break;
                                    case 2:
                                        str = com.anythink.basead.exoplayer.k.o.f8601a;
                                        break;
                                    case 3:
                                        str = com.anythink.basead.exoplayer.k.o.f8603c;
                                        break;
                                    case 4:
                                        str = d.c.f18793e;
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                AbstractC3217fl.I("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                                c4041v1 = c3825r1;
                                break;
                            } else {
                                int M8 = lr.M();
                                String str4 = M8 != i9 ? M8 != 85 ? M8 != 255 ? M8 != 8192 ? M8 != 8193 ? null : com.anythink.basead.exoplayer.k.o.f8580D : com.anythink.basead.exoplayer.k.o.f8625z : com.anythink.basead.exoplayer.k.o.f8617r : com.anythink.basead.exoplayer.k.o.f8619t : com.anythink.basead.exoplayer.k.o.f8622w;
                                if (str4 != null) {
                                    int M9 = lr.M();
                                    int c10 = lr.c();
                                    lr.G(6);
                                    int b9 = AbstractC3548lu.b(lr.M(), ByteOrder.LITTLE_ENDIAN);
                                    int M10 = lr.B() > 0 ? lr.M() : 0;
                                    i4 = i9;
                                    C4065vP c4065vP = new C4065vP();
                                    c4065vP.e(str4);
                                    c4065vP.f34765F = M9;
                                    c4065vP.f34767H = c10;
                                    if (str4.equals(com.anythink.basead.exoplayer.k.o.f8622w) && b9 != 0) {
                                        c4065vP.f34768I = b9;
                                    }
                                    if (str4.equals(com.anythink.basead.exoplayer.k.o.f8617r) && M10 > 0) {
                                        byte[] bArr = new byte[M10];
                                        lr.H(bArr, 0, M10);
                                        c4065vP.f34788q = UB.j(bArr);
                                    }
                                    c4041v1 = new C4041v1(new TP(c4065vP));
                                    break;
                                } else {
                                    com.anythink.basead.b.c.i.s(M8, "Ignoring track with unsupported format tag ", "StreamFormatChunk", new StringBuilder(String.valueOf(M8).length() + 43));
                                }
                            }
                        } else {
                            lr.G(4);
                            int c11 = lr.c();
                            int c12 = lr.c();
                            lr.G(4);
                            int c13 = lr.c();
                            switch (c13) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = com.anythink.basead.exoplayer.k.o.f8611l;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = com.anythink.basead.exoplayer.k.o.f8608h;
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                C4065vP c4065vP2 = new C4065vP();
                                c4065vP2.f34792u = c11;
                                c4065vP2.f34793v = c12;
                                c4065vP2.e(str2);
                                c4041v1 = new C4041v1(new TP(c4065vP2));
                                break;
                            } else {
                                com.anythink.basead.b.c.i.s(c13, "Ignoring track with unsupported compression ", "StreamFormatChunk", new StringBuilder(String.valueOf(c13).length() + 44));
                            }
                        }
                        i4 = i9;
                        c4041v1 = c3825r1;
                    case 1751742049:
                        int c14 = lr.c();
                        lr.G(8);
                        int c15 = lr.c();
                        int c16 = lr.c();
                        lr.G(4);
                        lr.c();
                        lr.G(12);
                        i4 = i9;
                        c4041v1 = new C3772q1(c14, c15, c16);
                        break;
                    case 1752331379:
                        int c17 = lr.c();
                        lr.G(12);
                        lr.c();
                        int c18 = lr.c();
                        int c19 = lr.c();
                        lr.G(4);
                        int c20 = lr.c();
                        int c21 = lr.c();
                        lr.G(4);
                        c3825r1 = new C3825r1(c17, c18, c19, c20, c21, lr.c());
                        i4 = i9;
                        c4041v1 = c3825r1;
                        break;
                    case 1852994675:
                        c4041v1 = new C4095w1(lr.k(lr.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        i4 = i9;
                        c4041v1 = c3825r1;
                        break;
                }
                if (c4041v1 != null) {
                    if (c4041v1.a() == 1752331379) {
                        i11 = ((C3825r1) c4041v1).b();
                    }
                    int length = objArr.length;
                    int i13 = i12 + 1;
                    int d2 = PB.d(length, i13);
                    if (d2 > length) {
                        objArr = Arrays.copyOf(objArr, d2);
                    }
                    objArr[i12] = c4041v1;
                    i12 = i13;
                }
                lr.E(c9);
                lr.C(i10);
                i9 = i4;
            }
            i4 = i9;
            if (c4041v1 != null) {
            }
            lr.E(c9);
            lr.C(i10);
            i9 = i4;
        }
        return new C3933t1(i, UB.p(objArr, i12));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3664o1
    public final int a() {
        return this.f34335b;
    }

    public final InterfaceC3664o1 c(Class cls) {
        C3675oC c3675oC = this.f34334a;
        int i = c3675oC.f33117w;
        int i4 = 0;
        while (i4 < i) {
            InterfaceC3664o1 interfaceC3664o1 = (InterfaceC3664o1) c3675oC.get(i4);
            i4++;
            if (interfaceC3664o1.getClass() == cls) {
                return interfaceC3664o1;
            }
        }
        return null;
    }
}
