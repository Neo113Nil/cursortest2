package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.yb0;

/* loaded from: classes3.dex */
final class gr0 implements InterfaceC2301vh {

    /* renamed from: a, reason: collision with root package name */
    public final sj0<InterfaceC2301vh> f26277a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26278b;

    private gr0(int i4, sj0<InterfaceC2301vh> sj0Var) {
        this.f26278b = i4;
        this.f26277a = sj0Var;
    }

    public final <T extends InterfaceC2301vh> T a(Class<T> cls) {
        y72<InterfaceC2301vh> listIterator = this.f26277a.listIterator(0);
        while (listIterator.hasNext()) {
            T t4 = (T) listIterator.next();
            if (t4.getClass() == cls) {
                return t4;
            }
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2301vh
    public final int getType() {
        return this.f26278b;
    }

    public static gr0 a(int i4, sf1 sf1Var) {
        String str;
        InterfaceC2301vh k22Var;
        String str2;
        sj0.a aVar = new sj0.a();
        int e4 = sf1Var.e();
        int i5 = -2;
        while (sf1Var.a() > 8) {
            int k4 = sf1Var.k();
            int d4 = sf1Var.d() + sf1Var.k();
            sf1Var.d(d4);
            if (k4 == 1414744396) {
                k22Var = a(sf1Var.k(), sf1Var);
            } else if (k4 != 1718776947) {
                if (k4 == 1751742049) {
                    k22Var = C2347xh.a(sf1Var);
                } else if (k4 != 1752331379) {
                    if (k4 == 1852994675) {
                        k22Var = m22.a(sf1Var);
                    }
                    k22Var = null;
                } else {
                    k22Var = C2370yh.a(sf1Var);
                }
            } else if (i5 == 2) {
                sf1Var.f(4);
                int k5 = sf1Var.k();
                int k6 = sf1Var.k();
                sf1Var.f(4);
                int k7 = sf1Var.k();
                switch (k7) {
                    case 808802372:
                    case 877677894:
                    case 1145656883:
                    case 1145656920:
                    case 1482049860:
                    case 1684633208:
                    case 2021026148:
                        str2 = "video/mp4v-es";
                        break;
                    case 826496577:
                    case 828601953:
                    case 875967048:
                        str2 = "video/avc";
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
                if (str2 == null) {
                    fr0.a("Ignoring track with unsupported compression ", k7, "StreamFormatChunk");
                    k22Var = null;
                } else {
                    yb0.a aVar2 = new yb0.a();
                    aVar2.o(k5).f(k6).e(str2);
                    k22Var = new k22(aVar2.a());
                }
            } else {
                if (i5 == 1) {
                    int o4 = sf1Var.o();
                    if (o4 == 1) {
                        str = "audio/raw";
                    } else if (o4 == 85) {
                        str = "audio/mpeg";
                    } else if (o4 == 255) {
                        str = "audio/mp4a-latm";
                    } else if (o4 != 8192) {
                        str = o4 != 8193 ? null : "audio/vnd.dts";
                    } else {
                        str = "audio/ac3";
                    }
                    if (str == null) {
                        fr0.a("Ignoring track with unsupported format tag ", o4, "StreamFormatChunk");
                    } else {
                        int o5 = sf1Var.o();
                        int k8 = sf1Var.k();
                        sf1Var.f(6);
                        int b4 = u82.b(sf1Var.z());
                        int o6 = sf1Var.o();
                        byte[] bArr = new byte[o6];
                        sf1Var.a(bArr, 0, o6);
                        yb0.a aVar3 = new yb0.a();
                        aVar3.e(str).c(o5).l(k8);
                        if ("audio/raw".equals(str) && b4 != 0) {
                            aVar3.i(b4);
                        }
                        if ("audio/mp4a-latm".equals(str) && o6 > 0) {
                            aVar3.a(sj0.a(bArr));
                        }
                        k22Var = new k22(aVar3.a());
                    }
                } else {
                    ms0.d("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + u82.d(i5));
                }
                k22Var = null;
            }
            if (k22Var != null) {
                if (k22Var.getType() == 1752331379) {
                    C2370yh c2370yh = (C2370yh) k22Var;
                    int i6 = c2370yh.f35132a;
                    if (i6 == 1935960438) {
                        i5 = 2;
                    } else if (i6 == 1935963489) {
                        i5 = 1;
                    } else if (i6 != 1937012852) {
                        ms0.d("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(c2370yh.f35132a));
                        i5 = -1;
                    } else {
                        i5 = 3;
                    }
                }
                aVar.b(k22Var);
            }
            sf1Var.e(d4);
            sf1Var.d(e4);
        }
        return new gr0(i4, aVar.a());
    }
}
