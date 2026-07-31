package E1;

import F.AbstractC0029a0;
import F.X0;
import I.C0113p;
import L1.z;

/* loaded from: classes.dex */
public final class c implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f740e;

    public /* synthetic */ c(m mVar, int i3) {
        this.f739d = i3;
        this.f740e = mVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f739d) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    m mVar = this.f740e;
                    AbstractC0029a0.a(mVar.f771c, mVar.f770b, null, 0L, c0113p, 0, 12);
                }
                break;
            default:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    X0.b(this.f740e.f770b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0113p2, 0, 0, 131070);
                }
                break;
        }
        return z.f2729a;
    }
}
