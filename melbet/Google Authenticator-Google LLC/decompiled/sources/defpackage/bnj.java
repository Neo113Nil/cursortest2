package defpackage;

import android.app.Service;
import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnj implements bzu, gve, jrp {
    public final Service a;
    final jsb b;
    final jsb c;
    final jsb d;
    public final bnl e;

    public bnj(bnl bnlVar, Service service) {
        this.e = bnlVar;
        this.a = service;
        jrw a = jrx.a(service);
        this.b = a;
        bnu bnuVar = new bnu(bnlVar.nO, 1, null);
        this.c = bnuVar;
        this.d = new dte(a, bnlVar.A, bnlVar.nJ, bnuVar, 17, (boolean[][]) null);
    }

    @Override // defpackage.bzu
    public final brr a() {
        jpt a = jrv.a(this.d);
        bnl bnlVar = this.e;
        return new brr(a, (Context) bnlVar.nS.a, (hvl) bnlVar.at.b());
    }

    @Override // defpackage.gvg
    public final gva e() {
        return (gva) this.e.bJ.b();
    }

    @Override // defpackage.gvg
    public final Set g() {
        return hjb.a;
    }
}
