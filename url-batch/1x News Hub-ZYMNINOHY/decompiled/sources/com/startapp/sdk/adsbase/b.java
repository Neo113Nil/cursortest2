package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.ic;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;

/* loaded from: classes.dex */
public final class b implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f3289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f3290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ad f3292d;

    public b(Ad ad, AdPreferences adPreferences, a aVar, String str) {
        this.f3292d = ad;
        this.f3289a = adPreferences;
        this.f3290b = aVar;
        this.f3291c = str;
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        ((y6) ((x6) this.f3292d.eventTracer.a())).c(this, fi.f3822m);
        this.f3292d.loadAds(this.f3289a, this.f3290b, this.f3291c);
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        ((y6) ((x6) this.f3292d.eventTracer.a())).c(this, fi.f3823n);
        this.f3292d.loadAds(this.f3289a, this.f3290b, this.f3291c);
    }
}
