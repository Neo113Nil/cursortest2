package g8;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import f8.a0;
import g0.p;
import java.io.IOException;
import r6.l;
import r6.v;
import s.y;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4567g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4568h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4569i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4570j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4571k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a0 a0Var, v vVar, v vVar2, v vVar3) {
        super(2);
        this.f4568h = a0Var;
        this.f4569i = vVar;
        this.f4570j = vVar2;
        this.f4571k = vVar3;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4567g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                a0 a0Var = (a0) this.f4568h;
                if (intValue == 21589) {
                    if (longValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte readByte = a0Var.readByte();
                    boolean z8 = (readByte & 1) == 1;
                    boolean z9 = (readByte & 2) == 2;
                    boolean z10 = (readByte & 4) == 4;
                    long j8 = z8 ? 5L : 1L;
                    if (z9) {
                        j8 += 4;
                    }
                    if (z10) {
                        j8 += 4;
                    }
                    if (longValue < j8) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z8) {
                        ((v) this.f4569i).f7968f = Long.valueOf(a0Var.k() * 1000);
                    }
                    if (z9) {
                        ((v) this.f4570j).f7968f = Long.valueOf(a0Var.k() * 1000);
                    }
                    if (z10) {
                        ((v) this.f4571k).f7968f = Long.valueOf(a0Var.k() * 1000);
                    }
                }
                return z.f2639a;
            default:
                ((Number) obj2).intValue();
                r4.a.f((q6.a) this.f4568h, (o) this.f4569i, (y) this.f4570j, (q6.e) this.f4571k, (p) obj, g0.d.T(1));
                return z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q6.a aVar, o oVar, y yVar, q6.e eVar, int i7) {
        super(2);
        this.f4568h = aVar;
        this.f4569i = oVar;
        this.f4570j = yVar;
        this.f4571k = eVar;
    }
}
