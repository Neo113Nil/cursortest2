package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ifc extends jwx {
    private final gbc a;
    private final String b;
    private final Executor c;

    public ifc(idd iddVar, idc idcVar) {
        this.b = idcVar.c.getAuthority();
        this.c = idcVar.e;
        this.a = new gbc(new gib(iddVar, idcVar, 12), idcVar.d);
    }

    @Override // defpackage.jwx
    public final String a() {
        return this.b;
    }

    @Override // defpackage.jwx
    public final iws b(kae kaeVar, jww jwwVar) {
        djv.a();
        hvi c = this.a.c();
        bso bsoVar = new bso(kaeVar, jwwVar, 19, null);
        Executor executor = jwwVar.c;
        if (executor == null) {
            executor = this.c;
        }
        return new ifb(hoq.at(c, bsoVar, executor));
    }
}
