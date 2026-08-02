package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aht implements aic {
    public static aht a;
    private static aht b;
    private final /* synthetic */ int c;

    public aht(int i) {
        this.c = i;
    }

    public static aht a() {
        aht ahtVar = b;
        if (ahtVar != null) {
            return ahtVar;
        }
        aht ahtVar2 = new aht(0);
        b = ahtVar2;
        return ahtVar2;
    }

    @Override // defpackage.aic
    public final /* synthetic */ CharSequence b(Preference preference) {
        if (this.c != 0) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.not_set) : editTextPreference.g;
        }
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.l()) ? listPreference.j.getString(R.string.not_set) : listPreference.l();
    }
}
