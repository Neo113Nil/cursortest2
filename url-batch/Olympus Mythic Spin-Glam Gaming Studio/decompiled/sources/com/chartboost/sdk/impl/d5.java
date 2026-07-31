package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.k3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class d5 implements k3.a {
    public final i3 a;
    public final gg b;
    public final p7 c;
    public final EndpointRepository d;
    public final zg e;
    public e5 f;

    public d5(i3 networkService, gg requestBodyBuilder, p7 eventTracker, EndpointRepository endpointRepository, zg session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.a = networkService;
        this.b = requestBodyBuilder;
        this.c = eventTracker;
        this.d = endpointRepository;
        this.e = session;
    }

    public final void a(k3 k3Var, c5 c5Var) {
        k3Var.a("location", c5Var.c());
        k3Var.a("reward", Integer.valueOf(c5Var.d()));
        k3Var.a("currency-name", c5Var.e());
        k3Var.a(CreativeInfo.c, c5Var.a());
        k3Var.a("force_close", Boolean.FALSE);
        k3Var.a("cgn", c5Var.b());
        if (c5Var.g() == null || c5Var.f() == null) {
            return;
        }
        float f = 1000;
        k3Var.a("total_time", Float.valueOf(c5Var.f().floatValue() / f));
        k3Var.a("playback_time", Float.valueOf(c5Var.g().floatValue() / f));
        xb.a("TotalDuration: " + c5Var.f() + " PlaybackTime: " + c5Var.g(), (Throwable) null, 2, (Object) null);
    }

    public final void a(e5 e5Var, c5 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f = e5Var;
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.VIDEO_COMPLETE);
        String a = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        k3 k3Var = new k3(a, path, this.b.a(), af.e, this, this.c, this.e);
        a(k3Var, params);
        this.a.a(k3Var);
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, CBError cBError) {
        String str;
        if (cBError == null || (str = cBError.getMessage()) == null) {
            str = "Click failure";
        }
        e5 e5Var = this.f;
        if (e5Var != null) {
            e5Var.a(str);
        }
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, JSONObject jSONObject) {
        JSONObject a = b3.a(jSONObject, "response");
        e5 e5Var = this.f;
        if (e5Var != null) {
            e5Var.a(a);
        }
    }
}
