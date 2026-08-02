package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gtl extends gss implements gsr {
    public final boolean a;
    private final Exception b;
    private final boolean c;

    public gtl(String str, gsr gsrVar, guc gucVar, boolean z, gun gunVar) {
        super("<missing root>:".concat(String.valueOf(str)), gsrVar, guc.e(gucVar, gub.b), gunVar);
        this.b = gsrVar.h();
        this.a = gsrVar.i();
        this.c = z;
    }

    public static void m() {
        hfm k = gta.k();
        if (k.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(k, new ges(6));
    }

    @Override // defpackage.gsr
    public final guq b(String str, guc gucVar, boolean z, gun gunVar) {
        boolean z2 = true;
        if (z && !this.c) {
            gta.x(true);
        }
        if ((!z || this.c) && !this.c) {
            z2 = false;
        }
        return new gtl(str, this, gucVar, z2, gunVar);
    }

    @Override // defpackage.gsr
    public final Exception h() {
        return this.b;
    }

    @Override // defpackage.gsr
    public final boolean i() {
        return this.a;
    }

    @Override // defpackage.gss, defpackage.guq
    public final gtz k(hoq hoqVar) {
        gtz k = super.k(hoqVar);
        return k.c() == 3 ? gtz.d(2) : k;
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

    public gtl(UUID uuid, String str, String str2, guc gucVar, Exception exc, boolean z, boolean z2, gun gunVar) {
        super("<missing root>:".concat(String.valueOf(str2)), uuid, str, guc.e(gucVar, gub.b), gunVar);
        this.a = z2;
        this.b = exc;
        this.c = z;
    }

    @Override // defpackage.guq
    public final void u(hoq hoqVar, Object obj) {
    }
}
