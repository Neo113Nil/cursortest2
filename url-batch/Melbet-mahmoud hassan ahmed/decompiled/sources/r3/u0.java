package r3;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u0 extends j0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f21333g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(c cVar, int i7, Bundle bundle) {
        super(cVar, i7, null);
        this.f21333g = cVar;
    }

    @Override // r3.j0
    protected final boolean f() {
        this.f21333g.f21217p.c(o3.b.f19842j);
        return true;
    }

    @Override // r3.j0
    protected final void g(o3.b bVar) {
        if (this.f21333g.t() && c.Y(this.f21333g)) {
            c.U(this.f21333g, 16);
        } else {
            this.f21333g.f21217p.c(bVar);
            this.f21333g.K(bVar);
        }
    }
}
