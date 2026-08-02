package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.video.VideoUtil$VideoEligibility;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestMode;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestType;
import com.startapp.sdk.common.utils.Pair;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h8 extends com.startapp.sdk.adsbase.model.a {

    /* renamed from: V0, reason: collision with root package name */
    public GetAdRequest$VideoRequestType f3928V0;

    /* renamed from: W0, reason: collision with root package name */
    public GetAdRequest$VideoRequestMode f3929W0 = GetAdRequest$VideoRequestMode.INTERSTITIAL;

    @Override // com.startapp.sdk.adsbase.model.a
    public final void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair pair) {
        super.a(context, adPreferences, placement, pair);
        Ad.AdType adType = this.f3378U0;
        if (adType != null) {
            if (adType == Ad.AdType.NON_VIDEO) {
                this.f3928V0 = GetAdRequest$VideoRequestType.DISABLED;
            } else if (adType == Ad.AdType.VIDEO_NO_VAST) {
                this.f3928V0 = GetAdRequest$VideoRequestType.FORCED_NONVAST;
            } else if (adType == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO) {
                this.f3928V0 = GetAdRequest$VideoRequestType.FORCED;
            }
        } else if (ek.a(context) == VideoUtil$VideoEligibility.ELIGIBLE) {
            WeakHashMap weakHashMap = si.f4438a;
            this.f3928V0 = GetAdRequest$VideoRequestType.ENABLED;
        } else {
            this.f3928V0 = GetAdRequest$VideoRequestType.DISABLED;
        }
        Ad.AdType adType2 = this.f3378U0;
        if (adType2 == Ad.AdType.REWARDED_VIDEO) {
            this.f3929W0 = GetAdRequest$VideoRequestMode.REWARDED;
        }
        if (adType2 == Ad.AdType.VIDEO) {
            this.f3929W0 = GetAdRequest$VideoRequestMode.INTERSTITIAL;
        }
    }

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a("video", this.f3928V0, false, true);
        seVar.a("videoMode", this.f3929W0, false, true);
    }
}
