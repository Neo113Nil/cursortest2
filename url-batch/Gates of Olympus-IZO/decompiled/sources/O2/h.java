package O2;

import N2.z;
import Z1.j;
import Z1.t;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h extends j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f3015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f3016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f3017g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f3018h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, t tVar, t tVar2, t tVar3) {
        super(2);
        this.f3015e = zVar;
        this.f3016f = tVar;
        this.f3017g = tVar2;
        this.f3018h = tVar3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            if (longValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte e3 = this.f3015e.e();
            boolean z3 = (e3 & 1) == 1;
            boolean z4 = (e3 & 2) == 2;
            boolean z5 = (e3 & 4) == 4;
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
                this.f3016f.f3480d = Long.valueOf(r2.k() * 1000);
            }
            if (z4) {
                this.f3017g.f3480d = Long.valueOf(r2.k() * 1000);
            }
            if (z5) {
                this.f3018h.f3480d = Long.valueOf(r2.k() * 1000);
            }
        }
        return L1.z.f2729a;
    }
}
