package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayAdapter f1631n;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f1631n = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f1632l;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.f1631n;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
