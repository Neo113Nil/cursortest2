package com.mopub.mobileads;

import android.content.Context;
import com.facebook.ads.BidderTokenProvider;
import com.mopub.common.MoPubAdvancedBidder;

/* loaded from: classes2.dex */
public class FacebookAdvancedBidder implements MoPubAdvancedBidder {
    @Override // com.mopub.common.MoPubAdvancedBidder
    public String getCreativeNetworkName() {
        return "facebook";
    }

    @Override // com.mopub.common.MoPubAdvancedBidder
    public String getToken(Context context) {
        return BidderTokenProvider.getBidderToken(context);
    }
}
