package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gmk implements jrq {
    private static final hkh a = hkh.l("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager");
    private volatile Object b;
    private volatile frv c;
    private final Object d = new Object();
    private final bd e;
    private final cka f;

    public gmk(bd bdVar) {
        this.e = bdVar;
        this.f = new cka(bdVar);
    }

    public static final void d(bd bdVar, frv frvVar) {
        int i = frvVar.a;
        hoq.J(i >= 0, "AccountId is invalid: %s", i);
        jqq.g(bdVar);
        bdVar.n.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", i);
    }

    private final frv e() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    bd bdVar = this.e;
                    bdVar.Q().getClass();
                    hoq.K(bdVar.Q() instanceof jrq, "Sting Fragments must be attached to an @Sting Activity. Found: %s", bdVar.Q().getClass());
                    b(bdVar);
                    Bundle bundle = bdVar.n;
                    frv frvVar = null;
                    if (bundle != null && bundle.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                        frvVar = frv.a(bundle.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"));
                    }
                    frv frvVar2 = frvVar;
                    if (frvVar2 == null) {
                        gmf gmfVar = new gmf("Exception while injecting account Fragment bindings because of missing AccountId in account Fragment's arguments");
                        if (!((Boolean) ((gmi) imq.a(iwe.a(bdVar.x().getApplicationContext()), gmi.class)).j().d(false)).booleanValue()) {
                            throw new gmf("Account id is not set in the account Fragment. Possible causes:\n\t1. This account Fragment is @GenerateAccountFragment and was created without calling setBundledAccountId on itself after creation.\n\t2. This account Fragment's arguments were overridden without preserving the previous arguments.\n\t3. This account Fragment is declared in an XML but not as a navigation destination.\n\t4. This account Fragment is declared in an XML as a navigation destination, but the account navigation is not correctly setup with AccountNavigation (go/tiktok-navigation#navigating)");
                        }
                        ((hkf) ((hkf) ((hkf) a.f()).h(gmfVar)).i("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager", "getAccountIdInternal", (char) 166, "FragmentAccountComponentManager.java")).s("Fragment AccountId check failed.");
                    }
                    if (((gzp) ((gmh) imq.a(bdVar.Q(), gmh.class)).l().a).f()) {
                        gzp m = ((gmj) imq.a(hnu.bs(bdVar), gmj.class)).m();
                        if (frvVar2 == null) {
                            frvVar2 = (frv) ((gzs) m).a;
                            if (frvVar2.a != -1) {
                                d(bdVar, frvVar2);
                            }
                        } else {
                            Object obj = ((gzs) m).a;
                            if (((frv) obj).a != -1) {
                                hoq.M(obj.equals(frvVar2), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", obj, frvVar2);
                            }
                        }
                    }
                    this.c = frvVar2;
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.jrq
    public final Object C() {
        if (this.b == null) {
            synchronized (this.d) {
                if (this.b == null) {
                    this.b = a();
                }
            }
        }
        return this.b;
    }

    protected Object a() {
        frv e = e();
        bd bdVar = this.e;
        bns a2 = ((gmg) imq.a(hnu.br(e, bdVar).C(), gmg.class)).a();
        a2.a = bdVar;
        a2.b = ((gmn) this.f.o(this.c).a(gmn.class)).a;
        iwm.a(a2.a, bd.class);
        iwm.a(a2.b, gls.class);
        return new bnb(a2.c, a2.d, a2.f, a2.g, a2.a);
    }

    protected void b(bd bdVar) {
        if (bdVar.n != null) {
            hoq.y(!r0.getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY"), "Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
        }
    }

    public final void c() {
        fao.c();
        jqw jqwVar = ((gmn) this.f.o(e()).a(gmn.class)).b;
        if (jqwVar.c()) {
            jqwVar.b(this.e.P());
        }
        this.e.L().a(new gkd(jqwVar, 2));
    }
}
