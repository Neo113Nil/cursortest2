package T0;

import T.C0096n;
import T.C0097o;
import T.F;
import W.u;
import d2.C0389g;
import java.util.Arrays;
import y0.AbstractC1569a;
import y0.r;

/* loaded from: classes.dex */
public final class c extends i {
    public r n;
    public S0.d o;

    @Override // T0.i
    public final long b(u uVar) {
        byte[] bArr = uVar.f3351a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i4 = (bArr[2] & 255) >> 4;
        if (i4 == 6 || i4 == 7) {
            uVar.N(4);
            uVar.H();
        }
        int x4 = AbstractC1569a.x(i4, uVar);
        uVar.M(0);
        return x4;
    }

    @Override // T0.i
    public final boolean c(u uVar, long j4, l2.e eVar) {
        byte[] bArr = uVar.f3351a;
        r rVar = this.n;
        if (rVar == null) {
            r rVar2 = new r(17, bArr);
            this.n = rVar2;
            C0096n a3 = rVar2.c(Arrays.copyOfRange(bArr, 9, uVar.f3353c), null).a();
            a3.f2830l = F.n("audio/ogg");
            eVar.f14270b = new C0097o(a3);
            return true;
        }
        byte b4 = bArr[0];
        if ((b4 & Byte.MAX_VALUE) != 3) {
            if (b4 != -1) {
                return true;
            }
            S0.d dVar = this.o;
            if (dVar != null) {
                dVar.f2407a = j4;
                eVar.f14271c = dVar;
            }
            ((C0097o) eVar.f14270b).getClass();
            return false;
        }
        C0389g y4 = AbstractC1569a.y(uVar);
        r rVar3 = new r(rVar.f16183a, rVar.f16184b, rVar.f16185c, rVar.f16186d, rVar.f16187e, rVar.f16189g, rVar.f16190h, rVar.f16192j, y4, rVar.f16194l);
        this.n = rVar3;
        S0.d dVar2 = new S0.d();
        dVar2.f2409c = rVar3;
        dVar2.f2410d = y4;
        dVar2.f2407a = -1L;
        dVar2.f2408b = -1L;
        this.o = dVar2;
        return true;
    }

    @Override // T0.i
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
