package androidx.preference;

import V3.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.rockchicken.pump.up.road.R;
import i1.AbstractC0456a;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int p2 = b.p(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0456a.f9301a, p2, 0);
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
