package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b8 extends com.startapp.sdk.adsbase.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(Context context, nd ndVar, AdEventListener adEventListener, ib networkApiExecutor, ib eventTracer, String adm) {
        super(ndVar, networkApiExecutor, context, adEventListener, adm);
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.j.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.j.e(adm, "adm");
    }

    @Override // com.startapp.sdk.adsbase.d
    public final Object a(String adm) {
        kotlin.jvm.internal.j.e(adm, "adm");
        try {
            Object fromJson = JsonParser.fromJson(adm, GetAdResponse.class);
            GetAdResponse getAdResponse = (GetAdResponse) fromJson;
            Ad ad = this.f3318a;
            kotlin.jvm.internal.j.b(ad);
            db dbVar = (db) ad;
            dbVar.setAdInfoOverride(getAdResponse.c());
            dbVar.a(t0.a(this.f3320c, getAdResponse.d(), 0, new HashSet(), true));
            return (GetAdResponse) fromJson;
        } catch (Throwable unused) {
            return null;
        }
    }
}
