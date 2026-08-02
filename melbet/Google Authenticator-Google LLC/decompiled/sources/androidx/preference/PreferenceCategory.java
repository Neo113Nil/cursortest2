package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.aiu;
import defpackage.pi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, pi.x(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean O() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(aiu aiuVar) {
        super.a(aiuVar);
        aiuVar.a.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.O();
    }
}
