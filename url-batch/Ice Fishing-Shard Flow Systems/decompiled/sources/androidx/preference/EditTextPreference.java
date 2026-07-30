package androidx.preference;

import A.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.icefishing.icefish.ice.fishing.s294s.R;
import d0.AbstractC0353b;
import q1.h;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a7 = b.a(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0353b.f4618c, a7, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (h.f7331i == null) {
                h.f7331i = new h(13);
            }
            this.f3938o = h.f7331i;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }
}
