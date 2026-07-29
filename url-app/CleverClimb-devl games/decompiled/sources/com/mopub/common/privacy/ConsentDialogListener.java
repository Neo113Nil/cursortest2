package com.mopub.common.privacy;

import com.mopub.mobileads.MoPubErrorCode;

/* loaded from: classes2.dex */
public interface ConsentDialogListener {
    void onConsentDialogLoadFailed(MoPubErrorCode moPubErrorCode);

    void onConsentDialogLoaded();
}
