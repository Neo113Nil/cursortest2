package androidx.preference;

import K.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.datastore.preferences.protobuf.k0;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int s2 = k0.s(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f591a, s2, 0);
        if (obtainStyledAttributes.getString(5) == null) {
            obtainStyledAttributes.getString(0);
        }
        if (obtainStyledAttributes.getString(4) == null) {
            obtainStyledAttributes.getString(1);
        }
        obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
