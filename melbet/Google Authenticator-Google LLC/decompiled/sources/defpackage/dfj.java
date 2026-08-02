package defpackage;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.authenticator2.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfj extends aij {
    public static final hkh c = hkh.l("com/google/android/libraries/androidatgoogle/privacy/settings/PrivacyScreenSettingsFragment");
    private final koi aj;
    private Preference ak;
    private hvi al;
    private final koi am;
    private final koi an;
    private final koi ao;
    public SwitchPreferenceCompat d;
    public ListPreference e;
    public dev f;

    public dfj() {
        int i = ksx.a;
        this.aj = new agf(new ksj(dfk.class), new dfh(this, 4), new dfh(this, 6), new dfh(this, 5));
        this.am = new kop(new aux(this, 7));
        this.an = new kop(new aux(this, 8));
        this.ao = new kop(new aux(this, 9));
    }

    @Override // defpackage.bd
    public final void Z() {
        super.Z();
        hvi hviVar = this.al;
        if (hviVar != null) {
            hviVar.cancel(true);
        }
    }

    public final dfk aG() {
        return (dfk) this.aj.a();
    }

    public final void aH(boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = this.d;
        ListPreference listPreference = null;
        if (switchPreferenceCompat == null) {
            ksp.a("featureSwitch");
            switchPreferenceCompat = null;
        }
        switchPreferenceCompat.D(z);
        ListPreference listPreference2 = this.e;
        if (listPreference2 == null) {
            ksp.a("authDelayList");
        } else {
            listPreference = listPreference2;
        }
        listPreference.D(z);
    }

    public final void aI() {
        this.al = null;
    }

    @Override // defpackage.aij
    public final void r(String str) {
        Executor mainExecutor;
        Context context = ((aij) this).a.a;
        this.f = deu.a.a(context);
        Preference preference = null;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context, null);
        switchPreferenceCompat.E("feature_switch");
        switchPreferenceCompat.U();
        switchPreferenceCompat.T();
        switchPreferenceCompat.H(context.getString(R.string.aag_privacy_settings_feature_switch_title));
        switchPreferenceCompat.n(context.getString(R.string.aag_privacy_settings_feature_switch_summary));
        switchPreferenceCompat.n = (aia) this.an.a();
        this.d = switchPreferenceCompat;
        ListPreference listPreference = new ListPreference(context, null);
        listPreference.E("auth_delay_list");
        listPreference.U();
        listPreference.T();
        listPreference.I(false);
        listPreference.H(context.getString(R.string.aag_privacy_settings_delay_list_title));
        listPreference.G(aht.a());
        listPreference.g = context.getResources().getStringArray(R.array.aag_privacy_settings_delay_list_entries);
        listPreference.h = context.getResources().getStringArray(R.array.aag_privacy_settings_delay_list_values);
        listPreference.n = (aia) this.ao.a();
        this.e = listPreference;
        Preference preference2 = new Preference(context);
        preference2.E("disclaimer");
        preference2.U();
        preference2.T();
        if (preference2.v) {
            preference2.v = false;
            preference2.d();
        }
        preference2.H(context.getString(R.string.aag_privacy_settings_disclaimer_title));
        String string = context.getString(R.string.aag_privacy_settings_disclaimer_features);
        string.getClass();
        String string2 = context.getString(R.string.aag_privacy_settings_disclaimer_detail);
        string2.getClass();
        preference2.n(a.ag(string2, string, "\n\n"));
        this.ak = preference2;
        aH(false);
        dev devVar = this.f;
        if (devVar == null) {
            ksp.a("privacyScreen");
            devVar = null;
        }
        koi koiVar = this.am;
        hvi b = devVar.b();
        ckt cktVar = (ckt) koiVar.a();
        mainExecutor = context.getMainExecutor();
        hnu.aS(b, cktVar, mainExecutor);
        this.al = b;
        air airVar = ((aij) this).a;
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.z(airVar);
        preferenceScreen.U();
        preferenceScreen.H(context.getString(R.string.aag_privacy_settings_title));
        SwitchPreferenceCompat switchPreferenceCompat2 = this.d;
        if (switchPreferenceCompat2 == null) {
            ksp.a("featureSwitch");
            switchPreferenceCompat2 = null;
        }
        preferenceScreen.X(switchPreferenceCompat2);
        ListPreference listPreference2 = this.e;
        if (listPreference2 == null) {
            ksp.a("authDelayList");
            listPreference2 = null;
        }
        preferenceScreen.X(listPreference2);
        Preference preference3 = this.ak;
        if (preference3 == null) {
            ksp.a("disclaimer");
        } else {
            preference = preference3;
        }
        preferenceScreen.X(preference);
        p(preferenceScreen);
    }
}
