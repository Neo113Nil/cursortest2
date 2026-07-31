package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import java.util.HashSet;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class m7 extends com.startapp.sdk.adsbase.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(Context context, vc vcVar, AdEventListener adEventListener, pa paVar, pa paVar2, String str) {
        super(vcVar, paVar, context, adEventListener, str);
        context.getClass();
        paVar.getClass();
        paVar2.getClass();
        str.getClass();
    }

    @Override // com.startapp.sdk.adsbase.d
    public final Object a(String str) {
        str.getClass();
        try {
            Object fromJson = JsonParser.fromJson(str, GetAdResponse.class);
            GetAdResponse getAdResponse = (GetAdResponse) fromJson;
            ka kaVar = (ka) this.f140a;
            kaVar.setAdInfoOverride(getAdResponse.c());
            kaVar.a(q0.a(this.c, getAdResponse.d(), 0, new HashSet(), true));
            return (GetAdResponse) fromJson;
        } catch (Throwable unused) {
            return null;
        }
    }
}
