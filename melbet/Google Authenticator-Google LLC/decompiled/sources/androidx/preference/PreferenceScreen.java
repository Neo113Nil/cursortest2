package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.aip;
import defpackage.pi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean d;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, pi.x(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceGroup
    public final boolean W() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        aip aipVar;
        if (this.t != null || this.u != null || k() == 0 || (aipVar = this.k.f) == null) {
            return;
        }
        aipVar.aF();
    }
}
