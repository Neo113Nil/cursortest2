package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzp {
    public static final hkh a = hkh.l("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer");
    public final gbj b = new fzk(this);
    public final gbj c = new fzl(this);
    public final gel d = new fzo(this);
    public final bg e;
    public final fzi f;
    public final gbi g;
    public final gva h;
    public final fyh i;
    public final gzp j;
    public final eed k;
    public final eee l;
    public final Executor m;
    public gzp n;
    public fuf o;
    public final gpj p;
    public final fwm q;
    public final bst r;
    public final cbp s;
    public final brn t;
    private final fuq u;

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public fzp(Context context, bg bgVar, fzi fziVar, gzp gzpVar, gpj gpjVar, gbi gbiVar, gva gvaVar, fwm fwmVar, fuq fuqVar, iyi iyiVar, Map map, bst bstVar, gnh gnhVar, cbp cbpVar, brn brnVar, dme dmeVar, cbp cbpVar2, Executor executor, hvl hvlVar) {
        drb drbVar;
        ExecutorService executorService;
        dpd dpdVar;
        efc efcVar;
        dme dmeVar2;
        efu efuVar;
        ede edeVar;
        gyf gyfVar = gyf.a;
        this.n = gyfVar;
        this.e = bgVar;
        this.f = fziVar;
        this.p = gpjVar;
        this.g = gbiVar;
        this.h = gvaVar;
        this.q = fwmVar;
        this.u = fuqVar;
        this.r = bstVar;
        this.t = brnVar;
        this.s = cbpVar2;
        this.m = executor;
        eec eecVar = new eec();
        eecVar.g = new eeb(0);
        eecVar.a = context.getApplicationContext();
        fyz fyzVar = new fyz(gzpVar);
        eew k = fhr.k(gnhVar, fziVar, new fyz(gzpVar));
        ccb ccbVar = new ccb(new guu(gvaVar, 120, "Click Add Accounts in TikTok Express SignIn", new edk(this, gzpVar, cbpVar, gbiVar, 3)), 19);
        hoq.I(true, "Either setAvatarRetriever or setAvatarImageLoader have to be called.");
        eecVar.h = new ede(fyzVar, k, ccbVar);
        eecVar.c(hvlVar);
        if (dmeVar == null) {
            throw new NullPointerException("Null vePrimitives");
        }
        eecVar.f = dmeVar;
        if (!eecVar.b().f()) {
            eecVar.c(Executors.newCachedThreadPool(dih.ah()));
        }
        eecVar.b().b();
        drb drbVar2 = new drb(eecVar.a().a);
        eecVar.b = drbVar2;
        eecVar.j = new gwh(drbVar2, eecVar.a().a);
        dpd dpdVar2 = eecVar.a().b;
        Class cls = null;
        if (dpdVar2 == null) {
            eecVar.a();
            throw null;
        }
        eecVar.d = dpdVar2;
        efc efcVar2 = eecVar.e;
        if (!(efcVar2 == null ? gyfVar : gzp.h(efcVar2)).f()) {
            eecVar.e = new efb(eecVar.a().a, eecVar.a);
        }
        dme dmeVar3 = eecVar.f;
        if (dmeVar3 == null) {
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if (!(dmeVar3 instanceof dmd)) {
            eecVar.g = new efv(eecVar.a().a, drbVar2, dmeVar3, new csm(14));
        }
        gwh gwhVar = eecVar.j;
        if (gwhVar != null && (drbVar = eecVar.b) != null && (executorService = eecVar.c) != null && (dpdVar = eecVar.d) != null && (efcVar = eecVar.e) != null && (dmeVar2 = eecVar.f) != null && (efuVar = eecVar.g) != null && (edeVar = eecVar.h) != null) {
            eed eedVar = new eed(gwhVar, drbVar, executorService, dpdVar, efcVar, dmeVar2, efuVar, edeVar, eecVar.i);
            this.k = eedVar;
            this.l = new eee(eedVar);
            Intent intent = bgVar.getIntent();
            if (intent.getBooleanExtra("$tiktok$eligibility_intents$mapper_class_owned", false)) {
                Serializable serializableExtra = intent.getSerializableExtra("$tiktok$eligibility_intents$mapper_class");
                serializableExtra.getClass();
                cls = (Class) serializableExtra;
            }
            if (cls == null) {
                this.i = new fyh((fwm) iyiVar.b, gyfVar, iyiVar.a);
                this.j = gyfVar;
                return;
            } else {
                hoq.K(iyiVar.c.containsKey(cls), "EligibilityMapper not found for %s", cls);
                this.i = new fyh((fwm) iyiVar.b, gzp.h((fyj) ((koe) iyiVar.c.get(cls)).b()), iyiVar.a);
                hoq.K(map.containsKey(cls), "AccountIneligibleDialogCreator not provided for mapperClass: %s", cls);
                this.j = gzp.h((fzh) ((koe) map.get(cls)).b());
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (eecVar.j == null) {
            sb.append(" limitedAvailableAccountsModel");
        }
        if (eecVar.b == null) {
            sb.append(" internalAccountsModel");
        }
        if (eecVar.c == null) {
            sb.append(" backgroundExecutor");
        }
        if (eecVar.d == null) {
            sb.append(" avatarImageLoader");
        }
        if (eecVar.e == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (eecVar.f == null) {
            sb.append(" vePrimitives");
        }
        if (eecVar.g == null) {
            sb.append(" visualElements");
        }
        if (eecVar.h == null) {
            sb.append(" accountLayer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void a() {
        gaj.d(121, this.u.a(), "Failed account invalidation.", new Object[0]);
    }
}
