package androidx.preference;

import V3.b;
import android.content.Context;
import android.util.AttributeSet;
import com.rockchicken.pump.up.road.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.p(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }
}
