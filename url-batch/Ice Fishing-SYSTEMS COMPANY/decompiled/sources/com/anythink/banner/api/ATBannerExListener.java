package com.anythink.banner.api;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public interface ATBannerExListener extends ATBannerListener {
    void onDeeplinkCallback(boolean z8, ATAdInfo aTAdInfo, boolean z9);

    void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo);
}
