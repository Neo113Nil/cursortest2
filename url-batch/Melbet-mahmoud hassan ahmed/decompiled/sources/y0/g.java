package y0;

import m4.q;
import o2.a0;
import o2.m0;
import o2.r;
import r0.s1;

/* loaded from: classes.dex */
final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f23240a;

    public g(s1 s1Var) {
        this.f23240a = s1Var;
    }

    private static String a(int i7) {
        switch (i7) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i7) {
        if (i7 == 1) {
            return "audio/raw";
        }
        if (i7 == 85) {
            return "audio/mpeg";
        }
        if (i7 == 255) {
            return "audio/mp4a-latm";
        }
        if (i7 == 8192) {
            return "audio/ac3";
        }
        if (i7 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static a c(a0 a0Var) {
        a0Var.P(4);
        int p7 = a0Var.p();
        int p8 = a0Var.p();
        a0Var.P(4);
        int p9 = a0Var.p();
        String a7 = a(p9);
        if (a7 != null) {
            s1.b bVar = new s1.b();
            bVar.j0(p7).Q(p8).e0(a7);
            return new g(bVar.E());
        }
        r.i("StreamFormatChunk", "Ignoring track with unsupported compression " + p9);
        return null;
    }

    public static a d(int i7, a0 a0Var) {
        if (i7 == 2) {
            return c(a0Var);
        }
        if (i7 == 1) {
            return e(a0Var);
        }
        r.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + m0.k0(i7));
        return null;
    }

    private static a e(a0 a0Var) {
        int u6 = a0Var.u();
        String b7 = b(u6);
        if (b7 == null) {
            r.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + u6);
            return null;
        }
        int u7 = a0Var.u();
        int p7 = a0Var.p();
        a0Var.P(6);
        int b02 = m0.b0(a0Var.I());
        int u8 = a0Var.u();
        byte[] bArr = new byte[u8];
        a0Var.j(bArr, 0, u8);
        s1.b bVar = new s1.b();
        bVar.e0(b7).H(u7).f0(p7);
        if ("audio/raw".equals(b7) && b02 != 0) {
            bVar.Y(b02);
        }
        if ("audio/mp4a-latm".equals(b7) && u8 > 0) {
            bVar.T(q.y(bArr));
        }
        return new g(bVar.E());
    }

    @Override // y0.a
    public int getType() {
        return 1718776947;
    }
}
