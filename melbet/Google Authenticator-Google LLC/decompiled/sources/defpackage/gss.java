package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class gss extends gse {
    private final guc a;

    public gss(String str, guq guqVar, guc gucVar, gun gunVar) {
        super(str, guqVar, gunVar);
        hoq.x(gucVar.d);
        this.a = gucVar;
    }

    @Override // defpackage.guq
    public guc j() {
        return guc.e(this.a, n());
    }

    @Override // defpackage.guq
    public gtz k(hoq hoqVar) {
        return guc.j(hoqVar, j());
    }

    public gss(String str, UUID uuid, String str2, guc gucVar, gun gunVar) {
        super(str, uuid, str2, gunVar);
        hoq.x(gucVar.d);
        this.a = gucVar;
    }
}
