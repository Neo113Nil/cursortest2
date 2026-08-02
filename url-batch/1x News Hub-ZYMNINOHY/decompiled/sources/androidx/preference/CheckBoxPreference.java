package androidx.preference;

import R.a;
import a.AbstractC0129a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.fc.barca.football.R;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int n3 = AbstractC0129a.n(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1283a, n3, 0);
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
