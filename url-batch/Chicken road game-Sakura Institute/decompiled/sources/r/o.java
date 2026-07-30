package r;

import s.h0;
import s.w;
import s.y;
import s.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, int i7) {
        super(1);
        this.f7662g = i7;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        w wVar = (w) obj;
        q0.g c4 = q0.r.c();
        q0.r.f(c4, q0.r.d(c4), c4 != null ? c4.f() : null);
        for (int i7 = 0; i7 < 2; i7++) {
            int i8 = this.f7662g + i7;
            wVar.getClass();
            long j8 = z.f8073a;
            y yVar = wVar.f8069b;
            b1.b bVar = yVar.f8072c;
            if (bVar != null) {
                wVar.f8068a.add(new h0(bVar, i8, j8, yVar.f8071b));
            }
        }
        return d6.z.f2639a;
    }
}
