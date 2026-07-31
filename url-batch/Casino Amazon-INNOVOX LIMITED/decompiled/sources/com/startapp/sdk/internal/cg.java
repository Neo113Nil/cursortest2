package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class cg implements qb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f203a;

    public cg(Context context) {
        this.f203a = context;
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a() {
        MetaData.A().a(this);
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        if (z) {
            com.startapp.sdk.adsbase.g.d = null;
            com.startapp.sdk.adsbase.g.e = null;
            com.startapp.sdk.adsbase.g.f(this.f203a);
        }
        MetaData.A().a(this);
    }
}
