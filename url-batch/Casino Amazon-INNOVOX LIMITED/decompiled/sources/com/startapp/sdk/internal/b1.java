package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b1 extends com.startapp.sdk.adsbase.model.a {
    public boolean V0;
    public int W0;

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.u1
    public final void a(be beVar) {
        super.a(beVar);
        beVar.a("fixedSize", Boolean.valueOf(this.V0), false, true);
        beVar.a("bnrt", Integer.valueOf(this.W0), false, true);
    }

    @Override // com.startapp.sdk.adsbase.model.a
    public final void g(Context context) {
        yf yfVar = (yf) com.startapp.sdk.components.a.a(context).k.a();
        AdPreferences.Placement placement = this.n0;
        this.z0 = placement == null ? null : (String) yfVar.f511a.get(new xf(placement, this.W0));
    }
}
