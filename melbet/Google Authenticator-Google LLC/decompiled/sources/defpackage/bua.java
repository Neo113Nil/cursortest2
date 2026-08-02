package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.preference.ListPreference;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.howitworks.GoogleAccountSyncingIntroductionActivity;
import com.google.android.apps.authenticator2.howitworks.HowItWorksActivity;
import com.google.android.apps.authenticator2.main.MainActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bua implements gex {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bua(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gex
    public final /* synthetic */ void a(Throwable th) {
        int i = this.b;
        if (i == 0) {
            hnu.bH(th);
            return;
        }
        if (i == 1) {
            hnu.bH(th);
        } else if (i != 2) {
            hnu.bH(th);
        } else {
            hnu.bH(th);
        }
    }

    @Override // defpackage.gex
    public final /* synthetic */ void b(Object obj) {
        int i = this.b;
        int i2 = 4;
        int i3 = 1;
        if (i == 0) {
            Integer num = (Integer) obj;
            if (num.intValue() == 0) {
                ((hkf) ((hkf) bub.a.e()).i("com/google/android/apps/authenticator2/main/IntroWizardHostFragmentPeer$ShowHowItWorksOnAppStartCallback", "onLoaded", 75, "IntroWizardHostFragmentPeer.java")).s("Showing intro wizard on app start.");
                bub bubVar = (bub) this.a;
                Context context = bubVar.e;
                gvx.l(context, new Intent(context, (Class<?>) HowItWorksActivity.class).putExtra("intro_wizard_first_appearance", true));
                ((bsk) hnu.bp(bubVar.d.b, bsk.class)).r().a(new bqh(i2), huf.a);
                return;
            }
            if (num.intValue() != 1) {
                if (num.intValue() == -1) {
                    ((hkf) ((hkf) bub.a.e()).i("com/google/android/apps/authenticator2/main/IntroWizardHostFragmentPeer$ShowHowItWorksOnAppStartCallback", "onLoaded", 91, "IntroWizardHostFragmentPeer.java")).s("Not showing intro wizard on app start.");
                    return;
                } else {
                    ((hkf) ((hkf) bub.a.g()).i("com/google/android/apps/authenticator2/main/IntroWizardHostFragmentPeer$ShowHowItWorksOnAppStartCallback", "onLoaded", 93, "IntroWizardHostFragmentPeer.java")).s("Unknown status for intro wizard screens.");
                    return;
                }
            }
            bub bubVar2 = (bub) this.a;
            ((MainActivity) bubVar2.b.E()).z().b = true;
            Context context2 = bubVar2.e;
            gvx.l(context2, new Intent(context2, (Class<?>) GoogleAccountSyncingIntroductionActivity.class));
            ((hkf) ((hkf) bub.a.e()).i("com/google/android/apps/authenticator2/main/IntroWizardHostFragmentPeer$ShowHowItWorksOnAppStartCallback", "onLoaded", 89, "IntroWizardHostFragmentPeer.java")).s("Showing intro wizard sync information screen on app start.");
            return;
        }
        if (i != 1) {
            if (i == 2) {
                Boolean bool = (Boolean) obj;
                cbw cbwVar = (cbw) this.a;
                cbwVar.j.k(bool.booleanValue());
                if (bool.booleanValue()) {
                    cbwVar.k.I(true);
                    return;
                }
                return;
            }
            int ordinal = ((dff) obj).ordinal();
            if (ordinal == 1) {
                i3 = 0;
            } else if (ordinal != 2) {
                i3 = ordinal != 3 ? ordinal != 4 ? -1 : 3 : 2;
            }
            if (i3 == -1) {
                return;
            }
            cbw cbwVar2 = (cbw) this.a;
            ListPreference listPreference = cbwVar2.k;
            listPreference.n(listPreference.g[i3]);
            cbwVar2.k.e(i3);
            return;
        }
        btg btgVar = (btg) obj;
        if (btgVar.a) {
            ((hkf) ((hkf) bsz.a.e()).i("com/google/android/apps/authenticator2/loginrequirement/LoginRequirementFragmentPeer$FirstTimeConsentCallback", "onLoaded", 116, "LoginRequirementFragmentPeer.java")).s("Consent being given for the first time through the ESI.");
            bsz bszVar = (bsz) this.a;
            bszVar.a(true);
            bqh bqhVar = new bqh(7);
            bth bthVar = bszVar.g;
            bszVar.d.i(cbp.k(bthVar.e.a(bqhVar, bthVar.d)), bszVar.j);
            return;
        }
        ful fulVar = ((fuf) hdb.c(btgVar.b).b(new bqg(this, 5)).g()).b;
        boolean equals = fulVar.k.equals("pseudonymous");
        ((hkf) ((hkf) bsz.a.e()).i("com/google/android/apps/authenticator2/loginrequirement/LoginRequirementFragmentPeer$FirstTimeConsentCallback", "onLoaded", 128, "LoginRequirementFragmentPeer.java")).s("Asking for consent using a dialog.");
        bsz bszVar2 = (bsz) this.a;
        fhm fhmVar = new fhm(bszVar2.c, R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
        int i4 = equals ? R.string.use_without_an_account_title : R.string.consent_title;
        bsv bsvVar = bszVar2.b;
        fhmVar.t(bsvVar.R(i4));
        fhmVar.m(bsvVar.S(true != equals ? R.string.consent_message : R.string.use_without_an_account_text, fulVar.g));
        fhmVar.r(bsvVar.R(R.string.continue_consent), new guv(bszVar2.f, 23, "ConsentGiven", new ahu(this, 3)));
        fhmVar.o(bsvVar.R(R.string.cancel_consent), new ahu(this, 4));
        fhmVar.k(bsvVar.x().getDrawable(R.drawable.sync_icon));
        fhmVar.p(new bsx(this, 0));
        fhmVar.i();
    }
}
