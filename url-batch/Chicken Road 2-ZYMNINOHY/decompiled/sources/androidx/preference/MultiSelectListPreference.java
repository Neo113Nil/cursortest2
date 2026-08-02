package androidx.preference;

import V3.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.rockchicken.pump.up.road.R;
import i1.AbstractC0456a;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int p2 = b.p(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0456a.f9305e, p2, 0);
        if (obtainStyledAttributes.getTextArray(2) == null) {
            obtainStyledAttributes.getTextArray(0);
        }
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i4) {
        CharSequence[] textArray = typedArray.getTextArray(i4);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
