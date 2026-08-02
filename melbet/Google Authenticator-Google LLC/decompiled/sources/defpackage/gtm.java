package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gtm extends gss {
    public static final UUID a;
    public static final String b;

    static {
        UUID randomUUID = UUID.randomUUID();
        a = randomUUID;
        b = gse.bK(randomUUID);
    }

    private gtm(gtm gtmVar, String str, guc gucVar, gun gunVar) {
        super(str, gtmVar, gucVar, gunVar);
    }

    @Override // defpackage.guq
    public final long l() {
        return -1L;
    }

    @Override // defpackage.guq
    public final guc n() {
        return gub.a;
    }

    @Override // defpackage.guq
    public final boolean q() {
        return false;
    }

    @Override // defpackage.guq
    public final guq r(String str, int i, guc gucVar, gun gunVar) {
        return new gtm(this, str, gucVar, gunVar);
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
