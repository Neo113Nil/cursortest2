package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.k3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class n4 implements k3.a {
    public final i3 a;
    public final gg b;
    public final p7 c;
    public final EndpointRepository d;
    public final zg e;
    public o4 f;

    public n4(i3 networkService, gg requestBodyBuilder, p7 eventTracker, EndpointRepository endpointRepository, zg session) {
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

    public final void a(k3 k3Var, l4 l4Var) {
        k3Var.a(CreativeInfo.c, l4Var.a());
        k3Var.a("to", l4Var.g());
        k3Var.a("cgn", l4Var.b());
        k3Var.a("creative", l4Var.c());
        k3Var.a("location", l4Var.e());
        if (l4Var.d() == qa.f) {
            k3Var.a("creative", "");
        } else if (l4Var.i() != null && l4Var.h() != null) {
            float f = 1000;
            k3Var.a("total_time", Float.valueOf(l4Var.h().floatValue() / f));
            k3Var.a("playback_time", Float.valueOf(l4Var.i().floatValue() / f));
            xb.a("TotalDuration: " + l4Var.h() + " PlaybackTime: " + l4Var.i(), (Throwable) null, 2, (Object) null);
        }
        Boolean f2 = l4Var.f();
        if (f2 != null) {
            k3Var.a("retarget_reinstall", f2);
        }
    }

    public final void a(o4 o4Var, l4 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f = o4Var;
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.CLICK);
        String a = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        k3 k3Var = new k3(a, path, this.b.a(), af.e, this, this.c, this.e);
        k3Var.s = true;
        a(k3Var, params);
        this.a.a(k3Var);
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, CBError cBError) {
        String str;
        if (cBError == null || (str = cBError.getMessage()) == null) {
            str = "Click failure";
        }
        o4 o4Var = this.f;
        if (o4Var != null) {
            o4Var.a(str);
        }
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public void a(k3 k3Var, JSONObject jSONObject) {
        JSONObject a = b3.a(jSONObject, "response");
        o4 o4Var = this.f;
        if (o4Var != null) {
            o4Var.a(a);
        }
    }
}
