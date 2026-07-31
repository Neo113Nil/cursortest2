package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class fa implements ea {
    public final d0 a;
    public final c0 b;
    public final d5 c;
    public final r0 d;

    public fa(d0 adUnit, c0 adType, d5 completeRequest, r0 adUnitRendererImpressionCallback) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(completeRequest, "completeRequest");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        this.a = adUnit;
        this.b = adType;
        this.c = completeRequest;
        this.d = adUnitRendererImpressionCallback;
    }

    public static final class a implements e5 {
        @Override // com.chartboost.sdk.impl.e5
        public void a(String str) {
            xb.b("onCompleteRequestFailure " + str, (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.e5
        public void a(JSONObject jSONObject) {
            xb.b("onCompleteRequestSuccess " + jSONObject, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ea
    public void a() {
        c0 c0Var = this.b;
        if (c0Var == c0.b.g) {
            xb.b("didCompleteInterstitial delegate used to be sent here", (Throwable) null, 2, (Object) null);
        } else if (c0Var == c0.c.g) {
            this.d.a(this.a.m(), this.a.v());
        }
    }

    @Override // com.chartboost.sdk.impl.ea
    public void a(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.c.a(new a(), new c5(location, this.a.a(), this.a.g(), this.a.v(), this.a.w(), f, f2));
    }
}
