package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.datastore.preferences.protobuf.k0;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k0.s(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }
}
