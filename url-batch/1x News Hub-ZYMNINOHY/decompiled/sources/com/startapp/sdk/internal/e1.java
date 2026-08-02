package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class e1 extends com.startapp.sdk.adsbase.model.a {

    /* renamed from: V0, reason: collision with root package name */
    public boolean f3714V0;

    /* renamed from: W0, reason: collision with root package name */
    public int f3715W0;

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a("fixedSize", Boolean.valueOf(this.f3714V0), false, true);
        seVar.a("bnrt", Integer.valueOf(this.f3715W0), false, true);
    }

    @Override // com.startapp.sdk.adsbase.model.a
    public final void g(Context context) {
        pg pgVar = (pg) com.startapp.sdk.components.a.a(context).f3472l.a();
        AdPreferences.Placement placement = this.f3379n0;
        this.z0 = placement == null ? null : (String) pgVar.f4323a.get(new og(placement, this.f3715W0));
    }
}
