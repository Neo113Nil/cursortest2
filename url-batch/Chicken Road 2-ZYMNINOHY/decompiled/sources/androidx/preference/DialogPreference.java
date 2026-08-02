package androidx.preference;

import V3.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.rockchicken.pump.up.road.R;
import i1.AbstractC0456a;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0456a.f9302b, i4, 0);
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
        this(context, attributeSet, b.p(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
