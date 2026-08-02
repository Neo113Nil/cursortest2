package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gjn implements eww {
    private final Optional a;
    private final Optional b;
    private final koe c;
    private final koe d;
    private final koe e;
    private final koe f;

    public gjn(Optional optional, Optional optional2, koe koeVar, koe koeVar2, koe koeVar3, koe koeVar4) {
        optional.getClass();
        optional2.getClass();
        koeVar.getClass();
        koeVar2.getClass();
        koeVar3.getClass();
        koeVar4.getClass();
        this.a = optional;
        this.b = optional2;
        this.c = koeVar;
        this.d = koeVar2;
        this.e = koeVar3;
        this.f = koeVar4;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.eww
    public final void a() {
        if ((!this.a.isPresent() || this.b.isPresent()) && eos.H()) {
            Object obj = ((jrx) this.e).a;
            obj.getClass();
            bnv bnvVar = (bnv) this.f;
            if (!((Boolean) ksy.c((Optional) obj, ksy.c(bnvVar.b(), false))).booleanValue()) {
                gjl gjlVar = (gjl) this.c.b();
                if (((fwm) gjlVar.c).l() || (gjlVar.b && !gjlVar.e.isEmpty())) {
                    gjlVar.a(true);
                    return;
                }
                return;
            }
            boolean booleanValue = ((Boolean) ksy.c(bnvVar.b(), false)).booleanValue();
            Object b = this.d.b();
            if (eos.I() == null) {
                ((hkf) ((gjw) b).h.g().i("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "runListeners", 117, "StartupAfterPackageReplacedWithRetryRunner.kt")).s("Couldn't determine current process name. Skipping startup after package replaced listeners.");
                return;
            }
            gjw gjwVar = (gjw) b;
            if (gjwVar.l.l() || (gjwVar.i && !gjwVar.e.isEmpty())) {
                gaj.d(186, hoq.as(new gjq(b, booleanValue, 0), gjwVar.c), "StartupAfterPackageReplacedListenerWithRetryRunner infrastructure failure.", new Object[0]);
            }
        }
    }
}
