package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.aurifaber.valuta.rotatus.signum.modulus.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayAdapter f1541n;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f1541n = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f1542l;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.f1541n;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
