package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gw<S> extends wz {
    public int Z;
    public p9 a0;

    @Override // defpackage.pm
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.a0 = (p9) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        } else {
            g9.b();
        }
    }

    @Override // defpackage.pm
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.Z));
        throw null;
    }

    @Override // defpackage.pm
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
    }
}
