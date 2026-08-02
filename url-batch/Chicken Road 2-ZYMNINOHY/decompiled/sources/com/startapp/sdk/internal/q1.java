package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class q1 extends m8 {

    /* renamed from: r, reason: collision with root package name */
    public int f7470r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7471s;

    /* renamed from: t, reason: collision with root package name */
    public int f7472t;

    public q1(Context context, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, int i4) {
        super(context, AdPreferences.Placement.INAPP_BANNER, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
        this.f7470r = i4;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        if (str != null) {
            return new w7(this.context, this, adEventListener, this.networkApiExecutor, this.eventTracer, this.webViewCacheLoader, str);
        }
        Context context = this.context;
        ib ibVar = this.httpClient;
        ib ibVar2 = this.networkApiExecutor;
        ib ibVar3 = this.eventTracer;
        ib ibVar4 = this.motionProcessor;
        ib ibVar5 = this.webViewCacheLoader;
        int i4 = this.f7470r;
        this.f7470r = i4 + 1;
        return new x7(context, this, adPreferences, adEventListener, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, i4);
    }
}
