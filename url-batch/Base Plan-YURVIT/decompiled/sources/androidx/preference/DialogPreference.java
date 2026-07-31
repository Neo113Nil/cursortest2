package androidx.preference;

import K.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.datastore.preferences.protobuf.k0;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f592b, i2, 0);
        if (obtainStyledAttributes.getString(9) == null) {
            obtainStyledAttributes.getString(0);
        }
        if (obtainStyledAttributes.getString(8) == null) {
            obtainStyledAttributes.getString(1);
        }
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        if (obtainStyledAttributes.getString(11) == null) {
            obtainStyledAttributes.getString(3);
        }
        if (obtainStyledAttributes.getString(10) == null) {
            obtainStyledAttributes.getString(4);
        }
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k0.s(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
