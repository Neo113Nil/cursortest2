package T0;

import T.C0096n;
import T.C0097o;
import T.E;
import T.F;
import W.u;
import java.util.ArrayList;
import java.util.Arrays;
import v2.I;
import y0.AbstractC1569a;

/* loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f2933p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(u uVar, byte[] bArr) {
        if (uVar.a() < bArr.length) {
            return false;
        }
        int i4 = uVar.f3352b;
        byte[] bArr2 = new byte[bArr.length];
        uVar.k(bArr2, 0, bArr.length);
        uVar.M(i4);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // T0.i
    public final long b(u uVar) {
        byte[] bArr = uVar.f3351a;
        return (this.f2942i * AbstractC1569a.o(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // T0.i
    public final boolean c(u uVar, long j4, l2.e eVar) {
        if (e(uVar, o)) {
            byte[] copyOf = Arrays.copyOf(uVar.f3351a, uVar.f3353c);
            int i4 = copyOf[9] & 255;
            ArrayList c4 = AbstractC1569a.c(copyOf);
            if (((C0097o) eVar.f14270b) == null) {
                C0096n c0096n = new C0096n();
                c0096n.f2830l = F.n("audio/ogg");
                c0096n.f2831m = F.n("audio/opus");
                c0096n.f2810E = i4;
                c0096n.f2811F = 48000;
                c0096n.f2832p = c4;
                eVar.f14270b = new C0097o(c0096n);
                return true;
            }
        } else {
            if (!e(uVar, f2933p)) {
                ((C0097o) eVar.f14270b).getClass();
                return false;
            }
            ((C0097o) eVar.f14270b).getClass();
            if (!this.n) {
                this.n = true;
                uVar.N(8);
                E w4 = AbstractC1569a.w(I.l((String[]) AbstractC1569a.z(uVar, false, false).f8416a));
                if (w4 != null) {
                    C0096n a3 = ((C0097o) eVar.f14270b).a();
                    a3.f2829k = w4.b(((C0097o) eVar.f14270b).f2867l);
                    eVar.f14270b = new C0097o(a3);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // T0.i
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
