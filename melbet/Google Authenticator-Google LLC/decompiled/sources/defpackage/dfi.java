package defpackage;

import androidx.preference.ListPreference;
import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfi implements hut {
    final /* synthetic */ dfj a;
    final /* synthetic */ boolean b;
    final /* synthetic */ SwitchPreferenceCompat c;

    public dfi(dfj dfjVar, boolean z, SwitchPreferenceCompat switchPreferenceCompat) {
        this.a = dfjVar;
        this.b = z;
        this.c = switchPreferenceCompat;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        th.getClass();
        hkf hkfVar = (hkf) ((hkf) dfj.c.f()).h(th).i("com/google/android/libraries/androidatgoogle/privacy/settings/PrivacyScreenSettingsFragment$featureSwitchChangeListener$<anonymous>$<anonymous>$<anonymous>", "onFailure", 73, "PrivacyScreenSettingsFragment.kt");
        boolean z = this.b;
        hkfVar.u("Failed to turn %s Privacy Screen", true != z ? "off" : "on");
        this.c.k(!z);
        this.a.aH(true);
    }

    @Override // defpackage.hut
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dfj dfjVar = this.a;
        ListPreference listPreference = dfjVar.e;
        if (listPreference == null) {
            ksp.a("authDelayList");
            listPreference = null;
        }
        listPreference.I(this.b);
        dfjVar.aH(true);
    }
}
