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
    public final /* synthetic */ AdPreferences f6378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f6379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6380c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ad f6381d;

    public b(Ad ad, AdPreferences adPreferences, a aVar, String str) {
        this.f6381d = ad;
        this.f6378a = adPreferences;
        this.f6379b = aVar;
        this.f6380c = str;
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        ((y6) ((x6) this.f6381d.eventTracer.a())).c(this, fi.f6941m);
        this.f6381d.loadAds(this.f6378a, this.f6379b, this.f6380c);
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        ((y6) ((x6) this.f6381d.eventTracer.a())).c(this, fi.n);
        this.f6381d.loadAds(this.f6378a, this.f6379b, this.f6380c);
    }
}
