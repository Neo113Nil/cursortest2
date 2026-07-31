package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.Orientation;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ni extends r9 {
    public VideoAdDetails r;

    public ni(Context context, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9) {
        super(context, placement, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
    }

    @Override // com.startapp.sdk.internal.r9
    public final boolean a() {
        return this.r != null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        Context context = this.context;
        return str == null ? new u7(context, this, adPreferences, adEventListener, this.placement, this.adCacheManager, this.videoDownloader, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.webViewCacheLoader) : new t7(context, this, adEventListener, this.webViewFactory, this.networkApiExecutor, this.eventTracer, this.webViewCacheLoader, str, this.httpClient, this.videoDownloader);
    }

    @Override // com.startapp.sdk.internal.x7
    public final void d(String str) {
        super.d(str);
        String a2 = zh.a(str, "@videoJson@", "@videoJson@");
        if (a2 != null) {
            VideoAdDetails videoAdDetails = (VideoAdDetails) JsonParser.fromJson(a2, VideoAdDetails.class);
            this.r = videoAdDetails;
            if (videoAdDetails != null) {
                videoAdDetails.setup();
            }
        }
    }

    public final void a(bi biVar, VideoConfig videoConfig, ki kiVar) {
        this.r = new VideoAdDetails(biVar, videoConfig, kiVar, this.context.getAssets());
        Integer num = biVar.q;
        if (num == null || biVar.r == null) {
            return;
        }
        if (num.intValue() <= biVar.r.intValue()) {
            Orientation orientation = Orientation.PORTRAIT;
            this.e = 1;
        } else if (Orientation.LANDSCAPE == Orientation.PORTRAIT) {
            this.e = 1;
        } else {
            this.e = 2;
        }
    }
}
