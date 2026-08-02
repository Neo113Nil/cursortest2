package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class e1 extends com.startapp.sdk.adsbase.model.a {

    /* renamed from: V0, reason: collision with root package name */
    public boolean f6828V0;

    /* renamed from: W0, reason: collision with root package name */
    public int f6829W0;

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a("fixedSize", Boolean.valueOf(this.f6828V0), false, true);
        seVar.a("bnrt", Integer.valueOf(this.f6829W0), false, true);
    }

    @Override // com.startapp.sdk.adsbase.model.a
    public final void g(Context context) {
        pg pgVar = (pg) com.startapp.sdk.components.a.a(context).f6571l.a();
        AdPreferences.Placement placement = this.f6473n0;
        this.f6485z0 = placement == null ? null : (String) pgVar.f7459a.get(new og(placement, this.f6829W0));
    }
}
