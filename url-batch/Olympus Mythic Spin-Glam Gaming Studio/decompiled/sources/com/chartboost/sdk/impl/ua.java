package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ua {
    public final Context a;
    public final yi b;
    public final u8 c;
    public final n3 d;
    public final xk e;
    public final Mediation f;
    public final i3 g;
    public final ge h;
    public final q7 i;

    public ua(Context context, yi uiPoster, u8 fileCache, n3 templateProxy, xk videoRepository, Mediation mediation, i3 networkService, ge openMeasurementImpressionCallback, q7 eventTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(templateProxy, "templateProxy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = context;
        this.b = uiPoster;
        this.c = fileCache;
        this.d = templateProxy;
        this.e = videoRepository;
        this.f = mediation;
        this.g = networkService;
        this.h = openMeasurementImpressionCallback;
        this.i = eventTracker;
    }

    public final q3 a(String location, d0 adUnit, String adTypeTraitsName, String html, r0 adUnitRendererImpressionCallback, oa impressionInterface, xl webViewTimeoutInterface, pd nativeBridgeCommand) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        return adUnit.C().length() > 0 ? new vk(this.a, location, adUnit.q(), adTypeTraitsName, this.b, this.c, this.d, this.e, adUnit.B(), this.f, f4.b.a().l(), this.g, html, this.h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.i, null, 524288, null) : adUnit.u() == eg.e ? new x2(this.a, location, adUnit.q(), adTypeTraitsName, this.c, this.g, this.b, this.d, this.f, adUnit.e(), adUnit.j(), adUnit.n(), this.h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, adUnit.x(), this.i, null, null, 786432, null) : new d3(this.a, location, adUnit.q(), adTypeTraitsName, this.c, this.g, this.b, this.d, this.f, html, this.h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.i);
    }
}
