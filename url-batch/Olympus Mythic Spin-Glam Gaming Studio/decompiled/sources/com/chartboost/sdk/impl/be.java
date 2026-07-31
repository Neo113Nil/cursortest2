package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class be implements bi {
    public final AtomicReference a;
    public final he b;

    public be(AtomicReference sdkConfigRef, he openMeasurementManager) {
        Intrinsics.checkNotNullParameter(sdkConfigRef, "sdkConfigRef");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        this.a = sdkConfigRef;
        this.b = openMeasurementManager;
    }

    @Override // com.chartboost.sdk.impl.bi
    public JSONObject a() {
        sg sgVar = (sg) this.a.get();
        if (sgVar == null) {
            return new JSONObject();
        }
        ce d = sgVar.d();
        if (d != null && d.g()) {
            Partner c = this.b.c();
            JSONObject jSONObject = new JSONObject();
            if (c != null) {
                jSONObject.put("omidpn", c.getName());
                jSONObject.put("omidpv", c.getVersion());
            }
            jSONObject.put("omidv", Omid.getVersion());
            return jSONObject;
        }
        return new JSONObject();
    }
}
