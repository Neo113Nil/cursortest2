package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.mh;
import com.startapp.sdk.internal.qb;
import com.startapp.sdk.internal.w6;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b implements qb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f131a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Ad d;

    public b(Ad ad, AdPreferences adPreferences, a aVar, String str) {
        this.d = ad;
        this.f131a = adPreferences;
        this.b = aVar;
        this.c = str;
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        ((w6) this.d.eventTracer.a()).c(this, mh.m);
        this.d.loadAds(this.f131a, this.b, this.c);
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a() {
        ((w6) this.d.eventTracer.a()).c(this, mh.n);
        this.d.loadAds(this.f131a, this.b, this.c);
    }
}
