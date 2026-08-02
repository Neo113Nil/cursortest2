package defpackage;

import android.content.Context;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class een extends eel {
    @Override // defpackage.edd
    protected final int b() {
        return R.style.OneGoogle_ExpressSignIn_GoogleMaterial3_DayNight;
    }

    @Override // defpackage.edd
    public final int c() {
        return R.style.OneGoogle_ExpressSignIn_Attrs_GoogleMaterial3WithBox;
    }

    @Override // defpackage.edd
    public final boolean d() {
        return true;
    }

    @Override // defpackage.eel
    public final gzp f(Context context) {
        return gzp.h(Integer.valueOf(new fhs(context).a(fhq.d(context, R.attr.colorSurface, 0), context.getResources().getDimension(R.dimen.m3_sys_elevation_level2))));
    }

    @Override // defpackage.eel
    public final boolean g() {
        return true;
    }
}
