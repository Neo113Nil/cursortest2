package t;

import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends n {

    /* renamed from: s, reason: collision with root package name */
    public c f8716s;

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    @Override // s0.n
    public final void s0() {
        c cVar = this.f8716s;
        if (cVar != null) {
            cVar.f8715a.n(this);
        }
        if (cVar != null) {
            cVar.f8715a.b(this);
        }
        this.f8716s = cVar;
    }

    @Override // s0.n
    public final void t0() {
        c cVar = this.f8716s;
        if (cVar != null) {
            k.d(cVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            cVar.f8715a.n(this);
        }
    }
}
