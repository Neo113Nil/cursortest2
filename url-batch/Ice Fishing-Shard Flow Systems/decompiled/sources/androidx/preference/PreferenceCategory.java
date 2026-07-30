package androidx.preference;

import A.b;
import android.content.Context;
import android.util.AttributeSet;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }
}
