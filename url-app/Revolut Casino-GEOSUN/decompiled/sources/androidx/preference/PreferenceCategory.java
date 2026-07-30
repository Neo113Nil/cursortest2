package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import o.g;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, g.o(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}
