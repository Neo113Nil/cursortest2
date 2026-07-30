package androidx.preference;

import A.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.icefishing.icefish.ice.fishing.s294s.R;
import d0.AbstractC0353b;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a7 = b.a(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0353b.f4616a, a7, 0);
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
