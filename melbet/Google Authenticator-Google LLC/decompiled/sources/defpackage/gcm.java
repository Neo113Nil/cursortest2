package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcm implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;

    public gcm(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* bridge */ /* synthetic */ Object b() {
        gzp gzpVar = (gzp) ((jrx) this.a).a;
        Context b = ((jrk) this.b).b();
        gcg b2 = ((gch) this.c).b();
        hvm hvmVar = (hvm) this.d.b();
        kqn kqnVar = (kqn) this.e.b();
        gbg gbgVar = (gbg) this.f.b();
        atf atfVar = (atf) this.g.b();
        aru aruVar = new aru();
        hvmVar.getClass();
        aruVar.a = hvmVar;
        aruVar.e = new gci(gbgVar);
        hvmVar.getClass();
        aruVar.d = hvmVar;
        kqnVar.getClass();
        aruVar.b = kqnVar;
        atfVar.getClass();
        aruVar.c = atfVar;
        if (gzpVar.f()) {
            gbu gbuVar = (gbu) gzpVar.b();
            if (gbuVar.a().f()) {
                aruVar.i = (String) gbuVar.a().b();
            }
            if (gbuVar.b().f()) {
                aruVar.f = (wo) gbuVar.b().b();
            }
            if (gbuVar.i().f()) {
                aruVar.h = (wo) gbuVar.i().b();
            }
            if (gbuVar.h().f()) {
                aruVar.g = (wo) gbuVar.h().b();
            }
            if (gbuVar.g().f()) {
                aruVar.j = ((Integer) gbuVar.g().b()).intValue();
            }
            if (gbuVar.d().f()) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            if (gbuVar.f().f()) {
                int intValue = ((Integer) gbuVar.f().b()).intValue();
                if (intValue < 20) {
                    throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
                }
                aruVar.k = Math.min(intValue, 50);
            }
            if (gbuVar.e().f()) {
                aruVar.l = ((Boolean) gbuVar.e().b()).booleanValue();
            }
            if (gbuVar.c().f()) {
                ((Boolean) gbuVar.c().b()).booleanValue();
            }
        }
        String packageName = (gzpVar.f() && ((gbu) gzpVar.b()).a().f() && !((String) ((gbu) gzpVar.b()).a().b()).isEmpty()) ? (String) ((gbu) gzpVar.b()).a().b() : b.getPackageName();
        ((hkf) ((hkf) gcg.a.e()).i("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateAsynchronouslyAndMaybeCrash", 68, "DefaultProcessValidator.java")).s("Validating WorkManager process");
        b2.d.c(hoq.aq(new evb(b2, packageName, 11), b2.c), 1L, TimeUnit.MINUTES);
        return aruVar;
    }
}
