package androidx.preference;

import M.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.neptunesoft.languesbacdz.R;
import s.AbstractC0291b;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f770b, i2, 0);
        AbstractC0291b.d(obtainStyledAttributes, 9, 0);
        AbstractC0291b.d(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        AbstractC0291b.d(obtainStyledAttributes, 11, 3);
        AbstractC0291b.d(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0291b.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
