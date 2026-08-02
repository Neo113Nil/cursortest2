package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* loaded from: classes.dex */
public final class tg implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4487a;

    public tg(Context context) {
        this.f4487a = context;
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        MetaData.E().a(this);
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        if (z) {
            com.startapp.sdk.adsbase.g.f3331d = null;
            com.startapp.sdk.adsbase.g.f3332e = null;
            com.startapp.sdk.adsbase.g.f(this.f4487a);
        }
        MetaData.E().a(this);
    }
}
