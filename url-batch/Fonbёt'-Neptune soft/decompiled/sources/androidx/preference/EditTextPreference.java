package androidx.preference;

import B0.C0023a;
import M.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.neptunesoft.languesbacdz.R;
import s.AbstractC0291b;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a2 = AbstractC0291b.a(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f771c, a2, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (C0023a.f137f == null) {
                C0023a.f137f = new C0023a(11);
            }
            this.f1806k = C0023a.f137f;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }
}
