package D0;

import W.u;
import java.nio.ByteOrder;
import y0.AbstractC1569a;
import y0.h;
import y0.i;
import y0.o;
import y0.r;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final r f332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f333b;

    /* renamed from: c, reason: collision with root package name */
    public final T.r f334c = new T.r();

    public b(r rVar, int i4) {
        this.f332a = rVar;
        this.f333b = i4;
    }

    public final long a(o oVar) {
        T.r rVar;
        r rVar2;
        int s4;
        while (true) {
            long m4 = oVar.m();
            long length = oVar.getLength() - 6;
            rVar = this.f334c;
            rVar2 = this.f332a;
            if (m4 >= length) {
                break;
            }
            long m5 = oVar.m();
            u uVar = new u(17);
            int i4 = 0;
            boolean d4 = false;
            oVar.E(uVar.f3351a, 0, 2);
            char g4 = uVar.g(0, ByteOrder.BIG_ENDIAN);
            int i5 = this.f333b;
            if (g4 != i5) {
                oVar.u();
                oVar.o((int) (m5 - oVar.getPosition()));
            } else {
                byte[] bArr = uVar.f3351a;
                while (i4 < 15 && (s4 = oVar.s(bArr, 2 + i4, 15 - i4)) != -1) {
                    i4 += s4;
                }
                uVar.L(i4 + 2);
                oVar.u();
                oVar.o((int) (m5 - oVar.getPosition()));
                d4 = AbstractC1569a.d(uVar, rVar2, i5, rVar);
            }
            if (d4) {
                break;
            }
            oVar.o(1);
        }
        if (oVar.m() < oVar.getLength() - 6) {
            return rVar.f2881a;
        }
        oVar.o((int) (oVar.getLength() - oVar.m()));
        return rVar2.f16192j;
    }

    @Override // y0.i
    public final h j(o oVar, long j4) {
        long position = oVar.getPosition();
        long a3 = a(oVar);
        long m4 = oVar.m();
        oVar.o(Math.max(6, this.f332a.f16185c));
        long a4 = a(oVar);
        return (a3 > j4 || a4 <= j4) ? a4 <= j4 ? new h(-2, a4, oVar.m()) : new h(-1, a3, position) : new h(0, -9223372036854775807L, m4);
    }
}
