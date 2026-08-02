package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* loaded from: classes.dex */
public final class fj implements ck {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ck f3833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CachedVideoAd f3834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj f3836d;

    public fj(hj hjVar, ck ckVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f3836d = hjVar;
        this.f3833a = ckVar;
        this.f3834b = cachedVideoAd;
        this.f3835c = context;
    }

    @Override // com.startapp.sdk.internal.ck, com.startapp.sdk.internal.me
    public final void a(String str) {
        ck ckVar = this.f3833a;
        if (ckVar != null) {
            ckVar.a(str);
        }
        if (str != null) {
            this.f3834b.a(System.currentTimeMillis());
            this.f3834b.a(str);
            hj hjVar = this.f3836d;
            Context context = this.f3835c;
            CachedVideoAd cachedVideoAd = this.f3834b;
            hjVar.f3940a.remove(cachedVideoAd);
            hjVar.a(AdsCommonMetaData.k().F().c() - 1);
            hjVar.f3940a.add(cachedVideoAd);
            e7.a(context, hjVar.f3940a);
        }
    }
}
