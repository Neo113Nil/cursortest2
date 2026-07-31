package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes3.dex */
public final class M implements J {

    /* renamed from: a, reason: collision with root package name */
    public final J f37934a;

    public M(@NonNull J j4) {
        this.f37934a = j4;
    }

    @Override // io.appmetrica.analytics.impl.J
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context) {
        return a(new K(this, context));
    }

    @Override // io.appmetrica.analytics.impl.J
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context, @NonNull Ti ti) {
        return a(new L(this, context, ti));
    }

    public static AdTrackingInfoResult a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !"00000000-0000-0000-0000-000000000000".equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
