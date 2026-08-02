package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.neptunesoft.languesbacdz.R;
import s.AbstractC0291b;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0291b.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}
