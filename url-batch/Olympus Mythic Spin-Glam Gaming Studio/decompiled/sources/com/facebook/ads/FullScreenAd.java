package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.Ad;

/* loaded from: classes4.dex */
public interface FullScreenAd extends Ad {

    @Keep
    public interface ShowAdConfig {
    }

    @Keep
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
