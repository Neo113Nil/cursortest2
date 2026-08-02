package T0;

import T.C0097o;
import T.G;
import T.r;
import W.J;
import W.u;
import java.util.Arrays;
import y0.AbstractC1569a;
import y0.F;
import y0.n;
import y0.o;
import y0.p;
import y0.y;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public p f2918a;

    /* renamed from: b, reason: collision with root package name */
    public i f2919b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2920c;

    @Override // y0.n
    public final void a(long j4, long j5) {
        i iVar = this.f2919b;
        if (iVar != null) {
            e eVar = iVar.f2934a;
            f fVar = eVar.f2921a;
            fVar.f2926a = 0;
            fVar.f2927b = 0L;
            fVar.f2928c = 0;
            fVar.f2929d = 0;
            fVar.f2930e = 0;
            eVar.f2922b.J(0);
            eVar.f2923c = -1;
            eVar.f2925e = false;
            if (j4 == 0) {
                iVar.d(!iVar.f2945l);
                return;
            }
            if (iVar.f2941h != 0) {
                long j6 = (iVar.f2942i * j5) / 1000000;
                iVar.f2938e = j6;
                g gVar = iVar.f2937d;
                String str = J.f3263a;
                gVar.e(j6);
                iVar.f2941h = 2;
            }
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        try {
            return f(oVar);
        } catch (G unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, r rVar) {
        int i4;
        byte[] bArr;
        this.f2918a.getClass();
        if (this.f2919b == null) {
            if (!f(oVar)) {
                throw G.a(null, "Failed to determine bitstream type");
            }
            oVar.u();
        }
        if (!this.f2920c) {
            F z = this.f2918a.z(0, 1);
            this.f2918a.r();
            i iVar = this.f2919b;
            iVar.f2936c = this.f2918a;
            iVar.f2935b = z;
            iVar.d(true);
            this.f2920c = true;
        }
        i iVar2 = this.f2919b;
        e eVar = iVar2.f2934a;
        iVar2.f2935b.getClass();
        String str = J.f3263a;
        int i5 = iVar2.f2941h;
        int i6 = -1;
        int i7 = 3;
        if (i5 != 0) {
            if (i5 == 1) {
                oVar.v((int) iVar2.f2939f);
                iVar2.f2941h = 2;
                return 0;
            }
            if (i5 != 2) {
                if (i5 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long b4 = iVar2.f2937d.b(oVar);
            if (b4 >= 0) {
                rVar.f2881a = b4;
                return 1;
            }
            if (b4 < -1) {
                iVar2.a(-(b4 + 2));
            }
            if (!iVar2.f2945l) {
                y d4 = iVar2.f2937d.d();
                d4.getClass();
                iVar2.f2936c.x(d4);
                iVar2.f2935b.c(d4.g());
                iVar2.f2945l = true;
            }
            if (iVar2.f2944k <= 0 && !eVar.b(oVar)) {
                iVar2.f2941h = 3;
                return -1;
            }
            iVar2.f2944k = 0L;
            u uVar = eVar.f2922b;
            long b5 = iVar2.b(uVar);
            if (b5 >= 0) {
                long j4 = iVar2.f2940g;
                if (j4 + b5 >= iVar2.f2938e) {
                    iVar2.f2935b.a(uVar.f3353c, uVar);
                    iVar2.f2935b.e((j4 * 1000000) / iVar2.f2942i, 1, uVar.f3353c, 0, null);
                    iVar2.f2938e = -1L;
                }
            }
            iVar2.f2940g += b5;
            return 0;
        }
        while (true) {
            boolean b6 = eVar.b(oVar);
            u uVar2 = eVar.f2922b;
            if (!b6) {
                iVar2.f2941h = i7;
                return i6;
            }
            long position = oVar.getPosition();
            long j5 = iVar2.f2939f;
            iVar2.f2944k = position - j5;
            if (iVar2.c(uVar2, j5, iVar2.f2943j)) {
                iVar2.f2939f = oVar.getPosition();
                i6 = -1;
                i7 = 3;
            } else {
                C0097o c0097o = (C0097o) iVar2.f2943j.f14270b;
                iVar2.f2942i = c0097o.f2847G;
                if (!iVar2.f2946m) {
                    iVar2.f2935b.d(c0097o);
                    iVar2.f2946m = true;
                }
                S0.d dVar = (S0.d) iVar2.f2943j.f14271c;
                if (dVar != null) {
                    iVar2.f2937d = dVar;
                } else {
                    if (oVar.getLength() != -1) {
                        f fVar = eVar.f2921a;
                        i4 = 2;
                        iVar2.f2937d = new b(iVar2, iVar2.f2939f, oVar.getLength(), fVar.f2929d + fVar.f2930e, fVar.f2927b, (fVar.f2926a & 4) != 0);
                        iVar2.f2941h = i4;
                        bArr = uVar2.f3351a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        uVar2.K(uVar2.f3353c, Arrays.copyOf(bArr, Math.max(65025, uVar2.f3353c)));
                        return 0;
                    }
                    iVar2.f2937d = new a2.i(22);
                }
                i4 = 2;
                iVar2.f2941h = i4;
                bArr = uVar2.f3351a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f2918a = pVar;
    }

    public final boolean f(o oVar) {
        boolean z;
        f fVar = new f();
        if (fVar.a(oVar, true) && (fVar.f2926a & 2) == 2) {
            int min = Math.min(fVar.f2930e, 8);
            u uVar = new u(min);
            oVar.E(uVar.f3351a, 0, min);
            uVar.M(0);
            if (uVar.a() >= 5 && uVar.z() == 127 && uVar.B() == 1179402563) {
                this.f2919b = new c();
                return true;
            }
            uVar.M(0);
            try {
                z = AbstractC1569a.B(1, uVar, true);
            } catch (G unused) {
                z = false;
            }
            if (z) {
                this.f2919b = new k();
            } else {
                uVar.M(0);
                if (h.e(uVar, h.o)) {
                    this.f2919b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // y0.n
    public final void release() {
    }
}
