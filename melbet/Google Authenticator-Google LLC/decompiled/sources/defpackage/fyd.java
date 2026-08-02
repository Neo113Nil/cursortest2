package defpackage;

import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.main.MainActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyd implements ftm {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fyd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ftm
    public final void c(fsv fsvVar) {
        if (this.b != 1) {
            return;
        }
        if (fsvVar instanceof fsw) {
            ((hkf) ((hkf) ((hkf) bud.a.g()).h(fsvVar)).i("com/google/android/apps/authenticator2/main/MainActivityPeer$ChangeAccountCallback", "onNoAccountAvailable", (char) 151, "MainActivityPeer.java")).s("The previous active Google Account has been deleted.");
            Object obj = this.a;
            ((bud) obj).e.i(hel.q(fze.class));
            return;
        }
        if (fsvVar instanceof ftb) {
            ((hkf) ((hkf) ((hkf) bud.a.g()).h(fsvVar)).i("com/google/android/apps/authenticator2/main/MainActivityPeer$ChangeAccountCallback", "onNoAccountAvailable", (char) 155, "MainActivityPeer.java")).s("No account was selected.");
            ((bud) this.a).c.finish();
        } else {
            ((hkf) ((hkf) ((hkf) bud.a.g()).h(fsvVar)).i("com/google/android/apps/authenticator2/main/MainActivityPeer$ChangeAccountCallback", "onNoAccountAvailable", (char) 158, "MainActivityPeer.java")).s("No account available.");
            ((bud) this.a).c.finish();
        }
    }

    @Override // defpackage.ftm
    public final void e(bst bstVar) {
        bwi bwiVar;
        int i = this.b;
        byte[] bArr = null;
        int i2 = 0;
        if (i == 0) {
            frv o = bstVar.o();
            Object obj = this.a;
            gaj.d(108, ((fye) obj).b.b(gvx.c(new egl(obj, o, 17, bArr)), huf.a), "Failed to set default account.", new Object[0]);
            return;
        }
        int i3 = 2;
        if (i != 1) {
            frv o2 = bstVar.o();
            gty aB = hoq.aB(151, "AccountChanged: UserConfigurationCommitter.commitOnAccountChange", gub.a, true);
            Object obj2 = this.a;
            try {
                hvi a = ((giz) obj2).c.a(gvx.b(new gib(o2, obj2, i3, bArr)), huf.a);
                a.getClass();
                aB.b(a);
                ixf.j(aB, null);
                gaj.d(152, a, "Failed to commit to configuration for account %s", o2);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ixf.j(aB, th);
                    throw th2;
                }
            }
        }
        bud budVar = (bud) this.a;
        budVar.f = budVar.g;
        budVar.g = true != ((String) ((fwm) bstVar.a).b).equals("pseudonymous") ? 3 : 2;
        frv o3 = bstVar.o();
        if (budVar.b) {
            jkj k = bwi.a.k();
            if (!k.b.M()) {
                k.t();
            }
            jkp jkpVar = k.b;
            bwi bwiVar2 = (bwi) jkpVar;
            bwiVar2.b |= 1;
            bwiVar2.c = 2;
            int i4 = budVar.g;
            if (!jkpVar.M()) {
                k.t();
            }
            bwi bwiVar3 = (bwi) k.b;
            bwiVar3.b |= 2;
            bwiVar3.d = i4;
            bwiVar = (bwi) k.q();
        } else {
            jkj k2 = bwi.a.k();
            int i5 = budVar.f;
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar2 = k2.b;
            bwi bwiVar4 = (bwi) jkpVar2;
            bwiVar4.b |= 1;
            bwiVar4.c = i5;
            int i6 = budVar.g;
            if (!jkpVar2.M()) {
                k2.t();
            }
            bwi bwiVar5 = (bwi) k2.b;
            bwiVar5.b |= 2;
            bwiVar5.d = i6;
            bwiVar = (bwi) k2.q();
        }
        buf bufVar = new buf();
        jqq.g(bufVar);
        gmk.d(bufVar, o3);
        gmb.b(bufVar, bwiVar);
        budVar.b = false;
        ae aeVar = new ae(budVar.d);
        aeVar.m(R.id.main_frame_layout, bufVar, "OtpListFragment");
        by byVar = bufVar.C;
        if (byVar != null && byVar != aeVar.a) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + bufVar.toString() + " is already attached to a FragmentManager.");
        }
        aeVar.k(new ce(8, bufVar));
        aeVar.c();
        MainActivity mainActivity = budVar.c;
        String action = mainActivity.getIntent().getAction();
        if (action == null || !action.equals("android.intent.action.VIEW")) {
            return;
        }
        bvm z = bufVar.z();
        try {
            bpc A = kt.A(mainActivity.getIntent().getData().toString());
            fhm fhmVar = new fhm(z.e, R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
            fhmVar.s(R.string.add_token_dialog_title);
            fhmVar.m(z.c.S(R.string.add_token_dialog_subtitle, A.f()));
            fhmVar.q(R.string.add_token_dialog_yes, new bum(z, A, i2));
            fhmVar.n(R.string.add_token_dialog_no, new bul(2));
            fhmVar.j(R.drawable.gs_info_vd_theme_24);
            fhmVar.i();
        } catch (cbj | cbk | cbl e) {
            ((hkf) ((hkf) ((hkf) bvm.a.g()).h(e)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onNewIntentWithActionView", (char) 1251, "OtpListFragmentPeer.java")).s("Could not parse intent data");
            z.q(z.c.bs().getString(R.string.something_went_wrong));
        }
    }

    @Override // defpackage.ftm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ftm
    public final /* synthetic */ void d() {
    }
}
