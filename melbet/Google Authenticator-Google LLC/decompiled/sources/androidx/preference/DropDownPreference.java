package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.authenticator2.R;
import defpackage.aho;
import defpackage.aiu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DropDownPreference extends ListPreference {
    private final Context F;
    private final ArrayAdapter G;
    private Spinner H;
    private final AdapterView.OnItemSelectedListener I;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.I = new aho(this, 0);
        this.F = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.G = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.G.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aiu aiuVar) {
        Spinner spinner = (Spinner) aiuVar.a.findViewById(R.id.spinner);
        this.H = spinner;
        spinner.setAdapter((SpinnerAdapter) this.G);
        this.H.setOnItemSelectedListener(this.I);
        Spinner spinner2 = this.H;
        String str = ((ListPreference) this).i;
        CharSequence[] charSequenceArr = ((ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                }
                length--;
            }
        }
        spinner2.setSelection(i);
        super.a(aiuVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.H.performClick();
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.G;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.ListPreference
    public final void e(int i) {
        o(((ListPreference) this).h[i].toString());
    }
}
