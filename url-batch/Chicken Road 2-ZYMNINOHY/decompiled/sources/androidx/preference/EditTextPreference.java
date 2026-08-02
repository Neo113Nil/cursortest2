package androidx.preference;

import V3.b;
import a0.C0144j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.rockchicken.pump.up.road.R;
import i1.AbstractC0456a;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int p2 = b.p(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0456a.f9303c, p2, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (C0144j.f4165b == null) {
                C0144j.f4165b = new C0144j(8, false);
            }
            this.f5120g = C0144j.f4165b;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }
}
