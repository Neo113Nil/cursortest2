package U2;

import R1.y;
import T2.z;
import e2.InterfaceC0426e;
import f2.k;
import f2.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h extends k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f4540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f4541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f4542g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f4543h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, u uVar, u uVar2, u uVar3) {
        super(2);
        this.f4540e = zVar;
        this.f4541f = uVar;
        this.f4542g = uVar2;
        this.f4543h = uVar3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            if (longValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte d3 = this.f4540e.d();
            boolean z3 = (d3 & 1) == 1;
            boolean z4 = (d3 & 2) == 2;
            boolean z5 = (d3 & 4) == 4;
            long j3 = z3 ? 5L : 1L;
            if (z4) {
                j3 += 4;
            }
            if (z5) {
                j3 += 4;
            }
            if (longValue < j3) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z3) {
                this.f4541f.f5832d = Long.valueOf(r2.l() * 1000);
            }
            if (z4) {
                this.f4542g.f5832d = Long.valueOf(r2.l() * 1000);
            }
            if (z5) {
                this.f4543h.f5832d = Long.valueOf(r2.l() * 1000);
            }
        }
        return y.f4171a;
    }
}
