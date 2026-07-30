package com.anythink.network.facebook;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeBannerAd;

/* loaded from: classes.dex */
public class FacebookATNativeBannerAd extends FacebookATBaseNativeAd<NativeBannerAd> {
    private final String i;

    public FacebookATNativeBannerAd(Context context, NativeBannerAd nativeBannerAd) {
        super(context, nativeBannerAd, false);
        this.i = "FacebookATNativeBannerAd";
    }

    @Override // com.anythink.network.facebook.FacebookATBaseNativeAd, com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        return null;
    }
}
