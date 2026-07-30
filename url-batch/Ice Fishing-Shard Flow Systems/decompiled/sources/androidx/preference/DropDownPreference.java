package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: r, reason: collision with root package name */
    public final ArrayAdapter f3929r;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f3929r = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f3930p;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.f3929r;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
