package A0;

import E.AbstractC0005f;
import T.C0096n;
import T.C0097o;
import T.F;
import W.AbstractC0108a;
import W.J;
import W.u;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import v2.C;
import v2.G;
import v2.I;
import v2.a0;
import v2.r;

/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final I f48a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49b;

    public h(int i4, a0 a0Var) {
        this.f49b = i4;
        this.f48a = a0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static h b(int i4, u uVar) {
        a iVar;
        String str;
        int i5 = 4;
        r.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i6 = uVar.f3353c;
        int i7 = -2;
        int i8 = 0;
        while (uVar.a() > 8) {
            int o = uVar.o();
            int o4 = uVar.f3352b + uVar.o();
            uVar.L(o4);
            if (o != 1414744396) {
                f fVar = null;
                switch (o) {
                    case 1718776947:
                        if (i7 == 2) {
                            uVar.N(i5);
                            int o5 = uVar.o();
                            int o6 = uVar.o();
                            uVar.N(i5);
                            int o7 = uVar.o();
                            switch (o7) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                C0096n c0096n = new C0096n();
                                c0096n.f2836t = o5;
                                c0096n.f2837u = o6;
                                c0096n.f2831m = F.n(str);
                                iVar = new i(new C0097o(c0096n));
                                break;
                            } else {
                                AbstractC0005f.u(o7, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                iVar = fVar;
                                break;
                            }
                        } else {
                            if (i7 == 1) {
                                int s4 = uVar.s();
                                String str2 = s4 != 1 ? s4 != 85 ? s4 != 255 ? s4 != 8192 ? s4 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int s5 = uVar.s();
                                    int o8 = uVar.o();
                                    uVar.N(6);
                                    int s6 = uVar.s();
                                    String str3 = J.f3263a;
                                    int B4 = J.B(s6, ByteOrder.LITTLE_ENDIAN);
                                    int s7 = uVar.a() > 0 ? uVar.s() : 0;
                                    C0096n c0096n2 = new C0096n();
                                    c0096n2.f2831m = F.n(str2);
                                    c0096n2.f2810E = s5;
                                    c0096n2.f2811F = o8;
                                    if (str2.equals("audio/raw") && B4 != 0) {
                                        c0096n2.f2812G = B4;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && s7 > 0) {
                                        byte[] bArr = new byte[s7];
                                        uVar.k(bArr, 0, s7);
                                        c0096n2.f2832p = I.o(bArr);
                                    }
                                    iVar = new i(new C0097o(c0096n2));
                                    break;
                                } else {
                                    AbstractC0005f.u(s4, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                AbstractC0108a.s("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + J.E(i7));
                            }
                            iVar = fVar;
                        }
                    case 1751742049:
                        int o9 = uVar.o();
                        uVar.N(8);
                        int o10 = uVar.o();
                        int o11 = uVar.o();
                        uVar.N(i5);
                        uVar.o();
                        uVar.N(12);
                        iVar = new e(o9, o10, o11);
                        break;
                    case 1752331379:
                        int o12 = uVar.o();
                        uVar.N(12);
                        uVar.o();
                        int o13 = uVar.o();
                        int o14 = uVar.o();
                        uVar.N(i5);
                        int o15 = uVar.o();
                        int o16 = uVar.o();
                        uVar.N(i5);
                        fVar = new f(o12, o13, o14, o15, o16, uVar.o());
                        iVar = fVar;
                        break;
                    case 1852994675:
                        iVar = new j(uVar.x(uVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        iVar = fVar;
                        break;
                }
            } else {
                iVar = b(uVar.o(), uVar);
            }
            if (iVar != null) {
                if (iVar.getType() == 1752331379) {
                    i7 = ((f) iVar).a();
                }
                int i9 = i8 + 1;
                int e4 = C.e(objArr.length, i9);
                if (e4 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, e4);
                }
                objArr[i8] = iVar;
                i8 = i9;
            }
            uVar.M(o4);
            uVar.L(i6);
            i5 = 4;
        }
        return new h(i4, I.i(i8, objArr));
    }

    public final a a(Class cls) {
        G listIterator = this.f48a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // A0.a
    public final int getType() {
        return this.f49b;
    }
}
