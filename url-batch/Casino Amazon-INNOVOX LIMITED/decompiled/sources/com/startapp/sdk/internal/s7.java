package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestMode;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestType;
import com.startapp.sdk.common.utils.Pair;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class s7 extends com.startapp.sdk.adsbase.model.a {
    public GetAdRequest$VideoRequestType V0;
    public GetAdRequest$VideoRequestMode W0 = GetAdRequest$VideoRequestMode.INTERSTITIAL;

    @Override // com.startapp.sdk.adsbase.model.a
    public final void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair pair) {
        super.a(context, adPreferences, placement, pair);
        Ad.AdType adType = this.U0;
        if (adType != null) {
            if (adType == Ad.AdType.NON_VIDEO) {
                this.V0 = GetAdRequest$VideoRequestType.DISABLED;
            } else if (adType == Ad.AdType.VIDEO_NO_VAST) {
                this.V0 = GetAdRequest$VideoRequestType.FORCED_NONVAST;
            } else if (adType == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO) {
                this.V0 = GetAdRequest$VideoRequestType.FORCED;
            }
        } else if (com.startapp.sdk.ads.video.a.a(context)) {
            this.V0 = GetAdRequest$VideoRequestType.DISABLED;
        } else {
            this.V0 = GetAdRequest$VideoRequestType.ENABLED;
        }
        Ad.AdType adType2 = this.U0;
        if (adType2 == Ad.AdType.REWARDED_VIDEO) {
            this.W0 = GetAdRequest$VideoRequestMode.REWARDED;
        }
        if (adType2 == Ad.AdType.VIDEO) {
            this.W0 = GetAdRequest$VideoRequestMode.INTERSTITIAL;
        }
    }

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.u1
    public final void a(be beVar) {
        super.a(beVar);
        beVar.a("video", this.V0, false, true);
        beVar.a("videoMode", this.W0, false, true);
    }
}
