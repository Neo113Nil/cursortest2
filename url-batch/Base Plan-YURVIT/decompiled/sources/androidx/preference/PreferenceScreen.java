package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.datastore.preferences.protobuf.k0;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k0.s(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
    }
}
