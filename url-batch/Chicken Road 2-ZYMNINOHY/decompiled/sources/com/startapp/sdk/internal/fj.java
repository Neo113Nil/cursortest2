package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* loaded from: classes.dex */
public final class fj implements ck {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ck f6951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CachedVideoAd f6952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f6953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj f6954d;

    public fj(hj hjVar, ck ckVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f6954d = hjVar;
        this.f6951a = ckVar;
        this.f6952b = cachedVideoAd;
        this.f6953c = context;
    }

    @Override // com.startapp.sdk.internal.ck, com.startapp.sdk.internal.me
    public final void a(String str) {
        ck ckVar = this.f6951a;
        if (ckVar != null) {
            ckVar.a(str);
        }
        if (str != null) {
            this.f6952b.a(System.currentTimeMillis());
            this.f6952b.a(str);
            hj hjVar = this.f6954d;
            Context context = this.f6953c;
            CachedVideoAd cachedVideoAd = this.f6952b;
            hjVar.f7065a.remove(cachedVideoAd);
            hjVar.a(AdsCommonMetaData.k().F().c() - 1);
            hjVar.f7065a.add(cachedVideoAd);
            e7.a(context, hjVar.f7065a);
        }
    }
}
