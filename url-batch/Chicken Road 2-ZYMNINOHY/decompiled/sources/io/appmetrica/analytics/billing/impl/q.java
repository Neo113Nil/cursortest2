package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final g f9471a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9472b;

    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig parse(JSONObject jSONObject) {
        s sVar;
        g gVar = this.f9471a;
        this.f9472b.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (optJSONObject == null) {
            sVar = new s();
        } else {
            s sVar2 = new s();
            Integer optIntOrNull = JsonUtils.optIntOrNull(optJSONObject, "send_frequency_seconds");
            if (optIntOrNull != null) {
                sVar2.f9475a = optIntOrNull.intValue();
            }
            Integer optIntOrNull2 = JsonUtils.optIntOrNull(optJSONObject, "first_collecting_inapp_max_age_seconds");
            if (optIntOrNull2 != null) {
                sVar2.f9476b = optIntOrNull2.intValue();
            }
            sVar = sVar2;
        }
        gVar.getClass();
        return new RemoteBillingConfig(true, new BillingConfig(sVar.f9475a, sVar.f9476b));
    }

    public final RemoteBillingConfig b(JSONObject jSONObject) {
        return (RemoteBillingConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (RemoteBillingConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public q(g gVar, f fVar) {
        this.f9471a = gVar;
        this.f9472b = fVar;
    }

    public /* synthetic */ q(g gVar, f fVar, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new g() : gVar, (i4 & 2) != 0 ? new f() : fVar);
    }
}
