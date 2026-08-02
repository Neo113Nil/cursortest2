package g1;

import E.AbstractC0005f;
import T.G;
import W.AbstractC0108a;
import W.u;
import y0.o;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9028a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f9029b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(o oVar) {
        u uVar = new u(8);
        int i4 = e.b(oVar, uVar).f9026a;
        if (i4 != 1380533830 && i4 != 1380333108) {
            return false;
        }
        oVar.E(uVar.f3351a, 0, 4);
        uVar.M(0);
        int m4 = uVar.m();
        if (m4 == 1463899717) {
            return true;
        }
        AbstractC0108a.e("WavHeaderReader", "Unsupported form type: " + m4);
        return false;
    }

    public static e b(int i4, o oVar, u uVar) {
        e b4 = e.b(oVar, uVar);
        while (true) {
            int i5 = b4.f9026a;
            if (i5 == i4) {
                return b4;
            }
            AbstractC0005f.u(i5, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j4 = b4.f9027b;
            long j5 = 8 + j4;
            if (j4 % 2 != 0) {
                j5 = 9 + j4;
            }
            if (j5 > 2147483647L) {
                throw G.c("Chunk is too large (~2GB+) to skip; id: " + i5);
            }
            oVar.v((int) j5);
            b4 = e.b(oVar, uVar);
        }
    }
}
