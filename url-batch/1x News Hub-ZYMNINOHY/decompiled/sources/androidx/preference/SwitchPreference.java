package androidx.preference;

import R.a;
import a.AbstractC0129a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.fc.barca.football.R;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int n3 = AbstractC0129a.n(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1291j, n3, 0);
        if (obtainStyledAttributes.getString(7) == null) {
            obtainStyledAttributes.getString(0);
        }
        if (obtainStyledAttributes.getString(6) == null) {
            obtainStyledAttributes.getString(1);
        }
        if (obtainStyledAttributes.getString(9) == null) {
            obtainStyledAttributes.getString(3);
        }
        if (obtainStyledAttributes.getString(8) == null) {
            obtainStyledAttributes.getString(4);
        }
        obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
