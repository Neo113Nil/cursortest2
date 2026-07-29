package com.mopub.mobileads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.Preconditions;
import com.mopub.common.UrlAction;
import com.mopub.common.UrlHandler;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.network.TrackingRequest;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
class VastIconConfig implements Serializable {
    private static final long serialVersionUID = 0;
    private final String mClickThroughUri;
    private final List<VastTracker> mClickTrackingUris;
    private final Integer mDurationMS;
    private final int mHeight;
    private final int mOffsetMS;
    private final VastResource mVastResource;
    private final List<VastTracker> mViewTrackingUris;
    private final int mWidth;

    VastIconConfig(int i, int i2, Integer num, Integer num2, VastResource vastResource, List<VastTracker> list, String str, List<VastTracker> list2) {
        Preconditions.checkNotNull(vastResource);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.mWidth = i;
        this.mHeight = i2;
        this.mOffsetMS = num == null ? 0 : num.intValue();
        this.mDurationMS = num2;
        this.mVastResource = vastResource;
        this.mClickTrackingUris = list;
        this.mClickThroughUri = str;
        this.mViewTrackingUris = list2;
    }

    int getWidth() {
        return this.mWidth;
    }

    int getHeight() {
        return this.mHeight;
    }

    int getOffsetMS() {
        return this.mOffsetMS;
    }

    Integer getDurationMS() {
        return this.mDurationMS;
    }

    VastResource getVastResource() {
        return this.mVastResource;
    }

    List<VastTracker> getClickTrackingUris() {
        return this.mClickTrackingUris;
    }

    String getClickThroughUri() {
        return this.mClickThroughUri;
    }

    List<VastTracker> getViewTrackingUris() {
        return this.mViewTrackingUris;
    }

    void handleImpression(Context context, int i, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        TrackingRequest.makeVastTrackingHttpRequest(this.mViewTrackingUris, null, Integer.valueOf(i), str, context);
    }

    void handleClick(final Context context, String str, final String str2) {
        Preconditions.checkNotNull(context);
        String correctClickThroughUrl = this.mVastResource.getCorrectClickThroughUrl(this.mClickThroughUri, str);
        if (TextUtils.isEmpty(correctClickThroughUrl)) {
            return;
        }
        new UrlHandler.Builder().withSupportedUrlActions(UrlAction.IGNORE_ABOUT_SCHEME, UrlAction.OPEN_NATIVE_BROWSER, UrlAction.OPEN_IN_APP_BROWSER).withResultActions(new UrlHandler.ResultActions() { // from class: com.mopub.mobileads.VastIconConfig.1
            @Override // com.mopub.common.UrlHandler.ResultActions
            public void urlHandlingFailed(String str3, UrlAction urlAction) {
            }

            @Override // com.mopub.common.UrlHandler.ResultActions
            public void urlHandlingSucceeded(String str3, UrlAction urlAction) {
                if (urlAction == UrlAction.OPEN_IN_APP_BROWSER) {
                    Bundle bundle = new Bundle();
                    bundle.putString(MoPubBrowser.DESTINATION_URL_KEY, str3);
                    if (!TextUtils.isEmpty(str2)) {
                        bundle.putString(MoPubBrowser.DSP_CREATIVE_ID, str2);
                    }
                    try {
                        Intents.startActivity(context, Intents.getStartActivityIntent(context, MoPubBrowser.class, bundle));
                    } catch (IntentNotResolvableException e) {
                        MoPubLog.d(e.getMessage());
                    }
                }
            }
        }).withoutMoPubBrowser().build().handleUrl(context, correctClickThroughUrl);
    }
}
