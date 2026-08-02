package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* loaded from: assets/audience_network.dex */
public final class RM implements NativeAdViewApi {
    public static View A00(C1153dL c1153dL, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C0813Ur c0813Ur = (C0813Ur) nativeAdViewAttributes.getInternalAttributes();
        C0696Qc internalNativeAd = C0696Qc.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1a(EnumC0814Us.A00(type.getEnumCode()));
        internalNativeAd.A1Z(c0813Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c1153dL, c6q);
        c6q.A06(mediumRectTemplateLayout, c1153dL, nativeAd, c0813Ur);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (AbstractC0856Wl.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C1153dL c1153dL, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C0696Qc A0L = C0696Qc.A0L(nativeAd.getInternalNativeAd());
        C0813Ur c0813Ur = (C0813Ur) nativeAdViewAttributes.getInternalAttributes();
        A0L.A1a(EnumC0814Us.A0B);
        A0L.A1Z(c0813Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c1153dL, c6q);
        c6q.A06(nativeAdLayout, c1153dL, nativeAd, c0813Ur);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(RB.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th) {
            return YB.A00(RB.A03(context), th);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C1153dL contextWrapper;
        try {
            if (context instanceof C1153dL) {
                contextWrapper = (C1153dL) context;
            } else {
                contextWrapper = RB.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th) {
            return YB.A00(RB.A03(context), th);
        }
    }
}
