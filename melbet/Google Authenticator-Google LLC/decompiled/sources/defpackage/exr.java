package defpackage;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exr extends et {
    private static final ez f = new exq();
    public final LicenseMenuActivity e;

    public exr(LicenseMenuActivity licenseMenuActivity) {
        super(f);
        this.e = licenseMenuActivity;
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.libraries_social_licenses_license, viewGroup, false);
        TypedValue typedValue = new TypedValue();
        if (viewGroup.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true)) {
            inflate.setBackgroundResource(typedValue.resourceId);
        }
        return new gfx(inflate, (byte[]) null);
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void k(lp lpVar, int i) {
        gfx gfxVar = (gfx) lpVar;
        exn exnVar = (exn) this.a.e.get(i);
        ((TextView) gfxVar.t).setText(exnVar.a);
        gfxVar.a.setOnClickListener(new drl(this, exnVar, 9));
    }
}
