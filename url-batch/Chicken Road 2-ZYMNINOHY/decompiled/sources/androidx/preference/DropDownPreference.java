package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.rockchicken.pump.up.road.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: j, reason: collision with root package name */
    public final ArrayAdapter f5111j;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f5111j = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f5112h;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.f5111j;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
