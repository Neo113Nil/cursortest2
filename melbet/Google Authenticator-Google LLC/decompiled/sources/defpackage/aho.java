package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aho implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aho(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        jp jpVar;
        if (this.b != 0) {
            if (i == -1 || (jpVar = ((ki) this.a).e) == null) {
                return;
            }
            jpVar.a = false;
            return;
        }
        if (i >= 0) {
            Object obj = this.a;
            ListPreference listPreference = (ListPreference) obj;
            String charSequence = listPreference.h[i].toString();
            if (charSequence.equals(listPreference.i) || !((Preference) obj).L(charSequence)) {
                return;
            }
            listPreference.o(charSequence);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
