package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class d3 extends q3 {
    public final String O;
    public final oa P;
    public final pd Q;
    public final q7 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(Context context, String location, jc mtype, String adUnitParameters, u8 fileCache, i3 i3Var, yi uiPoster, n3 n3Var, Mediation mediation, String str, ge openMeasurementImpressionCallback, r0 adUnitRendererCallback, oa impressionInterface, xl webViewTimeoutInterface, pd nativeBridgeCommand, q7 eventTracker) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, i3Var, n3Var, mediation, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.O = str;
        this.P = impressionInterface;
        this.Q = nativeBridgeCommand;
        this.R = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.q3
    public cl b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.Q.a(this.P);
        String str = this.O;
        if (str == null || StringsKt.isBlank(str)) {
            xb.b("templateHtml must not be null or blank", (Throwable) null, 2, (Object) null);
            return null;
        }
        try {
            return new ld(context, this.O, j(), this.P, h(), this.Q, this.R, null, 128, null);
        } catch (Exception e) {
            c("Can't instantiate MraidWebViewBase: " + e);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.q3, com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo3222track(event);
    }

    @Override // com.chartboost.sdk.impl.q3
    public void w() {
    }
}
