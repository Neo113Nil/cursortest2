package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gtk extends gse implements gsr {
    public static final gsp a = new gsq();
    private final Exception b;
    private final boolean c;

    public gtk(UUID uuid, String str, Exception exc, boolean z, gun gunVar) {
        super("<missing root>", uuid, str, gunVar);
        this.b = exc;
        this.c = z;
    }

    public static gtk m(gun gunVar) {
        UUID b = gtb.a.b();
        String bK = gse.bK(b);
        if (!gus.a()) {
            s();
            return new gtk(b, bK, a, false, gunVar);
        }
        gsp gspVar = new gsp();
        s();
        return new gtk(b, bK, gspVar, gta.t(gspVar), gunVar);
    }

    public static void s() {
        hfm k = gta.k();
        if (k.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(k, new ges(5));
    }

    @Override // defpackage.gsr
    public final guq b(String str, guc gucVar, boolean z, gun gunVar) {
        if (z) {
            gta.x(true);
        }
        return new gtl(str, this, gucVar, z, gunVar);
    }

    @Override // defpackage.gsr
    public final Exception h() {
        return this.b;
    }

    @Override // defpackage.gsr
    public final boolean i() {
        return this.c;
    }

    @Override // defpackage.guq
    public final guc j() {
        return gub.a;
    }

    @Override // defpackage.guq
    public final gtz k(hoq hoqVar) {
        return gtz.d(2);
    }

    @Override // defpackage.guq
    public final long l() {
        return -1L;
    }

    @Override // defpackage.guq
    public final guc n() {
        throw null;
    }

    @Override // defpackage.guq
    public final boolean q() {
        return false;
    }

    @Override // defpackage.guq
    public final guq r(String str, int i, guc gucVar, gun gunVar) {
        gta.x(true);
        return b(str, gucVar, true, gunVar);
    }

    @Override // defpackage.guq
    public final void t() {
    }

    @Override // defpackage.guq
    public final void o(int i) {
    }

    @Override // defpackage.guq
    public final void p(boolean z) {
    }

    @Override // defpackage.guq
    public final void u(hoq hoqVar, Object obj) {
    }
}
