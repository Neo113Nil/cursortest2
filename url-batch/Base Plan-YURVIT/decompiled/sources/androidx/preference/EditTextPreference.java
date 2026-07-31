package androidx.preference;

import B0.C0000a;
import K.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.datastore.preferences.protobuf.k0;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int s2 = k0.s(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f593c, s2, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (C0000a.f67f == null) {
                C0000a.f67f = new C0000a(5);
            }
            this.f1640k = C0000a.f67f;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }
}
