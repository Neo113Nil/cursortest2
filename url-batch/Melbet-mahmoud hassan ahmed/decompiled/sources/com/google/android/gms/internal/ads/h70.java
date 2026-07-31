package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class h70 implements t70<eu0> {
    h70() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        JSONObject zza;
        eu0 eu0Var2 = eu0Var;
        a40 f02 = eu0Var2.f0();
        if (f02 == null || (zza = f02.zza()) == null) {
            eu0Var2.s("nativeAdViewSignalsReady", new JSONObject());
        } else {
            eu0Var2.s("nativeAdViewSignalsReady", zza);
        }
    }
}
